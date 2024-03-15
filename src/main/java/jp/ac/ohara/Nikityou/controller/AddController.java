package jp.ac.ohara.Nikityou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.ac.ohara.Nikityou.model.NikkiModel;
import jp.ac.ohara.Nikityou.service.NikkiService;

@Controller
public class AddController {

    @Autowired
    private NikkiService nikkiService;

    @GetMapping("/add")
    public ModelAndView addNikki(NikkiModel nikki, ModelAndView model) {
        model.addObject("nikki", nikki);
        model.setViewName("add");
        return model;
    }

    @PostMapping("/add")
    public String addNikki(@Validated @ModelAttribute NikkiModel nikki, BindingResult result,
                           RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            // バリデーションエラーがある場合の処理
            return "add"; // エラーがある場合は元のフォームに戻る
        }

        try {
            this.nikkiService.save(nikki);
            redirectAttributes.addFlashAttribute("exception", "");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("exception", e.getMessage());
        }
        return "redirect:/add";
    }

    @PostMapping("/add/delete/{nikkiid}")
    public String deleteNikki(@PathVariable Long nikkiid) {
        nikkiService.delete(nikkiid);
        return "redirect:/view";
    }
}

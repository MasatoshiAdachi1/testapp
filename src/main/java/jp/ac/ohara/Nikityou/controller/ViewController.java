package jp.ac.ohara.Nikityou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.ac.ohara.Nikityou.service.NikkiService;

@Controller
public class ViewController {
	@Autowired
	private NikkiService NikkiService;
//  @GetMapping("/view")
//  public String index(Model model) {
//    model.addAttribute("message", "こんにちは");
//    return "view";
//  }
//  

  @GetMapping("/view")
	public String vieww(Model model) {
		model.addAttribute("list",this.NikkiService.getNikkiList());
		// TODO: model.addAttributeに一覧取得結果を追加
		return "view";
	}
}

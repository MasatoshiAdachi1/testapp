package jp.ac.ohara.Nikityou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.ac.ohara.Nikityou.model.UserModel;
import jp.ac.ohara.Nikityou.service.UserService;


@Controller
public class SignupController {
	@Autowired
    private UserService UserService;
	

  @GetMapping("/signup")
  public ModelAndView signup(UserModel User,ModelAndView model) {
    model.addObject("User",User);
    model.setViewName("signup");
    return model;
  }
  
  @PostMapping("/signup")
  public String comp(@Validated @ModelAttribute @NonNull UserModel User, BindingResult result,
          RedirectAttributes redirectAttributes) {
      try {
          this.UserService.save(User);
          redirectAttributes.addFlashAttribute("exception", "");

      } catch (Exception e) {
          redirectAttributes.addFlashAttribute("exception", e.getMessage());
      }
      return "redirect:/add";
}
  
//  @GetMapping("/user")
//	public String userList(Model model) {
//		model.addAttribute("userList", UserService.getUserList());
//		return "add";
//	}
  
}
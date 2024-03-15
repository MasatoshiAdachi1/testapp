package jp.ac.ohara.Nikityou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
//
@Controller
public class LoginController {
//	private UserService UserService;
  @GetMapping("/login")
  public String index(Model model) {
    model.addAttribute("message", "こんにちは");
    return "login";
  }

  
}

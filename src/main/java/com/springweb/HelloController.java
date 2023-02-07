package com.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HelloController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @PostMapping("/hello")
  public String sayHello(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", name);
    return "hello.html";
  }
}

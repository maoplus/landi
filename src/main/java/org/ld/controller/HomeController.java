package org.ld.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
  // 用户首页
  @RequestMapping("/index")
  public String home_user() throws Exception {
    return "/login";
  }
}

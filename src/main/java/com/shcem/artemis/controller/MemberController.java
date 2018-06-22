package com.shcem.artemis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("member")
public class MemberController {
    @RequestMapping("login")
    public ModelAndView loginView(){
        return new ModelAndView("/login");
    }
}

package com.hanhnn.myspring.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	private String appMode;
	@Autowired
    public IndexController(Environment environment){
        appMode = environment.getProperty("app-mode");
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Hanh-San");
        model.addAttribute("mode", appMode);

        return "index";
    }
    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Private Page");
        model.addAttribute("mode", appMode);

        return "welcome";
    }
}

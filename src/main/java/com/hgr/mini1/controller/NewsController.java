package com.hgr.mini1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    @GetMapping({"/news"})
    public String news() {
        return "news";
    }
}

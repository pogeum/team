package com.TeamProject.TeamProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        return "list";
    }
    @RequestMapping("/asd")
    @ResponseBody
    public String ad(){
        return "asd";
    }

    @RequestMapping("/aaa")
    @ResponseBody
    public String aaa(){
        return "aaa";
    }
}

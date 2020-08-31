package com.S2kael.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Index {
    @RequestMapping( value = "/" , method = RequestMethod.GET)
    public String indexGet(ModelMap map){
        map.addAttribute("method", "GET");
        return "index";
    }

    @RequestMapping( value = "/" , method = RequestMethod.POST)
    public String indexPost(ModelMap map){
        map.addAttribute("method", "POST");
        return "index";
    }
}

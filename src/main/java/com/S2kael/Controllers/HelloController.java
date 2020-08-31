package com.S2kael.Controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(ModelMap map) {
        map.addAttribute("msg", "Hello Spring!!!");
        return "hello";
    }

    @RequestMapping( value = "/display")
    public String display(ModelMap map) {
        String name = "Lại Đức Minh";
        map.addAttribute("name", name);
        return "display";
    }

    @RequestMapping("/display/{name}/{id}")
    public String display(ModelMap map, @PathVariable String name, @PathVariable int id) {
        map.addAttribute("name", name);
        map.addAttribute("id", id);
        return "path";
    }
}

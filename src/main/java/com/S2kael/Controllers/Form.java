package com.S2kael.Controllers;


import com.S2kael.Unity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;



@Controller
public class Form {
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    String formUserGet(HttpServletRequest request){
        User user = new User();
        request.setAttribute("user", user);
        return "formUser";
    }


    @RequestMapping(value = "/form", method = RequestMethod.POST)
    String formUserPost(HttpServletRequest request, @ModelAttribute(name = "user") User user){
        request.setAttribute("user", user);
        return "displayForm";
    }
}

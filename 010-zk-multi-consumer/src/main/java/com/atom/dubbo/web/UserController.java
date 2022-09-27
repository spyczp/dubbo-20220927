package com.atom.dubbo.web;

import com.atom.dubbo.model.User;
import com.atom.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService userService2;

    @RequestMapping("/userDetail.do")
    public String userDetail(Model model, Integer id, String name){

        User user = userService.queryUserByIdAndName(id, name);

        User user2 = userService2.queryUserByIdAndName(id, name);

        model.addAttribute("user", user);
        model.addAttribute("user2", user2);

        return "userDetail";
    }
}

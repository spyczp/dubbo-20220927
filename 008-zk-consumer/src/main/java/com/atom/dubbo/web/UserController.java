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

    @RequestMapping("/userDetail.do")
    public String userDetail(Model model, Integer id){
        int allUserCount = userService.queryAllUserCount();
        User user = userService.queryUserById(id);

        model.addAttribute("user", user);
        model.addAttribute("allUserCount", allUserCount);

        return "userDetail";
    }
}

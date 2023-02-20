package com.hjt.course01.controller;

import com.hjt.course01.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/tc")
public class ThymeleafController {

    @GetMapping("/t1")
    public String t1(Model model){
       /* User user = new User(1l, "jietao", "qq134522");
        User baibai = new User(2l, "baibai", "4561");
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(baibai);
        model.addAttribute("users",users);*/
        return "t1";

    }


}

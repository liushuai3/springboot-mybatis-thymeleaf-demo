package com.liushuai.example.demo.controller;

import com.liushuai.example.demo.bean.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright: Copyright (c) 2019 Asiainfo-Linkage
 *
 * @ClassName: IndexController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2019/8/16 9:37
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/8/16     liushuai3           v1.0.0               修改原因
 */

@Controller
@RequestMapping(value = "/")
public class IndexController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("user" , new UserInfo());
        return "/user/form";
    }
}

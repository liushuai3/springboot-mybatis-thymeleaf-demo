package com.liushuai.example.demo.controller;

/**
 * Copyright: Copyright (c) 2019
 *
 * @ClassName: TestUserController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2019/8/15 17:24
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/8/15     liushuai3           v1.0.0               修改原因
 */

import com.liushuai.example.demo.bean.UserInfo;
import com.liushuai.example.demo.service.IUserInterFace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class TestUserController {

    private final Logger log = LoggerFactory.getLogger(TestUserController.class);

    @Autowired
    private IUserInterFace iuser;

    @RequestMapping("/num")
    @ResponseBody
    int home(){
        int i = iuser.getIntUser();
        return i;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    List<UserInfo> getUser(){
        //打印日志
        log.info("TestUserController getUser info");
        return iuser.getAllUser();
    }
}


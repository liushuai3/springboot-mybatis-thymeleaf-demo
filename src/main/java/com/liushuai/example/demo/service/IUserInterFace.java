package com.liushuai.example.demo.service;

import com.liushuai.example.demo.bean.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2019
 *
 * @ClassName: IUserInterFace
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2019/8/15 17:14
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/8/15     liushuai3           v1.0.0               修改原因
 */


@Service
public interface IUserInterFace {

    public UserInfo getUserByCardno(String cardno);

    public UserInfo getUserById(int id);

    public int getIntUser() ;

    public int insertUser(String cardno , String psname);

    public List<UserInfo> getAllUser();

    public int deleteById(int id);

    public int updateById(int id , String cardno , String psname);
}

package com.liushuai.example.demo.bean;

/**
 * Copyright: Copyright (c) 2019
 *
 * @ClassName: UserInfo
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2019/8/15 17:12
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/8/15     liushuai3           v1.0.0               修改原因
 */

public class UserInfo {

    private String psname;
    private String cardno;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public void setPsname(String psname) {
        this.psname = psname;
    }

    public String getPsname() {
        return psname;
    }

    public String getCardno() {
        return cardno;
    }

    public int getId() {
        return id;
    }
}

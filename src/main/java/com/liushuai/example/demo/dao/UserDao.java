package com.liushuai.example.demo.dao;

import com.liushuai.example.demo.bean.UserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Copyright: Copyright (c) 2019
 *
 * @ClassName: UserDao
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2019/8/15 17:15
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/8/15     liushuai3           v1.0.0               修改原因
 */

@Mapper
public interface UserDao {

    /**
     * 通过主键id号码查询人员信息
     */
    @Select("select * from person where id = #{id}")
    UserInfo getUserById(@Param("id") int id);

    /**
     * 通过身份证号码查询人员信息
     */
    @Select("select * from person where cardno = #{cardno}")
    UserInfo getUserByCardno(@Param("cardno") String cardno);

    /**
     * 新增人员信息
     */
    @Insert("insert into person(id,cardno,psname) values(person$seq.nextval,#{cardno},#{psname})")
    int insertUser(@Param("cardno") String cardno, @Param("psname") String psname);

    /**
     * 查询所有人员信息
     */
    @Select("select * from person")
    List<UserInfo> getAllUser();

    /**
     * 通过id删除人员信息
     */
    @Delete("delete from person where id = #{id}")
    int deleteById(@Param("id") int id);

    @Update("update person set cardno=#{cardno},psname=#{psname} where id=#{id}")
    int updateByid(@Param("id") int id , @Param("cardno") String cardno,@Param("psname") String psname);
}

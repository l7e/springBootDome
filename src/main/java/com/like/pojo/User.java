package com.like.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Data
@Table(name = "user")
public class User
{
    @Id //主键
    @KeySql(useGeneratedKeys = true)  //主键回显
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private Date created;
    private Date updated;

    @Transient      //瞬时,使用此注解的字段不会被持久化进数据库
    private String remark;
}

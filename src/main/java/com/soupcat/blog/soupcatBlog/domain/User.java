package com.soupcat.blog.soupcatBlog.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


/**
 * @BelongProject soupcatBlog
 * @BelongPackage com.soupcat.blog.soupcatBlog.domain
 * @Author soupcat
 * @Date 2018/10/31 23:47
 * @Description
 */
@Data
public class User {
    @NotEmpty(message = "姓名不能为空")
    private String name;
    @Max(value = 100, message = "年龄不能大于 100 岁")
    @Min(value = 18, message = "必须年满 18 岁！")
    private int    age;
    private String sex;
    @NotEmpty(message = "密码不能为空")
    @Length(min = 6, message = "密码长度不能小于 6 位")
    private String pass;
}

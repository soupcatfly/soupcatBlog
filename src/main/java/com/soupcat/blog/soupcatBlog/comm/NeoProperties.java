package com.soupcat.blog.soupcatBlog.comm;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @BelongProject soupcatBlog
 * @BelongPackage com.soupcat.blog.soupcatBlog.comm
 * @Author soupcat
 * @Date 2018/11/1 23:21
 * @Description
 */
@Data
@Component
public class NeoProperties {
    @Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String description;
}

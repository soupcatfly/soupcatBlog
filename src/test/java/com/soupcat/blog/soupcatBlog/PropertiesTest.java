package com.soupcat.blog.soupcatBlog;

import com.soupcat.blog.soupcatBlog.comm.NeoProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @BelongProject soupcatBlog
 * @BelongPackage com.soupcat.blog.soupcatBlog
 * @Author soupcat
 * @Date 2018/11/1 23:22
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    @Resource
    private NeoProperties properties;

    @Test
    public void testProperties() throws Exception {
        System.out.println("title:"+properties.getTitle());
        System.out.println("description:"+properties.getDescription());
    }

}

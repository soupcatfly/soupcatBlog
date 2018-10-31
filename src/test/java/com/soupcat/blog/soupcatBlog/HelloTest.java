package com.soupcat.blog.soupcatBlog;

import com.soupcat.blog.soupcatBlog.web.HelloWorldController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @BelongProject soupcatBlog
 * @BelongPackage com.soupcat.blog.soupcatBlog
 * @Author soupcat
 * @Date 2018/10/31 23:44
 * @Description
 */
@SpringBootTest
public class HelloTest {

    private MockMvc mockMvc;

    @Test
    public void hello(){
        System.out.println("hello world");
    }

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }

    @Test
    public void getUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/getUser")).andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void saveUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
                                .param("name","")
                                .param("age","666")
                                .param("pass","test")
        ).andDo(MockMvcResultHandlers.print());
    }
}

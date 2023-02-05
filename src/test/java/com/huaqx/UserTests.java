package com.huaqx;


import com.huaqx.pojo.User;
import com.huaqx.service.BookService;
import com.huaqx.service.UserServiceImpl;
import com.huaqx.util.LoginResultEnum;
import com.huaqx.util.RegisterResultEnum;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)  //按照指定方法运行
class UserTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    UserServiceImpl userService;
    @Autowired
    BookService bookService;

    @Test
    void test0() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        connection.close();
    }

    @Test
    public void testA(){
        List<User> users = userService.queryUserList();
    }

    @Test
    public void  testB(){
        User user = userService.queryUserByUnickname("xiaohuang");
    }

    @Test
    public void testC(){
        User user = userService.queryUserById(1);
    }

    @Test
    public void testD(){
        User user = new User("111111","xiaolu");
        RegisterResultEnum add = userService.add(user);
        System.out.println(add);
    }

    @Test
    public void testF(){
        User user = userService.queryUserByUnickname("xiaolu");
        user.setUnickname("hhhh");
        userService.updateUser(user);
    }

    @Test
    public  void testG(){
        User user = new User("111111","hhhh");
        LoginResultEnum loginResultEnum = userService.checkLogin(user);
        System.out.println(loginResultEnum);
    }

    @Test
    public  void testH(){
        User user = userService.queryUserByUnickname("hhhh");
        userService.deleteUser(user.getUid());
    }



    @Test
    public  void testI(){
        String uavatarByUid = userService.getUavatarByUid(1);
        System.out.println(uavatarByUid);
    }

    @Test
    public  void testJ() throws FileNotFoundException {
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        File upload = new File(path.getAbsolutePath(),"src/main/resources/static/images/avatars");

        String realPath = upload.getAbsolutePath().replace("\\target\\test-classes", "");

        System.out.println(realPath);
    }

}

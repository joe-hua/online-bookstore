package com.huaqx.service;

import com.huaqx.pojo.User;
import com.huaqx.util.LoginResultEnum;
import com.huaqx.util.RegisterResultEnum;

import java.util.List;


public interface UserService {
    List<User> queryUserList();

    User queryUserById(int Uid);

    int updateUser(User user);

    int deleteUser(int Uid);

    User queryUserByUnickname(String Unickname);

    public LoginResultEnum checkLogin(User user);

    public RegisterResultEnum add(User user);

    public String getUavatarByUid(int Uid);

}

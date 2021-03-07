package com.aman.designpatternapp.service;

import com.aman.designpatternapp.dto.UserInfo;
import com.aman.designpatternapp.model.User;

public interface UserService {

    public UserInfo insertUser(UserInfo newUser);
}

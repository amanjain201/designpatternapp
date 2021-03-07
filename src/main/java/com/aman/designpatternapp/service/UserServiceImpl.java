package com.aman.designpatternapp.service;

import com.aman.designpatternapp.dto.UserInfo;
import com.aman.designpatternapp.logger.AppLogger;
import com.aman.designpatternapp.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    AppLogger logger = AppLogger.getInstance();

    @Override
    public UserInfo insertUser(UserInfo newUser) {
        logger.info("Inserting User");
        User.UserBuilder buildUserInfo = new User.UserBuilder(newUser.getName(), newUser.getEmail());
        if (newUser.getMobileNumber() != null) {
            buildUserInfo.setMobileNumber(newUser.getMobileNumber());
        }
        if (newUser.getAddress() != null) {
            buildUserInfo.setAddress(newUser.getAddress());
        }
        logger.info(buildUserInfo.build().toString());
        return newUser;
    }
}

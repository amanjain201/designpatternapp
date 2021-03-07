package com.aman.designpatternapp.controller;

import com.aman.designpatternapp.dto.UserInfo;
import com.aman.designpatternapp.logger.AppLogger;
import com.aman.designpatternapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class DesignpatternappController {

    AppLogger logger = AppLogger.getInstance();

    @Autowired
    UserService userService;

    @RequestMapping(path = "/insert", method = POST, produces = "application/json")
    public ResponseEntity insertValueToDatabase(@RequestBody UserInfo newUser) {
        logger.info("Insert User API called");
        return ResponseEntity.status(HttpStatus.OK).body(userService.insertUser(newUser));
    }
}

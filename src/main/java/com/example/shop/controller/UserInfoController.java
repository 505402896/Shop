package com.example.shop.controller;

import com.example.shop.service.UserInfoService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/user")
public class UserInfoController {

  @Autowired
  public UserInfoService userInfoService;

  @RequestMapping(value = "/login",method = RequestMethod.GET)
  public Result login(String username,String password) {
    return userInfoService.login(username, password);
  }

}

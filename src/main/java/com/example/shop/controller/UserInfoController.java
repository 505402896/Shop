package com.example.shop.controller;

import com.example.shop.entity.UserInfo;
import com.example.shop.service.UserInfoService;
import com.example.shop.util.Result;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @RequestMapping(value = "/sign",method = RequestMethod.PUT)
  public Result sign(@RequestBody UserInfo userInfo) {
    return userInfoService.sign(userInfo);
  }

  @RequestMapping(value = "/updateUserInfo",method = RequestMethod.POST)
  public Result updateUserInfo(@RequestBody JSONObject jsonObject) {
    return userInfoService.updateUserInfo(jsonObject);
  }
}

package com.example.shop.controller;

import com.example.shop.service.UserInfoService;
import com.example.shop.util.Result;
import net.sf.json.JSONObject;
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
  public Result sign(@RequestBody JSONObject jsonObject) {
    return userInfoService.sign(jsonObject);
  }

}

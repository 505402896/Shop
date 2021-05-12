package com.example.shop.service.Imp;

import com.example.shop.entity.UserInfo;
import com.example.shop.mapper.UserInfoMapper;
import com.example.shop.service.UserInfoService;
import com.example.shop.util.Common;
import com.example.shop.util.Result;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("UserInfoService")
public class UserInfoServiceImp implements UserInfoService {
  @Autowired
  public UserInfoMapper userInfoMapper;

  @Override
  public Result login(String username, String password) {
    Result result = new Result();
    Object data = userInfoMapper.login(username,password);
    if(data == null) {
      result.setCode(0);
      result.setMessage("登录失败");
    } else {
      result.setCode(200);
      result.setMessage("登录成功");
    }
    result.setData(data);
    return result;
  }

  @Override
  public Result sign(UserInfo userInfo) {
    Result result = new Result();
    String username = userInfo.getUsername();
    Object oldUser = userInfoMapper.queryUserByUsername(username);
    if(oldUser == null) {
      userInfoMapper.sign(userInfo);
      Object newUser = userInfoMapper.queryUserByUsername(username);
      result.setData(newUser);
      result.setCode(200);
      result.setMessage("注册成功");
    } else {
      result.setMessage("用户已存在，请重新注册");
      result.setCode(0);
    }
    return result;
  }

  @Override
  public Result updateUserInfo(UserInfo userInfo) {
    Result result = new Result();
    userInfoMapper.updateUserInfo(userInfo);
    result.setCode(200);
    result.setMessage("更新成功");
    return result;
  }

  @Override
  public Result updatePassword(UserInfo userInfo) {
    Result result = new Result();
    userInfoMapper.updatePassword(userInfo);
    result.setMessage("修改成功");
    result.setCode(200);
    return result;
  }
}

package com.example.shop.service.Imp;

import com.example.shop.entity.UserInfo;
import com.example.shop.mapper.UserInfoMapper;
import com.example.shop.service.UserInfoService;
import com.example.shop.util.Result;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
  public Result sign(JSONObject jsonObject) {
    Result result = new Result();
    String username = jsonObject.getString("username");
    String password = jsonObject.getString("password");
    Object oldUser = userInfoMapper.queryUserByUsername(username);
    if(oldUser == null) {
      userInfoMapper.sign(username, password);
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
}

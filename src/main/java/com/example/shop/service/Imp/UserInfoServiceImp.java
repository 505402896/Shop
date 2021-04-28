package com.example.shop.service.Imp;

import com.example.shop.entity.UserInfo;
import com.example.shop.mapper.UserInfoMapper;
import com.example.shop.service.UserInfoService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserInfoService")
public class UserInfoServiceImp implements UserInfoService {
  @Autowired
  public UserInfoMapper userInfoMapper;

  @Override
  public Result login(String username, String password) {
    Result result = new Result();
    UserInfo userInfo = userInfoMapper.login(username,password);
    if(userInfo.equals(null)) {
      result.setCode(0);
      result.setMessage("登录失败");
    } else {
      result.setCode(200);
      result.setData(userInfo);
      result.setMessage("登录成功");
    }
    return result;
  }
}

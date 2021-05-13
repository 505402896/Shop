package com.example.shop.service;

import com.example.shop.entity.UserInfo;
import com.example.shop.util.Result;
import org.json.JSONObject;


public interface UserInfoService {
  Result login(String username,String password);
  Result sign(UserInfo userInfo);
  Result updateUserInfo(UserInfo userInfo);
  Result updatePassword(UserInfo userInfo);
  Result getUserInfo(int uid);
}

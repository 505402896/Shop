package com.example.shop.service;

import com.example.shop.util.Result;
import org.json.JSONObject;


public interface UserInfoService {
  Result login(String username,String password);
  Result sign(JSONObject jsonObject);
  Result updateUserInfo(JSONObject jsonObject);
}

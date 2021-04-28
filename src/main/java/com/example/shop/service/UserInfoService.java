package com.example.shop.service;

import com.example.shop.util.Result;
import net.sf.json.JSONObject;

public interface UserInfoService {
  Result login(String username,String password);
  Result sign(JSONObject jsonObject);
}

package com.example.shop.mapper;

import com.example.shop.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface UserInfoMapper {
  UserInfo login(String username,String password);
  void sign(UserInfo userInfo);
  UserInfo queryUserByUsername(String username);
  UserInfo updateUserInfo(Map<String,Object> map);
  UserInfo getUserById(int uid);
}

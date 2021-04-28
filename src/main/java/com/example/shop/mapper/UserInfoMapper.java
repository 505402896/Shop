package com.example.shop.mapper;

import com.example.shop.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserInfoMapper {
  UserInfo login(String username,String password);
  void sign(String username,String password);
  UserInfo queryUserByUsername(String username);
}

package com.example.shop.mapper;

import com.example.shop.entity.Chat;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ChatMapper {
  void addMessage(Chat chat);
  List<Chat> getMessage(int sendId,int acceptId);
}

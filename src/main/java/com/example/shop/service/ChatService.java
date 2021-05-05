package com.example.shop.service;

import com.example.shop.entity.Chat;
import com.example.shop.util.Result;

public interface ChatService {
  Result addMessage(Chat chat);
  Result getMessage(int sendId,int acceptId);
}

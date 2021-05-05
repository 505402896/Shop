package com.example.shop.controller;

import com.example.shop.entity.Chat;
import com.example.shop.service.ChatService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/chat")
public class ChatController {

  @Autowired
  public ChatService chatService;

  @RequestMapping(value = "/addMessage",method = RequestMethod.PUT)
  public Result addMessage(@RequestBody Chat chat) {
    return chatService.addMessage(chat);
  }

  @RequestMapping(value = "/getMessage",method = RequestMethod.GET)
  public Result getMessage(int sendId,int acceptId) {
    return chatService.getMessage(sendId, acceptId);
  }
}

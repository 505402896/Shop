package com.example.shop.service.Imp;

import com.example.shop.entity.Chat;
import com.example.shop.entity.Recent;
import com.example.shop.mapper.ChatMapper;
import com.example.shop.mapper.RecentMapper;
import com.example.shop.service.ChatService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ChatService")
public class ChatServiceImp implements ChatService {
  @Autowired
  public ChatMapper chatMapper;

  @Autowired
  public RecentMapper recentMapper;

  @Override
  public Result addMessage(Chat chat) {
    Recent recent = recentMapper.getRecentById(chat.getSendId(),chat.getAcceptId());
    if(recent == null) {
//      若当前没有会话记录，则新增记录
      Recent newRecent = new Recent();
      newRecent.setSendId(chat.getSendId());
      newRecent.setAcceptId(chat.getAcceptId());
      newRecent.setContent(chat.getContent());
      recentMapper.addRecent(newRecent);
    } else {
//      否则更新最近联系
      Recent updateRecent = new Recent();
      updateRecent.setSendId(chat.getSendId());
      updateRecent.setAcceptId(chat.getAcceptId());
      updateRecent.setContent(chat.getContent());
      recentMapper.updateRecent(updateRecent);
    }
    Result result = new Result();
    chatMapper.addMessage(chat);
    result.setMessage("发送成功");
    result.setCode(200);
    return result;
  }

  @Override
  public Result getMessage(int sendId, int acceptId) {
    Result result = new Result();
    List<Chat> list = chatMapper.getMessage(sendId, acceptId);
    result.setCode(200);
    result.setMessage("查询成功");
    result.setData(list);
    return result;
  }
}

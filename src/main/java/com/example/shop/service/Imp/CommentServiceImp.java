package com.example.shop.service.Imp;

import com.example.shop.entity.Comment;
import com.example.shop.mapper.CommentMapper;
import com.example.shop.service.CommentService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CommentService")
public class CommentServiceImp implements CommentService {
  @Autowired
  public CommentMapper commentMapper;

  @Override
  public Result getComment(int gid) {
    Result result = new Result();
    List<Comment> list = commentMapper.getComment(gid);
    result.setCode(200);
    result.setMessage("查询成功");
    result.setData(list);
    return result;
  }

  @Override
  public Result addComment(Comment comment) {
    Result result = new Result();
    commentMapper.addComment(comment);
    result.setMessage("评论成功");
    result.setCode(200);
    return result;
  }
}

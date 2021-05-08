package com.example.shop.service;

import com.example.shop.entity.Comment;
import com.example.shop.util.Result;

public interface CommentService {
  Result getComment(int gid);
  Result addComment(Comment comment);
}

package com.example.shop.mapper;

import com.example.shop.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentMapper {
  List<Comment> getComment(int gid);
  void addComment(Comment comment);
}

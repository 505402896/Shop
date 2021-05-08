package com.example.shop.controller;

import com.example.shop.entity.Comment;
import com.example.shop.service.CommentService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/comment")
public class CommentController {

  @Autowired
  public CommentService commentService;

  @RequestMapping(value = "/getComment",method = RequestMethod.GET)
  public Result getComment(int gid) {
    return commentService.getComment(gid);
  }

  @RequestMapping(value = "/addComment",method = RequestMethod.PUT)
  public Result addComment(@RequestBody Comment comment) {
    return commentService.addComment(comment);
  }
}

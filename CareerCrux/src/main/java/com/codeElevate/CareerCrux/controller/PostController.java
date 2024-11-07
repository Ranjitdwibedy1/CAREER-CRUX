package com.codeElevate.CareerCrux.controller;

import com.codeElevate.CareerCrux.entity.Post;
import com.codeElevate.CareerCrux.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PostController {

  @Autowired
  private PostService postService;
  @PostMapping
  public ResponseEntity<?> createPost(@RequestBody Post post) {
    try{
      Post createdPost = postService.savePost(post);
      return ResponseEntity.status(HttpStatus.CREATED).body(createdPost);
    }catch(Exception e){
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
  }
}

package com.codeElevate.CareerCrux.service;

import com.codeElevate.CareerCrux.entity.Post;
import com.codeElevate.CareerCrux.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static java.lang.String.valueOf;

@Service
public class PostServiceImpl implements PostService {

  @Autowired
  private PostRepository postRepository;

  public Post savePost(Post post) {
    post.setLikeCount(valueOf(0));
    post.setViewCount(valueOf(0));
    post.setDate(new Date());

    return postRepository.save(post);
  }
}

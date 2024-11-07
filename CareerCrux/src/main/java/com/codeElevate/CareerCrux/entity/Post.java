package com.codeElevate.CareerCrux.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;


  @Column(length = 5000)
  private String content;

  private String postedBy;

  private String img;

  private Date date;

  private String likeCount;

  private String viewCount;

  @ElementCollection
  private List<String> tags;

}

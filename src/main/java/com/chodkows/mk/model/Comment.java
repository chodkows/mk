package com.chodkows.mk.model;

import javax.persistence.Entity;

@Entity
public class Comment extends BaseEntity {
  private User user;
  private String message;
  private Product product;
}

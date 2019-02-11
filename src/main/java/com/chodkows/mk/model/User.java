package com.chodkows.mk.model;

import javax.persistence.Entity;

@Entity
public class User extends BaseEntity {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private Address adress;
}

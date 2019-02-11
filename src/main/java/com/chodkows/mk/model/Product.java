package com.chodkows.mk.model;

import io.vavr.collection.Set;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {

  private String name;
  private String manufacturer;
  private BigDecimal price;
  private BigDecimal salePrice;
  private Long quantity;
  @OneToOne
  private SkinCareCategory skinCareCategory;
  @OneToOne
  private MakeupCategory makeupCategory;
  @OneToOne
  private BodyCareCategory bodyCareCategory;
  @OneToOne
  private SkinType skinType;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "products")
  private Set<Ingredients> ingredients;
  private String regularDescription;
  private String usageDescription;
  private String ingredientsDescription;
  private Boolean canBeForMen;
  private UnitOfMeasure unitOfMeasure;
  private Long quantityInUnitOfMeasure;
  private Long votes;
  private Star star;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "products")
  private Set<Comment> comments;


}

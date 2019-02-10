package com.chodkows.mk.model;

import io.vavr.collection.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {

  private String name;
  private String manufacturer;
  private BigDecimal price;
  private BigDecimal salePrice;
  private Long quantity;
  private SkinCareCategory skinCareCategory;
  private MakeupCategory makeupCategory;
  private BodyCareCategory bodyCareCategory;
  private SkinType skinType;
  private List<Ingredients> ingredients;
  private String regularDescription;
  private String usageDescription;
  private String ingredientsDescription;
  private Boolean canBeForMen;
  private UnitOfMeasure unitOfMeasure;
  private Long quantityInUnitOfMeasure;
  private Long votes;
  private Star star;
  private List<Comment> comments;


}

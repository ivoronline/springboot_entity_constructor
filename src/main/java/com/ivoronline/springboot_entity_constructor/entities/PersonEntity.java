package com.ivoronline.springboot_entity_constructor.entities;

public class PersonEntity {

  //PROPERTIES
  private long    id;
  private String  name;
  private Integer age;

  //CONSTRUCTOR
  public PersonEntity(long Id, String name, Integer age) {
    this.id   = id;
    this.name = name;
    this.age  = age;
  }

  //GETTERS
  public long    getId  () { return id;   }
  public String  getName() { return name; }
  public Integer getAge () { return age;  }

}

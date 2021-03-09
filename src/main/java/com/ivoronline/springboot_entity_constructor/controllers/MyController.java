package com.ivoronline.springboot_entity_constructor.controllers;

import com.ivoronline.springboot_entity_constructor.entities.PersonEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    PersonEntity personEntity = new PersonEntity(1, "John", 20);
    return "Hello " + personEntity.getName();
  }

}

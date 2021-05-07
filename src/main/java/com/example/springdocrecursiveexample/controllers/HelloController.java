package com.example.springdocrecursiveexample.controllers;

import com.example.springdocrecursiveexample.models.TagCollection;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Operation(
      summary = "Gets a tag collection"
  )
  @ResponseStatus(HttpStatus.OK)
  @GetMapping("tagCollection")
  public TagCollection getTagCollection() {
    return new TagCollection();
  }
}

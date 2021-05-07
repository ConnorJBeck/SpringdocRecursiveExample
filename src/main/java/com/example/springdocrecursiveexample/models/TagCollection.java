package com.example.springdocrecursiveexample.models;

import lombok.Data;

import java.util.List;

@Data
public class TagCollection {
  private List<TagGroup> tagGroups;
}

package com.example.springdocrecursiveexample.models;

import lombok.Data;

import java.util.List;

@Data
public class TagGroup {
  private String tagGroupName;
  private List<TagGroup> subgroups;
}

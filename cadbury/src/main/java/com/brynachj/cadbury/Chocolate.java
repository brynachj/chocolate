package com.brynachj.cadbury;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Chocolate {

  String name;
  Integer id;
  Integer brandId;
  List<Integer> tagIds;
}

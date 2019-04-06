package com.brynachj.cadbury;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

  public static final List<Chocolate> CHOCOLATES = new ArrayList(Arrays.asList(
      new Chocolate("Dairy Milk", 1, 1, null),
      new Chocolate("Crunchie", 2, 1, new ArrayList(Arrays.asList(1, 3))),
      new Chocolate("Wispa", 3, 1, new ArrayList(Arrays.asList(1))),
      new Chocolate("Boost", 4, 1, new ArrayList(Arrays.asList(3))),
      new Chocolate("Flake", 5, 1, new ArrayList(Arrays.asList(1, 3))),
      new Chocolate("Curly Wurly", 6, 1, new ArrayList(Arrays.asList(1, 3))),
      new Chocolate("Chomp", 7, 1, new ArrayList(Arrays.asList(1, 3))),
      new Chocolate("Fudge", 8, 1, new ArrayList(Arrays.asList(1, 3))),
      new Chocolate("Bournville", 9, 1, null),
      new Chocolate("Picnic", 10, 1, null),
      new Chocolate("Freddo", 11, 1, null),
      new Chocolate("Daim", 12, 1, null),
      new Chocolate("Fruit & Nut", 13, 1, null)
  ));
}

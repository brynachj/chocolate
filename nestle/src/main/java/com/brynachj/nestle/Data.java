package com.brynachj.nestle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

  public static final List<Chocolate> CHOCOLATES = new ArrayList(Arrays.asList(
      new Chocolate("Yorkie", 1, 1, null),
      new Chocolate("Toffee Crisp", 2, 1, new ArrayList(Arrays.asList(1, 3))),
      new Chocolate("Mliky Bar", 3, 1, new ArrayList(Arrays.asList(1))),
      new Chocolate("Aero", 4, 1, new ArrayList(Arrays.asList(3))),
      new Chocolate("Lion", 5, 1, new ArrayList(Arrays.asList(1, 3))),
      new Chocolate("KitKat Chunky", 6, 1, new ArrayList(Arrays.asList(1, 3)))
  ));
}

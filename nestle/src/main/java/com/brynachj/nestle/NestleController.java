package com.brynachj.nestle;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NestleController {

  @GetMapping("/")
  private List<Chocolate> getChocolates() throws InterruptedException {
    Thread.sleep(500);
    return Data.CHOCOLATES;
  }

}

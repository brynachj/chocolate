package com.brynachj.cadbury;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadburyController {

  @GetMapping("/")
  private List<Chocolate> getChocolates() throws InterruptedException {
    Thread.sleep(500);
    return Data.CHOCOLATES;
  }

}

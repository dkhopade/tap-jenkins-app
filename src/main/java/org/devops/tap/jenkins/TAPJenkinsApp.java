package org.devops.tap.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TAPJenkinsApp {

  @GetMapping
  public String message(){
    return "Welcome to TAP SupplyChains with Jenkins";
  }

  public static void main(String[] args) {
    SpringApplication.run(TAPJenkinsApp.class, args);
  }

}
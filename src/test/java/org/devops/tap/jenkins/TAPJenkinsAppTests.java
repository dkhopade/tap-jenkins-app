package org.devops.tap.jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(TAPJenkinsApp.class)
public class TAPJenkinsAppTests {

  @Autowired
  private TAPJenkinsApp controller;

  @Autowired
  private MockMvc mockMvc;

  @Test
  void index() throws Exception {
    assertEquals("Welcome to TAP SupplyChains with Jenkins...", controller.message());

    mockMvc
        .perform(get("/"))
        .andExpect(status().isOk())
        .andExpect(content().string("Welcome to TAP SupplyChains with Jenkins..."));
  }

}

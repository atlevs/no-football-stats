package com.atle.footballstatsapi;

import com.atle.footballstatsapi.controllers.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MainController.class)
class MainControllerTest {
   @Autowired MainController controller;


   /*@Test
   void contextLoads() throws Exception {
       assertNotNull(controller);
   }/*

    /*@Test
    void testStatusCode() throws IOException, InterruptedException, URISyntaxException {
        when(service.getTeam(6)).thenReturn("");
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, Mock")));
    }*/
}
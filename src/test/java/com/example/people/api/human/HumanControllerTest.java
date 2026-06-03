package com.example.people.api.human;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HumanController.class)
class HumanControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void readAllReturnsDemoPerson() throws Exception {
        mockMvc.perform(get("/api/humans/readAll"))
                .andExpect(status().isOk())
                .andExpect(content().string("John Smith"));
    }
}


package mx.com.camacho.contactpage.controllers;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import mx.com.camacho.contactpage.model.BasicInformation;

@SpringBootTest
@ActiveProfiles("dev")
@AutoConfigureMockMvc
public class BasicInfoControllerTest {

    @Autowired
    private BasicInfoController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() {
        assertNotNull(controller, "Context did not loaded successfuly.");
        assertNotNull(mockMvc, "MockMvc not wired");
    }

    @Test
    public void get_returnsCorrectlyFormatedInformation() throws Exception {
        BasicInformation expected = new BasicInformation(1L, "Oscar Camacho", 
        "Oscar Uriel Camacho Hernandez", "Lead Software Engineer");
        String expectedJson = "{\"id\":1,\"displayName\":\"Oscar Camacho\",\"fullName\":\"Oscar Uriel Camacho Hernandez\",\"displayTitle\":\"Lead Software Engineer\"}";

        
        this.mockMvc.perform(get("/basic-info")).andDo(print()).andExpect(status().isOk())
            .andExpect(content().json(expectedJson));
    }

}

package fr.m2i.api.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetHello() throws Exception {
		
		MvcResult result = mockMvc
				.perform(
						MockMvcRequestBuilders.get("/hello"))
				.andExpect(
						MockMvcResultMatchers.status().isOk())
				.andReturn();		
		String resultStr = result.getResponse().getContentAsString();
		assertEquals("Hello World", resultStr);
	}	

}

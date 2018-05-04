//package com.example.eurekaServer;
//
//import com.example.web.controller.HelloController;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.hamcrest.Matchers.equalTo;
//@RunWith(SpringRunner.class)
//@SpringBootTest
////@SpringApplicationConfiguration(classes = EurekaServerApplication.class)
//@WebAppConfiguration
//public class EurekaServerApplicationTests {
//
//	private MockMvc mockMvc;
//
//	@Before
//	public void setUp() throws Exception{
//		mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
//	}
//	@Test
//	public void contextLoads() throws Exception{
//		mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("hello")));
//
//	}
//
//
//}

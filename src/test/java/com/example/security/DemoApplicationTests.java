package com.example.security;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.security.entity.UserDetailsEntity;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class DemoApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testSuccessAddNewUser() {
	final UserDetailsEntity userDetails = new UserDetailsEntity();
	userDetails.setUsername("username");
	userDetails.setPassword("password");
	userDetails.setRoles("ADMIN,USER");
	ResponseEntity<String> responseEntityResponseEntity = restTemplate.postForEntity("/products/addNewUser",
		userDetails, String.class);
	Assert.assertEquals("hii", responseEntityResponseEntity.getStatusCode(), HttpStatus.OK);
	System.out.println("hii");
    }

}

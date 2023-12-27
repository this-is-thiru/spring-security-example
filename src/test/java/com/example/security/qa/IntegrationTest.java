package com.example.security.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import com.example.security.entity.UserDetailsEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@Tag("it")
public class IntegrationTest {

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
		Assertions.assertEquals(responseEntityResponseEntity.getStatusCode(), HttpStatus.OK, "hii");
	System.out.println("hii");
    }

}

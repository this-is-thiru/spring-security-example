package com.example.security.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@Tag("ut")
class UserDetailsEntityTest {

    @Test
    void testUsername() {
        final String username = Mockito.anyString();
        final UserDetailsEntity entity = new UserDetailsEntity();
        entity.setUsername(username);
        Assertions.assertNotNull(entity.getUsername(), "Username is mismatched");
    }

    @Test
    void testPassword() {
        final String password = "password";
        final UserDetailsEntity entity = new UserDetailsEntity();
        entity.setPassword(password);
        Assertions.assertEquals(entity.getPassword(), password, "Password is mismatched");
    }

    @Test
    void testRoles() {
        final String roles = "ADMIN,USER";
        final UserDetailsEntity entity = new UserDetailsEntity();
        entity.setRoles(roles);
        Assertions.assertEquals(entity.getRoles(), roles, "Roles are mismatched");
    }
}
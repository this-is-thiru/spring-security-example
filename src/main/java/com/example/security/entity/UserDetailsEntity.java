package com.example.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserDetailsEntity {
    @Id
    private String username;
    private String password;
    private String roles;
}

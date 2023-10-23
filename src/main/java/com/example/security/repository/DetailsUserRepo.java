package com.example.security.repository;

import com.example.security.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsUserRepo extends JpaRepository<UserDetailsEntity, String> {
}

package com.example.repository;
 
import com.example.model.User;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}
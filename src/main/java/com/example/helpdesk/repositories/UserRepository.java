package com.example.helpdesk.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.helpdesk.entity.User;


public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);

}

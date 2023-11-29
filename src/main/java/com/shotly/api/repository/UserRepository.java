package com.shotly.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shotly.api.model.User;

public interface UserRepository extends MongoRepository<User, Long> {

}

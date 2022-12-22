package com.javadavysec.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javadavysec.workshopmongo.domain.User;

@Repository
public interface UsersRepository extends MongoRepository<User, String> {
    
}

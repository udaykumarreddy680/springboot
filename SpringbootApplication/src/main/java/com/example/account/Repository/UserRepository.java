package com.example.account.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.account.Domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}

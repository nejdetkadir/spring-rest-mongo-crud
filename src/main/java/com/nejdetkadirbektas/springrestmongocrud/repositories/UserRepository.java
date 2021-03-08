package com.nejdetkadirbektas.springrestmongocrud.repositories;

import com.nejdetkadirbektas.springrestmongocrud.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author nejdetkadirr
 */
public interface UserRepository extends MongoRepository<User, String> {
}

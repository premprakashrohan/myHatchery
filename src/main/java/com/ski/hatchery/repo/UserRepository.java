package com.ski.hatchery.repo;

import org.springframework.data.repository.CrudRepository;

import com.ski.hatchery.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}

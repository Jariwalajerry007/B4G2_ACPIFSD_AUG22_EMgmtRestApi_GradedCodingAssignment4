package com.restemployee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.restemployee.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String userName);

}

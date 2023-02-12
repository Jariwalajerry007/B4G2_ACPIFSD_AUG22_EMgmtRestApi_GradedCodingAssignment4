package com.restemployee.service;

import java.util.List;
import java.util.Optional;

import com.restemployee.entities.User;

public interface IUserService {

	public List<User> findAllUsers();

	public Optional<User> findUserById(int id);

	public User findByUserName(String userName);

}
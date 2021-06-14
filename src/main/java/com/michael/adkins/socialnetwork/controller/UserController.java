/**
 * 
 */
package com.michael.adkins.socialnetwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.adkins.socialnetwork.entity.User;
import com.michael.adkins.socialnetwork.entity.UserDao;

/**
 * @author micha
 *
 */
@RestController("users")
public class UserController {

	@Autowired
	private UserDao userDao;

	@GetMapping("all")
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

//	@GetMapping("{id}")
//	public User getUser(@PathVariable Integer id) {
//		return userDao.findOne(id);
//	}
}

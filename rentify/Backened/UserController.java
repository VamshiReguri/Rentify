package com.rentify.controller; 
import com.rentify.model.User; 
import com.rentify.service.UserService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 
@RestController 
@RequestMapping("/users") 
public class UserController { 
@Autowired 
private UserService userService; 
@PostMapping("/register") 
public User registerUser(@RequestBody User user) { 
return userService.registerUser(user); 
} 
@PostMapping("/login") 
public User loginUser(@RequestBody User user) { 
return userService.loginUser(user.getEmail(), user.getPassword()); 
} 
} 
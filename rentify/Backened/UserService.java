package com.rentify.service; 
import com.rentify.model.User; 
import com.rentify.repository.UserRepository; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
@Service 
public class UserService { 
@Autowired 
private UserRepository userRepository; 
public User registerUser(User user) { 
return userRepository.save(user); 
} 
public User loginUser(String email, String password) { 
User user = userRepository.findByEmail(email); 
if (user != null && user.getPassword().equals(password)) { 
return user; 
} 
return null; 
} 
}

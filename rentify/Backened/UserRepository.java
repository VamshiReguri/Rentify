package com.rentify.repository; 
import com.rentify.model.User; 
import org.springframework.data.jpa.repository.JpaRepository; 
public interface UserRepository extends JpaRepository<User, Long> { 
User findByEmail(String email); 
} 
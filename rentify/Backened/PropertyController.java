package com.rentify.controller; 
import com.rentify.model.Property; 
import com.rentify.service.PropertyService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 
import java.util.List; 
@RestController 
@RequestMapping("/properties") 
public class PropertyController { 
@Autowired 
private PropertyService propertyService; 
@PostMapping("/post") 
public Property postProperty(@RequestBody Property property) { 
return propertyService.postProperty(property); 
} 
@GetMapping 
public List<Property> getAllProperties() { 
return propertyService.getAllProperties(); 
} 
@GetMapping("/owner/{ownerId}") 
public List<Property> getPropertiesByOwner(@PathVariable Long ownerId) { 
return propertyService.getPropertiesByOwner(ownerId); 
} 
}
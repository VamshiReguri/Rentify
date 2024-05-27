package com.rentify.service; 
import com.rentify.model.Property; 
import com.rentify.repository.PropertyRepository; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import java.util.List; 
@Service 
public class PropertyService { 
@Autowired 
private PropertyRepository propertyRepository; 
public Property postProperty(Property property) { 
return propertyRepository.save(property); 
} 
public List<Property> getAllProperties() { 
return propertyRepository.findAll(); 
} 
public List<Property> getPropertiesByOwner(Long ownerId) { 
return propertyRepository.findByOwnerId(ownerId); 
} 
}

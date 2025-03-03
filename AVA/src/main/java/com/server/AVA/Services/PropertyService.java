package com.server.AVA.Services;

import com.server.AVA.Models.DTOs.PropertyDTOs.CreatePropertyDTO;
import com.server.AVA.Models.DTOs.PropertyDTOs.PropertyDTO;
import com.server.AVA.Models.DTOs.PropertyDTOs.PropertyResponse;
import com.server.AVA.Models.Property;

import java.util.List;

public interface PropertyService {
    PropertyDTO createProperty(String token, CreatePropertyDTO createPropertyDTO) throws Exception;
    Property getPropertyById(Long propertyId) throws Exception;
    PropertyResponse getWholePropertyById(Long propertyId) throws Exception;
    List<PropertyResponse> addToInterestedList(String token, Long propertyId) throws Exception;
    List<PropertyResponse> removeFromInterestedList(String token, Long propertyId) throws Exception;
    List<PropertyResponse> getInterestedList(String token) throws Exception;
    void deleteProperty(String token, Long propertyId) throws Exception;
}

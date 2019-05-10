package com.dutech.myrdm.api.model.dto;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty.AccessMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * An example of a DTO. Usually there are multiple DTOs to represent different requests, such as 
 * EmployeeCreate, EmployeeUpdate, etc. 
 * 
 * This example is based on a single DTO for all requests and responses. By utilizing the correct 
 * annotations, the same DTO serve multiple purposes.
 * 
 * @author Ameer Qudsiyeh
 */
@Getter @Setter @ToString
@ApiModel(description = "Author Model")
public class Dto {

	/*
	 * Using JsonProperty access mode, we can share the same DTO object for request and response.
	 * Setting access mode to READ_ONLY ensures that the request will exclude the id field,
	 * but the response will include the id field.
	 */
	@ApiModelProperty(notes = "Employee id", accessMode = AccessMode.READ_ONLY)
	@JsonProperty(access = Access.READ_WRITE)
	private Long id;
	
	@ApiModelProperty(notes = "Employee first name", example = "Ali")
	@Size(min = 3, max = 32) // Recommended to add a bespoke message and not rely on the default
    public String firstName;
    
	@ApiModelProperty(notes = "Employee last name", example = "Baba")
    @Size(min = 4, message = "{Size.employee.lastName}")
    public String lastName;	
}
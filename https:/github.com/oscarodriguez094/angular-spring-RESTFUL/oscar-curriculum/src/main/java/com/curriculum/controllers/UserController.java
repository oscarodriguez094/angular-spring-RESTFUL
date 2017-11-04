package com.curriculum.controllers;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curriculum.model.User;
import com.curriculum.service.UserService;
import com.curriculum.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserController {

	@Autowired
	protected UserService userService;

	protected ObjectMapper mapper;

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson)
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();

		User user = this.mapper.readValue(userJson, User.class);

		if (!this.validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no estan rellenados");
		}
		this.userService.save(user);

		return new RestResponse(HttpStatus.OK.value(), "Operacion realizada con éxito");
	}
	
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<User> getUsers() {
		
		return this.userService.findAll();	
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public void deleteUser(@RequestBody String userJson) throws Exception {
		
		this.mapper = new ObjectMapper();

		User user = this.mapper.readValue(userJson, User.class);
		
		if(user.getId() == null )
			throw new Exception("El usuario no existe ");
		
		this.userService.deleteUser(user.getId());
		
	}
	
	
	@RequestMapping(value = "/getUser/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable Long userId) {

		return this.userService.findById(userId);
		
	}
	
	
	private boolean validate(User user) {
		boolean isValid = true;

		if (StringUtils.trimToNull(user.getFirstName()) == null) {
			isValid = false;
		}

		if (StringUtils.trimToNull(user.getFirstSurname()) == null) {
			isValid = false;
		}

		if (StringUtils.trimToNull(user.getAddress()) == null) {
			isValid = false;
		}
		return isValid;
	}

}
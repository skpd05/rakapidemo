package com.rak.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoAPIController {

	@Autowired
	UserService userService;

	@PostMapping(value = "/user")
	public ResponseEntity<UserResponse> createUser(@RequestBody RakUser rUser) {
		UserResponse responseObj = userService.createUser(rUser);
		return new ResponseEntity<>(responseObj, HttpStatus.OK);
	}

	@GetMapping(value = "/user/login/{emailid}")
	public ResponseEntity<UserResponse> userLogin(@PathVariable String emailid) {
		UserResponse responseObj = userService.getUserSession(emailid);
		return new ResponseEntity<>(responseObj, HttpStatus.OK);

	}

	@GetMapping(value = "/user/{xauthToken}")
	public ResponseEntity<RakUser> getProfile(@PathVariable String xauthToken) {
		RakUser responseObj = userService.getUserProfile(xauthToken);
		return new ResponseEntity<>(responseObj, HttpStatus.OK);

	}
	
//	@DeleteMapping(value = "/user/{xauthToken}")
//	public ResponseEntity<UserResponse> deleteUser(@PathVariable String xauthToken) {
//		UserResponse responseObj = userService.getUserSession(xauthToken);
//		return new ResponseEntity<>(responseObj, HttpStatus.OK);
//
//	}

}

package ers.com.es.eoi.tinnyshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ers.com.es.eoi.tinnyshop.dto.UserDto;
import ers.com.es.eoi.tinnyshop.service.UserService;

@RestController
@RequestMapping("/tinnyshop/user")
public class UserController {

	@Autowired
	private UserService userService;

	// Get users
	@GetMapping
	public ResponseEntity<List<UserDto>> getAllUsers() {
		List<UserDto> users = userService.findAll();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	// Get user by id
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable int id) {
		UserDto user = userService.findById(id);
		if (user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
	
	//Post new user
	@PostMapping
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		UserDto newUser = userService.createUser(userDto);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
		
	}
	
	//Put update user
	@PutMapping("/{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable int id, @RequestBody UserDto userDto){
		UserDto updateUser = userService.updateUser(id, userDto);
		if(updateUser != null) {
			return new ResponseEntity<>(updateUser, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	//Post verify username and password(login)
	@PostMapping("/login")
	public ResponseEntity<UserDto> loginUser(@RequestBody UserDto userDto){
		UserDto loginUser = userService.loginUser(userDto);
		if(loginUser != null) {
			return new ResponseEntity<>(loginUser, HttpStatus.OK);	
		}else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
	

}

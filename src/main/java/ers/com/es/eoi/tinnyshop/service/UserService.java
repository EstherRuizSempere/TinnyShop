package ers.com.es.eoi.tinnyshop.service;


import java.util.List;

import ers.com.es.eoi.tinnyshop.dto.UserDto;


public interface UserService {

	List<UserDto> findAll();
	UserDto findById(int id);
	UserDto createUser(UserDto userDto);
	UserDto updateUser (int id, UserDto userDto);
	UserDto loginUser (UserDto userDto);
	
}

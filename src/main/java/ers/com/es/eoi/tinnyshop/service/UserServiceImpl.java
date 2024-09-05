package ers.com.es.eoi.tinnyshop.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ers.com.es.eoi.tinnyshop.dto.UserDto;
import ers.com.es.eoi.tinnyshop.entity.User;
import ers.com.es.eoi.tinnyshop.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserDto> findAll() {
		List<User> users = userRepository.findAll();
		List<UserDto> usersDto = new ArrayList<>();
		for (User user : users) {
			usersDto.add(entityToDto(user));
		}
		return usersDto;
	}

	@Override
	public UserDto findById(int id) {
		//todo ¿cómo le digo si no encuentro el usuario? ¿Con un if?
		return entityToDto(userRepository.findById(id).get());
	}
	
	@Override
	public UserDto createUser(UserDto userDto) {
		User entity = dtoToEntity(userDto);
		User savedEntity = userRepository.save(entity);
		
		return entityToDto(savedEntity);
	}


	@Override
	public UserDto updateUser(int id, UserDto userDto) {
		if(userRepository.existsById(id)) {
			User entity = dtoToEntity(userDto);
			entity.setId(id);
			User updateUser = userRepository.save(entity);
			return entityToDto(updateUser);
		}else {
			return null;
		}
	}

	@Override
	public UserDto loginUser(UserDto userDto) {
	    User entity = userRepository.findByUsernameAndPassword(userDto.getUsername(), userDto.getPassword());
	    return entity != null ? entityToDto(entity) : null;
	}


	private UserDto entityToDto(User entity) {
		return new UserDto(entity.getId(), entity.getUsername(), entity.getPassword());
	}

	private User dtoToEntity(UserDto userDto) {
		return new User(userDto.getId(), userDto.getUsername(), userDto.getPassword(), null);
	}




}

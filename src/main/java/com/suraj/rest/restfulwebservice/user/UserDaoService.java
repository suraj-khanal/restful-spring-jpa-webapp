package com.suraj.rest.restfulwebservice.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	//JPA/Hibernate > Database
	//UserDaoService > Static List
	
	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 0;
	
	static {
		
		users.add(new User(++userCount, "Adam", LocalDate.now().minusYears(32)));
		users.add(new User(++userCount, "Emma", LocalDate.now().minusYears(23)));
		users.add(new User(++userCount, "Jason", LocalDate.now().minusYears(18)));
	}
	
	public List<User> findAll(){
		
		return users;
	}
	
	public User findOne(int id) {
		
		Predicate<? super User> predicate = user ->user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User save(User user) {
		
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public void deleteById(int id) {
		
		Predicate<? super User> predicate = user ->user.getId().equals(id);
		users.removeIf(predicate);
	}
	

}

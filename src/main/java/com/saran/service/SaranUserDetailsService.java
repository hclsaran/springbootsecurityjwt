package com.saran.service;
import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SaranUserDetailsService implements UserDetailsService{
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("saran".equals(username)) {
			return new User("saran", "$2a$12$XV9O.xwi28JNcGK3A1/N3eDOzZ1pMvS1.lXwN3g19o7wzOMTjs.fC",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}

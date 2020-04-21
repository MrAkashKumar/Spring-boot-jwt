package com.akash.Springbootjwt.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if("akashKumar".equals(username)){
            return new User("akashKumar", "$2a$10$iNVC63XJa21P7sMwIki44uw9uzQtUGKNX0jojjP41wb5LJXXF0KlO", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username  : "+username);
        }
    }
}

package com.akash.Springbootjwt.service;

import com.akash.Springbootjwt.constant.ConstantConfig;
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
        if(ConstantConfig.USERNAME.equals(username)){
            return new User(ConstantConfig.USERNAME, "$2a$10$iNVC63XJa21P7sMwIki44uw9uzQtUGKNX0jojjP41wb5LJXXF0KlO", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username  : "+username);
        }
    }
}

package com.akash.Springbootjwt.controller;

import com.akash.Springbootjwt.config.JwtTokenUtil;
import com.akash.Springbootjwt.service.JwtUserDetailsService;
import com.akash.Springbootjwt.urlMapping.URLMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;


    @GetMapping(value = URLMapping.CHECK_STATUS)
    public ResponseEntity<Object> checkStatus(@RequestHeader String user){

        final String getUser = user;
        final String msg = "User is null";
        if(Objects.isNull(getUser)){
            return new ResponseEntity<>(msg, HttpStatus.OK);
        }
        return new ResponseEntity<>(getUser, HttpStatus.OK);
    }

    @GetMapping(value = URLMapping.DUMMY_API)
    public String first(){
        String msg = "Develop by Akash";

        return msg;
    }
}

package com.akash.Springbootjwt.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class JwtResponse implements Serializable {

    private final String jwtToken;

}

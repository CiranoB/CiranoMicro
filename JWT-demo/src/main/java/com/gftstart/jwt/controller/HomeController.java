package com.gftstart.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gftstart.jwt.model.JwtRequest;
import com.gftstart.jwt.model.JwtResponse;
import com.gftstart.jwt.service.UserService;
import com.gftstart.jwt.utility.JwtUtility;

@RestController
public class HomeController {

	@Autowired
	private JwtUtility jwtUtility;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "Welcome to the C0BR4S";
	}
	
	@PostMapping("/authenticate")
	public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
		try {
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						jwtRequest.getUsername()
						, jwtRequest.getPassword())
				);
		}catch(BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}

		final UserDetails userDetails
			= userService.loadUserByUsername(jwtRequest.getUsername());
		
		final String token =
				jwtUtility.generateToken(userDetails);
		
		return new JwtResponse(token);
		
	}
	
	
}

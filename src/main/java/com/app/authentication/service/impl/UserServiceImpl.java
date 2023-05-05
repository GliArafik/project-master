package com.app.authentication.service.impl;

import com.app.authentication.dto.LoginRequestDto;
import com.app.authentication.dto.RegisterRequestDto;
import com.app.authentication.dto.SuccessResponseDto;
import com.app.authentication.model.User;
import com.app.authentication.repo.RoleRepository;
import com.app.authentication.repo.UserRepository;
import com.app.authentication.service.UserService;
import com.app.authentication.utils.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    private final AuthenticationManager authenticationManager;

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder passwordEncoder;

    private final JwtUtil jwtUtil;

    public UserServiceImpl(AuthenticationManager authenticationManager,
                           UserRepository userRepository,
                           RoleRepository roleRepository,
                           PasswordEncoder passwordEncoder,
                           JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    @Override
    public String authenticate(LoginRequestDto loginRequestDto) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponseDto<?>> register(RegisterRequestDto registerRequestDto) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

}

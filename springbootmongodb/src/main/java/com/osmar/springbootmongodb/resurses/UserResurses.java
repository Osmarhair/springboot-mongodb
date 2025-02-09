package com.osmar.springbootmongodb.resurses;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osmar.springbootmongodb.domain.User;
import com.osmar.springbootmongodb.dto.UserDTO;
import com.osmar.springbootmongodb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResurses {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        
        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
        }
}

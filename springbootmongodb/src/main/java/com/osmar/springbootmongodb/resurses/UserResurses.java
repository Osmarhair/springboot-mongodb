package com.osmar.springbootmongodb.resurses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osmar.springbootmongodb.domain.User;
import com.osmar.springbootmongodb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResurses {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
        }
}

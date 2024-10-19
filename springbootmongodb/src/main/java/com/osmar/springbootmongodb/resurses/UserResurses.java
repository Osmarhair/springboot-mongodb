package com.osmar.springbootmongodb.resurses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osmar.springbootmongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResurses {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User simone = new User("1", "Simone", "simone@email.com");
        User alice = new User("2", "Alice", "alice@email.com");
        User helena = new User("3", "Helena", "helena@email.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(simone, alice, helena));
        return ResponseEntity.ok().body(list);
        }
}

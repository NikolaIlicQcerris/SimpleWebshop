package com.qcerris.webshop.rest;

import com.qcerris.webshop.domain.dto.UserDTO;
import com.qcerris.webshop.service.impl.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> insertNewUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(userService.insertNewUser(userDTO), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> fetchUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.fetchUserById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/all",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "username/{username}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> fetchUserByUsername(@PathVariable String username) {
        return new ResponseEntity<>(userService.fetchUserByUsername(username), HttpStatus.OK);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.deleteUserById(id), HttpStatus.OK);
    }

}

package com.qcerris.webshop.rest;

import com.qcerris.webshop.domain.dto.CategoryDTO;
import com.qcerris.webshop.service.impl.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDTO> insertNewCategory(@RequestBody CategoryDTO categoryDTO) {
        return new ResponseEntity<>(categoryService.insertNewCategory(categoryDTO), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDTO> fetchCategoryById(@PathVariable Long id) {
        return new ResponseEntity<>(categoryService.fetchCategoryById(id), HttpStatus.OK);
    }
//
//    @GetMapping(value = "/all",
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<UserDTO>> getAllUsers() {
//        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "username/{username}",
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<UserDTO> fetchUserByUsername(@PathVariable String username) {
//        return new ResponseEntity<>(userService.fetchUserByUsername(username), HttpStatus.OK);
//    }
//
//    @PutMapping (consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) {
//        return new ResponseEntity<>(userService.updateUser(userDTO), HttpStatus.OK);
//    }
//
//    @DeleteMapping (value = "/{id}")
//    public ResponseEntity<String> deleteUserById(@PathVariable Long id) {
//        return new ResponseEntity<>(userService.deleteUserById(id), HttpStatus.OK);
//    }
}

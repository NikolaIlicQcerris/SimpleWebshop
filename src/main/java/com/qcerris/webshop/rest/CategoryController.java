package com.qcerris.webshop.rest;

import com.qcerris.webshop.domain.dto.CategoryDTO;
import com.qcerris.webshop.service.impl.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/all",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CategoryDTO>> getAllCategories() {
        return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
    }

    @GetMapping(value = "name/{categoryName}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDTO> fetchCategoryByName(@PathVariable String categoryName) {
        return new ResponseEntity<>(categoryService.fetchCategoryByName(categoryName), HttpStatus.OK);
    }

    @PutMapping (consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDTO> updateCategory(@RequestBody CategoryDTO categoryDTO) {
        return new ResponseEntity<>(categoryService.updateCategory(categoryDTO), HttpStatus.OK);
    }

        @DeleteMapping (value = "/{id}")
        public ResponseEntity<String> deleteUserById(@PathVariable Long id) {
            return new ResponseEntity<>(categoryService.deleteCategoryById(id), HttpStatus.OK);
        }
}

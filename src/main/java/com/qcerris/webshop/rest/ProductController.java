package com.qcerris.webshop.rest;

import com.qcerris.webshop.domain.dto.ProductDTO;
import com.qcerris.webshop.service.impl.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductDTO> insertNewProduct(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(productService.insertNewProduct(productDTO), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductDTO> fetchProductById(@PathVariable Long id) {
        return new ResponseEntity<>(productService.fetchProductById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/all",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping(value = "name/{productName}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductDTO> fetchProductByName(@PathVariable String productName) {
        return new ResponseEntity<>(productService.fetchProductByName(productName), HttpStatus.OK);
    }

    @PutMapping (consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductDTO> updateProduct(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(productService.updateProduct(productDTO), HttpStatus.OK);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable Long id) {
        return new ResponseEntity<>(productService.deleteProductById(id), HttpStatus.OK);
    }
}

package com.qcerris.webshop.service.impl;

import com.qcerris.webshop.domain.dto.ProductDTO;
import com.qcerris.webshop.domain.entity.ProductEntity;
import com.qcerris.webshop.domain.mapper.ProductMapper;
import com.qcerris.webshop.repository.ProductRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Modifying
    public ProductDTO insertNewProduct(ProductDTO productDTO) {
        ProductEntity savedProduct = productRepository.save(productMapper.productDTOToEntity(productDTO));
        return productMapper.productToDTO(savedProduct);
    }

    public ProductDTO fetchProductById(Long id) {
        return productMapper.productToDTO(productRepository.findById(id).get());
    }

    public List<ProductDTO> getAllProducts() {
        return productMapper.productToDTO(productRepository.findAll());
    }

    public ProductDTO fetchProductByName(String productName) {
        return productMapper.productToDTO(productRepository.findByName(productName));
    }

    @Modifying
    public ProductDTO updateProduct(ProductDTO productDTO) {
        ProductEntity product = productRepository.getReferenceById(productDTO.getId());

        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setQuantity(productDTO.getQuantity());
        product.setItems(productDTO.getItems());
        product.setCategories(productDTO.getCategories());

        return productMapper.productToDTO(productRepository.save(product));
    }

    @Modifying
    public String deleteProductById(Long id) {
        ProductEntity toBeDeleted = productRepository.getReferenceById(id);
        productRepository.delete(toBeDeleted);
        return "Successfully deleted product: " + toBeDeleted.getName();
    }
}

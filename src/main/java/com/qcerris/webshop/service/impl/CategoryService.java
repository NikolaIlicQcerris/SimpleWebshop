package com.qcerris.webshop.service.impl;

import com.qcerris.webshop.domain.dto.CategoryDTO;
import com.qcerris.webshop.domain.entity.CategoryEntity;
import com.qcerris.webshop.domain.mapper.CategoryMapper;
import com.qcerris.webshop.repository.CategoryRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Modifying
    public CategoryDTO insertNewCategory(CategoryDTO categoryDTO) {
        CategoryEntity savedCategory = categoryRepository.save(categoryMapper.categoryDTOToEntity(categoryDTO));
        return categoryMapper.categoryToDTO(savedCategory);
    }

    public CategoryDTO fetchCategoryById(Long id) {
        return categoryMapper.categoryToDTO(categoryRepository.findById(id).get());
    }

    @Modifying
    public String deleteCategoryById(Long id) {
        CategoryEntity toBeDeleted = categoryRepository.getReferenceById(id);
        categoryRepository.delete(toBeDeleted);
        return "Successfully deleted category: " + toBeDeleted.getName();
    }

    public List<CategoryDTO> getAllCategories() {
        return categoryMapper.categoryToDTO(categoryRepository.findAll());
    }

    @Modifying
    public CategoryDTO updateCategory(CategoryDTO categoryDTO) {

        CategoryEntity categoryEntity = categoryRepository.getReferenceById(categoryDTO.getId());

        categoryEntity.setName(categoryDTO.getName());
        categoryEntity.setProducts(categoryDTO.getProducts());

        return categoryMapper.categoryToDTO(categoryRepository.save(categoryEntity));
    }

    public CategoryDTO fetchCategoryByName(String categoryName) {
        return categoryMapper.categoryToDTO(categoryRepository.findByName(categoryName));
    }
}

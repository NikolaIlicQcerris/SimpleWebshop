package com.qcerris.webshop.service.impl;

import com.qcerris.webshop.domain.dto.CategoryDTO;
import com.qcerris.webshop.domain.entity.CategoryEntity;
import com.qcerris.webshop.domain.mapper.CategoryMapper;
import com.qcerris.webshop.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    public CategoryDTO insertNewCategory(CategoryDTO categoryDTO) {
        CategoryEntity savedCategory = categoryRepository.save(categoryMapper.categoryDTOToEntity(categoryDTO));
        return categoryMapper.categoryToDTO(savedCategory);
    }

    public CategoryDTO fetchCategoryById(Long id) {
        return categoryMapper.categoryToDTO(categoryRepository.findById(id).get());
    }
}

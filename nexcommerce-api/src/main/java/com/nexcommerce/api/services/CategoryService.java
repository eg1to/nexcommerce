package com.nexcommerce.api.services;


import org.springframework.stereotype.Service;
import com.nexcommerce.api.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.nexcommerce.api.dto.category.CategoryRequestDTO;
import com.nexcommerce.api.dto.category.CategoryResponseDTO;
import com.nexcommerce.api.entities.Category;
import com.nexcommerce.api.repositories.ProductRepository;
import java.util.UUID;
import java.util.List;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    private CategoryResponseDTO toResponseDTO(Category category) {

        CategoryResponseDTO dto = new CategoryResponseDTO();
        dto.setId(category.getId());
        dto.setName(category.getName());
        dto.setDescription(category.getDescription());
        return dto;

    }

    public CategoryResponseDTO create(CategoryRequestDTO dto) {
        
    Category category = new Category();
    category.setName(dto.getName());
    category.setDescription(dto.getDescription());
    Category saved = categoryRepository.save(category);

    return toResponseDTO(saved);

    }

    public CategoryResponseDTO findById(UUID id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));

        return toResponseDTO(category);
    }

    public CategoryResponseDTO findByName(String name) {
        Category category = categoryRepository.findByName(name).orElseThrow(() -> new RuntimeException("Category not found"));

        return toResponseDTO(category);
    }


    public List<CategoryResponseDTO> findAll() {
        return categoryRepository.findAll().stream().map(this::toResponseDTO).toList();
    }

    public CategoryResponseDTO update(UUID id, CategoryRequestDTO dto) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));

        category.setName(dto.getName());
        category.setDescription(dto.getDescription());
        Category updated = categoryRepository.save(category);
        return toResponseDTO(updated);
    }

    public void delete(UUID id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
        if (productRepository.existsByCategory(category)) {
            throw new RuntimeException("Cannot delete category with associated products");
        }
        categoryRepository.delete(category);
    }

    
}

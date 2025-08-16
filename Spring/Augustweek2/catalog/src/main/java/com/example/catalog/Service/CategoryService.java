package com.example.catalog.Service;


import com.example.catalog.Entities.Category;
import com.example.catalog.Entities.Product;
import com.example.catalog.dto.category.CategoryCreateRequest;
import com.example.catalog.dto.category.CategoryDto;
import com.example.catalog.dto.category.CategoryUpdateRequest;
import com.example.catalog.exception.BadRequestException;
import com.example.catalog.exception.NotFoundException;
import com.example.catalog.mapper.CategoryMapper;
import com.example.catalog.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repo;


    public CategoryDto create(CategoryCreateRequest req){
        repo.findByNameIgnoreCase(req.name()).ifPresent(c->{
            throw new BadRequestException("Category name already exist:"+ req.name());

        });

        Category c=Category.builder()
                .name(req.name())
                .description(req.description()).build();
        return CategoryMapper.toDTO(repo.save(c));

    }


    public List<CategoryDto> list(){
        return repo.findAll().stream().map(CategoryMapper::toDTO).toList();
    }


    public Category getEntity(Long id){
        return repo.findById(id).orElseThrow(()->new NotFoundException("Category not found:"+id));
    }
    public CategoryDto get(Long id) { return CategoryMapper.toDTO(getEntity(id)); }


    @Transactional
    public CategoryDto update(Long id, CategoryUpdateRequest req){
        Category c=getEntity(id);
        c.setName(req.name());
        c.setDescription(req.description());
        return CategoryMapper.toDTO(repo.save(c));
    }
@Transactional
    public void delete(Long id){
        if(!repo.existsById(id)) throw new NotFoundException(("Category now found"+id));
        repo.deleteById(id);
    }
    @Transactional
    public void printCategoriesAndProducts() {
        List<Category> categories = repo.findAll(); // 1 query

        for (Category category : categories) {
            System.out.println("Category: " + category.getName());
            for (Product product : category.getProducts()) { // triggers 1 query per category
                System.out.println(" - Product: " + product.getName());
            }
        }

}

    @Transactional
    public void printCategoriesAndProductsJoinFetch() {
        List<Category> categories = repo.findAllWithProducts();

        for (Category category : categories) {
            System.out.println("Category: " + category.getName());
            for (Product product : category.getProducts()) {
                System.out.println(" - Product: " + product.getName());
            }
        }
    }
}

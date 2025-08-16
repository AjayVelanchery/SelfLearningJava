package com.example.catalog.Controller;


import com.example.catalog.Entities.Category;
import com.example.catalog.Service.CategoryService;
import com.example.catalog.dto.category.CategoryCreateRequest;
import com.example.catalog.dto.category.CategoryDto;
import com.example.catalog.dto.category.CategoryUpdateRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryDto create(@Valid @RequestBody CategoryCreateRequest request){
        return service.create(request);
    }

    @GetMapping
    public List<CategoryDto> list(){
        return service.list();
    }

    @GetMapping("/{id}")
    public CategoryDto get(@PathVariable Long id){
        return service.get(id);
    }
@PutMapping("/{id}")
    public CategoryDto update(@PathVariable Long id, @Valid @RequestBody CategoryUpdateRequest update){

        return service.update(id,update);
}

@DeleteMapping("/{id}")@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.delete(id);
}
    @GetMapping("/categories/nplus1")
    public String showCategoriesNPlus1() {
        service.printCategoriesAndProducts();
        return "Check logs: N+1 queries executed";
    }
    @GetMapping("/categories/joinfetch")
    public String showCategoriesJoinFetch() {
        service.printCategoriesAndProductsJoinFetch();
        return "Check logs: Single query with JOIN FETCH executed";
    }

}

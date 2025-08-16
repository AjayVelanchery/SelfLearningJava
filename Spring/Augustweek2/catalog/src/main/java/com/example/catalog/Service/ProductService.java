package com.example.catalog.Service;


import com.example.catalog.Entities.Category;
import com.example.catalog.Entities.Product;
import com.example.catalog.dto.category.CategoryDto;
import com.example.catalog.dto.category.CategoryUpdateRequest;
import com.example.catalog.dto.product.ProductCreateRequest;
import com.example.catalog.dto.product.ProductDTO;
import com.example.catalog.dto.product.ProductUpdateRequest;
import com.example.catalog.exception.NotFoundException;
import com.example.catalog.mapper.CategoryMapper;
import com.example.catalog.mapper.ProductMapper;
import com.example.catalog.repository.CategoryRepository;
import com.example.catalog.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
private final ProductRepository products;

private final CategoryRepository categories;


@Transactional
    public ProductDTO create(ProductCreateRequest req){
    Category cat=categories.findById(req.categoryId())
            .orElseThrow(()->new NotFoundException("Category not found"));
            Product p=Product.builder()
                    .name(req.name())
                    .description(req.name())
                    .price(req.price())
                    .stockQuantity(req.stockQuantity())
                    .category(cat)
                    .build();
            return ProductMapper.toDTO(products.save(p));
}
public List<ProductDTO>list(){
    return products.findAll().stream().map(ProductMapper::toDTO).toList();
}
public Product getEntity(Long id)
{
    return products.findById(id).orElseThrow(()->new NotFoundException("Product not found: "+id));
}

    public ProductDTO get(Long id) { return ProductMapper.toDTO(getEntity(id)); }
    @Transactional
    public ProductDTO update(Long id, ProductUpdateRequest req){
        Product c=getEntity(id);
        c.setName(req.name());
        c.setDescription(req.description());
        return ProductMapper.toDTO(products.save(c));
    }

    @Transactional
    public void delete(Long id){
        if(!products.existsById(id)) throw new NotFoundException(("product now found"+id));
        products.deleteById(id);
    }
}

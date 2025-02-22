package dev.harish.productservice.services;

import dev.harish.productservice.dtos.GenericProductDto;
import dev.harish.productservice.exceptions.NotFoundException;
import dev.harish.productservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    GenericProductDto getProductById(Long id) throws NotFoundException;
    GenericProductDto createProduct(GenericProductDto product);
    GenericProductDto deleteProductById (Long id);
    List<GenericProductDto> getAllProducts();
    GenericProductDto updateProductById(GenericProductDto product,Long id);
}

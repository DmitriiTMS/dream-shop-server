package com.example.dream_shop_server.service.product;

import com.example.dream_shop_server.model.Product;
import com.example.dream_shop_server.request.AddProductRequest;
import com.example.dream_shop_server.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long productId);
    void deleteProductById(Long productId);
    Product updateProductById(ProductUpdateRequest request, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}

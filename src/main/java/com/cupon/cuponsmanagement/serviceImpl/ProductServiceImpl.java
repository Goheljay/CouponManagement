package com.cupon.cuponsmanagement.serviceImpl;

import com.cupon.cuponsmanagement.dto.request.CreateProductDto;
import com.cupon.cuponsmanagement.modal.Product;
import com.cupon.cuponsmanagement.repository.ProductRepository;
import com.cupon.cuponsmanagement.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    @Override
    public void saveProduct(CreateProductDto createCouponsDto) {
        Product product = new Product();
        product.setPrice(createCouponsDto.getPrice());
        product.setName(createCouponsDto.getName());

        productRepository.save(product);
    }
}

package com.cupon.cuponsmanagement.service;

import com.cupon.cuponsmanagement.dto.request.CreateProductDto;

public interface ProductService {
    void saveProduct(CreateProductDto createCouponsDto);
}

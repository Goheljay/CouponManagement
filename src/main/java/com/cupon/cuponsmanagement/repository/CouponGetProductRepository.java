package com.cupon.cuponsmanagement.repository;

import com.cupon.cuponsmanagement.modal.Coupon;
import com.cupon.cuponsmanagement.modal.CouponGetProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CouponGetProductRepository extends JpaRepository< CouponGetProduct, Long> {
    Optional<List<CouponGetProduct>> findByCouponId(Coupon coupon);
}

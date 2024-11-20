package com.cupon.cuponsmanagement.repository;

import com.cupon.cuponsmanagement.modal.Coupon;
import com.cupon.cuponsmanagement.modal.CouponBuyProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CouponBuyProductRepository extends JpaRepository<CouponBuyProduct, Long> {
    Optional<List<CouponBuyProduct>> findByCouponId(Coupon coupon);
}
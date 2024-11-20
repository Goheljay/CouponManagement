package com.cupon.cuponsmanagement.repository;

import com.cupon.cuponsmanagement.modal.Coupon;
import com.cupon.cuponsmanagement.modal.CouponBuyProduct;
import com.cupon.cuponsmanagement.modal.CouponProductMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CouponProductRepository extends JpaRepository<CouponProductMapping, Long> {
    Optional<CouponBuyProduct> findByCouponId(Coupon coupon);
}

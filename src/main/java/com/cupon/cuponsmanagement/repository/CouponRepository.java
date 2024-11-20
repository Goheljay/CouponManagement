package com.cupon.cuponsmanagement.repository;

import com.cupon.cuponsmanagement.modal.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Optional<List<Coupon>> findAllByStatusTrue();
    Optional<List<Coupon>> findByTypeLike(String type);
}

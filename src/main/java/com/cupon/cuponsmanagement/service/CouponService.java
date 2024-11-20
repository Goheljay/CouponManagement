package com.cupon.cuponsmanagement.service;

import com.cupon.cuponsmanagement.dto.request.ApplicableRequestDto;
import com.cupon.cuponsmanagement.dto.request.CreateCouponsDto;
import com.cupon.cuponsmanagement.dto.response.ApplicableRespCouponsDto;
import com.cupon.cuponsmanagement.dto.response.ApplyCouponResponseDTO;
import com.cupon.cuponsmanagement.dto.response.CouponDto;

import java.util.List;

public interface CouponService {
    void saveCoupon(CreateCouponsDto createCouponsDto);

    CouponDto getCouponById(Long id);

    List<CouponDto> getAllCoupon();

    List<ApplicableRespCouponsDto> getAllApplicableCoupons(ApplicableRequestDto applicableRequestDto);

    ApplyCouponResponseDTO getAllApplyCoupon(Long couponId, ApplicableRequestDto applicableRequestDto);
}

# Coupon Management

## Type of Coupons we can integrate it.

- Session based coupons
- Periodic Validity Coupons
- Brand-Specific Discounts
- Coupon Stacking: Ability to apply multiple coupons on the same order if allowed.
- Limit Per Customer: Restrict the number of times an individual customer can use the coupon.
- Referral-Based Coupons

The above coupons create need more database tables and more time.

### Implementation
I implement Three types with hard code conditions.
1. Product based Coupon(productBasedCoupon)
2. Cart-wise Coupon(cart-wise)
3. BxGy-wise Coupon(BxGyBasedCoupon)

- ```Post: /coupons``` create coupon.
- ```Get: /coupons``` Get All coupons.
- ```Get: /coupons/{id}``` Get coupon by id.
- ```Post: /applicable-coupons``` Applicable coupons list
- ```Post: apply-coupon/{id}``` Apply specific coupon.

Note: I have not created a separate table for coupon type just hard coded condtion. if we need more coupon types dynamically we can make a CouponType table to handle it.

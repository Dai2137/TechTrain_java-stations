package com.example.coupon;

public class CouponCalculator {
    public String findBestCoupon(int[] cartItems){
        CouponA couponA = new CouponA();
        CouponB couponB = new CouponB();
        CouponC couponC = new CouponC();
        float priceA = couponA.calculate(cartItems);
        float priceB = couponB.calculate(cartItems);
        float priceC = couponC.calculate(cartItems);
        if (priceA <= priceB && priceA <= priceC){
            return "A";
        }else if(priceB <= priceC ){
            return "B";
        }else{
            return "C";
        }
    }
}

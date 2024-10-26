package com.example.coupon;

public class CouponA {
    public float calculate(int[] cartItems){
        float sum_item_prices=0f;
        for (int i=0; i < cartItems.length; i++){
            sum_item_prices += cartItems[i];
        }
        return sum_item_prices;
    }
    
}

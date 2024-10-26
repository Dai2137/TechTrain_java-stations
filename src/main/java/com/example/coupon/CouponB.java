package com.example.coupon;

public class CouponB {
    public float calculate(int[] cartItems){
        float sum_item_prices=0f;
        for (int i=0; i < cartItems.length; i++){
            sum_item_prices += cartItems[i] * 0.9;
        }
        if (sum_item_prices < 5000){
            sum_item_prices += 800;
        }
        return sum_item_prices;
    }
}

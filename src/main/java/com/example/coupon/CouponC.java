package com.example.coupon;

public class CouponC {
    public float calculate(int[] cartItems){
        float sum_item_prices=0f;
        for (int i=0; i < cartItems.length; i++){
            if (cartItems[i]>=2000){
                sum_item_prices += cartItems[i] * 0.8;
            }else{
                sum_item_prices += cartItems[i];
            }
        }
        if (sum_item_prices < 5000){
            sum_item_prices += 800;
        }
        return sum_item_prices;
    }    
}

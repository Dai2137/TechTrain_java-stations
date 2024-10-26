package com.example.station9;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // ここから
        int allprices_couponA = 0, allprices_couponB = 0, allprices_couponC = 0; 
        for (int i=0; i < itemPrices.length; i=i+1){
            allprices_couponA += itemPrices[i];
            allprices_couponB += itemPrices[i] * 0.9;
            if(itemPrices[i] >= 2000){
                allprices_couponC += itemPrices[i]*0.8;
            }else{
                allprices_couponC += itemPrices[i];
            }
        }
        // allprices_couponA = shipdisc(allprices_couponA);
        allprices_couponB = shipplus(allprices_couponB);
        allprices_couponC = shipplus(allprices_couponC);
        if (allprices_couponA <= allprices_couponB && allprices_couponA <=allprices_couponC){
            System.out.println("A");
        }else if(allprices_couponB <= allprices_couponC){
            System.out.println("B");
        }else{
            System.out.println("C");
        }
        // ここまで
    }
    public static int shipplus(int subtotal) {
        // Station 8 問題(1)
        // // ここから
        // if (subtotal < 10000){
        //     System.out.println("送料800円を追加します");
        // }
        int total;
        if (subtotal  < 5000){
            total = subtotal + 800;
        } else{
            total = subtotal;
        }
        // System.out.println(total);
        return total;
        // ここまで
    }        
}

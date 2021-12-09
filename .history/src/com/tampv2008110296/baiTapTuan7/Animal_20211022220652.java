/*
* creted date: 21 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.baiTapTuan7;

public class Animal {
    /**
     *
     */
    private static final String CHÓ_BẮT_MÈO = " Chó bắt mèo";

    String sound; // tên file âm thanh dành cho các loại khác nhau
    
    private String picture;
    private String food;
    private int hunger;
    private String boundaries;
    private int location;
    
    protected void makeNoise(){
       // System.out.println("Phát ra tiếng kêu" + sound);
       System.out.println("Hmm....");
    }
    protected void eat(){
        System.out.println(" Ăn ...");

    }
    protected void sleep(){
        System.out.println(" Ngủ z z z ...");

    }
    protected void roam(){
      System.out.println(" Đi lang thang ....");

    }
    protected void chaseCats(){
        System.out.println(CHÓ_BẮT_MÈO);

    }
    
}

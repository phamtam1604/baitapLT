/*
* creted date: 21 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.baiTapTuan7;

public class Animal {
    String sound; // tên file âm thanh dành cho các loại khác nhau
    
    private String picture;
    private String food;
    private int hunger;
    private int location;
    protected static void makeNoise(){
       // System.out.println("Phát ra tiếng kêu" + sound);
       System.out.println("Hmm....");
    }
    protected void eat(){
        System.out.println(" Ăn ...");

    }
    protected static void sleep(){
        System.out.println(" Ngủ z z z ...");

    }
    protected void roam(){
      System.out.println(" Đi lang thang ....");

    }
    
}

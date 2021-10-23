/*
* creted date: 21 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.baiTapTuan7;

public class Square {
    String sound; // bien objeck
    public Square(){}
    public Square(String s){
        sound = s;
    }
    void rotate(){
        // code xử lý các hình xoay 360

        System.out.println("Xoay quanh 360 độ ");

    }

    void playSound(){
        //code xu ly phat ra am thanh
        System.out.println(" Phát ra âm thanh file am thanh có tên" + sound );

    }
    
}

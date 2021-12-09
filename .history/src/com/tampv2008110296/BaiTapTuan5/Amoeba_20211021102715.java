/*
* creted date: 21 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.BaiTapTuan5;

public class Amoeba {
    String sound; //.hif

    int x;
    int y;

    Amoeba(){}
    public Amoeba(String s){
        sound = s;
    }
    public Amoeba(String s, int xx, int yy){
        sound = s;
        x = xx;
        y = yy;

    }
    void rotate(){
        System.out.println(" Xoay theo tọa độ x =" + x + " và y =" + y);
    }
    void playSound(){
        System.out.println("Phát ra file âm thanh có tên" + sound);
        
    }
}

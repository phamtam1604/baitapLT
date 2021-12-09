/*
* creted date: 21 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.baiTapTuan7;

public class Amoeba {
    String sound; //.hif
    Amoeba(){}
    public Amoeba(String s){
        sound = s;
        public Amoeba(String s, int xx, int yy){
        sound = s;
        x = xx;
        y = yy;
        }
    }
    void rotate(){
        // code xử lý các hình xoay 360

        System.out.println("Xoay quanh 360 độ ");

    }

    void playSound(){
        //code xu ly phat ra am thanh
        //code xử lý .hif
        System.out.prinln(" Phát ra âm thanh file am thanh có tên" + sound );

    }
}

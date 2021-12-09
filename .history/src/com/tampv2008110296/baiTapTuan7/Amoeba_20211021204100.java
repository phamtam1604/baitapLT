/*
* creted date: 21 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.baiTapTuan7;

public class Amoeba {
    String sound; //.hif
    
    int x;
    int y;
}

    Amoeba(){}

    public Amoeba(String s){
        sound = s;
    }
       
    Amoeba(String s, int xx, int yy){
         sound = s;
         x = xx;
         y = yy;
        }
    
    void rotate(){
        // code xử lý các hình xoay 360

        System.out.println("Xoay theo tọa độ x  " + x + " và y = " + y);

    }

    void playSound(){
        //code xu ly phat ra am thanh
        //code xử lý .hif
        System.out.prinln(" Phát ra âm thanh file am thanh có tên" + sound );

    }

    public class String {
    }
}


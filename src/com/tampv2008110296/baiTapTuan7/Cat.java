/*
* creted date: 22 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.baiTapTuan7;

public class Cat extends Animal {

    protected void makeNoise() {
        System.out.println("Con mèo kêu MEO MEO...");

    }
     protected void eat() {
        System.out.println("Con MÈO đang ăn CÁ...");

    }
     protected void sleep() {
        System.out.println("Con MÈO nó đang ngủ z.z.z..");
    }
     protected void roam() {
        System.out.println(" Con Mèo : đi bắt chuột ...");
    
        
    }
     @Override 
         protected void chaseButterfly(){
         
        System.out.println(" Con mèo bắt con bướm ");
    }
}
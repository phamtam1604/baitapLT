/*
* creted date: 29 thg 9, 2021
* author: cgm
*/
package com.tampv2008110296.lab2;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số điện: ");
        float x = in.nextFloat();
        if(x<50)
            System.out.println("Số tiền phải trả là: "+x*1000);
        else
            System.out.println("Số tiền phải trả là: "+(50*1000+(x-50)*1200));
    }
    
}

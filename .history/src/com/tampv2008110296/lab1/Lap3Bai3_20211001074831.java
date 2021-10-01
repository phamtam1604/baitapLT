/*
* creted date: 29 thg 9, 2021
* author: cgm
*/
package com.tampv2008110296.lab1;

import java.util.Scanner;

public class Lap3Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào độ dài cạnh khối lập phương: ");
        int a = in.nextInt();
        System.out.println("Thể tích khối lập phương là: "+Math.pow(a,3));
    }
    
}

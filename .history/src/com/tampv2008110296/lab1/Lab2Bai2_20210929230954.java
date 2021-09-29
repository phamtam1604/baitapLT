/*
* creted date: 29 thg 9, 2021
* author: cgm
*/
package com.tampv2008110296.lab1;

public class Lab2Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào độ dài cạnh đầu tiên: ");
        int a = in.nextInt();
        System.out.print("Nhập vào độ dài cạnh thứ 2: ");
        int b = in.nextInt();
        System.out.println("Chu  vi của hình chữ nhật là: "+(a+b)*2);
        System.out.println("Diện tích của hình chữ nhật là: "+a*b);
        System.out.println("Độ dài cạnh nhỏ nhất là: "+Math.min(a,b));
    }

}

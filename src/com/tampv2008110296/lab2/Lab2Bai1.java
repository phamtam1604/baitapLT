/*
* creted date: 29 thg 9, 2021
* author: cgm
*/
package com.tampv2008110296.lab2;

public class Lab2Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        int a = in.nextInt();
        System.out.print("Nhập vào hệ số b: ");
        int b = in.nextInt();
        if(a==0)
            if(b==0)
                System.out.println("PT có vô số nghiệm.");
            else
                System.out.println("PT vô nghiệm.");
        else
            System.out.println("PT có nghiệm duy nhất: x = "+(-b/a));
    }
    
}

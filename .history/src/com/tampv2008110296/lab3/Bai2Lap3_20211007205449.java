/*
* creted date: 07 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.lab3;

import java.util.Scanner;

public class Bai2Lap3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            for(int i = 1 ; i < 10 ; i++){
                System.out.println();
                for(int j = 1 ; j <= 10 ; j++){
                    System.out.printf("\t%d * %d = %d" , j , i , j*i); 
                }
}
        }
    }
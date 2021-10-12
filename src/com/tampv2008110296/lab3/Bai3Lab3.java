/*
* creted date: 07 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3Lab3 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        NhapMang(n,arr);
        System.out.println("====================================");
        Arrays.sort(arr);
        Xuatmang(n, arr);
        System.out.println("====================================");
        TimPhanTuNhoNhat(n, arr);
        System.out.println("====================================");
        TrungBinhCongSoChiaHetCho3(n, arr);
    }
    public static void NhapMang(int n , int arr[]){
        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhập phần tử thứ " + (i+1) + " của mảng :");
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextInt();
        }
    }
    public static void Xuatmang(int n , int arr[]){
        for(int i = 0 ; i < n ; i++){
            System.out.println("Phần tử thứ " + (i+1) + " của mảng là : " + arr[i]);
        }
    }
    public static void TimPhanTuNhoNhat(int n, int arr[]){
        int min = arr[0];
        for(int i = 0 ; i <n ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là : " + min);
    }
    public static void TrungBinhCongSoChiaHetCho3(int n , int arr[]){
        float Tong = 0 , Dem =0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] % 3 == 0){
                Tong += arr[i];
                Dem +=1;
            }
        }
        System.out.println("Trung bình công các phần tử chia hết cho 3 là : " + (Tong/Dem));
    }
}
    

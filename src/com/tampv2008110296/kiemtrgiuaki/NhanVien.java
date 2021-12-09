/*
* creted date: 04 thg 11, 2021
* author: cgm
*/
package com.tampv2008110296.kiemtrgiuaki;

import java.util.Scanner;

public abstract class NhanVien extends Nguoi {
    
    private static java.lang.String tenNhanVien;
    protected java.lang.String heSoLuong;

    Scanner scanner = new Scanner(System.in);
    private float tinhLuong;
    private java.lang.String luongNhanVien;
    private static long Luong_NV = 1500000;

   
    
    public NhanVien(float tinhLuong) {
        super(tinhLuong, tenNhanVien);
        this.tinhLuong = heSoLuong;
        
    }
     
    public void nhapThongTin() {
        System.out.print("Nhập he so luong: ");
        heSoLuong = scanner.nextLine();
        
    }
    @Override
    public  void tinhLuong(){
        luongNhanVien = Luong_NV * this.tinhLuong;
        
    }
 
    @Override
    public void toString() {
         return super.toString() +", luongNhanVien:" + this.heSoLuong;
    }
}

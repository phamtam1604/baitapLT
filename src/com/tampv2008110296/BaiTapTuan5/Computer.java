/*
* creted date: 12 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.BaiTapTuan5;

public class Computer {
    /*Máy tính
		Nhà sản xuất
		Năm sản xuất
		Hệ điều hành
		Ram
		CPU
		Giá
		Năm bảo hành */
        String nhaSanXuat,heDieuHanh,CPU;
        long gia;
        int namSanXuat,ram,namBaoHanh;
        void computer(String nhSX , String hDH ,String chip ,int nSX,int r ,int nBH, long g){
            nhaSanXuat = nhSX;
            heDieuHanh = hDH;
            CPU = chip;
            namSanXuat = nSX;
            ram = r;
            namBaoHanh = nBH;
            gia = g ;
        }
        void inThongTinMayTinh(){
            System.out.println("Nhà sản xuất : " + nhaSanXuat);
            System.out.println("Năm sản xuất : " + namSanXuat);
            System.out.println("Hệ điều hành : " + heDieuHanh);
            System.out.println("Ram : " + ram + " GB");
            System.out.println("CPU : " + CPU);
            System.out.println("Giá : " + gia);
            System.out.println("Năm bảo hành : " + namBaoHanh);
        }
    }


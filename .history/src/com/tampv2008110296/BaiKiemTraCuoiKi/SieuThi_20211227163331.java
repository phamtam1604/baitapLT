/*
* creted date: 26 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.util.ArrayList;
import java.util.Scanner;

public class SieuThi {
    ArrayList<HangHoa>  DanhSachHangHoa = new ArrayList<HangHoa>();
    
   
    public SieuThi(){
        
    }
    public void ThemHangHoa(HangHoa hh){
        System.out.println("Nhap ho va ten Hang Hóa:");
        hh.getTenHangHoa();
        System.out.println("Don Gia:");
        hh.getDonGia();
        System.out.println(" Nhap so luong ton kho:");
        hh.getSoLuongTonKho();
        System.out.println("Nhap ngay nhap kho:");
        hh.getNgayNhapKho();
        System.out.println("Ma hang hoa (1= SanhSu, 2= DienMay, 3 = ThucPham)");
        hh.getMaHH();
    }

}

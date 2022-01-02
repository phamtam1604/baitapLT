/*
* creted date: 09 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.KiemTraCuoiKi;

import java.util.ArrayList;
import java.util.Scanner;

import com.tampv2008110296.lab1.scanner;

public class DanhSachQuanLy {
    ArrayList<hangHoa> DanhSachHangHoa = new ArrayList<hangHoa>();
    Scanner in = new Scanner(System.in);
    

    void themHangHoa(hangHoa hh){
     System.out.println("Moi nhap ten hang hoa:");
     hh.getTenHang();
     System.out.println(" Moi nhap ma hang:");
     hh.getMaHangHoa();
     System.out.println("Moi nhap ngay nhap kho:");
     hh.getNgayNhapKho();
     System.out.println("Moi nhap don gia:");
     hh.getDonGia();
     System.out.println("Moi nhap so luong ton kho:");
     hh.getSoLuongTonKho();
 
    }
    




}

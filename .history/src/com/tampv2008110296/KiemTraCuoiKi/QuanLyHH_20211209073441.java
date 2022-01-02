/*
* creted date: 06 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.KiemTraCuoiKi;

import java.util.ArrayList;
import java.util.Scanner;

import com.tampv2008110296.BaiKt.DanhSachQuanLy;
import com.tampv2008110296.test.main;

public class QuanLyHH {
        ArrayList<HangHoa> DanhSachHangHoa = new ArrayList<HangHoa>();
        Scanner input = new Scanner(System.in);
        static void themHangHoa(HangHoa hh){
           System.out.println(" Nhập tên hàng hóa:"); 
           hh.getTenHang();
           System.out.println("Nhập giá:");
           hh.getDonGia();
           System.out.println("Nhập số lượng tồn kho:");
           hh.getSoLuongTonKho();
           System.out.println("Ngày nhập kho");
           hh.getNgayNhapKho();
           DanhSachHangHoa.add(hh);
        
    }
    
}

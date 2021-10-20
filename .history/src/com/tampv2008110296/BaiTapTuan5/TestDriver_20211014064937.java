/*
* creted date: 12 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.BaiTapTuan5;

import java.util.Comparator;

import com.tampv2008110296.BaiTapTuan5.Book.book;

public class TestDriver {
    public static void main(String[] args) {
        book sach = new book();
        sach.nhapThongTinSach();
        sach.xuatThongTinSach();
        System.out.println("==========================================================");
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.nhapThongTinNhanVien();
        nhanVien1.xuatThongTinNhanVien();
        System.out.println("==========================================================");
        Call xeMoi = new Call("khanh","honda","phoThong",true,110);
        xeMoi.inThongTinXe();
        System.out.println("==========================================================");
        Comparator mayTinhMoi = new Compiler();
        mayTinhMoi.inThongTinMayTinh();
        System.out.println("==========================================================");
        account taiKhoanMoi = new account("khanh", 121212, 50000);
        taiKhoanMoi.deposite(200000);
        taiKhoanMoi.Withdraw(20000);
        taiKhoanMoi.Show_Balance();
        System.out.println("==========================================================");
        Cow boCon = new Cow();
        boCon.keu();
        boCon.an();
        System.out.println("==========================================================");
    }
    
}

/*
* creted date: 04 thg 11, 2021
* author: cgm
*/
package com.tampv2008110296.kiemtrgiuaki;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy ds = new DanhSachQuanLy();
        HocVien sv = new HocVien();
        sv.setDiemMonHoc1(5);
        sv.setDiemMonHoc2(6);
        sv.setHoTen("a");
        sv.setDiaChi("dia chi o dau");
        sv.setSoLuongHV(20);
        ds.them(sv);

        NhanVien nv = new NhanVien();
        nv.setHeSoLuong(5);
        nv.setHoTen("B");
        nv.setDiaChi("dia chi");
        ds.them(nv);
        
        KhachHang kh = new KhachHang();
        kh.setTenCongTy("mb");
        kh.setTriGiaDonHang(1000);
        kh.setHoTen(" C");
        kh.setDiaChi("dia chi");
        ds.them(kh);
        ds.inDanhSach();





    }
    
}

/*
* creted date: 14 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.util.Scanner;

public class SanhSu extends HangHoa {

    public SanhSu(String tenHangHoa, int maHH, int donGia, String ngayNhapKho, int soLuongTonKho, Scanner in) {
        super(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho, in);
    }

    @Override
    public int getDonGia() {
        return super.getDonGia();
    }

    @Override
    public int getMaHH() {
        return super.getMaHH();
    }

    @Override
    public String getNgayNhapKho() { 
        return super.getNgayNhapKho();
    }

    @Override
    public int getSoLuongTonKho() {
        return super.getSoLuongTonKho();
    }

    @Override
    public String getTenHangHoa() {
        return super.getTenHangHoa();
    }
     
    
}
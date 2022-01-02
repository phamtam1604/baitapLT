/*
* creted date: 23 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.util.Scanner;

public class ThucPham extends HangHoa {

    public ThucPham(String tenHangHoa, int maHH, int donGia, String ngayNhapKho, int soLuongTonKho, Scanner in) {
        super(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho, in);
    }

    @Override
    public int getDonGia() {
        // TODO Auto-generated method stub
        return super.getDonGia();
    }

    @Override
    public int getMaHH() {
        // TODO Auto-generated method stub
        return super.getMaHH();
    }

    @Override
    public String getNgayNhapKho() {
        // TODO Auto-generated method stub
        return super.getNgayNhapKho();
    }

    @Override
    public int getSoLuongTonKho() {
        // TODO Auto-generated method stub
        return super.getSoLuongTonKho();
    }

    @Override
    public String getTenHangHoa() {
        // TODO Auto-generated method stub
        return super.getTenHangHoa();
    }

    @Override
    public void setDonGia(int donGia) {
        // TODO Auto-generated method stub
        super.setDonGia(donGia);
    }

    @Override
    public void setMaHH(int maHH) {
        // TODO Auto-generated method stub
        super.setMaHH(maHH);
    }

    @Override
    public void setNgayNhapKho(String ngayNhapKho) {
        // TODO Auto-generated method stub
        super.setNgayNhapKho(ngayNhapKho);
    }

    @Override
    public void setSoLuongTonKho(int soLuongTonKho) {
        // TODO Auto-generated method stub
        super.setSoLuongTonKho(soLuongTonKho);
    }

    @Override
    public void setTenHangHoa(String tenHangHoa) {
        // TODO Auto-generated method stub
        super.setTenHangHoa(tenHangHoa);
    }
 
}

/*
* creted date: 25 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.sql.Date;
import java.util.Scanner;

public class DienMay extends HangHoa{

    public DienMay(String tenHangHoa, int maHH, int donGia, String ngayNhapKho, int soLuongTonKho, Scanner in) {
        super();
    }

    public DienMay(String tenHangHoa, String maHH, int donGia, String ngayNhapKho, int soLuongTonKho) {
    }

    @Override
    public long getDonGia() {
       
        return super.getDonGia();
    }

    @Override
    public String getMaHH() {
       
        return super.getMaHH();
    }

    @Override
    public Date getNgayNhapKho() {
      
        return super.getNgayNhapKho();
    }

    @Override
    public int getSoLuongTonKho() {
       
        return super.getSoLuongTonKho();
    }

    @Override
    public String gettenHangHoa() {
        
        return super.gettenHangHoa();
    }

    
    
}

/*
* creted date: 23 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.sql.Date;

public class ThucPham extends HangHoa {

         
    

    public ThucPham(String tenHangHoa, String maHH, long donGia, Date ngayNhapKho, int soLuongTonKho) {
        super(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho);
    }

    public ThucPham(String tenHangHoa, String maHH, String string, String string2, String string3) {
       
    }

    public ThucPham(String tenHangHoa, String maHH, int donGia, String ngayNhapKho, int soLuongTonKho) {
    }

    @Override
    public String toString() {
        return "ThucPham []";
    }

    
    }
 


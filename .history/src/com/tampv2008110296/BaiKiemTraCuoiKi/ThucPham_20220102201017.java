/*
* creted date: 23 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.ParseException;

public class ThucPham extends HangHoa {

       private Date hanSanXuat;

    public ThucPham(String tenHangHoa, String maHH, long donGia, java.util.Date ngayNhapKho, int soLuongTonKho,
            Date hanSanXuat) throws ParseException {
        super(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho);
        this.hanSanXuat = hanSanXuat;
    }

    public Date getHanSanXuat() {
        return hanSanXuat;
    }

    public void setHanSanXuat(Date hanSanXuat) {
        this.hanSanXuat = hanSanXuat;
    }

    DecimalFormat ft = new DecimalFormat("###,###,### VND");

    @Override
    public String toString() {
        return "ThucPham [ft=" + ft + ", hanSanXuat=" + hanSanXuat + "]";
    }
    
}
    
    

   
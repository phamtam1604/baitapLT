/*
* creted date: 14 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class SanhSu extends HangHoa {
   
    private String noiSanXuat;

    public SanhSu(String tenHangHoa, String maHH, long donGia, java.util.Date ngayNhapKho, int soLuongTonKho,
            String noiSanXuat) throws ParseException {
        super(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho);
        this.noiSanXuat = noiSanXuat;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    DecimalFormat ft = new DecimalFormat("###,###,### VND");

    @Override
    public String toString() {
        return "SanhSu [ft=" + ft + ", noiSanXuat=" + noiSanXuat + "]";
    }    
}

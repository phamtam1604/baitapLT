/*
* creted date: 25 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DienMay extends HangHoa{

   private int congSuat;

public DienMay(String tenHangHoa, String maHH, long donGia, String ngayNhapKho, int soLuongTonKho, int congSuat)
        throws ParseException {
    super("HDM-" + tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho);
    this.congSuat = congSuat;
}

public int getCongSuat() {
    return congSuat;
}

public void setCongSuat(int congSuat) {
    this.congSuat = congSuat;
}

DecimalFormat ft = new DecimalFormat("##### W");
DecimalFormat ft1 = new DecimalFormat("###,###,### VND");

@Override
public String toString() {
    return "DienMay [congSuat=" + congSuat + ", ft=" + ft + ", ft1=" + ft1 + "]";
}
   

    
    
}

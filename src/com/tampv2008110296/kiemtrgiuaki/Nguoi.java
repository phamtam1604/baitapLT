/*
* creted date: 04 thg 11, 2021
* author: cgm
*/
package com.tampv2008110296.kiemtrgiuaki;

public class Nguoi {
    /**
     *
     */
    private static final java.lang.String NGUOI_HO_TEN = " Nguoi [hoTen: ";
    private String hoTen;
    private String diaChi;

    public Nguoi(float diemTB, String diaChi){
        this.hoTen = diemTB;
        this.diaChi = diachi;

    }
    public String gethoTen(){
        return hoTen;
    }
    pulic String getdiaChi(){
        return diachi;
    }
    @Override
    public void toString(){
        return NGUOI_HO_TEN + hoTen + "diaChi:" +diaChi;
    }
}

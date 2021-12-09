/*
* creted date: 04 thg 11, 2021
* author: cgm
*/
package com.tampv2008110296.kiemtrgiuaki;

public abstract class HocVien extends Nguoi {
    private static Object soLuongHV;
    float diemMonHoc1;
    float diemMonHoc2;
    static int soLuongHV;
     public HocVien(float diemTB, String toString){
        super(diemTB, "HocVien");
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
        this.soLuongHV = soLuongHV;
        
    }
    public double getDiem(){
        return ((diemMonHoc1) + diemMonHoc2)/2;
    }
    @Override
    public void toString() {
        return ;
    }
}

/*
* creted date: 09 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.KiemTraCuoiKi;

public class DienMay extends hangHoa {
    private String MaDm, loai;
    public DienMay(){
        super();
        this.MaDm="";
        this.loai="";
    }
    
    public DienMay(String tenHang, double donGia, double soLuongTonKho, String ngayNhapKho, String maDm, String loai) {
        super(tenHang, donGia, soLuongTonKho, ngayNhapKho);
        MaDm = maDm;
        this.loai = loai;
    }

    public String getMaDm() {
        return MaDm;
    }

    public void setMaDm(String maDm) {
        MaDm = maDm;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    public void nhap(){
        super.nhap();
        System.out.println("Ma dien may:");
        MaDm = in.nextLine();
        System.out.println("Loai:");
        loai= in.nextLine();
    }

    @Override
    public String toString() {
        return "DienMay [MaDm=" + MaDm + ", loai=" + loai + "]";
    }
    
}

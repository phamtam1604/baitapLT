/*
* creted date: 09 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.KiemTraCuoiKi;



public class SanhSu extends hangHoa {
    private String Loai, maHH;


    public SanhSu(){
         super();
        this.Loai="";
        this.maHH="";

        }


    public SanhSu(String tenHang, double donGia, double soLuongTonKho, String ngayNhapKho, String loai, String maHH) {
        super(tenHang, donGia, soLuongTonKho, ngayNhapKho);
        Loai = loai;
        this.maHH = maHH;
    }


    public String getLoai() {
        return Loai;
    }


    public void setLoai(String loai) {
        Loai = loai;
    }


    public String getMaHH() {
        return maHH;
    }


    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhap ma hang");
        maHH = in.next();
        System.out.println("Nhap loai");
        Loai = in.next();

    }


    @Override
    public String toString() {
        return "SanhSu [Loai=" + Loai + ", maHH=" + maHH + "]";
    }
}
    


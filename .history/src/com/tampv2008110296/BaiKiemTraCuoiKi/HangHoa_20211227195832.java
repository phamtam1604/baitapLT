  /*
* creted date: 14 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import com.tampv2008110296.lab1.scanner;

public class HangHoa {
    private String tenHangHoa;
    private int maHH;
    private int donGia;
    private String ngayNhapKho;
    private int soLuongTonKho;

    Scanner in = new Scanner(System.in);

    

    public HangHoa() {
       this.tenHangHoa="";
       this.donGia=0;
       this.maHH=0;
       this.soLuongTonKho=0;
       this.ngayNhapKho="";
    }


    public HangHoa(String tenHangHoa, int maHH, int donGia, String ngayNhapKho, int soLuongTonKho, Scanner in) {
        this.tenHangHoa = tenHangHoa;
        this.maHH = maHH;
        this.donGia = donGia;
        this.ngayNhapKho = ngayNhapKho;
        this.soLuongTonKho = soLuongTonKho;
        this.in = in;
    }





    public String getTenHangHoa() {
        return tenHangHoa;
    }
    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }
    public int getMaHH() {
        return maHH;
    }
    public void setMaHH(int maHH) {
        this.maHH = maHH;
    }
    public int getDonGia() {
        return donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public String getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(String ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }


    public void nhap(){
        
        System.out.println("Nhập tên hàng hóa:");
         tenHangHoa = in.next();
        System.out.println("Đơn Giá:");
        donGia = in.nextInt();
        System.out.println("Nhập số lượng tồn kho:");
        soLuongTonKho = in.nextInt();
        System.out.println("Ngày nhập kho:");
        ngayNhapKho = in.next();
        System.out.println("Mã hàng hóa (1= SanhSu, 2= DienMay, 3 = ThucPham)");
        maHH = in.nextInt();
    }

    @Override
    public String toString() {

        String hang;
        if(maHH==1)
         hang = "Sanh Su";
      else if(maHH==2)
           hang = "Dien May";
        else 
            hang = "Thuc Pham";
         
        return "HangHoa [donGia=" + donGia + ", maHH=" + maHH + ", ngayNhapKho=" + ngayNhapKho + ", soLuongTonKho="
                + soLuongTonKho + ", tenHangHoa=" + tenHangHoa + "]";
    }
    

    


    

    
}

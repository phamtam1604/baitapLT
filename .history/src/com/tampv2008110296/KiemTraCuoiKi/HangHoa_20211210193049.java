/*
* creted date: 09 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.KiemTraCuoiKi;

import java.util.Calendar;
import java.util.Scanner;
 
import java.text.SimpleDateFormat;

public class hangHoa {
    String tenHang;
    private double donGia;
    private double soLuongTonKho;
    private String ngayNhapKho;
    Scanner in =new Scanner(System.in);
    
    public hangHoa(){
         super();
    }

    protected hangHoa(String tenHang, double donGia, double soLuongTonKho, String ngayNhapKho) {
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuongTonKho = soLuongTonKho;
        this.ngayNhapKho = ngayNhapKho;
    }
    
    

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(double soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public String getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(String ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    
    protected void nhap()
    {
        System.out.println("Nhap ten hang hoa:");
        tenHang = in.next();
        System.out.println("Nhap gia hang hoa:");
        donGia = in.nextDouble();
        System.out.println("Nhap so luong ton kho:");
        soLuongTonKho = in.nextInt();
        System.out.println("Nhap ngay nhap kho:");
        ngayNhapKho = in.next();
    }

    @Override
    public String toString() {
        return "hangHoa [donGia=" + donGia + ", in=" + in + ", ngayNhapKho=" + ngayNhapKho
                + ", soLuongTonKho=" + soLuongTonKho + ", tenHang=" + tenHang + "]";
    }

    
    }
    


    
    
    
    
    

        
    


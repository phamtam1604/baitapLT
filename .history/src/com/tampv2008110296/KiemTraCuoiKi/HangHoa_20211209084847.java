/*
* creted date: 09 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.KiemTraCuoiKi;

import java.util.Scanner;

public class hangHoa {
    private String tenHang;
    private int maHangHoa;
    private double donGia;
    private double soLuongTonKho;
    private String ngayNhapKho;
    Scanner in =new Scanner(System.in);
    
    public hangHoa(){

    }

    protected hangHoa(String tenHang, int maHangHoa, double donGia, double soLuongTonKho, String ngayNhapKho) {
        this.tenHang = tenHang;
        this.maHangHoa = maHangHoa;
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

    public int getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(int maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
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
        System.out.println("Nhap ma hang hoa:");
        maHangHoa = in.nextInt();
        System.out.println("Nhap gia hang hoa:");
        donGia = in.nextDouble();
        System.out.println("Nhap so luong ton kho:");
        soLuongTonKho = in.nextInt();
        System.out.println("Nhap ngay nhap kho:");
        ngayNhapKho = in.next();
    }

    @Override
    public String toString() {
        return "hangHoa [donGia=" + donGia + ", in=" + in + ", maHangHoa=" + maHangHoa + ", ngayNhapKho=" + ngayNhapKho
                + ", soLuongTonKho=" + soLuongTonKho + ", tenHang=" + tenHang + "]";
    }
    
    
    
    

        
    
}

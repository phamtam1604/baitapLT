  /*
* creted date: 14 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

import com.tampv2008110296.lab1.scanner;

public class HangHoa {
    private String tenHangHoa;
    private String maHH;
    private long donGia;
    private Date ngayNhapKho;
    private int soLuongTonKho;

    
    public HangHoa(String tenHangHoa, String maHH, long donGia2, String ngayNhapKho, int soLuongTonKho2) throws ParseException {
        this.tenHangHoa = tenHangHoa;
        this.maHH = maHH;
        this.donGia = donGia;
        this.ngayNhapKho = chuyenChuoiSangNgay(ngayNhapKho);
        this.soLuongTonKho = soLuongTonKho2;
    }

   
   

    // phương thức tính tiền 
    public long tinhTien(){
        return(long)(getSoLuongTonKho()*getDonGia());
    }
    // phuong thuc get and set
    public String getTenHangHoa() {
        return tenHangHoa;
    }
    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }
    public String getMaHH() {
        return maHH;
    }
    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }
    public long getDonGia() {
        return donGia;
    }
    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public static String chuyenNgaySangChuoi(Date date){
        String chuoiNgayViet = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        chuoiNgayViet =  simpleDateFormat.format(date);
        return chuoiNgayViet;
    }
    
    public static Date chuyenChuoiSangNgay(String chuoiNgay) throws ParseException{
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(chuoiNgay);
        return date;
    }
    
    DecimalFormat ft = new DecimalFormat("###,###,### VND");


    @Override
    public String toString() {
        return "HangHoa [donGia=" + donGia + ", ft=" + ft + ", maHH=" + maHH + ", ngayNhapKho=" + ngayNhapKho
                + ", soLuongTonKho=" + soLuongTonKho + ", tenHangHoa=" + tenHangHoa + "]";
    }


  
   



    


    

    
}

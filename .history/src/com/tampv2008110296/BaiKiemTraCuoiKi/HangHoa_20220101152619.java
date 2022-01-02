  /*
* creted date: 14 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.sql.Date;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import com.tampv2008110296.lab1.scanner;

public class HangHoa {
    private String tenHangHoa;
    private String maHH;
    private long donGia;
    private Date ngayNhapKho;
    private int soLuongTonKho;

    public HangHoa() {  
    }

   
        
    public HangHoa(String tenHangHoa, String maHH, long donGia, Date ngayNhapKho, int soLuongTonKho) {
        this.tenHangHoa = tenHangHoa;
        this.maHH = maHH;
        this.donGia = donGia;
        this.ngayNhapKho = ngayNhapKho;
        this.soLuongTonKho = soLuongTonKho;
    }


    // phương thức set and get


    public String gettenHangHoa() {
        return tenHangHoa;
    }
    public void settenHangHoa(String tenHnagHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getMaHH() {
        return maHH;
    }
    public void setMaHH(String MaHH) {
        this.maHH = MaHH;
    }
    public long getDonGia() {
        return donGia;
    }
    public void setDonGia(long string) {
        this.donGia = string;
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
   
    // phương thức tính tiền 
    public long tinhTien(){
        return(long)(getSoLuongTonKho()*getDonGia());
    }

    @Override
    public String toString() {

        return "HangHoa [donGia=" + donGia + ", maHH=" + maHH + ", ngayNhapKho=" + ngayNhapKho + ", soLuongTonKho="
                + soLuongTonKho + ", tenHangHoa=" + tenHangHoa + "]";
    }



    


    

    
}

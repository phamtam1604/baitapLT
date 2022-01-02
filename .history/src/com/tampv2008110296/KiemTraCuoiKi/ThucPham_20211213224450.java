/*
* creted date: 10 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.KiemTraCuoiKi;



public class ThucPham extends hangHoa{
    private String MaTP, loai;
   

    public ThucPham(){
       super();
       this.MaTP="";
       this.loai="";

    }


    public ThucPham(String tenHang, double donGia, double soLuongTonKho, String ngayNhapKho, String maTP, String loại) {
        super(tenHang, donGia, soLuongTonKho, ngayNhapKho);
        this.MaTP = MaTP;
        this.loai = loai;
    }
    

    
    
}

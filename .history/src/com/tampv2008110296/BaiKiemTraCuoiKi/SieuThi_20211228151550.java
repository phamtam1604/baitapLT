/*
* creted date: 26 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.security.PublicKey;
import java.util.ArrayList;


import com.tampv2008110296.lab1.scanner;

public class SieuThi {
    private ArrayList<HangHoa> danhSach;
    public SieuThi(){
        danhSach = new ArrayList<>();
    }
     
    public ArrayList<HangHoa> getDanhSach(){
        return danhSach;
    }
    public void setDanhSach(ArrayList<HangHoa> danhSach) {
        this.danhSach = danhSach;
    }
// them hang hoa
    public void add(HangHoa hanghoa){
        danhSach.add(hanghoa);
    }
// xóa hàng hóa















// in danh sach hàng hóa
    public void inDanhSach(){
        for (HangHoa hanghoa : danhSach) {

            System.out.println(hanghoa.toString());
            
        }
    }
}

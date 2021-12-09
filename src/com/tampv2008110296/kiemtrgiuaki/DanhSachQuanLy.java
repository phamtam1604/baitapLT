/*
* creted date: 04 thg 11, 2021
* author: cgm
*/
package com.tampv2008110296.kiemtrgiuaki;

public class DanhSachQuanLy {
    private ArrayList<Nguoi> danhSach = new ArrayList<Nguoi>();
    public void them(Nguoi nguoi){
        this.danhSach.add(nguoi);
    }
    public void inDanhSach(){
        System.out.println(danhSach);
    }

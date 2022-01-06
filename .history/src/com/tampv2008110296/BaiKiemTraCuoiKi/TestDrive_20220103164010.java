/*
* creted date: 31 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.text.ParseException;
import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) throws ParseException {
        int luaChon = 0;
        Scanner  sc = new Scanner(System.in);
        SieuThi st = new SieuThi();

    HangHoa hh1 = new ThucPham("Thịt Heo", "01", 80000, "02/12/2021", 29, "10/12/2021");
    HangHoa hh2 = new ThucPham("Rau cải", "02", 20000, "01/12/2021", 10, "07/12/2021");
    HangHoa hh3 = new ThucPham("Thịt Bò", "03", 120000, "04/12/2021", 5, "12/12/2021");
    HangHoa hh4 = new ThucPham("Cam", "04", 23000, "07/12/2021", 100, "09/12/2021");
    HangHoa hh5 = new ThucPham("Mì gói", "05", 5000, "02/12/2021", 90, "31/01/2022");
    HangHoa hh6 = new ThucPham("Trứng gà", "06", 80000, "02/12/2021", 29, "31/01/2022");

    HangHoa hh7 = new SanhSu("Đèn sư", "01", 350000, "15/12/2021", 10, "Bát tràng");
    HangHoa hh8 = new SanhSu("Bình hoa", "02", 400000, "14/12/2021", 5, "Chu Đậu - Hải Dương");
    HangHoa hh9 = new SanhSu("Tiểu sành", "03", 500000, "16/12/2021", 2, "Phù lãng - Bắc Ninh");
    HangHoa hh10 = new SanhSu("Lu", "04", 600000, "11/12/2021", 20, "Thổ Hà");
    HangHoa hh11 = new SanhSu("Nồi đất", "05", 50000, "10/12/2021", 20, "Nghệ An");
    HangHoa hh12 = new SanhSu("Chén", "06", 10000, "19/12/2021", 40, "Bát tràng");

    HangHoa hh13 = new DienMay("Quạt", "01", 200000, "01/12/2021", 12, 100);
    HangHoa hh14 = new DienMay("Tivi", "02", 20000000, "19/12/2021", 5, 2000);
    HangHoa hh15 = new DienMay("Máy giặt", "03", 800000, "20/12/2021", 9, 700);
    HangHoa hh16 = new DienMay("Đèn học", "04", 20000, "21/12/2021", 19, 100);
    HangHoa hh17 = new DienMay("Máy xay sinh tố", "05", 1000000, "25/12/2021", 12, 1000);
    HangHoa hh18 = new DienMay("Máy sấy tóc", "06", 44000, "01/12/2021", 16, 500);

    // thêm hàng hóa vào danh sách
    st.themHangHoa(hh1);
    st.themHangHoa(hh2);
    st.themHangHoa(hh3);
    st.themHangHoa(hh4); 
    st.themHangHoa(hh5);
    st.themHangHoa(hh6);
    st.themHangHoa(hh7);
    st.themHangHoa(hh8);
    st.themHangHoa(hh9);
    st.themHangHoa(hh10);
    st.themHangHoa(hh11);
    st.themHangHoa(hh12);
    st.themHangHoa(hh13);
    st.themHangHoa(hh14);
    st.themHangHoa(hh15);
    st.themHangHoa(hh16);
    st.themHangHoa(hh17);
    st.themHangHoa(hh18);
    
    while(luaChon != 16)
        System.out.println("================================================");
        System.out.println(" Ho Ten : Pham Van Tam - K14DCATTT - 2008110296");
        System.out.println(" Giang vien huong dan: Le Huynh Phuoc");
        System.out.println("=============================================");
        System.out.println("HE THONG QUAN LY SAN PHAM");
        System.out.println("Mời bạn nhập lựa chọn?");
        System.out.println("==========MENU==========");
        System.out.println("1. Them, Sua, Xoa hang hoa");
        System.out.println("2. Tim kiem");
        System.out.println("3. Sap xep hang hoa tang dan");
        System.out.println("4. Sắp xếp hang hoa giam dan");
        System.out.println("5. Thong ke hang hoa");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("============================================");
    luaChon = sc.nextInt();
    switch(luaChon){
        case 1: {
            System.out.println("1.1 Them hang hoa: ");
            System.out.println("1.2 Sua hang hoa: ");
            System.out.println("1.3 Xoa hang hoa");
            System.out.println("1.4 0. Thoat");
            System.out.println("Vui long nhap lua chon:");
            luaChon = sc.nextInt();
            
            switch(luaChon){
                case 1 : st.themHangHoa();break;
                case 2 : st.suaHangHoa();break;
                case 3 : st.xoaHangHoa();break;
                default : break;
            }
            break;
        }
        
    }
  }  
}
     


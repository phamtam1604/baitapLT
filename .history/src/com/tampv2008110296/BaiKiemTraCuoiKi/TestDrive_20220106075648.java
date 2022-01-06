/*
* creted date: 31 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.text.ParseException;
import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) throws ParseException {
       int luaChon =0;
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
    
    int chon = 0;
   
        System.out.println("|===========================================================|");
        System.out.println("|                  TRUONG DAI HOC GIA DINH                  |");
        System.out.println("|       Ho Ten : Pham Van Tam - K14DCATTT - 2008110296      |");
        System.out.println("|       Giang vien huong dan: Le Huynh Phuoc                |");
        System.out.println("|===========================================================|");
        do{
        
        System.out.println("|                   HE THONG QUAN LY SAN PHAM               |");
        System.out.println("|                    ==========MENU==========               |");
        System.out.println("|               1. Them hang hoa vao danh sach              |");
        System.out.println("|               2. Xoa hang hoa vao danh sach               |");
        System.out.println("|               3. Sua hang hoa vao danh sach               |");
        System.out.println("|               4. Tim kiem hang theo loai                  |");
        System.out.println("|               5. Sap xep hang hoa giam dan theo gia       |");
        System.out.println("|               6. Sap xep hang hoa tang dan theo gia       |");
        System.out.println("|               7. Sap xep hang hoa giam dan theo ngay      |");
        System.out.println("|               8. Sap xep hang hoa tang dan theo ngay      |");
        System.out.println("|               9. Thong ke hang hoa                        |");
        System.out.println("|               10. Thong ke tung loại hang hoa             |");
        System.out.println("|               11. Thong ke tong hang hoa                  |");
        System.out.println("|               0. Thoat chuong trinh                       |");
        System.out.println("|           ============================================    |");
        System.out.println("|               Mời bạn nhập lựa chọn?                      |");   
        luaChon = sc.nextInt();
    
    switch(chon){
        
        case 1: st.themHangHoa();break;
        case 2: st.xoaHangHoa();break;
        case 3: st.suaHangHoa();break;
        case 4: st.timKiemTheoLoai();break;
        case 5: st.sapXepHangHoaGiamDanTheoGia();break;
        case 6: st.sapXepHangHoaTangDanTheoGia();break;
        case 7: st.sapXepHangHoaGiamDanTheoNgay();break;
        case 8: st.sapXepHangHoaTangDanTheoNgay();break;
        case 9: st.thongKeTongHangHoa();break;
        case 10: st.thongKeTheoLoaiHangHoa();;break;
        case 11: st.thongKeTongHangHoa();break;
        default : break;
       }        
    } while (chon !=0);
 }
}
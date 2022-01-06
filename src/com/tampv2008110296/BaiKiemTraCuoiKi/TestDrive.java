/*
* creted date: 31 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.text.ParseException;
import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) throws  ParseException {
       int luaChon =0;
        Scanner sc = new Scanner(System.in);
        SieuThi st = new SieuThi();

    HangHoa sp1 = new ThucPham("Thit Heo", "01", 80000, "02/12/2021", 29, "10/12/2021");
    HangHoa sp2 = new ThucPham("Rau cai", "02", 20000, "01/12/2021", 10, "07/12/2021");
    HangHoa sp3 = new ThucPham("Thit Bo", "03", 120000, "04/12/2021", 5, "12/12/2021");
    HangHoa sp4 = new ThucPham("Cam", "04", 23000, "07/12/2021", 100, "09/12/2021");
    HangHoa sp5 = new ThucPham("Mi goi", "05", 5000, "02/12/2021", 90, "31/01/2022");
    HangHoa sp6 = new ThucPham("Trung ga", "06", 80000, "02/12/2021", 29, "31/01/2022");

    HangHoa sp7 = new SanhSu("Đen su", "01", 350000, "15/12/2021", 10, "Bát tràng");
    HangHoa sp8 = new SanhSu("Binh hoa", "02", 400000, "14/12/2021", 5, "Chu Đậu - Hải Dương");
    HangHoa sp9 = new SanhSu("Tieu sanh", "03", 500000, "16/12/2021", 2, "Phù lãng - Bắc Ninh");
    HangHoa sp10 = new SanhSu("Lu", "04", 600000, "11/12/2021", 20, "Thổ Hà");
    HangHoa sp11 = new SanhSu("Noi đat", "05", 50000, "10/12/2021", 20, "Nghệ An");
    HangHoa sp12 = new SanhSu("Chen", "06", 10000, "19/12/2021", 40, "Bát tràng");

    HangHoa sp13 = new DienMay("Quat", "01", 200000, "01/12/2021", 12, 100);
    HangHoa sp14 = new DienMay("Tivi", "02", 20000000, "19/12/2021", 5, 2000);
    HangHoa sp15 = new DienMay("May giat", "03", 800000, "20/12/2021", 9, 700);
    HangHoa sp16 = new DienMay("Đen hoc", "04", 20000, "21/12/2021", 19, 100);
    HangHoa sp17 = new DienMay("May xay sinh to", "05", 1000000, "25/12/2021", 12, 1000);
    HangHoa sp18 = new DienMay("May say toc", "06", 44000, "01/12/2021", 16, 500);

    // thêm hàng hóa vào danh sách
    st.themHangHoa(sp1);
    st.themHangHoa(sp2);
    st.themHangHoa(sp3);
    st.themHangHoa(sp4); 
    st.themHangHoa(sp5);
    st.themHangHoa(sp6);
    st.themHangHoa(sp7);
    st.themHangHoa(sp8);
    st.themHangHoa(sp9);
    st.themHangHoa(sp10);
    st.themHangHoa(sp11);
    st.themHangHoa(sp12);
    st.themHangHoa(sp13);
    st.themHangHoa(sp14);
    st.themHangHoa(sp15);
    st.themHangHoa(sp16);
    st.themHangHoa(sp17);
    st.themHangHoa(sp18);
    
    
       
        System.out.println("|===========================================================|");
        System.out.println("|                  TRUONG DAI HOC GIA DINH                  |");
        System.out.println("|       Ho Ten : Pham Van Tam - K14DCATTT - 2008110296      |");
        System.out.println("|       Giang vien huong dan: Le Huynh Phuoc                |");
        System.out.println("|===========================================================|");
        
        do {
        System.out.println("|                   HE THONG QUAN LY SAN PHAM               |");
        System.out.println("|                    ==========MENU==========               |");
        System.out.println("|               1. Them hang hoa vao danh sach              |");
        System.out.println("|               2. Xoa hang hoa vao danh sach               |");
        System.out.println("|               3. Sua hang hoa vao danh sach               |");
        System.out.println("|               4. Tim kiem hang theo loai                  |");
        System.out.println("|               5. Sap xep hang hoa giam dan theo gia       |");
        System.out.println("|               6. Sap xep hang hoa tang dan theo gia       |");
        System.out.println("|               7. Sap xep hang hoa giam dan theo ngay      |");
        System.out.println("|          8. Sap Xep Tang Dan Theo Loai Va Theo Ngay Nhap  |");
        System.out.println("|          9. Sap Xep Giam Dan Theo Loai Va Theo Ngay Nhap  |");
        System.out.println("|               10. Thong tong hang hoa va chi phi          |");
        System.out.println("|               0. Thoat chuong trinh                       |");
        System.out.println("|           ============================================    |");
        System.out.println("\nMoi ban nhap lua chon? ");   
        luaChon = sc.nextInt();
        switch(luaChon){
        case 1: st.themHangHoa();break;
        case 2: st.xoaHangHoa();break;
        case 3: st.suaHangHoa();break;
        case 4: st.timKiemTheoLoai();break;
        case 5: st.sapXepHangHoaGiamDanTheoGia();break;
        case 6: st.sapXepHangHoaTangDanTheoGia();break;
        case 7: st.sapXepHangHoaGiamDanTheoNgay();break;
        case 8: st.SapXepTangDanTheoLoaiVaTheoNgayNhap();
        case 9: st.SapXepGiamDanTheoLoaiVaTheoNgayNhap();
        case 10: st.thongKeTongHangHoa();;break;
        default : break;
       }        
    } while (luaChon != 0);
 }
}
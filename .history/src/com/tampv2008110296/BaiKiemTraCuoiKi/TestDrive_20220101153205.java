/*
* creted date: 31 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        int luaChon = 0;
        Scanner  sc = new Scanner(System.in);
        SieuThi st = new SieuThi();


    //  hàng thực phẩm   
    HangHoa hh1 = new ThucPham("Thit Heo","01","75000","31/12/2021", "5");
    HangHoa hh2 = new ThucPham("Thịt Bò", "02", "105000", "29/11/2021", "10");
    HangHoa hh3 = new ThucPham("Cá", "03", "50000", "25/11/2021", "8");
    HangHoa hh4 = new ThucPham("Thịt Gà ", "04", "60000", "12/11/2021", "15");
    HangHoa hh5 = new ThucPham("Thịt Bò", "05", "105000", "29/11/2021", "10");
    HangHoa hh6 = new ThucPham("Rau", "06", "12000", "30/12/2021", "23")   ;
    
    //  hàng sành sứ
    HangHoa hh7 = new SanhSu("Bát", "01", "12000", "1/1/2022", "40");
    HangHoa hh8 = new SanhSu("Đĩa", "02", "15000", "2/1/2022", "60");
    HangHoa hh9 = new SanhSu("Chai", "03", "12000", "1/1/2022", "70");
    HangHoa hh10 = new SanhSu("Bình", "04", "50000", "30/12/2021", "20");
    HangHoa hh11 = new SanhSu("Cốc", "05", "40000", "29/12/2021", "10");
    HangHoa hh12 = new SanhSu("Ly", "01", "12000", "1/1/2022", "40");
   
    //  hàng điện máy
    HangHoa hh13 = new SanhSu("Máy nóng lạnh", "01", "2000000", "27/12/2021", "20");
    HangHoa hh14 = new SanhSu("Máy bơm nước", "02", "1500000", "27/12/2021", "40");
    HangHoa hh15 = new SanhSu("Quạt", "03", "1700000", "26/12/2021", "10");
    HangHoa hh16 = new SanhSu("Đèn ", "04", "200000", "25/12/2021", "30");
    HangHoa hh17 = new SanhSu("Laptop", "05", "20000000", "27/12/2021", "50");
    HangHoa hh18 = new SanhSu("Tivi", "06", "4000000", "26/12/2021", "20");

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
        System.out.println("HE THONG QUAN LY SAN PHAM");
        System.out.println("Mời bạn nhập lựa chọn?");
        System.out.println("1.Nhập thông tin hàng hóa. \n" + "3. Them Hang Hoa. \n" + "3. Xoa Hang Hoa. \n " + "4. Sua Hang Hoa. \n" + "5.In danh sach hang hoa. \n" 
                            + "6. Tim kiem hang hoa theo ten. \n" + "7.Tim kiem hang hoa theo loai \n" + "8.Tim kiem hang hoa theo ngay nhap. \n " + "9.Sap xep hang hoa theo gia tang dan. \n" 
                             + "10.Sap xep hang hoa theo ngay nhap tang dan. \n" + "11.Sap xep hang hoa theo ngay nhap giam dan. \n" + "12.Thong ke so luong hang hoa. \n" 
                             + "13.Thong ke tong gia tri nhap kho. \n " + "15.Thong ke so luong tung loai hang hoa. \n" + "16.Thoat chuong trinh");
        
    
    luaChon = sc.nextInt();
    switch(luaChon){
        case 1: st.themHangHoa();break;
        default : break;

       }
    };break;
    
}
    


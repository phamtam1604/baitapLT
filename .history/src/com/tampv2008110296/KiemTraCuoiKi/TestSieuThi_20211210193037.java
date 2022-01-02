/*
* creted date: 09 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.KiemTraCuoiKi;

import java.util.Scanner;

public class TestSieuThi {

    static void Menu(){
        System.out.println("===================================");
        System.out.println(" =======HE THONG QUAN LY SIEU THI====");
        System.out.println("1.Them hang hoa");
        System.out.println("2.Sua hang hoa");
        System.out.println("3.Xoa hang hoa");
        System.out.println("4.Tim kiem hang hoa theo loai");
        System.out.println("5.Tim kiem hang hoa theo gia");
        System.out.println("6.Tim kiem hang hoa tu ngay");
        System.out.println("7. Sap xep theo gia tang , giam dan");
        System.out.println("8. Sap xep theo loai tang giam dan");
        System.out.println("9. Thong ke san pham");
        System.out.println("10. In danh sach san pham");
        System.out.println("11. Thoat chuong trinh");
        System.out.println("==========================================");
    }
    
    public static void main(String[] args) {
        int luachon;
        DanhSachQuanLy dSQL = new DanhSachQuanLy();
        Scanner in = new Scanner(System.in);
        Menu();
        while(true){
            System.out.print("Moi ban chon 1 muc !!!");
            luachon = in.nextInt();
            switch(luachon){
                case 1: 
                dSQL.addHangHoa();
                break;

                case 11: return; 
            }

        }
    }
}

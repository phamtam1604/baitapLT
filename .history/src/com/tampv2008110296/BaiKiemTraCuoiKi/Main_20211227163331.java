/*
* creted date: 25 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.util.Scanner;

public class Main {
   
    static void Menu(){
       System.out.println("================================================");
       System.out.println("HE THONG QUAN LY SAN PHAM");
       System.out.println("1. Them Hang Hoa:");
       System.out.println("2. Xoa Hang Hoa: ");
       System.out.println("3. Sua Hang Hoa: "); 
       System.out.println("4. Danh sach hang hoa");
       System.out.println("4.Tim kiem hang hoa theo ten:");
       System.out.println("5. Tim kiem hang hoa theo loai:");
       System.out.println("6. Tim kiem hang hoa theo ngay nhap:");
       System.out.println("7. Sap xep hang hoa theo gia tang dan:");
       System.out.println("8. Sap xep hang hoa theo don gia giam dan:");
       System.out.println("9. Sap xep hang hoa theo ngay nhap tang dan: ");
       System.out.println("9. Sap xep hang hoa theo ngay nhap giam dan: ");
       System.out.println("10. Thong ke so luong hang hoa:");
       System.out.println("11. Thong ke tong gia tri nhap kho:");
       System.out.println("12. Thong ke so luong tung loai hang hoa:");
       System.out.println("13. Thoat chuong trinh");
       System.out.println("=====================================================");
    
    }

    public static void main(String[] args) {
      int luachon;
      SieuThi sieuthi = new SieuThi();
      Scanner input = new Scanner(System.in);
      Menu();
      while(true){
          System.out.println(" Moi ban nhap lua chon");
          luachon = input.nextInt();
          switch(luachon){
              case 1:
               sieuthi.ThemHangHoa(new HangHoa());
               break;
              case 5: return; 
          }
      }
    }
}

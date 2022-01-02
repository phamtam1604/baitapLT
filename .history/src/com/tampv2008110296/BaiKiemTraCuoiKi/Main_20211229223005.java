/*
* creted date: 25 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.BlockElement;

public class Main {
    
  
  static  Scanner sc = new Scanner(System.in);

  public void nhapThongTin(HangHoa hh){   
    System.out.println("Nhập tên hàng hóa:");
     hh.setTenHangHoa(sc.nextInt());
     sc.nextLine();
    System.out.println("Nhập đơn giá:");
     hh.setDonGia(sc.nextLine());
    System.out.println("Nhập số lượng tồn kho:");
      hh.setSoLuongTonKho(sc.nextLine());;
     System.out.println("Ngày nhập kho:");
      hh.setNgayNhapKho(sc.nextLine());
    System.out.println("Mã hàng hóa (1= SanhSu, 2= DienMay, 3 = ThucPham)");
      hh.setMaHH(sc.nextLine());
}

    public static void main(String[] args) {
      int luachon;
      HangHoa hh[] = null;
      int a,n =0;
      boolean flag = true;
      do{
        System.out.println("================================================");
        System.out.println("HE THONG QUAN LY SAN PHAM");
        System.out.println("Mời bạn nhập lựa chọn?");
        System.out.println("1.Nhập thông tin hàng hóa. \n" + "3. Them Hang Hoa. \n" + "3. Xoa Hang Hoa. \n " + "4. Sua Hang Hoa. \n" + "5.In danh sach hang hoa. \n" 
                            + "6. Tim kiem hang hoa theo ten. \n" + "7.Tim kiem hang hoa theo loai \n" + "8.Tim kiem hang hoa theo ngay nhap. \n " + "9.Sap xep hang hoa theo gia tang dan. \n" 
                             + "10.Sap xep hang hoa theo ngay nhap tang dan. \n" + "11.Sap xep hang hoa theo ngay nhap giam dan. \n" + "12.Thong ke so luong hang hoa. \n" 
                             + "13.Thong ke tong gia tri nhap kho. \n " + "15.Thong ke so luong tung loai hang hoa. \n" + "16.Thoat chuong trinh");
        
        a = sc.nextInt();
        switch (a) {
          case 1:
          System.out.println("Nhập thông tin hàng hóa");
          n = sc.nextInt();
          hh = new HangHoa[n];
          for (int i = 0; i < n; i++){
            System.out.println("" + (i + 1) + ": ");
            hh[i] = new HangHoa(i, null, null, null, null);
            nhapThongTin(hh[i]);
          }

          break;
          case 2:
           System.out.println();
           }
        }






















      }

  
    } while(flag);
      
    }    
}

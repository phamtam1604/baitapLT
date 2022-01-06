/*
* creted date: 26 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.security.PublicKey;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

import com.tampv2008110296.kiemtrgiuaki.DanhSachQuanLy;
import com.tampv2008110296.lab1.scanner;

public class SieuThi {
    private ArrayList<HangHoa> danhSach;
    public SieuThi(){
        danhSach = new ArrayList<HangHoa>(20);
    }
    private Scanner sc = new Scanner(System.in);

    public ArrayList<HangHoa> getDanhSach(){
        return danhSach;
    }

    public void setDanhSach(ArrayList<HangHoa> danhSach) {
        this.danhSach = danhSach;
    }

 // thêm hàng hóa
    public void themHangHoa(HangHoa a) throws ParseException{
        int count = 0;
        for(int i = 0; i < danhSach.size() ; i++){
            HangHoa hh = danhSach.get(i);
            if(hh.getMaHH().equalsIgnoreCase(a.getMaHH()) ||
            hh.getMaHH().equalsIgnoreCase("Hang TP")|| hh.getMaHH().equalsIgnoreCase("Hang SS") || hh.getMaHH().equalsIgnoreCase("Hang DM") ){
            System.out.println("Xin vui long thu lai!!!");
            count++ ;
            themHangHoa();
            break;
            }
        }
        if(count == 0){
            danhSach.add(a);
        }
 }

    public void themHangHoa() throws ParseException {
        System.out.println("==========Helloooooo===========");
        System.out.println("=============MENU=============");
        System.out.println("1.Hang thuc pham          ");
        System.out.println("2.Hang sanh su             ");
        System.out.println("3.Hang dien may            ");
		System.out.println(" 0.Thoat                 ");
        System.out.println("=============MENU=============");
        System.out.print("Vui long chon chuc nang : ");
    	int luaChon = sc.nextInt();
        HangHoa a;
        switch(luaChon){ 
            case 1: {
                // lựa chọn 1 để nhập thông tin cho nghành hàng thực phẩm
                System.out.println("\n\nntNhap thong tin hang hoa");
                System.out.println("Nhap ma hang hoa:");
                sc.nextLine();
                String maHH = sc.nextLine();
                System.out.println("Nhap ten hang hoa:");
                String tenHangHoa = sc.nextLine();
                System.out.println("Nhap so luong ton kho:");
                int soLuongTonKho = sc.nextInt();
                System.out.println("Nhap don gia (VNĐ):");
                int donGia = sc.nextInt();
                System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                sc.nextLine();
				String ngayNhapKho = sc.nextLine();
                System.out.println("Nhap ngay het han");
               
                String hanSanXuat = sc.nextLine();
                a = new ThucPham(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho, hanSanXuat);
                themHangHoa(a);
                break;
            }
            case 2: {
                // lựa chọn 2 để thêm hàng hóa cho ngành điện máy
                System.out.println("\n\n\tNhap thong tin hang hoa dien may");
                System.out.print("Nhap ma hang hoa : ");
				sc.nextLine();
				String maHH = sc.nextLine();
				System.out.print("Nhap ten hag hoa : ");
				String tenHangHoa = sc.nextLine();
				System.out.print("Nhap so luong hang ton kho : ");
				int soLuongTonKho = sc.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int donGia = sc.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                String ngayNhapKho = sc.nextLine();
                System.out.println("Nhap cong suat cua hang hoa");
                int congSuat = sc.nextInt();
                a = new DienMay(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho, congSuat);
                themHangHoa(a);
                break;
            }
            case 3: {
                // lựa chọn 3 để thêm hàng hóa cho nghành Sành sứ
                System.out.println("\n\n\tNhap thong tin hang hoa sanh su: "); 
                System.out.print("Nhap ma hang hoa : ");
				sc.nextLine();
                String maHH = sc.nextLine();
				System.out.print("Nhap ten hang hoa (khong dau) : ");
				String tenHangHoa = sc.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = sc.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int donGia = sc.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                String ngayNhapKho = sc.nextLine();
                System.out.println("Nhap noi san xuat");
                String noiSanXuat = sc.nextLine();
                a = new SanhSu(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho, noiSanXuat);
                themHangHoa(a);
                break;
            }
            default : break;
        }
    }
    public void suaHangHoa() throws ParseException{
        System.out.println("Nhap ma hang hoa ban muon sua:");
        String maHH = sc.nextLine();
        for(int i = 0; i< danhSach.size(); i++){
            HangHoa a = danhSach.get(i);
            if( a.getMaHH().equals(maHH)){
            if(a instanceof ThucPham){
                String[] maHH = maHH.split("=============",2);
                System.out.print("Nhap ten hang hoa: ");
                    String tenHangHoa = sc.nextLine();
                    System.out.print("Nhap so luong ton kho: ");
                    int soLuongTonKho = sc.nextInt();
                    System.out.print("Nhap don gia: ");
                    int donGia = sc.nextInt();	
                    System.out.print("Nhap ngay nhap kho: ");
                    String ngayNhapKho =sc.nextLine();
                   
                    System.out.print("Nhap ngay het han: ");
            }
         }
        }
    }
    
     public void xoaHangHoa(){
         System.out.println("Nhap hang hoa can xoa");
         String maHH = sc.nextLine();
         for(int i = 0; i<danhSach.size(); i++){
             HangHoa a = danhSach.get(i);
             if(a.getMaHH().equals(maHH)){
                 danhSach.remove(a);
             }
         }
     }
    
     public void xuatThucPham(){
         for (int i = 0; i<100; i++){
         }
         System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Han san xuat","Tong gia tri");
        for (int i = 0; i<100; i++){}
        System.out.println();
        for (HangHoa hangHoa : danhSach){
            if(hangHoa instanceof ThucPham){
                System.out.println(hangHoa);
            }
        }
        for (int i = 0; i<100; i++){
        }
        System.out.println();
     }



     public void xuatSanhSu(){
        for (int i = 0; i<100; i++){
        }
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
       "Ten Hang Hoa","So Luong ton Kho",
       "Gia Nhap Kho","Ngay Nhap Kho","Noi san xuat","Tong gia tri");
       for (int i = 0; i<100; i++){}
       System.out.println();
       for (HangHoa hangHoa : danhSach){
           if(hangHoa instanceof SanhSu){
               System.out.println(hangHoa);
           }
       }
       for (int i = 0; i<100; i++){
       }
       System.out.println();
     }


    public void xuatDienMay(){
        for (int i = 0; i<100; i++){
        }
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
       "Ten Hang Hoa","So Luong ton Kho",
       "Gia Nhap Kho","Ngay Nhap Kho","Cong Suat cua may","Tong gia tri");
       for (int i = 0; i<100; i++){}
       System.out.println();
       for (HangHoa hangHoa : danhSach){
           if(hangHoa instanceof DienMay){
               System.out.println(hangHoa);
           }
       }
       for (int i = 0; i<100; i++){
       }
       System.out.println();
    }
// xuát hàng hóa trực tiếp
    public void xuatThucPhamTrucTiep(HangHoa a){
        for (int i= 0; i<100; i++){
        }
        System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Han san xuat","Tong gia tri");
        for (int i =0; i<100; i++){
        }
        System.out.println();
        System.out.println(a);
        for(int i= 0; i< 100; i++){
        }
        System.out.println();
    }
    
    public void xuatSanhSuTrucTiep(HangHoa a){
        for (int i= 0; i<100; i++){
        }
        System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Noi san xuat","Tong gia tri");
        for (int i =0; i<100; i++){
        }
        System.out.println();
        System.out.println(a);
        for(int i = 0; i<100; i++){
        }
        System.out.println();
    }
    
    public void xuatDienMayTrucTiep(HangHoa a){
        for (int i= 0; i<100; i++){
        }
        System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Cong suat cua hang hoa","Tong gia tri");
        for (int i =0; i<100; i++){
        }
        System.out.println();
        System.out.println(a);
        for(int i =0; i<100; i++){
        }
        System.out.println();
    }
// xuat hang hoa theo danh sach
    public void xuatThucPhamTheoDanhSach(ArrayList<HangHoa> l){
        for (int i =0; i< 100; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Han san xuat","Tong gia tri");
        for (int i =0; i< 140; i++) {
		}
        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);
        }
        for (int i =0; i< 100; i++) {
		}
        System.out.println();
    }
    
    public void xuatSanhSuTheoDanhSach(ArrayList<HangHoa> l){
        for (int i =0; i< 100; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Noi san xuat","Tong gia tri");
        for (int i =0; i< 140; i++) {
		}
        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);
        }
        for (int i =0; i< 100; i++) {
		}
        System.out.println();
    }
    public void xuatDienMayTheoDanhSach(ArrayList<HangHoa> l){
        for (int i =0; i< 100; i++) {
		}
		System.out.println();
        System.out.printf("|%-8s|%-20s|%-20s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang",
        "Ten Hang Hoa","So Luong ton Kho",
        "Gia Nhap Kho","Ngay Nhap Kho","Cong suat cua hang hoa","Tong gia tri");
        for (int i =0; i< 140; i++) {
		}
        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);
        }
        for (int i =0; i< 100; i++) {
		}
        System.out.println();
    }

// xuất hàng hóa tất cả 
    public void xuatTatCaHangHoa(){
        for(int i = 0; i < danhSach.size(); i++){
            HangHoa a = danhSach.get(i);
            if(a instanceof ThucPham){
                xuatThucPham();
            }
            else if(a instanceof SanhSu){
                xuatSanhSuTrucTiep(a);
            } else if(a instanceof DienMay){
                xuatDienMayTrucTiep(a);
            }
        }
    }
// sắp xếp hàng hóa giảm dần theo giá
         public void sapXepHangHoaGiamDanTheoGia(){
               Collections.sort(danhSach,new Comparator<HangHoa>(){
               @Override
                     public int compare(HangHoa o1, HangHoa o2){
                       if(o1.getDonGia() < o2.getDonGia()){
                         return 1 ;
                          }
                        else {
                                 if(o1.getDonGia() == o2.getDonGia()){
                         return 0 ;
                          }
                           else {
                              return -1 ;
                            }
                        }
                   }
              });
}

public void sapXepHangHoaTangDanTheoGia(){
    Collections.sort(danhSach,new Comparator<HangHoa>(){
        @Override
        public int compare(HangHoa o1, HangHoa o2) {
            if(o1.getDonGia() < o2.getDonGia()){
                return -1 ;
            }
            else {
                if(o1.getDonGia() == o2.getDonGia()){
                    return 0 ;
                }
                else {
                    return 1 ;
                }
            }
        }
    });
}

public void sapXepHangHoaTangDanTheoNgay(){
    Collections.sort(danhSach,new Comparator<HangHoa>(){
        @Override
        public int compare(HangHoa o1, HangHoa o2) {
            if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                return -1 ;
            }
            else {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                    return 0 ;
                }
                else {
                    return 1 ;
                }
            }
        }
    });
}
public void sapXepHangHoaGiamDanTheoNgay(){
    Collections.sort(danhSach,new Comparator<HangHoa>(){
        @Override
        public int compare(HangHoa o1, HangHoa o2) {
            if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                return 1 ;
            }
            else {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                    return 0 ;
                }
                else {
                    return -1 ;
                }
            }
        }
    });
}



}

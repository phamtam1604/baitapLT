/*
* creted date: 26 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.security.PublicKey;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import com.tampv2008110296.lab1.scanner;

public class SieuThi {
    private ArrayList<HangHoa> danhSach;
    public SieuThi(){
        danhSach = new ArrayList<>();
    }
    private Scanner sc = new Scanner(System.in);

    public ArrayList<HangHoa> getDanhSach(){
        return danhSach;
    }
    public void setDanhSach(ArrayList<HangHoa> danhSach) {
        this.danhSach = danhSach;
    }

 // thêm hàng hóa
    public void themHangHoa(HangHoa a){
        int count = 0;
        for(int i = 0; i < danhSach.size() ;)
        {
            HangHoa hh = danhSach.get(i);
            count++;
            themHangHoa(hh);
            break;
        } if(count == 0){
            danhSach.add(a);
        }
    }

    public void themHangHoa() {
        System.out.println("=============MENU=============");
        System.out.println("| 1.Hang thuc pham           |");
        System.out.println("| 2.Hang sanh su             |");
        System.out.println("| 3.Hang dien may            |");
		System.out.println("| 0.Quay lai                 |");
        System.out.println("=============MENU=============");
        System.out.print("Nhap lua chon loai hang hoa : ");
    	int luaChon = sc.nextInt();
        HangHoa x;
        switch(luaChon){ 
            case 1: {
                // lựa chọn 1 để nhập thông tin cho nghành hàng thực phẩm
                System.out.println("\n\nntNhập thông tin hàng thực phẩm");
                System.out.println("Nhập mã hàng hóa:");
                sc.nextLine();
                String maHH = sc.nextLine();
                System.out.println("Nhập tên hàng hóa:");
                String tenHangHoa = sc.nextLine();
                System.out.println("Nhập số lượng tồn kho:");
                int soLuongTonKho = sc.nextInt();
                System.out.println("Nhập đơn giá (VNĐ):");
                int donGia = sc.nextInt();
                System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                sc.nextLine();
				String ngayNhapKho = sc.nextLine();
                x = new ThucPham(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho);
                themHangHoa(x);
                break;
            }
            case 2: {
                // lựa chọn 2 để thêm hàng hóa cho ngành điện máy
                System.out.println("\n\n\tNhập thông tin nghành hàng điện máy");
                System.out.print("Nhập mã hàng hóa : ");
				sc.nextLine();
				String maHH = sc.nextLine();
				System.out.print("Nhập tên hàng hóa : ");
				String tenHangHoa = sc.nextLine();
				System.out.print("Nhập số lượng tồn kho : ");
				int soLuongTonKho = sc.nextInt();
				System.out.print("Nhập đơn giá (vnd) : ");
				int donGia = sc.nextInt();				
				System.out.print("Nhập ngày nhập kho (dd/mm/yyyy) : ");
                String ngayNhapKho = sc.nextLine();

                x = new  DienMay(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho);
                themHangHoa();
                break;
            }
            case 3: {
                // lựa chọn 3 để thêm hàng hóa cho nghành Sành sứ
                System.out.println("\n\n\tNhập thông tin hàng hóa cho nghành sành sứ "); 
                System.out.print("Nhập mã hàng hóa : ");
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
                x = new SanhSu(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho);
                themHangHoa();
                break;
            }
            default : break;
        }
    }
    
    public void xuatThucPham(){
        
    }


}

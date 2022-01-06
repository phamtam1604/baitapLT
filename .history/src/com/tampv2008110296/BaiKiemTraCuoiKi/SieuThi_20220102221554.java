/*
* creted date: 26 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.BaiKiemTraCuoiKi;

import java.security.PublicKey;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

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
                System.out.println("Nhap ngay het han");
               
                String hanSanXuat = sc.nextLine();
                a = new ThucPham(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho, hanSanXuat);
                themHangHoa(a);
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
                System.out.println("Nhap cong suat cua hang hoa");
                int congSuat = sc.nextInt();
                a = new DienMay(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho, congSuat);
                themHangHoa(a);
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
                System.out.println("Nhap noi san xuat");
                String noiSanXuat = sc.nextLine();
                a = new SanhSu(tenHangHoa, maHH, donGia, ngayNhapKho, soLuongTonKho, noiSanXuat);
                break;
            }
           
        }
    }
    


}

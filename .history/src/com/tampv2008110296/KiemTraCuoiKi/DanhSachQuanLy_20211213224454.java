/*
* creted date: 09 thg 12, 2021
* author: cgm
*/
package com.tampv2008110296.KiemTraCuoiKi;

import java.util.ArrayList;
import java.util.PrimitiveIterator;
import java.util.Scanner;

import com.tampv2008110296.lab1.scanner;


public class DanhSachQuanLy {
    private hangHoa hh[] = new hangHoa[20];
    private int CountHH, sum1=0, sum2=0, dem=0;
    

    static ArrayList<hangHoa> DanhSachHangHoa = new ArrayList<hangHoa>();
    Scanner sc = new Scanner(System.in);
    
    public void addHangHoa(int temp){
        if(CountHH>20)
               System.out.println("Da qua gioi han them, khong the them!");
        else{
            if(temp ==1){
                hh[CountHH] = new SanhSu();
                SanhSu ss = new SanhSu();
                ss.nhap();
                
            }else{
                if(temp == 2){
                    hh[CountHH]= new DienMay();
                    DienMay dd = new DienMay();
                    dd.nhap();   
                }
            }
        }
    
    }




}

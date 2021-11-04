/*
* creted date: 04 thg 11, 2021
* author: cgm
*/
package com.tampv2008110296.kiemtrgiuaki;

public class DanhSachQuanLy {
    static ArrayList<Nguoi> list = new ArrayList<Nguoi>();
    static Scanner nhap = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            // Add element to list
            list1.add("0" + i);
        }
        System.out.print("Init list1 = ");
        printData(list1);
  
        
        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.add("0" + 2);
        System.out.print("After list1.addAll(03): list2 = ");
        printData(list2);
    }
    public static void themNguoi(){
     System.out.println("Nhap them nguoi");
    }
    public static void inDanhSach(){
        System.out.println("In danh sach");

    }
}

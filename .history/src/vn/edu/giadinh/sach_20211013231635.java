/*
* creted date: 13 thg 10, 2021
* author: cgm
*/
package vn.edu.giadinh;

public class sach {
    import java.util.Scanner;

public class sach {
   
    public static void main(String[] args) {
        sach bbook;
        bbook = new sach(50000);
        System.out.println("Giá sách: " + bbook.gia);
        bbook = new sach("thiếu niên", 2020);
        System.out.println("Nhà xuất bản: " + bbook.nxb + " Và năm xuất bản: " + bbook.namxb);
        bbook = new sach(200000, 20, "nam cao");
        System.out.println("Giá bán: " + bbook.giaban + " Số lượng hiện có: " + bbook.soluong + " Tên tác giả: "
                + bbook.tacgia);
        bbook = new sach();
        System.out.println(bbook);
    }

}
    
}

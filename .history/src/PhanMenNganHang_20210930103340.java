/*
* creted date: 30 thg 9, 2021
* author: cgm
*/
public class PhanMenNganHang {
    public static void main(String[]args){
        int account_number = 20;
        int account_balance = 100;

        account_balance = account_balance + 100;
        System.out.println("Account Number = " + account_number);
        System.out.println("Account Balance = " +account_balance);

        account_balance = account_balance - 50;
        System.out.println("Account Number = " + account_number);
        System.out.println("Account Balance = " +account_balance);


        account_balance = account_balance - 10;
        System.out.println("Account Number = " + account_number);
        System.out.println("Account Balance = " +account_balance);


    }
    public static void show(int soTien, int soDu){
        System.out.println("So tien cua ban la = " +soTien);
        System.out.println("So du cua ban la = " + soDu);
    
    }
    
}

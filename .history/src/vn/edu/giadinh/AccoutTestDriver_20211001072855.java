/*
* creted date: 30 thg 9, 2021
* author: cgm
*/
package vn.edu.giadinh;

public class AccoutTestDriver {
    public static void main(String[]args){
        Account account;
        account = new account();
        account.showData();
        account.deposit(500);
        account.showData();
        account.withdraw(200);
        account.showData();
    }

    
}

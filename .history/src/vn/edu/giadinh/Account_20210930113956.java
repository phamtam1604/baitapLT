/*
* creted date: 30 thg 9, 2021
* author: cgm
*/
package vn.edu.giadinh;

public class Account {
    //attribute - thuộc tính
    int account_number;
    int account_balance;
    
    //method - fuction
     void showData(){
          System.out.println("Account Nnumber: " + number_account);
          System.out.println("Accout Balance: " + number_balance);
     }
      
     void deposit(int amount){
         number_balance += amount;
     }
     void withdraw(int amount){
         number_balance -= amount;
     }
     
}

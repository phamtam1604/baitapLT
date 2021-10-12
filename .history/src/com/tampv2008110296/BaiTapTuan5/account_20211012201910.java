/*
* creted date: 12 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.BaiTapTuan5;

public class account {
    int accout_number ;
    int accout_balance ;
    String name_Of_Customer;
    account(String t,int a , int b){
        accout_number = a;
        accout_balance = b;
        name_Of_Customer = t;
    }
    public void Show_Balance() {
        System.out.println("accout_number = " + accout_number);
        System.out.println("accout_balance = " + accout_balance);
    }
    public void deposite(int ammout){
        if(ammout > 0){
            accout_balance += ammout;
        }
        else System.out.println("Số tiền đã nhập không hợp lệ !!!");
    }
    public void Withdraw(int ammout){
        if(ammout < accout_balance && ammout > 0){
            accout_balance -= ammout;
        }
        else System.out.println("Số tiền đã nhập không hợp lệ !!!");
    }

    
}

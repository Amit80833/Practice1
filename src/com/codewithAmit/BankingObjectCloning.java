package com.codewithAmit;

public class BankingObjectCloning implements Cloneable{
    long account_number;
    String customer_name;
    Double balance;

    BankingObjectCloning(long account_number,String customer_name,Double balance){
        this.account_number=account_number;
        this.customer_name=customer_name;
        this.balance=balance;
    }
    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

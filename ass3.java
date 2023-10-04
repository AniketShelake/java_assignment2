// Create a BankAccount class with attributes like account_number, account_holder, 
// and balance. Add methods to deposit and withdraw money from the account. 
// Create a bank account object, perform some transactions, and check the balance.

import java.util.Scanner;

class BankAccount{
    int account_number;
    String account_holder;
    static int  balance=0;
    int deposit(int money){
        balance=money+balance;
        return balance;
    }
    int withdraw(int money){
        balance=balance-money;
        return balance;
    }
    void check(){
        System.out.println("Available balance in account is "+balance);
    }
}
public class ass3 {
    public static void main(String[] args){
        BankAccount b1=new BankAccount();
        System.out.println("Enter account holder name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine()\
        System.out.println("Enter account_number");
        b1.balance=0;
        b1.deposit(500);
        b1.check();
        b1.withdraw(200);
        b1.check();
    }
}

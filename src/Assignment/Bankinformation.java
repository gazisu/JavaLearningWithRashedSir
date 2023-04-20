package Assignment;

import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class Bankinformation {
    private String AccName;
    private double balance;
    private int accountnum;
    public Bankinformation (String AccName, double balance, int accountnum){
        this.AccName= AccName;
        this.balance= balance;
        this.accountnum= accountnum;
    }
    public void Deposit(double amount){
        balance+= amount;
        System.out.println("Deposit Tk: "+amount+" only");
    }
    public void withdrawal(double amount){
        if (amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal Tk:"+amount+" Only");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getAccName(){
    return AccName;
    }

    public int getAccountnum(){

        return accountnum;
    }

    public static void main(String[] args) {



        Bankinformation Account1 = new Bankinformation("Salman", 15600, 101230145);
        Bankinformation Account2 = new Bankinformation("Mahrooz Alam", 50600, 101230210);

        System.out.println("Account Information: ");
        System.out.println("Account Name: "+Account1.getAccName() +"; Account Number: " +Account1.getAccountnum()+"; Account Balance: "+Account1.getBalance());
        System.out.println("Account Name: "+Account2.getAccName() +"; Account Number: " +Account2.getAccountnum()+"; Account Balance: "+Account2.getBalance());

        System.out.println();

      Account1.Deposit(6300);
        Account1.withdrawal(9600);
      Account2.Deposit(17965);
        Account2.withdrawal(68565);

        System.out.println();
        System.out.println("Update account information");
        System.out.println("Account Name: "+Account1.getAccName() +"; Account Number: " +Account1.getAccountnum()+"; Account Balance: "+Account1.getBalance());
        System.out.println("Account Name: "+Account2.getAccName() +"; Account Number: " +Account2.getAccountnum()+"; Account Balance: "+Account2.getBalance());
    }


}

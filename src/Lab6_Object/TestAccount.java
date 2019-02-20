package Lab6_Object;

import java.util.Scanner;

public class TestAccount {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
       Account.getNumberOfAccounts();
       Account myAccount = new Account(1000,0.2);
       int firstID = Account.getNumberOfAccounts();
       double firstBalance = myAccount.getBalance();
       double firstAnnualRate = myAccount.getAnnualInterestRate();
       double firstMonthlyRate = myAccount.getMonthlyInterestRate();

       Account otherAccount = new Account(500,0.3);
       int secondID = Account.getNumberOfAccounts();
       double secondBalance = myAccount.getBalance();
       double secondAnnualRate = myAccount.getAnnualInterestRate();
       double secondMonthlyRate = myAccount.getMonthlyInterestRate();

       System.out.println("We have "+Account.getNumberOfAccounts()+" account(s) now");
       System.out.printf("\nID: " + firstID + "\nBalance: " + firstBalance + "\nAnnual interest rate: "
                + firstAnnualRate+ "\nMonthly interest rate: %.2f",  firstMonthlyRate);

       System.out.printf("\nID: " + secondID + "\nBalance: " + secondBalance + "\nAnnual interest rate: "
                + secondAnnualRate+ "\nMonthly interest rate: %.2f ", secondMonthlyRate);
       System.out.println();

       System.out.println();

       Account thirdAccount = new Account(3000,0.7);
       int thirdID = Account.getNumberOfAccounts();
       double thirdBalance = thirdAccount.getBalance();
       double thirdAnnualRate = thirdAccount.getAnnualInterestRate();
       double thirdMonthlyRate = thirdAccount.getMonthlyInterestRate();

       System.out.println("New Account Information");
       System.out.printf("\nID: " + thirdID + "\nBalance: " + thirdBalance + "\nAnnual interest rate: "
                + thirdAnnualRate+ "\nMonthly interest rate: %.2f",  thirdMonthlyRate);
        System.out.println();
        System.out.println();

        System.out.println("How much do you want to transfer?");
        double money = sc.nextDouble();

        myAccount.transfer(money,thirdAccount);
        firstBalance = myAccount.getBalance();
        firstAnnualRate = myAccount.getAnnualInterestRate();

        thirdBalance = thirdAccount.getBalance();
        thirdAnnualRate = thirdAccount.getAnnualInterestRate();

        System.out.printf("\nID: " + firstID + "\nBalance: " + firstBalance + "\nAnnual interest rate: "
                + firstAnnualRate+ "\nMonthly interest rate: %.2f",  firstMonthlyRate);

        System.out.printf("\nID: " + thirdID + "\nBalance: " + thirdBalance + "\nAnnual interest rate: "
                + thirdAnnualRate+ "\nMonthly interest rate: %.2f ", thirdMonthlyRate);







    }
}

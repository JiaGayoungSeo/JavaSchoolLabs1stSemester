package Lab3_Method;
import java.util.Scanner;

public class Lab3Assingment_6 {
    public static void main(String[] args){
        double generalIncome,investmentIncome,otherIncome,regularDeductions,otherDeductions;
        double paidTax=0;
        double resultOfTaxableIncome=0;
        double resultOfIncomeTax=0;
        double resultOfIncomeTaxOwed=0;
        double returnTax=0;

        Lab3Assignment_5 method = new Lab3Assignment_5();
        Scanner input = new Scanner(System.in);

        System.out.println("Input your general Income");
        generalIncome = input.nextDouble();
        System.out.println("Input your investment income");
        investmentIncome = input.nextDouble();
        System.out.println("Input your other income");
        otherIncome = input.nextDouble();
        System.out.println("Input your regular deductions");
        regularDeductions = input.nextDouble();
        System.out.println("Input your other deductions");
        otherDeductions = input.nextDouble();
        System.out.println("Input any previously paid tax");
        paidTax=input.nextDouble();

        resultOfTaxableIncome = method.calcualteTaxableIncome(generalIncome,investmentIncome,otherIncome,regularDeductions,otherDeductions);
        resultOfIncomeTax=method.calculateIncomeTax(resultOfTaxableIncome);

        resultOfIncomeTaxOwed = resultOfIncomeTax - paidTax;
        if(resultOfIncomeTaxOwed<0) {
            returnTax = Math.abs(resultOfIncomeTaxOwed);
            System.out.println("You have a return of "+returnTax);
        }
        else {
            System.out.print("The amount of income tax owed by you is  ");
            System.out.println(Math.round(resultOfIncomeTaxOwed*100)/100);
        }

        System.out.print("Your calculated income tax is  ");
        System.out.println(Math.round(resultOfTaxableIncome)*100/100);

        System.out.print("Your amount of income tax is  ");
        System.out.println(Math.round(resultOfIncomeTax)*100/100);
    }
}

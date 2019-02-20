package Lab3_Method;


public class Lab3Assignment_5 {
    public static double calcualteTaxableIncome(double generalIncome, double investmentIncome, double otherIncome, double regularDeductions, double otherDeductions)
    {
        return  generalIncome+investmentIncome+otherIncome-regularDeductions-(otherDeductions*0.5);
    }

    public static double calculateIncomeTax(double taxableIncome){
        double incomeTax =0;
        if(taxableIncome>0 && taxableIncome<=20000) incomeTax = taxableIncome*0.1;
        if(taxableIncome>20000 && taxableIncome<40000) incomeTax = taxableIncome*0.12;
        if(taxableIncome>40000 && taxableIncome<60000) incomeTax = taxableIncome*0.15;
        if(taxableIncome>60000) incomeTax = taxableIncome*0.2;
        return  incomeTax;

    }

    public static void main(String[] args){
        double generalIncome=1000;
        double investmentIncome=200;
        double otherIncome=400;
        double regularDedutions=20;
        double otherDeductions=20;
        double taxableIncome=300000;

        System.out.println("The taxable income is "+ Math.round(calcualteTaxableIncome(generalIncome,investmentIncome,otherIncome,regularDedutions,otherDeductions)*100)/100.0);
        System.out.println("The income tax is "+ Math.round(calculateIncomeTax(taxableIncome)*100)/100);
    }
}

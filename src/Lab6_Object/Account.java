package Lab6_Object;

class Account {
    private static int numberOfAccounts;
    private int id;
    private double balance;
    private double annualInterestRate;
    private double monthlyInterest;

    public Account()
    {
        balance = 0;
        numberOfAccounts++;
        id = 0;
        annualInterestRate = 0;
        monthlyInterest = 0;
    }

    public Account(double newBalance, double newAnnualInterestRate)
    {
        balance = newBalance;
        numberOfAccounts++;
        annualInterestRate = newAnnualInterestRate;
    }
    public static int getNumberOfAccounts()
    {
        return numberOfAccounts;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int getID)
    {
        id = getID;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balanceGet)
    {
        if(balanceGet >= 0)
        {
            balance = balanceGet;
        }
        else
        {
            balance = balance;
        }
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double interestGet)
    {
        annualInterestRate = interestGet;
    }

    public double getMonthlyInterestRate()
    {
        monthlyInterest = annualInterestRate / 12;
        return monthlyInterest;
    }


    public double withdraw(double amount)
    {
        double currentName = 0;
        if(amount < 0)
        {
            currentName = this.balance;
        }
        else if(amount >= 0.0 && amount <= this.balance)
        {
            currentName = this.balance - amount;
        }
        return currentName;
    }
    public double deposit(double amount)
    {
        double newBalance = 0;
        if(amount >= 0)
        {
            newBalance = this.balance + amount;
        }
        else
        {
            newBalance = this.balance;
        }
        return newBalance;
    }


    public void transfer(double amount, Account otherAccount)
    {
        if(amount <= 0 || amount > this.balance)
        {
            System.out.println("Please enter a valid number!");
        }
        else
        {
            this.setBalance(this.withdraw(amount));
            otherAccount.setBalance(otherAccount.deposit(amount));
        }
    }
}


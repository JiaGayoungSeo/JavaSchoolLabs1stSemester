package Lab6_Object;

class ChangeMachine {
    private int loonies;
    private int twoonies;
    private boolean status;


    public ChangeMachine(int twoonies, int loonies)
    {
        this.loonies = loonies;
        this.twoonies = twoonies;
        checkStatus();
        status = getStatus();
    }
    public int getLoonies()
    {
        return loonies;
    }
    public void setLoonies(int loonies)
    {
        if(loonies < 0)
        {
            System.out.println("You cannot have a negative number of coins!");
        }
        else
        {
            this.loonies = this.loonies + loonies;
            checkStatus();
        }
    }
    public int getToonies()
    {
        return twoonies;
    }
    public void setToonies(int toonies)
    {
        if(toonies < 0)
        {
            System.out.println("You cannot have a negative number of coins!");
        }
        else
        {
            this.twoonies = this.twoonies + toonies;
            checkStatus();
        }
    }

    public boolean getStatus()
    {
        return status;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public void checkStatus()
    {
        if(twoonies >= 10 && loonies > 1)
        {
            status = true;
        }
        else status = false;
        setStatus(status);
    }

    public void makeChange(int amount)
    {
        int numOfTwoonies = 0;
        int numOfLoonies = 0;


        if(amount >= 2)
        {
            numOfTwoonies =(int)amount / 2;
            numOfLoonies = amount % 2;
        }
        if(amount < 2 && amount >= 0)
        {
            numOfTwoonies = 0;
            numOfLoonies = amount;
        }
        System.out.println( numOfTwoonies + " twoonies are used " + numOfLoonies + " loonies are used.");
        twoonies = twoonies - numOfTwoonies;
        loonies = loonies - numOfLoonies;

    }

    public void acceptMoney(int amount)
    {

        checkStatus();
        if(status == false) System.out.println("Out of Order! Here is your bill back.");
        if(status == true)
        {
            if(amount == 5 || amount == 10 || amount == 20)
            {
                makeChange(amount);
                checkStatus();
                if(status == false) System.out.println("You don't have enough coins in the machine!");

            }
            else
            {
                System.out.println("You must insert a $5 or $10 or $20 bill. Try again.");
            }
        }
    }
}




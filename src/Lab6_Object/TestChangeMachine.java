package Lab6_Object;
import java.util.Scanner;
class TestChangeMachine{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        ChangeMachine myChangeMachine = new ChangeMachine(20, 5);

        if(myChangeMachine.getStatus() == false)
        {
            System.out.println("Out of order! Cannot accept ANY bills. Please call technician to repair the machine.");
        }
        machineRunning ( myChangeMachine );

        System.out.println("Please enter the refill PIN(333): ");
        int pin = sc.nextInt();

        while(pin == 333)
        {
            System.out.println("Please enter the number of twoonies you refilled: ");
            int newTwoonies = sc.nextInt();
            myChangeMachine.setToonies(newTwoonies);

            System.out.println("Please enter the number of loonies you refilled:");
            int newLoonies = sc.nextInt();
            myChangeMachine.setLoonies(newLoonies);

            myChangeMachine.checkStatus();

            if(myChangeMachine.getStatus() == true)
            {
                System.out.println("It is ready");
            }

            machineRunning ( myChangeMachine );

            System.out.println("Please enter the refill PIN: ");
            pin = sc.nextInt();
        }
        if(pin != 333){
            System.exit ( 0 );
        }

    }

    public static void machineRunning(ChangeMachine myChangeMachine) {
        while(myChangeMachine.getStatus() == true)
        {
            if(myChangeMachine.getStatus() == true)
            {
                System.out.println("Please insert a single $5 or $10 or $20 bill: ");
                int bill = sc.nextInt();
                myChangeMachine.acceptMoney(bill);
            }
            myChangeMachine.checkStatus();
            if(myChangeMachine.getStatus() == false)
            {
                System.out.println("Out of order! Cannot accept any more bills. Please call the technician to refill the machine.");
            }
        }
    }
}

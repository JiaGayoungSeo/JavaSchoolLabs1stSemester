package PracticeFinalExam;
import java.util.Scanner;

public class ShippingTest {
    public static void main(String[] args){


        ShippingPackage package1 = new ShippingPackage (1236,"Gerry's house",15,10,20,2.5);

        double costOfPackage1 = package1.computeShipping ();
        System.out.println("Shipping cost of package 1 is $"+ costOfPackage1);

        Scanner scanner = new Scanner ( System.in );

        ShippingPackage emptyPackage = new ShippingPackage ( );
        emptyPackage.setId ( 3278 );
        emptyPackage.setDestination ( "Susan's house" );

        System.out.println("Enter height, width, depth, weight in ORDER");
        int userHeight = scanner.nextInt ();
        int userWidth = scanner.nextInt ();
        int userDepth = scanner.nextInt ();
        double userWeight =scanner.nextDouble ();

        emptyPackage.setHeight ( userHeight );
        emptyPackage.setWidth ( userWidth );
        emptyPackage.setDepth ( userDepth );
        emptyPackage.setWeight ( userWeight );

        emptyPackage.computeShipping ();
        System.out.println ("Shipping cost is "+emptyPackage.computeShipping () );

        System.out.println(emptyPackage.getNumberOfPackage ()+" packages are shipped.");

        if(costOfPackage1>emptyPackage.computeShipping ()){
            System.out.println("Shipping ID "+ package1.getId ()+" has larger shipping cost");
        }

        if(emptyPackage.computeShipping ()>costOfPackage1){
            System.out.println(emptyPackage.getId ()+" has larger shipping cost");
        }


    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello may 30");
        
        //Bottle
        waterBottle summit;

        //Scanner
        Scanner sc = new Scanner(System.in);

        //VARIABLES for containing user input
        double dCapacity, dPrice, dContentLevel;
        String sWaterType, sBrand, sBottleType, sColor, sManufacturer;
        int nExpiryDate, nDateManufactured;
        boolean bIsSealed, bIsExpired;

        //Asking user

        //sc.nextLine();
        //System.out.print("ASK");
        //dContentLevel = sc.nextDouble();
        System.out.print("Watertype?");
        sWaterType = sc.nextLine();
        System.out.print("Brand?");
        sBrand = sc.nextLine();
        System.out.print("BottleType?");
        sBottleType = sc.nextLine();
        System.out.print("color?");
        sColor = sc.nextLine();
        System.out.print("manufacturer?");
        sManufacturer = sc.nextLine();

        System.out.print("capacity?");
        dCapacity = sc.nextDouble();
        System.out.print("Price?");
        dPrice = sc.nextDouble();

        System.out.print("expiry");
        nExpiryDate = sc.nextInt();
        System.out.print("dateofmanufacturing?");
        nDateManufactured = sc.nextInt();

        System.out.print("expired?");
        bIsExpired = sc.nextBoolean();
        System.out.print("Sealed?");
        bIsSealed = sc.nextBoolean();

        summit = new waterBottle(
            dCapacity, 
            dPrice, 
            sWaterType, 
            sBrand, 
            sBottleType, 
            sColor, 
            sManufacturer, 
            nExpiryDate, 
            nDateManufactured, 
            bIsSealed, 
            bIsExpired);
            //dContentLevel, 


        System.out.println("done creation");
        sc.close();

        System.out.println("Read out");
        System.out.println(summit.getdCapacity());
        System.out.println(summit.getdPrice());
        System.out.println(summit.getsWaterType());
        System.out.println(summit.getsBrand());
        System.out.println(summit.getsBottleType()); //this one
        System.out.println(summit.getsColor());
        System.out.println(summit.getsManufacturer());
        System.out.println(summit.getnExpiryDate());
        System.out.println(summit.getnDateManufactured());
        System.out.println(summit.bIsSealed());
        System.out.println(summit.bIsExpired());
        System.out.println("Done Read out");





    }    
}

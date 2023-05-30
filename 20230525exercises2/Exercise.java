import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        
        // creating an object out of my Square class
        SquareObject sqOne = new SquareObject();

        // a scanner to ask input
        Scanner sc = new Scanner(System.in);

        // original length
        System.out.println(sqOne.getLength());

        // asking for new one
        System.out.println("What length of the side would you want it to be?");
        int scInput;
        scInput = sc.nextInt();

        sqOne.setLength(scInput);
        System.out.println("new one is: " + scInput);
        //System.out.println(sqOne.getLength());

        sc.close();

        int nResultArea = sqOne.calculateArea(scInput);

        System.out.println("The area of your square is " + nResultArea);

        /* Setting the color and printing it out */
        sqOne.nColor = "Prussian";

        System.out.println(sqOne.getColor());


    }
}

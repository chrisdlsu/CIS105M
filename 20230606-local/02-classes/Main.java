public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        
        mySquare cubeBlue;
        cubeBlue = new mySquare(2);

        System.out.println(cubeBlue.getnSides());
        System.out.println(cubeBlue.addTwo(6));
        
        //ANOTHER SQUARE
        mySquare cubeLavender;

        cubeLavender = new mySquare(4, "Lavender", false);

        System.out.println("I have a new cube in lavender.");
        System.out.println("sides are "+ cubeLavender.getnSides());
        System.out.println("the color is " + cubeLavender.getsColor());
        System.out.println("is the cube new? " + cubeLavender.getisNew());

        cubeLavender.sayHelloThere();
        // mySquare cubeRed = new mySquare();
        // cubeRed.nSides = 4;
        // System.out.println(cubeRed.addTwo(1));
        // System.out.println(cubeRed.getnSides());
    }
}
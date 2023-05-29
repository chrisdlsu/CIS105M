public class Main {
    public static void main(String[] args){
        System.out.println("hello world May 28");

        classname testClass = new classname();

        Parisukat parisukat1 = new Parisukat();
        parisukat1.squareName = "Uno";
        parisukat1.nSide = 5;

        System.out.println(parisukat1.squareName);
        System.out.println(parisukat1.setArea(parisukat1.nSide));


    }
}

class classname {
    //VARIABLES
    int var1;
    String var2;

    //METHODS
    void method1(/*parameters*/){
        //body of method
    }

    int method2(/*parameters*/) {
        //body of method
        return 0;
    }
}

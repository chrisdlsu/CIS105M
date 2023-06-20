public class MainWarmUp {
    public static void main(String[] args) {
        //make a print out 10 times, saying hello there
        
        for (int i = 0; i < 11; i++) {
            sayHello();
            sayWord("what?");
            System.out.println(addTwo(1));
        }

    }

    static void sayHello() {
        System.out.println("Hello there");
    }

    static void sayWord(String sWord) {
        System.out.println(sWord);
    }

    static int addTwo(int x) {
        return x + 2;
    }
}
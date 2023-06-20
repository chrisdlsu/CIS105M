// my first java program to be using with github

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int n = 1;
        int d = 2;

        System.out.println(n+d);
        for (int i = 0; i < 5; i++) {
            printKamusta();
            System.out.println(i);
        }
    }

    // method for the kamusta print
    static void printKamusta() {
        System.out.println("Kamusta?");
    }

}
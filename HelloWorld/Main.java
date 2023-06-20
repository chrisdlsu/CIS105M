class SimplePrint {
    public static void main(String[] args) {
        System.out.println("Hello, World! CCS!");
	    System.out.println("Hallow OMG Java hello ulit");
        addExclamationPoint("hello");
        System.out.println(addOneNumber(1));

        boolean hello = false;
        if (hello != false) {
            System.out.println("I am saying hello!");
        } else {
            System.out.println("I am NOT saying hello now");
        }
    }

    //add an exclamation point
    public static void addExclamationPoint(String s) {
        System.out.println(s + "!");
    }

    //add one to an integer
    public static int addOneNumber(int x) {
        x = x + 1;
        return x;
    }

    //send a hello if the string is hi
    //later

}


public class mySquare {
    //ATTRIBUTES
    private int nSides;
    private String sColor;
    private boolean isNew;

    // CONSTRUCTOR TEMPLATES
    
    //a
    public mySquare (int nSides) {
        this.nSides = nSides;
    };

    //b
    public mySquare (int nSides, String sColor, boolean isNew) {
        this.nSides = nSides;
        this.sColor = sColor;
        this.isNew = isNew;
    }


    //METHODS
    //getters
    public int getnSides() {
        return nSides;
    }

    // public String getsColor() {
    //     return sColor;
    // }


    //setter
    

    //sample method
    public int addTwo(int i) {
        return i + 2;
    } 

    public void sayHelloThere() {
        System.out.println("Hello there!");
    }
}
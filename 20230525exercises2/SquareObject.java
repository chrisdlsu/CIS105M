
public class SquareObject {


    // THINGS IT KNOWS
    /**
     * @sideLength is the length of one of the square's sides
     */
    private int sideLength = 1;
    private String squareColor;

    // THINGS IT CAN DO
    /**
     * 
     * @return getLength gives the length of the square
     */
    public int getLength() {
        return sideLength;
    }

    public String getColor() {
        return squareColor;
    }

    public void setLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public void setColor(String c) {
        this.squareColor = c;
    }
}
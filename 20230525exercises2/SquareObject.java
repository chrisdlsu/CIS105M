
public class SquareObject {


    // THINGS IT KNOWS
    /**
     * @sideLength is the length of one of the square's sides
     */
    private int sideLength = 1;
    String nColor;

    // THINGS IT CAN DO
    /**
     * 
     * @return getLength gives the length of the square
     */
    public int getLength() {
        return sideLength;
    }

    public String getColor() {
        return this.nColor;
    }

    // SETTERS
    public void setLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public void setColor(String c) {
        this.nColor = c;
    }

    public int calculateArea(int nArea) {
        return this.sideLength*this.sideLength;
    }
}
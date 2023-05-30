
public class SquareObject {


    // THINGS IT KNOWS
    /**
     * @sideLength is the length of one of the square's sides
     */
    private int sideLength = 1;

    // THINGS IT CAN DO
    /**
     * 
     * @return getLength gives the length of the square
     */
    public int getLength() {
        return sideLength;
    }

    public void setLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
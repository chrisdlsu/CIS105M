public class waterBottle {

    //ATTRIBUTES
    //total: 12
    private double dCapacity, dPrice, dContentLevel;
    private String sWaterType, sBrand, sBottleType, sColor, sManufacturer;
    private int nExpiryDate, nDateManufactured;
    private boolean bIsSealed, bIsExpired; 

    //CONSTRUCTORS
    public waterBottle (
        double dCapacity, double dPrice, 
        //double dContentLevel,
        String sWaterType, String sBrand, String sBottleType, String sColor, String sManufacturer,
        int nExpiryDate, int nDateManufactured,
        boolean bIsSealed, boolean bIsExpired) {
            this.dCapacity = dCapacity;
            this.dPrice = dPrice;
            this.dContentLevel = dCapacity;
            this.sWaterType = sWaterType;
            this.sBottleType = sBottleType;
            this.sColor = sColor;
            this.sManufacturer = sManufacturer;
            this.nExpiryDate = nExpiryDate;
            this.nDateManufactured = nDateManufactured;
            this.bIsSealed = bIsSealed;
            this. bIsExpired = bIsExpired;
        };

    //METHODS
    //Getters
    public double getdCapacity() {
        return dCapacity;
    }
    public double getdPrice() {
        return dPrice;
    }
    public double getdContentLevel() {
        return dContentLevel;
    }
    public String getsWaterType() {
        return sWaterType;
    }
    public String getsBrand() {
        return sBrand;
    }
    public String getsBottleType() {
        return sBottleType;
    }
    public String getsColor() {
        return sColor;
    }
    public String getsManufacturer() {
        return sManufacturer;
    }
    public int getnExpiryDate() {
        return nExpiryDate;
    }
    public int getnDateManufactured() {
        return nDateManufactured;
    }
    public boolean bIsSealed() {
        return bIsSealed;
    }
    public boolean bIsExpired() {
        return bIsExpired;
    }

    //Setters
    public void setdContentLevel(double dContentLevel) {
        this.dContentLevel = dContentLevel;
    }
    public void setbIsSealed(boolean bIsSealed) {
        this.bIsSealed = bIsSealed;
    }
    public void setbIsExpired(boolean bIsExpired) {
        this.bIsExpired = bIsExpired;
    }

}

package Assignment;

public class WindscreenWipers extends StockItem {

    private int bladeLength;
    private String compatiblity;

    public WindscreenWipers(String stockCode, int quantity, double price,
                       int bladeLength, String compatibility) {
        super(stockCode, quantity, price);
        this.bladeLength = bladeLength;
        this.compatiblity = compatibility;
    }

    public int getBladeLength() {
        return bladeLength;
    }
    
    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    public String getCompatibility() {
        return compatiblity;
    }

    public void setCompatibility(String compatibility) {
        this.compatiblity = compatibility;
    }

    @Override
    public String getStockName() {
        return "Windscreen Wipers";
    }

    @Override
    public String getStockDescription() {
        return "Windscreen Wipers" + bladeLength + "mm - Fits" + compatiblity;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nBlade Length: " + bladeLength + "mm" +
               "\nCompatibility: " + compatiblity;
    }

 


}

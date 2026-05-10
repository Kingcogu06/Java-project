package Assignment;

public class CarTyres extends StockItem {
    private String tyreSize;
    private String tyreType;

    public CarTyres(String stockCode, int quantity, double price,
                 String tyreSize, String tyreType) {
        super(stockCode, quantity, price);
        this.tyreSize = tyreSize;
        this.tyreType = tyreType;
    }

    public String getTyreSize() {
    return tyreSize;
    }

    public void setTyreSize(String tyreSize) {
        this.tyreSize = tyreSize;
    }

    public String getTyreType() {
        return tyreType;
    }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }

    @Override
    public String getStockName() {
        return "Car Tyres";
    }

    @Override
    public String getStockDescription() {
        return tyreType + "Tyres - Size" + tyreSize;
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nTyre Size:" + tyreSize +
        "\nTyre Type:" + tyreType;
    }

}

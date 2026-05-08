package Assignment;

public class StockItem {

    private final String stockCode;
    private int quantity;
    private double price;

    public StockItem(String stockCode, int quantity, double price) {
        this.stockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
    }

    public String getStockCode() {
        return stockCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceWithoutVAT() {
        return price;
    }

    public double getPriceWithVAT() {
        return price * (1 + getVAT() / 100);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVAT() {
        return 17.5;
    }

    public String getStockName() {
        return "Unknown Stock Name";
    }

    public String getStockDescription() {
        return "Unknown Stock Description";
    }

    public void addStock(int amount) {
        if (amount < 1) {
            System.out.println("Error: Amount to sell must be at least 1");
        } else if (quantity + amount > 100) {
            System.out.println("Error: Stock cannot exceed 100 units");
        } else {
            quantity += amount;
        }
    }

    public boolean sellStock(int amount) {
        if (amount < 1) {
            System.out.println("Error: Amount to sell must be at least 1");
            return false;
        } else if (amount <= quantity) {
            quantity -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Stock Type: " + getStockName() + "\n" +
               "Description: " + getStockDescription() + "\n" +
               "Stock Code: " + getStockCode() + "\n" +
               "Price Without VAT: " + getPriceWithoutVAT() + "\n" +
               "Price With VAT: " + getPriceWithVAT() + "\n" +
               "Total unit in stock: " + getQuantity();
    }
}
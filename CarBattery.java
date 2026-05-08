package Assignment;

public class CarBattery extends StockItem {
    private int voltage;
    private int capacity;

    public CarBattery(String stockCode, int quantity, double price,
                      int voltage, int capacity) {
        super(stockCode, quantity, price);
        this.voltage = voltage;
        this.capacity = capacity;
    }
    
    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getStockName() {
        return "Car Battery";
    }

    @Override
    public String getStockDescription() {
        return "12V Car Battery" + voltage + "V" + capacity + "ah";
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nVoltage:" + voltage + "V" +
               "\nCapacity:" + capacity + "Ah";
    }
    
}

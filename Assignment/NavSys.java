package Assignment;

public class NavSys extends StockItem {
   public NavSys(String stockCode, int quantity, double price){
        super(stockCode, quantity, price);
    }
   
    @Override
    public String getStockName(){
        return "Navigation system";
    }
    // Returns the stock name

    @Override 
    public String getStockDescription(){
        return "GeoVision Sat Nav";
    }
    //Returns the stock's description
 
    @Override 
    public String toString(){
        return super.toString();
    }
    //Gives the string all the stock's details
}
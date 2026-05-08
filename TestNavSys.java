package Assignment;

public class TestNavSys{

    public static void main(String[] args){
        System.out.println("Task 1 - Creating stock item:");
        NavSys nav = new NavSys("NS101", 10, 99.99);
        System.out.println(nav.toString());
        System.out.println();
        // This creates 10 units of the naviagtion system

        System.out.println("Task 2 - Adding 10 units");
        nav.addStock(10);
        System.out.println(nav.toString());
        System.out.println();
        // This adds 10 more units on the existing 10 units of the navigation system

        System.out.println("Task 3 - Selling 2 units");
        nav.sellStock(2);
        System.out.println(nav.toString());
        System.out.println();
        // This will take the quantity of 20 and take 2 away leaving 18 in stock

        System.out.println("Task 4 - Changing the price to 100.99");
        nav.setPrice(100.99);
        System.out.println(nav.toString());
        System.out.println();
        // This changes the original price of 99.99 to 100.99

        System.out.println("Task 5 - Adding 0 units");
        nav.addStock(0);
        System.out.println();
        // This should result in an error message 
    }
}

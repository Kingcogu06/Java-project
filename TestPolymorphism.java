package Assignment;

import java.util.Scanner;

public class TestPolymorphism {

    public static void itemInstance(StockItem s) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Printing item stock information:");
        System.out.println(s);
        System.out.println();

        System.out.print("Enter number of units to add: ");
        int toAdd = scanner.nextInt();
        s.addStock(toAdd);
        System.out.println("After adding stock:");
        System.out.println(s);
        System.out.println();

        System.out.print("Enter number of units to sell: ");
        int toSell = scanner.nextInt();
        boolean sold = s.sellStock(toSell);
        if (sold) {
            System.out.println("Sale successful!");
        } else {
            System.out.println("Not enough stock");
        }
        System.out.println(s);
        System.out.println();

        System.out.print("Enter new price: ");
        double newPrice = scanner.nextDouble();
        s.setPrice(newPrice);
        System.out.println("After price change:");
        System.out.println(s);
        System.out.println();
    }

    public static void main(String[] args) {
        StockItem[] s = new StockItem[4];

        s[0] = new NavSys("NS101", 10, 99.99);
        s[1] = new CarBattery("CB101", 15, 49.99, 12, 60);
        s[2] = new CarTyres("TY101", 20, 79.99, "205/55R16", "Summer");
        s[3] = new WindscreenWipers("WW101", 30, 12.99, 600, "Ford Focus");

        for (int i = 0; i < s.length; i++) {
            System.out.println("========================================");
            System.out.println("Testing item " + (i + 1) + ":");
            System.out.println("========================================");
            itemInstance(s[i]);
        }
    }
}
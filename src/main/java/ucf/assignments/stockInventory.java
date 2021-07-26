package ucf.assignments;

import java.util.Scanner;
import java.util.*;

public class stockInventory {

    public stockInventory(String stockName, String stockRating, int stockPrice, int numberShares, String serialNumber) {
    }

    public class StockInventory {

        private static final int INVENTORY_SIZE = 150;
        private stock [] stocks;

        public StockInventory() {
            stocks = new stock [INVENTORY_SIZE];

        }

        private static void StockInventory()
        {
            stockInventory fallInventory;

            for (int i = 0; i<INVENTORY_SIZE; i++){
                Scanner console = new Scanner(System.in);

                System.out.println ("Stock's name:");
                String stockName = console.next();

                System.out.println ("Stock's rating");
                String stockRating= console.next();

                System.out.println ("Stock's price:");
                int stockPrice = console.nextInt();

                System.out.println ("Numbers of shares: ");
                int numberShares = console.nextInt();

                System.out.println ("The Serial Number Is: ");
                String serialNumber = console.next();

                fallInventory [i]= new stockInventory(stockName, stockRating, stockPrice, numberShares, serialNumber);
            }

            public static void main(String[] args)
            {
                StockInventory();



            }
        }
    }
}

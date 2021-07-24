package ucf.assignments;

import java.util.Scanner;

public class stockInventory {
    import java.util.*;

    public class StockInvetory {

        private static final int INVENTORY_SIZE = 100;
        private stock [] stocks;

        public StockInvetory() {
            stocks = new stock [INVENTORY_SIZE];

        }

        private static void StockInventory() {
            for (int i = 0; i<INVENTORY_SIZE; i++){
                Scanner console = new Scanner(System.in);

                System.out.println ("Stock's name:");
                String stockName = console.next();

                System.out.println ("Stock's rating");
                String stockRating= console.next();

                System.out.println ("Stock's price:");
                int stockPrice = console.nextInt();

                System.out.println ("Numbers of shares: ");
                int numberShares= console.nextInt();

                stocks [i]= new stock(stockName, stockRatings, stockPrice, numberShares);
            }

            public static void main (String [] args){
                StockInventory();



            }
}

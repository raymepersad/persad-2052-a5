package ucf.assignments;

public class stock {
        private String companyName;
        private String stockRating;
        private int price;
        private int numberOfShares;
        private String serialNumber;

        public String getCompanyName() {
            return companyName;
        }

        public String getStockRating() {
            return stockRating;
        }

        public int getPrice() {
            return price;
        }

        public int getNumberOfShares() {
            return numberOfShares;
        }

        public String getSerialNumber(){
            return serialNumber;
        }

        public stock(String companyName, String stockRating, int price, int numberOfShares, String serialNumber) {
            super();
            this.companyName = companyName;
            this.stockRating = stockRating;
            this.price = price;
            this.numberOfShares = numberOfShares;
            this.serialNumber = serialNumber;
        }
}

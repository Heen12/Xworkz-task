public class Method_OverloadingSession {

    public static void main(String[] args) {
       
        displayBeverageDetails("Cappuccino");
        displayBeverageDetails("Latte", 250);
        displayBeverageDetails("Green Tea", 180, "Tea Lounge");

        addBeverageInventory("Cappuccino", 250);
        addBeverageInventory("Latte", 250, 20);
        addBeverageInventory(180, 50);
        addBeverageInventory(225.75, 15);

        
        processOrder("Aarav", 1200);
        processOrder("Aarav", "Latte", 1200);
        processOrder("Aarav", "Green Tea", 1000, "Takeaway");
        processOrder(1000, "Aarav");

        System.out.println("Total beverage bill: " + calculateTotalBill(1200, 250, 180, 1000, 250));
    }


    public static void displayBeverageDetails(String beverageName) {
        System.out.println("Beverage: " + beverageName);
    }

    public static void displayBeverageDetails(String beverageName, int price) {
        System.out.println("Beverage: " + beverageName + ", Price: Rs. " + price);
    }

    public static void displayBeverageDetails(String beverageName, int price, String cafeName) {
        System.out.println("Beverage: " + beverageName + ", Price: Rs. " + price + ", Cafe: " + cafeName);
    }

 
    public static void addBeverageInventory(String beverageName, int price) {
        System.out.println("Beverage: " + beverageName + ", Price: Rs. " + price);
    }

    public static void addBeverageInventory(String beverageName, int price, int quantity) {
        System.out.println("Beverage: " + beverageName + ", Price: Rs. " + price + ", Quantity: " + quantity);
    }


    public static void addBeverageInventory(double price, int quantity) {
        System.out.println("Price per unit: Rs. " + price + ", Quantity: " + quantity);
    }

   
    public static void processOrder(String customerName, int amount) {
        System.out.println("Customer: " + customerName + ", Order Amount: Rs. " + amount);
    }

    public static void processOrder(String customerName, String beverageName, int amount) {
        System.out.println("Customer: " + customerName + ", Ordered: " + beverageName + ", Order Amount: Rs. " + amount);
    }

    public static void processOrder(String customerName, String beverageName, int amount, String orderType) {
        System.out.println("Customer: " + customerName + ", Ordered: " + beverageName + ", Order Amount: Rs. " + amount + ", Order Type: " + orderType);
    }

    public static void processOrder(int amount, String customerName) {
        System.out.println("Order Amount: Rs. " + amount + ", Customer: " + customerName);
    }

    public static int calculateTotalBill(int... prices) {
        int total = 0;
        for (int price : prices) {
            total += price;
        }
        return total;
    }
}

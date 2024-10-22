public class VehicleString {
    public static void main(String[] args) {
        String car = "toyota";
        String cars = new String("toyota"); 
        String plane = new String("airbus");
        String train = new String("shinkansen");
        String boat = new String("sailboat");
        String motorcycle = new String("harley");
        String scooter = new String("vespa");
        String bicycle = new String("giant");
        String hovercraft = new String("hover");
        String tricycle = new String("trident");
        String moped = new String("yamaha");
        String electricScooter = new String("segway");
        String car2 = "nissan";
        String car3 = "mazda";
        String car4 = "honda";
        String car5 = "ferrari";
        String car6 = "porsche";
        String car7 = "ford";
        String car8 = "chevrolet";
        String car9 = "dodge";
        String car10 = "tesla";

        System.out.println(car == cars); 

        System.out.println(car.equals(cars)); 

        char[] myCharArray = car.toCharArray();
        String reversedCar = "";
        for (int i = myCharArray.length - 1; i >= 0; i--) {
            reversedCar = reversedCar + myCharArray[i];
        }
        System.out.println(reversedCar); 
}
}

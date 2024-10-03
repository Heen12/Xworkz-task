public class Task4 {

    public static void main(String[] args) {
        
        System.out.println("Byte returned: " + getByteValue());
        System.out.println("Short returned: " + getShortValue());
        System.out.println("Int returned: " + getIntValue());
        System.out.println("Long returned: " + getLongValue());
        System.out.println("Float returned: " + getFloatValue());
        System.out.println("Double returned: " + getDoubleValue());
        System.out.println("Char returned: " + getCharValue());
        System.out.println("Boolean returned: " + getBooleanValue());
    }

   
    public static byte getByteValue() {
        System.out.println("Declaring a byte value");
        byte value = 10;
        System.out.println("Returning a byte value");
        return value;
    }

   
    public static short getShortValue() {
        System.out.println("Declaring a short value");
        short value = 100;
        System.out.println("Returning a short value");
        return value;
    }

   
    public static int getIntValue() {
        System.out.println("Declaring an int value");
        int value = 1000;
        System.out.println("Returning an int value");
        return value;
    }

 
    public static long getLongValue() {
        System.out.println("Declaring a long value");
        long value = 10000L;
        System.out.println("Returning a long value");
        return value;
    }

   
    public static float getFloatValue() {
        System.out.println("Declaring a float value");
        float value = 10.5f;
        System.out.println("Returning a float value");
        return value;
    }

 
    public static double getDoubleValue() {
        System.out.println("Declaring a double value");
        double value = 100.55;
        System.out.println("Returning a double value");
        return value;
    }


    public static char getCharValue() {
        System.out.println("Declaring a char value");
        char value = 'A';
        System.out.println("Returning a char value");
        return value;
    }

    public static boolean getBooleanValue() {
        System.out.println("Declaring a boolean value");
        boolean value = true;
        System.out.println("Returning a boolean value");
        return value;
    }
}

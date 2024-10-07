public class Task5{

    public static void main(String[] args) {
      
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Integer Array Operations:");
        printArrayOperations(intArray);

        double[] doubleArray = {1.543, 2.557, 13.655, 84.645, 85.65, 956.55, 67.575, 68.875, 39.855, 10.971};
        System.out.println("\nDouble Array Operations:");
        printArrayOperations(doubleArray);

       
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        System.out.println("\nCharacter Array Operations:");
        printArrayOperations(charArray);

      
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.1f};
        System.out.println("\nFloat Array Operations:");
        printArrayOperations(floatArray);

       
        long[] longArray = {5231, 5362, 87353, 47674, 75535, 45646, 64577, 54538, 64679, 86310};
        System.out.println("\nLong Array Operations:");
        printArrayOperations(longArray);
    }

   
    public static void printArrayOperations(int[] array) {
        System.out.println("Printing from left to right:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from right to left:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from middle to right:");
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from middle to left:");
        for (int i = (array.length / 2) - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Printing by skipping 1 index:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }

   
    public static void printArrayOperations(double[] array) {
        System.out.println("Printing from left to right:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from right to left:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from middle to right:");
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from middle to left:");
        for (int i = (array.length / 2) - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Printing by skipping 1 index:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }

  
    public static void printArrayOperations(char[] array) {
        System.out.println("Printing from left to right:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from right to left:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from middle to right:");
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from middle to left:");
        for (int i = (array.length / 2) - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Printing by skipping 1 index:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }

   
    public static void printArrayOperations(float[] array) {
        System.out.println("Printing from left to right:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from right to left:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from middle to right:");
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from middle to left:");
        for (int i = (array.length / 2) - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Printing by skipping 1 index:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }

    
    public static void printArrayOperations(long[] array) {
        System.out.println("Printing from left to right:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from right to left:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from middle to right:");
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Printing from middle to left:");
        for (int i = (array.length / 2) - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Printing by skipping 1 index:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        sayHello();
        greetUser("Heena");
        userInfo("Heena", 23);
        calculateSum();
        calculateMul();
        calculateDiv();
        System.out.println("Is 15 even? " + isEven(15));
        calculateMode();
        System.out.println("Square of 5: " + calculateSquare(5));
        System.out.println("The maximum of 10 and 20 is: " + findMax(10, 20));

    }

    public static void sayHello() {
        System.out.println("Hey! This is Heena");

    }

    public static void greetUser(String name) {
        System.out.println("hello " + name);
    }

    public static void userInfo(String name, int age) {
        System.out.println("Name: " + name + " And" + " Age: " + age);
    }

    public static void calculateSum() {
        int value1 = 10;
        int value2 = 15;
        int sum = value1 + value2;
        System.out.println("Sum is: " + sum);

    }

    public static void calculateMul() {
        int valueMulValue1 = 10;
        int valueMulVale2 = 5;
        int mul = valueMulValue1 * valueMulVale2;
        System.out.println("Multiplication value is: " + mul);

    }

    public static void calculateDiv() {
        int valueDivValue1 = 100;
        int valueDivVale2 = 5;
        int div = valueDivValue1 / valueDivVale2;
        System.out.println("Divided value is: " + div);

    }

    public static void calculateMode() {
        int valueMod = 10;
        int valueMod1 = 15;
        int mod = valueMod % valueMod1;
        System.out.println("Modulus of " + valueMod + " and " + valueMod1 + " is: " + mod);

    }

    public static boolean isEven(int num) {
        return num % 2 == 0;

    }

    public static int calculateSquare(int num) {
        return num * num;

    }

    public static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}

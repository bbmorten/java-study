package samples;

public class Literals {
    public static void main(String[] args) {

        // Text Literals
        System.out.println("Hello, World!");
        System.out.print("Hello");
        System.out.print("World");
        System.out.print("\n");
        System.out.print("Hello\n");
        System.out.print("World");
        System.out.print("\n");

        System.out.println("Mike said \"Hello\" to me.");

        System.out.println("First\tSecond\tThird");
        System.out.println("Bulent\tVolkan\tDuygu");

        // Integer Literals

        System.out.println(123);
        System.out.println(0123);
        System.out.println(0x123);
        System.out.println(0b1010);

        // Floating Point Literals

        System.out.println(3.14);
        System.out.println(3.14F);
        System.out.println(3.14D);
        System.out.println(3.14E2);
        System.out.println(3.14E-2);

        // Max Values of all literals

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        // 1. Declare a byte, short, int, and long variable, and initialize them.
        byte myByte = 10;
        short myShort = 500;
        int myInt = 50000;
        long myLong = 5000000000L; // Note the 'L' at the end. It indicates a long literal.

        // 2. Declare a float and double variable and initialize them.
        float myFloat = 5.5f; // Note the 'f' at the end. It indicates a float literal.
        double myDouble = 50.5;

        // 3. Declare a char variable and initialize it.
        char myChar = 'A';

        // 4. Declare a boolean variable and initialize it.
        boolean myBoolean = true;

        // 5. Print out all the variables.
        System.out.println("Byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("Int value: " + myInt);
        System.out.println("Long value: " + myLong);
        System.out.println("Float value: " + myFloat);
        System.out.println("Double value: " + myDouble);
        System.out.println("Char value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);

    }
}

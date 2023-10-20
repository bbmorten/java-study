package samples;

public class OutputFormatting {
    public static void main(String[] args) {

        // Decimal Formatting
        System.out.printf("%d\n", 123);
        System.out.printf("%d\n", 0123);
        System.out.printf("%d\n", 0x123);
        System.out.printf("%6d\n", 0b1010);

        System.out.println(2.3f);
        System.out.printf("%.2f", 2.3f);
        System.out.println();
        System.out.printf("%.4f", 2.3f);
        System.out.println();

        // Thousands Separator

        System.out.printf("%,d\n", 123456789);
        System.out.printf("%,.2f\n", 123456789.123456789);

        // Currency Formatting

        System.out.printf("TRY%,d\n", 123456789);
        System.out.printf("TRY%,.2f\n", 123456789.123456789);

        // Spacing and alignment

        System.out.printf("%6d\n", 123);
        System.out.printf("%-6d\n", 123);
        System.out.printf("%06d\n", 123);
        System.out.printf("%+6d\n", 123);
        System.out.printf("%+6d\n", -123);
        System.out.printf("%+6d\n", 0);

        System.out.println("Hello!");
        System.out.printf("|%20s|", "Hello!");
        System.out.println();
        System.out.printf("|%-20s|", "Hello!");
        System.out.println();
        System.out.printf("|%-20s|", "Hello, this is a long sentence.!");
        System.out.println();

        System.out.printf("|%-20.20s|", "Hello, this is a long sentence.!");
        System.out.println();

        // Multiple Items in Formatters

        System.out.printf("%d %f %s\n", 123, 2.3f, "Hello!");
        System.out.printf("%-10s $%.2f\n", "Apples", 1.4f);
        System.out.printf("%-10s $%.2f\n", "Brownies", 0.8f);
        
        // Comments

        // Line comment
        // System.out.printf("%-10s $%.2f\n", "Brownies", 0.8f);
        
        /* Block comment
        * System.out.printf("%d %f %s\n", 123, 2.3f, "Hello!");
        * System.out.printf("%-10s $%.2f\n", "Apples", 1.4f);
        * System.out.printf("%-10s $%.2f\n", "Brownies", 0.8f);
        */
    }

}

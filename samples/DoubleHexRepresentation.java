package samples;

public class DoubleHexRepresentation {
    public static void main(String[] args) {
        double myDouble = 123.0;

        // Convert double to long bits
        long doubleAsLong = Double.doubleToLongBits(myDouble);

        // Convert long to hex string
        String hexRepresentation = Long.toHexString(doubleAsLong);

        System.out.println("Double value: " + myDouble);
        System.out.println("Hex representation: " + hexRepresentation);
    }
}

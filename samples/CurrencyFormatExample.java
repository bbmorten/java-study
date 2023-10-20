package samples;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatExample {
    public static void main(String[] args) {
        double amount = 1234567.89;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat engFormat = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat gerFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat trFormat = NumberFormat
                .getCurrencyInstance(new Locale.Builder().setLanguage("tr").setRegion("TR").build());
        NumberFormat rusFormat = NumberFormat
                .getCurrencyInstance(new Locale.Builder().setLanguage("ru").setRegion("RU").build());


        System.out.println("USA format: " + usFormat.format(amount));
        System.out.println("Turkish format: " + trFormat.format(amount));
        System.out.println("UK format: " + engFormat.format(amount));
        System.out.println("Germany format: " + gerFormat.format(amount));
        System.out.println("Russian format: " + rusFormat.format(amount));
    }
}
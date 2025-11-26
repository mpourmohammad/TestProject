import java.text.NumberFormat;

public class NumberFormattest {
    public static void main(String[] args) {
        NumberFormat currency =  NumberFormat.getCurrencyInstance();
        System.out.print(currency.format(352342));
    }
}
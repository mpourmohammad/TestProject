import java.util.Scanner;

public class ClassYazdan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("سن خودتو وارد کن یزدان : ");
        int age = input.nextInt();


        if (age < 18) {
            System.out.println("تو نمیتونی callOf بازی کنی");
        } else
            System.out.println("تو مجاز هستی بازی کنی");

    }
}

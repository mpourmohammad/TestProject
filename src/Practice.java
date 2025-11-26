import java.awt.*;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("یک عدد وارد کنید : ");
        int number  = input.nextInt();

        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- منو ---");
            System.out.println("1 - تشخیص مثبت/منفی/صفر");
            System.out.println("2 - تشخیص زوج یا فرد");
            System.out.println("3 - محاسبه فاکتوریل");
            System.out.println("4 - خروج");
            System.out.print("گزینه را وارد کنید: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (number > 0) {
                        System.out.println("عدد مثبت است.");
                    } else if (number < 0) {
                        System.out.println("عدد منفی است.");
                    } else {
                        System.out.println("عدد صفر است.");
                    }
                    break;

                case 2:
                    if (number % 2 == 0) {
                        System.out.println("عدد زوج است.");
                    } else {
                        System.out.println("عدد فرد است.");
                    }
                    break;

                case 3:
                    int fact = 1;
                    int temp = Math.abs(number);
                    int i = 1;

                    while (i <= temp) {
                        fact *= i;
                        i++;
                    }

                    System.out.println("فاکتوریل عدد (به‌صورت قدرمطلق): " + fact);
                    break;

                case 4:
                    System.out.println("خروج از برنامه.");
                    break;

                default:
                    System.out.println("گزینه نامعتبر است!");
            }
        }

    }
}
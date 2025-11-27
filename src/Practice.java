import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("یک عدد وارد کنید: ");
        int number = input.nextInt();

        int choice;
        do {
            printMenu();
            choice = input.nextInt();
            handleChoice(choice, number);
        } while (choice != 4);

        input.close();
    }

    private static void printMenu() {
        System.out.println("\n--- منو ---");
        System.out.println("1 - تشخیص مثبت/منفی/صفر");
        System.out.println("2 - تشخیص زوج یا فرد");
        System.out.println("3 - محاسبه فاکتوریل");
        System.out.println("4 - خروج");
        System.out.print("گزینه را وارد کنید: ");
    }

    private static void handleChoice(int choice, int number) {
        switch (choice) {
            case 1:
                checkSign(number);
                break;

            case 2:
                checkEvenOdd(number);
                break;

            case 3:
                System.out.println("فاکتوریل عدد (قدر مطلق): " + factorial(Math.abs(number)));
                break;

            case 4:
                System.out.println("خروج از برنامه.");
                break;

            default:
                System.out.println("گزینه نامعتبر است!");
        }
    }

    private static void checkSign(int num) {
        if (num > 0) {
            System.out.println("عدد مثبت است.");
        } else if (num < 0) {
            System.out.println("عدد منفی است.");
        } else {
            System.out.println("عدد صفر است.");
        }
    }

    private static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("عدد زوج است.");
        } else {
            System.out.println("عدد فرد است.");
        }
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
}
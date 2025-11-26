import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Age:");
        byte age = sc.nextByte();
        System.out.println("Name:");
        String name = sc.next();

        System.out.println("You are Age :" + age + "| And Name is : " + name);
    }
}

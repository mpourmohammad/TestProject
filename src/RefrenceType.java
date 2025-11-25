import java.awt.*;
import java.util.Date;

public class RefrenceType {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = p1;

        p1.x = 2;
        System.out.println(p2);
    }
}

package arisa;
import java.lang.*;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        double r;
        Circle k1 = new Circle(4.1, 3.8, 7.6, "green");
        System.out.println("ДО = " + k1.getLength() + "см\n");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина окружности = " + k1.getLength() + "см");
    }
}

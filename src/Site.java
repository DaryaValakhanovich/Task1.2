import java.util.Scanner;

public class Site {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину первеого дома");
        int a = scanner.nextInt();
        System.out.println("Введите ширину первого дома");
        int b = scanner.nextInt();
        System.out.println("Введите длину второго дома");
        int c = scanner.nextInt();
        System.out.println("Введите ширину второго дома");
        int d = scanner.nextInt();
        System.out.println("Введите длину участка");
        int e = scanner.nextInt();
        System.out.println("Введите ширину участка");
        int f = scanner.nextInt();

        if(a * b * c * d * e * f > 0) {
            if (a + c <= e && b + d <= f) {
                System.out.println("Дома помещаются на участке");
            } else {
                System.out.println("Дома не помещаются на участке");
            }
        } else {
            System.out.println("Введены неверные данные");
        }
    }
}

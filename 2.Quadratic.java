import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("The equation has two distinct roots: " + root1 + " and " + root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }

        scanner.close();
    }
}
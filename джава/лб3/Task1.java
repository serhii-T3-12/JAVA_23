import java.util.Scanner;

public class Task1 {
    public Task1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for i: ");
        double i = scanner.nextDouble();
        System.out.print("Enter the value for z: ");
        double z = scanner.nextDouble();
        System.out.print("Enter the value for k: ");
        double k = scanner.nextDouble();
        double sum = 0.0;

        for (int kCounter = 1; kCounter < 15; ++kCounter) {
            sum += calculateFunction(i, z, kCounter);
        }

        System.out.println("Result: " + sum);
    }

    private static double calculateFunction(double z, double i, int k) {
        return (1 / Math.sqrt(z * i) + Math.tan(k / i));
    }
}

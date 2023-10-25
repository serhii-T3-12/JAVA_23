import java.util.Scanner;

public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення для ε (ε > 0): ");
        double epsilon = scanner.nextDouble();
        if (epsilon <= 0.0) {
            throw new IllegalArgumentException("ε повинно бути більше за 0");
        } else {
            double sum = calculateInfiniteSum(epsilon);
            System.out.println("Результат: " + sum);
        }
    }

    public static double calculateInfiniteSum(double epsilon) {
        double sum = 0.0;
        int i = 1;

        double term;
        do {
            term = 1.0 / Math.pow((double)i, 2.0);
            sum += term;
            ++i;
        } while(Math.abs(term) >= epsilon);

        return sum;
    }
}

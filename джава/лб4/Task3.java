public class Task3 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5}; // Ваш масив A(n)
        int[] B = {6, 7, 8, 9, 10}; // Ваш масив B(n)

        int n = A.length; // Розмір масивів A та B
        int[] C = new int[2 * n]; // Масив C(2n) з двічі більшою довжиною

        for (int i = 0; i < n; i++) {
            C[2 * i] = A[i]; // Додаємо елементи масиву A на парних позиціях
            C[2 * i + 1] = B[i]; // Додаємо елементи масиву B на непарних позиціях
        }

        // Виводимо масив C
        for (int value : C) {
            System.out.print(value + " ");
        }
    }
}

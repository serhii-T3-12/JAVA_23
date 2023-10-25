public class Task1 {
    public static void main(String[] args) {
        int[] array = {5, 12, 3, 8, 221, 9, 15, 4}; // Ваш масив цілих чисел
        int min = findMin(array); // Знаходимо найменший елемент
        int max = findMax(array); // Знаходимо найбільший елемент

        int difference = max - min; // Обчислюємо різницю

        System.out.println("Найбільший елемент: " + max);
        System.out.println("Найменший елемент: " + min);
        System.out.println("Різниця: " + difference);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

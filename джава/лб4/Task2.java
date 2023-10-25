public class Task2 {
    public static void main(String[] args) {
        int[] array = {-5, 12, -8, 7, -10, -3, 6, -8, -10}; // Ваш масив цілих чисел

        int sum = 0; // Змінна для суми від'ємних чисел, що діляться на 2
        int count = 0; // Лічильник підходящих елементів

        for (int number : array) {
            if (number < 0 && number % 2 == 0) {
                sum += number;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("У масиві немає від'ємних чисел, що діляться на 2.");
        } else {
            double average = (double) sum / count; // Обчислення середнього арифметичного
            System.out.println("Середнє арифметичне від'ємних чисел, що діляться на 2: " + average);
        }
    }
}

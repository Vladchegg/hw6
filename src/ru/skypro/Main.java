package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача 2
        int min = arr[0];
        int max = arr[0];
        for (int b : arr) {
            if (b < min) {
                min = b;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");


     // Задача 3
    double average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

    // Задача 4
    char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int n = reverseFullName.length - 1; n >= 0; n--) {
            System.out.print(reverseFullName[n]);

        }

    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;



    }
}

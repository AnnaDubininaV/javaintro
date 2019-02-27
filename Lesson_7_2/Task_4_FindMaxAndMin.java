package Lesson_7_2;

public class Task_4_FindMaxAndMin {
    public static void main(String[] args) {

        int[] arr = {3, 6, 2, 8, 16, 90, 45, 21, 55, 7, 31};

        int max = arr[0];
        int min = arr [0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("Максимальный элемент: " + max + "\nМинимальный элемент: " + min);
    }
}

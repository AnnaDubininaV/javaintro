package Lesson_7_2;

public class Task_1_2 {
    public static void main(String[] args) {

        int[] myArray = {50, 3, 2, 8, 16, 90, 45, 580, 21, 55, 7, 350};

        findEvenAndOddElements(myArray);
        findPrimeNum(myArray);

    }

    public static void findEvenAndOddElements(int[] arr) {
        System.out.print("Четные числа: \t");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Нечетные числа: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void findPrimeNum(int[] arr) {
        int [] num = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("\nПростые числа: \t");

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < num.length; j++){
                if (arr[i]==(int)(Math.pow(2, num[j]) - 1)) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
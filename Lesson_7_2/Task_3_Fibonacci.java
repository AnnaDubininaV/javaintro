package Lesson_7_2;

public class Task_3_Fibonacci {
    public static void main(String[] args) {

        int[] fib = new int[20];
        for (int i = 0; i < fib.length; i++) {
            fib[i] = 1;
            if (i >= 2) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.print(fib[i] + " ");
        }
    }
}

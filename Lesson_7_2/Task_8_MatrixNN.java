package Lesson_7_2;

public class Task_8_MatrixNN {
    public static void main(String[] args) {
        int numbers = 32;
        int m = 1;

        while ((m * m) < numbers){
            m++;
        }

        for (int i= 1; i < numbers; i++){
            System.out.print(i + "\t");
            if (i % m == 0) {
                System.out.println();
            }
        }
    }
}

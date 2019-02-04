package Lesson_4;

public class DoWhile {
    public static void main(String[] args) {
        int count = 1;
        int i = 1;

        do {
            System.out.println("Номер числа: " + count + ", число " + i++ * 7);
            count++;
        }
        while (count < 16);
    }
}

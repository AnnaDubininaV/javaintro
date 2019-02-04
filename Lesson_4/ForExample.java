package Lesson_4;

public class ForExample {
    public static void main(String[] args) {

//        int i = 1;
//        for (int count = 1; count < 16 ; count++ )
////            System.out.println("Номер числа: " + count  + " Число " + i++ *7 );

        int count = 1;
        for (int i = 1; count <16; i++) {
            if (i%7==0)
                System.out.println("Номер числа: " + count++ + " число: " + i);
        }

    }
}

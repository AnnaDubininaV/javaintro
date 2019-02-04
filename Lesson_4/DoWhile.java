package Lesson_4;

public class DoWhile {
    public static void main(String[] args) {
        int count = 1;
        int i = 1;


        do {
            if (i%7==0){
            System.out.println("Номер числа: " + count ++ + ", число " + i++);
            } else i++;
        }
            while ( count < 16 );

//        do {
//            System.out.println("Номер числа: " + count + ", число " + i++ * 7);
//            count++;
//        }
//        while (count < 16);
    }
}

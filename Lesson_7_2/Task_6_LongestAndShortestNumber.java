package Lesson_7_2;

import java.util.Arrays;

public class Task_6_LongestAndShortestNumber {
    public static void main(String[] args) {

        int[] myArray = {50, 2, 8, 16, 45, 580, 21, 35880};
        int [] count = new int [myArray.length];

        Arrays.sort(myArray);

        for (int i = 0; i < myArray.length; i++){
            int temp = myArray[i];
            while (temp > 0){
                temp = (temp / 10);
                ++count[i];
            }
            if (count[i] == 1){
                System.out.println("Самое короткое число " + myArray[i] + ", колличество цифр " + count[i]);
            }
        }
        for (int j = 0; j < count.length; j++){
            int max = count[count.length - 1];
            if (count[j] == max) {
                System.out.println("Самое длинное число " + myArray[j] + ", колличество цифр " + count[j]);
            }
        }
    }
}

package Lesson_7_2;

public class Task_7 {
    public static void main(String[] args) {
        int[] array = {688, 522, 12345};

        for (int i = 0; i < array.length; i++) {
            if (checkNumber(array[i])){
                System.out.println("Число " + array[i] + " состоит только из различных цифр");
            }
        }
    }

    public static boolean checkNumber (int number){
        int [] count = new int[10];
        boolean result = true;
        int temp = number;

        for (int i = 0; i < count.length; i++){
            while (temp != 0) {
                int value = temp % 10;
                temp = temp / 10;
                count [value] += 1;

                if (count[value] > 1) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}








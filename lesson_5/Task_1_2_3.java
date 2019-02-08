package lesson_5;


public class Task_1_2_3 {
    public static void main (String[] args) {

        int[] array = new int[] {1, 8, 2, 15, 3, 18, 6};

//        Задание 1, 2
//        1. Найти индекс элемента, значение которого равно 15.
//        2. То же самое, но чтобы 15 не было в массиве (for) & while.
//
        int index = findIndex(array, 7);
        if (index == -1) {
            System.out.println("Элемент с заданным значением не найден");
        } else System.out.println("Индекс элемента со значением " + array[index] + ": " + index);


//        Задание 1, 2
//        1. Найти индекс элемента, значение которого равно 15.
//        2. То же самое, но чтобы 15 не было в массиве  (while).

//        int index = findIndexWhile(array, 7);
//        if (index == -1) {
//            System.out.println("Элемент с заданным значением не найден");
//        } else System.out.println("Индекс элемента со значением " + array[index] + ": " + index);


//        Задание 3
//        Пройтись по массиву и напечатать каждый 2й элемент в консоль.

//        displayOddIndex(array);

    }






    public static int findIndex(int[] arr, int number) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
                return i;
        }
        return -1;
    }

    public static int findIndexWhile(int[] arr, int number) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == number){
                return i;
            } ++i;
        } return -1;

    }

    public static void displayOddIndex(int[] arr) {

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0)
                if (i+1 >=arr.length-1)
                    System.out.print ( arr[i] + "]" );
                else System.out.print ( arr[i] + "," );

        }
    }
}




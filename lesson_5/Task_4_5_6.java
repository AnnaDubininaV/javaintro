package lesson_5;

public class Task_4_5_6 {
    public static void main(String[] args) {
        int[] myArray = new int[]{15, 8, 2, 1, 22, 5, 108, 23};

//      Задание 4
//      Найти максимальный элемент в массиве.

//      int  maxElement = findMaxElement(myArray);
//      System.out.println("Максимальный элемент в массиве: " + maxElement);

//      Задание 5
//      Вывести все элементы на консоль по порядку в формате [1,2,3,4,5]

//        printArray(myArray);

//      Task_6
//      Тоже самое только в обратном

        int [] reversedArray = reversArray(myArray);
        printArray(reversedArray);

//        int[]newArray = new int[myArray.length];
//        for(int  i=0, j = newArray.length-1; i<myArray.length; i++, j--){
//            newArray [j] = myArray [i];
//        } ;

    }



    public static int findMaxElement(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                max = arr[i];
            } i++;
        } return max;
    }


    public static void  printArray (int[] arrayToPrint) {
        System.out.print("[");

        for (int i = 0; i <arrayToPrint.length; i++) {
            if (i==arrayToPrint.length-1){
                System.out.print(arrayToPrint[i] + "]"); break;
            } else
            System.out.print ( arrayToPrint[i] + "," );
        }
    }


    public static int[] reversArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0, j = newArray.length - 1; i < arr.length; i++, j--) {
            newArray[j] = arr[i];

        }return newArray;
    }
}
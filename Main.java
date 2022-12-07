package sorting;

public class Main {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;
        boolean sorted = false;
        int[] temp;
        int[][] myArray = new int[rows][columns];
        createArray(myArray);
        System.out.println("Unsorted 2D array: ");
        printArray(myArray);

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (countEven(myArray[i]) > countEven(myArray[i + 1])) {
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Sorted 2D array: ");
        printArray(myArray);
    }

    static int countEven(int[] array) {
        int sumOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumOfEven += array[i];
            }
        }
        return sumOfEven;
    }
    static void createArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}

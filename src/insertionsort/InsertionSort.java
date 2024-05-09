package insertionsort;

public class InsertionSort {


    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 5, 6};
        System.out.println("Before");
        printArray(numbers);
        insertionSort(numbers);
        System.out.println("after");
        printArray(numbers);

    }

    private static  void printArray(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];

            // moving to the beginning of the array
            int j = i - 1;
            while (j >= 0 && arr[j] > currentValue) {
                // take the value backward
                arr[j + 1] = arr[j];
                j--;
            }
            // add the first sorted array back to it's position
            arr[j + 1] = currentValue;

        }
    }

}

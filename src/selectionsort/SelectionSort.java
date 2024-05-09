package selectionsort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 8, 6};
        System.out.println("Before" + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("after" + Arrays.toString(numbers));


    }

    private static void selectionSort(int[] arr){
        int length = arr.length;
        for(int i = 0; i< length - 1; i++){
            int minValue = arr[i];
            int indexOfMin = i;

            // iterate through the sub array
            for (int j = i + 1; j < length; j++) {
                if(arr[j] < minValue ){
                    // we have found a new min number
                    minValue = arr[j];
                    indexOfMin = j;
                }
            }

            // Swapping
            int temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;

        }
    }
}

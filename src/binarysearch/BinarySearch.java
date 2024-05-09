package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearchIterative(numbers, 10));
        System.out.println(recursiveBinarySearch(numbers,  0, numbers.length, 2));
    }

    /**
     * Iterative method
     *
     * @param numbers
     * @param numberToFind
     * @return
     */
    private static int binarySearchIterative(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middlePoint = (low + high) / 2;
            if (numbers[middlePoint] == numberToFind) {
                return middlePoint;
            }

            if (numberToFind < numbers[middlePoint]) {
                high = middlePoint - 1;
            } else {
                low = middlePoint + 1;
            }
        }
        return -1;
    }

    /**
     * Recursive method
     *
     * @return
     */
    public static int recursiveBinarySearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == target) {
                return mid;
            }

            // If element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > target) {
                return recursiveBinarySearch(arr, left, mid - 1, target);
            }

            // Else the element can only be present in right subarray
            return recursiveBinarySearch(arr, mid + 1, right, target);
        }

        // Element is not present in the array
        return -1;
    }

}

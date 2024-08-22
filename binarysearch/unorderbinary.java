package binarysearch;

public class unorderbinary {
    
    public static void main(String[] args) {
        int[] arr = {90, 75, 18, 12, 6, 4, 3, 1};
        int target = 3;
        System.out.println(searching(arr, target));  // Should print the index of the target, which is 6
    }

    static int searching(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean asc = arr[start] < arr[end];  // Determine if the array is in ascending or descending order
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            
            if (asc) {  // Ascending order logic
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {  // Descending order logic
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;  // Target not found
    }
}

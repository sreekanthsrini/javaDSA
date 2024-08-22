package practiceArray;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[]arr={3,4,5,6,7,8,};
        int start=0;
        int end=arr.length-1;
        System.out.println("before"+Arrays.toString(arr));
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        System.out.println("after"+Arrays.toString(arr));

        
    }
    
}

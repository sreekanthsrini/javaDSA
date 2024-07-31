package practiceArray;

import java.util.Arrays;

public class swaparr {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println("before"+arr[1]+" "+arr[5]);
        // we want to swap 2 and 6
        int temp=arr[1];
        arr[1]=arr[5];
        arr[5]=temp;
    //     System.out.println("after"+arr[1]+" "+arr[5]);
    System.out.println(Arrays.toString(arr));
    }
    
}

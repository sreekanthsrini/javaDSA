package practiceArray;

import java.util.Arrays;
import java.util.Scanner;

public class maxval {
    public static void main(String[] args) {
        int[]arr=new int[6];
        Scanner sc=new Scanner(System.in);
       
        int max=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else{
                System.out.println(max);
            }
            
        }
    }
    
}

package practiceArray;

import java.util.Arrays;
import java.util.Scanner;

public class reversearr {

    public static void main(String[] args) {
        int []arr=new int[6];
        Scanner sc=new Scanner(System.in);
        // int start;
        // int end;
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("before"+Arrays.toString(arr));
       int  start=0;
        int end=arr.length-1;
        while(start<end){
            if(start<end){
                int temp=start;
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
        }
        // else{
        //     System.out.println("Aftre"+Arrays.toString(arr));

        // }

        
           
            
           
            

        }
        System.out.println("Aftre"+Arrays.toString(arr));
       
    }
    
}

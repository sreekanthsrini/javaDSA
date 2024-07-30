import java.util.Arrays;
import java.util.Scanner;

public class iofunctio2d {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[3][3];
        // getting input using loop
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
            // for output
            // for(int row =0;row<arr.length;row++){
            //     for(int col = 0;col<arr[row].length;col++){
            //         System.out.print(arr[row][col]+" ");
                    
            //     }
            // print using for each loop
            for(int[]ans:arr){
                System.out.println(Arrays.toString(ans));
            }



                System.out.println();

            }
        
    }
    


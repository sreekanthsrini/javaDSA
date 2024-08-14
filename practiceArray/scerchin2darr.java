package practiceArray;

public class scerchin2darr {
    public static void main(String[] args) {
        int[][]arr={{1,2,3,},{4,5,6},{7,8,9}};
        int target=6;
        System.out.println(searcharr(arr,target));
    }
    static int searcharr(int arr[][],int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    System.out.println("the find value is"+arr[row][col]);
                    return target;
                  
                }
                else{
                   return 0;
                }
              


                
               
               
            }
        }
        return target;
       
    }
    
}
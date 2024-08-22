package binarysearch;

public class basiccode {
    public static void main(String[] args) {
        int[]arr={90,75,18,12,6,4,3,1};
        int target=75;
        System.out.println(searching(arr,target));
    }
    static int searching(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                // it is for asecending
             end=mid-1;
            //  it is for decending
            //   start=mid+1;
            }
            else if(target>arr[mid]) {
                // it is for asecending
                 start=mid+1;
                  //  it is for decending
                // end=mid-1;
                
            }
            else{
                return mid;
            }
            
        }
        return -1;
        
        
    }
    
}

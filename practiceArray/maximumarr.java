package practiceArray;

public class maximumarr {
    public static void main(String[] args) {
        
    
    int[]arr={33,55,66,77,234,33,1,23,4321};
    int ans=arr[0];
    System.out.println("the max value inthe given array is"+maxval(arr,ans));

    
}
static int maxval(int[]arr,int ans){
    if(arr.length==0){
        return-1;
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]>ans){
            ans=arr[i];
        }
    }
    return ans;
}
}

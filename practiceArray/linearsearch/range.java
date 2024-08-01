package practiceArray.linearsearch;

public class range {
    public static void main(String[] args) {
        int[]arr={22,33,44,55,66,77};
        int target=55;
        int start=0;
        int end=4;
        System.out.println(method(arr,target,start,end));
    }
    static boolean method(int[]arr,int target,int start,int end){
        if ((arr.length==0)) 
        {
            return false;
            
        }
        for(int i=start;i<end;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    
}

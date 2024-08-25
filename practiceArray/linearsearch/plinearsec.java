package practiceArray.linearsearch;

public class plinearsec {
    public static void main(String[] args){

    
    int[]arr={22,33,44,5,1,3};
    int target=00;
    System.out.println(lisec(arr,target));
    
    }
    static int lisec(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
}

}
        
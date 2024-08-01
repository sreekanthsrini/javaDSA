package practiceArray.linearsearch;

public class linearmethod {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int key=5;
        System.out.println(linearsearch(arr,key));

    }
    static int linearsearch(int[]arr,int key){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
                return key;
            }
        }
        return -1;
    }
    
}

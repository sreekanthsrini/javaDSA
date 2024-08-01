package practiceArray.linearsearch;

public class linearserchinrange {
    public static void main(String[] args) {
        int[]arr={22,33,44,55,66};
        int key=44;
        for(int i=0;i<3;i++){
            if(arr.length==0){
                System.out.println("not found");
            }
            if(arr[i]==key){
                System.out.println("element found"+key);
            }
        }
        
    }
    
}

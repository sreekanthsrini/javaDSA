import java.util.Arrays;

public class passfunctionarr {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        changevalue(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void changevalue(int[]arr){
         arr[2]=99;

    }
    
}

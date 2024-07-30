import java.util.Arrays;

public class twodarray {

    public static void main(String[] args) {
        int[][]arr={{1,2,3},
        {5,6,7},{8,9,10}};
       System.out.println(arr.length);
    //    PRINT LOOP
    for(int[] a:arr){
        System.out.println(Arrays.toString(a));
    }
    }
}
package string;

import java.util.Arrays;

public class output {
    public static void main(String[] args) {
        
        System.out.println(88);
         System.out.println("kunal");

        //  this will display the ramdom value
        // becuse. it does not know how the object is cteating
         System.out.println(new int[]{3,4,4,6,43});


        // so we can use array.tostring method
        System.out.println(Arrays.toString(new int[]{4,5,3,2,1,1}));
        // String a=" ";
        String a=null;
        System.out.println("the empty string ans is"+a);
    }
    
}

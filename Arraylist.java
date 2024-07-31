
import java.util.ArrayList;

public class Arraylist
 {
    public static void main(String[] args) {
        // ArrayList<datatype> reference variable=new ArrayList(size);
        ArrayList<Integer> val1=new ArrayList(10);
        ArrayList<String>val2=new ArrayList<>(3);
        val1.add(23);
        val1.add(33);
        val1.add(44);
        val2.add("sreekanth");
        val2.add("ba;aji");
        val2.add("ram");
        System.out.println(val2);
        System.out.println(val1.size());
        System.out.println(val1);
       System.out.println( val1.contains(33));
    //    we can. perform many operation using array list

    }
    
}

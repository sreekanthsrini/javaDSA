package string;

public class comparision {
    public static void main(String[] args) {
        // it will directly assigned for same pool in the heap
        // so it gives true
        String a="sree";
        String b="sreess";
        // System.out.println(a==b);
        if(a==b){
            System.out.println("hi");
        }
        else{
            System.out.println("bye");
        }

        //  it show false because. the object create a seperate memory in heap for the defined string

        String name1=new String("kunal");
        String name2=new String("kunal");
        System.out.println(name1==name2);


        //  so if i want to check the value
        // use this equals keyword

        System.out.println("check the given value "+ name1.equals(name2));
        System.out.println(name1.charAt((3)));


    }
    
}

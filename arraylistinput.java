import java.util.ArrayList;
import java.util.Scanner;

public class arraylistinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>num=new ArrayList<>();
        
        for(int i=0;i<10;i++){
            num.add(sc.nextInt());
        }
        System.out.println(num);
    }
    
}

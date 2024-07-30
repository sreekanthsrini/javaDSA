import java.util.Arrays;

public class basicarray {

    public static void main(String[] args) {
        int[]roll=new int[5];
        String[]name=new String[3];
        roll[0]=90;
        roll[1]=91;
        roll[2]=92;
        name[0]="sreekanth";
        name[1]="vankam";
        name[2]="nandri";
        System.out.println(Arrays.toString(roll));
        System.out.println("to print as seperate"+roll[1]);
        System.out.println(Arrays.toString(name));
    }
}
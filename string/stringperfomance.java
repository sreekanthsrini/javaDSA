package string;

public class stringperfomance {
    public static void main(String[] args) {
        String series=" ";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            System.out.println("printing the seperate character.  "+ch);

            series=series+ch;
        }
        System.out.println("after adding all the character to  the strring");
        System.out.println(series);

        // add all the character to the series string
        
        
    }
    
}

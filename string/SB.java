package string;

public class SB {
    public static void main(String[] args) {
         StringBuilder sree=new StringBuilder();
         for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            sree.append(ch);
         }
         System.out.println(sree.toString());

    }
    
}

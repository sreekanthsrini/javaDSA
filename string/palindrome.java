package string;

public class palindrome {
    public static void main(String[] args) {
        
        String name="A man, a plan, a canal: Panama";
         String name2 = name.replaceAll("[^a-zA-Z0-9-9]", "").toLowerCase();
        boolean test=true;
        for(int i=0; i<=name2.length()/2;i++){
            char start=name2.charAt(i);
            char end=name2.charAt(name2.length()-i-1);
            if(start!=end){
                test=false;
            }
            
        }

        if(test==true){
            System.out.println("palindrome");
        }
        else if(test==false){
            System.out.println("not a palindrome");
        }

       

       
        

        

    }
    
}

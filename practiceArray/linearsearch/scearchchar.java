package practiceArray.linearsearch;

public class scearchchar {
    public static void main(String[] args) {
        String str="sreekanth";
        char val='k';
        System.out.println(linearsearch(str,val));
    }
    static boolean linearsearch(String str,char val){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(val==str.charAt(i)){
                System.out.println(str.charAt(i));
                return true;
            }
        }
        return false;
    }
    
}

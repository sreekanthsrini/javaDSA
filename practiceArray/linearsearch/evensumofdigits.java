package practiceArray.linearsearch;

public class evensumofdigits {
    public static void main(String[] args) {
        
    
    int[]arr={22,555,3421,3456,55};
    System.out.println(findevennums(arr));

    
    }


    static int findevennums(int[]arr){
        int count =0;
        for(int num:arr){
            if(even(num)){

            
            count++;
            }
        }
        return count;
        
       
    }


    // method to string of digit
    static boolean even(int num){
        int numofdig=digits(num);
        if(numofdig%2==0){
            return true;
        }
        return false;

    }
    // count the number of digit 
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }


    
}

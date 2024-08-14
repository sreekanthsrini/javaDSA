 package practiceArray;

class minvalarr {
    public static void main(String[] args) {
        int[]arr={22,33,-9,2,14};
        int ans=arr[0];
        System.out.println(minmethod(arr,ans));
    }
    static int minmethod(int[]arr,int ans){
        if(arr.length==0){
            return -1;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
                
            }
           
             
        }
        
        return ans;
       
    }

    
}
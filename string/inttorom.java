class Solution {
    public String intToRoman(int num) {
            int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
                
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<values.length;i++) {
                while(num >= values[i]) {
                    num -= values[i];
                    sb.append(strs[i]);
                }
            }
            return sb.toString();
    }
}

// 3749. >=1000     2749.     1749.     749.   249.   149    49   9
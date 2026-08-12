class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String sb = strs[0];

        int ts = 1;
        
        while(ts < strs.length){
       
            int count = 0;
            int min = Math.min(sb.length(), strs[ts].length());
            
            for(int i=0; i<min; i++){
                
                if( sb.charAt(i) == strs[ts].charAt(i)){
                    
                    count++;
                }else 
                    break;
            }

            sb = sb.substring(0, count);
            if(sb.isEmpty()) return sb;
            ts++;
        }
        return sb;
    }
}
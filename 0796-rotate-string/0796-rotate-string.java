class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length()){
            return false;
        }

        if(s.equals(goal)){
            return true;
        }

        char[] sh = s.toCharArray();
        char[] go = goal.toCharArray();
        int count = 0;
        while(count < sh.length){

            int i=0;
            char ch = sh[0];
            while(i<sh.length-1){
                sh[i] = sh[i+1];
                i++;
            }
            sh[i] = ch;

            if(Arrays.equals(sh, go)){
                return true;
            }
            count++;
        }
        return false;
    }
}
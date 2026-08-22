class Solution {
    public int findComplement(int num) {
        
        int temp = num;
        int count = 0;

        while(temp > 0){
            count++;
            temp >>= 1;
        }
        
        return num ^ ((1<<count) - 1);
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ME = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                ME = nums[i];
                count = 1;
            }else if(nums[i] == ME){
                count++;
            }else{
                count --;
            }
            
        }
        return ME;
    }
}
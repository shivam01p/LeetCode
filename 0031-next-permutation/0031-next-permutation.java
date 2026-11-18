class Solution {
    public void nextPermutation(int[] nums) {
        
        //Step 1: Find the pivot
        int pivot = -1;
        int n = nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            int i = 0;
            int j = n-1;
            while( i <= j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }

        //Step 2: Find next greater number than pivot
        for(int g=n-1; g>pivot; g--){
            if(nums[g] > nums[pivot]){
                int temp = nums[g];
                nums[g] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        //Step 3: Reverse the suffix
        int i = pivot+1;
        int j = n-1;
        while( i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
    }
}
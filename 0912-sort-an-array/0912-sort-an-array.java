    class Solution {
        public int[] sortArray(int[] nums) {
            
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            for(int p=0; p<nums.length; p++){
                largest = Math.max(largest, nums[p]);
                smallest = Math.min(smallest, nums[p]);
            }

            int[] countNeg = smallest < 0 ? new int[Math.abs(smallest) + 1] : new int[1];
            int[] countPos = largest >= 0 ? new int[largest + 1] : new int[1];
            for(int c = 0; c < nums.length; c++){

                if(nums[c] >= 0){
                    countPos[nums[c]]++;
                }else{
                    countNeg[Math.abs(nums[c])]++;
                }
            }

            int j=0;
            for(int cn = countNeg.length-1; cn > 0 ; cn--){
                while(countNeg[cn] > 0){
                    nums[j] = cn * -1;
                    j++;
                    countNeg[cn]--;
                }
            }

            for(int cp = 0; cp < countPos.length; cp++){
                while(countPos[cp] > 0){
                    nums[j] = cp;
                    j++;
                    countPos[cp]--;
                }
            }
            return nums;
        }
    }
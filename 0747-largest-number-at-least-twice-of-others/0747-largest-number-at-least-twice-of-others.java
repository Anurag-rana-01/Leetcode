class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
                j = i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(max >= nums[i]*2 || nums[i] == max){
                continue;
            }else{
                return -1;
            }
        }
        return j;
    }
}
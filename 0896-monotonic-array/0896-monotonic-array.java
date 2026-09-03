class Solution {
    public boolean isMonotonic(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] <= nums[i+1]){
                count++;
            }
        }

        int count1 = 0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] >= nums[i+1]){
                count1++;
            }
        }

        if(count == nums.length-1 || count1 == nums.length-1){
            return true;
        }

        return false;
    }
}
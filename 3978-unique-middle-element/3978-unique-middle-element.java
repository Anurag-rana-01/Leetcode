class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int st = 0;
        int end = nums.length-1;

        int mid = st + (end-st)/2;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == nums[mid] && i != mid){
                return false;
            }
        }
        
        return true;
    }
}
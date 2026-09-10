class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        if(nums.length <= k){
            return nums;
        }
        int j = k;
        for(int i=k;i<nums.length;i++){
            if(nums[i] != nums[j-k]){
                nums[j] = nums[i];
                j++;
            }
        }
        
        return Arrays.copyOf(nums,j);
    }
}
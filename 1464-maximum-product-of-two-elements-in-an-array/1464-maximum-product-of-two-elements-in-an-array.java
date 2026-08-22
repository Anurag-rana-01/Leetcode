class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]-1)*(nums[j]-1) > max1){
                    max1 = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return max1;
    }
}
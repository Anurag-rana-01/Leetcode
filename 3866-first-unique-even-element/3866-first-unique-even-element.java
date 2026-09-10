class Solution {
    public int firstUniqueEven(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                boolean value = false;
                for(int j=0;j<nums.length;j++){
                    if(i != j && nums[i] == nums[j]){
                        value = true;
                        break;
                    }else{
                        continue;
                    }
                }
                if(value == false){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
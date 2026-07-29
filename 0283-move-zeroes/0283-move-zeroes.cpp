class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n = nums.size();
        int pos = -1;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            return;
        }
        for(int i=pos+1;i<n;i++){
            if(nums[i]!=0){
                swap(nums[i],nums[pos]);
                pos++;
            }
        }
    }
};
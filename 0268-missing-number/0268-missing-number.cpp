class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();

        for(int i=0;i<=n;i++){
            int f = 0;
            for(int j=0;j<n;j++){
                if(nums[j] == i){
                    f = 1;
                    break;
                }
            }
            if(f == 0){
                return i;
            }
        }
        return -1;
    }
};
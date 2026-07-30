class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
       int n1 = nums1.size();
       int n2 = nums2.size();

      vector<int> visit(n2,0);
       int i=0;
       vector<int> ans;
       for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
        if(nums1[i] == nums2[j] && visit[j] == 0){
            visit[j] = 1;
            ans.push_back(nums1[i]);
            break;
        }
       }
       }
       return ans;
    }
};
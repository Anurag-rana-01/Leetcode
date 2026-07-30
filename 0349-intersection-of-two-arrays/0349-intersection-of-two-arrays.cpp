class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        set<int> s1;
        int n1 = nums1.size();
        int n2 = nums2.size();
        vector<int> v1;
        int i = 0;
        while(i<n1){
            for(int j=0;j<n2;j++){
            if(nums1[i] == nums2[j]){
                s1.insert(nums1[i]);
                break;
            }
        }
        i++;
        }

        for(auto it : s1){
            v1.push_back(it);
        }

        return v1;
    }
};
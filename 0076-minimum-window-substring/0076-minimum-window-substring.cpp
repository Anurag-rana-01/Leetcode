class Solution {
public:
    string minWindow(string s, string t) {
        if (s.empty() || t.empty() || s.length() < t.length()) {
            return "";
        }

        
        std::vector<int> target_freq(128, 0);
        for (char c : t) {
            target_freq[c]++;
        }

        
        int required = 0;
        for (int count : target_freq) {
            if (count > 0) required++;
        }

        
        std::vector<int> window_freq(128, 0);
        int formed = 0; 

        int left = 0, right = 0;
        int min_len = INT_MAX;
        int min_left = 0;

        while (right < s.length()) {
            char c = s[right];
            window_freq[c]++;

           
            if (target_freq[c] > 0 && window_freq[c] == target_freq[c]) {
                formed++;
            }

            
            while (left <= right && formed == required) {
                c = s[left];

                
                if (right - left + 1 < min_len) {
                    min_len = right - left + 1;
                    min_left = left;
                }

                
                window_freq[c]--;
                if (target_freq[c] > 0 && window_freq[c] < target_freq[c]) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return min_len == INT_MAX ? "" : s.substr(min_left, min_len);
    }
};
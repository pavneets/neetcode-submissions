class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_set = set()
        left = 0
        max_len = 0
        
        for right in range(len(s)):
            # If we find a duplicate, remove characters from the left 
            # until the duplicate is gone from our set
            while s[right] in char_set:
                char_set.remove(s[left])
                left += 1
                
            # Add the current character and update max length
            char_set.add(s[right])
            max_len = max(max_len, right - left + 1)
            
        return max_len
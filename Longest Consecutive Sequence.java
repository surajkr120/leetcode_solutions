// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109

<-----------------------------------------------------------------------------------------> SOLUTION <--------------------------------------------------------------------------------------------------------->

  class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        Arrays.sort(nums);
        int longest = 1;
        int curr_count = 1;
        int last_Smaller = nums[0];
        for(int i = 0;i<n;i++){
            if(nums[i] == last_Smaller+1){
                curr_count += 1;
                last_Smaller = nums[i];
            }else if(last_Smaller != nums[i]){
                curr_count = 1;
                last_Smaller = nums[i];
            }
            longest = Math.max(longest,curr_count); 
        }
        return longest;
    }
}

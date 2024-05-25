// You are given an array nums, where each number in the array appears either once or twice.

// Return the bitwise XOR of all the numbers that appear twice in the array, or 0 if no number appears twice.

 

// Example 1:

// Input: nums = [1,2,1,3]

// Output: 1

// Explanation:

// The only number that appears twice in nums is 1.

// Example 2:

// Input: nums = [1,2,3]

// Output: 0

// Explanation:

// No number appears twice in nums.

// Example 3:

// Input: nums = [1,2,2,1]

// Output: 3

// Explanation:

// Numbers 1 and 2 appeared twice. 1 XOR 2 == 3.

 

// Constraints:

// 1 <= nums.length <= 50
// 1 <= nums[i] <= 50
// Each number in nums appears either once or twice.

<-----------------------------------------------------------------------------------------------> SOLUTION <------------------------------------------------------------------------------------------------------->

  class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n = nums.length;
        int ans = 0;
         for(int i = 0;i < n -1;i++){
            for(int j = i + 1;j < n;j++){
                if(nums[i] == nums[j]){
                    ans = ans ^ nums[j];
                }
            }
         }
        return ans;
    }
}

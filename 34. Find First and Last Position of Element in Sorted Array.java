// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is a non-decreasing array.
// -109 <= target <= 109

<-------------------------------------------------------------------------------------------> SOLUTION <------------------------------------------------------------------------------------------------------>


  class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = new int[2];
        result[0] = findposition(nums,target,true);
        result[1] = findposition(nums,target,false);
        return result;
    }
    public int findposition(int []nums,int target, boolean isFirst){
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int ans = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                ans = mid;
                if(isFirst){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}

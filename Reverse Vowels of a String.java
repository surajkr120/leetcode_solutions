// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "hello"
// Output: "holle"
// Example 2:

// Input: s = "leetcode"
// Output: "leotcede"
 

// Constraints:

// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.

<---------------------------------------------------------------------------------------------> SOLUTION <------------------------------------------------------------------------------------------------------->

  public class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int n = ans.length;
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = n - 1;
        while (left < right) {
            while (left < right && !vowels.contains(ans[left] + "")) {
                left++;
            }
            while (left < right && !vowels.contains(ans[right] + "")) {
                right--;
            }
            if (left < right) {
                char temp = ans[left];
                ans[left] = ans[right];
                ans[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ans);
    }
}

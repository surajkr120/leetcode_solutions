// Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

// Example 1:

// Input: s = "Hello"
// Output: "hello"
// Example 2:

// Input: s = "here"
// Output: "here"
// Example 3:

// Input: s = "LOVELY"
// Output: "lovely"
 

// Constraints:

// 1 <= s.length <= 100
// s consists of printable ASCII characters.

<---------------------------------------------------------------------------------------------------> SOLUTION <------------------------------------------------------------------------------------------------------->

  class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                ans.append(Character.toLowerCase(ch));
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}

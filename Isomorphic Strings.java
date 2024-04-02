// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

// Example 1:

// Input: s = "egg", t = "add"
// Output: true
// Example 2:

// Input: s = "foo", t = "bar"
// Output: false
// Example 3:

// Input: s = "paper", t = "title"
// Output: true
 

// Constraints:

// 1 <= s.length <= 5 * 104
// t.length == s.length
// s and t consist of any valid ascii character.

<---------------------------------------------------------------------------------> SOLUTION <--------------------------------------------------------------------------------------------------->

  class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> firstString = new HashMap<>();
        HashMap<Character,Character> secondString = new HashMap<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(!firstString.containsKey(s1)){
                firstString.put(s1,t1);
            }
             if(!secondString.containsKey(t1)){
                secondString.put(t1,s1);
            }
            if(firstString.get(s1) != t1 || secondString.get(t1) != s1){
                return false;
            }
        }
        return true;
    }
}

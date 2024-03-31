// Given an m x n matrix, return all elements of the matrix in spiral order.

 

// Example 1:


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]
// Example 2:


// Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

// Constraints:

// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 10
// -100 <= matrix[i][j] <= 100

<----------------------------------------------------------------------------------> SOLUTION <-------------------------------------------------------------------------------------------------->


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0) return ans;
        int n = matrix.length, m = matrix[0].length;
        int left = 0;
        int right = m-1;
        int top = 0;
         int bottom = n-1;
        while (left <= right && top <= bottom) {   
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
               
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
            }
            bottom--;

           
            if (left <= right) {
                
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
            }
            left++;
        }

        return ans;
    }
}

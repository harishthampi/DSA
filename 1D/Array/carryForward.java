Carry FOrward

Q1.You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

Problem Constraints

1 <= length(A) <= 105



Input Format

First and only argument is a string A.



Output Format

Return an integer denoting the answer.



Example Input

Input 1:

 A = "ABCGAG"
Input 2:

 A = "GAB"


Example Output

Output 1:

 3
Output 2:

 0


Example Explanation

Explanation 1:

 Subsequence "AG" is 3 times in given string 
Explanation 2:

 There is no subsequence "AG" in the given string.


 BF Solution 
 public class Solution {
    public int solve(String A) {
        int count = 0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == 'A' ){
                for(int j=i+1;j<A.length();j++){
                    if(A.charAt(j) == 'G' ) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

Optimized Solution

public class Solution {
    public int solve(String A) {
        long Gcount = 0;
        long Tcount = 0;

        for(int i = A.length()-1; i >= 0; i--){
            if(A.charAt(i) == 'G'){
                Gcount =( Gcount + 1) % 1000000007 ;
            }
            if(A.charAt(i) == 'A'){
                Tcount = (Tcount+ Gcount) % 1000000007;
            }
        }
        return (int)Tcount;
    }
        
}

*************************************************************************
Q2. Closest MinMax
Problem Description

Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints

1 <= |A| <= 2000



Input Format

First and only argument is vector A



Output Format

Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input

Input 1:

A = [1, 3, 2]
Input 2:

A = [2, 6, 1, 6, 9]


Example Output

Output 1:

 2
Output 2:

 3


Example Explanation

Explanation 1:

 Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
Explanation 2:

 Take the last 3 elements of the array.

 public class Solution {
    public int solve(int[] A) {
        int max_i = -1;
        int min_i = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<A.length;i++){
            if(A[i]> max){
                max = A[i];
            }
            if(A[i]<min){
                min = A[i];
            }
        }

        for(int i=A.length-1;i>=0;i--){
            if(A[i] == max){
                max_i = i;
                if(min_i != -1){
                    ans = Math.min(ans,min_i - max_i + 1);
                }
            }
            if(A[i] == min){
                min_i = i;
                if(max_i != -1){
                    ans = Math.min(ans,max_i - min_i + 1);
                }
            }
        }
        return ans;

    }
}

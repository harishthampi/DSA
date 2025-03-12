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


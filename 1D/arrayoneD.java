
//Beginner
Q1. Search Element

Problem Description

You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.

Problem Constraints

1 <= T <= 10
1 <= A <= 105
1 <= A[i], B <= 109


Input Format

First line of the input contains number of test cases as single integer T .
Next, each of the test case consists of 3 lines:

First line contains a single integer A denoting the length of array
Second line contains A integers denoting the array elements
Third line contains a single integer B


Output Format
For each test case, print on a separate line 1 if the element exists, else print 0.



Example Input
Input 1:
 1 
 5 
 4 1 5 9 1
 5
Input 2:
 1
 3 
 7 7 2
 1 
Example Output
Output 1:
 1 
Output 2:
 0 
Example Explanation
Explanation 1:
  B = 5  is present at position 3 in A 
Explanation 2:
  B = 1  is not present in A. 

Code

public class Main {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int T = sc.nextInt();
      for(int i =0;i<T;i++){
          int N = sc.nextInt();
          int[] arr = new int[N];
          for(int j=0;j<N;j++){
              arr[j] = sc.nextInt();
          }
          int target = sc.nextInt();
          int flag=0;
          for(int j=0;j<N;j++){
              if(target == arr[j]){
                  flag++;
                  break;
              }
         }
         if(flag!=0) System.out.println('1');
         else System.out.println('0');
      }
    }
}

Q2. Count Duplicates

Problem Description
You are given an integer array A having length N. You have to find the number of duplicate(redundant) elements in the array.



Problem Constraints
1 <= N <= 1000
-109 <= A[i] <= 109



Input Format
First and only argument is an integer array A.


Output Format
Return a single integer.

Example Input
Input 1:
 A = [1, 10, 20, 1, 25, 1, 10, 30, 25, 1] 
Input 2:
 A = [1, 2, 3] 


Example Output
Output 1:
 5 
Output 2:
 0 
Example Explanation

Explanation 1:
 1 is present 4 times in the array. So, 3 of them are redundant.
 10 is present 2 times in the array. So, 1 of them is redundant.
 25 is present 2 times in tha array. So, 1 of them is redundant.
 Total duplicates(redundants) = 3 + 1 + 1 = 5 
Explanation 2:

 There are no duplicates in the array (Each element has distinct value).

Code
public class Solution {
    public int solve(final int[] A) {
        Arrays.sort(A);
        int i=0;
        int count = 0;
        while(i+1 < A.length){
            if(A[i] == A[i+1]){
                count++;
                i++;
            }
            else{
                i++;
            }
        }
        return count;
    }
}

Q3. Frequency count
Problem Description

You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .

Problem Constraints
1 <= len(A) <= 1000
1 <= A[i] <= 100

Input Format
First argument is an array of integers representing array A.

Output Format
You have to return an array of integers as per the question.



Example Input
Input 1:
A = [1, 2, 5, 1, 5, 1 ]


Example Output
Output 1:
[3, 1, 2, 3, 2, 3]

Example Explanation
Explanation 1:
Clearly, In the given array we have 1 three times, 2 one time and 5 two times.

Code
public class Solution {
    public int[] solve(int[] A) {
        int [] output = new int[A.length];
        for(int i=0;i<A.length;i++){
            int count=0;
            for(int j=0;j<A.length;j++){
                if(A[i]==A[j]) count++;
            }
            output[i]=count;
        }
        return output;
    }
}

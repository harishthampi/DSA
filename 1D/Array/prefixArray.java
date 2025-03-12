
********************* Prefix Array *********************
 * Q1. Search Element
 *
 * Problem Description:
 * You are given an integer T (number of test cases). You are given array A and an integer B for each test case. 
 * You have to tell whether B is present in array A or not.
 *
 * Problem Constraints:
 * 1 <= T <= 10
 * 1 <= A <= 10^5
 * 1 <= A[i], B <= 10^9
 *
 * Input Format:
 * First line of the input contains number of test cases as single integer T.
 * Next, each of the test case consists of 3 lines:
 * - First line contains a single integer A denoting the length of array
 * - Second line contains A integers denoting the array elements
 * - Third line contains a single integer B
 *
 * Output Format:
 * For each test case, print on a separate line 1 if the element exists, else print 0.
 *
 * Example Input:
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

Q4. Wave Array

Problem Description
Given an array of integers A, sort the array into a wave-like array and return it.
In other words, arrange the elements into a sequence such that
a1 >= a2 <= a3 >= a4 <= a5..... 
NOTE: If multiple answers are possible, return the lexicographically smallest one.

Problem Constraints

1 <= len(A) <= 106
0 <= A[i] <= 106

Input Format
The first argument is an integer array A.

Output Format
Return an array arranged in the sequence as described.

Example Input
Input 1:

A = [1, 2, 3, 4]
Input 2:

A = [1, 2]


Example Output

Output 1:

[2, 1, 4, 3]
Output 2:

[2, 1]


Example Explanation

Explanation 1:

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
First answer is lexicographically smallest. So, return [2, 1, 4, 3].
Explanation 1:

Only possible answer is [2, 1].

public class Solution {
    public int[] wave(int[] A) {
        Arrays.sort(A);
            if(A.length%2==0){
                for(int i=0;i+2<=A.length;){
                    int temp = A[i];
                    A[i]=A[i+1];
                    A[i+1] = temp;
                    i=i+2;
                }
            }
            else{
                for(int i=0;i+2<=A.length-1;){
                    int temp = A[i];
                    A[i]=A[i+1];
                    A[i+1] = temp;
                    i=i+2;
                }

            }
        return A;
    }
}

Q5. Add One To Number

Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

Problem Constraints

1 <= size of the array <= 1000000


Input Format

First argument is an array of digits.
Output Format
Return the array of digits after adding one.

Example Input
Input 1:
[1, 2, 3]
Example Output
Output 1:
[1, 2, 4]
Example Explanation
Explanation 1:
Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.

public class Solution {
    public int[] plusOne(int[] A) {
        int carry = 0;
        int value = A[A.length - 1] + 1;
        ArrayList<Integer> res = new ArrayList();

// After adding 1 to the last value of the array element

        if(value == 10){

            carry = 1;

            res.add(0);
        }
        else{
            res.add(value);
        }
        // iterate from the last element in the array
// if the A[i] + carry is 10 then carry is 1 or else 0
        for(int i = A.length-2; i >= 0; i--){
          value = A[i] + carry;
          if(value == 10){
              res.add(0);
              carry = 1;
          }
       
          else{
              res.add(value);
              carry = 0;
          }
        }
//if the last element is 0 and carry is 1
        if(carry == 1){
            res.add(1);
        }
// need to reverse because we are storing from last
       Collections.reverse(res);
       int index = 0;
       for(int i = 0; i < res.size(); i++){
          if(res.get(i) == 0){
              index++;
          }
          else{
              break;
          }
       }
       int k = 0;
// to handle the zeros at the start
       int[] arr = new int[res.size() - index];
       for(int i = index; i < res.size(); i++){
           arr[k++] = res.get(i);
       }
       return arr;
    }
}

Q6. Rotation Game
Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.
Problem Constraints

1 <= N <= 106
1 <= A[i] <=108
1 <= B <= 109


Input Format

There are 2 lines in the input
Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.
Line 2: A single integer B.


Output Format
Print array A after rotating it B times towards the right.
Example Input
Input 1 :
4 1 2 3 4
2
Example Output
Output 1 :
3 4 1 2


Example Explanation
Example 1 :
N = 4, A = [1, 2, 3, 4] and B = 2.
Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
Final array = [3, 4, 1, 2]

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[] A= new int[N];
        for (int i = 0; i < N; i++) {
            A[i]=sc.nextInt();
        }
        int K =sc.nextInt();
        if(K>N)
        {
            K=K%N;
        rotate(A,0,N-1);
        rotate(A,0,K-1);
        rotate(A,K,N-1);
         for (int i = 0; i < N; i++) 
        {
        System.out.print(A[i]+" ");
        }
        }
        else
        {
        rotate(A,0,N-1);
        rotate(A,0,K-1);
        rotate(A,K,N-1);
         for (int i = 0; i < N; i++) 
        {
        System.out.print(A[i]+" ");
        }
        }
    }

     static int[] rotate(int[] A, int start, int end) {
        int i=start;
        int j=end;
        int temp;
        while(i<=j)
        {
           temp=A[i];
           A[i]=A[j];
           A[j]=temp;
            i++;
            j--;
        }
        return A;
    }

        
    }

Q7.Equilibrium index of an array

Problem Description
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

Problem Constraints

1 <= N <= 105
-105 <= A[i] <= 105

Input Format
First arugment is an array A .
Output Format
Return the equilibrium index of the given array. If no such index is found then return -1.

Example Input

Input 1:
A = [-7, 1, 5, 2, -4, 3, 0]
Input 2:
A = [1, 2, 3]


Example Output
Output 1:
3
Output 2:
-1

public class Solution {
    public int solve(int[] A) {
        int[] pf = new int[A.length];
        pf[0]=A[0];
        for(int i=1;i<A.length;i++){
            pf[i] = pf[i-1]+A[i];
        }
        int L=0;
        int R=0;
        for(int i=0;i<A.length;i++){
            if(i==0){
                L=0;
            }
            else{
                L=pf[i-1];
            }
            if(i==A.length-1){
                R=0;
            }
            else{
                R=pf[A.length-1]-pf[i];
            }
            if(R==L){
                return i;
            }
        }
        return -1;
    }
}

Q8.Special Index

Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

Problem Constraints

1 <= N <= 105
-105 <= A[i] <= 105
Sum of all elements of A <= 109

Input Format
First argument contains an array A of integers of size N
Output Format
Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
Example Input

Input 1:
A = [2, 1, 6, 4]
Input 2:
A = [1, 1, 1]

Example Output
Output 1:
1
Output 2:
3

public class Solution {
    public int solve(int[] A) {
        int N =A.length;
        int[] Po = Prefixodd(A, N);
        int[] Pe=  Prefixeven(A,N);
        int Sodd,Seven;
        int count=0;
        for (int i = 0; i < N ; i++) {
            if(i == 0)
            {
                Sodd=Pe[N-1]-Pe[i];
                Seven=Po[N-1]-Po[i];
                if(Sodd==Seven)
                {
                    count++;
                }
            }
            else
            {
                Sodd=Po[i-1]+Pe[N-1]-Pe[i];
                Seven=Pe[i-1]+Po[N-1]-Po[i];
                if(Sodd==Seven)
                {
                    count++;
                }
            }
        }
        return count;
    }
        

        int[] Prefixeven(int[]B,int n) {
         int[] Pe = new int[n];
         Pe[0]=B[0];
         for (int i = 1; i < n; i++) {
             if (i % 2 == 0)
             {
                 Pe[i] = Pe[i - 1] + B[i];
             }
             else
             {
                 Pe[i]=Pe[i-1];
             }
         }
         return Pe;
    }

     int[] Prefixodd(int[]B,int n) {
        int[] Po = new int[n];
        Po[0]=0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                Po[i] = Po[i - 1] + B[i];
            } else {
                Po[i] = Po[i - 1];
            }
        }
        return Po;
    }
    }
Q9. Range Sum Query
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
Example Input

Input 1:


A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:

A = [2, 2, 2]
B = [[0, 0], [1, 2]]




Example Output

Output 1:
[10, 5]
Output 2:

[2, 4]


Example Explanation

Explanation 1:


The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
Explanation 2:

The sum of all elements of A[0 ... 0] = 2 = 2.
The sum of all elements of A[1 ... 2] = 2 + 2 = 4.

public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {
        int N = A.length;
        long[]Pf=new long[N];
        int row = B.length;
        int col =B[0].length;
        long[]ans=new long[row];
        int L,R;
        Pf[0]=A[0];
        for(int i=1;i<N;i++)
        {
            Pf[i]=Pf[i-1]+A[i];
        }
       
        for(int i=0;i<row;i++)
        {
                 L=B[i][0];
                 R=B[i][1];
                 if(L==0)
                 {
                     ans[i]=Pf[R];
            
                 }
                 else
                 {
                      ans[i]=Pf[R]-Pf[L-1];
                 }
            
        }   
        return ans;
    }
}              

            
*********************Carry Forward Array*********************
            


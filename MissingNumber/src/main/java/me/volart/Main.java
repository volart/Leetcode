package me.volart;


/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

*/
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int numbs[] = {3,0,1};
        int missingNumber = solution.missingNumber(numbs);
        System.out.println(missingNumber);
    }
}

package me.volart;

/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * <p>
 * You may return any answer array that satisfies this condition.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class App {
  public static void main(String[] args) {
    int a[] = {3,1,2,4,5,6};
    int[] res = sortArrayByParity(a);
    for (int i : res){
      System.out.print(i + " ");
    }
  }


  public static int[] sortArrayByParity(int[] A) {
    int length = A.length;
    int oddIndex = length - 1;
    for (int i = 0; i != oddIndex; i++) {
      if (A[i] % 2 > 0) {
        for (int j = oddIndex; j > i; j--) {
          if (A[j] % 2 == 0) {
            A[i] = A[i] + A[j];
            A[j] = A[i] - A[j];
            A[i] = A[i] - A[j];
            oddIndex = j;
            break;
          }
        }
      }
    }
    return A;
  }
}

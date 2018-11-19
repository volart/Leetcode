package me.volart;

import java.util.HashMap;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 * <p>
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 */
public class App {
  public static void main(String[] args) {
    System.out.println(numJewelsInStones("z", "ZZ"));
  }

  public static int numJewelsInStones(String J, String S) {
    HashMap<Character, Integer> map = new HashMap<>(S.length());
    char[] Ss = S.toCharArray();
    for (Character s : Ss) {
      Integer count = map.get(s);
      if (count == null) count = 0;
      count++;
      map.put(s, count);
    }

    char[] Js = J.toCharArray();
    int count = 0;
    for (Character j : Js) {
      Integer c = map.get(j);
      if (c != null) count += c;
    }
    return count;
  }
}

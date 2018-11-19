package me.volart.core;

import java.util.Iterator;
import java.util.List;

public class Utils {

  public static void print(List<List<Integer>> lists) {
    printIterable(lists);
  }

  public static void printIntegers(List<Integer> ints) {
    printIterable(ints);
  }

  private static <T> void printIterable(Iterable<T> iterable) {
    Iterator<T> iterator = iterable.iterator();
    if (!iterator.hasNext()) return;
    System.out.print("[");
    while (iterator.hasNext()) {
      T next = iterator.next();
      if(next instanceof Iterable) {
        printIterable((Iterable) next);
      } else {
        System.out.print(next);
      }
      if (iterator.hasNext()) System.out.print(", ");
    }
    System.out.print("]");
  }
}

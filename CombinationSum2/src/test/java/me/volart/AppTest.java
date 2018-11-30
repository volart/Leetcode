package me.volart;

import me.volart.core.Utils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

  private App app = new App();

  @Test
  public void test() {
    int[] candidates = {10, 1, 2, 7, 6, 1, 5};

    List<List<Integer>> expected = new ArrayList<>();
    List<Integer> a1 = new ArrayList<Integer>() {{
      add(1);
      add(1);
      add(6);
    }};

    List<Integer> a2 = new ArrayList<Integer>() {{
      add(1);
      add(2);
      add(5);
    }};

    List<Integer> a3 = new ArrayList<Integer>() {{
      add(1);
      add(7);
    }};
    List<Integer> a4 = new ArrayList<Integer>() {{
      add(2);
      add(6);
    }};

    expected.add(a1);
    expected.add(a2);
    expected.add(a3);
    expected.add(a4);

    List<List<Integer>> actual = app.combinationSum2(candidates, 8);

    assertEquals(expected, actual);

  }
}

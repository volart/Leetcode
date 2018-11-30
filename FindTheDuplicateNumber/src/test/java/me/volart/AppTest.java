package me.volart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

  App app = new App();

  @Test
  public void findDuplicate() {

    int dups1[] = {1, 3, 4, 2, 2};

    assertEquals(2, app.findDuplicate(dups1));

    int dups2[] = {3,1,3,4,2,3,3,3};
    assertEquals(3, app.findDuplicate(dups2));
  }
}

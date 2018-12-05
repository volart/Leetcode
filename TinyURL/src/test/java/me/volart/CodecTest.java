package me.volart;

import org.junit.Before;
import org.junit.Test;

public class CodecTest {

  private Codec codec;

  @Before
  public void setUp() {
    codec = new Codec();
  }

  @Test
  public void testCodec() {
    String end = "";
    long l = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      String longUrl = "https://leetcode.com/problems/design-tinyurl" + end;

      Codec codec = new Codec();
      String encode = codec.encode(longUrl);
      String decode = codec.decode(encode);

      assert decode.equals(longUrl);
      end = end + "a";
    }

    System.out.println(System.currentTimeMillis() - l);
  }
}
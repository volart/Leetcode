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
    for (int i = 0; i < 10000; i++) {
      String longUrl = "https://leetcode.com/problems/design-tinyurl" + end;

      String encode = codec.encode(longUrl);
      String decode = codec.decode(encode);

      assert decode.equals(longUrl);
      end = end + "a";
    }
  }
}
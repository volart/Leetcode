package me.volart;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Codec {

  private static final String DOMANE = "http://tinyurl.com/";
  private static final AtomicLong INDEX = new AtomicLong(63);
  private static final HashMap<String, Long> urlIdx = new HashMap<>();
  private static final HashMap<Long, String> idxUrl = new HashMap<>();

  // Encodes a URL to a shortened URL.
  public String encode(String longUrl) {
    Long idx = urlIdx.get(longUrl);
    if (idx == null) {
      idx = INDEX.incrementAndGet();
      urlIdx.put(longUrl, idx);
      idxUrl.put(idx, longUrl);
    }
    return DOMANE + idToShortURL(idx);
  }

  // Decodes a shortened URL to its original URL.
  public String decode(String shortUrl) {
    String substring = shortUrl.substring(shortUrl.lastIndexOf("/") + 1);
    long idx = shortURLtoID(substring);
    String s = idxUrl.get(idx);

    return s;
  }


  public String idToShortURL(long n) {
    // Map to store 62 possible characters
    char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    String shorturl = "";

    // Convert given integer id to a base 62 number
    while (n > 0) {
      int index = (int) n % 62;
      shorturl = shorturl + map[index];
      n = n / 62;
    }

    // Reverse shortURL to complete base conversion
    shorturl = String.valueOf(reverse(shorturl.toCharArray()));

    return shorturl;
  }

  // Function to get integer ID back from a short url
  public long shortURLtoID(String shortURL) {
    char shorts[] = shortURL.toCharArray();
    long id = 0; // initialize result

    // A simple base conversion logic
    for (int i = 0; i < shortURL.length(); i++) {
      if ('a' <= shorts[i] && shorts[i] <= 'z')
        id = id * 62 + shorts[i] - 'a';
      if ('A' <= shorts[i] && shorts[i] <= 'Z')
        id = id * 62 + shorts[i] - 'A' + 26;
      if ('0' <= shorts[i] && shorts[i] <= '9')
        id = id * 62 + shorts[i] - '0' + 52;
    }
    return id;
  }

  public char[] reverse(char[] in) {
    char temp;
    for (int i = 0; i < in.length / 2; i++) {
      temp = in[i];
      int tailIdx = in.length - i - 1;
      in[i] = in[tailIdx];
      in[tailIdx] = temp;
    }
    return in;
  }

}

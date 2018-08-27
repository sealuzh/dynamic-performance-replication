/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 03:28:31 GMT 2018
 */

package okhttp3.internal.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import okhttp3.Challenge;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpHeaders;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpHeaders_ESTest extends HttpHeaders_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HttpHeaders.skipUntil("xOKYt", 4, "xOKYt");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "xOKYt";
      // Undeclared exception!
      try { 
        Headers.of(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected alternating header names and values
         //
         verifyException("okhttp3.Headers", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 304;
      HttpHeaders.skipUntil("", 304, "");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      // Undeclared exception!
      try { 
        Headers.of(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected header: : 
         //
         verifyException("okhttp3.Headers", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "Mzf]I";
      HttpHeaders.skipWhitespace("Mzf]I", 3184);
      // Undeclared exception!
      try { 
        HttpHeaders.hasVaryAll((Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.varyHeaders((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      headers0.toString();
      headers0.getDate("");
      hashMap0.put("", "!hBZ");
      headers0.getDate("!hBZ");
      HttpHeaders.varyFields(headers0);
      HttpHeaders.skipWhitespace("http:", 204);
      HttpHeaders.contentLength(headers0);
      HttpHeaders.varyFields(headers0);
      // Undeclared exception!
      try { 
        HttpHeaders.varyHeaders((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      long long0 = HttpHeaders.contentLength(headers1);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "";
      HttpHeaders.skipWhitespace("", 0);
      String string1 = ":c&yx.lkDN";
      HttpHeaders.skipWhitespace(":c&yx.lkDN", 7);
      Response response0 = null;
      // Undeclared exception!
      try { 
        HttpHeaders.hasVaryAll((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HttpHeaders.skipWhitespace("", 122);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      headers0.values((String) null);
      hashMap0.clear();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap1.put("", "");
      hashMap1.put("", "");
      headers0.toMultimap();
      hashMap0.putAll(hashMap1);
      headers0.toString();
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      HttpHeaders.hasVaryAll(headers1);
      headers0.values("");
      HttpHeaders.skipWhitespace("", 122);
      HttpHeaders.parseChallenges(headers0, "Transfer-Encoding");
      String[] stringArray0 = new String[5];
      stringArray0[0] = null;
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = null;
      stringArray0[4] = "";
      // Undeclared exception!
      try { 
        Headers.of(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected alternating header names and values
         //
         verifyException("okhttp3.Headers", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("(d{2,4})[^d]*", 0);
      assertEquals(0, int0);
      
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("(d{2,4})[^d]*", 0);
      assertEquals(0, int0);
      
      int int1 = HttpHeaders.parseSeconds("-HR", (-1927));
      assertEquals((-1927), int1);
      
      int int2 = HttpHeaders.skipUntil("(d{2,4})[^d]*", 0, "DP7#,<+j1KD6,t{K'");
      assertEquals(2, int2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Response response0 = null;
      // Undeclared exception!
      try { 
        HttpHeaders.contentLength((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("jCc8", 645, "jCc8");
      assertEquals(645, int0);
      
      String[] stringArray0 = new String[4];
      stringArray0[0] = "jCc8";
      stringArray0[1] = "jCc8";
      stringArray0[2] = "jCc8";
      stringArray0[3] = "jCc8";
      Headers headers0 = Headers.of(stringArray0);
      HttpHeaders.parseChallenges(headers0, "jCc8");
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      HttpUrl.parse("jCc8");
      HttpHeaders.receiveHeaders(cookieJar0, (HttpUrl) null, headers0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "jCc8");
      assertEquals(0, list0.size());
      
      Headers headers1 = Headers.of(stringArray0);
      headers1.newBuilder();
      headers1.names();
      Headers headers2 = HttpHeaders.varyHeaders(headers1, headers1);
      assertEquals(0, headers2.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = ", mCessage=";
      stringArray0[1] = ", mCessage=";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, ", mCessage=");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = ", message=";
      stringArray0[1] = ", message=";
      stringArray0[2] = ", message=";
      stringArray0[3] = ", message=";
      stringArray0[4] = "arq1*U@---O";
      stringArray0[5] = ", message=";
      Headers headers0 = Headers.of(stringArray0);
      HttpHeaders.parseChallenges(headers0, ", message=");
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(0, headers1.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("(O;oPy[5G]vXh", "4y(rnkc");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      headers0.toMultimap();
      HttpHeaders.varyHeaders(headers0, headers0);
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches((Response) null, headers0, (Request) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("vary", ":-wB<0");
      hashMap0.put("HEAD", "HEAD");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      headers0.toString();
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(0, headers1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("vary", "vary");
      int int0 = HttpHeaders.parseSeconds("8", (-983));
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = ", message=";
      stringArray0[1] = ", message=";
      stringArray0[2] = ", message=";
      stringArray0[3] = ", message=";
      HttpHeaders.skipWhitespace("fromIndex < 0", 9);
      // Undeclared exception!
      try { 
        HttpHeaders.varyHeaders((Headers) null, (Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Content-Length", "Content-Length");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers.of((Map<String, String>) hashMap0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "vary";
      stringArray0[1] = "vary";
      stringArray0[2] = "vary";
      stringArray0[3] = "vary";
      Headers headers0 = Headers.of(stringArray0);
      headers0.newBuilder();
      HttpHeaders.parseChallenges(headers0, "vary");
      int int0 = HttpHeaders.skipWhitespace("!'m<KLvT+:e!B-8k", 5);
      assertEquals(5, int0);
      
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      Headers headers2 = HttpHeaders.varyHeaders(headers1, headers1);
      HttpHeaders.varyHeaders(headers2, headers1);
      assertEquals(2, headers1.size());
      assertTrue(headers0.equals((Object)headers1));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "{K";
      stringArray0[1] = ", realmge=";
      stringArray0[2] = "K'<QI6@2&\"0v?UFC";
      stringArray0[3] = "l$'|2O$ws?i3]vX$Oj2";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "{K");
      assertEquals(0, list0.size());
  }
}
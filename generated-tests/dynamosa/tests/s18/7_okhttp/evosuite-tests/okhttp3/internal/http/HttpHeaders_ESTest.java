/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 05:12:23 GMT 2019
 */

package okhttp3.internal.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
      int int0 = HttpHeaders.parseSeconds("5", 1);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)", 44);
      assertEquals(44, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("EE MMM d yyyZ HH:mmssfz").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(1745).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(100).when(response0).code();
      doReturn((Headers) null).when(response0).headers();
      doReturn(request0).when(response0).request();
      // Undeclared exception!
      try { 
        HttpHeaders.hasBody(response0);
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
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = Headers.of(stringArray0);
      Headers headers2 = HttpHeaders.varyHeaders(headers0, headers1);
      assertEquals(1, headers2.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "dht]^pelYG+W";
      stringArray0[1] = "Transfer-Encoding";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = Headers.of(stringArray0);
      Headers headers2 = HttpHeaders.varyHeaders(headers0, headers1);
      assertNotSame(headers2, headers0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("", 0, "");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      long long0 = HttpHeaders.contentLength(response0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "dht]^pelYG+W";
      stringArray0[1] = "Transfer-Encoding";
      Headers headers0 = Headers.of(stringArray0);
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Headers) null).when(response0).headers();
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches(response0, headers0, request0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Transfer-Encoding", "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
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
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
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
  public void test11()  throws Throwable  {
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Response) null).when(response0).networkResponse();
      // Undeclared exception!
      try { 
        HttpHeaders.varyHeaders(response0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Headers headers0 = Headers.of(stringArray0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("v|OS6dUe)%7hn=V:", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace("", (-3527));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil(":;/C_Uz-)'9qnP!r", 0, "");
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("", 1724, (String) null);
      assertEquals(1724, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(":;/C_Uz-)'9qnP!r", "F#rl^c zAF");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      HttpHeaders.receiveHeaders(cookieJar0, (HttpUrl) null, headers0);
      assertEquals(1, headers0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      URI uRI0 = MockURI.aHttpURI;
      HttpUrl httpUrl0 = HttpUrl.get(uRI0);
      HttpUrl httpUrl1 = httpUrl0.resolve("q?:Wu");
      HttpHeaders.receiveHeaders(cookieJar0, httpUrl1, headers0);
      assertEquals("/q", httpUrl1.encodedPath());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      URI uRI0 = MockURI.aHttpURI;
      HttpUrl httpUrl0 = HttpUrl.get(uRI0);
      HttpHeaders.receiveHeaders(cookieJar0, httpUrl0, headers0);
      assertEquals(80, httpUrl0.port());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      HttpHeaders.receiveHeaders((CookieJar) null, (HttpUrl) null, headers0);
      assertEquals(0, headers0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("Set-Cookie", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds((String) null, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("", 925);
      assertEquals(925, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Zf;ARZ9r)io)D";
      stringArray0[1] = "Zf;ARZ9r)io)D";
      stringArray0[2] = "TF%`i|,&l!0K <";
      stringArray0[3] = "Zf;ARZ9r)io)D";
      Headers headers0 = Headers.of(stringArray0);
      // Undeclared exception!
      try { 
        HttpHeaders.parseChallenges(headers0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.Headers", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = ")EA&F'";
      stringArray0[1] = ")EA&F'";
      stringArray0[2] = ")EA&F'";
      stringArray0[3] = ")EA&F'";
      stringArray0[4] = ")EA&F'";
      stringArray0[5] = ")EA&F'";
      stringArray0[6] = ")EA&F'";
      stringArray0[7] = "y|+ ";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.hasVaryAll(response0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.hasBody((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Vary";
      stringArray0[1] = "EE MMM d yyyZ HH:mmssfz";
      stringArray0[2] = "EE MMM d yyyZ HH:mmssfz";
      stringArray0[3] = ")ea&'";
      Headers headers0 = Headers.of(stringArray0);
      // Undeclared exception!
      try { 
        HttpHeaders.varyHeaders(headers0, headers0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected char 0x20 at 2 in header name: EE MMM d yyyZ HH:mmssfz
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.varyFields((Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace((String) null, 200);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil("Vary", (-1717986916), "Vary");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil((String) null, 304, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.parseChallenges((Headers) null, ")qk{R");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.contentLength((Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Vary";
      stringArray0[1] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[2] = "Vary";
      stringArray0[3] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[4] = "Vary";
      stringArray0[5] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      Headers headers0 = Headers.of(stringArray0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(2, set0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "vary";
      stringArray0[1] = "v|OS6dUe)%7hn=V:";
      stringArray0[2] = ")EA&F'";
      stringArray0[3] = "v|OS6dUe)%7hn=V:";
      stringArray0[4] = "v|OS6dUe)%7hn=V:";
      stringArray0[5] = "vary";
      Headers headers0 = Headers.of(stringArray0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("0", (-1117));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("url == null", 3);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("zf;arz9r)io)d", 3004);
      assertEquals(3004, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)", 3, "EE MMM d yyyZ HH:mmssfz");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("l<").when(request0).method();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(102).when(response0).code();
      doReturn((String) null).when(response0).header(anyString());
      doReturn(headers0).when(response0).headers();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("lNA<").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(204).when(response0).code();
      doReturn((Headers) null).when(response0).headers();
      doReturn(request0).when(response0).request();
      // Undeclared exception!
      try { 
        HttpHeaders.hasBody(response0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("l<").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(44).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(":NA[").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(200).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        HttpHeaders.receiveHeaders(cookieJar0, (HttpUrl) null, (Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.Cookie", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "}_ F";
      stringArray0[1] = "}_ F";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "}_ F");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "}HEA";
      stringArray0[1] = "}HEA";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "}HEA");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "3");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertNotSame(headers1, headers0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("2|.67Had!wFS4:1Fq", "2|.67Had!wFS4:1Fq");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.varyMatches(response0, headers0, (Request) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[1] = "builder.domain == null";
      stringArray0[2] = "builder.domain == null";
      stringArray0[3] = "builder.domain == null";
      stringArray0[4] = "Content-Length";
      stringArray0[5] = "@m+$u&p";
      stringArray0[6] = "NDs";
      stringArray0[7] = "builder.domain == null";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
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
  public void test59()  throws Throwable  {
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Headers) null).when(response0).headers();
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches(response0, (Headers) null, (Request) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
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
}

/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 01:00:58 GMT 2019
 */

package okhttp3.internal.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import java.net.URL;
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
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpHeaders_ESTest extends HttpHeaders_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("0", 56319);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("Vary", 5, "Vary");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("6EQ]5f>d?").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(768).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Vary", "0zn04^,,me>)s");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = Headers.of((Map<String, String>) hashMap0);
      Headers headers2 = HttpHeaders.varyHeaders(headers1, headers0);
      assertEquals(0, headers2.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = Headers.of((Map<String, String>) hashMap0);
      Headers headers2 = HttpHeaders.varyHeaders(headers1, headers0);
      assertNotSame(headers1, headers2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("chunked", 0, "chunked");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.hasVaryAll(response0);
      assertFalse(boolean0);
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
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
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
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches((Response) null, (Headers) null, (Request) null);
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
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("!Bq6g88xVt!Fq<*!", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil("", (-165), "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("F{BddB", ")!xK9FX-");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      HttpHeaders.receiveHeaders(cookieJar0, (HttpUrl) null, headers0);
      assertEquals(1, headers0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      HttpHeaders.receiveHeaders(cookieJar0, (HttpUrl) null, headers0);
      assertEquals(0, headers0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.getHttpExample();
      HttpUrl httpUrl0 = HttpUrl.get(uRL0);
      HttpUrl httpUrl1 = httpUrl0.resolve(" \"<>^`{}|/?#");
      HttpHeaders.receiveHeaders(cookieJar0, httpUrl1, headers0);
      assertEquals("", httpUrl1.encodedPassword());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("}BwRcxOZ4BS5oh", (-1485));
      assertEquals((-1485), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds((String) null, 3338);
      assertEquals(3338, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "p/1&yyl1nVZIZ";
      stringArray0[1] = "GHj r+bOSY/ ";
      stringArray0[2] = "GHj r+bOSY/ ";
      stringArray0[3] = "GHj r+bOSY/ ";
      stringArray0[4] = "GHj r+bOSY/ ";
      stringArray0[5] = "GHj r+bOSY/ ";
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
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "l fxs-u6@1i%k?/";
      stringArray0[1] = "l fxs-u6@1i%k?/";
      stringArray0[2] = "\n not found: size=";
      stringArray0[3] = "ipe#";
      stringArray0[4] = ",";
      stringArray0[5] = "";
      stringArray0[6] = "encodedPathSegments == null";
      stringArray0[7] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Headers) null).when(response0).headers();
      // Undeclared exception!
      try { 
        HttpHeaders.hasVaryAll(response0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace((String) null, 1641);
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
        HttpHeaders.skipUntil((String) null, 0, (String) null);
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
      URI uRI0 = MockURI.aHttpURI;
      HttpUrl httpUrl0 = HttpUrl.get(uRI0);
      // Undeclared exception!
      try { 
        HttpHeaders.receiveHeaders((CookieJar) null, httpUrl0, (Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.Cookie", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.parseChallenges((Headers) null, "<auz[");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("2", 56319);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("-9223372036854775808", 204);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("dqteh>j", 5);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("@k{XDp,1| ", 9);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace("", (-165));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("&gRj4", 768);
      assertEquals(768, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("[$k,xubapqD{", 5, "CMf*<s|");
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("$values").when(request0).method();
      String[] stringArray0 = new String[0];
      Headers headers0 = Headers.of(stringArray0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(113).when(response0).code();
      doReturn("chunked").when(response0).header(anyString());
      doReturn(headers0).when(response0).headers();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("e0y_").when(request0).method();
      String[] stringArray0 = new String[0];
      Headers headers0 = Headers.of(stringArray0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(204).when(response0).code();
      doReturn("e0y_").when(response0).header(anyString());
      doReturn(headers0).when(response0).headers();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("6EQ]56>d?").when(request0).method();
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
  public void test43()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("$values").when(request0).method();
      String[] stringArray0 = new String[0];
      Headers headers0 = Headers.of(stringArray0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(304).when(response0).code();
      doReturn("$values").when(response0).header(anyString());
      doReturn(headers0).when(response0).headers();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("$values").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(95).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("J9^BmSD)!kG22<Vg=h", "; realm=");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "J9^BmSD)!kG22<Vg=h");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Var[", "Var[");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "Var[");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("; pa1Fh=", "; pa1Fh=");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "; pa1Fh=");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "; pa1Fh=");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "vary";
      stringArray0[1] = "vary";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      Headers headers2 = HttpHeaders.varyHeaders(headers0, headers1);
      assertEquals(1, headers2.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "encodedPassword == null";
      stringArray0[1] = "vary";
      stringArray0[2] = "vary";
      stringArray0[3] = "vary";
      stringArray0[4] = "vary";
      stringArray0[5] = "vary";
      stringArray0[6] = "vary";
      stringArray0[7] = "vary";
      Headers headers0 = Headers.of(stringArray0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertTrue(set0.contains("vary"));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("vary", "*");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("vary", "vary");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches(response0, headers0, (Request) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.varyMatches(response0, headers0, (Request) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "; expires=";
      stringArray0[1] = "T=-%P\"h:+!mx";
      stringArray0[2] = "; expires=";
      stringArray0[3] = "public";
      stringArray0[4] = "Content-Length";
      stringArray0[5] = "vary";
      stringArray0[6] = "; expires=";
      stringArray0[7] = "T=-%P\"h:+!mx";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
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
/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 22:06:53 GMT 2019
 */

package okhttp3.internal.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpHeaders_ESTest extends HttpHeaders_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("R", 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("size < 4: ").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(3722).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("size < 4: ").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(200).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(" eam=").when(request0).method();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers.of((Map<String, String>) hashMap0);
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
      String[] stringArray0 = new String[6];
      stringArray0[0] = "vary";
      stringArray0[1] = "password == null";
      stringArray0[2] = "password == null";
      stringArray0[3] = "password == null";
      stringArray0[4] = "vary";
      stringArray0[5] = "password == null";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = Headers.of(stringArray0);
      // Undeclared exception!
      try { 
        HttpHeaders.varyHeaders(headers1, headers0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected char 0x20 at 8 in header name: password == null
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = ";q*^~bwhmeiy!u,6$$";
      stringArray0[1] = "oLNa|b{u)C";
      stringArray0[2] = "oLNa|b{u)C";
      stringArray0[3] = "([^ \"=]*)";
      stringArray0[4] = "vary";
      stringArray0[5] = "password == null";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = Headers.of(stringArray0);
      Headers headers2 = HttpHeaders.varyHeaders(headers0, headers1);
      assertEquals(0, headers2.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "DY/VR";
      stringArray0[1] = "";
      stringArray0[2] = "Content-Length";
      stringArray0[3] = "ExX;E,@5==";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = Headers.of(stringArray0);
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(headers1).when(request0).headers();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(request0).when(response0).request();
      Response response1 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response1).headers();
      doReturn(response0).when(response1).networkResponse();
      Headers headers2 = HttpHeaders.varyHeaders(response1);
      assertFalse(headers2.equals((Object)headers0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "vary";
      stringArray0[1] = "eee, dd-mmm-yyyy hh:mm:ss z";
      stringArray0[2] = "eee, dd-mmm-yyyy hh:mm:ss z";
      stringArray0[3] = "eee, dd-mmm-yyyy hh:mm:ss z";
      stringArray0[4] = "vary";
      stringArray0[5] = "eee, dd-mmm-yyyy hh:mm:ss z";
      Headers headers0 = Headers.of(stringArray0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("k,{@$(NSLi |ZlD", 0, "lk?OYK%dshiZc~0wu(C");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.hasVaryAll(response0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      long long0 = HttpHeaders.contentLength(response0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[4];
      stringArray0[0] = "sge oQ4: ";
      stringArray0[1] = "sge oQ4: ";
      stringArray0[2] = "sge oQ4: ";
      stringArray0[3] = "sge oQ4: ";
      Headers headers0 = Headers.of(stringArray0);
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
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "l,4f_+l;$ )ujfa9xm3";
      stringArray0[1] = "{\"#)";
      stringArray0[2] = "~+";
      stringArray0[3] = "EEE, dd-MMM-yyyy HH-mm-ss z";
      stringArray0[4] = "I";
      stringArray0[5] = "Content-Length";
      stringArray0[6] = "th";
      stringArray0[7] = "";
      Headers headers0 = Headers.of(stringArray0);
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("", 32);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil(">:'!Xb>Fv~", 0, "9]TS-lp");
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("dy/vr", "k,{@$(NSLi |ZlD");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      HttpHeaders.receiveHeaders(cookieJar0, (HttpUrl) null, headers0);
      assertEquals(1, headers0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.getHttpExample();
      URL uRL1 = MockURL.URL(uRL0, "?<TzK<a@k");
      HttpUrl httpUrl0 = HttpUrl.get(uRL1);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      HttpHeaders.receiveHeaders(cookieJar0, httpUrl0, headers0);
      assertNull(httpUrl0.fragment());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      HttpHeaders.receiveHeaders((CookieJar) null, (HttpUrl) null, headers0);
      assertEquals(0, headers0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds((String) null, 5);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("", (-4686));
      assertEquals((-4686), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace("iarPI<zcr<Ut", (-3396));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace((String) null, 2048);
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
        HttpHeaders.skipUntil("\"[^\"]\"", (-2005840694), "\"[^\"]\"");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil((String) null, 34, (String) null);
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
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.parseChallenges((Headers) null, " #&ph;@,MeKBK/Tv");
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
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "y$u(<uh1";
      stringArray0[1] = "vary";
      stringArray0[2] = "vary";
      stringArray0[3] = "vary";
      stringArray0[4] = "vary";
      stringArray0[5] = "vary";
      Headers headers0 = Headers.of(stringArray0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertTrue(set0.contains("vary"));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("8", (-7));
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)", 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(";Q*^~BWhMEiy!U,6$$", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("", 829, "");
      assertEquals(829, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("size < 4: ").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(304).when(response0).code();
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
  public void test44()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(", realm=").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("HEAD").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(", real=").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(response0).code();
      doReturn(request0).when(response0).request();
      HttpHeaders.hasBody(response0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.getHttpExample();
      HttpUrl httpUrl0 = HttpUrl.get(uRL0);
      HttpHeaders.receiveHeaders(cookieJar0, httpUrl0, headers0);
      assertEquals("", httpUrl0.encodedPassword());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = ", realm=";
      stringArray0[1] = ", realm=";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, ", realm=");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = ", code=";
      stringArray0[1] = ", code=";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, ", code=");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "(37A{PKIo8H";
      stringArray0[1] = "(37A{PKIo8H";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "(37A{PKIo8H");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, (String) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertTrue(headers1.equals((Object)headers0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "vary";
      stringArray0[1] = "vary";
      stringArray0[2] = "e`kwz*y9$)";
      stringArray0[3] = "vary";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(1, headers1.size());
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
      String[] stringArray0 = new String[4];
      stringArray0[0] = "DY/VR";
      stringArray0[1] = "";
      stringArray0[2] = "Content-Length";
      stringArray0[3] = "ExX;E,@5==";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
}
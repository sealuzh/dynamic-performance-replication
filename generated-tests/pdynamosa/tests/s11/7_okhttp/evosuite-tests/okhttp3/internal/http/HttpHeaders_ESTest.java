/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 20:00:39 GMT 2019
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
import java.util.function.BiFunction;
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
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("ContenZ-LentA").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(200).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "vary";
      stringArray0[1] = "vary";
      stringArray0[2] = "vary";
      stringArray0[3] = ",n)&.?6)tA9VGFYf";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(2, headers1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      stringArray0[2] = "Vary";
      stringArray0[3] = "Vary";
      stringArray0[4] = "Vary";
      stringArray0[5] = "Vary";
      stringArray0[6] = "Vary";
      stringArray0[7] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(request0).headers();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(request0).when(response0).request();
      Response response1 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response1).headers();
      doReturn(response0).when(response1).networkResponse();
      Headers headers1 = HttpHeaders.varyHeaders(response1);
      assertEquals(4, headers1.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("jYQ$B7Yr[jIbrwU3aG", (-333));
      assertEquals((-333), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Set-Cookie";
      stringArray0[1] = "Set-Cookie";
      stringArray0[2] = "Set-Cookie";
      stringArray0[3] = "Set-Cookie";
      stringArray0[4] = "Set-Cookie";
      stringArray0[5] = "Set-Cookie";
      stringArray0[6] = "Set-Cookie";
      stringArray0[7] = "Set-Cookie";
      Headers headers0 = Headers.of(stringArray0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.hasVaryAll(response0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      long long0 = HttpHeaders.contentLength(response0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      stringArray0[2] = "Vary";
      stringArray0[3] = "Vary";
      stringArray0[4] = "Vary";
      stringArray0[5] = "Vary";
      stringArray0[6] = "Vary";
      stringArray0[7] = "Vary";
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
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(">[ >4~b=[+%<zn)", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("", 49);
      assertEquals(49, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("", 0, "");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.getHttpExample();
      HttpUrl httpUrl0 = HttpUrl.get(uRL0);
      HttpUrl httpUrl1 = httpUrl0.resolve("vfE%=?eH");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "BOr)R2n Y~75o<";
      stringArray0[1] = "vfE%=?eH";
      stringArray0[2] = "Content-Length";
      stringArray0[3] = "vfE%=?eH";
      stringArray0[4] = "vfE%=?eH";
      stringArray0[5] = "Content-Length";
      stringArray0[6] = "Content-Length";
      stringArray0[7] = "vfE%=?eH";
      Headers headers0 = Headers.of(stringArray0);
      HttpHeaders.receiveHeaders(cookieJar0, httpUrl1, headers0);
      assertEquals("", httpUrl1.encodedUsername());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds((String) null, 200);
      assertEquals(200, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, (String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      stringArray0[2] = "Vary";
      stringArray0[3] = "Vary";
      stringArray0[4] = "Vary";
      stringArray0[5] = "Vary";
      stringArray0[6] = "Vary";
      stringArray0[7] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace("{y", (-1842049255));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace((String) null, (-132));
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
        HttpHeaders.skipUntil("vara", (-490), "vara");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil((String) null, 57, (String) null);
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
        HttpHeaders.receiveHeaders((CookieJar) null, (HttpUrl) null, (Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.Cookie", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.parseChallenges((Headers) null, "BGc");
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
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      Headers headers2 = HttpHeaders.varyHeaders(headers0, headers1);
      assertNotSame(headers1, headers2);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge(",", "h?z?sn7hx4p", biFunction0);
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      stringArray0[2] = "Vary";
      stringArray0[3] = "Vary";
      stringArray0[4] = "Vary";
      stringArray0[5] = "Vary";
      stringArray0[6] = "Vary";
      stringArray0[7] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertTrue(set0.contains("Vary"));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("1", (-115979082));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("-9223372036854775808", 921);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)", 5);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("unexpected port: ", 16);
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("iD|(dw$Sz", 5, "`bs2v$=lpR*[#ZC{L");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("Content-Length", 1832, ")ct");
      assertEquals(1832, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("JMB3XfA").when(request0).method();
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
  public void test42()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("m}y%*").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(432).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("u!=( =ntl").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(32).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = " t(P^ \"=]*=(:?AA^d(*+[^\"5]*)) *(:?,$)";
      stringArray0[1] = " t(P^ \"=]*=(:?AA^d(*+[^\"5]*)) *(:?,$)";
      stringArray0[2] = " t(P^ \"=]*=(:?AA^d(*+[^\"5]*)) *(:?,$)";
      stringArray0[3] = " t(P^ \"=]*=(:?AA^d(*+[^\"5]*)) *(:?,$)";
      stringArray0[4] = "set-cookie";
      stringArray0[5] = " t(P^ \"=]*=(:?AA^d(*+[^\"5]*)) *(:?,$)";
      Headers headers0 = Headers.of(stringArray0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      URI uRI0 = MockURI.aHttpURI;
      HttpUrl httpUrl0 = HttpUrl.get(uRI0);
      HttpHeaders.receiveHeaders(cookieJar0, httpUrl0, headers0);
      assertNull(httpUrl0.encodedFragment());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      URI uRI0 = MockURI.aHttpURI;
      HttpUrl httpUrl0 = HttpUrl.get(uRI0);
      HttpHeaders.receiveHeaders(cookieJar0, httpUrl0, headers0);
      assertEquals("", httpUrl0.password());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "HIw?B;}em=q";
      stringArray0[1] = "%B,%e";
      stringArray0[2] = "hE.p*#`}A";
      stringArray0[3] = "fffe";
      stringArray0[4] = "6^ vgombl+9o-apnl=h";
      stringArray0[5] = "HmacSHA256";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "6^ vgombl+9o-apnl=h");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("; Rcharset=utf-8", "; Rcharset=utf-8");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "; Rcharset=utf-8");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Vary", "Vary");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      Headers headers2 = HttpHeaders.varyHeaders(headers0, headers1);
      assertEquals(1, headers2.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("vary", "&U6Q[>RAL/");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(0, headers1.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      stringArray0[2] = "Vary";
      stringArray0[3] = "Vary";
      stringArray0[4] = "Vary";
      stringArray0[5] = "Vary";
      stringArray0[6] = "Vary";
      stringArray0[7] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      stringArray0[2] = "Vary";
      stringArray0[3] = "Vary";
      stringArray0[4] = "Vary";
      stringArray0[5] = "Vary";
      stringArray0[6] = "Vary";
      stringArray0[7] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(request0).headers(anyString());
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.varyMatches(response0, headers0, request0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      stringArray0[2] = "Vary";
      stringArray0[3] = "Vary";
      stringArray0[4] = "Vary";
      stringArray0[5] = "Vary";
      stringArray0[6] = "Vary";
      stringArray0[7] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      List<String> list0 = headers0.values("Vary");
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(list0).when(request0).headers(anyString());
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.varyMatches(response0, headers0, request0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("VM0lk0").when(request0).method();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "VM0lk0";
      stringArray0[1] = "VM0lk0";
      stringArray0[2] = "VM0lk0";
      stringArray0[3] = "VM0lk0";
      Headers headers0 = Headers.of(stringArray0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(100).when(response0).code();
      doReturn("<v+:/aW").when(response0).header(anyString());
      doReturn(headers0).when(response0).headers();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "okhttp3.internal.http.HttpHeaders";
      stringArray0[1] = "okhttp3.internal.http.HttpHeaders";
      stringArray0[2] = "Content-Length";
      stringArray0[3] = "okhttp3.internal.http.HttpHeaders";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "8ary";
      stringArray0[1] = "8ary";
      stringArray0[2] = "8ary";
      stringArray0[3] = "8ary";
      stringArray0[4] = "8ary";
      stringArray0[5] = "8ary";
      stringArray0[6] = "8ary";
      stringArray0[7] = "8ary";
      Headers headers0 = Headers.of(stringArray0);
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(request0).headers();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(request0).when(response0).request();
      Response response1 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response1).headers();
      doReturn(response0).when(response1).networkResponse();
      Headers headers1 = HttpHeaders.varyHeaders(response1);
      assertEquals(0, headers1.size());
      
      Response response2 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response2).headers();
      boolean boolean0 = HttpHeaders.varyMatches(response2, headers1, (Request) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Headers) null).when(response0).headers();
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches(response0, (Headers) null, request0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }
}

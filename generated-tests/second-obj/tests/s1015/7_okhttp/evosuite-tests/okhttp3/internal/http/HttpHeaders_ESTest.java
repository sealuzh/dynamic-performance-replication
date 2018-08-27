/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:18:31 GMT 2018
 */

package okhttp3.internal.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpHeaders_ESTest extends HttpHeaders_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(0, headers1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      HttpHeaders.receiveHeaders(cookieJar0, (HttpUrl) null, headers0);
      assertEquals(0, headers0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("http:", 0, "http:");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("5q.ioL", 5, "l~=<k[h$");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("HEA E-zD", "HEA E-zD");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "HEA E-zD");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("81iBfQ|;V-,xo>", "81iBfQ|;V-,xo>", biFunction0);
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      headers0.get("81iBfQ|;V-,xo>");
      headers0.names();
      HttpHeaders.parseChallenges(headers0, "81iBfQ|;V-,xo>");
      Headers headers1 = Headers.of((Map<String, String>) hashMap0);
      assertNotSame(headers1, headers0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HttpHeaders.skipWhitespace(" +([^ \"=]*L=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)", 0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      assertEquals(0, headers0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      headers0.toString();
      headers0.values(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
      HttpHeaders.varyFields(headers0);
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
  public void test12()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("2", 86);
      assertEquals(2, int0);
      
      int int1 = HttpHeaders.skipWhitespace("2", 86);
      assertEquals(86, int1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Vary", "Vary");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      int int0 = HttpHeaders.skipWhitespace("Vary", 1);
      assertEquals(1, int0);
      
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Vary";
      stringArray0[1] = ">^%Q0EJlEz(";
      stringArray0[2] = "Vary";
      stringArray0[3] = "J!&.sZ[mb";
      stringArray0[4] = "ci0>";
      stringArray0[5] = "Vary";
      stringArray0[6] = "ci0>";
      stringArray0[7] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      headers0.names();
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>(1);
      hashMap0.put("Vary", "Vary");
      hashMap0.put("J|KV? D/", "q{xge2u");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      headers1.newBuilder();
      assertEquals(1, headers1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Content-Length";
      stringArray0[1] = "&TT#Pn!vzSwfv*";
      stringArray0[2] = "0000ffff";
      stringArray0[3] = "0000ffff";
      stringArray0[4] = "DAYMZTt=:mG(uqR";
      stringArray0[5] = "0000ffff";
      stringArray0[6] = "&TT#Pn!vzSwfv*";
      stringArray0[7] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.replace("8f1_iBfQ|;V-,o>", "8f1_iBfQ|;V-,o>", "8f1_iBfQ|;V-,o>");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("8f1_iBfQ|;V-,o>", "Uvailk0e == nu=l", biFunction0);
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      headers0.names();
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "8f1_iBfQ|;V-,o>");
      assertTrue(list0.isEmpty());
      
      int int0 = HttpHeaders.skipWhitespace("8f1_iBfQ|;V-,o>", 1684);
      assertEquals(1684, int0);
  }
}
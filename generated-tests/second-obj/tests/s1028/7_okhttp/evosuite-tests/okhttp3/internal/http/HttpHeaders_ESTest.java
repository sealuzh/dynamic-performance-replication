/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:17:35 GMT 2018
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
      int int0 = HttpHeaders.skipUntil("c/n", 2619, "c/n");
      assertEquals(2619, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers.of((Map<String, String>) hashMap0);
      int int0 = HttpHeaders.skipWhitespace("kw7z:yh{[jp>r#]+d", 3761);
      assertEquals(3761, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertNotSame(headers1, headers0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "2w`e/g";
      stringArray0[1] = "2w`e/g";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "2w`e/g");
      assertEquals(0, list0.size());
      
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("]ypYWe`KPWIPv2F", 5, " \"':;<=>@[]^`{}|/?#&!$(),~");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      HttpHeaders.receiveHeaders((CookieJar) null, (HttpUrl) null, headers0);
      assertEquals(0, headers0.size());
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
  public void test09()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(" mst have a reqest body.", 0);
      int int1 = HttpHeaders.parseSeconds(" mst have a reqest body.", 1);
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "griQ4o7vP*8of!&Elg";
      stringArray0[1] = "Transfer-Encoding";
      stringArray0[2] = "Transfer-Encoding";
      stringArray0[3] = "=2cl;bz3";
      stringArray0[4] = "Content-Length";
      stringArray0[5] = "e-io(j#~";
      Headers headers0 = Headers.of(stringArray0);
      headers0.getDate("Transfer-Encoding");
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Response response0 = null;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "uo=z@;dMn~z";
      stringArray0[1] = "uo=z@;dMn~z";
      stringArray0[2] = "cwjq|ic}d;zb34";
      stringArray0[3] = "uo=z@;dMn~z";
      stringArray0[4] = "oj/*h;9\r;";
      stringArray0[5] = "cwjq|ic}d;zb34";
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
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      stringArray0[2] = "Vary";
      stringArray0[3] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "griQ4o7vP*8of!&Elg";
      stringArray0[1] = "Transfer-Encoding";
      stringArray0[2] = "vary";
      stringArray0[3] = "griQ4o7vP*8of!&Elg";
      stringArray0[4] = "griQ4o7vP*8of!&Elg";
      stringArray0[5] = "griQ4o7vP*8of!&Elg";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
      
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(2, headers1.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HttpHeaders.parseSeconds("0", 1426);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "#([`X";
      stringArray0[1] = "request =k npl=";
      stringArray0[2] = "#([`X";
      stringArray0[3] = "request =k npl=";
      Headers headers0 = Headers.of(stringArray0);
      HttpHeaders.hasVaryAll(headers0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      headers0.names();
      headers0.getDate("request =k npl=");
      HttpHeaders.parseChallenges(headers0, "#([`X");
      headers0.get("request =k npl=");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("-9223372036854775808", Integer.MAX_VALUE);
      assertEquals(0, int0);
      
      int int1 = HttpHeaders.skipUntil("fJqgG,}:@sy#WQ2@*", 4516, "-9223372036854775808");
      assertEquals(4516, int1);
  }
}
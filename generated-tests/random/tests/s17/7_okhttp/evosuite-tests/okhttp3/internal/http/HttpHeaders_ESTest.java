/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:09:53 GMT 2019
 */

package okhttp3.internal.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
      int int0 = HttpHeaders.skipUntil("yr1QMP", 2414, "v>%x");
      assertEquals(2414, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("vary", 978);
      assertEquals(978, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil("'9hu(bzx=bxr j", (-1057), "HTTP_1_1");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil((String) null, (-990), (String) null);
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
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Request) null).when(response0).request();
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
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("JK1", "g:9p.$(_^k");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertFalse(set0.contains("g:9p.$(_^k"));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("0", 200);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("-9223372036854775808", (-2650));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(" #%/:?@[]", 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("!:o)r't\"!=]QzL1", 14);
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("t>YU(:Ii", Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("06@FGNdcGwme2Mp", 9, "06@FGNdcGwme2Mp");
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("-mwa\"9\"% [lu&zm&{)", 9, "$@!Q@}<rw|\"J.^r'x");
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      HttpHeaders.receiveHeaders((CookieJar) null, (HttpUrl) null, headers0);
      assertEquals(0, headers0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "O4D/\bPDWL%9o!";
      stringArray0[1] = "'t)h9<S_e/u(d,<I~";
      stringArray0[2] = "htP";
      stringArray0[3] = ")";
      stringArray0[4] = "ks@T";
      stringArray0[5] = "; realmge=0";
      stringArray0[6] = "username == null";
      stringArray0[7] = "m[WX";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "ks@T");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "WB`(&p@$";
      stringArray0[1] = "aQ+Eo";
      stringArray0[2] = "$7/^P{>@*!B9.mx^NW";
      stringArray0[3] = "N9@':Ap<GF!X:Uqu^";
      stringArray0[4] = "Nd/~?tzZ<hq9b";
      stringArray0[5] = "realm";
      stringArray0[6] = "MISSING_SCHEME";
      stringArray0[7] = "";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "Nd/~?tzZ<hq9b");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "x";
      stringArray0[1] = "; max-age=0";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "x");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "vary";
      stringArray0[1] = "vary";
      stringArray0[2] = "vary";
      stringArray0[3] = "vary";
      stringArray0[4] = "vary";
      stringArray0[5] = "vary";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(3, headers1.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertTrue(headers1.equals((Object)headers0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "vary";
      stringArray0[1] = "oz%";
      stringArray0[2] = "Mq$<D}Ns_f%";
      stringArray0[3] = "username == null";
      stringArray0[4] = "Vary";
      stringArray0[5] = "wb`(&p@$";
      stringArray0[6] = "'t)h9<S_e/u(d,<I~";
      stringArray0[7] = "([^ \"=]*)";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(0, headers1.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "GH&G8:>h@v1%w9#\"h]";
      stringArray0[1] = " for ";
      stringArray0[2] = "Vary";
      stringArray0[3] = "*";
      stringArray0[4] = "*";
      stringArray0[5] = "ouit(@k}:,b,ob8g";
      Headers headers0 = Headers.of(stringArray0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Content-Length";
      stringArray0[1] = "27BZtl\u0005HJ{feK";
      stringArray0[2] = "HEAD";
      stringArray0[3] = ", url=";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.varyMatches(response0, headers0, (Request) null);
      assertTrue(boolean0);
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
}
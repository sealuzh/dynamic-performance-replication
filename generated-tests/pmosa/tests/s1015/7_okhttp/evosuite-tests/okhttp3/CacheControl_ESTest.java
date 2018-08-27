/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 06:29:27 GMT 2018
 */

package okhttp3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheControl_ESTest extends CacheControl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(Integer.MAX_VALUE, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noCache();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.noTransform();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.onlyIfCached();
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder4.noStore();
      cacheControl_Builder1.maxAge(1273, timeUnit0);
      CacheControl.Builder cacheControl_Builder6 = cacheControl_Builder5.onlyIfCached();
      CacheControl.Builder cacheControl_Builder7 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder8 = cacheControl_Builder1.noCache();
      assertSame(cacheControl_Builder8, cacheControl_Builder6);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(0, timeUnit0);
      TimeUnit timeUnit1 = TimeUnit.NANOSECONDS;
      cacheControl_Builder1.minFresh(354, timeUnit1);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noStore();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.onlyIfCached();
      CacheControl cacheControl0 = cacheControl_Builder3.build();
      cacheControl_Builder3.onlyIfCached();
      CacheControl cacheControl1 = CacheControl.FORCE_NETWORK;
      cacheControl1.noCache();
      int int0 = cacheControl0.maxAgeSeconds();
      assertEquals(0, cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), int0);
      assertTrue(cacheControl0.noStore());
      assertTrue(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(1001, timeUnit0);
      TimeUnit timeUnit1 = TimeUnit.DAYS;
      cacheControl_Builder1.minFresh(Integer.MAX_VALUE, timeUnit1);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noCache();
      TimeUnit timeUnit2 = TimeUnit.SECONDS;
      cacheControl_Builder1.noTransform();
      cacheControl_Builder2.maxAge(2848, timeUnit2);
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder0.noStore();
      TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
      cacheControl_Builder2.maxStale(1001, timeUnit3);
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder2.onlyIfCached();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder4);
      cacheControl0.FORCE_CACHE.toString();
      cacheControl0.FORCE_CACHE.toString();
      cacheControl_Builder4.maxAge(Integer.MAX_VALUE, timeUnit0);
      cacheControl0.toString();
      cacheControl0.maxAgeSeconds();
      cacheControl0.sMaxAgeSeconds();
      cacheControl0.isPublic();
      cacheControl0.maxAgeSeconds();
      cacheControl0.toString();
      TimeUnit timeUnit4 = TimeUnit.MINUTES;
      // Undeclared exception!
      try { 
        cacheControl_Builder3.maxAge((-976), timeUnit4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -976
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(0, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder0.noCache();
      TimeUnit timeUnit1 = TimeUnit.SECONDS;
      cacheControl_Builder0.noCache();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder1.maxAge(0, timeUnit1);
      cacheControl_Builder0.noTransform();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.noCache();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder4);
      cacheControl0.FORCE_NETWORK.headerValue = "s-maxage";
      cacheControl0.noStore();
      TimeUnit timeUnit2 = TimeUnit.MINUTES;
      cacheControl_Builder3.maxStale(0, timeUnit2);
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder1.onlyIfCached();
      cacheControl_Builder2.noTransform();
      cacheControl0.maxStaleSeconds();
      CacheControl.Builder cacheControl_Builder6 = cacheControl_Builder2.noCache();
      assertSame(cacheControl_Builder6, cacheControl_Builder5);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.mustRevalidate();
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.onlyIfCached();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.maxAge(0, timeUnit0);
      cacheControl_Builder1.noTransform();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.maxStale(32, timeUnit0);
      TimeUnit timeUnit1 = TimeUnit.NANOSECONDS;
      cacheControl_Builder4.maxAge(0, timeUnit1);
      cacheControl_Builder3.onlyIfCached();
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder4.noCache();
      cacheControl_Builder5.maxStale(2389, timeUnit1);
      cacheControl_Builder5.build();
      cacheControl_Builder5.minFresh(0, timeUnit1);
      cacheControl_Builder5.noCache();
      cacheControl0.noTransform();
      cacheControl0.maxAgeSeconds();
      cacheControl0.noCache();
      cacheControl_Builder0.noTransform();
      cacheControl_Builder3.build();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      String string0 = "";
      // Undeclared exception!
      try { 
        headers_Builder0.add("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected header: 
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertTrue(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("qxo?@rmr^r!uvacu%[");
      Headers.Builder headers_Builder2 = headers_Builder1.set("wg8v,=:wFgKE", "qxo?@rmr^r!uvacu%[");
      Headers headers0 = headers_Builder2.build();
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.onlyIfCached());
      assertFalse(cacheControl1.isPrivate());
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      assertFalse(cacheControl1.noCache());
      assertFalse(cacheControl1.mustRevalidate());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertFalse(cacheControl1.isPublic());
      assertFalse(cacheControl1.noStore());
      assertFalse(cacheControl1.noTransform());
      assertEquals((-1), cacheControl1.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(82, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noTransform();
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.noCache();
      cacheControl_Builder3.noStore();
      cacheControl_Builder0.noCache();
      cacheControl_Builder1.minFresh(1, timeUnit0);
      cacheControl0.isPrivate();
      cacheControl0.noStore();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals(0, cacheControl0.maxAgeSeconds());
      
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("min-fresh");
      Headers.Builder headers_Builder2 = headers_Builder1.add("min-fresh", "min-fresh");
      Headers headers0 = new Headers(headers_Builder2);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.onlyIfCached());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      assertFalse(cacheControl1.noCache());
      assertFalse(cacheControl1.isPublic());
      assertFalse(cacheControl1.mustRevalidate());
      assertFalse(cacheControl1.noTransform());
      assertEquals((-1), cacheControl1.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      cacheControl0.FORCE_NETWORK.toString();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      cacheControl_Builder0.noTransform();
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      cacheControl0.FORCE_CACHE.headerValue = "s-maxage";
      cacheControl_Builder0.noCache();
      String string0 = cacheControl0.toString();
      assertEquals("", string0);
      
      cacheControl0.FORCE_CACHE.toString();
      cacheControl0.FORCE_CACHE.toString();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      cacheControl_Builder0.maxStale(1035, timeUnit0);
      cacheControl0.noCache();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers headers1 = headers_Builder0.build();
      CacheControl cacheControl2 = CacheControl.parse(headers1);
      cacheControl2.FORCE_CACHE.headerValue = "Y?* x^v}j&'b(QrOc";
      cacheControl0.noCache();
      cacheControl1.FORCE_CACHE.toString();
      cacheControl0.isPublic();
      cacheControl1.FORCE_CACHE.headerValue = "Y?* x^v}j&'b(QrOc";
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(1035, timeUnit0);
      cacheControl_Builder1.noTransform();
      cacheControl2.toString();
      cacheControl1.onlyIfCached();
      cacheControl0.noStore();
      cacheControl2.isPublic();
      CacheControl cacheControl3 = cacheControl_Builder1.build();
      String string1 = cacheControl1.toString();
      assertEquals("", string1);
      
      cacheControl1.maxAgeSeconds();
      cacheControl3.onlyIfCached();
      assertEquals(0, cacheControl3.maxAgeSeconds());
      assertEquals(0, cacheControl3.maxStaleSeconds());
      assertTrue(cacheControl3.noTransform());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>(hashMap0);
      Headers headers0 = Headers.of((Map<String, String>) hashMap1);
      hashMap0.put("(2d9oMi*q;10", "(2d9oMi*q;10");
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      CacheControl.parse(headers0);
      cacheControl0.minFreshSeconds();
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxAge((-1), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -1
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("pragma", "Jqk<>b;");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.noStore();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.removeAll((String) null);
      headers_Builder0.set("*W/R]1", "size < 2: ");
      boolean boolean1 = cacheControl0.isPublic();
      assertTrue(boolean1 == boolean0);
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("pragma", "s-maxage=");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.toString();
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      cacheControl0.toString();
      String string0 = cacheControl1.toString();
      assertEquals("", string0);
      assertNotNull(string0);
      
      Headers headers1 = Headers.of((Map<String, String>) hashMap0);
      Headers.Builder headers_Builder0 = headers1.newBuilder();
      CacheControl.Builder cacheControl_Builder1 = new CacheControl.Builder();
      cacheControl_Builder1.noCache();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder0.onlyIfCached();
      cacheControl_Builder2.onlyIfCached();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.noStore();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.maxStale(82, timeUnit0);
      CacheControl cacheControl2 = new CacheControl(cacheControl_Builder4);
      assertEquals((-1), cacheControl2.minFreshSeconds());
      assertEquals(4920, cacheControl2.maxStaleSeconds());
      assertEquals((-1), cacheControl2.maxAgeSeconds());
      
      cacheControl1.noStore();
      Headers.Builder headers_Builder1 = new Headers.Builder();
      Headers.Builder headers_Builder2 = headers_Builder0.removeAll("");
      Headers.Builder headers_Builder3 = headers_Builder1.addLenient("W 1+^Kc");
      headers_Builder3.add("pragma", "pragma");
      Headers.Builder headers_Builder4 = headers_Builder2.addLenient("", "t\"((22[]zzo]t");
      Headers headers2 = new Headers(headers_Builder4);
      CacheControl cacheControl3 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl3.maxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("pragma", "Jqk<>b;");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      String string0 = cacheControl0.toString();
      assertEquals("", string0);
      assertNotNull(string0);
      
      cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      cacheControl_Builder1.minFresh(1, timeUnit0);
      cacheControl0.isPrivate();
      cacheControl0.noStore();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = new Headers.Builder();
      headers_Builder1.removeAll((String) null);
      Headers.Builder headers_Builder2 = headers_Builder1.add("sgM{G%,0$q\"*", "");
      headers_Builder1.removeAll("KN9R-#l'S");
      headers_Builder1.set("KN9R-#l'S", "d<hh#*w)p:'");
      Headers headers1 = new Headers(headers_Builder2);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertFalse(cacheControl1.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("pragma", "pragma");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.toString();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noCache();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      cacheControl_Builder2.minFresh(1, timeUnit0);
      cacheControl0.isPrivate();
      cacheControl0.noStore();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = new Headers.Builder();
      Headers.Builder headers_Builder2 = headers_Builder1.removeAll("out == null");
      headers_Builder2.add("X&H:sF7*WZ:", "public, ");
      headers_Builder2.removeAll("public, ");
      // Undeclared exception!
      try { 
        headers_Builder0.set("no-store, ", "pragma");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected char 0x20 at 9 in header name: no-store, 
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("pragma", "base64 == null");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.toString();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      cacheControl_Builder1.noCache();
      cacheControl_Builder0.noTransform();
      cacheControl0.isPrivate();
      cacheControl0.noStore();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      // Undeclared exception!
      try { 
        headers_Builder0.set((String) null, "pragma");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name == null
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(82, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noTransform();
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.noCache();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.noStore();
      cacheControl_Builder0.noCache();
      cacheControl_Builder1.minFresh(82, timeUnit0);
      cacheControl_Builder0.noCache();
      cacheControl_Builder4.minFresh(82, timeUnit0);
      boolean boolean0 = cacheControl0.isPrivate();
      assertFalse(boolean0);
      
      cacheControl0.noStore();
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals(0, cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("min-fresh");
      headers_Builder1.removeAll("min-fresh");
      headers_Builder1.add("a\"^h8~{N^*KhM", "no-store");
      headers_Builder1.removeAll("pragma");
      headers_Builder0.set("cache-control", "pragma");
      Headers headers0 = new Headers(headers_Builder0);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertFalse(cacheControl1.noStore());
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertFalse(cacheControl1.mustRevalidate());
      assertFalse(cacheControl1.onlyIfCached());
      assertFalse(cacheControl1.noTransform());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("pragma", ",I,Z");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.noStore();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      // Undeclared exception!
      try { 
        headers_Builder0.addLenient((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }
}

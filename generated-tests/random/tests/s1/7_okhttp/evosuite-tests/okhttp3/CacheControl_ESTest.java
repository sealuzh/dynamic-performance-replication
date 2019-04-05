/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 09:21:19 GMT 2019
 */

package okhttp3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheControl_ESTest extends CacheControl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.minFresh((-660), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -660
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-1734684246), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -1734684246
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.onlyIfCached();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.noCache();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      cacheControl_Builder0.maxAge(192, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.maxAgeSeconds();
      assertEquals(192, int0);
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(2147483645, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxAge((-786), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -786
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      String string0 = cacheControl0.FORCE_CACHE.toString();
      assertEquals("max-stale=2147483647, only-if-cached", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      System.setCurrentTimeMillis(213926400L);
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("QgoFa1M*B78mnLn", "QgoFa1M*B78mnLn");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("Pragma", "min-fresh");
      Headers headers0 = new Headers(headers_Builder2);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.noCache());
      assertFalse(cacheControl1.onlyIfCached());
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      assertFalse(cacheControl1.noTransform());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertFalse(cacheControl1.noStore());
      assertFalse(cacheControl1.isPrivate());
      assertFalse(cacheControl1.mustRevalidate());
      
      cacheControl0.FORCE_CACHE.toString();
      int int0 = cacheControl0.maxAgeSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Pragma";
      stringArray0[1] = "no-transform,";
      stringArray0[2] = "b6S.)5xlH# w=B/h4f";
      stringArray0[3] = "y/";
      stringArray0[4] = "c";
      stringArray0[5] = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";
      stringArray0[6] = "&)|RJ?7^| %|\"3hNswV";
      stringArray0[7] = "s-maxage=";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertTrue(cacheControl0.noTransform());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.add("Cache-Control", "must-revalidate");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertTrue(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.add("Cache-Control", "public, ");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertTrue(cacheControl0.isPublic());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "cache-control";
      stringArray0[1] = "private";
      stringArray0[2] = "=,;";
      stringArray0[3] = "*";
      stringArray0[4] = "-9223372036854775808";
      stringArray0[5] = "-9223372036854775808";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.onlyIfCached());
      assertTrue(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noStore());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("cache-control", "max-age");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noStore());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.add("Pragma", "no-store");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertTrue(cacheControl0.noStore());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("pragma", "s-maxage=");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "pragma";
      stringArray0[1] = "F";
      stringArray0[2] = "pragma";
      stringArray0[3] = "max-stale=2147483647, only-if-cached";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noTransform());
      assertTrue(cacheControl0.onlyIfCached());
      assertEquals(Integer.MAX_VALUE, cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "8;#PNt.'ingt";
      stringArray0[1] = "pragma";
      stringArray0[2] = "pragma";
      stringArray0[3] = "%GVQ;9F+]&x/";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "(|i}>;tqf/u<@~#io";
      stringArray0[1] = "cache-control";
      stringArray0[2] = "cache-control";
      stringArray0[3] = "okio.SegmentedByteString";
      stringArray0[4] = "cache-control";
      stringArray0[5] = "cache-control";
      stringArray0[6] = "okio.SegmentedByteString";
      stringArray0[7] = "cache-control";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("cache-control", "no-cache");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noStore());
      assertTrue(cacheControl0.noCache());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), int0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.isPublic();
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(boolean0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.noTransform();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      int int0 = cacheControl0.maxStaleSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.isPrivate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      cacheControl0.onlyIfCached();
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.noCache();
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
      assertFalse(boolean0);
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.mustRevalidate();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(boolean0);
      assertFalse(cacheControl0.noCache());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("no-transform", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      int int0 = 352;
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.maxStale(352, timeUnit0);
      cacheControl_Builder0.minFresh(352, timeUnit0);
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.maxAge(352, timeUnit0);
      cacheControl_Builder2.onlyIfCached();
      cacheControl_Builder1.noStore();
      cacheControl_Builder3.noStore();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder3);
      TimeUnit timeUnit1 = TimeUnit.DAYS;
      cacheControl_Builder3.noTransform();
      cacheControl_Builder3.maxAge(352, timeUnit1);
      cacheControl0.toString();
      cacheControl0.isPublic();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("private");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl.parse(headers0);
      cacheControl0.minFreshSeconds();
      CacheControl.parse(headers0);
      cacheControl0.FORCE_NETWORK.toString();
      cacheControl0.minFreshSeconds();
      TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        CacheControl.parse((Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.CacheControl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      cacheControl0.noStore();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noStore();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      boolean boolean0 = cacheControl0.noStore();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertTrue(boolean0);
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }
}
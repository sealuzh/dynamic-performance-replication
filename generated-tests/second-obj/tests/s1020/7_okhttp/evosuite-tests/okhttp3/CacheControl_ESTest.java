/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:01:40 GMT 2018
 */

package okhttp3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheControl_ESTest extends CacheControl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.mustRevalidate();
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(boolean0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      cacheControl0.noStore();
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noCache();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.minFresh(1, timeUnit0);
      assertSame(cacheControl_Builder2, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = " > ";
      stringArray0[1] = " > ";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      int int0 = cacheControl0.minFreshSeconds();
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), int0);
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      String string0 = cacheControl0.FORCE_CACHE.toString();
      assertNotNull(string0);
      assertEquals("no-cache", string0);
      
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), int0);
      
      cacheControl0.isPublic();
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(100, timeUnit0);
      cacheControl_Builder1.onlyIfCached();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertEquals("min-fresh=0, only-if-cached", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(2455, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noTransform();
      assertSame(cacheControl_Builder2, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.onlyIfCached();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      int int0 = cacheControl0.minFreshSeconds();
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), int0);
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      // Undeclared exception!
      try { 
        cacheControl_Builder1.maxAge((-272), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -272
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.noTransform();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(216, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      cacheControl0.noCache();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.maxStaleSeconds();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), int0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      boolean boolean0 = cacheControl_Builder1.noTransform;
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-1148095349), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -1148095349
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.FORCE_NETWORK.toString();
      int int0 = cacheControl0.maxAgeSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.build();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.minFresh((-2246), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -2246
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.isPrivate();
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(boolean0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noStore();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("no-store", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertEquals("no-transform", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      cacheControl_Builder0.maxAge(255, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("max-age=0", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.add("Cache-Control", "Cache-Control");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("pragma", "{ZGN8.{,-){");
      Headers.Builder headers_Builder2 = headers_Builder1.removeAll("{ZGN8.{,-){");
      Headers headers0 = new Headers(headers_Builder2);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.set("Cache-Control", "mt;~k)6\"dIcjfk[T^x");
      Headers headers0 = new Headers(headers_Builder0);
      Headers headers1 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.mustRevalidate();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(boolean0);
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.set("Cache-Control", "s-maxge=");
      Headers headers0 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.isPublic();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(boolean0);
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.FORCE_CACHE.toString();
      cacheControl0.FORCE_NETWORK.headerValue = "Cache-Control";
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("Cache-Control", "max-stale=2147483647, only-if-cached");
      Headers headers0 = new Headers(headers_Builder1);
      cacheControl0.noCache();
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertFalse(cacheControl1.noStore());
      assertFalse(cacheControl1.mustRevalidate());
      assertFalse(cacheControl1.isPublic());
      assertEquals(Integer.MAX_VALUE, cacheControl1.maxStaleSeconds());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.noTransform());
      assertFalse(cacheControl1.isPrivate());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertTrue(cacheControl1.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.FORCE_CACHE.toString();
      cacheControl0.FORCE_NETWORK.headerValue = "Cache-Control";
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Cache-Control", "max-stale=2147483647, only-if-cached");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("Cache-Control", "max-stale=2147483647, only-if-cached");
      int int0 = MockThread.MIN_PRIORITY;
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      Headers headers0 = new Headers(headers_Builder2);
      Headers.Builder headers_Builder3 = new Headers.Builder();
      cacheControl0.noCache();
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertFalse(cacheControl1.mustRevalidate());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertTrue(cacheControl1.onlyIfCached());
      assertFalse(cacheControl1.noTransform());
      assertEquals(Integer.MAX_VALUE, cacheControl1.maxStaleSeconds());
      assertFalse(cacheControl1.noCache());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertFalse(cacheControl1.isPrivate());
      assertFalse(cacheControl1.isPublic());
      assertFalse(cacheControl1.noStore());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("Pragma", "Pragma");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.FORCE_CACHE.toString();
      cacheControl0.FORCE_NETWORK.headerValue = "Cache-Control";
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Cache-Control", "max-stale=2147483647, only-if-cached");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("Cache-Control", "max-stale=2147483647, only-if-cached");
      int int0 = MockThread.MIN_PRIORITY;
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      Headers headers0 = new Headers(headers_Builder2);
      headers_Builder1.addLenient("Cache-Control");
      cacheControl0.noCache();
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl1.mustRevalidate();
      assertFalse(cacheControl1.isPrivate());
      assertEquals(Integer.MAX_VALUE, cacheControl1.maxStaleSeconds());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertFalse(cacheControl1.isPublic());
      assertTrue(cacheControl1.onlyIfCached());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.noTransform());
      assertFalse(boolean0);
      assertFalse(cacheControl1.noStore());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(100, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      String string0 = cacheControl0.toString();
      assertEquals("min-fresh=0", string0);
      assertNotNull(string0);
      
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Cache-Control", "min-fresh=0");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl1 = CacheControl.FORCE_CACHE;
      Headers.Builder headers_Builder2 = headers_Builder1.removeAll("t|9");
      headers_Builder2.addLenient("t|9", "Vary");
      Headers headers1 = headers_Builder0.build();
      CacheControl cacheControl2 = CacheControl.parse(headers1);
      boolean boolean0 = cacheControl_Builder0.noStore;
      boolean boolean1 = cacheControl2.isPublic();
      assertFalse(cacheControl2.isPrivate());
      assertEquals((-1), cacheControl2.sMaxAgeSeconds());
      assertFalse(cacheControl2.onlyIfCached());
      assertEquals(0, cacheControl2.minFreshSeconds());
      assertFalse(cacheControl2.noTransform());
      assertFalse(boolean1);
      assertFalse(cacheControl2.noStore());
      assertFalse(cacheControl2.mustRevalidate());
      assertEquals((-1), cacheControl2.maxAgeSeconds());
      assertEquals((-1), cacheControl2.maxStaleSeconds());
      assertFalse(cacheControl2.noCache());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(116, timeUnit0);
      cacheControl_Builder1.noStore();
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      String string0 = cacheControl0.toString();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Cache-Control", "no-store, min-fresh=0");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl1 = CacheControl.FORCE_CACHE;
      Headers.Builder headers_Builder2 = headers_Builder1.removeAll("WxzDrT!i^KC$8k|X<");
      headers_Builder2.addLenient("WxzDrT!i^KC$8k|X<", "Vary");
      Headers headers1 = headers_Builder0.build();
      CacheControl cacheControl2 = CacheControl.parse(headers1);
      boolean boolean0 = cacheControl_Builder0.noStore;
      cacheControl_Builder0.maxAge(116, timeUnit0);
      String string1 = cacheControl2.toString();
      assertFalse(cacheControl2.onlyIfCached());
      assertFalse(cacheControl2.mustRevalidate());
      assertEquals((-1), cacheControl2.sMaxAgeSeconds());
      assertFalse(cacheControl2.isPrivate());
      assertEquals(0, cacheControl2.minFreshSeconds());
      assertEquals((-1), cacheControl2.maxStaleSeconds());
      assertFalse(cacheControl2.isPublic());
      assertEquals((-1), cacheControl2.maxAgeSeconds());
      assertTrue(string1.equals((Object)string0));
      assertTrue(cacheControl2.noStore());
      assertFalse(cacheControl2.noCache());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(2147483645, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.FORCE_CACHE.toString();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Cache-Control", "max-stale=2147483647, only-if-cached");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("Cache-Control", "publiXc");
      CacheControl cacheControl1 = CacheControl.FORCE_CACHE;
      int int0 = MockThread.NORM_PRIORITY;
      int int1 = MockThread.MIN_PRIORITY;
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      Headers headers0 = new Headers(headers_Builder2);
      Headers headers1 = new Headers(headers_Builder0);
      headers_Builder1.addLenient("onyly-if-canhe]");
      cacheControl1.noCache();
      cacheControl1.noCache();
      CacheControl cacheControl2 = CacheControl.parse(headers0);
      int int2 = cacheControl2.sMaxAgeSeconds();
      int int3 = cacheControl2.minFreshSeconds();
      assertFalse(cacheControl2.isPrivate());
      assertEquals(Integer.MAX_VALUE, cacheControl2.maxStaleSeconds());
      assertEquals((-1), cacheControl2.maxAgeSeconds());
      assertFalse(cacheControl2.noStore());
      assertFalse(cacheControl2.noTransform());
      assertFalse(cacheControl2.noCache());
      assertFalse(cacheControl2.mustRevalidate());
      assertTrue(int3 == int2);
      assertTrue(cacheControl2.onlyIfCached());
      assertFalse(cacheControl2.isPublic());
      assertEquals((-1), int3);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Cache-Control", "public");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.noTransform());
      assertTrue(cacheControl0.isPublic());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noCache());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noTransform();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("feff");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("<dM4XJv#hzn~(");
      Headers.Builder headers_Builder3 = headers_Builder2.addLenient("cache-control", "no-transform, ");
      headers_Builder3.addLenient("EEE, dd-MMM-yyyy HH:mm:ss z", "<dM4XJv#hzn~(");
      int int0 = MockThread.NORM_PRIORITY;
      Headers headers0 = headers_Builder0.build();
      CacheControl.parse(headers0);
      Headers headers1 = new Headers(headers_Builder3);
      // Undeclared exception!
      try { 
        headers1.value(19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 39
         //
         verifyException("okhttp3.Headers", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Cache-Control", "s-maxage=");
      Headers headers0 = headers_Builder0.build();
      Headers.Builder headers_Builder2 = headers_Builder1.removeAll("Cache-Control");
      headers_Builder0.removeAll("[(FVx~@Lq:");
      int int0 = MockThread.NORM_PRIORITY;
      headers_Builder2.removeAll("[(FVx~@Lq:");
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.isPrivate();
      boolean boolean0 = cacheControl0.noCache();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(boolean0);
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.FORCE_CACHE.toString();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Cache-Control", "max-stale=2147483647, only-if-cached");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("Cache-Control", "public");
      CacheControl cacheControl1 = CacheControl.FORCE_CACHE;
      int int0 = MockThread.NORM_PRIORITY;
      Headers headers0 = new Headers(headers_Builder2);
      CacheControl cacheControl2 = CacheControl.parse(headers0);
      CacheControl cacheControl3 = CacheControl.parse(headers0);
      int int1 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      headers0.toString();
      String string0 = cacheControl3.FORCE_NETWORK.toString();
      assertEquals("Cache-Control", string0);
      
      cacheControl_Builder0.noTransform();
      headers_Builder0.build();
      cacheControl1.toString();
      String string1 = cacheControl2.toString();
      assertNotNull(string1);
      assertEquals("public, max-stale=2147483647, only-if-cached", string1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.FORCE_CACHE.toString();
      cacheControl0.FORCE_NETWORK.headerValue = "Cache-Control";
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Cache-Control", "max-stale=2147483647, only-if-cached");
      String string0 = cacheControl0.headerValue;
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("Cache-Control", "max-stale=2147483647, only-if-cached");
      int int0 = MockThread.MIN_PRIORITY;
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      Headers headers0 = new Headers(headers_Builder2);
      Headers.Builder headers_Builder3 = new Headers.Builder();
      cacheControl0.noCache();
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertFalse(cacheControl1.mustRevalidate());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.noStore());
      assertFalse(cacheControl1.isPublic());
      assertFalse(cacheControl1.isPrivate());
      assertTrue(cacheControl1.onlyIfCached());
      assertFalse(cacheControl1.noTransform());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertFalse(cacheControl1.noCache());
      assertEquals(Integer.MAX_VALUE, cacheControl1.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.FORCE_CACHE.toString();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Cache-Control", "max-stale=2147483647, only-if-cached");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("Cache-Control", "private");
      CacheControl cacheControl1 = CacheControl.FORCE_CACHE;
      int int0 = MockThread.NORM_PRIORITY;
      Headers headers0 = new Headers(headers_Builder2);
      CacheControl cacheControl2 = CacheControl.parse(headers0);
      int int1 = ObjectStreamConstants.baseWireHandle;
      headers0.toString();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      cacheControl_Builder1.noTransform();
      headers_Builder0.build();
      cacheControl2.toString();
      // Undeclared exception!
      try { 
        headers0.value(2548);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5097
         //
         verifyException("okhttp3.Headers", e);
      }
  }
}
/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:32:48 GMT 2018
 */

package okhttp3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheControl_ESTest extends CacheControl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder0.noCache();
      assertSame(cacheControl_Builder2, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.maxAge(9, timeUnit0);
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      cacheControl0.noTransform();
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      boolean boolean0 = cacheControl0.isPublic();
      assertFalse(boolean0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "[912d[,ifVI0(T0";
      stringArray0[1] = "[912d[,ifVI0(T0";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      int int0 = cacheControl0.minFreshSeconds();
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), int0);
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(38, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noCache();
      assertSame(cacheControl_Builder2, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxAge((-2274), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -2274
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      cacheControl0.onlyIfCached();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertEquals((-1), int0);
      
      String string0 = cacheControl0.toString();
      assertEquals("max-stale=2147483647, only-if-cached", string0);
      assertNotNull(string0);
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
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.mustRevalidate();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(boolean0);
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-2602), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -2602
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.noStore();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder1.minFresh((-313), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -313
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.noCache();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.onlyIfCached();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder2);
      String string0 = cacheControl0.toString();
      assertEquals("no-store, only-if-cached", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      String string0 = cacheControl0.toString();
      assertEquals("no-transform", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      cacheControl_Builder0.maxStale(Integer.MAX_VALUE, timeUnit0);
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(125, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("max-age=10800000", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      cacheControl_Builder0.minFresh(359, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertEquals("min-fresh=1292400", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "pragma";
      stringArray0[1] = "pragma";
      stringArray0[2] = "pragma";
      stringArray0[3] = "e=#?(mKrV/Og";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      String string0 = cacheControl0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[4];
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient("pragma", "no-store,");
      int int0 = MockThread.NORM_PRIORITY;
      Headers headers0 = headers_Builder0.build();
      CacheControl.parse(headers0);
      // Undeclared exception!
      try { 
        headers0.value((-1932735272));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 429496753
         //
         verifyException("okhttp3.Headers", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      String[] stringArray0 = new String[4];
      cacheControl0.FORCE_CACHE.toString();
      stringArray0[0] = "pragma";
      stringArray0[1] = "max-stale=2147483647, only-if-cached";
      stringArray0[2] = "pragma";
      stringArray0[3] = "min-fresh";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl.parse(headers0);
      cacheControl0.noTransform();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "pragma";
      stringArray0[1] = "beginIndex < 0: ";
      stringArray0[2] = "pragma";
      stringArray0[3] = "min-fresh";
      Headers headers0 = Headers.of(stringArray0);
      headers0.names();
      Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      String string0 = cacheControl0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      String[] stringArray0 = new String[4];
      String string0 = cacheControl0.toString();
      stringArray0[0] = "no-cache";
      stringArray0[2] = "no-cache";
      stringArray0[3] = "no-cache";
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("no-cache");
      Headers.Builder headers_Builder2 = headers_Builder1.set("cache-control", "no-cache");
      Headers headers0 = new Headers(headers_Builder2);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers.of((Map<String, String>) hashMap0);
      String string1 = cacheControl1.toString();
      assertTrue(string1.equals((Object)string0));
      
      cacheControl0.isPrivate();
      boolean boolean0 = cacheControl1.mustRevalidate();
      assertTrue(cacheControl1.noCache());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertFalse(cacheControl1.isPublic());
      assertFalse(cacheControl1.isPrivate());
      assertFalse(boolean0);
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      assertFalse(cacheControl1.noTransform());
      assertFalse(cacheControl1.onlyIfCached());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.noStore());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.FORCE_CACHE.toString();
      cacheControl0.maxAgeSeconds();
      cacheControl0.noTransform();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "CXy";
      stringArray0[1] = "max-stale=2147483647, only-if-cached";
      stringArray0[2] = "max-stale=2147483647, only-if-cached";
      stringArray0[3] = "max-stale=2147483647, only-if-cached";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertFalse(cacheControl1.onlyIfCached());
      assertFalse(cacheControl1.noCache());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.mustRevalidate());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertFalse(cacheControl1.isPublic());
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      assertFalse(cacheControl1.noStore());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertFalse(cacheControl1.noTransform());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "pragma";
      stringArray0[1] = "beginIndex < 0: ";
      stringArray0[2] = "pragma";
      stringArray0[3] = "m|n-fr;sh";
      Headers headers0 = Headers.of(stringArray0);
      headers0.names();
      Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      int int0 = cacheControl0.maxStaleSeconds();
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), int0);
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      cacheControl_Builder1.maxStale(57, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      String[] stringArray0 = new String[4];
      cacheControl0.toString();
      stringArray0[0] = "pragma";
      stringArray0[1] = "max-stale=0, no-transform";
      stringArray0[2] = "max-stale=0, no-transform";
      stringArray0[3] = "max-stale=0, no-transform";
      Headers headers0 = Headers.of(stringArray0);
      String string0 = cacheControl0.headerValue;
      cacheControl_Builder0.onlyIfCached();
      CacheControl.parse(headers0);
      CacheControl.parse(headers0);
      int int0 = ObjectStreamConstants.baseWireHandle;
      assertEquals(8257536, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.FORCE_CACHE.toString();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient("max-stale=2147483647, only-if-cached", "max-stale=2147483647, only-if-cached");
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("cache-control");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("cache-control", "\n not found: size=");
      Headers.Builder headers_Builder3 = headers_Builder2.set("mnfeh", "kcfkx.k");
      headers_Builder3.build();
      Headers headers1 = headers_Builder3.build();
      CacheControl.parse(headers1);
      int int0 = MockThread.NORM_PRIORITY;
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
  public void test31()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      String[] stringArray0 = new String[4];
      cacheControl0.toString();
      stringArray0[0] = "no-cache";
      stringArray0[1] = "no-cache";
      String string0 = cacheControl0.headerValue;
      stringArray0[2] = "no-cache";
      stringArray0[3] = "no-cache";
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("no-cache");
      Headers.Builder headers_Builder2 = headers_Builder1.set("cache-control", "no-cache");
      Headers headers0 = new Headers(headers_Builder2);
      CacheControl.parse(headers0);
      System.setCurrentTimeMillis((-72057594037927936L));
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers1 = Headers.of((Map<String, String>) hashMap0);
      // Undeclared exception!
      try { 
        headers1.name(101);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 202
         //
         verifyException("okhttp3.Headers", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "cache-control";
      stringArray0[1] = "cache-control";
      stringArray0[2] = "cache-control";
      stringArray0[3] = "public";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      String string0 = cacheControl0.toString();
      assertEquals("public", string0);
      assertNotNull(string0);
      
      CacheControl cacheControl1 = CacheControl.FORCE_CACHE;
      cacheControl1.FORCE_NETWORK.toString();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      CacheControl cacheControl2 = CacheControl.FORCE_CACHE;
      cacheControl2.FORCE_CACHE.toString();
      CacheControl cacheControl3 = CacheControl.FORCE_CACHE;
      System.setCurrentTimeMillis(1);
      int int1 = cacheControl0.maxAgeSeconds();
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.maxAge(46, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder2.build();
      String[] stringArray0 = new String[4];
      cacheControl0.toString();
      stringArray0[0] = "pragma";
      stringArray0[1] = "max-age=0, only-if-cached";
      TimeUnit timeUnit1 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.minFresh(46, timeUnit1);
      cacheControl0.toString();
      stringArray0[2] = "pragma";
      stringArray0[3] = "minfr}h";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl1 = CacheControl.FORCE_CACHE;
      CacheControl cacheControl2 = CacheControl.FORCE_CACHE;
      Headers.of(stringArray0);
      headers0.newBuilder();
      CacheControl.parse(headers0);
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.minFresh(46, timeUnit0);
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder4.noStore();
      assertSame(cacheControl_Builder0, cacheControl_Builder5);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.maxStale(57, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder2.build();
      String[] stringArray0 = new String[4];
      cacheControl0.FORCE_CACHE.toString();
      stringArray0[0] = "pragma";
      stringArray0[1] = "max-stale=2147483647, only-if-cached";
      String string0 = cacheControl0.headerValue;
      stringArray0[2] = "pragma";
      stringArray0[3] = "minfr}h";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl1 = CacheControl.FORCE_CACHE;
      CacheControl.Builder cacheControl_Builder3 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder1.noTransform();
      cacheControl_Builder4.noTransform();
      CacheControl.parse(headers0);
      int int0 = MockThread.NORM_PRIORITY;
      // Undeclared exception!
      try { 
        headers0.name(5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("okhttp3.Headers", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "pragma";
      stringArray0[1] = "pragma";
      stringArray0[2] = "pragma";
      stringArray0[3] = "must-revalidate";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl.parse(headers0);
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.removeAll("must-revalidate");
      Headers headers1 = Headers.of(stringArray0);
      CacheControl cacheControl1 = CacheControl.FORCE_CACHE;
      cacheControl1.toString();
      CacheControl cacheControl2 = CacheControl.parse(headers0);
      CacheControl.parse(headers1);
      int int0 = ObjectStreamConstants.baseWireHandle;
      Headers headers2 = headers_Builder0.build();
      CacheControl cacheControl3 = CacheControl.FORCE_CACHE;
      CacheControl.parse(headers2);
      CacheControl cacheControl4 = CacheControl.parse(headers1);
      CacheControl cacheControl5 = CacheControl.FORCE_CACHE;
      int int1 = cacheControl5.maxAgeSeconds();
      assertEquals((-1), int1);
      
      Headers headers3 = Headers.of(stringArray0);
      String string0 = cacheControl2.toString();
      assertNotNull(string0);
      assertEquals("must-revalidate", string0);
      
      Headers.of(stringArray0);
      CacheControl.parse(headers3);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers4 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl6 = CacheControl.parse(headers4);
      assertFalse(cacheControl6.mustRevalidate());
      
      cacheControl4.isPrivate();
      boolean boolean0 = cacheControl2.onlyIfCached();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "pragma";
      stringArray0[1] = "pragma";
      stringArray0[2] = "pragma";
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("pragma", "s-maxage");
      Headers headers0 = headers_Builder1.build();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      int int1 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.parse(headers0);
      // Undeclared exception!
      try { 
        Headers.of(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Headers cannot be null
         //
         verifyException("okhttp3.Headers", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "pragma";
      stringArray0[1] = "pragma";
      stringArray0[2] = "pragma";
      stringArray0[3] = "private, ";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      cacheControl_Builder1.noStore();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noTransform();
      headers0.getDate("pragma");
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      cacheControl_Builder2.maxAge(1942, timeUnit0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.isPublic();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("EEE,dd-MMMyyyyQHH:mm:-s ", "EEE,dd-MMMyyyyQHH:mm:-s ");
      // Undeclared exception!
      try { 
        headers_Builder1.add(">P/$nAu{.]Y#f #", "ptrga");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected char 0x20 at 13 in header name: >P/$nAu{.]Y#f #
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "pragma";
      stringArray0[1] = "pragma";
      stringArray0[2] = "pragma";
      stringArray0[3] = "private, ";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noTransform();
      headers0.getDate("pragma");
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      CacheControl cacheControl1 = cacheControl_Builder2.build();
      cacheControl1.FORCE_CACHE.headerValue = "pragma";
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      assertFalse(cacheControl1.isPublic());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.mustRevalidate());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      
      CacheControl cacheControl2 = CacheControl.parse(headers0);
      String string0 = cacheControl2.toString();
      assertNotNull(string0);
      assertEquals("private", string0);
      
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.add("pragma", "=,;");
      Headers headers1 = headers_Builder1.build();
      CacheControl cacheControl3 = CacheControl.parse(headers1);
      assertFalse(cacheControl3.isPrivate());
      
      CacheControl.parse(headers0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      headers_Builder0.removeAll("2Lv");
      headers_Builder0.addLenient("private, ", "pragma");
      cacheControl_Builder0.onlyIfCached();
      CacheControl cacheControl4 = CacheControl.FORCE_CACHE;
      CacheControl cacheControl5 = CacheControl.FORCE_CACHE;
      cacheControl0.maxAgeSeconds();
      cacheControl2.maxStaleSeconds();
      cacheControl_Builder2.onlyIfCached();
      cacheControl5.isPrivate();
      assertEquals((-1), cacheControl5.maxAgeSeconds());
  }
}
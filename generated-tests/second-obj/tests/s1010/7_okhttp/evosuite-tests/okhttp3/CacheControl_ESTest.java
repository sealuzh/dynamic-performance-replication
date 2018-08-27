/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 23:36:33 GMT 2018
 */

package okhttp3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noCache();
      assertSame(cacheControl_Builder2, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      cacheControl_Builder0.maxStale(12, timeUnit0);
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.isPrivate();
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(boolean0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("max-stale=2147483647, only-if-cached", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      cacheControl0.FORCE_NETWORK.toString();
      cacheControl0.noStore();
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxAge((-55297), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -55297
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.mustRevalidate();
      String string0 = cacheControl0.toString();
      assertEquals("max-stale=2147483647, only-if-cached", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      cacheControl0.noCache();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "byteCount < 0: ";
      stringArray0[1] = "^.VMqi>tk+*r];T8J";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.noStore();
      assertFalse(boolean0);
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      cacheControl0.FORCE_CACHE.toString();
      boolean boolean0 = cacheControl_Builder0.noTransform;
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-391), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -391
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), int0);
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      cacheControl0.noTransform();
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(2142, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noCache();
      assertSame(cacheControl_Builder1, cacheControl_Builder2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.minFresh((-1644362192), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -1644362192
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.maxStaleSeconds();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), int0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("no-transform", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertTrue(cacheControl0.noTransform());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(59, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      cacheControl0.onlyIfCached();
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.maxStale(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder2, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      cacheControl_Builder0.maxStale(Integer.MAX_VALUE, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.minFresh(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder2, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertEquals("no-store", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(1648, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertEquals("min-fresh=1648", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(62, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.maxAge(62, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder2.build();
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("max-age=0, max-stale=0", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("pragma", "s-maxage=");
      headers_Builder0.addLenient("s-maxage=", "s-maxage=");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient("pragma", "private, ");
      Headers headers0 = headers_Builder0.build();
      headers_Builder0.addLenient("max-age=", "max-age=");
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      String string0 = cacheControl0.toString();
      assertEquals("private", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient("pragma", "_V=$");
      Headers headers0 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.isPublic();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.set("pragma", "jejc;5^~lo8!m");
      Headers headers0 = new Headers(headers_Builder0);
      CacheControl.parse(headers0);
      // Undeclared exception!
      try { 
        headers_Builder0.add("pragma");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected header: pragma
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.set("pragma", "min-fresh");
      Headers headers0 = headers_Builder0.build();
      headers0.toString();
      Headers headers1 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.parse(headers1);
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noTransform();
      cacheControl_Builder0.noStore();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("pragma", "only-if-cached");
      Headers headers0 = headers_Builder0.build();
      CacheControl.parse(headers0);
      Headers.Builder headers_Builder2 = new Headers.Builder();
      headers_Builder1.add("only-if-cached", "Oq!MmeXCDP^op");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.toString();
      // Undeclared exception!
      try { 
        headers_Builder1.add("only-if-cached");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected header: only-if-cached
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("pragma", "pragma");
      Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      String string0 = cacheControl0.toString();
      assertEquals("no-cache", string0);
      
      cacheControl0.mustRevalidate();
      cacheControl0.maxStaleSeconds();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.set("pragma", "no-cache");
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("no-cache", "u|9fb)]]e*<nz.;n<");
      Headers headers0 = new Headers(headers_Builder1);
      Headers.Builder headers_Builder2 = new Headers.Builder();
      Headers.Builder headers_Builder3 = headers_Builder2.addLenient("Gd>oR[KyzJ{l");
      headers_Builder3.build();
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertFalse(cacheControl1.isPublic());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertTrue(cacheControl1.noCache());
      assertFalse(cacheControl1.mustRevalidate());
      assertFalse(cacheControl1.isPrivate());
      assertFalse(cacheControl1.onlyIfCached());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertFalse(cacheControl1.noTransform());
      assertEquals((-1), cacheControl1.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "cache-control";
      stringArray0[1] = "EEE, dd MMM yy HH:mm:ss z";
      stringArray0[2] = "r5+dq+]D9m*Lo}(|} ";
      stringArray0[3] = "EEE, dd MMM yy HH:mm:ss z";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl.parse(headers0);
      System.setCurrentTimeMillis(3061L);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("hxcpf$Lo%j_KP=", "pragma");
      hashMap0.put("hxcpf$Lo%j_KP=", "pragma");
      Headers.of((Map<String, String>) hashMap0);
      hashMap0.put("pragma", "no-transform,");
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      headers0.toMultimap();
      hashMap0.toString();
      CacheControl.parse(headers0);
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("pragma", "pragma");
      headers_Builder1.addLenient("pragma");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("pragma", "max-age=");
      boolean boolean0 = cacheControl_Builder0.noCache;
      Headers headers0 = headers_Builder2.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean1 = cacheControl0.isPublic();
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(boolean1);
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.onlyIfCached();
      CacheControl cacheControl0 = cacheControl_Builder2.build();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "cache-control";
      stringArray0[1] = "cache-control";
      stringArray0[2] = "cache-control";
      stringArray0[3] = "cache-control";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertFalse(cacheControl1.isPublic());
      assertFalse(cacheControl1.noStore());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.isPrivate());
      assertFalse(cacheControl1.noCache());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      
      System.setCurrentTimeMillis(31L);
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertEquals((-1), int0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertTrue(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.set("Cache-Control", "Cache-Control");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "cache-control";
      stringArray0[1] = "max-stale";
      stringArray0[2] = "ea0l";
      stringArray0[3] = "cache-control";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl.parse(headers0);
      System.setCurrentTimeMillis(7730941129200L);
      System.setCurrentTimeMillis(7730941129200L);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("pragma", "no-store, max-age=122400");
      headers_Builder1.add("o\"vio~<a`d2dc~m", "o\"vio~<a`d2dc~m");
      Headers.Builder headers_Builder2 = headers_Builder0.set("o\"vio~<a`d2dc~m", "o\"vio~<a`d2dc~m");
      Headers headers0 = headers_Builder2.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noTransform();
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertEquals(122400, cacheControl0.maxAgeSeconds());
      assertTrue(cacheControl0.noStore());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("pragma", "must-revalidate");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      int int0 = cacheControl0.maxStaleSeconds();
      assertEquals((-1), int0);
      
      String string0 = cacheControl0.toString();
      assertEquals("must-revalidate", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("pragma", "pragma");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("pragma", "_V=$");
      String string0 = "ceHt)CCkRRZ:hiN";
      headers_Builder0.addLenient("pragma", "0F6W cw=\"y/P36");
      cacheControl_Builder0.build();
      Headers headers0 = new Headers(headers_Builder2);
      cacheControl_Builder0.noStore();
      CacheControl.parse(headers0);
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
  public void test41()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers.of((Map<String, String>) hashMap0);
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient("pragma", "public, ");
      Headers headers0 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      boolean boolean0 = cacheControl1.noTransform();
      assertFalse(cacheControl1.onlyIfCached());
      assertFalse(cacheControl1.mustRevalidate());
      assertFalse(cacheControl1.noCache());
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertFalse(cacheControl1.noStore());
      assertFalse(boolean0);
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertTrue(cacheControl1.isPublic());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("pragma", "pragma");
      hashMap0.put("pragma", "pragma");
      Headers.of((Map<String, String>) hashMap0);
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient("pragma", "public, ");
      Headers headers0 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      String string0 = cacheControl0.toString();
      assertEquals("public", string0);
      
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      int int1 = cacheControl0.maxAgeSeconds();
      assertEquals((-1), int1);
  }
}
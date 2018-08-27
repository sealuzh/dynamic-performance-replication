/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 03:40:21 GMT 2018
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
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheControl_ESTest extends CacheControl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.minFresh(1776, timeUnit0);
      cacheControl_Builder0.maxAge(1776, timeUnit0);
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.onlyIfCached();
      TimeUnit timeUnit1 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.maxAge(1776, timeUnit1);
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder4.noCache();
      cacheControl_Builder2.maxAge(Integer.MAX_VALUE, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder5.build();
      cacheControl_Builder5.noStore();
      cacheControl0.mustRevalidate();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      // Undeclared exception!
      try { 
        headers_Builder0.add("X (%'*,;4%", "X (%'*,;4%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected char 0x20 at 1 in header name: X (%'*,;4%
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      System.setCurrentTimeMillis(59L);
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      cacheControl_Builder0.minFresh(1595, timeUnit0);
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = new Headers.Builder();
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      String string0 = cacheControl0.toString();
      assertEquals("max-stale=2147483647, only-if-cached", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      cacheControl0.headerValue = "v3z_ 4u)Mg.-%\"x\"x>";
      cacheControl0.toString();
      cacheControl0.noCache();
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.onlyIfCached();
      int int0 = (-588);
      cacheControl_Builder0.noStore();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxAge((-588), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -588
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noTransform();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.minFresh(20, timeUnit0);
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.noCache();
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder4.maxStale(20, timeUnit1);
      cacheControl_Builder5.maxStale(20, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("");
      // Undeclared exception!
      try { 
        headers_Builder1.add("\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected header: \"
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-3048), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -3048
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      cacheControl0.maxAgeSeconds();
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.minFresh((-1), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -1
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noStore();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.maxStale(0, timeUnit0);
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.minFresh(0, timeUnit0);
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder2.noCache();
      CacheControl.Builder cacheControl_Builder6 = cacheControl_Builder4.noTransform();
      cacheControl_Builder6.noStore();
      cacheControl_Builder1.noTransform();
      TimeUnit timeUnit1 = TimeUnit.MILLISECONDS;
      cacheControl_Builder3.minFresh(0, timeUnit1);
      CacheControl cacheControl0 = cacheControl_Builder2.build();
      cacheControl_Builder1.minFresh(0, timeUnit0);
      cacheControl_Builder4.onlyIfCached();
      CacheControl.Builder cacheControl_Builder7 = cacheControl_Builder4.maxStale(619, timeUnit0);
      cacheControl_Builder4.noTransform();
      TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
      cacheControl_Builder7.minFresh(1468, timeUnit2);
      cacheControl0.noStore();
      cacheControl_Builder1.noStore();
      CacheControl.Builder cacheControl_Builder8 = cacheControl_Builder7.onlyIfCached();
      assertSame(cacheControl_Builder8, cacheControl_Builder5);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      cacheControl1.headerValue = "[gvE |GMYk";
      Headers headers1 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl2 = CacheControl.parse(headers1);
      cacheControl2.FORCE_CACHE.headerValue = "[gvE |GMYk";
      cacheControl1.FORCE_NETWORK.headerValue = "+";
      cacheControl0.minFreshSeconds();
      cacheControl0.maxStaleSeconds();
      cacheControl0.onlyIfCached();
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noStore();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.minFresh(Integer.MAX_VALUE, timeUnit0);
      TimeUnit timeUnit1 = TimeUnit.DAYS;
      CacheControl cacheControl3 = cacheControl_Builder2.build();
      cacheControl3.FORCE_CACHE.headerValue = "[gvE |GMYk";
      headers0.toString();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.maxStale(Integer.MAX_VALUE, timeUnit1);
      cacheControl0.FORCE_CACHE.headerValue = "[gvE |GMYk";
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder4.noTransform();
      cacheControl_Builder5.noCache();
      cacheControl0.noCache();
      cacheControl3.noTransform();
      assertFalse(cacheControl3.mustRevalidate());
      assertFalse(cacheControl3.isPublic());
      assertEquals((-1), cacheControl3.maxStaleSeconds());
      assertEquals((-1), cacheControl3.maxAgeSeconds());
      assertEquals((-1), cacheControl3.sMaxAgeSeconds());
      assertEquals(Integer.MAX_VALUE, cacheControl3.minFreshSeconds());
      assertTrue(cacheControl3.noStore());
      
      cacheControl_Builder1.noTransform();
      cacheControl1.noCache();
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertFalse(cacheControl1.isPrivate());
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertFalse(cacheControl1.noStore());
      assertFalse(cacheControl1.isPublic());
      assertFalse(cacheControl1.onlyIfCached());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertFalse(cacheControl1.noTransform());
      
      cacheControl0.noTransform();
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.isPublic();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(boolean0);
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      cacheControl0.FORCE_NETWORK.toString();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      CacheControl.parse(headers0);
      cacheControl0.toString();
      cacheControl0.minFreshSeconds();
      cacheControl1.isPrivate();
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noTransform();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.onlyIfCached();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder3.maxAge((-1), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -1
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      cacheControl0.FORCE_NETWORK.toString();
      cacheControl0.FORCE_CACHE.headerValue = "p(RcA=X";
      String[] stringArray0 = new String[6];
      cacheControl0.FORCE_CACHE.toString();
      stringArray0[0] = "p(RcA=X";
      stringArray0[1] = "no-cache";
      stringArray0[2] = "no-cache";
      stringArray0[3] = "p(RcA=X";
      stringArray0[4] = "no-cache";
      stringArray0[5] = "p(RcA=X";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
      assertFalse(cacheControl1.isPublic());
      assertEquals((-1), cacheControl1.maxStaleSeconds());
      assertFalse(cacheControl1.noCache());
      assertFalse(cacheControl1.isPrivate());
      assertFalse(cacheControl1.mustRevalidate());
      assertFalse(cacheControl1.onlyIfCached());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      
      cacheControl0.FORCE_CACHE.headerValue = "no-cache";
      cacheControl0.FORCE_CACHE.headerValue = "p(RcA=X";
      cacheControl0.isPrivate();
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(2, timeUnit0);
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      cacheControl_Builder1.maxAge(1801, timeUnit1);
      CacheControl cacheControl2 = cacheControl_Builder1.build();
      boolean boolean0 = cacheControl2.isPrivate();
      assertFalse(boolean0);
      
      cacheControl2.isPublic();
      assertEquals((-1), cacheControl2.sMaxAgeSeconds());
      assertEquals(172800, cacheControl2.maxStaleSeconds());
      assertEquals((-1), cacheControl2.minFreshSeconds());
      assertEquals(0, cacheControl2.maxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      cacheControl_Builder0.maxStale(0, timeUnit0);
      TimeUnit timeUnit1 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit1);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noStore();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.noTransform();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.minFresh(Integer.MAX_VALUE, timeUnit1);
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder4.noCache();
      TimeUnit timeUnit2 = TimeUnit.HOURS;
      cacheControl_Builder4.maxAge(Integer.MAX_VALUE, timeUnit2);
      cacheControl_Builder5.noStore();
      cacheControl_Builder3.noCache();
      CacheControl.Builder cacheControl_Builder6 = cacheControl_Builder5.noCache();
      CacheControl cacheControl0 = cacheControl_Builder5.build();
      cacheControl0.sMaxAgeSeconds();
      cacheControl0.FORCE_NETWORK.toString();
      cacheControl0.headerValue = "MD\"2H^<;0*}pwAZKV";
      cacheControl_Builder4.noTransform();
      cacheControl_Builder3.noCache();
      cacheControl0.noTransform();
      cacheControl0.noCache();
      cacheControl0.noTransform();
      cacheControl0.sMaxAgeSeconds();
      CacheControl.Builder cacheControl_Builder7 = cacheControl_Builder6.onlyIfCached();
      assertSame(cacheControl_Builder7, cacheControl_Builder6);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      cacheControl0.toString();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("nY0zfJ.EYI)FLNJ", "3HuT#-CY)J<J.M&2");
      Headers.Builder headers_Builder2 = headers_Builder1.add("Pragma", "[");
      Headers.Builder headers_Builder3 = new Headers.Builder();
      headers_Builder3.addLenient("3HuT#-CY)J<J.M&2");
      Headers headers0 = new Headers(headers_Builder2);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noTransform();
      CacheControl cacheControl2 = new CacheControl(cacheControl_Builder0);
      CacheControl cacheControl3 = CacheControl.FORCE_CACHE;
      String string0 = cacheControl3.toString();
      assertEquals("p(RcA=X", string0);
      
      cacheControl0.onlyIfCached();
      CacheControl.Builder cacheControl_Builder1 = new CacheControl.Builder();
      cacheControl_Builder1.noCache();
      cacheControl_Builder0.noStore();
      String string1 = cacheControl1.toString();
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("cache-control", "6b+|WG14EV");
      Headers headers0 = new Headers(headers_Builder0);
      Headers headers1 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.parse(headers1);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("3HuT#-CY)J<J.M&2", "]~}&]>$`7?9t.T3");
      Headers.Builder headers_Builder2 = headers_Builder0.set("no-store", "]~}&]>$`7?9t.T3");
      headers_Builder2.add("cache-control", "no-store");
      Headers.Builder headers_Builder3 = new Headers.Builder();
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl1 = new CacheControl(cacheControl_Builder0);
      CacheControl cacheControl2 = CacheControl.parse(headers0);
      CacheControl cacheControl3 = CacheControl.parse(headers0);
      cacheControl3.toString();
      cacheControl1.onlyIfCached();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      cacheControl_Builder1.noCache();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder0.noStore();
      CacheControl cacheControl4 = new CacheControl(cacheControl_Builder2);
      assertFalse(cacheControl4.isPrivate());
      assertTrue(cacheControl4.onlyIfCached());
      assertEquals((-1), cacheControl4.minFreshSeconds());
      assertEquals((-1), cacheControl4.maxStaleSeconds());
      assertTrue(cacheControl4.noStore());
      assertEquals((-1), cacheControl4.maxAgeSeconds());
      assertEquals((-1), cacheControl4.sMaxAgeSeconds());
      assertFalse(cacheControl4.mustRevalidate());
      assertFalse(cacheControl4.isPublic());
      
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertEquals((-1), int0);
      
      cacheControl2.noTransform();
      CacheControl cacheControl5 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl3.noTransform();
      assertFalse(boolean0);
      
      CacheControl cacheControl6 = CacheControl.parse(headers0);
      assertFalse(cacheControl6.onlyIfCached());
      assertTrue(cacheControl6.noStore());
      assertEquals((-1), cacheControl6.maxStaleSeconds());
      assertEquals((-1), cacheControl6.maxAgeSeconds());
      assertEquals((-1), cacheControl6.minFreshSeconds());
      assertFalse(cacheControl6.isPrivate());
      assertFalse(cacheControl6.mustRevalidate());
      assertFalse(cacheControl6.isPublic());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient(",e(rL", "]t");
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("HkNP*FXu");
      Headers.Builder headers_Builder2 = headers_Builder1.add("Pragma", ",e(rL");
      Headers.Builder headers_Builder3 = new Headers.Builder();
      Headers headers0 = new Headers(headers_Builder2);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.FORCE_NETWORK.toString();
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("gh");
      Headers.Builder headers_Builder2 = headers_Builder1.addLenient("gh", "gh");
      Headers.Builder headers_Builder3 = headers_Builder2.add("nY0zfJ.EYI)FLNJ", "Pragma");
      headers_Builder3.add("Pragma", "\"=%9");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      String string0 = cacheControl0.toString();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("Pragma", "0=");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPublic());
      
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noCache();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.maxStale(44, timeUnit0);
      CacheControl cacheControl1 = cacheControl_Builder3.build();
      assertEquals(158400, cacheControl1.maxStaleSeconds());
      assertFalse(cacheControl1.mustRevalidate());
      assertEquals((-1), cacheControl1.sMaxAgeSeconds());
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertEquals((-1), cacheControl1.maxAgeSeconds());
  }
}
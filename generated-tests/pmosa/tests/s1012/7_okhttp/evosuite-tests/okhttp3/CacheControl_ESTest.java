/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 22:05:49 GMT 2018
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
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.minFresh(Integer.MAX_VALUE, timeUnit0);
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.onlyIfCached();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.maxAge(Integer.MAX_VALUE, timeUnit0);
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder4.noTransform();
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      cacheControl_Builder5.maxAge(Integer.MAX_VALUE, timeUnit1);
      Headers.Builder headers_Builder0 = new Headers.Builder();
      String string0 = "";
      headers_Builder0.addLenient("private", "");
      // Undeclared exception!
      try { 
        headers_Builder0.set("", "Zp#n,VZsoxW");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // name is empty
         //
         verifyException("okhttp3.Headers$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(44, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        cacheControl_Builder1.minFresh((-2676), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -2676
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.onlyIfCached();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      cacheControl1.FORCE_NETWORK.headerValue = ":";
      cacheControl0.noCache();
      CacheControl.parse(headers0);
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      hashMap0.put(":", ":");
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noTransform();
      cacheControl_Builder2.noTransform();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      cacheControl_Builder2.maxAge(Integer.MAX_VALUE, timeUnit0);
      cacheControl0.isPublic();
      cacheControl0.onlyIfCached();
      cacheControl0.isPrivate();
      CacheControl cacheControl2 = CacheControl.parse(headers0);
      cacheControl0.noTransform();
      int int0 = cacheControl2.maxStaleSeconds();
      assertFalse(cacheControl2.onlyIfCached());
      assertEquals((-1), cacheControl2.sMaxAgeSeconds());
      assertFalse(cacheControl2.noCache());
      assertFalse(cacheControl2.noTransform());
      assertEquals((-1), cacheControl2.maxAgeSeconds());
      assertEquals((-1), cacheControl2.minFreshSeconds());
      assertFalse(cacheControl2.noStore());
      assertEquals((-1), int0);
      assertFalse(cacheControl2.isPublic());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      cacheControl0.FORCE_CACHE.toString();
      cacheControl0.headerValue = "]ACu(U:eJ^Z6,R";
      cacheControl0.FORCE_CACHE.toString();
      cacheControl0.FORCE_CACHE.headerValue = null;
      boolean boolean0 = cacheControl0.isPublic();
      cacheControl0.onlyIfCached();
      cacheControl0.isPublic();
      boolean boolean1 = cacheControl0.noStore();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.removeAll(",");
      headers_Builder0.add("#)}8IAWeu[';IE+e2q", ",");
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      CacheControl cacheControl1 = CacheControl.FORCE_CACHE;
      String string0 = cacheControl1.toString();
      assertEquals("max-stale=2147483647, only-if-cached", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noTransform();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.maxStale(1357, timeUnit0);
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.minFresh(1357, timeUnit0);
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder4.onlyIfCached();
      CacheControl cacheControl0 = cacheControl_Builder5.build();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals(1357, cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertTrue(cacheControl0.noTransform());
      assertTrue(cacheControl0.noStore());
      assertTrue(cacheControl0.onlyIfCached());
      assertEquals(1357, cacheControl0.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noTransform();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.noCache();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder3);
      cacheControl_Builder0.onlyIfCached();
      cacheControl0.FORCE_CACHE.headerValue = "";
      cacheControl0.FORCE_NETWORK.headerValue = "";
      cacheControl_Builder3.onlyIfCached();
      cacheControl_Builder0.onlyIfCached();
      cacheControl0.headerValue = "";
      cacheControl0.isPublic();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder2.noStore();
      boolean boolean0 = cacheControl0.noCache();
      assertTrue(boolean0);
      
      cacheControl_Builder3.onlyIfCached();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      String string0 = cacheControl0.FORCE_CACHE.toString();
      assertEquals("", string0);
      
      boolean boolean1 = cacheControl0.mustRevalidate();
      int int0 = cacheControl0.maxAgeSeconds();
      assertEquals((-1), int0);
      
      boolean boolean2 = cacheControl0.isPublic();
      assertTrue(boolean2 == boolean1);
      
      TimeUnit timeUnit1 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder0.maxStale(0, timeUnit1);
      TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
      cacheControl_Builder4.minFresh(2, timeUnit2);
      cacheControl_Builder5.onlyIfCached();
      boolean boolean3 = cacheControl0.noTransform();
      cacheControl_Builder1.maxAge(1475, timeUnit1);
      int int1 = cacheControl0.sMaxAgeSeconds();
      int int2 = cacheControl0.maxStaleSeconds();
      assertTrue(int2 == int1);
      
      TimeUnit timeUnit3 = TimeUnit.HOURS;
      cacheControl_Builder1.minFresh(1324, timeUnit3);
      boolean boolean4 = cacheControl0.isPrivate();
      assertFalse(boolean4 == boolean3);
      
      CacheControl cacheControl1 = cacheControl_Builder4.build();
      assertEquals(4766400, cacheControl1.minFreshSeconds());
      assertEquals(0, cacheControl1.maxStaleSeconds());
      assertEquals(1475, cacheControl1.maxAgeSeconds());
      
      cacheControl0.onlyIfCached();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertTrue(cacheControl0.noStore());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("no-cache, ");
      Headers.Builder headers_Builder2 = headers_Builder1.set("lqPd2OjLhWdD4[Df|", "lqPd2OjLhWdD4[Df|");
      Headers.Builder headers_Builder3 = headers_Builder2.add("gCH:FBa'i'[cx+o;$", "S6@1w,OW");
      Headers headers0 = headers_Builder3.build();
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      cacheControl1.headerValue = "lqPd2OjLhWdD4[Df|";
      cacheControl0.noTransform();
      cacheControl0.isPrivate();
      cacheControl0.maxAgeSeconds();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers1 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl2 = CacheControl.parse(headers1);
      cacheControl2.headerValue = "Unexpected char %#04x at %d in %s value: %s";
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noStore();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      cacheControl_Builder2.noStore();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.maxAge(127, timeUnit0);
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.maxStale(127, timeUnit1);
      TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder4.minFresh((-1), timeUnit2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -1
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(1373, timeUnit0);
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noStore();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.noTransform();
      cacheControl_Builder3.noStore();
      cacheControl_Builder3.noTransform();
      int int0 = 4421;
      TimeUnit timeUnit1 = TimeUnit.DAYS;
      cacheControl_Builder1.maxAge(4421, timeUnit1);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder3);
      cacheControl0.FORCE_NETWORK.headerValue = "";
      cacheControl0.FORCE_NETWORK.headerValue = "max-age=";
      cacheControl_Builder3.noTransform();
      cacheControl0.toString();
      cacheControl0.toString();
      cacheControl0.headerValue = "VS#hr%Z\u0006";
      cacheControl_Builder1.onlyIfCached();
      // Undeclared exception!
      try { 
        cacheControl_Builder3.maxAge((-1), timeUnit1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -1
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noStore();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder2.noTransform();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      cacheControl_Builder1.noCache();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.maxStale(4975, timeUnit0);
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder4.minFresh(Integer.MAX_VALUE, timeUnit0);
      CacheControl.Builder cacheControl_Builder6 = cacheControl_Builder5.minFresh(4975, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder6);
      cacheControl_Builder6.noTransform();
      cacheControl0.headerValue = "";
      cacheControl0.toString();
      cacheControl0.minFreshSeconds();
      cacheControl0.minFreshSeconds();
      CacheControl cacheControl1 = cacheControl_Builder5.build();
      cacheControl1.FORCE_NETWORK.headerValue = ", ";
      cacheControl1.toString();
      cacheControl0.toString();
      cacheControl1.FORCE_CACHE.toString();
      cacheControl_Builder0.noCache();
      cacheControl0.mustRevalidate();
      cacheControl0.isPrivate();
      cacheControl1.toString();
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder7 = cacheControl_Builder5.minFresh(1711, timeUnit1);
      String string0 = cacheControl1.toString();
      assertEquals("no-cache, no-store, max-stale=0, min-fresh=0, no-transform", string0);
      
      cacheControl_Builder7.build();
      String[] stringArray0 = new String[0];
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl2 = CacheControl.parse(headers0);
      assertFalse(cacheControl2.isPrivate());
      assertEquals((-1), cacheControl2.maxStaleSeconds());
      assertEquals((-1), cacheControl2.minFreshSeconds());
      assertEquals((-1), cacheControl2.sMaxAgeSeconds());
      assertFalse(cacheControl2.noCache());
      assertFalse(cacheControl2.noStore());
      assertFalse(cacheControl2.noTransform());
      assertEquals((-1), cacheControl2.maxAgeSeconds());
      
      cacheControl_Builder3.build();
      cacheControl1.isPrivate();
      CacheControl cacheControl3 = cacheControl_Builder2.build();
      assertEquals(0, cacheControl3.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("cache-control", "S4uE53R");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      
      String string0 = cacheControl0.headerValue;
      assertEquals("S4uE53R", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.onlyIfCached();
      cacheControl_Builder2.noTransform();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      cacheControl_Builder1.minFresh(3788, timeUnit0);
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder0.noStore();
      cacheControl_Builder3.noCache();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder2.noTransform();
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder2.noTransform();
      cacheControl_Builder5.noCache();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      cacheControl0.isPrivate();
      CacheControl cacheControl1 = cacheControl_Builder3.build();
      cacheControl1.toString();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("Hmqqy*");
      headers_Builder1.add("Pragma", "Pragma");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl.parse(headers0);
      CacheControl cacheControl2 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl2.noCache();
      assertEquals((-1), cacheControl2.maxAgeSeconds());
      assertFalse(boolean0);
      assertFalse(cacheControl2.noStore());
      assertEquals((-1), cacheControl2.sMaxAgeSeconds());
      assertFalse(cacheControl2.mustRevalidate());
      assertFalse(cacheControl2.isPrivate());
      assertFalse(cacheControl2.onlyIfCached());
      assertEquals((-1), cacheControl2.minFreshSeconds());
      assertFalse(cacheControl2.noTransform());
      assertEquals((-1), cacheControl2.maxStaleSeconds());
      
      CacheControl.Builder cacheControl_Builder6 = cacheControl_Builder4.onlyIfCached();
      cacheControl_Builder6.build();
      cacheControl1.isPublic();
      String string0 = cacheControl1.toString();
      assertEquals("no-cache, no-store, min-fresh=13636800, only-if-cached, no-transform", string0);
      
      cacheControl0.noTransform();
      cacheControl0.sMaxAgeSeconds();
      cacheControl1.isPublic();
      CacheControl cacheControl3 = cacheControl_Builder6.build();
      boolean boolean1 = cacheControl3.isPublic();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.onlyIfCached();
      cacheControl_Builder2.noTransform();
      CacheControl.Builder cacheControl_Builder3 = cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder4 = cacheControl_Builder3.noCache();
      cacheControl_Builder2.noTransform();
      CacheControl.Builder cacheControl_Builder5 = cacheControl_Builder2.noTransform();
      cacheControl_Builder5.noCache();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      cacheControl0.isPrivate();
      CacheControl cacheControl1 = cacheControl_Builder3.build();
      cacheControl1.toString();
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("Hmqqy*");
      headers_Builder1.add("Pragma", "Pragma");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl2 = CacheControl.FORCE_CACHE;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "^i#%t`:";
      stringArray0[1] = "no-cache, no-store, only-if-cached, no-transform";
      stringArray0[2] = "Pragma";
      stringArray0[3] = "Pragma";
      stringArray0[4] = "Pragma";
      stringArray0[5] = "no-cache, no-store, only-if-cached, no-transform";
      Headers headers1 = Headers.of(stringArray0);
      headers1.names();
      CacheControl cacheControl3 = CacheControl.parse(headers1);
      cacheControl3.sMaxAgeSeconds();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder4.maxStale((-1), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -1
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("cache-control", "no-cache, ");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertTrue(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.add("cache-control", "25nCLpW2Y=w)");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "MJ?><s5:tb`|R_U)";
      stringArray0[1] = "l";
      stringArray0[2] = "cache-control";
      stringArray0[3] = "ueo!L${N3wUJxg'?";
      stringArray0[4] = "KZyD^Z|(I~/|A},}C;&";
      stringArray0[5] = "no-transform";
      stringArray0[6] = "A-";
      String string0 = "p'>p\\!rwg-\\uO";
      stringArray0[7] = string0;
      Headers headers0 = Headers.of(stringArray0);
      headers0.getDate("@%+*f[R}:n@ju3*[");
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.FORCE_NETWORK.toString();
      String string1 = cacheControl0.FORCE_CACHE.toString();
      assertEquals("", string1);
      
      String string2 = cacheControl0.toString();
      assertEquals("ueo!L${N3wUJxg'?", string2);
      
      cacheControl0.onlyIfCached();
      cacheControl_Builder0.onlyIfCached();
      cacheControl_Builder0.onlyIfCached();
      cacheControl0.mustRevalidate();
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll(",");
      Headers.Builder headers_Builder2 = headers_Builder1.removeAll("cache-control");
      Headers.Builder headers_Builder3 = headers_Builder2.add("cache-control", "25nyLpW2Y=w;");
      Headers headers0 = headers_Builder1.build();
      Headers headers1 = new Headers(headers_Builder3);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl0.noCache();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(46, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.removeAll(",");
      Headers.Builder headers_Builder1 = headers_Builder0.removeAll("cache-control");
      headers_Builder1.add("Cache-Control", "max-stale=");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      headers0.get("max-stale=");
      boolean boolean0 = cacheControl0.noCache();
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals(Integer.MAX_VALUE, cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(boolean0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
  }
}
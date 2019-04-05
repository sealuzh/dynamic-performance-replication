/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 11:23:16 GMT 2019
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheControl_ESTest extends CacheControl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(0, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-1196), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -1196
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      cacheControl_Builder0.minFresh(192, timeUnit0);
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-1), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -1
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(0, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxAge((-1798881931), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -1798881931
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(0, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.onlyIfCached();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      boolean boolean0 = cacheControl0.onlyIfCached();
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertTrue(boolean0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.noCache();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.maxStaleSeconds();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), int0);
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient((String) null, "");
      Headers headers0 = new Headers(headers_Builder1);
      // Undeclared exception!
      try { 
        CacheControl.parse(headers0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.minFresh((-410), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -410
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(2465, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("min-fresh=2465", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      cacheControl_Builder0.maxStale(1, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("max-stale=0", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(2465, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertEquals("max-age=2465", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.headerValue = null;
      String string0 = cacheControl0.toString();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("no-cache", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("pragma", "no-transform");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertTrue(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient("fL3<oU>DW", "must-revalidate, ");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient("cache-control", "public,");
      Headers headers0 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertTrue(cacheControl0.isPublic());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.add("cache-control", "no-store");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.headerValue = null;
      String string0 = cacheControl0.toString();
      assertEquals("no-store", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "W50q>d";
      stringArray0[1] = "_;_@GaP)e\"";
      stringArray0[2] = "pragma";
      stringArray0[3] = "'V(d2T**;up";
      stringArray0[4] = "<l<`iq72w}gt?tudy%";
      stringArray0[5] = "GMT";
      stringArray0[6] = "n";
      stringArray0[7] = "only-if-cached";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      cacheControl0.FORCE_CACHE.toString();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "1u";
      stringArray0[1] = "no-cache, max-age=0, max-stale=0, min-fresh=0, only-if-cached";
      stringArray0[2] = "Cache-Control";
      stringArray0[3] = "no-cache, max-age=0, max-stale=0, min-fresh=0, only-if-cached";
      stringArray0[4] = "&-g";
      stringArray0[5] = "p~UsC^'::?85+";
      stringArray0[6] = "2q7w>";
      stringArray0[7] = "xL4Kb])6$AA{z/t^\"s";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.isPublic());
      assertEquals(0, cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertTrue(cacheControl0.noCache());
      assertEquals(0, cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals(0, cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.noTransform());
      assertTrue(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "W50q>d";
      stringArray0[1] = "_;_@GaP)e\"";
      stringArray0[2] = "pragma";
      stringArray0[3] = "private";
      stringArray0[4] = "<l<`iq72w}gt?tudy%";
      stringArray0[5] = "GMT";
      stringArray0[6] = "n";
      stringArray0[7] = "only-if-cached";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.isPrivate();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertTrue(boolean0);
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Cache-Control";
      stringArray0[1] = "Cache-Control";
      stringArray0[2] = "Cache-Control";
      stringArray0[3] = "Cache-Control";
      stringArray0[4] = "Cache-Control";
      stringArray0[5] = "Cache-Control";
      stringArray0[6] = "Cache-Control";
      stringArray0[7] = "Cache-Control";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "~r1u";
      stringArray0[1] = "no-cache, max-age=0, max-stale=0, min-fresh=0, only-if-cached";
      stringArray0[2] = "Cache-Control";
      stringArray0[3] = "s-maxage=";
      stringArray0[4] = "&-g";
      stringArray0[5] = "p~UsC^'::?85+";
      stringArray0[6] = "2q7w>";
      stringArray0[7] = "xL4Kb])6$AA{z/t^\"s";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noCache());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), int0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      boolean boolean0 = cacheControl0.isPublic();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(boolean0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.noTransform();
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(boolean0);
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      int int0 = cacheControl0.maxStaleSeconds();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      boolean boolean0 = cacheControl0.isPrivate();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(boolean0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      cacheControl0.onlyIfCached();
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.maxAgeSeconds();
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), int0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      cacheControl0.noCache();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.mustRevalidate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("no-transform", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      cacheControl0.noStore();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      boolean boolean0 = cacheControl0.noStore();
      assertFalse(cacheControl0.isPublic());
      assertTrue(boolean0);
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
  }
}

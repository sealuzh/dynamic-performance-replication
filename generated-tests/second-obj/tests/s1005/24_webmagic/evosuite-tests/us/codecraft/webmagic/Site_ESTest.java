/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 19:16:48 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Site;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Site_ESTest extends Site_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Site site0 = Site.me();
      site0.getCycleRetryTimes();
      Site site1 = site0.setCycleRetryTimes(0);
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site0.getCycleRetryTimes());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Site site0 = Site.me();
      boolean boolean0 = site0.isUseGzip();
      assertEquals(0, site0.getRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertTrue(boolean0);
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Site site0 = Site.me();
      site0.getCycleRetryTimes();
      assertEquals(1000, site0.getRetrySleepTime());
      
      site0.setRetrySleepTime(0);
      assertEquals(5000, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Site site0 = new Site();
      site0.getUserAgent();
      Site site1 = site0.setUserAgent((String) null);
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.addCookie("W", "W");
      Site site2 = site1.setUserAgent("W");
      assertEquals(5000, site2.getSleepTime());
      assertTrue(site2.isUseGzip());
      assertEquals(0, site2.getCycleRetryTimes());
      assertEquals(5000, site2.getTimeOut());
      assertEquals(0, site2.getRetryTimes());
      assertEquals(1000, site2.getRetrySleepTime());
      assertFalse(site2.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Site site0 = Site.me();
      site0.getCycleRetryTimes();
      assertEquals(5000, site0.getTimeOut());
      
      site0.setTimeOut(0);
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Site site0 = new Site();
      site0.setDomain("");
      Site site1 = site0.setUserAgent("");
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Site site0 = new Site();
      site0.addCookie(", acceptStatCode=", ", acceptStatCode=", ", acceptStatCode=");
      site0.getCharset();
      assertEquals(5000, site0.getSleepTime());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(0, site0.getRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Site site0 = new Site();
      site0.getRetrySleepTime();
      site0.setRetryTimes(1000);
      assertEquals(1000, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setUseGzip(true);
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Site site0 = Site.me();
      site0.getCharset();
      Site site1 = site0.addHeader((String) null, (String) null);
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertEquals(5000, site1.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Site site0 = Site.me();
      boolean boolean0 = site0.isDisableCookieManagement();
      assertFalse(boolean0);
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Site site0 = Site.me();
      String string0 = site0.toString();
      assertEquals("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}", string0);
      
      site0.getHeaders();
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, site0.getRetrySleepTime());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Site site0 = Site.me();
      site0.getCycleRetryTimes();
      assertEquals(5000, site0.getSleepTime());
      
      site0.setSleepTime(0);
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Site site0 = Site.me();
      int int0 = site0.getSleepTime();
      assertEquals(5000, int0);
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Site site0 = new Site();
      site0.setDomain("78Ai<9K6O/)Isy");
      site0.hashCode();
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Site site0 = Site.me();
      int int0 = site0.getTimeOut();
      assertEquals(5000, int0);
      
      int int1 = site0.getRetryTimes();
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, int1);
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Site site0 = new Site();
      site0.setUserAgent("_VFx9&[Y");
      site0.hashCode();
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Site site0 = Site.me();
      site0.getCharset();
      Site site1 = site0.setCharset((String) null);
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Site site0 = Site.me();
      Object object0 = new Object();
      boolean boolean0 = site0.equals(object0);
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getRetryTimes());
      assertFalse(boolean0);
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Site site0 = Site.me();
      site0.getDomain();
      site0.getAllCookies();
      assertTrue(site0.isUseGzip());
      assertEquals(0, site0.getRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Site site0 = new Site();
      site0.getCookies();
      int int0 = site0.getRetrySleepTime();
      assertEquals(0, site0.getRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(1000, int0);
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      boolean boolean0 = site0.equals(site1);
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertTrue(boolean0);
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      site0.setCycleRetryTimes(352);
      boolean boolean0 = site1.equals(site0);
      assertEquals(352, site0.getCycleRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Site site0 = new Site();
      boolean boolean0 = site0.equals((Object) null);
      assertFalse(boolean0);
      
      site0.getCharset();
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.addCookie((String) null, (String) null, (String) null);
      Site site2 = site1.addCookie((String) null, (String) null, (String) null);
      assertFalse(site2.isDisableCookieManagement());
      
      site2.setDisableCookieManagement(true);
      assertTrue(site2.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Site site0 = new Site();
      site0.setAcceptStatCode((Set<Integer>) null);
      site0.hashCode();
      assertEquals(5000, site0.getSleepTime());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      site1.setSleepTime(1223);
      site1.hashCode();
      site0.equals(site1);
      assertEquals(1223, site1.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      site0.setTimeOut((-730));
      boolean boolean0 = site0.equals(site1);
      assertEquals((-730), site0.getTimeOut());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      site1.setRetryTimes((-730));
      boolean boolean0 = site0.equals(site1);
      assertEquals((-730), site1.getRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Site site0 = Site.me();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site0.setAcceptStatCode(linkedHashSet0);
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
      
      site0.toTask();
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site1.addCookie("AI`\"t&L;M Or29", "AI`\"t&L;M Or29");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Site site0 = Site.me();
      site0.addHeader("N=s9i$%mPkwFi/6SJT", "N=s9i$%mPkwFi/6SJT");
      Site site1 = new Site();
      site1.hashCode();
      boolean boolean0 = site0.equals(site1);
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertTrue(site1.isUseGzip());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site1.setCharset("{a(pWYeLWp4VkiI");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
      
      site1.toTask();
      assertFalse(site1.equals((Object)site0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site0.setUserAgent("#TRIInO<E|*VJQ1gtZ");
      boolean boolean0 = site1.equals(site2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setUserAgent("");
      Site site2 = Site.me();
      boolean boolean0 = site1.equals(site2);
      assertTrue(site2.isUseGzip());
      assertEquals(0, site2.getCycleRetryTimes());
      assertFalse(site2.isDisableCookieManagement());
      assertFalse(boolean0);
      assertEquals(5000, site2.getTimeOut());
      assertEquals(5000, site2.getSleepTime());
      assertEquals(1000, site2.getRetrySleepTime());
      assertEquals(0, site2.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Site site0 = Site.me();
      site0.setDomain("N=s9i$%mPkwFi/6SJT");
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertFalse(boolean0);
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Site site0 = Site.me();
      site0.setCharset("N=s9i$%mPkwFi/6SJT");
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site0 = new Site();
      linkedHashSet0.toString();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site0.setDomain("[]");
      boolean boolean0 = site1.equals(site2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setDomain("{*wS");
      Site site2 = new Site();
      assertFalse(site2.equals((Object)site1));
      
      site2.setDomain("{*wS");
      boolean boolean0 = site2.equals(site0);
      assertTrue(site2.equals((Object)site0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.addCookie("{*wS", "{*wS", "{*wS");
      site1.toTask();
      Site site2 = Site.me();
      assertTrue(site2.equals((Object)site0));
      
      site0.addCookie("", "{*wS");
      Site site3 = site1.setCharset("{*wS");
      site1.setCharset("% g4");
      Site site4 = site3.addCookie("% g4", "Vd3;DTw&*vHlGy", "% g4");
      site4.addHeader("$%:n!J~)", "% g4");
      Site site5 = site2.setCharset("% g4");
      site3.toString();
      Site site6 = new Site();
      Site site7 = site5.setDomain("{*wS");
      site7.equals(site1);
      site4.hashCode();
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      Site site2 = site1.setUserAgent("P*|y8o8k\nA^");
      site0.setUserAgent("P*|y8o8k\nA^");
      Site site3 = site0.setDisableCookieManagement(true);
      site3.equals(site2);
      site0.getAcceptStatCode();
      int int0 = site0.getRetrySleepTime();
      assertTrue(site0.equals((Object)site1));
      assertTrue(site0.isDisableCookieManagement());
      assertEquals(1000, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Site site0 = new Site();
      site0.setAcceptStatCode((Set<Integer>) null);
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertEquals(0, site1.getRetryTimes());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertFalse(boolean0);
      assertEquals(5000, site1.getTimeOut());
      assertFalse(site1.equals((Object)site0));
      assertTrue(site1.isUseGzip());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setAcceptStatCode((Set<Integer>) null);
      Site site2 = new Site();
      assertFalse(site2.equals((Object)site1));
      
      site2.setAcceptStatCode((Set<Integer>) null);
      site0.equals(site2);
      site2.toTask();
      assertTrue(site2.equals((Object)site1));
  }
}
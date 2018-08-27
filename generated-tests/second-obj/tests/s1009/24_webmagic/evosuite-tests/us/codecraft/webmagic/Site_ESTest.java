/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:39:01 GMT 2018
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
      Site site0 = new Site();
      Site site1 = site0.setCycleRetryTimes(0);
      site1.getHeaders();
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(5000, site1.getSleepTime());
      assertTrue(site1.isUseGzip());
      assertEquals(0, site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Site site0 = Site.me();
      assertFalse(site0.isDisableCookieManagement());
      
      site0.setDisableCookieManagement(true);
      assertTrue(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Site site0 = Site.me();
      site0.getUserAgent();
      Site site1 = site0.addHeader((String) null, (String) null);
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Site site0 = Site.me();
      site0.getDomain();
      assertTrue(site0.isUseGzip());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.addCookie("", "", "");
      Site site2 = site1.addCookie("", "", "");
      assertEquals(5000, site2.getSleepTime());
      assertEquals(0, site2.getRetryTimes());
      assertEquals(0, site2.getCycleRetryTimes());
      assertFalse(site2.isDisableCookieManagement());
      assertEquals(1000, site2.getRetrySleepTime());
      assertEquals(5000, site2.getTimeOut());
      assertTrue(site2.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Site site0 = new Site();
      site0.getCookies();
      site0.setRetrySleepTime(637);
      assertEquals(637, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Site site0 = Site.me();
      site0.addCookie("<)[po<ddQw", "<)[po<ddQw");
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      assertTrue(linkedHashSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Site site0 = Site.me();
      int int0 = site0.getRetryTimes();
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(0, int0);
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Site site0 = Site.me();
      site0.getUserAgent();
      Site site1 = site0.setCharset((String) null);
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Site site0 = Site.me();
      int int0 = site0.getSleepTime();
      assertEquals(5000, int0);
      
      Site site1 = site0.setTimeOut(5000);
      assertTrue(site1.isUseGzip());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Site site0 = Site.me();
      boolean boolean0 = site0.equals(site0);
      assertTrue(boolean0);
      
      int int0 = site0.getRetrySleepTime();
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, int0);
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Site site0 = new Site();
      int int0 = site0.getTimeOut();
      assertEquals(5000, int0);
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Site site0 = Site.me();
      site0.hashCode();
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Site site0 = Site.me();
      site0.setUserAgent("%3P");
      site0.hashCode();
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Site site0 = Site.me();
      site0.getHeaders();
      site0.getCookies();
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getSleepTime());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Site site0 = Site.me();
      int int0 = site0.getSleepTime();
      assertEquals(5000, int0);
      
      site0.getAcceptStatCode();
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Site site0 = Site.me();
      site0.toTask();
      boolean boolean0 = site0.isUseGzip();
      assertTrue(boolean0);
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Site site0 = Site.me();
      site0.getUserAgent();
      site0.getCharset();
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setAcceptStatCode((Set<Integer>) null);
      site1.hashCode();
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setCharset("\u00078)'1UI-");
      site1.hashCode();
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(0, site1.getCycleRetryTimes());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setUserAgent((String) null);
      boolean boolean0 = site1.equals((Object) null);
      assertEquals(5000, site1.getTimeOut());
      assertFalse(boolean0);
      assertTrue(site1.isUseGzip());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      site1.setRetryTimes((-177));
      Site site2 = site0.setCycleRetryTimes((-177));
      boolean boolean0 = site1.equals(site2);
      assertEquals((-177), site0.getCycleRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      site1.setSleepTime(236);
      site0.equals(site1);
      assertEquals(236, site1.getSleepTime());
      
      site0.isDisableCookieManagement();
      int int0 = site0.getSleepTime();
      assertEquals(5000, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      Site site2 = site0.setUseGzip(true);
      assertEquals(5000, site2.getTimeOut());
      
      site2.setTimeOut((-1));
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      site1.setRetryTimes(5000);
      boolean boolean0 = site0.equals(site1);
      assertEquals(5000, site1.getRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site1.setCharset("");
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
      
      int int0 = site1.getSleepTime();
      assertEquals(5000, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site1.setDomain("");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site1.addHeader("p%f", "p%f");
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site0.setAcceptStatCode(linkedHashSet0);
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site1.setCharset("GF");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site0.setUserAgent("");
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site0.setDomain("N");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site1.addCookie("<IHYqhF", "I");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site0.setUserAgent("");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      Site site2 = site1.setDomain("\u00078)'1UI-");
      assertFalse(site2.equals((Object)site0));
      
      site0.setDomain("\u00078)'1UI-");
      site1.equals(site0);
      site2.hashCode();
      assertTrue(site2.equals((Object)site0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      Site site2 = site1.setRetrySleepTime(27);
      site2.setCharset("");
      Site site3 = site0.setCharset("");
      boolean boolean0 = site3.equals(site1);
      assertEquals(27, site1.getRetrySleepTime());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site1.setAcceptStatCode((Set<Integer>) null);
      site0.setUserAgent("wN- m");
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Site site0 = Site.me();
      site0.getSleepTime();
      Site site1 = new Site();
      site1.toString();
      site0.getCycleRetryTimes();
      Site site2 = site0.setSleepTime(5000);
      site0.equals(site1);
      Site site3 = site2.addCookie("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}", "Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}", "Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}");
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site4 = site1.setRetryTimes(0);
      site0.setUserAgent("");
      Object object0 = new Object();
      Site site5 = site1.setUserAgent("");
      site5.equals(site3);
      Object object1 = new Object();
      boolean boolean0 = site4.equals(object1);
      assertFalse(boolean0);
      assertTrue(site4.equals((Object)site0));
      
      site0.setDomain(", headCrs=");
      site4.getAllCookies();
      assertEquals(1000, site1.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      site0.equals(site0);
      Site site2 = site0.setCharset((String) null);
      site1.setAcceptStatCode((Set<Integer>) null);
      Site site3 = site0.setAcceptStatCode((Set<Integer>) null);
      site2.equals(site1);
      boolean boolean0 = site0.equals("wUw)=N<[4hbV");
      assertFalse(boolean0);
      
      site1.toTask();
      assertTrue(site1.equals((Object)site2));
      
      site3.setUserAgent("%?el<~e");
      assertFalse(site0.isDisableCookieManagement());
  }
}
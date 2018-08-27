/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:22:01 GMT 2018
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
      boolean boolean0 = site0.isUseGzip();
      assertEquals(0, site0.getRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertTrue(boolean0);
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Site site0 = Site.me();
      site0.setRetrySleepTime(125);
      assertEquals(125, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Site site0 = Site.me();
      assertTrue(site0.isUseGzip());
      
      site0.setUseGzip(false);
      assertFalse(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Site site0 = Site.me();
      site0.getAllCookies();
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Site site0 = Site.me();
      String string0 = site0.toString();
      assertEquals(1000, site0.getRetrySleepTime());
      assertTrue(site0.isUseGzip());
      assertEquals("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}", string0);
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Site site0 = new Site();
      site0.hashCode();
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.addCookie((String) null, (String) null, (String) null);
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Site site0 = Site.me();
      site0.getCharset();
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getSleepTime());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Site site0 = new Site();
      boolean boolean0 = site0.isDisableCookieManagement();
      assertTrue(site0.isUseGzip());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertFalse(boolean0);
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Site site0 = Site.me();
      site0.getAcceptStatCode();
      assertEquals(5000, site0.getSleepTime());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Site site0 = Site.me();
      site0.toTask();
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Site site0 = Site.me();
      assertFalse(site0.isDisableCookieManagement());
      
      site0.setDisableCookieManagement(true);
      assertTrue(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Site site0 = Site.me();
      int int0 = site0.getCycleRetryTimes();
      assertEquals(0, int0);
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Site site0 = new Site();
      int int0 = site0.getRetrySleepTime();
      assertEquals(5000, site0.getSleepTime());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Site site0 = Site.me();
      site0.getUserAgent();
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertTrue(site0.isUseGzip());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Site site0 = new Site();
      site0.getDomain();
      assertEquals(0, site0.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Site site0 = new Site();
      int int0 = site0.getTimeOut();
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(5000, int0);
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Site site0 = new Site();
      int int0 = site0.getRetryTimes();
      assertTrue(site0.isUseGzip());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(0, int0);
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Site site0 = new Site();
      site0.getCookies();
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Site site0 = new Site();
      int int0 = site0.getSleepTime();
      assertTrue(site0.isUseGzip());
      assertEquals(5000, int0);
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Site site0 = new Site();
      site0.getUserAgent();
      boolean boolean0 = site0.equals((Object) null);
      assertFalse(boolean0);
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Site site0 = new Site();
      Object object0 = new Object();
      boolean boolean0 = site0.equals(object0);
      assertTrue(site0.isUseGzip());
      assertFalse(boolean0);
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Site site0 = Site.me();
      site0.setDomain("|MKh=PO,h.Ct7");
      site0.hashCode();
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Site site0 = Site.me();
      site0.setCharset(", sleepTime=");
      site0.hashCode();
      assertEquals(0, site0.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Site site0 = Site.me();
      site0.setAcceptStatCode((Set<Integer>) null);
      site0.hashCode();
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Site site0 = Site.me();
      site0.getHeaders();
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Site site0 = new Site();
      site0.addCookie((String) null, (String) null, (String) null);
      Site site1 = site0.addCookie((String) null, (String) null, (String) null);
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Site site0 = Site.me();
      site0.setUserAgent("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=0, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[], headers={}}");
      site0.hashCode();
      assertEquals(0, site0.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      boolean boolean0 = site1.equals(site0);
      assertTrue(boolean0);
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      site1.setCycleRetryTimes((-33));
      boolean boolean0 = site1.equals(site0);
      assertEquals((-33), site1.getCycleRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site0.setDomain("/4$fW;lNx8\tai");
      boolean boolean0 = site2.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site0.setCharset("`");
      boolean boolean0 = site1.equals(site2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site1.setCharset(", retryTimes=");
      boolean boolean0 = site2.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Site site0 = new Site();
      site0.setSleepTime((-2133355464));
      Site site1 = Site.me();
      boolean boolean0 = site1.equals(site0);
      assertEquals((-2133355464), site0.getSleepTime());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      site1.setRetryTimes((-1836));
      boolean boolean0 = site1.equals(site0);
      assertEquals((-1836), site1.getRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site1.addCookie("1#nFMxZ1G|rXL", "1#nFMxZ1G|rXL");
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site1.addHeader("", "");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site1.setUserAgent("1#nFMxZ1G|@XL");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Site site0 = Site.me();
      site0.setDomain("E4WadY^nhm.Krn");
      Site site1 = Site.me();
      boolean boolean0 = site1.equals(site0);
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(boolean0);
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Site site0 = new Site();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site0.setAcceptStatCode(linkedHashSet0);
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertEquals(1000, site1.getRetrySleepTime());
      assertFalse(boolean0);
      assertEquals(5000, site1.getTimeOut());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      Site site2 = site1.setDomain(", retryimes=");
      assertFalse(site2.equals((Object)site0));
      
      site0.setDomain(", retryimes=");
      boolean boolean0 = site2.equals(site0);
      assertTrue(site2.equals((Object)site0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site1.setUserAgent("1#nFMxZ1G|@XL");
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      Site site2 = site1.setTimeOut(1499);
      boolean boolean0 = site0.equals(site2);
      assertEquals(1499, site1.getTimeOut());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      Site site2 = site0.setCharset("(<;E{N_!\"u48");
      assertFalse(site2.equals((Object)site1));
      
      site1.setCharset("(<;E{N_!\"u48");
      boolean boolean0 = site1.equals(site0);
      assertTrue(site0.equals((Object)site1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setUserAgent("dM6JD(/Hye>`,Q\"PU");
      Site site2 = Site.me();
      assertFalse(site2.equals((Object)site1));
      
      site2.setUserAgent("dM6JD(/Hye>`,Q\"PU");
      boolean boolean0 = site2.equals(site0);
      assertTrue(site2.equals((Object)site1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Site site0 = new Site();
      site0.setAcceptStatCode((Set<Integer>) null);
      Site site1 = Site.me();
      boolean boolean0 = site0.equals(site1);
      assertEquals(5000, site1.getSleepTime());
      assertFalse(boolean0);
      assertEquals(0, site1.getRetryTimes());
      assertTrue(site1.isUseGzip());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertFalse(site1.equals((Object)site0));
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setAcceptStatCode((Set<Integer>) null);
      Site site2 = Site.me();
      assertFalse(site2.equals((Object)site1));
      
      Site site3 = site2.setAcceptStatCode((Set<Integer>) null);
      boolean boolean0 = site3.equals(site0);
      assertTrue(site2.equals((Object)site1));
      assertTrue(boolean0);
  }
}
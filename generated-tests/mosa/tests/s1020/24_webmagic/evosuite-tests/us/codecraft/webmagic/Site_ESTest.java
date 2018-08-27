/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:56:34 GMT 2018
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
      site0.toTask();
      assertTrue(site0.isUseGzip());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Site site0 = new Site();
      site0.setRetrySleepTime((-1689));
      assertEquals((-1689), site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Site site0 = Site.me();
      String string0 = site0.toString();
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Site site0 = new Site();
      int int0 = site0.getSleepTime();
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Site site0 = Site.me();
      Set<Integer> set0 = site0.getAcceptStatCode();
      Site site1 = site0.setAcceptStatCode(set0);
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Site site0 = Site.me();
      site0.getHeaders();
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Site site0 = Site.me();
      boolean boolean0 = site0.equals("");
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertFalse(boolean0);
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.addCookie(":vW+MYa]3A$\"E:D'", ":vW+MYa]3A$\"E:D'", ":vW+MYa]3A$\"E:D'");
      assertEquals(5000, site1.getSleepTime());
      assertTrue(site1.isUseGzip());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Site site0 = Site.me();
      boolean boolean0 = site0.isDisableCookieManagement();
      assertFalse(boolean0);
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Site site0 = Site.me();
      site0.getDomain();
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(0, site0.getRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Site site0 = new Site();
      int int0 = site0.getRetrySleepTime();
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Site site0 = Site.me();
      assertTrue(site0.isUseGzip());
      
      site0.setUseGzip(false);
      assertFalse(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Site site0 = new Site();
      site0.getCookies();
      assertEquals(5000, site0.getSleepTime());
      assertTrue(site0.isUseGzip());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Site site0 = Site.me();
      site0.hashCode();
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getSleepTime());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Site site0 = Site.me();
      boolean boolean0 = site0.isUseGzip();
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(boolean0);
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setDisableCookieManagement(false);
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Site site0 = new Site();
      site0.getUserAgent();
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Site site0 = Site.me();
      site0.setCharset("c0TlT{{HY~s8");
      site0.hashCode();
      assertEquals(5000, site0.getSleepTime());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Site site0 = Site.me();
      site0.setUserAgent(", sleepTime=");
      site0.hashCode();
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Site site0 = new Site();
      int int0 = site0.getTimeOut();
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, int0);
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Site site0 = Site.me();
      int int0 = site0.getCycleRetryTimes();
      assertTrue(site0.isUseGzip());
      assertEquals(0, int0);
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Site site0 = new Site();
      int int0 = site0.getRetryTimes();
      assertEquals(0, int0);
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Site site0 = new Site();
      site0.getAllCookies();
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Site site0 = Site.me();
      boolean boolean0 = site0.equals((Object) null);
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getSleepTime());
      assertTrue(site0.isUseGzip());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      boolean boolean0 = site0.equals(site1);
      assertEquals(5000, site1.getSleepTime());
      assertTrue(boolean0);
      assertTrue(site1.isUseGzip());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      Site site2 = site1.setTimeOut((-5281));
      boolean boolean0 = site2.equals(site0);
      assertEquals((-5281), site1.getTimeOut());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Site site0 = new Site();
      site0.setSleepTime(10);
      Site site1 = Site.me();
      boolean boolean0 = site0.equals(site1);
      assertEquals(10, site0.getSleepTime());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Site site0 = new Site();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site0.setAcceptStatCode(linkedHashSet0);
      Site site1 = Site.me();
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(5000, site1.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site1.setUserAgent("Site{domain='");
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Site site0 = new Site();
      site0.addCookie("nKs1/$S-r1vN", "nKs1/$S-r1vN", "nKs1/$S-r1vN");
      Site site1 = site0.addCookie("nKs1/$S-r1vN", "nKs1/$S-r1vN", "nKs1/$S-r1vN");
      assertTrue(site1.isUseGzip());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Site site0 = new Site();
      site0.setCharset("8M>HH*;vF");
      Site site1 = Site.me();
      boolean boolean0 = site0.equals(site1);
      assertEquals(0, site1.getRetryTimes());
      assertFalse(boolean0);
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site0.addHeader("`&wO;-~WG](", "`&wO;-~WG](");
      boolean boolean0 = site2.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site1.setUserAgent("g{y&tNyE*=iV+R*x");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Site site0 = new Site();
      site0.setDomain("z/4T:FF4GqZ/kr:u");
      Site site1 = Site.me();
      boolean boolean0 = site0.equals(site1);
      assertEquals(5000, site1.getSleepTime());
      assertTrue(site1.isUseGzip());
      assertFalse(boolean0);
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = Site.me();
      site1.setRetryTimes(750);
      boolean boolean0 = site0.equals(site1);
      assertEquals(750, site1.getRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site1.setDomain(", cookies=");
      boolean boolean0 = site0.equals(site2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      Site site2 = site1.setCycleRetryTimes(424);
      boolean boolean0 = site0.equals(site2);
      assertEquals(424, site1.getCycleRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site1.addCookie("0X&6#pH+d15-z@", "0X&6#pH+d15-z@");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setUserAgent("z/4T:FF4GqZKkr:u");
      Site site2 = new Site();
      assertFalse(site2.equals((Object)site0));
      
      site2.setUserAgent("z/4T:FF4GqZKkr:u");
      boolean boolean0 = site0.equals(site2);
      assertTrue(site2.equals((Object)site1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site1.setCharset("us.codecraft.webmagic.Site");
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = Site.me();
      Site site2 = site1.setCharset(":JW+a]3A$\"E:D'");
      assertFalse(site2.equals((Object)site0));
      
      site0.setCharset(":JW+a]3A$\"E:D'");
      boolean boolean0 = site0.equals(site1);
      assertTrue(site0.equals((Object)site1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setDomain(":vW+MYa]3A$\"E:D'");
      Site site2 = Site.me();
      Site site3 = site2.setDomain(":vW+MYa]3A$\"E:D'");
      site3.equals(site0);
      site2.hashCode();
      assertTrue(site2.equals((Object)site1));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site0.setAcceptStatCode((Set<Integer>) null);
      boolean boolean0 = site2.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      Site site2 = site0.setAcceptStatCode((Set<Integer>) null);
      Site site3 = site1.setUseGzip(false);
      boolean boolean0 = site0.equals(site1);
      Site site4 = site3.setAcceptStatCode((Set<Integer>) null);
      Site site5 = site2.addHeader("7?fMJs#0-mZ%", "L");
      site0.hashCode();
      site4.getCharset();
      boolean boolean1 = site5.equals(site4);
      assertFalse(site1.isUseGzip());
      assertTrue(boolean1 == boolean0);
  }
}

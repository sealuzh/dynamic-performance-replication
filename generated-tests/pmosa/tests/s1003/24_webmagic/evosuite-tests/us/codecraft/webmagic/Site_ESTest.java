/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 21:31:49 GMT 2018
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
      Site site1 = site0.setRetryTimes(0);
      Site site2 = site1.setCycleRetryTimes(1195);
      site0.isDisableCookieManagement();
      site0.setSleepTime(0);
      Site.me();
      Site site3 = site1.setSleepTime(0);
      site3.equals(site2);
      site1.getRetrySleepTime();
      Site.me();
      int int0 = site2.getRetrySleepTime();
      assertEquals(1195, site1.getCycleRetryTimes());
      assertEquals(1000, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Site site0 = new Site();
      Object object0 = new Object();
      boolean boolean0 = site0.equals(object0);
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(boolean0);
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setRetryTimes(1000);
      Site site2 = site1.setCharset("LX<b=F\"lyzQoJ*L'");
      Site site3 = site2.addCookie("", "LX<b=F\"lyzQoJ*L'");
      Site site4 = site3.setDomain("");
      Site site5 = site4.setSleepTime(0);
      int int0 = site5.getSleepTime();
      assertEquals(1000, site0.getRetryTimes());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.addCookie("", "", "");
      site1.setCycleRetryTimes(0);
      site1.equals((Object) null);
      site0.getDomain();
      Site site2 = site1.setDisableCookieManagement(true);
      Site site3 = site2.setSleepTime(0);
      Site site4 = site3.setDomain(", charset='");
      Site site5 = site4.setUseGzip(true);
      Set<Integer> set0 = site3.getAcceptStatCode();
      site5.setAcceptStatCode(set0);
      site3.setCycleRetryTimes(1);
      Site site6 = Site.me();
      Site site7 = site6.setSleepTime((-477));
      Site site8 = site0.setUseGzip(false);
      Site site9 = site3.setRetrySleepTime((-4154));
      site9.setSleepTime((-1));
      site1.isUseGzip();
      site1.setCharset("");
      site2.getCycleRetryTimes();
      site3.isUseGzip();
      site8.setCharset("7iEXoy%y|U8N;");
      boolean boolean0 = site7.equals(set0);
      assertFalse(site0.isUseGzip());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Site site0 = new Site();
      site0.addCookie("?1Hz", "?1Hz", "?1Hz");
      site0.getTimeOut();
      site0.setCycleRetryTimes((-844));
      assertEquals((-844), site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Site site0 = new Site();
      site0.isUseGzip();
      site0.getAllCookies();
      Site site1 = site0.setRetrySleepTime(0);
      Site site2 = site1.addCookie("", "");
      Site site3 = site2.setCycleRetryTimes(1556);
      site0.setRetryTimes(0);
      site3.setCycleRetryTimes(0);
      assertEquals(0, site3.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setCharset("");
      site1.toTask();
      site0.setDisableCookieManagement(false);
      site1.setDomain("");
      site0.setRetryTimes(0);
      Site site2 = site0.setUseGzip(true);
      site2.setCharset("");
      site1.setSleepTime(39);
      site0.getCookies();
      assertEquals(39, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setSleepTime(1220);
      Site site2 = site1.setRetrySleepTime((-3462));
      Site site3 = site2.addHeader("", "");
      site3.addHeader("j", (String) null);
      Site site4 = site2.addCookie("us.codecraft.webmagic.Site", "", "us.codecraft.webmagic.Site");
      site2.getHeaders();
      boolean boolean0 = site4.equals((Object) null);
      assertEquals((-3462), site1.getRetrySleepTime());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.addHeader("", "]xRcu8{a2.)JDI");
      Site site2 = site1.setRetryTimes((-1323));
      Site site3 = site2.setCycleRetryTimes((-1323));
      Site site4 = site3.addCookie("a)aaH", "", "vH9");
      Site site5 = site0.addHeader("", "vH9");
      Site site6 = site5.setTimeOut((-1323));
      site6.setRetrySleepTime((-1323));
      Site site7 = site3.addCookie("a)aaH", ")6~xh\"zg4");
      site2.setUserAgent(")6~xh\"zg4");
      Site site8 = site7.setRetrySleepTime((-1685));
      site8.getRetryTimes();
      Set<Integer> set0 = site1.getAcceptStatCode();
      Site site9 = site4.setAcceptStatCode(set0);
      site9.toString();
      site2.setAcceptStatCode(set0);
      assertEquals((-1323), site2.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setRetryTimes((-1));
      Site site2 = site1.addCookie((String) null, "");
      Site site3 = site2.setRetrySleepTime((-1));
      Site site4 = site3.setUseGzip(true);
      Site site5 = site2.setTimeOut((-1));
      site5.setSleepTime((-1));
      site5.setAcceptStatCode((Set<Integer>) null);
      Site site6 = site2.setSleepTime((-1));
      site6.setRetryTimes((-1));
      site4.setCycleRetryTimes((-879));
      Site site7 = site3.setUseGzip(true);
      site1.addCookie((String) null, "", "rzC%dZ");
      Site site8 = site4.setUseGzip(true);
      Site site9 = site4.setSleepTime((-1));
      Site site10 = site9.setUserAgent((String) null);
      Site site11 = site10.setRetryTimes((-1));
      site1.getCookies();
      site2.getHeaders();
      site3.toString();
      site8.hashCode();
      site7.setDisableCookieManagement(false);
      site4.setSleepTime((-1857));
      site11.getDomain();
      assertEquals((-1), site4.getTimeOut());
      assertEquals((-1857), site11.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Site site0 = Site.me();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site0.setAcceptStatCode(linkedHashSet0);
      site0.hashCode();
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getSleepTime());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Site site0 = new Site();
      Set<Integer> set0 = site0.getAcceptStatCode();
      Site site1 = site0.setAcceptStatCode(set0);
      site1.getCharset();
      Site site2 = site1.setUserAgent((String) null);
      site2.toTask();
      Site site3 = site0.setDomain((String) null);
      Site site4 = site1.setRetryTimes((-577));
      Site site5 = site4.setUseGzip(false);
      Site site6 = site5.setCharset((String) null);
      Site site7 = site6.setDomain((String) null);
      site5.addCookie((String) null, "Site{domain='");
      Site site8 = site5.addCookie((String) null, (String) null, "%yP3");
      site3.isDisableCookieManagement();
      Site site9 = site8.setAcceptStatCode(set0);
      site8.setDisableCookieManagement(false);
      Site site10 = Site.me();
      Site site11 = site8.setRetryTimes((-577));
      site10.getAcceptStatCode();
      Site site12 = site11.setAcceptStatCode(set0);
      site12.getHeaders();
      site1.getCycleRetryTimes();
      site10.isDisableCookieManagement();
      site1.getHeaders();
      site9.getRetryTimes();
      boolean boolean0 = site10.equals(site7);
      assertEquals((-577), site1.getRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.addCookie("", "<}2T|e~%Bt8V", "4i#");
      Site site2 = site1.setRetrySleepTime((-73));
      Site site3 = site2.setUseGzip(false);
      Site.me();
      Site site4 = site3.setRetryTimes((-73));
      Site site5 = site4.addCookie((String) null, "4i#");
      site5.getUserAgent();
      site5.addCookie("4i#", "");
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site6 = site5.setAcceptStatCode(linkedHashSet0);
      Site site7 = site0.setUserAgent("");
      site7.addCookie(", retryTimes=", (String) null, ", timeOut=");
      site6.addCookie("4i#", "4i#", "nSV");
      assertEquals((-73), site3.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Site site0 = new Site();
      Set<Integer> set0 = site0.getAcceptStatCode();
      Site site1 = site0.setAcceptStatCode(set0);
      site1.getCharset();
      Site site2 = site1.setUserAgent((String) null);
      site2.toTask();
      Site site3 = site0.setDomain((String) null);
      Site site4 = site1.setRetryTimes((-577));
      Site site5 = site4.setUseGzip(false);
      Site site6 = site5.setCharset((String) null);
      site6.setDomain((String) null);
      site5.addCookie((String) null, "Site{domain='");
      Site site7 = site5.addCookie((String) null, (String) null, "%yP3");
      site3.isDisableCookieManagement();
      Site site8 = site7.setAcceptStatCode(set0);
      site7.setDisableCookieManagement(false);
      Site.me();
      site8.addCookie("#>", (String) null);
      Site site9 = site1.setCharset("iv0");
      Site.me();
      site9.addCookie((String) null, "wZEc`w|dWrV;nF5pe", "(m \"6-A@Clwo0m");
      site4.hashCode();
      assertEquals((-577), site1.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Site site0 = new Site();
      Set<Integer> set0 = site0.getAcceptStatCode();
      Site site1 = Site.me();
      site1.getCharset();
      Site site2 = site1.setUserAgent((String) null);
      site2.toTask();
      Site site3 = site1.addCookie((String) null, (String) null, (String) null);
      Site site4 = site1.setRetryTimes((-577));
      Site site5 = site4.setUseGzip(false);
      Site site6 = site0.addCookie((String) null, (String) null);
      Site site7 = site6.setDomain((String) null);
      site5.addCookie((String) null, "Site{domain='");
      Site site8 = site5.addCookie((String) null, (String) null, "%yP3");
      site3.isDisableCookieManagement();
      site8.setDisableCookieManagement(false);
      Site site9 = Site.me();
      Site site10 = site2.setDomain((String) null);
      site9.getAcceptStatCode();
      Site site11 = site10.setAcceptStatCode(set0);
      site11.getHeaders();
      site1.getCycleRetryTimes();
      site9.isDisableCookieManagement();
      site1.getHeaders();
      assertEquals((-577), site1.getRetryTimes());
      
      site6.getRetryTimes();
      boolean boolean0 = site9.equals(site7);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Site site0 = new Site();
      Set<Integer> set0 = site0.getAcceptStatCode();
      Site site1 = Site.me();
      site1.getCharset();
      Site site2 = site1.setUserAgent((String) null);
      Site site3 = site1.addCookie((String) null, (String) null, (String) null);
      site3.setRetrySleepTime(0);
      Site site4 = site0.setCharset((String) null);
      Site site5 = site4.setDomain((String) null);
      Site site6 = Site.me();
      Site site7 = site2.setDomain((String) null);
      site7.setCycleRetryTimes((-7183));
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site8 = site7.setAcceptStatCode(set0);
      site8.getHeaders();
      site6.isDisableCookieManagement();
      site1.getHeaders();
      assertEquals((-7183), site1.getCycleRetryTimes());
      
      site4.getRetryTimes();
      boolean boolean0 = site6.equals(site5);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      site1.setAcceptStatCode((Set<Integer>) null);
      Site site2 = site1.setCycleRetryTimes(0);
      boolean boolean0 = site2.equals(site0);
      assertFalse(boolean0);
      
      String string0 = site0.toString();
      assertEquals("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Site site0 = new Site();
      site0.setUserAgent(", acceptStatCode=");
      Site site1 = Site.me();
      boolean boolean0 = site0.equals(site1);
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(5000, site1.getSleepTime());
      assertFalse(boolean0);
      assertEquals(0, site1.getRetryTimes());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site0.setDomain("");
      boolean boolean0 = site2.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Site site0 = new Site();
      site0.setCharset(") acceptStatCode=");
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(boolean0);
      assertEquals(0, site1.getRetryTimes());
      assertEquals(5000, site1.getSleepTime());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site1.setAcceptStatCode((Set<Integer>) null);
      Site site3 = site0.setAcceptStatCode((Set<Integer>) null);
      Site.me();
      site3.setDomain("UA%.0}>!T ~X)");
      boolean boolean0 = site0.equals(site2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      Site site2 = site1.setDomain("");
      assertFalse(site2.equals((Object)site0));
      
      site0.setDomain("");
      boolean boolean0 = site1.equals(site0);
      assertTrue(site1.equals((Object)site0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setUserAgent(", acceptStatCode=");
      Site site2 = new Site();
      site2.setUserAgent(", acceptStatCode=");
      Site site3 = new Site();
      boolean boolean0 = site2.equals(site1);
      assertFalse(site2.equals((Object)site3));
      assertTrue(site2.equals((Object)site1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setCharset("0L,#}\"BQ\"Gi({JJTRJp");
      Site site2 = new Site();
      site2.setCharset("0L,#}\"BQ\"Gi({JJTRJp");
      site0.equals(site2);
      assertTrue(site2.equals((Object)site1));
      
      site1.hashCode();
      assertTrue(site0.equals((Object)site2));
  }
}
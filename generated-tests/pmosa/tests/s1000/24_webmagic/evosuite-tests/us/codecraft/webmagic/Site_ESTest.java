/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 14:19:37 GMT 2018
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
      Site site1 = site0.setUseGzip(false);
      Site site2 = site1.addCookie("~\"Fez%pZY*Mr#HZKnUx", "~\"Fez%pZY*Mr#HZKnUx");
      Site.me();
      Site site3 = site0.addCookie(", retryTimes=", ", retryTimes=");
      site3.setCycleRetryTimes(3003);
      site0.toTask();
      site2.setUserAgent(", retryTimes=");
      site1.setRetrySleepTime(200);
      Site site4 = site2.setUserAgent("Efb]{,d)!f");
      site1.isDisableCookieManagement();
      site3.isUseGzip();
      site4.setRetrySleepTime(200);
      assertEquals(200, site2.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.addHeader(", headers=", ", headers=");
      Site site2 = site1.setDomain(", headers=");
      Site site3 = site2.setDisableCookieManagement(true);
      Site site4 = site3.setUseGzip(true);
      Site site5 = site4.setRetryTimes((-1229));
      site5.getCharset();
      assertEquals((-1229), site4.getRetryTimes());
      assertEquals((-1229), site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Site site0 = new Site();
      site0.setRetryTimes(1861);
      boolean boolean0 = site0.equals("");
      assertEquals(1861, site0.getRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setSleepTime((-357));
      Site site2 = site1.setRetrySleepTime((-1626));
      Site site3 = site2.setRetryTimes(0);
      Site site4 = site3.setCharset("{c|RHjBxMJ~");
      site4.setUseGzip(false);
      site4.addHeader("", (String) null);
      site4.setUseGzip(false);
      Site site5 = Site.me();
      site1.setCharset("{c|RHjBxMJ~");
      Site site6 = site2.setTimeOut(0);
      Site site7 = site6.setUserAgent("");
      site6.getRetrySleepTime();
      site1.isUseGzip();
      site5.setTimeOut(0);
      site0.getDomain();
      site1.getRetrySleepTime();
      site5.getRetrySleepTime();
      site6.getCookies();
      site1.isDisableCookieManagement();
      site0.toTask();
      site4.equals("");
      site7.toTask();
      assertEquals((-357), site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setRetryTimes(0);
      Site site2 = site1.setRetrySleepTime(0);
      site1.setUseGzip(false);
      site0.addCookie(")*v^\"P%.q>C9k?8", "1X[", ")*v^\"P%.q>C9k?8");
      Site site3 = site0.setCharset("");
      Site site4 = site2.setUseGzip(true);
      Site site5 = site4.setCharset("");
      Site site6 = site5.addCookie("", "", "");
      Site site7 = site6.setTimeOut(0);
      site4.toString();
      site0.toTask();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site5.setTimeOut(0);
      site1.setAcceptStatCode(linkedHashSet0);
      site0.getHeaders();
      site4.getAcceptStatCode();
      site5.getAllCookies();
      site3.setAcceptStatCode(linkedHashSet0);
      Site site8 = Site.me();
      site8.toTask();
      Site.me();
      site6.setUserAgent((String) null);
      site7.setCycleRetryTimes((-820));
      assertEquals((-820), site2.getCycleRetryTimes());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setRetryTimes(5000);
      site0.hashCode();
      site1.getAllCookies();
      assertEquals(5000, site0.getRetryTimes());
      assertEquals(5000, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setUseGzip(false);
      Site site2 = site1.setRetrySleepTime(0);
      site2.setUseGzip(true);
      Site site3 = site2.setCycleRetryTimes(0);
      Site site4 = site1.setCharset(",i'O|qn");
      site4.toString();
      site4.isDisableCookieManagement();
      site2.setSleepTime(0);
      site4.setCharset("");
      Site site5 = site3.setCharset("Site{domain='null', userAgent='null', cookies={}, charset=',i'O|qn', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}");
      site4.getRetryTimes();
      site5.isDisableCookieManagement();
      site4.hashCode();
      site1.getDomain();
      assertEquals(0, site1.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setDomain("dX{$uVU|`+6");
      Set<Integer> set0 = site1.getAcceptStatCode();
      Site site2 = site1.setAcceptStatCode(set0);
      Site site3 = site0.setDisableCookieManagement(true);
      site3.setRetrySleepTime(1082);
      Site site4 = site2.setRetrySleepTime(3064);
      Site site5 = site4.setUseGzip(true);
      Site site6 = site5.addCookie("dX{$uVU|`+6", "\"QFZdb");
      site6.getCookies();
      site4.addCookie("\"QFZdb", "\"QFZdb");
      site4.getCycleRetryTimes();
      Site site7 = site0.setCharset((String) null);
      site7.setCharset((String) null);
      site5.getUserAgent();
      site7.setUserAgent((String) null);
      site7.addCookie("$ot", "", (String) null);
      site2.getCharset();
      Set<Integer> set1 = site7.getAcceptStatCode();
      site2.setUseGzip(true);
      Site site8 = site2.addHeader((String) null, (String) null);
      Site site9 = site8.setUseGzip(true);
      Site site10 = site6.setSleepTime(0);
      Site site11 = site10.setAcceptStatCode(set1);
      site4.isUseGzip();
      site9.setUserAgent("W`gA%|");
      site11.addCookie(", cycleRetryTimes=", "", ", cookies=");
      assertEquals(3064, site2.getRetrySleepTime());
      assertEquals(3064, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setSleepTime(2394);
      Site site2 = site1.setDomain("");
      Site site3 = site0.setTimeOut(0);
      site0.getCycleRetryTimes();
      Site site4 = Site.me();
      site3.getSleepTime();
      Site site5 = site1.setTimeOut(2394);
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site4.setAcceptStatCode(linkedHashSet0);
      Site site6 = site5.setRetrySleepTime((-2049));
      Site site7 = site5.addCookie("", "", "");
      site7.setUserAgent("");
      site7.hashCode();
      Site site8 = site6.setUserAgent("");
      site4.toString();
      Site site9 = site6.setSleepTime(2394);
      site4.toString();
      site4.setRetryTimes(0);
      site3.getDomain();
      site2.getCharset();
      site1.setTimeOut(0);
      site0.setRetryTimes(0);
      site8.toTask();
      site8.equals((Object) null);
      site9.getDomain();
      assertEquals((-2049), site5.getRetrySleepTime());
      assertEquals(2394, site9.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setRetrySleepTime(2118);
      Site site2 = site1.setSleepTime(1);
      Site site3 = site2.setDomain("");
      Set<Integer> set0 = site2.getAcceptStatCode();
      site0.toString();
      site3.toString();
      site2.addHeader("", "n'+k/L");
      Site site4 = site3.setAcceptStatCode(set0);
      Site site5 = site0.setUserAgent("");
      site2.setTimeOut(0);
      site3.addCookie("LA@e", "Site{domain='', userAgent='null', cookies={}, charset='null', sleepTime=1, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}");
      Site site6 = site4.addHeader(")fracA5V^BL", "");
      site6.setRetryTimes(0);
      Site site7 = site0.setUseGzip(false);
      site7.setTimeOut(1);
      site6.getAllCookies();
      Site site8 = site5.setSleepTime((-347));
      Object object0 = new Object();
      Site site9 = Site.me();
      site8.equals(site9);
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site0.setAcceptStatCode(linkedHashSet0);
      assertEquals(2118, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setSleepTime(2405);
      Site site2 = site0.addCookie("", "", "");
      Site site3 = site0.setTimeOut(0);
      site0.getCycleRetryTimes();
      Site site4 = Site.me();
      site3.getSleepTime();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site4.setAcceptStatCode(linkedHashSet0);
      Site site5 = site1.addCookie("", "", "");
      Site site6 = site5.setUserAgent("");
      site5.hashCode();
      Site site7 = site1.addHeader("", "");
      site7.setAcceptStatCode(linkedHashSet0);
      site4.toString();
      site1.addCookie("", "");
      Site site8 = site4.setSleepTime(2405);
      Site site9 = site4.setRetryTimes(0);
      site3.getDomain();
      site2.setTimeOut((-2049));
      site9.equals(site6);
      LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();
      Site.me();
      Integer integer0 = new Integer(0);
      site2.setAcceptStatCode(linkedHashSet0);
      site8.setCycleRetryTimes(0);
      site1.getAllCookies();
      assertEquals((-2049), site1.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setSleepTime(2405);
      Site site2 = site0.addCookie("", "", "");
      Site site3 = site0.setTimeOut(0);
      site0.getCycleRetryTimes();
      Site site4 = Site.me();
      site3.getSleepTime();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site4.setAcceptStatCode(linkedHashSet0);
      Site site5 = site1.addCookie("", "", "");
      Site site6 = site5.setUserAgent("");
      site5.hashCode();
      site1.addHeader("", "");
      site2.setRetrySleepTime(2405);
      site4.toString();
      site1.addCookie("", "");
      Site site7 = site4.setSleepTime(2405);
      Site site8 = site4.setRetryTimes(0);
      site8.setTimeOut(0);
      site3.getDomain();
      site8.equals(site6);
      site4.addCookie(", cycleRetryTimes=", "", ", cycleRetryTimes=");
      LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();
      Site.me();
      Integer integer0 = new Integer(0);
      site7.hashCode();
      assertEquals(2405, site4.getSleepTime());
      assertEquals(0, site7.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setSleepTime(2405);
      Site site2 = site0.addCookie("", "", "");
      Site site3 = site0.setTimeOut(0);
      site0.getCycleRetryTimes();
      Site site4 = Site.me();
      site3.getSleepTime();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site4.setAcceptStatCode(linkedHashSet0);
      Site site5 = site1.addCookie("", "", "");
      Site site6 = site5.setUserAgent("");
      site5.hashCode();
      site6.setAcceptStatCode(linkedHashSet0);
      Site site7 = site1.addHeader("", "");
      site7.addCookie("!3W8P.]", "{wx;Ds&2{}145U@");
      site2.setRetrySleepTime(2405);
      site4.toString();
      site1.addCookie("", "");
      Site site8 = site4.setSleepTime(2405);
      Site site9 = site4.setRetryTimes(0);
      Site site10 = site9.setTimeOut(0);
      site3.getDomain();
      site9.equals(site6);
      site4.addCookie(", cycleRetryTimes=", "", ", cycleRetryTimes=");
      LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();
      Site.me();
      Integer integer0 = new Integer(0);
      site8.hashCode();
      site10.setCharset("");
      assertEquals(2405, site4.getSleepTime());
      assertEquals(1000, site9.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setSleepTime(2385);
      Site site2 = site0.addCookie("Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}", "Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}", "Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}");
      site0.setTimeOut(0);
      site0.getCycleRetryTimes();
      Site site3 = Site.me();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site0.setDomain("Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}");
      Site site4 = site1.addCookie("", "", "");
      Site site5 = site4.setUserAgent("Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}");
      site4.hashCode();
      site2.setTimeOut(0);
      Site site6 = site1.addHeader("Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}", "");
      site2.setRetrySleepTime(0);
      site3.toString();
      site6.setRetryTimes(0);
      site3.setSleepTime(2385);
      Site.me();
      Site site7 = site3.setRetryTimes(0);
      site7.setTimeOut(0);
      site7.equals(site5);
      site3.addCookie(", cycleRetryTimes=", "", ", cycleRetryTimes=");
      LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();
      Site.me();
      Integer integer0 = new Integer(0);
      site1.hashCode();
      assertEquals(0, site1.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Site site0 = Site.me();
      site0.setDomain("275n?ycx%b7");
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setSleepTime(2385);
      Site site2 = site0.addCookie("Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}", "Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}", "Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}");
      Site site3 = site0.setTimeOut(0);
      site0.getCycleRetryTimes();
      Site site4 = Site.me();
      site3.getSleepTime();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site5 = site1.addCookie("", "", "");
      Site site6 = site5.setUserAgent("Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}");
      site5.hashCode();
      site2.setRetrySleepTime(2385);
      site4.toString();
      Site site7 = site0.setUserAgent("Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}");
      site4.setSleepTime(2385);
      Site site8 = site4.setRetryTimes(0);
      site8.setTimeOut(0);
      site8.equals(site6);
      site1.hashCode();
      boolean boolean0 = site7.isUseGzip();
      assertEquals(2385, site0.getSleepTime());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setRetryTimes(0);
      assertFalse(site1.isDisableCookieManagement());
      
      Site site2 = new Site();
      Site site3 = site1.setDisableCookieManagement(true);
      site3.equals(site2);
      Site site4 = site1.addCookie("73/@", "!", "Site{domain='");
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site5 = new Site();
      site3.equals(site5);
      site4.hashCode();
      assertEquals(5000, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setSleepTime(2385);
      Site site2 = site0.addCookie("Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}", "Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}", "Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}");
      Site site3 = site0.setTimeOut(0);
      site0.getCycleRetryTimes();
      Site site4 = Site.me();
      site3.getSleepTime();
      site4.setAcceptStatCode((Set<Integer>) null);
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site5 = site1.addCookie("", "", "");
      Site site6 = site5.setUserAgent("Site{domain='null', userAgent='', cookies={}, charset='', sleepTime=2405, retryTimes=0, cycleRetryTimes=0, timeOut=0, acceptStatCode=[], headers={bqP Zk*x/Bh:lANel=}}");
      site5.hashCode();
      Site site7 = site2.setRetrySleepTime(2385);
      site4.toString();
      site1.addCookie("", "");
      site4.setSleepTime(2385);
      Site site8 = site4.setRetryTimes(0);
      site8.setTimeOut(0);
      site8.equals(site6);
      site4.hashCode();
      int int0 = site7.getTimeOut();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site0.setUserAgent("i");
      boolean boolean0 = site2.equals(site1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Site site0 = new Site();
      site0.setCharset("7%49:S/TG68c$");
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertFalse(boolean0);
      assertEquals(0, site1.getCycleRetryTimes());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      Site site2 = site1.setCharset("`:oV7,^CN6]\"xsJ");
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site3 = new Site();
      site3.setUserAgent("`:oV7,^CN6]\"xsJ");
      Site site4 = site0.setUserAgent("`:oV7,^CN6]\"xsJ");
      site4.equals(site3);
      site3.hashCode();
      assertTrue(site3.equals((Object)site0));
      assertFalse(site3.equals((Object)site2));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Site site0 = Site.me();
      site0.toTask();
      Site site1 = Site.me();
      site0.setCharset("VVRhec\"g-k");
      site1.setCharset("VVRhec\"g-k");
      site0.equals(site1);
      site1.hashCode();
      site0.setCycleRetryTimes((-1886));
      assertEquals((-1886), site0.getCycleRetryTimes());
      
      site1.setTimeOut((-786));
      assertFalse(site1.equals((Object)site0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setSleepTime(0);
      site0.setTimeOut(0);
      site0.getCycleRetryTimes();
      Site site2 = Site.me();
      site0.setDomain("gkgE");
      site2.setUserAgent("gkgE");
      Site site3 = site1.addHeader("gkgE", "gkgE");
      Site site4 = site2.setSleepTime(0);
      site4.setDomain("gkgE");
      site4.addCookie("dZXsZL>T!", "dZXsZL>T!", "gkgE");
      site3.setRetrySleepTime(0);
      Site site5 = site4.setTimeOut(0);
      site5.equals(site1);
      site3.hashCode();
      assertEquals(0, site0.getSleepTime());
      assertEquals(0, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site0.addCookie(", sleepTime=", ", sleepTime=");
      site0.setAcceptStatCode((Set<Integer>) null);
      Site site2 = site1.setAcceptStatCode((Set<Integer>) null);
      boolean boolean0 = site2.equals(site0);
      assertFalse(boolean0);
  }
}
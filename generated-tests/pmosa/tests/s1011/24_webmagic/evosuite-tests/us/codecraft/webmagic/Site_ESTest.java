/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 18:53:06 GMT 2018
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
      Site site1 = site0.setUserAgent("2@zn:W8");
      Site site2 = site1.setRetryTimes((-1658));
      Site site3 = site2.setUseGzip(false);
      Site site4 = site0.setRetryTimes(0);
      site4.getCookies();
      site4.getTimeOut();
      site4.toTask();
      Site site5 = site4.addHeader("'[=wK:1_2W\"O^bI", "");
      Site site6 = site0.addCookie("", "", "'[=wK:1_2W\"O^bI");
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site5.setAcceptStatCode(linkedHashSet0);
      Site.me();
      Site site7 = site6.setCycleRetryTimes(125);
      Site site8 = site6.setCycleRetryTimes((-1658));
      site0.setUserAgent("");
      site8.toTask();
      site5.getCharset();
      site4.getDomain();
      Site site9 = Site.me();
      site9.setUserAgent("\"L$Ecc_)3eSEDU{c<n");
      site9.getTimeOut();
      Site site10 = site3.setRetrySleepTime(0);
      site4.getTimeOut();
      Site site11 = Site.me();
      site10.setDomain("eG(+%");
      site11.setTimeOut((-1658));
      site7.getHeaders();
      assertEquals((-1658), site0.getCycleRetryTimes());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setUseGzip(false);
      site0.setRetryTimes(992);
      Site site2 = site1.setSleepTime((-3794));
      Site site3 = site2.setCharset("");
      Site site4 = site2.setCycleRetryTimes((-1377));
      Site site5 = site3.setTimeOut((-1377));
      Site site6 = site5.setCycleRetryTimes((-3404));
      site6.toString();
      site6.isUseGzip();
      site4.getCycleRetryTimes();
      site6.setTimeOut((-1377));
      site2.getCookies();
      Site site7 = site6.addCookie("Site{domain='null', userAgent='null', cookies={}, charset='', sleepTime=-3794, retryTimes=992, cycleRetryTimes=-3404, timeOut=-1377, acceptStatCode=[200], headers={}}", "aaHmv+");
      site1.setUseGzip(true);
      site7.setUserAgent("g[NB");
      assertEquals(992, site1.getRetryTimes());
      assertEquals((-3404), site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Site site0 = Site.me();
      Object object0 = new Object();
      boolean boolean0 = site0.equals(object0);
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertTrue(site0.isUseGzip());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setDisableCookieManagement(false);
      Site site2 = site1.addCookie("", "", ", retryTimes=");
      int int0 = site2.getRetryTimes();
      site2.addCookie("hLhTU", ", cookies=", "");
      boolean boolean0 = site2.equals("hLhTU");
      assertFalse(boolean0);
      
      int int1 = site1.getCycleRetryTimes();
      assertTrue(int1 == int0);
      
      site1.hashCode();
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Site site0 = Site.me();
      Integer.getInteger("5`gc");
      boolean boolean0 = site0.equals((Object) null);
      assertFalse(boolean0);
      
      site0.toTask();
      assertTrue(site0.isUseGzip());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.addCookie((String) null, (String) null);
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site2 = site1.setAcceptStatCode(linkedHashSet0);
      site2.toTask();
      Site site3 = site1.setCharset((String) null);
      site3.setDomain((String) null);
      Site site4 = site1.setDisableCookieManagement(false);
      site4.setDisableCookieManagement(true);
      site0.setUseGzip(false);
      site3.getAllCookies();
      site1.getDomain();
      Site.me();
      site1.setCharset(", timeOut=");
      assertTrue(site1.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setCharset((String) null);
      Set<Integer> set0 = site1.getAcceptStatCode();
      Site site2 = site1.setAcceptStatCode(set0);
      Site site3 = site2.setTimeOut((-568));
      Site site4 = site2.setUseGzip(true);
      site3.setCharset(", userAgent='");
      Site site5 = site3.addCookie((String) null, (String) null);
      Site site6 = site5.setCycleRetryTimes((-568));
      Site.me();
      site6.getSleepTime();
      site5.toString();
      Site site7 = site0.setAcceptStatCode(set0);
      site0.setRetryTimes((-568));
      Site.me();
      Site site8 = site4.setCharset((String) null);
      Site.me();
      site1.getTimeOut();
      site4.setUserAgent("");
      site0.setRetryTimes(5000);
      site4.setSleepTime(0);
      site8.getCharset();
      site7.addHeader("", "S.dx&2swe");
      site0.setRetryTimes((-568));
      assertEquals((-568), site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setDisableCookieManagement(false);
      String string0 = site1.toString();
      assertEquals("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}", string0);
      
      site1.setUserAgent("<#CmmnrZ");
      Site site2 = site1.setDisableCookieManagement(false);
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site3 = site2.setAcceptStatCode(linkedHashSet0);
      site0.addCookie("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}", "_9[6G0))FE");
      site0.toTask();
      Site site4 = site1.addHeader(">)9Sy5{t@]", "");
      int int0 = site4.getCycleRetryTimes();
      site0.setCharset((String) null);
      boolean boolean0 = site1.equals("");
      assertFalse(boolean0);
      
      Site site5 = site4.addCookie("", ">)9Sy5{t@]");
      int int1 = site0.getRetryTimes();
      assertTrue(int1 == int0);
      
      int int2 = site4.getRetrySleepTime();
      assertEquals(1000, int2);
      
      site5.addCookie("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}", (String) null, "_9[6G0))FE");
      site3.hashCode();
      assertTrue(site3.isUseGzip());
      assertFalse(site3.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setCharset("j.O7v%B:sYu7(p$:");
      Site site2 = site1.setCycleRetryTimes(0);
      site2.addCookie(", sleepTime=", "j.O7v%B:sYu7(p$:");
      Site site3 = site2.setDisableCookieManagement(true);
      String string0 = "\\u=QT]#cwv";
      Site site4 = site1.setUseGzip(true);
      site1.toString();
      site4.setCycleRetryTimes(0);
      Site site5 = site3.addHeader(string0, string0);
      Site site6 = new Site();
      Set<Integer> set0 = site6.getAcceptStatCode();
      Site site7 = site5.setAcceptStatCode(set0);
      Site site8 = site5.setRetrySleepTime(0);
      Site site9 = site8.setDisableCookieManagement(true);
      site8.getRetrySleepTime();
      site5.setRetrySleepTime((-3767));
      Site site10 = site0.setRetryTimes(0);
      site4.isDisableCookieManagement();
      String string1 = site7.toString();
      site4.getHeaders();
      site2.getHeaders();
      site9.setRetryTimes((-1183));
      Site site11 = site10.addHeader("25O>mAv'*3+UA9<j6", string0);
      site11.setDisableCookieManagement(true);
      site10.setCharset(string1);
      site2.toTask();
      site9.setCycleRetryTimes(0);
      assertEquals((-3767), site9.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setDisableCookieManagement(false);
      Site site2 = site1.setCycleRetryTimes(0);
      Site site3 = site2.addCookie("", "tQ", ", retryTimes=");
      Site site4 = site3.addCookie(", retryTimes=", "9W8<Xc>Aq");
      Site site5 = site4.setRetrySleepTime(0);
      site1.getUserAgent();
      Site site6 = site4.addHeader("4.", "");
      site6.addCookie("f^Fs8F<teN@[e", ", retryTimes=", ", retryTimes=");
      site5.setDomain((String) null);
      site2.getRetryTimes();
      site2.isDisableCookieManagement();
      site5.getRetryTimes();
      site3.getHeaders();
      Site site7 = site4.setUseGzip(true);
      Site site8 = Site.me();
      site8.addCookie("", "D2Xc<%CQ^?`5wvR");
      site5.hashCode();
      site1.toTask();
      site7.addCookie("6d.YhG:w(-'`s", "5`gc", "");
      site4.setCycleRetryTimes(5000);
      Site site9 = site0.setUserAgent("b4(f*;");
      Site site10 = Site.me();
      boolean boolean0 = site9.equals(site10);
      assertEquals(5000, site0.getCycleRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      Site site2 = site1.addCookie("btRL8U3sAXoK.pA*>", ", TretryTimes=", "wW`KopsLfOWyA)N");
      site0.getRetryTimes();
      assertTrue(site0.equals((Object)site2));
      
      Site site3 = site1.setUserAgent("");
      Site site4 = site3.addCookie("btRL8U3sAXoK.pA*>", ", retryTimes=", "");
      Site site5 = site0.setCharset("wW`KopsLfOWyA)N");
      site2.equals(site5);
      site4.getCycleRetryTimes();
      site1.hashCode();
      assertEquals(5000, site1.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.addHeader("|Nc-^agdd^", "");
      Site site2 = site0.setUseGzip(false);
      Site site3 = site2.addCookie("", "|Nc-^agdd^");
      Site site4 = site3.setSleepTime((-2138));
      site3.addCookie("XXD# hQ6T", (String) null, "XXD# hQ6T");
      Integer.getInteger("Evng%^aSr;`ts");
      site3.equals((Object) null);
      Site site5 = site4.addCookie(", cookies=", "Evng%^aSr;`ts", (String) null);
      site5.getCycleRetryTimes();
      site1.hashCode();
      site0.addCookie("Evng%^aSr;`ts", "", ", cookies=");
      assertEquals((-2138), site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setDisableCookieManagement(false);
      Site site2 = site1.addCookie("", "tQ", ", retryTimes=");
      Site site3 = site2.addCookie(", retryTimes=", "9W8<Xc>Aq");
      site1.getUserAgent();
      Site site4 = site3.addHeader("4.", "");
      site4.addCookie("f^Fs8F<teN@[e", ", retryTimes=", ", retryTimes=");
      site0.getRetryTimes();
      site0.isDisableCookieManagement();
      site3.getRetryTimes();
      site2.getHeaders();
      Site site5 = site3.setUseGzip(true);
      Site site6 = Site.me();
      site6.addCookie("", "D2Xc<%CQ^?`5wvR");
      site0.hashCode();
      site1.toTask();
      site5.addCookie("6d.YhG:w(-'`s", "5`gc", "");
      site3.setCycleRetryTimes(0);
      Site site7 = site0.setUserAgent("b4(f*;");
      Site site8 = Site.me();
      site7.equals(site8);
      site5.setUseGzip(false);
      assertFalse(site5.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Site site0 = Site.me();
      site0.hashCode();
      site0.getRetryTimes();
      site0.getHeaders();
      Site site1 = site0.setUseGzip(true);
      Site site2 = Site.me();
      Site site3 = Site.me();
      site3.hashCode();
      site3.toTask();
      Site site4 = site2.addCookie("0F@D>+F{,{]la(yk?:", "D2Xc<%CQ^?`5wvR", "D2Xc<%CQ^?`5wvR");
      site4.setCycleRetryTimes((-747));
      assertEquals((-747), site4.getCycleRetryTimes());
      
      Site site5 = site3.setUserAgent("");
      Site site6 = Site.me();
      site5.equals(site6);
      site1.setUseGzip(true);
      assertFalse(site0.equals((Object)site2));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      site1.getHeaders();
      Site site2 = site1.setUseGzip(true);
      Site.me();
      Site site3 = Site.me();
      Site site4 = Site.me();
      site4.hashCode();
      site0.toTask();
      site3.addCookie("HIp';orZ>|(aL7ai0/", "", "H~<blG/k>UMQ|l>");
      assertTrue(site3.equals((Object)site2));
      
      site3.setDomain("");
      Site site5 = Site.me();
      boolean boolean0 = site0.equals(site5);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Site site0 = new Site();
      site0.setCharset("[cTP^");
      Site site1 = Site.me();
      boolean boolean0 = site0.equals(site1);
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(boolean0);
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.setRetryTimes(0);
      Site site2 = site1.setCycleRetryTimes((-568));
      Site site3 = site2.setAcceptStatCode((Set<Integer>) null);
      site3.setDisableCookieManagement(false);
      Site site4 = site2.setRetrySleepTime((-568));
      site4.setDomain("d,T");
      Site.me();
      Site site5 = site2.setSleepTime((-517));
      site2.setAcceptStatCode((Set<Integer>) null);
      Site site6 = site4.setUseGzip(false);
      Site site7 = site6.setDisableCookieManagement(false);
      site7.getUserAgent();
      Site site8 = site7.setUserAgent((String) null);
      site7.getRetryTimes();
      Site site9 = site5.setAcceptStatCode((Set<Integer>) null);
      site2.hashCode();
      site9.setDisableCookieManagement(false);
      site5.equals(site7);
      site8.getCharset();
      site7.getRetryTimes();
      site4.setCharset((String) null);
      site3.getCookies();
      assertEquals((-517), site3.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      Site site2 = site1.setCharset("btRL8U3sAXoK.pA*>");
      site2.hashCode();
      site0.toTask();
      site0.addCookie(", retryTimes=", ", retryTimes=", ", retryTimes=");
      Site site3 = site0.setCharset("btRL8U3sAXoK.pA*>");
      site3.equals(site1);
      Site site4 = site0.setUseGzip(false);
      site4.getCycleRetryTimes();
      site3.hashCode();
      assertFalse(site3.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site1.setDomain("#.22");
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      Site site2 = site1.setCharset("btRL8U3sAXoK.pA*>");
      site2.setDomain("btRL8U3sAXoK.pA*>");
      site0.toTask();
      site0.setUserAgent("btRL8U3sAXoK.pA*>");
      Site site3 = site0.setCharset("btRL8U3sAXoK.pA*>");
      Site site4 = site3.setDomain("btRL8U3sAXoK.pA*>");
      site4.setDisableCookieManagement(true);
      boolean boolean0 = site3.equals(site1);
      assertFalse(boolean0);
      
      site0.hashCode();
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Site site0 = new Site();
      site0.setDomain("+yq-kl");
      Site site1 = new Site();
      site1.setAcceptStatCode((Set<Integer>) null);
      boolean boolean0 = site1.equals(site0);
      assertEquals(1000, site1.getRetrySleepTime());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(5000, site1.getSleepTime());
      assertFalse(boolean0);
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = new Site();
      assertTrue(site1.equals((Object)site0));
      
      site1.setAcceptStatCode((Set<Integer>) null);
      boolean boolean0 = site1.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      Site site2 = site1.setAcceptStatCode((Set<Integer>) null);
      Site site3 = site0.setDisableCookieManagement(true);
      site3.setAcceptStatCode((Set<Integer>) null);
      boolean boolean0 = site3.equals(site2);
      assertTrue(site0.isDisableCookieManagement());
      assertFalse(site2.isDisableCookieManagement());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      Site site2 = site0.setUserAgent("iy:sm");
      Site site3 = site1.setUserAgent("iy:sm");
      site3.toString();
      site1.equals(site0);
      site0.setRetrySleepTime((-150));
      site1.hashCode();
      site2.getRetrySleepTime();
      site0.getCookies();
      assertEquals((-150), site0.getRetrySleepTime());
      
      site1.getHeaders();
      assertTrue(site1.equals((Object)site2));
  }
}
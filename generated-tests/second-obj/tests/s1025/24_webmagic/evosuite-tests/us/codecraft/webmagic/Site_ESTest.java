/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:59:02 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
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
      site0.toTask();
      site0.getHeaders();
      assertEquals(0, site0.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.addCookie("pfN", "pfN");
      int int0 = site1.getSleepTime();
      assertTrue(site1.isUseGzip());
      assertEquals(5000, int0);
      assertEquals(5000, site1.getTimeOut());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Site site0 = new Site();
      site0.toTask();
      site0.setSleepTime((-459));
      assertEquals((-459), site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setDomain("WdjHs");
      site1.hashCode();
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Site site0 = new Site();
      Set<Integer> set0 = site0.getAcceptStatCode();
      Site site1 = site0.setAcceptStatCode(set0);
      assertEquals(5000, site1.getSleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
      assertEquals(0, site1.getCycleRetryTimes());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Site site0 = new Site();
      boolean boolean0 = site0.isUseGzip();
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Site site0 = Site.me();
      boolean boolean0 = site0.equals(site0);
      assertTrue(boolean0);
      
      Site site1 = site0.setUseGzip(true);
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(0, site1.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Site site0 = Site.me();
      Object object0 = new Object();
      boolean boolean0 = site0.equals(object0);
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Site site0 = Site.me();
      site0.getUserAgent();
      boolean boolean0 = site0.equals((Object) null);
      assertEquals(1000, site0.getRetrySleepTime());
      assertFalse(boolean0);
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.addCookie("uVuKqJG>uO^NdN;", "uVuKqJG>uO^NdN;", "uVuKqJG>uO^NdN;");
      site1.addCookie("uVuKqJG>uO^NdN;", "uVuKqJG>uO^NdN;", "uVuKqJG>uO^NdN;");
      site0.setCycleRetryTimes(590);
      assertEquals(590, site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Site site0 = new Site();
      site0.setUserAgent("");
      int int0 = site0.getRetrySleepTime();
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(1000, int0);
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
      Site site0 = new Site();
      site0.getCycleRetryTimes();
      assertEquals(5000, site0.getTimeOut());
      
      site0.setTimeOut(0);
      assertEquals(5000, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Site site0 = Site.me();
      site0.setUserAgent("");
      site0.hashCode();
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Site site0 = new Site();
      site0.hashCode();
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Site site0 = new Site();
      site0.getCycleRetryTimes();
      Site site1 = site0.setCycleRetryTimes(0);
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site1.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Site site0 = new Site();
      site0.getAllCookies();
      int int0 = site0.getRetryTimes();
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(0, int0);
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getSleepTime());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Site site0 = new Site();
      String string0 = site0.toString();
      assertEquals("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}", string0);
      
      Site site1 = site0.setCharset("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[200], headers={}}");
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(1000, site1.getRetrySleepTime());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Site site0 = new Site();
      boolean boolean0 = site0.isDisableCookieManagement();
      assertTrue(site0.isUseGzip());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(boolean0);
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Site site0 = new Site();
      site0.getAllCookies();
      site0.getDomain();
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Site site0 = new Site();
      site0.setCharset("[]");
      site0.hashCode();
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertEquals(0, site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Site site0 = Site.me();
      site0.getCookies();
      site0.getCharset();
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Site site0 = Site.me();
      int int0 = site0.getSleepTime();
      int int1 = site0.getTimeOut();
      assertTrue(int1 == int0);
      assertEquals(0, site0.getRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
      assertEquals(1000, site0.getRetrySleepTime());
      assertTrue(site0.isUseGzip());
      assertEquals(5000, int1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Site site0 = Site.me();
      int int0 = site0.getSleepTime();
      assertEquals(5000, int0);
      
      int int1 = site0.getCycleRetryTimes();
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(5000, site0.getTimeOut());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(0, int1);
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Site site0 = new Site();
      site0.setAcceptStatCode((Set<Integer>) null);
      assertEquals(5000, site0.getSleepTime());
      
      site0.setSleepTime((-1));
      site0.hashCode();
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getTimeOut());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertTrue(boolean0);
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = Site.me();
      Site site2 = site0.setRetrySleepTime((-1952986314));
      site2.setCycleRetryTimes((-1952986314));
      boolean boolean0 = site0.equals(site1);
      assertEquals((-1952986314), site0.getCycleRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Site site0 = Site.me();
      site0.setSleepTime((-1968526644));
      Site site1 = new Site();
      boolean boolean0 = site1.equals(site0);
      assertEquals((-1968526644), site0.getSleepTime());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Site site0 = new Site();
      site0.setRetryTimes(1382);
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertEquals(1382, site0.getRetryTimes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Site site0 = new Site();
      site0.setUserAgent("uuKJG>uOXdN");
      Site site1 = new Site();
      boolean boolean0 = site1.equals(site0);
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
      assertFalse(boolean0);
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Site site0 = new Site();
      Site site1 = site0.addHeader((String) null, (String) null);
      Site site2 = new Site();
      boolean boolean0 = site1.equals(site2);
      assertFalse(boolean0);
      
      site0.getAllCookies();
      assertEquals(5000, site0.getSleepTime());
      assertEquals(0, site0.getRetryTimes());
      assertTrue(site0.isUseGzip());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertFalse(site0.isDisableCookieManagement());
      assertEquals(0, site0.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Site site0 = Site.me();
      site0.setCharset("uVuKqJG>uO^NdN;");
      Site site1 = new Site();
      Site site2 = site1.addCookie("uVuKqJG>uO^NdN;", "uVuKqJG>uO^NdN;", "uVuKqJG>uO^NdN;");
      boolean boolean0 = site0.equals(site2);
      assertFalse(boolean0);
      
      int int0 = site1.getCycleRetryTimes();
      assertEquals(5000, site1.getTimeOut());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, int0);
      assertTrue(site1.isUseGzip());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(0, site1.getRetryTimes());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Site site0 = new Site();
      site0.addCookie(".Xp3Qco", ".Xp3Qco");
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertFalse(boolean0);
      
      site1.getAcceptStatCode();
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, site1.getRetryTimes());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getTimeOut());
      assertTrue(site1.isUseGzip());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(0, site1.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Site site0 = new Site();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      site0.setAcceptStatCode(linkedHashSet0);
      String string0 = site0.toString();
      assertEquals("Site{domain='null', userAgent='null', cookies={}, charset='null', sleepTime=5000, retryTimes=0, cycleRetryTimes=0, timeOut=5000, acceptStatCode=[], headers={}}", string0);
      
      Site site1 = new Site();
      boolean boolean0 = site0.equals(site1);
      assertEquals(1000, site1.getRetrySleepTime());
      assertFalse(boolean0);
      assertTrue(site1.isUseGzip());
      assertFalse(site1.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Site site0 = new Site();
      assertEquals(5000, site0.getTimeOut());
      
      Site site1 = new Site();
      site0.setTimeOut(1);
      site1.equals(site0);
      site0.setUseGzip(false);
      assertFalse(site0.equals((Object)site1));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Site site0 = new Site();
      site0.setDomain(", sleepTime=");
      Site site1 = new Site();
      site1.equals(site0);
      site1.addCookie(", sleepTime=", ", sleepTime=");
      site1.setCycleRetryTimes(438);
      assertEquals(438, site1.getCycleRetryTimes());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Site site0 = new Site();
      site0.setRetrySleepTime((-1952986314));
      Site site1 = Site.me();
      site1.setCharset("3");
      boolean boolean0 = site0.equals(site1);
      assertEquals((-1952986314), site0.getRetrySleepTime());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Site site0 = Site.me();
      site0.setUserAgent("uVuKqJG>uO^NdN;");
      Site site1 = new Site();
      Site site2 = site1.addCookie("uVuKqJG>uO^NdN;", "uVuKqJG>uO^NdN;", "uVuKqJG>uO^NdN;");
      boolean boolean0 = site0.equals(site2);
      assertFalse(boolean0);
      
      int int0 = site1.getCycleRetryTimes();
      assertEquals(5000, site1.getTimeOut());
      assertFalse(site1.isDisableCookieManagement());
      assertEquals(1000, site1.getRetrySleepTime());
      assertEquals(5000, site1.getSleepTime());
      assertEquals(0, int0);
      assertEquals(0, site1.getRetryTimes());
      assertTrue(site1.isUseGzip());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Site site0 = new Site();
      site0.setDomain("W,");
      Site site1 = site0.setCharset((String) null);
      Site site2 = new Site();
      boolean boolean0 = site1.equals(site2);
      assertFalse(boolean0);
      
      site0.getAllCookies();
      assertEquals(0, site0.getRetryTimes());
      assertEquals(5000, site0.getSleepTime());
      assertEquals(1000, site0.getRetrySleepTime());
      assertEquals(5000, site0.getTimeOut());
      assertTrue(site0.isUseGzip());
      assertEquals(0, site0.getCycleRetryTimes());
      assertFalse(site0.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Site site0 = Site.me();
      Site site1 = site0.setDomain("uVuKqJG>uO^2NdN;");
      Site site2 = new Site();
      Site site3 = site2.addCookie("uVuKqJG>uO^2NdN;", "uVuKqJG>uO^2NdN;", "uVuKqJG>uO^2NdN;");
      assertFalse(site3.equals((Object)site1));
      
      site3.setDomain("uVuKqJG>uO^2NdN;");
      site0.equals(site3);
      assertTrue(site3.equals((Object)site1));
      
      site0.toTask();
      site1.getCharset();
      assertEquals(5000, site0.getTimeOut());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Site site0 = new Site();
      HashMap<String, Map<String, String>> hashMap0 = new HashMap<String, Map<String, String>>();
      Site site1 = site0.setCharset("uVuKJ>uO^NdN");
      site1.toTask();
      Site site2 = site0.setUserAgent("Wd0mvkjG5WTz");
      Site site3 = new Site();
      site3.addCookie("Wd0mvkjG5WTz", "Wd0mvkjG5WTz", "Wd0mvkjG5WTz");
      site3.setCharset("uVuKJ>uO^NdN");
      boolean boolean0 = site0.equals(site3);
      assertFalse(boolean0);
      
      site2.getAllCookies();
      assertEquals(5000, site2.getSleepTime());
      assertEquals(5000, site2.getTimeOut());
      assertTrue(site2.isUseGzip());
      assertEquals(0, site2.getCycleRetryTimes());
      assertEquals(1000, site2.getRetrySleepTime());
      assertEquals(0, site2.getRetryTimes());
      assertFalse(site2.isDisableCookieManagement());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Site site0 = new Site();
      HashMap<String, Map<String, String>> hashMap0 = new HashMap<String, Map<String, String>>();
      site0.getCycleRetryTimes();
      Integer integer0 = new Integer(0);
      Site site1 = new Site();
      Site site2 = site1.setUserAgent("Wd0mvkj5WTz");
      assertFalse(site2.equals((Object)site0));
      
      Site site3 = site0.setUserAgent("Wd0mvkj5WTz");
      site2.equals(site0);
      site3.toTask();
      site3.setRetryTimes(0);
      site2.setUseGzip(true);
      site0.getCharset();
      assertTrue(site0.equals((Object)site1));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Site site0 = new Site();
      site0.getDomain();
      site0.getCycleRetryTimes();
      Site site1 = new Site();
      Site site2 = site1.setUserAgent((String) null);
      assertTrue(site2.equals((Object)site0));
      
      site2.setAcceptStatCode((Set<Integer>) null);
      boolean boolean0 = site2.equals(site0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Site site0 = Site.me();
      Site site1 = site0.setAcceptStatCode((Set<Integer>) null);
      site0.getDomain();
      site0.getCycleRetryTimes();
      Integer integer1 = new Integer(0);
      Site site2 = new Site();
      Site site3 = site2.setUserAgent((String) null);
      assertFalse(site3.equals((Object)site1));
      
      site3.setAcceptStatCode((Set<Integer>) null);
      site3.equals(site0);
      site2.getCharset();
      assertTrue(site2.equals((Object)site0));
  }
}
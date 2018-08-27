/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 14:45:10 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.selector.AndSelector;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Json;
import us.codecraft.webmagic.selector.Selectable;
import us.codecraft.webmagic.selector.Selector;
import us.codecraft.webmagic.selector.SmartContentSelector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Page_ESTest extends Page_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Page page0 = Page.fail();
      String string0 = "";
      Page page1 = page0.setRawText("");
      // Undeclared exception!
      try { 
        page1.getHtml();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jsoup/nodes/Node
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Page page0 = new Page();
      String string0 = "^";
      page0.toString();
      page0.setRawText("^");
      AndSelector andSelector0 = null;
      try {
        andSelector0 = new AndSelector((Selector[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.selector.AndSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Page page0 = Page.fail();
      page0.getJson();
      List<String> list0 = null;
      Request request0 = new Request(".w");
      request0.setCharset("");
      page0.setRequest(request0);
      // Undeclared exception!
      try { 
        page0.addTargetRequests((List<String>) null, 1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Page page0 = Page.fail();
      Json json0 = page0.getJson();
      assertNotNull(json0);
      
      page0.getCharset();
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Page page0 = new Page();
      Page page1 = page0.setRawText("wy5];f{1/=FB|_H(0*0");
      page1.setSkip(false);
      page0.setStatusCode(0);
      page1.setSkip(true);
      page1.setCharset("wy5];f{1/=FB|_H(0*0");
      page0.getHeaders();
      page1.setHeaders((Map<String, List<String>>) null);
      SmartContentSelector smartContentSelector0 = new SmartContentSelector();
      // Undeclared exception!
      try { 
        smartContentSelector0.selectList("wy5];f{1/=FB|_H(0*0");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.selector.SmartContentSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Page page0 = Page.fail();
      Page page1 = page0.setSkip(false);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)23;
      byteArray0[1] = (byte)0;
      page0.setCharset("\n");
      byteArray0[2] = (byte) (-112);
      byteArray0[3] = (byte)125;
      byteArray0[4] = (byte) (-108);
      page1.setBytes(byteArray0);
      assertEquals(200, page1.getStatusCode());
      assertFalse(page1.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Page page0 = Page.fail();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      page0.addTargetRequests((List<String>) linkedList0, 4395L);
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Page page0 = new Page();
      page0.getStatusCode();
      page0.setRawText("");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.clone();
      linkedList0.clone();
      page0.addTargetRequests((List<String>) linkedList0, (long) 200);
      page0.setStatusCode(200);
      // Undeclared exception!
      try { 
        page0.getHtml();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jsoup/nodes/Node
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Page page0 = new Page();
      Page page1 = page0.setRawText("");
      Page page2 = page1.setSkip(false);
      Request request0 = new Request((String) null);
      Request request1 = request0.putExtra("3", "_cycle_tried_times");
      Request request2 = request1.setCharset((String) null);
      Request request3 = request2.addHeader((String) null, (String) null);
      request2.toString();
      Object object0 = new Object();
      request1.setCharset("3");
      request2.setBinaryContent(false);
      page0.putField("tL=H-SySu", object0);
      page2.setRequest(request3);
      page2.toString();
      page1.isDownloadSuccess();
      // Undeclared exception!
      try { 
        page1.getHtml();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jsoup/nodes/Node
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Page page0 = new Page();
      assertTrue(page0.isDownloadSuccess());
      
      page0.setDownloadSuccess(false);
      Page page1 = page0.setSkip(false);
      byte[] byteArray0 = new byte[1];
      page0.addTargetRequest((Request) null);
      byteArray0[0] = (byte)41;
      page1.setBytes(byteArray0);
      page1.setCharset("p|T}w");
      int int0 = page1.getStatusCode();
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Page page0 = Page.fail();
      Page page1 = page0.setRawText(", downloadSuccess=");
      Page page2 = page1.setSkip(true);
      page2.getUrl();
      assertEquals(200, page2.getStatusCode());
      assertFalse(page2.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Page page0 = Page.fail();
      assertFalse(page0.isDownloadSuccess());
      
      page0.setDownloadSuccess(true);
      page0.getBytes();
      Request request0 = new Request(", html=");
      page0.setRequest(request0);
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Page page0 = new Page();
      page0.setHtml((Html) null);
      int int0 = 407;
      page0.toString();
      page0.setStatusCode(407);
      page0.getTargetRequests();
      // Undeclared exception!
      try { 
        page0.addTargetRequest(", headers=");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Page page0 = Page.fail();
      page0.getJson();
      Selector[] selectorArray0 = new Selector[0];
      AndSelector andSelector0 = new AndSelector(selectorArray0);
      andSelector0.selectList(".w");
      andSelector0.select(".w");
      andSelector0.select(", charset='");
      andSelector0.select("");
      List<String> list0 = andSelector0.selectList("");
      page0.addTargetRequests(list0);
      Json json0 = page0.getJson();
      json0.all();
      page0.getCharset();
      page0.setUrl(json0);
      page0.getHeaders();
      page0.setHeaders((Map<String, List<String>>) null);
      page0.getStatusCode();
      page0.getHeaders();
      page0.getResultItems();
      page0.putField(".w", "g8X*.]18b");
      page0.setStatusCode(0);
      // Undeclared exception!
      try { 
        page0.getHtml();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jsoup/nodes/Node
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }
}
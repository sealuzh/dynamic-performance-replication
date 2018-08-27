/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 09:45:06 GMT 2018
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
import us.codecraft.webmagic.selector.JsonPathSelector;
import us.codecraft.webmagic.selector.OrSelector;
import us.codecraft.webmagic.selector.PlainText;
import us.codecraft.webmagic.selector.RegexSelector;
import us.codecraft.webmagic.selector.ReplaceSelector;
import us.codecraft.webmagic.selector.Selectable;
import us.codecraft.webmagic.selector.Selector;
import us.codecraft.webmagic.selector.SmartContentSelector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Page_ESTest extends Page_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Page page0 = Page.fail();
      page0.getUrl();
      Page page1 = page0.setSkip(false);
      Page page2 = Page.fail();
      page0.setCharset("+7aBZE8{");
      page2.setStatusCode(0);
      Request request0 = new Request("P0O");
      Request request1 = request0.addHeader("+7aBZE8{", "v'0Avs s^Hf9Nr/R+");
      request1.addHeader(", targetRequests=", "RF]RTB<Gw@50,Q");
      Request request2 = request1.setUrl(", method='");
      Request request3 = request2.setBinaryContent(false);
      page1.addTargetRequest(request3);
      // Undeclared exception!
      try { 
        page1.addTargetRequest((String) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Page page0 = Page.fail();
      Page page1 = page0.setSkip(false);
      page1.putField("", "");
      page1.getUrl();
      Page page2 = page0.setRawText(", resultItems=");
      page2.getRequest();
      page2.setRequest((Request) null);
      page0.getHeaders();
      page0.setDownloadSuccess(false);
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Page page0 = Page.fail();
      Page page1 = page0.setSkip(false);
      String string0 = ")e(D.{l1rfSF|u!ge";
      page0.setSkip(false);
      Page page2 = page1.setRawText(")e(D.{l1rfSF|u!ge");
      Page page3 = page2.setSkip(false);
      Request request0 = new Request();
      page2.setRawText("");
      request0.addHeader(")e(D.{l1rfSF|u!ge", (String) null);
      long long0 = 0L;
      byte[] byteArray0 = new byte[0];
      page2.setBytes(byteArray0);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.clear();
      page1.setHeaders(hashMap0);
      // Undeclared exception!
      try { 
        page3.getHtml();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jsoup/nodes/Node
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Page page0 = Page.fail();
      Page page1 = page0.setSkip(true);
      page1.getBytes();
      page0.getRawText();
      page1.getHeaders();
      int int0 = 1023;
      RegexSelector regexSelector0 = null;
      try {
        regexSelector0 = new RegexSelector((String) null, 1023);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.selector.RegexSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Page page0 = new Page();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string0 = "63.=+";
      hashMap0.remove((Object) "63.=+");
      page0.setHeaders(hashMap0);
      page0.getStatusCode();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-32);
      byteArray0[3] = (byte)5;
      byteArray0[4] = (byte)44;
      page0.setBytes(byteArray0);
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
  public void test05()  throws Throwable  {
      Page page0 = Page.fail();
      Page page1 = page0.setSkip(true);
      Page page2 = page1.setRawText(", json=");
      Request request0 = new Request();
      request0.getExtras();
      Request request1 = request0.setExtras((Map<String, Object>) null);
      request0.addHeader(", bytes=", "n:ZY&r@\"3s.rVZn");
      request1.addCookie((String) null, (String) null);
      Request request2 = request1.setCharset(";J.]");
      request2.addHeader(", json=", "n:ZY&r@\"3s.rVZn");
      request1.putExtra("n:ZY&r@\"3s.rVZn", request2);
      page2.setRequest(request2);
      page1.getResultItems();
      int int0 = 0;
      RegexSelector regexSelector0 = null;
      try {
        regexSelector0 = new RegexSelector("h_ZLz fyZ8/#62G", 0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.selector.RegexSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Page page0 = Page.fail();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      page0.addTargetRequests((List<String>) linkedList0);
      page0.getUrl();
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Page page0 = Page.fail();
      page0.toString();
      Page page1 = page0.setRawText("caj");
      page1.getBytes();
      page1.setBytes((byte[]) null);
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
  public void test08()  throws Throwable  {
      Page page0 = new Page();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      Page page1 = page0.setRawText(", url=");
      page1.setHeaders(hashMap0);
      assertEquals(200, page1.getStatusCode());
      
      page0.setStatusCode(0);
      Page page2 = page0.setRawText((String) null);
      Page page3 = new Page();
      page3.getTargetRequests();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      page3.addTargetRequests((List<String>) linkedList0);
      page0.setCharset(", json=");
      page2.getResultItems();
      PlainText plainText0 = PlainText.create("!");
      page1.setUrl(plainText0);
      assertEquals(0, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Page page0 = Page.fail();
      page0.getTargetRequests();
      Request request0 = new Request("Page{request=");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Request request1 = request0.setExtras(hashMap0);
      request1.setBinaryContent(true);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      page0.addTargetRequests((List<String>) linkedList0, (-2295L));
      Request request2 = request1.putExtra("YL<tOv~8%pqgq&M4=: ", "Page{request=");
      hashMap0.put("_cycle_tried_times", linkedList0);
      request0.setUrl("b43h:/B>yXh9]");
      request2.putExtra("N+<l", hashMap0);
      request2.putExtra("(?is)<!DOCTYPE.*?>", "Page{request=");
      page0.setRequest(request2);
      page0.setStatusCode((-1236));
      page0.setRawText((String) null);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-92);
      byteArray0[2] = (byte)62;
      page0.setBytes(byteArray0);
      assertEquals((-1236), page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Page page0 = new Page();
      page0.isDownloadSuccess();
      page0.getJson();
      byte[] byteArray0 = new byte[0];
      page0.setBytes(byteArray0);
      Page page1 = page0.setRawText(">[l38ey4_|^,k&/");
      Json json0 = page1.getJson();
      assertNotNull(json0);
      
      page1.getHeaders();
      page1.setDownloadSuccess(true);
      assertEquals(200, page1.getStatusCode());
      assertTrue(page1.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Page page0 = Page.fail();
      Object object0 = new Object();
      page0.putField("c'0SK", object0);
      Request request0 = new Request();
      page0.getCharset();
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Page page0 = Page.fail();
      page0.setHtml((Html) null);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("W$6Zf0:Onp+g:)v");
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
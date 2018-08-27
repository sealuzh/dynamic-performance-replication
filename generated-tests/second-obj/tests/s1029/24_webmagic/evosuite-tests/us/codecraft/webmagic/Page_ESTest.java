/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:23:14 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Json;
import us.codecraft.webmagic.selector.Selectable;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Page_ESTest extends Page_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Page page0 = Page.fail();
      Json json0 = page0.getJson();
      assertNotNull(json0);
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Page page0 = new Page();
      page0.getHeaders();
      assertEquals(200, page0.getStatusCode());
      assertTrue(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Page page0 = Page.fail();
      page0.setSkip(true);
      page0.getTargetRequests();
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Page page0 = Page.fail();
      page0.putField("", "");
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Page page0 = Page.fail();
      String string0 = page0.toString();
      assertEquals("Page{request=null, resultItems=ResultItems{fields={}, request=null, skip=false}, html=null, json=null, rawText='null', url=null, headers=null, statusCode=200, downloadSuccess=false, targetRequests=[], charset='null', bytes=null}", string0);
      
      page0.setRawText("Page{request=null, resultItems=ResultItems{fields={}, request=null, skip=false}, html=null, json=null, rawText='null', url=null, headers=null, statusCode=200, downloadSuccess=false, targetRequests=[], charset='null', bytes=null}");
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Page page0 = Page.fail();
      Request request0 = new Request();
      page0.setRequest(request0);
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Page page0 = new Page();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      page0.setHeaders(hashMap0);
      assertTrue(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Page page0 = new Page();
      page0.getStatusCode();
      page0.setStatusCode(200);
      assertTrue(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Page page0 = Page.fail();
      boolean boolean0 = page0.isDownloadSuccess();
      assertFalse(boolean0);
      
      page0.getResultItems();
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Page page0 = Page.fail();
      page0.getRequest();
      page0.addTargetRequest((Request) null);
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Page page0 = Page.fail();
      page0.getRawText();
      page0.setCharset((String) null);
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Page page0 = Page.fail();
      page0.setUrl((Selectable) null);
      page0.getTargetRequests();
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Page page0 = new Page();
      page0.toString();
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
  public void test13()  throws Throwable  {
      Page page0 = Page.fail();
      byte[] byteArray0 = new byte[1];
      page0.setBytes(byteArray0);
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Page page0 = new Page();
      page0.getRawText();
      page0.getUrl();
      assertTrue(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Page page0 = Page.fail();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      page0.addTargetRequests((List<String>) linkedList0, 0L);
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Page page0 = new Page();
      page0.getBytes();
      assertEquals(200, page0.getStatusCode());
      assertTrue(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Page page0 = new Page();
      page0.getRequest();
      page0.getCharset();
      assertTrue(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Page page0 = Page.fail();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      page0.addTargetRequests((List<String>) linkedList0);
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Page page0 = Page.fail();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("NMuPz");
      // Undeclared exception!
      try { 
        page0.addTargetRequests((List<String>) linkedList0, 1L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Page page0 = new Page();
      page0.getJson();
      Json json0 = page0.getJson();
      assertTrue(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
      assertNotNull(json0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Page page0 = Page.fail();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      // Undeclared exception!
      try { 
        page0.addTargetRequests((List<String>) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Page page0 = new Page();
      page0.setHtml((Html) null);
      assertEquals(200, page0.getStatusCode());
      assertTrue(page0.isDownloadSuccess());
  }
}

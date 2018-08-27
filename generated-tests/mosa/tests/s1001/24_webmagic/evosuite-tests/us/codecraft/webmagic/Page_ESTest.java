/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:07:03 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
      page0.getHeaders();
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Page page0 = Page.fail();
      Page page1 = page0.setSkip(false);
      assertFalse(page1.isDownloadSuccess());
      assertEquals(200, page1.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Page page0 = new Page();
      page0.getCharset();
      assertEquals(200, page0.getStatusCode());
      assertTrue(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Page page0 = Page.fail();
      page0.getBytes();
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Page page0 = Page.fail();
      boolean boolean0 = page0.isDownloadSuccess();
      assertEquals(200, page0.getStatusCode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Page page0 = new Page();
      Page page1 = page0.setRawText("WFiFZ6f)4");
      assertEquals(200, page1.getStatusCode());
      assertTrue(page1.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Page page0 = Page.fail();
      page0.setRequest((Request) null);
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Page page0 = Page.fail();
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
      Page page0 = Page.fail();
      page0.putField("", "");
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Page page0 = new Page();
      String string0 = page0.toString();
      assertEquals("Page{request=null, resultItems=ResultItems{fields={}, request=null, skip=false}, html=null, json=null, rawText='null', url=null, headers=null, statusCode=200, downloadSuccess=true, targetRequests=[], charset='null', bytes=null}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Page page0 = new Page();
      page0.setHtml((Html) null);
      assertEquals(200, page0.getStatusCode());
      assertTrue(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Page page0 = Page.fail();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      page0.addTargetRequests((List<String>) linkedList0);
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Page page0 = Page.fail();
      Json json0 = page0.getJson();
      assertNotNull(json0);
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Page page0 = new Page();
      page0.setStatusCode((-615));
      assertEquals((-615), page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Page page0 = Page.fail();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      page0.addTargetRequests((List<String>) linkedList0, 0L);
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Page page0 = Page.fail();
      page0.getResultItems();
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Page page0 = new Page();
      page0.getRawText();
      assertEquals(200, page0.getStatusCode());
      assertTrue(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Page page0 = new Page();
      page0.setUrl((Selectable) null);
      assertTrue(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Page page0 = Page.fail();
      byte[] byteArray0 = new byte[1];
      page0.setBytes(byteArray0);
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Page page0 = new Page();
      page0.getUrl();
      assertTrue(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Page page0 = Page.fail();
      page0.setCharset("javascript:");
      assertFalse(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Page page0 = new Page();
      int int0 = page0.getStatusCode();
      assertEquals(200, int0);
      assertTrue(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Page page0 = new Page();
      page0.getHeaders();
      page0.setHeaders((Map<String, List<String>>) null);
      assertTrue(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Page page0 = Page.fail();
      page0.getRequest();
      page0.addTargetRequest((Request) null);
      assertEquals(200, page0.getStatusCode());
      assertFalse(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Page page0 = new Page();
      page0.getJson();
      Json json0 = page0.getJson();
      assertNotNull(json0);
      assertEquals(200, page0.getStatusCode());
      assertTrue(page0.isDownloadSuccess());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Page page0 = new Page();
      page0.getTargetRequests();
      assertTrue(page0.isDownloadSuccess());
      assertEquals(200, page0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Page page0 = Page.fail();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      // Undeclared exception!
      try { 
        page0.addTargetRequests((List<String>) linkedList0, (-1L));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Page page0 = Page.fail();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
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
}
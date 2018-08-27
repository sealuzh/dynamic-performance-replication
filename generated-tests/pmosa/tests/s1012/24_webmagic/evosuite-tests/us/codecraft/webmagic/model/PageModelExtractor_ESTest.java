/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 23:33:55 GMT 2018
 */

package us.codecraft.webmagic.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.FieldExtractor;
import us.codecraft.webmagic.model.PageModelExtractor;
import us.codecraft.webmagic.model.samples.DianpingFtlDataScanner;
import us.codecraft.webmagic.model.samples.OschinaAnswer;
import us.codecraft.webmagic.selector.JsonPathSelector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PageModelExtractor_ESTest extends PageModelExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Method> class0 = Method.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Page page0 = Page.fail();
      page0.getHeaders();
      page0.setHeaders((Map<String, List<String>>) null);
      page0.setRawText("");
      // Undeclared exception!
      try { 
        pageModelExtractor0.process(page0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      pageModelExtractor0.getHelpUrlRegionSelector();
      pageModelExtractor0.getHelpUrlRegionSelector();
      pageModelExtractor0.getTargetUrlPatterns();
      Class<Integer> class0 = Integer.class;
      PageModelExtractor pageModelExtractor1 = PageModelExtractor.create(class0);
      assertNotSame(pageModelExtractor1, pageModelExtractor0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Page page0 = Page.fail();
      pageModelExtractor0.process(page0);
      Class<DianpingFtlDataScanner> class0 = DianpingFtlDataScanner.class;
      // Undeclared exception!
      try { 
        PageModelExtractor.create(class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.selector.RegexSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Page page0 = new Page();
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Object object0 = pageModelExtractor0.process(page0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Page page0 = new Page();
      Class<OschinaAnswer> class0 = OschinaAnswer.class;
      // Undeclared exception!
      try { 
        PageModelExtractor.create(class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jsoup/nodes/Element
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Class<Method> class0 = Method.class;
      PageModelExtractor pageModelExtractor1 = PageModelExtractor.create(class0);
      Class<Object> class1 = Object.class;
      PageModelExtractor pageModelExtractor2 = PageModelExtractor.create(class1);
      pageModelExtractor0.getHelpUrlPatterns();
      pageModelExtractor0.getTargetUrlPatterns();
      PageModelExtractor.create(class0);
      pageModelExtractor0.process((Page) null);
      pageModelExtractor0.getHelpUrlRegionSelector();
      PageModelExtractor.create(class0);
      pageModelExtractor0.getTargetUrlRegionSelector();
      pageModelExtractor1.getTargetUrlPatterns();
      pageModelExtractor2.getHelpUrlPatterns();
      // Undeclared exception!
      try { 
        pageModelExtractor2.process((Page) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Class<Integer> class0 = Integer.class;
      PageModelExtractor.create(class0);
      PageModelExtractor.create(class0);
      Class<Pattern> class1 = Pattern.class;
      PageModelExtractor.create(class1);
      pageModelExtractor0.getClazz();
      Page page0 = Page.fail();
      page0.getJson();
      page0.getJson();
      page0.setStatusCode(0);
      Page page1 = page0.setRawText("Vc=< |<6E");
      // Undeclared exception!
      try { 
        page1.addTargetRequest("Vc=< |<6E");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<String> class0 = String.class;
      Field field0 = null;
      // Undeclared exception!
      try { 
        PageModelExtractor.getSetterMethod(class0, (Field) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }
}
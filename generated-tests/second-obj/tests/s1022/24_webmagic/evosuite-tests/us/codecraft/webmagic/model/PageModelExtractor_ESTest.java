/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:56:13 GMT 2018
 */

package us.codecraft.webmagic.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.util.List;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.FieldExtractor;
import us.codecraft.webmagic.model.PageModelExtractor;
import us.codecraft.webmagic.model.samples.DianpingFtlDataScanner;
import us.codecraft.webmagic.model.samples.OschinaAnswer;
import us.codecraft.webmagic.selector.Selector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PageModelExtractor_ESTest extends PageModelExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      List<Pattern> list0 = pageModelExtractor0.getHelpUrlPatterns();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      List<Pattern> list0 = pageModelExtractor0.getTargetUrlPatterns();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      pageModelExtractor0.getTargetUrlRegionSelector();
      Class class0 = pageModelExtractor0.getClazz();
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Page page0 = new Page();
      Object object0 = pageModelExtractor0.process(page0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Selector selector0 = pageModelExtractor0.getHelpUrlRegionSelector();
      assertNull(selector0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<List> class0 = List.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Page page0 = Page.fail();
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
  public void test7()  throws Throwable  {
      Class<String> class0 = String.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      assertNotNull(pageModelExtractor0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
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
  public void test9()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Class<FieldExtractor> class0 = FieldExtractor.class;
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

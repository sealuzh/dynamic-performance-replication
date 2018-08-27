/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:34:53 GMT 2018
 */

package us.codecraft.webmagic.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.PageModelExtractor;
import us.codecraft.webmagic.model.samples.DianpingFtlDataScanner;
import us.codecraft.webmagic.model.samples.OschinaAnswer;
import us.codecraft.webmagic.selector.Selector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PageModelExtractor_ESTest extends PageModelExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Selector selector0 = pageModelExtractor0.getHelpUrlRegionSelector();
      assertNull(selector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Method> class0 = Method.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Page page0 = new Page();
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
  public void test3()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      List<Pattern> list0 = pageModelExtractor0.getTargetUrlPatterns();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Selector selector0 = pageModelExtractor0.getTargetUrlRegionSelector();
      assertNull(selector0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Class class0 = pageModelExtractor0.getClazz();
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Page page0 = new Page();
      Object object0 = pageModelExtractor0.process(page0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      List<Pattern> list0 = pageModelExtractor0.getHelpUrlPatterns();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
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
  public void test9()  throws Throwable  {
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
}

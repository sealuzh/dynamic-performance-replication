/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 05:05:26 GMT 2018
 */

package us.codecraft.webmagic.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.FieldExtractor;
import us.codecraft.webmagic.model.PageModelExtractor;
import us.codecraft.webmagic.model.samples.DianpingFtlDataScanner;
import us.codecraft.webmagic.model.samples.OschinaAnswer;
import us.codecraft.webmagic.selector.OrSelector;
import us.codecraft.webmagic.selector.Selector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PageModelExtractor_ESTest extends PageModelExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      PageModelExtractor.create(class0);
      Class<OschinaAnswer> class1 = OschinaAnswer.class;
      // Undeclared exception!
      try { 
        PageModelExtractor.create(class1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jsoup/nodes/Element
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      PageModelExtractor pageModelExtractor1 = PageModelExtractor.create(class0);
      pageModelExtractor0.getHelpUrlRegionSelector();
      pageModelExtractor0.getTargetUrlPatterns();
      PageModelExtractor pageModelExtractor2 = PageModelExtractor.create(class0);
      assertNotSame(pageModelExtractor2, pageModelExtractor1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<OrSelector> class0 = OrSelector.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Selector selector0 = pageModelExtractor0.getHelpUrlRegionSelector();
      assertNull(selector0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<FieldExtractor> class0 = FieldExtractor.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Selector selector0 = pageModelExtractor0.getTargetUrlRegionSelector();
      assertNull(selector0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Class<Pattern> class0 = Pattern.class;
      PageModelExtractor pageModelExtractor1 = PageModelExtractor.create(class0);
      PageModelExtractor.create(class0);
      pageModelExtractor0.getTargetUrlPatterns();
      pageModelExtractor1.getHelpUrlPatterns();
      Page page0 = new Page();
      pageModelExtractor0.process(page0);
      PageModelExtractor.create(class0);
      PageModelExtractor.create(class0);
      Class<Object> class1 = Object.class;
      PageModelExtractor.create(class1);
      // Undeclared exception!
      try { 
        pageModelExtractor1.process(page0);
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
      Page page0 = new Page();
      Object object0 = pageModelExtractor0.process(page0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<String> class0 = String.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      pageModelExtractor0.getClazz();
      pageModelExtractor0.getTargetUrlRegionSelector();
      Class class1 = pageModelExtractor0.getClazz();
      assertFalse(class1.isArray());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Class<Integer> class0 = Integer.class;
      PageModelExtractor.create(class0);
      Class<DianpingFtlDataScanner> class1 = DianpingFtlDataScanner.class;
      PageModelExtractor.create(class0);
      Class<OschinaAnswer> class2 = OschinaAnswer.class;
      Field field0 = null;
      // Undeclared exception!
      try { 
        PageModelExtractor.getSetterMethod(class2, (Field) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }
}
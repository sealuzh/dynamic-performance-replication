/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 18:51:50 GMT 2018
 */

package us.codecraft.webmagic.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.model.FieldExtractor;
import us.codecraft.webmagic.model.PageModelExtractor;
import us.codecraft.webmagic.model.samples.DianpingFtlDataScanner;
import us.codecraft.webmagic.model.samples.OschinaAnswer;
import us.codecraft.webmagic.selector.Html;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PageModelExtractor_ESTest extends PageModelExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Field> class0 = Field.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Page page0 = Page.fail();
      boolean boolean0 = true;
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
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Page page0 = new Page();
      Page page1 = new Page();
      Object object0 = pageModelExtractor0.process(page0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      pageModelExtractor0.getHelpUrlRegionSelector();
      pageModelExtractor0.getHelpUrlPatterns();
      PageModelExtractor pageModelExtractor1 = PageModelExtractor.create(class0);
      assertFalse(pageModelExtractor1.equals((Object)pageModelExtractor0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      pageModelExtractor0.getTargetUrlRegionSelector();
      Page page0 = new Page();
      page0.getJson();
      pageModelExtractor0.process(page0);
      pageModelExtractor0.getTargetUrlRegionSelector();
      pageModelExtractor0.getHelpUrlPatterns();
      Class<Integer> class0 = Integer.class;
      PageModelExtractor pageModelExtractor1 = PageModelExtractor.create(class0);
      pageModelExtractor0.process(page0);
      Class class1 = pageModelExtractor1.getClazz();
      pageModelExtractor1.getHelpUrlRegionSelector();
      PageModelExtractor.create(class0);
      Class<FieldExtractor> class2 = FieldExtractor.class;
      PageModelExtractor.create(class2);
      PageModelExtractor.create(class0);
      PageModelExtractor.create(class1);
      pageModelExtractor1.getHelpUrlPatterns();
      Class<DianpingFtlDataScanner> class3 = DianpingFtlDataScanner.class;
      // Undeclared exception!
      try { 
        PageModelExtractor.create(class3);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.selector.RegexSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<DianpingFtlDataScanner> class0 = DianpingFtlDataScanner.class;
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
  public void test6()  throws Throwable  {
      Class<Pattern> class0 = Pattern.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      pageModelExtractor0.getTargetUrlPatterns();
      Class<FieldExtractor> class1 = FieldExtractor.class;
      PageModelExtractor pageModelExtractor1 = PageModelExtractor.create(class1);
      Class<Pattern> class2 = Pattern.class;
      Page page0 = Page.fail();
      Page page1 = page0.setSkip(true);
      // Undeclared exception!
      try { 
        pageModelExtractor1.process(page1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }
}

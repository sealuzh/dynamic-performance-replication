/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 13:50:09 GMT 2018
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyIterator;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyIterator_ESTest extends PropertyIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("", "java.math.BigInteger");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.TAIWAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer((String) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("7Kttk h'");
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(">OKyfQTEpA}f8}at", "racA5V^BLj");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) null);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext1);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, nodePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "X%-FSwaG[m3Zk%=juq8>");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, propertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent");
      Locale locale0 = Locale.KOREAN;
      locale0.getExtension('L');
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(propertyPointer0, jXPathBasicBeanInfo0);
      QName qName1 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName1, "Cannot compare pointers that do not belong to the same tree: '", jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, beanPropertyPointer0);
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      propertyIterator0.reset();
      String string0 = "";
      // Undeclared exception!
      try { 
        locale0.getUnicodeLocaleType("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Ill-formed Unicode locale key: 
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("", "java.math.BigInteger");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.TAIWAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer((String) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.getPropertyPointer();
      propertyIterator0.prepareForIndividualProperty("}ao/0&P@~qqP)A\"I");
      boolean boolean0 = propertyIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "PropertyIerator startWith parameter is not a child of the supplied parent");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, propertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(278);
      assertEquals(278, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "X%-FSwaG[m3Zk%=juq8>");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "4F8/w:=~ikNFf\"5Q=", true, propertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "Cannot compare pointers that do not belong to the same tree: '");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("S]FDU<n~Zj83W");
      propertyIterator0.getPropertyPointer();
      propertyIterator0.setPosition(461);
      propertyIterator0.prepareForIndividualProperty("}ao/0&P@~qqP)A\"I");
      assertEquals(461, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("U");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.forLanguageTag("5b97:Ug(Fbl.|L-@kb$");
      Object object0 = new Object();
      Object object1 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object1, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("<<unknown namespace>>");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.TAIWAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("dv(3+Uj.;g");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attribute", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("V|3}");
      propertyIterator0.reset();
      propertyIterator0.setPosition((-1782));
      propertyIterator0.getNodePointer();
      assertEquals((-1782), propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "Cannot compare pointers that do not belong to the same tree: '");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertFalse(boolean0);
      
      propertyIterator0.reset();
      propertyIterator0.reset();
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "Cannot compare pointers that do not belong to the same tree: '");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      JXPathContext.newContext((JXPathContext) null, (Object) null);
      variablePointer0.createPath((JXPathContext) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      QName qName1 = new QName("propertyNames");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName1, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "\" could not be added as content to \"", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("PropertyIerator startWith parameter is not a child of the supplied parent");
      propertyIterator0.getPropertyPointer();
      PropertyIterator propertyIterator1 = new PropertyIterator(nullPointer0, "AFT]i@#80anrRd}|\")+", true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "PropertyIerator startWith parameter is not a child of the supplied parent");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      VariablePointer variablePointer1 = new VariablePointer(qName0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      jXPathBasicBeanInfo0.getPropertyDescriptor("PropertyIerator startWith parameter is not a child of the supplied parent");
      variablePointer1.namespacePointer("<<unknown namespace>>");
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.getPropertyPointer();
      propertyIterator0.reset();
      propertyIterator0.reset();
      Locale.getISOLanguages();
      propertyIterator0.getNodePointer();
      boolean boolean0 = propertyIterator0.setPosition((-2046));
      assertEquals((-2046), propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent");
      Locale locale0 = Locale.KOREAN;
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(propertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, "Cannot compare pointers thkt do not belong to the same tree: '", jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, beanPropertyPointer0);
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      propertyIterator0.reset();
      propertyIterator0.reset();
      Locale.getISOLanguages();
      propertyIterator0.getNodePointer();
      boolean boolean0 = propertyIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.TAIWAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("dv(3+Uj.;g");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attribute", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("V|3}");
      propertyIterator0.reset();
      propertyIterator0.reset();
      Locale.getISOLanguages();
      propertyIterator0.getNodePointer();
      boolean boolean0 = propertyIterator0.setPosition((-2514));
      assertEquals((-2514), propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("[y$N}U^");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.JAPAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("[y$N}U^");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "propertyNames", true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.TAIWAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("=58(U`tty-e#9=1");
      variablePointer0.namespacePointer("dv(3+Uj.;g");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attribute", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      propertyIterator0.reset();
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(1345);
      propertyIterator0.getPropertyPointer();
      assertEquals(1345, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName(";y$NA");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("<<unknown namespace>>");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "index", true, (NodePointer) null);
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.US;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("=58(U`tty-e#9=1");
      variablePointer0.namespacePointer("dv(3+Uj.;g");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attribute", false, (NodePointer) null);
      PropertyIterator propertyIterator1 = new PropertyIterator(beanPointer0, "displayLanguage", true, (NodePointer) null);
      propertyIterator1.prepareForIndividualProperty("immediateNode");
      PropertyIterator propertyIterator2 = new PropertyIterator(beanPointer0, "V|3}", false, (NodePointer) null);
      propertyIterator2.reset();
      Locale.getISOLanguages();
      propertyIterator1.getNodePointer();
      propertyIterator0.setPosition(256);
      boolean boolean0 = propertyIterator1.setPosition((-1322));
      assertEquals((-1322), propertyIterator1.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/apps/resif/data/production/v0.3-20170713/default/software/lang/Java/1.8.0_121/jre/lib/jxpath.properties");
      FileSystemHandling.createFolder(evoSuiteFile0);
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "Cannot compare pointers that do not belong to the same tree: '");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      VariablePointer variablePointer1 = new VariablePointer(qName0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      jXPathBasicBeanInfo0.getPropertyDescriptor("PropertyIerator startWith parameter is not a child of the supplied parent");
      variablePointer1.namespacePointer("<<unknown namespace>>");
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.getPropertyPointer();
      propertyIterator0.getNodePointer();
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      boolean boolean0 = propertyIterator0.setPosition((-1098152955));
      assertEquals((-1098152955), propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "X%-FSwaG[m3Zk%=juq8>");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty((String) null);
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.TAIWAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("=58(U`tty-e#9=1");
      variablePointer0.namespacePointer("");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attribute", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      propertyIterator0.reset();
      propertyIterator0.getNodePointer();
      propertyIterator0.reset();
      propertyIterator0.setPosition(1);
      propertyIterator0.prepareForIndividualProperty("t>Az>BS,;");
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "PropertyIerator startWith parameter is not a child of the supplied parent");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      VariablePointer variablePointer1 = new VariablePointer(qName0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      variablePointer1.namespacePointer("<<unknown namespace>>");
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.reset();
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getPropertyPointer();
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith paramete is not a child of the supplied parent");
      Locale locale0 = Locale.KOREAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "Cannot compare pointers that do not belong to the same tree: '");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      NullPointer nullPointer1 = new NullPointer(qName0, locale1);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      nullPointer0.getPropertyPointer();
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith paramete is not a child of the supplied parent");
      Locale locale0 = Locale.KOREAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "PropertyIerator startWith paramete is not a child of the supplied parent");
      Locale locale1 = Locale.ENGLISH;
      locale0.getDisplayScript(locale1);
      nullPointer0.getPropertyPointer();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0, locale0);
      beanPropertyPointer0.setIndex(85);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "RJ~nZBS|r35, C2:T", false, beanPropertyPointer0);
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.TAIWAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("=58(U`tty-e#96=1");
      variablePointer0.namespacePointer("");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attribute", true, (NodePointer) null);
      PropertyIterator propertyIterator1 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator1.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator1.reset();
      propertyIterator1.getNodePointer();
      propertyIterator1.setPosition(15);
      assertEquals(15, propertyIterator1.getPosition());
      
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      jXPathBasicBeanInfo0.getPropertyDescriptor("");
      Locale locale0 = Locale.TAIWAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("<<unknown namespace>>");
      variablePointer0.namespacePointer("");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.reset();
      propertyIterator0.getNodePointer();
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("actual");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.TAIWAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("actual");
      variablePointer0.namespacePointer("actual");
      jXPathBasicBeanInfo0.toString();
      variablePointer0.namespacePointer("valuePointer");
      variablePointer0.namespacePointer("actual");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("valuePointer");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("actual");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.TAIWAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("actual");
      variablePointer0.namespacePointer("actual");
      jXPathBasicBeanInfo0.toString();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "actual", false, (NodePointer) null);
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getPosition();
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("iH");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.ROOT;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("iH");
      variablePointer0.namespacePointer("iH");
      jXPathBasicBeanInfo0.toString();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attribute", false, (NodePointer) null);
      propertyIterator0.setPosition(2);
      propertyIterator0.getPosition();
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("[$N", "[$N");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.TAIWAN;
      Object object0 = new Object();
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo1, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      QName qName1 = nullPropertyPointer0.getName();
      VariablePointer variablePointer0 = new VariablePointer(qName1);
      QName qName2 = new QName("U$?R}85#*HGUAdfz", "JK*,F1GP( }}i");
      VariablePointer variablePointer1 = new VariablePointer(qName2);
      variablePointer1.namespacePointer((String) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("Xh NXtt]_");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }
}
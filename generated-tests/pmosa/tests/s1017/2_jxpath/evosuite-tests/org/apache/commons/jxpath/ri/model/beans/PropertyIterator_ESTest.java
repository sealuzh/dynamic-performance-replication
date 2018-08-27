/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 13:18:24 GMT 2018
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyIterator;
import org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer;
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
      Locale locale0 = Locale.CHINA;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "_o%]ye2w$eU", true, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("}^YucUB?+bk@Y;l %", "}^YucUB?+bk@Y;l %");
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPointer0.compareTo(nullPropertyPointer0);
      locale0.getDisplayName();
      Locale.getISOCountries();
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, propertyPointer0);
      propertyIterator0.getNodePointer();
      propertyIterator0.reset();
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.getNodePointer();
      locale0.getDisplayVariant();
      propertyIterator0.reset();
      locale0.hasExtensions();
      propertyIterator0.getPosition();
      nullPointer0.clone();
      propertyIterator0.reset();
      propertyIterator0.getNodePointer();
      propertyIterator0.getPropertyPointer();
      propertyIterator0.getNodePointer();
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.getNodePointer();
      propertyIterator0.getPropertyPointer();
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(1034);
      propertyIterator0.setPosition(0);
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(1034);
      propertyIterator0.getPropertyPointer();
      assertEquals(1034, propertyIterator0.getPosition());
      
      propertyIterator0.reset();
      propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, propertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(1497);
      assertEquals(1497, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("; ", "; ");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      Object object0 = beanPropertyPointer0.bean;
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, (Object) null, jXPathBasicBeanInfo0);
      jXPathBasicBeanInfo0.getPropertyDescriptor("<<unknown namespace>>");
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPointer nullPointer0 = new NullPointer(propertyPointer0, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "", false, (NodePointer) null);
      propertyIterator0.getPropertyPointer();
      propertyIterator0.prepareForIndividualProperty("jnyKo");
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getNodePointer();
      propertyIterator0.getPosition();
      propertyIterator0.getPropertyPointer();
      propertyIterator0.setPosition(0);
      boolean boolean0 = propertyIterator0.setPosition((-178));
      assertEquals((-178), propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      propertyPointer0.setIndex((-884));
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      QName qName0 = new QName("");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, propertyPointer0);
      propertyIterator0.setPosition(1);
      propertyIterator0.prepareForIndividualProperty("");
      propertyIterator0.prepareForIndividualProperty("k#a%&;qLDwgmQ");
      propertyIterator0.reset();
      propertyIterator0.reset();
      propertyIterator0.getNodePointer();
      propertyIterator0.prepareForIndividualProperty("k#a%&;qLDwgmQ");
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = null;
      QName qName0 = new QName((String) null, "`|c&~a02i365ka1'");
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      PropertyOwnerPointer propertyOwnerPointer0 = null;
      propertyIterator0.prepareForIndividualProperty((String) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      PropertyIterator propertyIterator1 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator1.getPropertyPointer();
      propertyIterator1.getNodePointer();
      propertyIterator1.setPosition(757);
      propertyIterator1.setPosition((-1426));
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getPropertyPointer();
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) "");
      JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        variablePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $`|c&~a02i365ka1'
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      propertyPointer0.setIndex(1694);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "jh{V<oWYf59j2r@&@I", false, propertyPointer0);
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      QName qName0 = new QName("6-HPnl_7a|(", "6-HPnl_7a|(");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "6-HPnl_7a|(", jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, propertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.UK;
      QName qName0 = new QName("XN&`", "XN&`");
      Class<String> class0 = String.class;
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, true);
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "valuePointer", true, propertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      QName qName0 = new QName("", (String) null);
      Class<String> class0 = String.class;
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, false);
      Locale locale1 = Locale.UK;
      Locale locale2 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale2);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, propertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      QName qName0 = new QName("", (String) null);
      Class<String> class0 = String.class;
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, false);
      jXPathBasicBeanInfo0.toString();
      Locale locale1 = Locale.UK;
      Locale locale2 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale2);
      beanPointer0.getNodeValue();
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("name");
      propertyIterator0.getNodePointer();
      boolean boolean0 = propertyIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.US;
      QName qName0 = new QName("aN6_`");
      Class<String> class0 = String.class;
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, true);
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("nodeValue");
      boolean boolean0 = propertyIterator0.setPosition(860);
      assertEquals(860, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      QName qName0 = new QName("", (String) null);
      Class<String> class0 = String.class;
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, false);
      jXPathBasicBeanInfo0.toString();
      Locale locale1 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale1);
      beanPointer0.getNodeValue();
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("name");
      propertyIterator0.getNodePointer();
      NullPointer nullPointer0 = new NullPointer(propertyPointer0, qName0);
      nullPointer0.getValuePointer();
      boolean boolean0 = propertyIterator0.setPosition(2983);
      assertEquals(2983, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("bytes");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      QName qName0 = new QName("", "immediateValuePointer");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      jXPathBasicBeanInfo0.toString();
      Locale locale1 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale1);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      QName qName1 = nullPropertyPointer0.getName();
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer1 = new BeanPointer(qName1, beanPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      beanPointer0.getNodeValue();
      PropertyPointer propertyPointer0 = beanPointer1.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("9i6?t5xT");
      propertyIterator0.getNodePointer();
      NullPointer nullPointer0 = new NullPointer(propertyPointer0, qName1);
      nullPointer0.getValuePointer();
      PropertyIterator propertyIterator1 = new PropertyIterator(nullPointer0, "Tr\"pFx*u8hhh", false, (NodePointer) null);
      propertyIterator1.setPosition(4275);
      propertyIterator1.reset();
      assertEquals(0, propertyIterator1.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      QName qName0 = new QName("8%Y#&UX8", "8%Y#&UX8");
      Class<String> class0 = String.class;
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, false);
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "baseValue", false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      QName qName0 = new QName("", (String) null);
      Class<String> class0 = String.class;
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, false);
      Locale locale1 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale1);
      beanPointer0.getNodeValue();
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("name");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      nodePointer0.getValuePointer();
      propertyIterator0.getNodePointer();
      boolean boolean0 = propertyIterator0.setPosition(2);
      assertEquals(2, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      QName qName0 = new QName("", (String) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale1 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale1);
      beanPointer0.getNodeValue();
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, propertyPointer0);
      propertyIterator0.getNodePointer();
      propertyIterator0.prepareForIndividualProperty("name");
      propertyIterator0.getNodePointer();
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      nullPointer0.getValuePointer();
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(7);
      propertyIterator0.getPosition();
      propertyIterator0.prepareForIndividualProperty("|~|5y>Pzp");
      assertEquals(7, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      QName qName0 = new QName("", "immediateValuePointer");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      jXPathBasicBeanInfo0.toString();
      Locale locale1 = Locale.UK;
      Class<String> class1 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class1, true);
      Locale locale2 = Locale.UK;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "BeanInfo [class = java.lang.String, atomic, properties = \n    class [B: bytes\n    boolean: empty]", jXPathBasicBeanInfo0, locale0);
      beanPointer0.getNodeValue();
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.printPointerChain();
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, locale0, jXPathBasicBeanInfo1);
      BeanPointer beanPointer2 = new BeanPointer(beanPropertyPointer0, qName0, locale0, jXPathBasicBeanInfo1);
      beanPointer2.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "pTv", false, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      propertyIterator0.getNodePointer();
      NullPointer nullPointer0 = new NullPointer(locale2, "Undefined funtion: ");
      NullPointer nullPointer1 = new NullPointer(locale2, "BeanInfo [class = java.lang.String, atomic, properties = \n    class [B: bytes\n    boolean: empty]");
      nullPointer1.getValuePointer();
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(160);
      int int0 = NodePointer.WHOLE_COLLECTION;
      propertyIterator0.reset();
      int int1 = propertyIterator0.getPosition();
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      QName qName0 = new QName("", "immediateValuePointer");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      jXPathBasicBeanInfo0.toString();
      Locale locale1 = Locale.UK;
      Class<String> class1 = String.class;
      jXPathBasicBeanInfo0.toString();
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class1, true);
      Locale locale2 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "BeanInfo [class = java.lang.String, atomic, properties = \n    class [B: bytes\n    boolean: empty]", jXPathBasicBeanInfo0, locale0);
      beanPointer0.asPath();
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, locale0, jXPathBasicBeanInfo1);
      BeanPointer beanPointer2 = new BeanPointer(beanPropertyPointer0, qName0, locale0, jXPathBasicBeanInfo1);
      beanPointer2.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "pj|Tvc", true, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      beanPropertyPointer0.getPropertyName();
      NullPointer nullPointer0 = new NullPointer(locale1, "*");
      nullPointer0.getValuePointer();
      propertyIterator0.getNodePointer();
      int int0 = NodePointer.WHOLE_COLLECTION;
      boolean boolean0 = propertyIterator0.setPosition(19);
      assertEquals(19, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      QName qName0 = new QName("", "71M84'dg](z%3(gcw8");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale1 = Locale.GERMAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0, locale1);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)15;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty((String) null);
      propertyIterator0.prepareForIndividualProperty("");
      propertyIterator0.prepareForIndividualProperty("baseValue");
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = NodePointer.WHOLE_COLLECTION;
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      QName qName0 = new QName("", "");
      Class<String> class0 = String.class;
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, false);
      Locale locale1 = Locale.ENGLISH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale1);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "valuePointer", true, propertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      QName qName0 = new QName("", "immediateValuePointer");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      jXPathBasicBeanInfo0.toString();
      Locale locale1 = Locale.UK;
      Class<String> class1 = String.class;
      jXPathBasicBeanInfo0.toString();
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class1, true);
      Locale locale2 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "BeanInfo [class = java.lang.String, atomic, properties = \n    class [B: bytes\n    boolean: empty]", jXPathBasicBeanInfo0, locale0);
      beanPointer0.asPath();
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, locale0, jXPathBasicBeanInfo1);
      BeanPointer beanPointer2 = new BeanPointer(beanPropertyPointer0, qName0, locale0, jXPathBasicBeanInfo1);
      beanPointer2.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "pj|Tvc", false, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      beanPropertyPointer0.getPropertyName();
      NullPointer nullPointer0 = new NullPointer(locale1, "*");
      nullPointer0.getValuePointer();
      propertyIterator0.getNodePointer();
      int int0 = NodePointer.WHOLE_COLLECTION;
      propertyIterator0.setPosition(24);
      propertyIterator0.getPosition();
      propertyIterator0.prepareForIndividualProperty("x5m%{L-!>$NU");
      propertyIterator0.getPropertyPointer();
      assertEquals(24, propertyIterator0.getPosition());
  }
}
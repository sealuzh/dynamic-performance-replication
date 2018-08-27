/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:02:45 GMT 2018
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;
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
      Locale locale0 = Locale.forLanguageTag("v");
      NullPointer nullPointer0 = new NullPointer(locale0, "v");
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPointer0);
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
      QName qName0 = new QName("Cannot convert value of class ");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      NullPropertyPointer nullPropertyPointer0 = (NullPropertyPointer)beanAttributeIterator0.getPropertyPointer();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "NS`pmZ1:d!");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "NS`pmZ1:d!", true, (NodePointer) null);
      propertyIterator0.reset();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("org.jdom.Document");
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.setPosition(Integer.MIN_VALUE);
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertFalse(nodePointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      QName qName0 = new QName("q4u~rxM\"c/%X");
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, propertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, class0, jXPathBasicBeanInfo0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.getNodePointer();
      beanPropertyPointer0.setIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("i_lh&k(", "i_lh&k(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.ITALY;
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, locale0, jXPathBasicBeanInfo0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(1045);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = new NullPointer(locale0, "modifiers");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = new NullPointer(locale0, "modifiers");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<String> class1 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.ROOT;
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      QName qName1 = nullPointer0.getName();
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer1 = new BeanPointer(qName1, (Object) null, jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer1, qName0);
      beanAttributeIterator0.getNodePointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, class0, jXPathBasicBeanInfo0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      beanPropertyPointer0.setIndex(Integer.MIN_VALUE);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(1165);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("^cdWbvg`5@=,");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("^cdWyvg`5@=,", "^cdWyvg`5@=,");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      assertEquals(0, beanAttributeIterator0.getPosition());
      
      boolean boolean0 = beanAttributeIterator0.setPosition(25);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = NodePointer.WHOLE_COLLECTION;
      QName qName0 = new QName("q4u~rxM\"c/%X");
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, propertyPointer0);
      propertyIterator0.getPosition();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, (String) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.setPosition(17);
      assertEquals(17, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<String> class1 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.JAPANESE;
      String string0 = jXPathBasicBeanInfo0.toString();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jXPathBasicBeanInfo0.toString();
      QName qName0 = new QName(string0, "immediateParentPointer");
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, locale0, jXPathBasicBeanInfo0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("immediateParentPointer");
      beanAttributeIterator0.getPosition();
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      nullPropertyPointer0.setNameAttributeValue((String) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<String> class1 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.CANADA;
      Locale locale1 = Locale.JAPAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      locale0.getUnicodeLocaleAttributes();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(beanPointer0);
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, nullPropertyPointer1);
      propertyIterator0.reset();
      FileSystemHandling.shouldAllThrowIOExceptions();
      nullPropertyPointer1.getLocale();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, qName0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      
      beanPointer0.getNamespaceResolver();
      beanPropertyPointer0.isCollection();
      NullPointer nullPointer0 = new NullPointer(beanPropertyPointer0, qName0);
      assertFalse(nullPointer0.equals((Object)nodePointer0));
      
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, class0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      Locale locale0 = new Locale("<<unknown namespace>>");
      beanPropertyPointer0.setIndex(27);
      propertyIterator0.setPosition(27);
      assertEquals(27, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<String> class1 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.ITALIAN;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      QName qName0 = new QName("immediateParentPointer");
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, locale0, jXPathBasicBeanInfo0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.getPosition();
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      boolean boolean0 = beanAttributeIterator0.setPosition(883);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<String> class1 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.ROOT;
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      NullPointer nullPointer0 = new NullPointer(locale0, "<<unknown namespace>>");
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("name");
      boolean boolean0 = propertyIterator0.setPosition(65);
      assertEquals(65, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<String> class1 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.CANADA;
      NodePointer.newNodePointer(qName0, (Object) null, locale0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      NodePointer nodePointer0 = propertyIterator0.getPropertyPointer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.prepareForIndividualProperty("valuePointer");
      propertyIterator0.setPosition(55);
      BeanPointer beanPointer1 = new BeanPointer(qName0, nodePointer0, jXPathBasicBeanInfo0, locale0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      beanPointer1.getPropertyPointer();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<<unknown namespace>>");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "~z;4y&r");
      propertyIterator0.getNodePointer();
      assertEquals(55, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<String> class1 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      nullPropertyPointer0.asPath();
      Locale locale0 = Locale.ROOT;
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      locale0.getUnicodeLocaleKeys();
      beanPointer0.getImmediateNode();
      propertyIterator0.prepareForIndividualProperty("name");
      beanPointer0.getValuePointer();
      propertyIterator0.getNodePointer();
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "+9$)S_R?WbD");
      QName qName0 = new QName("baseValue", "namespaceURI");
      Class<String> class0 = String.class;
      Locale.getISOCountries();
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, "bytes", jXPathBasicBeanInfo0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("bytes");
      boolean boolean0 = beanAttributeIterator0.setPosition((-805));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<String> class1 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      nullPropertyPointer0.asPath();
      Locale locale0 = Locale.ROOT;
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      locale0.getUnicodeLocaleKeys();
      propertyIterator0.getPropertyPointer();
      beanPointer0.getImmediateNode();
      propertyIterator0.prepareForIndividualProperty("name");
      beanPointer0.getValuePointer();
      propertyIterator0.getNodePointer();
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      propertyIterator0.setPosition(1);
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(beanPropertyPointer0, qName0, class0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      jXPathBasicBeanInfo0.toString();
      Locale locale0 = new Locale("<<unknown namespace>>");
      NullPointer nullPointer0 = new NullPointer(beanPropertyPointer0, qName0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.setIndex(6);
      propertyIterator0.getNodePointer();
      PropertyIterator propertyIterator1 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      propertyIterator0.getPosition();
      // Undeclared exception!
      try { 
        locale0.getUnicodeLocaleType("parent");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Ill-formed Unicode locale key: parent
         //
         verifyException("java.util.Locale", e);
      }
  }
}
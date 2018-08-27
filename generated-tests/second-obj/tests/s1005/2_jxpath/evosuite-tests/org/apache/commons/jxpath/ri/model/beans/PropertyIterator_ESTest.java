/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 19:26:47 GMT 2018
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;
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
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "PropertyIerator startWith parameter is not a child of the supplied parent");
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
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "9nkiI)");
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "9nkiI)", false, nullPointer0);
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
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.BeanPointer");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      int int0 = NodePointer.WHOLE_COLLECTION;
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "~Xl");
      QName qName0 = new QName("<<unknown namespace>>");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.setPosition(Integer.MIN_VALUE);
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertFalse(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, ", pa does not match a changeable locaton");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.getNodePointer();
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("] ");
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(26);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, "by_(<tes");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = new QName("by_(<tes");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      assertEquals(0, beanAttributeIterator0.getPosition());
      
      boolean boolean0 = beanAttributeIterator0.setPosition(2930);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.BeanPointer");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.ri.model.beans.BeanPointer", true, (NodePointer) null);
      propertyIterator0.getPosition();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, "by<tes");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("<opertyName");
      Locale locale0 = Locale.ITALIAN;
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName1 = nullPropertyPointer0.getName();
      Locale.getISOLanguages();
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName1);
      beanAttributeIterator0.getNodePointer();
      beanAttributeIterator0.getPropertyPointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, "by<tes");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("<opertyName");
      Locale locale0 = Locale.ITALIAN;
      Object object0 = new Object();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName1 = nullPropertyPointer0.getName();
      Locale.getISOLanguages();
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName1);
      boolean boolean0 = beanAttributeIterator0.setPosition(10);
      assertFalse(boolean0);
      
      beanAttributeIterator0.getNodePointer();
      BeanPropertyPointer beanPropertyPointer0 = (BeanPropertyPointer)beanAttributeIterator0.getPropertyPointer();
      assertEquals(1, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ", path does not match E changeable location");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ", path does not match E changeable location");
      QName qName0 = new QName(", path does not match E changeable location");
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Object object0 = new Object();
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, propertyPointer0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      locale0.stripExtensions();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.setPosition(3);
      jXPathBasicBeanInfo0.toString();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      BeanAttributeIterator beanAttributeIterator0 = null;
      try {
        beanAttributeIterator0 = new BeanAttributeIterator((PropertyOwnerPointer) null, qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, "bytes", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.BeanPointer");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Object object0 = new Object();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      ((BeanPropertyPointer) propertyPointer0).setIndex((-1933499806));
      propertyPointer0.getNamespaceResolver();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, propertyPointer0);
      NullPointer nullPointer1 = new NullPointer(locale0, "<<unknown namespace>>");
      propertyIterator0.prepareForIndividualProperty("bytes");
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Object object0 = new Object();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("l]*e");
      propertyIterator0.prepareForIndividualProperty("bytes");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName(", path does not match a changeable location");
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, ", path does not match a changeable location");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(nullPropertyPointer0, qName0, object0, jXPathBasicBeanInfo0);
      beanPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPointer0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      QName qName1 = beanPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName1);
      beanAttributeIterator0.prepareForIndividualProperty("empty");
      FileSystemHandling.shouldAllThrowIOExceptions();
      beanAttributeIterator0.getPropertyPointer();
      beanAttributeIterator0.getNodePointer();
      assertEquals(0, beanAttributeIterator0.getPosition());
      
      boolean boolean0 = beanAttributeIterator0.setPosition(816);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ", path does not match E changeable location");
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(locale0, ", path does not match E changeable location");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Object object0 = new Object();
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      Locale.getISOLanguages();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, propertyPointer0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      propertyIterator0.prepareForIndividualProperty("bytes");
      assertEquals(0, propertyIterator0.getPosition());
      
      beanPointer0.getPropertyPointer();
      propertyIterator0.setPosition(1);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<<unknown namespace>>");
      propertyIterator0.getPropertyPointer();
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      QName qName0 = new QName(", path does not match E changeable location", ", path does not match E changeable location");
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Object object0 = new Object();
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      NullPointer nullPointer1 = null;
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      jXPathBasicBeanInfo0.getPropertyDescriptor(">dwl9cZK=4?L/#11*px");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, propertyPointer0);
      locale0.stripExtensions();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.setPosition(1);
      jXPathBasicBeanInfo0.toString();
      // Undeclared exception!
      try { 
        nullPointer0.compareChildNodePointers((NodePointer) null, nullPropertyPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Object object0 = new Object();
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      int int0 = NodePointer.WHOLE_COLLECTION;
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, "bytes", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.prepareForIndividualProperty("bytes");
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Object object0 = new Object();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      ((BeanPropertyPointer) propertyPointer0).setIndex((-1933499806));
      propertyPointer0.getNamespaceResolver();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, propertyPointer0);
      NullPointer nullPointer1 = new NullPointer(qName0, locale0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      
      int int0 = propertyPointer0.propertyIndex;
      BeanPointer beanPointer1 = new BeanPointer(qName0, nullPointer1, jXPathBasicBeanInfo0, locale0);
      propertyIterator0.reset();
      int int1 = propertyIterator0.getPosition();
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("j|va.lang.Doubl", "j|va.lang.Doubl");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FileSystemHandling.shouldAllThrowIOExceptions();
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Object object0 = new Object();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      ((BeanPropertyPointer) propertyPointer0).setIndex((-1933500093));
      QName qName1 = nullPointer0.getName();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createAttribute((JXPathContext) null, qName1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an attribute for path null()/*_/@j|va.lang.Doubl:j|va.lang.Doubl, operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("j|Ya.lang.Doubl");
      Locale locale0 = Locale.KOREAN;
      FileSystemHandling.shouldAllThrowIOExceptions();
      NullPointer nullPointer0 = new NullPointer(locale0, "j|Ya.lang.Doubl");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "dynamicPropertyDeclarationSu~ported");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Object object0 = new Object();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ((BeanPropertyPointer) propertyPointer0).setIndex((-1933499922));
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "j|Ya.lang.Doubl");
      beanAttributeIterator0.prepareForIndividualProperty("bytes");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, propertyPointer0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      QName qName1 = beanPointer0.getName();
      BeanAttributeIterator beanAttributeIterator1 = new BeanAttributeIterator(nullPointer0, qName1);
      propertyIterator0.prepareForIndividualProperty("F13eCU]d`yBd~|Nlaj|");
      propertyIterator0.reset();
      propertyIterator0.setPosition((-3051));
      beanAttributeIterator0.getPosition();
      propertyIterator0.getPosition();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.prepareForIndividualProperty("empty");
      assertEquals((-3051), propertyIterator0.getPosition());
  }
}
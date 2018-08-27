/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:11:52 GMT 2018
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
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
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
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
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "root");
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = new NullPointer(locale0, "root");
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, nullPointer0);
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
      QName qName0 = new QName("format-number");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("format-number");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(2);
      assertEquals(2, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory", false, propertyPointer0);
      int int0 = NodePointer.WHOLE_COLLECTION;
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(299);
      propertyIterator0.getNodePointer();
      assertEquals(299, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory", false, propertyPointer0);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = NodePointer.WHOLE_COLLECTION;
      propertyIterator0.getNodePointer();
      int int1 = propertyIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer1, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.getNodePointer();
      propertyIterator0.getPropertyPointer();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer1, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Locale locale0 = Locale.CHINA;
      Object object0 = new Object();
      QName qName0 = nullPropertyPointer0.getName();
      nullPropertyPointer0.getNode();
      NullPointer nullPointer0 = new NullPointer(nullPropertyPointer0, qName0);
      nullPointer0.getValue();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.prepareForIndividualProperty((String) null);
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<Object> class0 = Object.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, class0);
      Locale locale0 = Locale.CHINA;
      Object object0 = new Object();
      QName qName0 = nullPropertyPointer0.getName();
      nullPropertyPointer0.getNode();
      NullPointer nullPointer0 = new NullPointer(nullPropertyPointer0, qName0);
      nullPointer0.getValue();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.setPosition(108);
      propertyIterator0.prepareForIndividualProperty((String) null);
      assertEquals(108, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      beanPointer0.getPropertyPointer();
      propertyIterator0.getNodePointer();
      BeanPropertyPointer beanPropertyPointer0 = (BeanPropertyPointer)propertyIterator0.getPropertyPointer();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getIndex());
      assertEquals(0, propertyIterator0.getPosition());
      assertEquals(1, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory", false, propertyPointer0);
      int int0 = NodePointer.WHOLE_COLLECTION;
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      int int1 = propertyIterator0.getPosition();
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      propertyIterator0.reset();
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer1, jXPathBasicBeanInfo0, locale0);
      locale0.getDisplayVariant();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      beanPointer0.getPropertyPointer();
      propertyIterator0.prepareForIndividualProperty((String) null);
      propertyIterator0.getNodePointer();
      BeanPropertyPointer beanPropertyPointer0 = (BeanPropertyPointer)propertyIterator0.getPropertyPointer();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getIndex());
      assertEquals(1, beanPropertyPointer0.getPropertyIndex());
      
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      PropertyIterator propertyIterator0 = (PropertyIterator)nullPropertyPointer0.childIterator(nodeNameTest0, true, (NodePointer) null);
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.ROOT;
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      Class<String> class0 = String.class;
      FileSystemHandling.shouldAllThrowIOExceptions();
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer1, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty(", dynamic");
      propertyIterator0.getNodePointer();
      BeanPropertyPointer beanPropertyPointer0 = (BeanPropertyPointer)propertyIterator0.getPropertyPointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertEquals(0, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "PropertyIerator startWith paameter is not a child of the supplied parnt");
      List list0 = jXPathContext0.selectNodes("empty");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = new QName("<<unknown namespace>>");
      Class<Object> class0 = Object.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, class0);
      Locale locale0 = Locale.CHINA;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
      beanPointer0.setAttribute(true);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      propertyPointer0.getValue();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, propertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.prepareForIndividualProperty("container");
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
      
      boolean boolean1 = FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer1, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      QName qName1 = new QName("<<unknown namespace>>");
      NullPointer nullPointer0 = new NullPointer(locale0, "<<unknown namespace>>");
      beanPointer0.getPropertyPointer();
      beanPointer0.getPropertyPointer();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      beanPointer0.setAttribute(true);
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("PropertyIerator startWith parameter is not a child of the supplied parent");
      NullPointer nullPointer1 = new NullPointer((NodePointer) null, qName0);
      propertyIterator0.getPropertyPointer();
      propertyIterator0.reset();
      propertyIterator0.getPropertyPointer();
      propertyIterator0.getPosition();
      propertyIterator0.prepareForIndividualProperty("empty");
      propertyIterator0.prepareForIndividualProperty("t%Pj'");
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertEquals(0, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      Class<Object> class0 = Object.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, class0);
      Locale locale0 = Locale.CHINA;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
      beanPointer0.setAttribute(true);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      Object object1 = propertyPointer0.bean;
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, propertyPointer0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      propertyIterator0.prepareForIndividualProperty("container");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      boolean boolean0 = propertyIterator0.setPosition(321);
      assertEquals(321, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer1, jXPathBasicBeanInfo0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty(", dynam@c");
      propertyIterator0.getNodePointer();
      NodePointer nodePointer0 = propertyIterator0.getPropertyPointer();
      assertEquals(1, propertyIterator0.getPosition());
      
      propertyIterator0.reset();
      propertyIterator0.getPosition();
      int int0 = PropertyPointer.UNSPECIFIED_PROPERTY;
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      assertFalse(propertyPointer0.equals((Object)nodePointer0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "<<unknown namespace>>");
      Class<Object> class0 = Object.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, class0);
      Locale locale0 = new Locale("<<unknown namespace>>", "<<unknown namespace>>", "<<unknown namespace>>");
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      beanPointer0.getValuePointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "container", false, (NodePointer) null);
      jXPathBasicBeanInfo0.toString();
      propertyIterator0.prepareForIndividualProperty("container");
      jXPathBasicBeanInfo0.toString();
      jXPathBasicBeanInfo0.toString();
      nullPropertyPointer0.printPointerChain();
      propertyIterator0.getNodePointer();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      
      propertyIterator0.getPosition();
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      Object object0 = new Object();
      String string0 = "R0_[o,q=uUzpk=-";
      NullPointer nullPointer0 = new NullPointer(locale0, "R0_[o,q=uUzpk=-");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "R0_[o,q=uUzpk=-");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      List list0 = jXPathContext0.selectNodes("bytes");
      JXPathContext jXPathContext1 = JXPathContext.newContext((Object) list0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext1, object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id(R0_[o,q=uUzpk=-)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "<<unknown namespace>>");
      Class<Object> class0 = Object.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, class0);
      Locale locale0 = new Locale("<<unknown namespace>>", "<<unknown namespace>>", "<<unknown namespace>>");
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      beanPointer0.getValuePointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      propertyIterator0.reset();
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(propertyPointer0, jXPathBasicBeanInfo0);
      propertyIterator0.prepareForIndividualProperty("container");
      propertyIterator0.setPosition(1);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      ((BeanPropertyPointer) propertyPointer0).setIndex(1698);
      PropertyIterator propertyIterator1 = new PropertyIterator(beanPointer0, "PropertyIerator startWith parameter is not a child of the supplied parent", false, (NodePointer) null);
      propertyIterator1.prepareForIndividualProperty("container");
      PropertyIterator propertyIterator2 = new PropertyIterator(beanPointer0, (String) null, true, beanPropertyPointer0);
      jXPathBasicBeanInfo0.toString();
      NodePointer nodePointer0 = propertyIterator2.getNodePointer();
      JXPathContext.newContext((Object) class0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<<unknown namespace>>");
      propertyIterator1.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, propertyIterator1.getPosition());
      
      nodePointer0.getValuePointer();
      propertyIterator2.getPropertyPointer();
      propertyIterator2.getPropertyPointer();
      BeanPropertyPointer beanPropertyPointer1 = (BeanPropertyPointer)propertyIterator2.getPropertyPointer();
      assertEquals(23, beanPropertyPointer1.getPropertyIndex());
  }
}
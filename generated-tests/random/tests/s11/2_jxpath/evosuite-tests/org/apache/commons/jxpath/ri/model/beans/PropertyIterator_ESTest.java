/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 20:00:59 GMT 2019
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
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyIterator;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyIterator_ESTest extends PropertyIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.ri.compiler.Operation", false, (NodePointer) null);
      propertyIterator0.setPosition((-592));
      propertyIterator0.getNodePointer();
      assertEquals((-592), propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.ri.compiler.Operation", false, (NodePointer) null);
      propertyIterator0.setPosition((-592));
      int int0 = propertyIterator0.getPosition();
      assertEquals((-592), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("node");
      propertyIterator0.prepareForIndividualProperty((String) null);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.setPosition(16);
      assertEquals(16, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("node");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer", "org.apache.commons.jxpath.ri.model.VariablePointer");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer", jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, nullPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(16);
      assertEquals(16, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "<<unknown namespace>>");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertFalse(boolean0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("leaf", "leaf");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "leaf", true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(81);
      assertEquals(81, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("actual", "actual");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "actual", false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(73);
      assertEquals(73, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("leaf", "leaf");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "leaf", false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("YBG5pY0");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, qName0, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "displayName", true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("B", "7L$jhpA]WQw.h%L");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.getNodePointer();
      boolean boolean0 = propertyIterator0.setPosition(384);
      assertEquals(384, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("value", "name");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      Locale locale0 = Locale.PRC;
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, qName0, locale0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "name", true, (NodePointer) null);
      NodePointer nodePointer1 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer1);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("B", "7L$jhpA]WQw.h%L");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.setPosition(384);
      propertyIterator0.getNodePointer();
      assertEquals(384, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "", false, propertyPointer0);
      propertyIterator0.getNodePointer();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("E~)h>>b");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.setIndex(0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "E~)h>>b", true, nullPropertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.GERMANY;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "\t", false, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, nullPropertyPointer0);
      propertyIterator0.setPosition(16);
      int int0 = propertyIterator0.getPosition();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      BeanPropertyPointer beanPropertyPointer1 = (BeanPropertyPointer)propertyIterator0.getPropertyPointer();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer1.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathBasicBeanInfo0);
      Object object0 = jXPathContext0.getValue("*", class0);
      assertEquals(0, object0);
  }
}

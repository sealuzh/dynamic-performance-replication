/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 07:54:15 GMT 2019
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyIterator;
import org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyIterator_ESTest extends PropertyIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.US;
      QName qName0 = new QName("");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Integer> class1 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "parent", true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(903);
      assertEquals(903, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("1");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("1");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      int int0 = propertyIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("QNf)", "^\u0002Q");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "QNf)", false, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = propertyIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("tt:J((^d92n2;nw3");
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "28AZ.uehB)1fT", true, propertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertEquals(0, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("Canot create an attriue for path ");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.UK;
      QName qName0 = new QName("[noCZ");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      // Undeclared exception!
      propertyIterator0.setPosition(77);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      QName qName0 = new QName("Undefined variable: ");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, (JXPathBeanInfo) null, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "propertyNames", true, (NodePointer) null);
      // Undeclared exception!
      try { 
        propertyIterator0.setPosition(67);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("8#-MhAq%");
      Locale locale0 = new Locale("8#-MhAq%");
      BeanPointer beanPointer0 = new BeanPointer(qName0, "8#-MhAq%", (JXPathBeanInfo) null, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(propertyPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      // Undeclared exception!
      try { 
        propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("*U&e[W-5m~ER", "*U&e[W-5m~ER");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.propertyIndex = (-1607);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "be+an", false, nullPropertyPointer0);
      // Undeclared exception!
      try { 
        propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1607
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo((Class) null);
      Locale locale0 = new Locale("<<unknown namespace>>", "&");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      // Undeclared exception!
      try { 
        propertyIterator0.getNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathBasicBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator((PropertyOwnerPointer) null, "jzr tg%523rX", false, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("1");
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.NullPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("node");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "node", false, (NodePointer) null);
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("ll\":Lz9%lneDf");
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", ",0\"M+ZrJ\u0000xP]");
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      propertyIterator0.prepareForIndividualProperty("org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("ll\":Lz9%lneDf");
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", ",0\"M+ZrJ\u0000xP]");
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(97);
      assertEquals(97, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("ll\":Lz9%lneDf");
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", ",0\"M+ZrJ\u0000xP]");
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.UK;
      QName qName0 = new QName("[noCZ");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("1");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(116);
      assertEquals(116, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.US;
      QName qName0 = new QName("p}s-T'`");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "root", false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.US;
      QName qName0 = new QName("p}s-T'`");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(387);
      assertEquals(387, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.US;
      QName qName0 = new QName("p}s-T'`");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "root", true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("1");
      Object object0 = new Object();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("1", "1");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("1");
      Object object0 = new Object();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("1", "1");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("node");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("1");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = new Locale("value", "value");
      QName qName0 = new QName("1", "1");
      Object object0 = new Object();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("valuePointer");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("*U&e[W-5m~ER", "*U&e[W-5m~ER");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.setIndex((-2147473702));
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "be+an", false, nullPropertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("D", "D");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.UK;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "D", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      boolean boolean0 = propertyIterator0.setPosition(1702);
      assertEquals(1702, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("1");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, beanPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("1");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("Canot create an attriue for path ");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale("<<unknown namespace>>", "");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }
}
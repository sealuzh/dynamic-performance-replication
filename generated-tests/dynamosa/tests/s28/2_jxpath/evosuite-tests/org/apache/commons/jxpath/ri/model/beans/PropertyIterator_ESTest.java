/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:37:50 GMT 2019
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
      Object object0 = new Object();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, object0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(764);
      assertEquals(764, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.UK;
      QName qName0 = new QName("", "");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "propertyIndex", false, propertyPointer0);
      propertyIterator0.setPosition(2805);
      int int0 = propertyIterator0.getPosition();
      assertEquals(2805, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("", "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, ">2-C}(Yw4", false, propertyPointer0);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = propertyIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.UK;
      QName qName0 = new QName("", "");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "propertyIndex", false, propertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertFalse(boolean0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, nullPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.setPosition(519);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      Locale.LanguageRange locale_LanguageRange0 = new Locale.LanguageRange("rootNode");
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, locale_LanguageRange0, (JXPathBeanInfo) null);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "rootNode", false, propertyPointer0);
      // Undeclared exception!
      try { 
        propertyIterator0.setPosition(20);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, (Object) null, (JXPathBeanInfo) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
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
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, nullPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("{G Ru$-\"@h");
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, beanPropertyPointer0, (JXPathBeanInfo) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "{G Ru$-\"@h", false, (NodePointer) null);
      // Undeclared exception!
      try { 
        propertyIterator0.getNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator((PropertyOwnerPointer) null, "(- _:c~_/a^\"HZDG", true, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("$noRME", "$noRME");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(nullPointer0, qName0, locale0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "$noRME", false, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.BeanPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      Locale locale0 = Locale.ITALY;
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, beanPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty(" 7Kj0^");
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      Locale locale0 = Locale.ITALY;
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, beanPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Locale locale0 = Locale.ITALY;
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, beanPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer1 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, beanPropertyPointer1);
      propertyIterator0.prepareForIndividualProperty("D%Tz?yCW%4e=5Eq");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      Locale locale0 = Locale.ITALY;
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, beanPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = new NullPointer(locale0, " G[t?+)k{m,,,");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, nullPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "immediateParentPointer");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "length", true, propertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, "POINTER: ", jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "valuePointer", true, nullPropertyPointer1);
      boolean boolean0 = propertyIterator0.setPosition(58);
      assertEquals(58, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, ".");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, ".", false, nullPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(58);
      assertEquals(58, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "q+[J2l");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "length", true, propertyPointer0);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Locale locale0 = Locale.ITALY;
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, beanPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer1 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, beanPropertyPointer1);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, ".");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, ".", false, nullPropertyPointer0);
      propertyIterator0.getNodePointer();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "false()");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "(yGRB>*B/d(Vc", jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "value", true, beanPropertyPointer0);
      propertyIterator0.getNodePointer();
      boolean boolean0 = propertyIterator0.setPosition(46);
      assertEquals(46, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "q+[J2l");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      ((BeanPropertyPointer) propertyPointer0).setIndex(1073);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "length", true, propertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "immediateNode");
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
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "length", false, propertyPointer0);
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      QName qName0 = new QName("(v5Rz");
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "valuePointer", true, propertyPointer0);
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", true, nullPropertyPointer0);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "immediateParentPointer");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "length", false, propertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }
}

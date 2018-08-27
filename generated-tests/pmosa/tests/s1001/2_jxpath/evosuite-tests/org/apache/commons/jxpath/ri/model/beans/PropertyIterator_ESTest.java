/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 17:32:34 GMT 2018
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
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
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "$xiZ");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, nullPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(4);
      assertEquals(4, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "$xiZ");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(4);
      assertEquals(4, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("wwx'ut7^7!>^]K", "wwx'ut7^7!>^]K");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      PropertyIterator propertyIterator1 = new PropertyIterator(nullPointer0, "", false, (NodePointer) null);
      propertyIterator1.setPosition(1);
      propertyIterator0.setPosition(1);
      nullPointer0.isCollection();
      propertyIterator0.reset();
      propertyIterator1.setPosition((-1632));
      propertyIterator1.reset();
      nodePointer0.getNodeValue();
      propertyIterator0.getNodePointer();
      propertyIterator1.reset();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName1 = beanPropertyPointer0.getName();
      Locale locale0 = new Locale("", "4\"e@~FX");
      NullPointer nullPointer1 = new NullPointer(qName1, locale0);
      PropertyIterator propertyIterator2 = null;
      try {
        propertyIterator2 = new PropertyIterator(nullPointer1, "<<unknown namespace>>", false, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("$xiZ");
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer(locale0, "java.lang.String");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      String string0 = "";
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("$xiZ");
      propertyIterator0.getPosition();
      propertyIterator0.reset();
      String string1 = "";
      boolean boolean0 = false;
      PropertyIterator propertyIterator1 = null;
      try {
        propertyIterator1 = new PropertyIterator(nullPointer0, "", false, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("r|@Nj??rIu'kl", "$xiZ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("$xiZ");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(propertyPointer0);
      nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, nullPropertyPointer1);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("r|@Nj??rIu'kl", "$xiZ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(propertyPointer0);
      nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)86;
      byteArray0[1] = (byte)35;
      byteArray0[2] = (byte)28;
      byteArray0[3] = (byte)14;
      Class<String> class1 = String.class;
      Class<BeanPropertyPointer> class2 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class1, class2);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(propertyPointer0, jXPathBasicBeanInfo1);
      Locale locale0 = Locale.ENGLISH;
      NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(variablePointer0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer2, jXPathBasicBeanInfo1, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, nullPropertyPointer0);
      NodePointer nodePointer1 = propertyIterator0.getNodePointer();
      assertNull(nodePointer1);
      
      propertyIterator0.prepareForIndividualProperty("r|@Nj??rIu'kl");
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "PropertyIerator startWith parameter is not a child of the supplied parent");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("PropertyIerator startWith parameter is not a child of the supplied parent");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "value", true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      QName qName0 = new QName("");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.setPosition(24);
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.prepareForIndividualProperty("");
      propertyIterator0.getPosition();
      propertyIterator0.reset();
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(7);
      PropertyIterator propertyIterator1 = new PropertyIterator(nullPointer0, "", false, (NodePointer) null);
      propertyIterator1.setPosition((-65529));
      nullPointer0.isCollection();
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      Locale locale0 = Locale.ENGLISH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator2 = new PropertyIterator(beanPointer0, "", true, (NodePointer) null);
      propertyIterator2.getNodePointer();
      propertyIterator1.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.getNodePointer();
      assertEquals(7, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "$xiZ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("PropertyIerator startWith parameter is not a child of the supplied parent");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      NullPointer nullPointer0 = new NullPointer(beanPointer0, qName0);
      NullPointer nullPointer1 = new NullPointer(variablePointer0, qName0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName1 = nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(propertyPointer0);
      Class<Integer> class1 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class1);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer1 = new BeanPointer(qName1, nullPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.getNodePointer();
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("@xml:lang");
      BeanPropertyPointer beanPropertyPointer0 = (BeanPropertyPointer)propertyIterator0.getPropertyPointer();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getIndex());
      assertEquals(0, propertyIterator0.getPosition());
      assertEquals(26, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      QName qName0 = new QName("wwx'ut7^7!>^]K", "wwx'ut7^7!>^]K");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.setPosition((-3831));
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.prepareForIndividualProperty("");
      propertyIterator0.getPosition();
      propertyIterator0.reset();
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(1);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      Locale locale0 = Locale.ENGLISH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, beanPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      jXPathBasicBeanInfo0.toString();
      PropertyIterator propertyIterator1 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator1.getNodePointer();
      PropertyIterator propertyIterator2 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      propertyIterator2.setPosition(660);
      propertyIterator1.getNodePointer();
      propertyIterator0.reset();
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("root");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("root");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("root");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "$xiZ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("$xiZ");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, variablePointer0, jXPathBasicBeanInfo0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      NullPointer nullPointer1 = new NullPointer((NodePointer) null, qName0);
      beanPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(beanPointer0);
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class1);
      Locale locale0 = Locale.ROOT;
      QName qName1 = new QName("<<unknown namespace>>");
      NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(beanPointer0);
      BeanPointer beanPointer1 = new BeanPointer(qName1, nullPropertyPointer2, jXPathBasicBeanInfo1, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "namespaceResolver", true, nullPropertyPointer0);
      propertyIterator0.getNodePointer();
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.getNodePointer();
      PropertyIterator propertyIterator1 = null;
      try {
        propertyIterator1 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, beanPointer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "$xiZ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("PropertyIerator startWith parameter is not a child of the supplied parent");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      NullPointer nullPointer0 = new NullPointer(beanPointer0, qName0);
      NullPointer nullPointer1 = new NullPointer(variablePointer0, qName0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName1 = nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(propertyPointer0);
      Class<Integer> class1 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class1);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer1 = new BeanPointer(qName1, nullPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.getNodePointer();
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("@xml:lang");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "$xiZ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("PropertyIerator startWith parameter is not a child of the supplied parent");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      NullPointer nullPointer0 = new NullPointer(beanPointer0, qName0);
      NullPointer nullPointer1 = new NullPointer(variablePointer0, qName0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName1 = nullPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(propertyPointer0);
      Class<Integer> class1 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class1);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer1 = new BeanPointer(qName1, nullPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.getNodePointer();
      propertyIterator0.reset();
      propertyIterator0.prepareForIndividualProperty("@xml:lang");
      propertyIterator0.getNodePointer();
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(2651);
      assertEquals(2651, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("$xiZ", "$xiZ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("$xiZ");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("attribute");
      boolean boolean0 = propertyIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "$xiZ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("PropertyIerator startWith parameter is not a child of the supplied parent");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      beanPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.getNodePointer();
      beanPointer0.getPropertyPointer();
      boolean boolean0 = propertyIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      Locale locale1 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.setIndex(2);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "Was expecting:", false, nullPropertyPointer0);
      propertyIterator0.setPosition((-1721224000));
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("PropertyIerator startWith parameter is not a child of the supplied parent", "$xiZ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("PropertyIerator startWith parameter is not a child of the supplied parent");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer1 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer1.getPropertyPointer();
      BeanPointer beanPointer2 = new BeanPointer(propertyPointer0, qName0, class0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer1, "propertyIndex", false, beanPointer2);
      propertyIterator0.setPosition(27);
      boolean boolean0 = propertyIterator0.setPosition(27);
      assertEquals(27, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("root");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("root");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "root", false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(36);
      assertEquals(36, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("root");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("root");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      PropertyIterator propertyIterator1 = new PropertyIterator(beanPointer0, "index", true, (NodePointer) null);
      propertyIterator1.setPosition(1);
      assertEquals(1, propertyIterator1.getPosition());
      
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("oot");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("oot");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      PropertyIterator propertyIterator1 = new PropertyIterator(beanPointer0, "index", false, (NodePointer) null);
      propertyIterator1.setPosition(1);
      propertyIterator1.getNodePointer();
      propertyIterator1.prepareForIndividualProperty("<<unknown namespace>>");
      assertEquals(1, propertyIterator1.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("descendant-or-self::", "descendant-or-self::");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("8<3");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "bytes", false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(8);
      assertEquals(8, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("root");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("root");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, variablePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "root", true, (NodePointer) null);
      propertyIterator0.setPosition(32);
      propertyIterator0.setPosition(1);
      propertyIterator0.prepareForIndividualProperty("valuePointer");
      assertEquals(1, propertyIterator0.getPosition());
  }
}
/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:05:13 GMT 2018
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
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
      NullPointer nullPointer0 = new NullPointer((Locale) null, "&]h3Pv=>o");
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
  public void test01()  throws Throwable  {
      QName qName0 = new QName("comDt");
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      locale0.getDisplayScript();
      NullPointer nullPointer1 = new NullPointer(qName0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.setPosition(Integer.MIN_VALUE);
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertTrue(nodePointer0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("empty");
      Locale locale0 = Locale.KOREAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer1, "<<unknown namespace>>", true, nullPointer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "JcfF$]B9Z[5/6Fv{");
      Locale locale0 = Locale.CHINA;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      NullPointer nullPointer0 = new NullPointer(locale0, "PropertyIerator startWith parameter is not a child of the supplied parent");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.getImmediateValuePointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("attrbute", "attrbute");
      FileSystemHandling.shouldAllThrowIOExceptions();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attrbute", true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "locale");
      QName qName0 = new QName("<<unknown namespace>>", "H~u");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(25);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "JcfF$]B9Z[5/6Fv{");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "JcfF$]B9Z[5/6Fv{");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      NullPointer nullPointer1 = new NullPointer(locale0, "JcfF$]B9Z[5/6Fv{");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("EaW7h 9=2;w<|&w");
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName(")!|a");
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, ")!|a", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "i/_=*J_~Nl", true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("attrbute", "attrbute");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      FileSystemHandling.shouldAllThrowIOExceptions();
      beanAttributeIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      beanAttributeIterator0.getPosition();
      assertEquals(0, beanAttributeIterator0.getPosition());
      
      boolean boolean0 = beanAttributeIterator0.setPosition(665);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("comment", "on6");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("on6");
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.getPosition();
      propertyIterator0.prepareForIndividualProperty("rootNode");
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("W-Of+WK", "W-Of+WK");
      Locale locale0 = Locale.ENGLISH;
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("W-Of+WK");
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.getPosition();
      NullPointer nullPointer0 = new NullPointer(locale0, "W-Of+WK");
      propertyIterator0.prepareForIndividualProperty("rootNode");
      boolean boolean0 = propertyIterator0.setPosition(16);
      assertEquals(16, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("comment", "oyn");
      Locale locale0 = Locale.ENGLISH;
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("oyn");
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      NullPointer nullPointer0 = new NullPointer(locale0, "comment");
      propertyIterator0.prepareForIndividualProperty("rootNode");
      NullPointer nullPointer1 = new NullPointer((NodePointer) null, qName0);
      propertyIterator0.getNodePointer();
      boolean boolean0 = propertyIterator0.setPosition(16);
      assertEquals(16, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("gv smaFe", "gv smaFe");
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, class1, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      locale0.toLanguageTag();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.reset();
      beanAttributeIterator0.getPropertyPointer();
      beanAttributeIterator0.getNodePointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName(")!|a");
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName(")!|a");
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      jXPathBasicBeanInfo0.getPropertyDescriptor("PropertyIerator startWith parameter is not a child of the supplied parent");
      locale0.getUnicodeLocaleKeys();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      NullPointer nullPointer0 = new NullPointer(locale0, "<<unknown namespace>>");
      propertyIterator0.reset();
      NullPointer nullPointer1 = new NullPointer(locale0, "<<unknown namespace>>");
      propertyIterator0.prepareForIndividualProperty("G^r");
      propertyIterator0.setPosition(20);
      PropertyIterator propertyIterator1 = new PropertyIterator(nullPointer0, "", true, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("comment", "on6");
      Locale locale0 = Locale.ENGLISH;
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("on6");
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      NullPointer nullPointer0 = new NullPointer(locale0, "comment");
      propertyIterator0.prepareForIndividualProperty("rootNode");
      NullPointer nullPointer1 = new NullPointer((NodePointer) null, qName0);
      propertyIterator0.getNodePointer();
      propertyIterator0.setPosition(16);
      assertEquals(16, propertyIterator0.getPosition());
      
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName(")!");
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      locale0.getDisplayLanguage();
      propertyIterator0.prepareForIndividualProperty((String) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      locale0.getDisplayLanguage();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      assertEquals(0, propertyIterator0.getPosition());
      assertFalse(beanPropertyPointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName(")!:)!");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer(")!:)!");
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      jXPathBasicBeanInfo0.getPropertyDescriptor("<<unknown namespace>>");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty(" No DOCTYPE declaration, ");
      propertyIterator0.getPosition();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName(")!|a");
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Locale locale0 = Locale.FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      locale0.getDisplayLanguage();
      propertyIterator0.getNodePointer();
      propertyIterator0.prepareForIndividualProperty(")!|a");
      int int0 = PropertyPointer.UNSPECIFIED_PROPERTY;
      NullPointer nullPointer0 = new NullPointer(locale0, "<<unknown namespace>>");
      assertTrue(nullPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("'P]AsWw'C", "'P]AsWw'C");
      Class<String> class0 = String.class;
      FileSystemHandling.shouldAllThrowIOExceptions();
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "'P]AsWw'C", true, (NodePointer) null);
      beanPointer0.getValuePointer();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.getNodePointer();
      propertyIterator0.prepareForIndividualProperty("empty");
      int int0 = NodePointer.WHOLE_COLLECTION;
      Locale locale1 = Locale.ROOT;
      propertyIterator0.setPosition(7);
      NullPointer nullPointer0 = new NullPointer(locale1, "'P]AsWw'C");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      assertFalse(propertyPointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName(")!|a");
      Class<String> class0 = String.class;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class0);
      jXPathBasicBeanInfo1.getPropertyDescriptor("|}Gsn");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, ")!|a", false, (NodePointer) null);
      propertyIterator0.getNodePointer();
      propertyIterator0.reset();
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      propertyIterator0.getNodePointer();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      propertyIterator0.prepareForIndividualProperty("empty");
      propertyIterator0.getNodePointer();
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("'P]AsWw'C", "'P]AsWw'C");
      Class<String> class0 = String.class;
      FileSystemHandling.shouldAllThrowIOExceptions();
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Locale locale0 = Locale.FRENCH;
      FileSystemHandling.shouldAllThrowIOExceptions();
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "'P]AsWw'C", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "'P]AsWw'C");
      beanPointer0.getValue();
      propertyIterator0.prepareForIndividualProperty("empty");
      jXPathBasicBeanInfo0.toString();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "empty");
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      beanPointer0.getImmediateNode();
      propertyIterator0.setPosition(1);
      NodeIterator nodeIterator0 = beanPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("gv smaFe", "gv smaFe");
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.KOREAN;
      Class<BeanPropertyPointer> class2 = BeanPropertyPointer.class;
      Class<String> class3 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(class2, class3);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Locale locale1 = Locale.FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale1, jXPathBasicBeanInfo0, locale1);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "b-ql6<jc{OdFuH<z", false, (NodePointer) null);
      locale1.getDisplayLanguage();
      propertyIterator0.getNodePointer();
      jXPathBasicBeanInfo1.toString();
      propertyIterator0.prepareForIndividualProperty("bytes");
      int int0 = PropertyPointer.UNSPECIFIED_PROPERTY;
      NullPointer nullPointer0 = new NullPointer(locale1, "l/IK$");
      assertTrue(nullPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName((String) null, "gv smaFe");
      Class<String> class0 = String.class;
      Class<BeanPropertyPointer> class1 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class1, jXPathBasicBeanInfo0, locale0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      NullPointer nullPointer0 = new NullPointer(locale0, "gv smaFe");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator1 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, nullPropertyPointer0);
      locale0.getDisplayName();
      beanPointer0.getRootNode();
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.setPosition(1524);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      jXPathBasicBeanInfo0.toString();
      FileSystemHandling.shouldAllThrowIOExceptions();
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      propertyIterator1.getPosition();
      jXPathBasicBeanInfo0.getPropertyDescriptor((String) null);
      PropertyIterator propertyIterator2 = new PropertyIterator(nullPointer0, (String) null, false, nullPropertyPointer0);
      // Undeclared exception!
      propertyIterator2.getNodePointer();
  }
}
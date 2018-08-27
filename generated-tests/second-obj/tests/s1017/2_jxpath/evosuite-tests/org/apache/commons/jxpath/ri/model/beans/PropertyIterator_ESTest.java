/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:35:03 GMT 2018
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
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
      QName qName0 = new QName("@lssw.D_ts2");
      NullPointer nullPointer0 = new NullPointer((Locale) null, "@lssw.D_ts2");
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "@lssw.D_ts2", false, nullPointer0);
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
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = new NullPointer(locale0, "%7G|n=rHLPLWe[");
      QName qName0 = new QName("<<unknown namespace>>");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("%7G|n=rHLPLWe[");
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      beanAttributeIterator0.getPropertyPointer();
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer(locale0, "%7G|n=QvLPLWe[");
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(25);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer(locale0, "%7G|n=QvLPLWe[");
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      beanAttributeIterator0.setPosition(25);
      beanAttributeIterator0.reset();
      assertEquals(25, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodeIterator nodeIterator0 = nullPointer0.childIterator(nodeNameTest0, false, nullPropertyPointer0);
      nodeIterator0.setPosition(Integer.MIN_VALUE);
      nodeIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "mBHY<Q");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = beanAttributeIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "mBHY<Q");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.setPosition(91);
      int int0 = beanAttributeIterator0.getPosition();
      assertEquals(91, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      locale0.getDisplayScript(locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "<<unknown namespace>>");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      beanAttributeIterator0.reset();
      beanAttributeIterator0.getPropertyPointer();
      beanAttributeIterator0.getNodePointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = null;
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      nullPropertyPointer0.getName();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, nullPropertyPointer0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      propertyIterator0.getNodePointer();
      BeanAttributeIterator beanAttributeIterator0 = null;
      try {
        beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, (QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("gZ#I$25jw", "ntring-lengty");
      Locale locale0 = new Locale("gZ#I$25jw");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "ntring-lengty", locale0);
      beanPointer0.toString();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      beanAttributeIterator0.setPosition(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.UK;
      jXPathBasicBeanInfo0.toString();
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "propertyNames");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      beanPointer0.getName();
      locale0.getExtension('i');
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      propertyIterator0.prepareForIndividualProperty("propertyNames");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      propertyIterator0.getNodePointer();
      BeanAttributeIterator beanAttributeIterator0 = null;
      try {
        beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, (QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      Locale locale1 = Locale.GERMAN;
      beanPointer0.namespacePointer("propertyCount");
      locale0.getLanguage();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      locale0.getDisplayVariant();
      propertyIterator0.prepareForIndividualProperty("propertyCount");
      propertyIterator0.getPropertyPointer();
      propertyIterator0.setPosition(1);
      propertyIterator0.setPosition((-3538));
      propertyIterator0.getPosition();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Locale locale0 = Locale.UK;
      locale0.getDisplayScript(locale0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "collection");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      QName qName0 = new QName("collection");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer(propertyPointer0, qName0, locale0, jXPathBasicBeanInfo0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.setPosition(8);
      beanAttributeIterator0.getPropertyPointer();
      beanAttributeIterator0.getPropertyPointer();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      beanPointer0.getName();
      beanPointer0.namespacePointer("propertyCount");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      locale0.getDisplayVariant(locale0);
      propertyIterator0.prepareForIndividualProperty("propertyCount");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer0);
      jXPathBasicBeanInfo0.toString();
      NodePointer nodePointer0 = propertyIterator0.getPropertyPointer();
      locale0.getExtensionKeys();
      NodePointer.newNodePointer((QName) null, propertyIterator0, locale0);
      propertyIterator0.setPosition(1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        nodePointer0.attributeIterator((QName) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: null.propertyCount; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Locale locale0 = Locale.ITALY;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Locale.setDefault(locale0);
      NullPointer nullPointer0 = new NullPointer((Locale) null, (String) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.getName();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.setDefault(locale_Category0, locale0);
      nullPointer0.compareChildNodePointers(nullPropertyPointer0, nullPropertyPointer0);
      nullPropertyPointer0.getNodeValue();
      FileSystemHandling.shouldAllThrowIOExceptions();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer0);
      NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(nullPropertyPointer1);
      nullPropertyPointer0.setIndex(11);
      nullPropertyPointer2.namespaceIterator();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      jXPathBasicBeanInfo0.toString();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "<<unknown namespace>>");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, nullPropertyPointer0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      propertyIterator0.getPosition();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      QName qName0 = new QName("<<unknown namespace>>", "propertyCount");
      beanPointer0.namespacePointer("propertyCount");
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      locale0.getDisplayVariant(locale0);
      propertyIterator0.prepareForIndividualProperty("propertyCount");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer0);
      String string0 = jXPathBasicBeanInfo0.toString();
      propertyIterator0.prepareForIndividualProperty(string0);
      propertyIterator0.getPropertyPointer();
      propertyIterator0.prepareForIndividualProperty("valuePointer");
      locale0.getExtensionKeys();
      FileSystemHandling.shouldAllThrowIOExceptions();
      nullPropertyPointer0.namespaceIterator();
      jXPathBasicBeanInfo0.toString();
      NodePointer.newNodePointer((QName) null, beanPointer0, locale0);
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      // Undeclared exception!
      try { 
        nullPointer0.childIterator((NodeTest) null, true, nullPropertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "collection");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "collection", true, nullPropertyPointer0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      propertyIterator0.setPosition(512);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.reset();
      BeanAttributeIterator beanAttributeIterator1 = new BeanAttributeIterator(beanPointer0, qName0);
      jXPathBasicBeanInfo0.getPropertyDescriptor("<<unknown namespace>>");
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      QName qName1 = nodePointer0.getName();
      BeanAttributeIterator beanAttributeIterator2 = new BeanAttributeIterator(beanPointer0, qName1);
      beanAttributeIterator1.getNodePointer();
      beanAttributeIterator0.reset();
      beanAttributeIterator0.prepareForIndividualProperty("m9zboNJ2M5XfAq=FY.");
      beanAttributeIterator0.reset();
      beanAttributeIterator2.setPosition(512);
      jXPathBasicBeanInfo0.toString();
      beanAttributeIterator0.getNodePointer();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      propertyIterator0.reset();
      beanAttributeIterator1.reset();
      beanAttributeIterator2.prepareForIndividualProperty("9cGd&(]hk<");
      PropertyIterator propertyIterator1 = new PropertyIterator(beanPointer0, "actual", false, nullPropertyPointer0);
      propertyIterator1.setPosition(1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "propertyNames");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, nullPropertyPointer0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      NullPointer nullPointer0 = (NullPointer)propertyIterator0.getNodePointer();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      QName qName1 = new QName("`_=~");
      NullPointer nullPointer1 = new NullPointer((QName) null, locale0);
      BeanAttributeIterator beanAttributeIterator1 = null;
      try {
        beanAttributeIterator1 = new BeanAttributeIterator(nullPointer0, (QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.UK;
      Locale locale1 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, jXPathBasicBeanInfo0, jXPathBasicBeanInfo0, locale1);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      beanPointer0.getName();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("No indexed read method for property ");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      propertyIterator0.getNodePointer();
      beanPointer0.getImmediateNode();
      jXPathBasicBeanInfo0.getPropertyDescriptor("<<unknown namespace>>");
      String string0 = "n<`UtztqaA,";
      QName qName0 = new QName("n<`UtztqaA,");
      FileSystemHandling.shouldAllThrowIOExceptions();
      locale0.getDisplayName();
      BeanAttributeIterator beanAttributeIterator0 = null;
      try {
        beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, (QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "propertyNames");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      nullPropertyPointer0.getName();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("propertyNames");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      beanPointer0.getImmediateNode();
      jXPathBasicBeanInfo0.getPropertyDescriptor("<<unknown namespace>>");
      QName qName0 = new QName("propertyNames");
      FileSystemHandling.shouldAllThrowIOExceptions();
      locale0.getDisplayName();
      locale0.getDisplayName();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      beanPointer0.getImmediateValuePointer();
      nullPropertyPointer0.printPointerChain();
      propertyIterator0.getPropertyPointer();
      propertyIterator0.getNodePointer();
      propertyIterator0.getPropertyPointer();
  }
}
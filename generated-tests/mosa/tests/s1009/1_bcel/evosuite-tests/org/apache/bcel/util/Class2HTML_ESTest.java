/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 00:53:50 GMT 2018
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Class2HTML.toHTML("_ode.html\"\n MARGINWIDTH=0 MARGINHEGHT=0 FRAMEBO/DER=1 SCROLLING=\"AUTO\">\n<FRAME NAME=\"Methods\" SRC=\"");
      assertEquals("_ode.html\"\\n MARGINWIDTH=0 MARGINHEGHT=0 FRAMEBO/DER=1 SCROLLING=\"AUTO\"&gt;\\n&lt;FRAME NAME=\"Methods\" SRC=\"", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<BufferedInputStream> class0 = BufferedInputStream.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "R<-$P=3BJume");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-_MB";
      stringArray0[1] = "-_MB";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "`p";
      stringArray0[1] = "-zip";
      stringArray0[2] = "int/";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // int (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[10];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/1_bcel/-d");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      assertTrue(boolean0);
      
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "/";
      stringArray0[2] = "n=1f";
      stringArray0[4] = "m]K0~Q\"\"Vdw<cuv^_^I";
      stringArray0[5] = "E^RZ!5>+L)&qo0o";
      stringArray0[6] = "40-{SI(fJy)=XZI{o!";
      stringArray0[7] = "double";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      assertNotNull(syntheticRepository0);
      
      Class<BufferedInputStream> class0 = BufferedInputStream.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      assertEquals((byte)2, JavaClass.FILE);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)3, JavaClass.ZIP);
      assertFalse(javaClass0.isNative());
      assertFalse(javaClass0.isVolatile());
      assertFalse(javaClass0.isSynthetic());
      assertEquals(37, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertEquals("java.io.FilterInputStream", javaClass0.getSuperclassName());
      assertFalse(javaClass0.isPrivate());
      assertEquals("BufferedInputStream.java", javaClass0.getSourceFileName());
      assertTrue(javaClass0.isClass());
      assertEquals(33, javaClass0.getAccessFlags());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(0, javaClass0.getMinor());
      assertFalse(javaClass0.isAbstract());
      assertFalse(javaClass0.isStrictfp());
      assertFalse(javaClass0.isEnum());
      assertTrue(javaClass0.isSuper());
      assertFalse(javaClass0.isVarArgs());
      assertEquals("java.io", javaClass0.getPackageName());
      assertFalse(javaClass0.isFinal());
      assertFalse(javaClass0.isInterface());
      assertTrue(javaClass0.isPublic());
      assertEquals(33, javaClass0.getModifiers());
      assertTrue(javaClass0.isSynchronized());
      assertEquals(52, javaClass0.getMajor());
      assertFalse(javaClass0.isProtected());
      assertEquals(41, javaClass0.getSuperclassNameIndex());
      assertEquals("java.io.BufferedInputStream", javaClass0.getClassName());
      assertEquals("java.io.BufferedInputStream", javaClass0.getFileName());
      assertNotNull(javaClass0);
      
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "RuntimeVisibleAnnotations");
      assertEquals((byte)2, JavaClass.FILE);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)3, JavaClass.ZIP);
      assertFalse(javaClass0.isNative());
      assertFalse(javaClass0.isVolatile());
      assertFalse(javaClass0.isSynthetic());
      assertEquals(37, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertEquals("java.io.FilterInputStream", javaClass0.getSuperclassName());
      assertFalse(javaClass0.isPrivate());
      assertEquals("BufferedInputStream.java", javaClass0.getSourceFileName());
      assertTrue(javaClass0.isClass());
      assertEquals(33, javaClass0.getAccessFlags());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(0, javaClass0.getMinor());
      assertFalse(javaClass0.isAbstract());
      assertFalse(javaClass0.isStrictfp());
      assertFalse(javaClass0.isEnum());
      assertTrue(javaClass0.isSuper());
      assertFalse(javaClass0.isVarArgs());
      assertEquals("java.io", javaClass0.getPackageName());
      assertFalse(javaClass0.isFinal());
      assertFalse(javaClass0.isInterface());
      assertTrue(javaClass0.isPublic());
      assertEquals(33, javaClass0.getModifiers());
      assertTrue(javaClass0.isSynchronized());
      assertEquals(52, javaClass0.getMajor());
      assertFalse(javaClass0.isProtected());
      assertEquals(41, javaClass0.getSuperclassNameIndex());
      assertEquals("java.io.BufferedInputStream", javaClass0.getClassName());
      assertEquals("java.io.BufferedInputStream", javaClass0.getFileName());
      assertNotNull(class2HTML0);
      
      String string0 = Class2HTML.referenceType("1V|=EI9:]sx$-Tz&3WR");
      assertEquals("<A HREF=\"1V|=EI9:]sx$-Tz&3WR.html\" TARGET=_top>1V|=EI9:]sx$-Tz&3WR</A>", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertFalse(boolean0);
      
      String string0 = Class2HTML.toHTML("org.apache.commons.io.filefilter.CanReadFileFilter");
      assertEquals("org.apache.commons.io.filefilter.CanReadFileFilter", string0);
      assertNotNull(string0);
      
      String string1 = Pattern.quote("org.apache.commons.io.filefilter.CanReadFileFilter");
      assertFalse(string1.equals((Object)string0));
      assertEquals("\\Qorg.apache.commons.io.filefilter.CanReadFileFilter\\E", string1);
      assertNotNull(string1);
      
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      classLoader0.clearAssertionStatus();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      assertNotNull(classLoaderRepository0);
      
      ClassPath classPath0 = classLoaderRepository0.getClassPath();
      assertNull(classPath0);
      
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertEquals(17, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isInterface());
      assertEquals(33, javaClass0.getModifiers());
      assertTrue(javaClass0.isClass());
      assertEquals(33, javaClass0.getAccessFlags());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(0, javaClass0.getMinor());
      assertFalse(javaClass0.isStrictfp());
      assertFalse(javaClass0.isNative());
      assertEquals("java.lang.Object", javaClass0.getClassName());
      assertFalse(javaClass0.isVolatile());
      assertTrue(javaClass0.isSuper());
      assertEquals("java.lang.Object", javaClass0.getFileName());
      assertFalse(javaClass0.isVarArgs());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertEquals("Object.java", javaClass0.getSourceFileName());
      assertEquals(0, javaClass0.getSuperclassNameIndex());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isAnnotation());
      assertTrue(javaClass0.isPublic());
      assertEquals(52, javaClass0.getMajor());
      assertFalse(javaClass0.isPrivate());
      assertEquals("java.lang", javaClass0.getPackageName());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isSynthetic());
      assertFalse(javaClass0.isEnum());
      assertFalse(javaClass0.isProtected());
      assertFalse(javaClass0.isAbstract());
      assertFalse(javaClass0.isFinal());
      assertFalse(javaClass0.isStatic());
      assertNotNull(javaClass0);
      
      classLoader0.clearAssertionStatus();
      javaClass0.dump("4z-M;_<NsCD{:xzs_`");
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertEquals(17, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isInterface());
      assertEquals(33, javaClass0.getModifiers());
      assertTrue(javaClass0.isClass());
      assertEquals(33, javaClass0.getAccessFlags());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(0, javaClass0.getMinor());
      assertFalse(javaClass0.isStrictfp());
      assertFalse(javaClass0.isNative());
      assertEquals("java.lang.Object", javaClass0.getClassName());
      assertFalse(javaClass0.isVolatile());
      assertTrue(javaClass0.isSuper());
      assertEquals("java.lang.Object", javaClass0.getFileName());
      assertFalse(javaClass0.isVarArgs());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertEquals("Object.java", javaClass0.getSourceFileName());
      assertEquals(0, javaClass0.getSuperclassNameIndex());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isAnnotation());
      assertTrue(javaClass0.isPublic());
      assertEquals(52, javaClass0.getMajor());
      assertFalse(javaClass0.isPrivate());
      assertEquals("java.lang", javaClass0.getPackageName());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isSynthetic());
      assertFalse(javaClass0.isEnum());
      assertFalse(javaClass0.isProtected());
      assertFalse(javaClass0.isAbstract());
      assertFalse(javaClass0.isFinal());
      assertFalse(javaClass0.isStatic());
      
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "Qorg.apache.commons.io.filefilter.CanReadFileFilterE");
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertEquals(17, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isInterface());
      assertEquals(33, javaClass0.getModifiers());
      assertTrue(javaClass0.isClass());
      assertEquals(33, javaClass0.getAccessFlags());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(0, javaClass0.getMinor());
      assertFalse(javaClass0.isStrictfp());
      assertFalse(javaClass0.isNative());
      assertEquals("java.lang.Object", javaClass0.getClassName());
      assertFalse(javaClass0.isVolatile());
      assertTrue(javaClass0.isSuper());
      assertEquals("java.lang.Object", javaClass0.getFileName());
      assertFalse(javaClass0.isVarArgs());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertEquals("Object.java", javaClass0.getSourceFileName());
      assertEquals(0, javaClass0.getSuperclassNameIndex());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isAnnotation());
      assertTrue(javaClass0.isPublic());
      assertEquals(52, javaClass0.getMajor());
      assertFalse(javaClass0.isPrivate());
      assertEquals("java.lang", javaClass0.getPackageName());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isSynthetic());
      assertFalse(javaClass0.isEnum());
      assertFalse(javaClass0.isProtected());
      assertFalse(javaClass0.isAbstract());
      assertFalse(javaClass0.isFinal());
      assertFalse(javaClass0.isStatic());
      assertNotNull(class2HTML0);
      
      String string2 = Class2HTML.referenceType("int");
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertEquals("<FONT COLOR=\"#00FF00\">int</FONT>", string2);
      assertNotNull(string2);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "4z-M;_<NsCD{:xzs_`";
      Class2HTML.main(stringArray0);
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(7);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `CONSTANT_Class' at index 7 and got CONSTANT_Methodref[10](class_index = 17, name_and_type_index = 56)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
}
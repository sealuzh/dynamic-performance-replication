/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 18:01:17 GMT 2018
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("j0vGyVqM_qb");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<BufferedInputStream> class0 = BufferedInputStream.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "j0vGyVqM_qb");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "yWO@0MJ25*IFde6";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-nIZ";
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      Class2HTML.main(stringArray0);
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      ClassPathRepository classPathRepository0 = new ClassPathRepository((ClassPath) null);
      assertNotNull(classPathRepository0);
      
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)2, JavaClass.FILE);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals("MockHijrahDate.java", javaClass0.getSourceFileName());
      assertFalse(javaClass0.isAbstract());
      assertEquals("org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate", javaClass0.getFileName());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isFinal());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertTrue(javaClass0.isPublic());
      assertFalse(javaClass0.isVarArgs());
      assertFalse(javaClass0.isInterface());
      assertTrue(javaClass0.isSuper());
      assertFalse(javaClass0.isProtected());
      assertFalse(javaClass0.isStrictfp());
      assertEquals(4, javaClass0.getSuperclassNameIndex());
      assertEquals(52, javaClass0.getMajor());
      assertFalse(javaClass0.isVolatile());
      assertEquals("org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate", javaClass0.getClassName());
      assertEquals(33, javaClass0.getModifiers());
      assertFalse(javaClass0.isNative());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertEquals(2, javaClass0.getClassNameIndex());
      assertEquals(0, javaClass0.getMinor());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(33, javaClass0.getAccessFlags());
      assertFalse(javaClass0.isEnum());
      assertFalse(javaClass0.isSynthetic());
      assertFalse(javaClass0.isTransient());
      assertEquals("org.evosuite.runtime.mock.java.time.chrono", javaClass0.getPackageName());
      assertFalse(javaClass0.isPrivate());
      assertTrue(javaClass0.isClass());
      assertNotNull(javaClass0);
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-zip";
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "invokestatic";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d";
      stringArray0[3] = "-zip";
      stringArray0[4] = "-d";
      stringArray0[5] = "</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"ConstantPool\" SRC=\"";
      stringArray0[6] = "</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"ConstantPool\" SRC=\"";
      stringArray0[7] = "</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"ConstantPool\" SRC=\"";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // -d (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = Class2HTML.toHTML("-d");
      assertEquals("-d", string0);
      assertNotNull(string0);
      
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      assertNotNull(classLoaderRepository0);
      
      ClassPath classPath0 = classLoaderRepository0.getClassPath();
      assertNull(classPath0);
      
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "!16'g$V]$W";
      stringArray0[2] = "java.time.Clock";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d/";
      stringArray0[5] = "-d";
      stringArray0[6] = "-d";
      stringArray0[7] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = Class2HTML.toHTML("</TITLE></HEAD><FRAMSE BORDER=1 c_ls=\"30%,*\">\n<FRAMESET BORDER=1 rows\"80%,*\">\n<FRAME NAM=\"ConstantPool\" SRC=\"");
      assertEquals("&lt;/TITLE&gt;&lt;/HEAD&gt;&lt;FRAMSE BORDER=1 c_ls=\"30%,*\"&gt;\\n&lt;FRAMESET BORDER=1 rows\"80%,*\"&gt;\\n&lt;FRAME NAM=\"ConstantPool\" SRC=\"", string0);
      assertNotNull(string0);
      
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      java.lang.ClassLoader classLoader1 = classLoader0.getParent();
      assertFalse(classLoader1.equals((Object)classLoader0));
      assertNotNull(classLoader1);
      
      ClassPath classPath0 = new ClassPath("</TITLE></HEAD><FRAMSE BORDER=1 c_ls=\"30%,*\">\n<FRAMESET BORDER=1 rows\"80%,*\">\n<FRAME NAM=\"ConstantPool\" SRC=\"");
      assertNotNull(classPath0);
      
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      assertNotNull(classPathRepository0);
      
      Class<BufferedInputStream> class0 = BufferedInputStream.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertFalse(javaClass0.isInterface());
      assertFalse(javaClass0.isFinal());
      assertEquals(0, javaClass0.getMinor());
      assertEquals("java.io.BufferedInputStream", javaClass0.getFileName());
      assertEquals(33, javaClass0.getAccessFlags());
      assertTrue(javaClass0.isClass());
      assertFalse(javaClass0.isEnum());
      assertFalse(javaClass0.isStrictfp());
      assertFalse(javaClass0.isVarArgs());
      assertEquals("java.io.FilterInputStream", javaClass0.getSuperclassName());
      assertTrue(javaClass0.isSuper());
      assertFalse(javaClass0.isAbstract());
      assertEquals("BufferedInputStream.java", javaClass0.getSourceFileName());
      assertFalse(javaClass0.isNative());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(37, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isVolatile());
      assertTrue(javaClass0.isPublic());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertEquals("java.io.BufferedInputStream", javaClass0.getClassName());
      assertEquals(52, javaClass0.getMajor());
      assertEquals("java.io", javaClass0.getPackageName());
      assertFalse(javaClass0.isPrivate());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isSynthetic());
      assertEquals(41, javaClass0.getSuperclassNameIndex());
      assertFalse(javaClass0.isProtected());
      assertEquals(33, javaClass0.getModifiers());
      assertNotNull(javaClass0);
      
      javaClass0.setClassName("&lt;/TITLE&gt;&lt;/HEAD&gt;&lt;FRAMSE BORDER=1 c_ls=\"30%,*\"&gt;\n&lt;FRAMESET BORDER=1 rows\"80%,*\"&gt;\n&lt;FRAME NAM=\"ConstantPool\" SRC=\"");
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertFalse(javaClass0.isInterface());
      assertFalse(javaClass0.isFinal());
      assertEquals(0, javaClass0.getMinor());
      assertEquals("java.io.BufferedInputStream", javaClass0.getFileName());
      assertEquals("&lt;/TITLE&gt;&lt;/HEAD&gt;&lt;FRAMSE BORDER=1 c_ls=\"30%,*\"&gt;\n&lt;FRAMESET BORDER=1 rows\"80%,*\"&gt;\n&lt;FRAME NAM=\"ConstantPool\" SRC=\"", javaClass0.getClassName());
      assertEquals(33, javaClass0.getAccessFlags());
      assertTrue(javaClass0.isClass());
      assertFalse(javaClass0.isEnum());
      assertFalse(javaClass0.isStrictfp());
      assertFalse(javaClass0.isVarArgs());
      assertEquals("java.io.FilterInputStream", javaClass0.getSuperclassName());
      assertTrue(javaClass0.isSuper());
      assertFalse(javaClass0.isAbstract());
      assertEquals("BufferedInputStream.java", javaClass0.getSourceFileName());
      assertFalse(javaClass0.isNative());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(37, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isVolatile());
      assertTrue(javaClass0.isPublic());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertEquals(52, javaClass0.getMajor());
      assertEquals("java.io", javaClass0.getPackageName());
      assertFalse(javaClass0.isPrivate());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isSynthetic());
      assertEquals(41, javaClass0.getSuperclassNameIndex());
      assertFalse(javaClass0.isProtected());
      assertEquals(33, javaClass0.getModifiers());
      
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "&lt;/TITLE&gt;&lt;/HEAD&gt;&lt;FRAMSE BORDER=1 c_ls=\"30%,*\"&gt;\n&lt;FRAMESET BORDER=1 rows\"80%,*\"&gt;\n&lt;FRAME NAM=\"ConstantPool\" SRC=\"");
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertFalse(javaClass0.isInterface());
      assertFalse(javaClass0.isFinal());
      assertEquals(0, javaClass0.getMinor());
      assertEquals("java.io.BufferedInputStream", javaClass0.getFileName());
      assertEquals("&lt;/TITLE&gt;&lt;/HEAD&gt;&lt;FRAMSE BORDER=1 c_ls=\"30%,*\"&gt;\n&lt;FRAMESET BORDER=1 rows\"80%,*\"&gt;\n&lt;FRAME NAM=\"ConstantPool\" SRC=\"", javaClass0.getClassName());
      assertEquals(33, javaClass0.getAccessFlags());
      assertTrue(javaClass0.isClass());
      assertFalse(javaClass0.isEnum());
      assertFalse(javaClass0.isStrictfp());
      assertFalse(javaClass0.isVarArgs());
      assertEquals("java.io.FilterInputStream", javaClass0.getSuperclassName());
      assertTrue(javaClass0.isSuper());
      assertFalse(javaClass0.isAbstract());
      assertEquals("BufferedInputStream.java", javaClass0.getSourceFileName());
      assertFalse(javaClass0.isNative());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(37, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isVolatile());
      assertTrue(javaClass0.isPublic());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertEquals(52, javaClass0.getMajor());
      assertEquals("java.io", javaClass0.getPackageName());
      assertFalse(javaClass0.isPrivate());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isSynthetic());
      assertEquals(41, javaClass0.getSuperclassNameIndex());
      assertFalse(javaClass0.isProtected());
      assertEquals(33, javaClass0.getModifiers());
      assertNotNull(class2HTML0);
      
      // Undeclared exception!
      try { 
        Class2HTML.referenceType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Utility", e);
      }
  }
}
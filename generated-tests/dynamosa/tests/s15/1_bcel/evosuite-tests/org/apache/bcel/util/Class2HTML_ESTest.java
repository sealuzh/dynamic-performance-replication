/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:59:58 GMT 2019
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.bcel.util.MemorySensitiveClassPathRepository;
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "void";
      stringArray0[1] = "</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"ConstantPool\" SRC=\"";
      stringArray0[2] = ";XvC";
      stringArray0[3] = ",Ycah*>";
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
  public void test01()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      MemorySensitiveClassPathRepository memorySensitiveClassPathRepository0 = new MemorySensitiveClassPathRepository(classPath0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = memorySensitiveClassPathRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, (String) null);
      String string0 = Class2HTML.referenceClass((byte)1);
      assertEquals("<A HREF=\"java.lang.Object_cp.html#cp1\" TARGET=ConstantPool>StringBuilder</A>", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Class2HTML.referenceType("apUq\u0002+k&|`8R`~ I:");
      assertEquals("<A HREF=\"apUq\u0002+k&|`8R`~ I:.html\" TARGET=_top>apUq\u0002+k&|`8R`~ I:</A>", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Class2HTML.referenceType("");
      assertEquals("<A HREF=\".html\" TARGET=_top></A>", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(0);
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
      // Undeclared exception!
      try { 
        Class2HTML.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.toHTML((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "!`6Wwp3g\"u");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((byte)2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `CONSTANT_Class' at index 2 and got CONSTANT_Methodref[10](class_index = 1, name_and_type_index = 58)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-400));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Dorne.");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      String[] stringArray0 = new String[6];
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[0] = "Dorne.";
      stringArray0[1] = "Dorne.";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d";
      stringArray0[5] = "Dorne.";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("</T>\n");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "</T>\n";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassPath classPath0 = new ClassPath((ClassPath) null, "uUM%S@goaR");
      MemorySensitiveClassPathRepository memorySensitiveClassPathRepository0 = new MemorySensitiveClassPathRepository(classPath0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = memorySensitiveClassPathRepository0.loadClass(class0);
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      javaClass0.setConstantPool(constantPool0);
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML(javaClass0, "<init>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 24. Constant pool size is: 3
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, "org.apache.bcel.util.Class2HTML");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("shortjava.lang.Object_code.html");
      FileSystemHandling.createFolder(evoSuiteFile0);
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML(javaClass0, "short");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      javaClass0.setClassName("");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Class2HTML.toHTML("</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"ConstantPool\" SRC=\"");
      assertEquals("&lt;/TITLE&gt;&lt;/HEAD&gt;\\n&lt;FRAMESET BORDER=1 cols=\"30%,*\"&gt;\\n&lt;FRAMESET BORDER=1 rows=\"80%,*\"&gt;\\n&lt;FRAME NAME=\"ConstantPool\" SRC=\"", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "`;]");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "</T>\n";
      stringArray0[1] = "-zip";
      stringArray0[2] = "</T>\n";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // </T>
         //  (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-/";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      stringArray0[4] = "-/";
      Class2HTML.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      stringArray0[1] = "<A HREF=\"-d.html\" TARGET=_top>-d</A>";
      Class2HTML.main(stringArray0);
      Class2HTML.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }
}
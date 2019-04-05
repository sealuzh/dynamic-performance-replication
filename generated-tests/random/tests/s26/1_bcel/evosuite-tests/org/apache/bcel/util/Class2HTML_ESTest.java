/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 11:24:00 GMT 2019
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.bcel.util.MemorySensitiveClassPathRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = " .PG([i:`~#JniJ";
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
  public void test01()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      JavaClass javaClass1 = javaClass0.getSuperClass();
      Class2HTML class2HTML0 = new Class2HTML(javaClass1, "-d");
      String string0 = Class2HTML.referenceClass((byte)1);
      assertEquals("<A HREF=\"java.lang.Object_cp.html#cp1\" TARGET=ConstantPool>StringBuilder</A>", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.referenceType("KkbX.rqkhN,<");
      assertEquals("<A HREF=\"KkbX.rqkhN,<.html\" TARGET=_top>KkbX.rqkhN,<</A>", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Class2HTML.referenceType("");
      assertEquals("<A HREF=\".html\" TARGET=_top></A>", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-640));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, (String) null);
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
      String string0 = Class2HTML.toHTML("</A></LI>\n");
      assertEquals("&lt;/A&gt;&lt;/LI&gt;\\n", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "<illegal opcode>";
      stringArray0[1] = "D6A,EUb{Cr|7O";
      stringArray0[2] = "-zip";
      stringArray0[3] = "-zip";
      stringArray0[4] = "<illegal opcode>";
      stringArray0[5] = "<illegal opcode>";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // -zip (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "4^f9|`CSwJ@UbANsM";
      stringArray0[1] = "java.util.List";
      stringArray0[2] = "-dimensional";
      stringArray0[3] = "R]*!h:^94Gs`5:NI";
      stringArray0[4] = "Done.";
      stringArray0[5] = "PMGClass";
      stringArray0[6] = "8_=@H";
      stringArray0[7] = "-d";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.apache.bcel.classfile.ConstantDouble");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "java.lang.NumberFormatException");
      stringArray0[8] = "org.apache.bcel.classfile.ConstantDouble";
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
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "m)rTY:_%.o";
      stringArray0[1] = "java.util.StringJoiner";
      stringArray0[2] = "-d";
      stringArray0[3] = "org.apache.bcel.classfile.ConstantDouble/";
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
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d";
      stringArray0[5] = "-d";
      Class2HTML.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MemorySensitiveClassPathRepository memorySensitiveClassPathRepository0 = new MemorySensitiveClassPathRepository((ClassPath) null);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = memorySensitiveClassPathRepository0.loadClass(class0);
      javaClass0.setClassName("-");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "byte");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      JavaClass javaClass1 = javaClass0.getSuperClass();
      Class2HTML class2HTML0 = new Class2HTML(javaClass1, "-d");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((byte)3);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `CONSTANT_Class' at index 3 and got CONSTANT_Methodref[10](class_index = 17, name_and_type_index = 59)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
}
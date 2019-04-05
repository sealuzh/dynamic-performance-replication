/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 16:45:41 GMT 2019
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.FileNotFoundException;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassPath;
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
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      JavaClass javaClass0 = syntheticRepository0.loadClass("org.apache.commons.io.IOCase");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "Tried to create the directory ");
      String string0 = Class2HTML.referenceClass((byte)3);
      assertEquals("<A HREF=\"org.apache.commons.io.IOCase_cp.html#cp3\" TARGET=ConstantPool>[Lorg.apache.commons.io.IOCase;</A>", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.referenceType(" but failed");
      assertEquals("<A HREF=\" but failed.html\" TARGET=_top> but failed</A>", string0);
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
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-237));
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
         verifyException("org.apache.bcel.util.Class2HTML", e);
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("WSLV>~&N]#'!");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "\"V'LWRiZg");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "WSLV>~&N]#'!";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // WSLV>~&N]#'! is not a Java .class file
         //
         verifyException("org.apache.bcel.classfile.ClassParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[16];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("5f]sk)cVkk>RG9s:");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "5f]sk)cVkk>RG9s:";
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
  public void test14()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      JavaClass javaClass0 = syntheticRepository0.loadClass("java.lang.StringBuilder");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "java.lang.StringBuilder");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, "_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.apache.commons.io.IOCaseorg.apache.commons.io.IOCase_cp.html");
      FileSystemHandling.createFolder(evoSuiteFile0);
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      JavaClass javaClass0 = syntheticRepository0.loadClass("org.apache.commons.io.IOCase");
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML(javaClass0, "org.apache.commons.io.IOCase");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MemorySensitiveClassPathRepository memorySensitiveClassPathRepository0 = new MemorySensitiveClassPathRepository((ClassPath) null);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = memorySensitiveClassPathRepository0.loadClass(class0);
      javaClass0.setClassName("-d");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "?");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = Class2HTML.toHTML("_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"");
      assertEquals("_cp.html\"\\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\"&gt;\\n&lt;FRAME NAME=\"Attributes\" SRC=\"", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-zip";
      stringArray0[1] = "9jImiE$?Z";
      stringArray0[2] = "IrzP.z";
      stringArray0[3] = "flI2i";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // 9jImiE$?Z (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d/";
      stringArray0[2] = "-d/";
      stringArray0[3] = "-d/";
      stringArray0[4] = "-d";
      stringArray0[5] = "-d";
      stringArray0[6] = "-d";
      stringArray0[7] = "-d/";
      Class2HTML.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-d";
      stringArray0[1] = "&lt;A HREF=\"-d.html\" TARGET=_top&gt;-d&lt;/A&gt;";
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
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-d";
      stringArray0[1] = "&lt;A HREF=\"-d.html\" TARGET=_top&gt;-d&lt;/A&gt;";
      stringArray0[2] = "<A HREF=\"-d.html\" TARGET=_top>-d</A>";
      stringArray0[3] = "&lt;A HREF=\"-d.html\" TARGET=_top&gt;-d&lt;/A&gt;";
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
  public void test23()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "java.lang.Number");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      JavaClass javaClass0 = syntheticRepository0.loadClass("org.apache.commons.io.IOCase");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "org.apache.commons.io.IOCase");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((byte)1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `CONSTANT_Class' at index 1 and got CONSTANT_Fieldref[9](class_index = 4, name_and_type_index = 111)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
}

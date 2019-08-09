/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 16:16:06 GMT 2019
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "</A>&nbsp<A HREF=\"");
      String string0 = Class2HTML.referenceClass((byte)3);
      assertEquals("<A HREF=\"java.io.InputStream_cp.html#cp3\" TARGET=ConstantPool>NullPointerException</A>", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.referenceType(":e[p-77");
      assertEquals("<A HREF=\":e.html\" TARGET=_top>:e[p-77</A>", string0);
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
        Class2HTML.referenceClass((-240));
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "L%KkLqoMo\u0002 ");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((byte)1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `CONSTANT_Class' at index 1 and got CONSTANT_Methodref[10](class_index = 15, name_and_type_index = 61)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "#roLMJ,^>+GA RUV@|";
      stringArray0[1] = "Is&3HVSkATATrdP374";
      stringArray0[2] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-zip";
      stringArray0[2] = "iconst_0";
      stringArray0[3] = "q3mLce:d~<j5*%{.a&o";
      stringArray0[4] = "iconst_0";
      stringArray0[5] = "q3mLce:d~<j5*%{.a&o";
      stringArray0[6] = "java.lang.String$1";
      stringArray0[7] = "-zip";
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
  public void test12()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<String> class0 = String.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "3T");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "<P>");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, "false");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Class2HTML.toHTML("_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>");
      assertEquals("_methods.html\"\\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\"&gt;\\n&lt;/FRAMESET&gt;&lt;/FRAMESET&gt;&lt;/HTML&gt;", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = ");w2d/?xT^h-X";
      stringArray0[1] = "-zip";
      stringArray0[2] = "q3mLce:d~<5*%{.az&o";
      stringArray0[3] = "iconst_0";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // q3mLce:d~<5*%{.az&o (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "O^>+ug2^OLwG6cu";
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      MockFile mockFile0 = new MockFile("O^>+ug2^OLwG6cu");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      javaClass0.dump((OutputStream) mockFileOutputStream0);
      Class2HTML.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = ");w2d/?xT^h-X";
      stringArray0[1] = "-z";
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
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("-d");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      String[] stringArray0 = new String[14];
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
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      stringArray0[2] = "(i>fy5AcshS}\"6\"gj";
      stringArray0[3] = "-d";
      stringArray0[4] = "(i>fy5AcshS}\"6\"gj";
      stringArray0[5] = "(i>fy5AcshS}\"6\"gj";
      stringArray0[6] = "-d";
      stringArray0[7] = "(i>fy5AcshS}\"6\"gj";
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
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "(i>fy5AcshS}\"6\"gj";
      stringArray0[1] = "(i>fy5AcshS}\"6\"gj";
      stringArray0[2] = "<A HREF=\"-d.html\" TARGET=_top>-d</A>";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d/";
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
  public void test23()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassName("float");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "`[n");
  }
}
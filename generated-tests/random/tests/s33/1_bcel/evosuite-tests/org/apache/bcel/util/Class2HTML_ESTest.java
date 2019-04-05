/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 18:14:41 GMT 2019
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Class2HTML.referenceType("-d");
      assertEquals("<A HREF=\"-d.html\" TARGET=_top>-d</A>", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "+I!\"^@p1tH");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-349));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -349. Constant pool size is: 78
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(153);
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
      String[] stringArray0 = new String[6];
      stringArray0[0] = "m5y}|2Y";
      stringArray0[1] = "z+djg_MEaX";
      stringArray0[2] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassPathRepository classPathRepository0 = new ClassPathRepository((ClassPath) null);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "xF@V8gwt- -bFYY");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Class2HTML.toHTML(")</A>\n<LI><A HREF=\"#cp");
      assertEquals(")&lt;/A&gt;\\n&lt;LI&gt;&lt;A HREF=\"#cp", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "</A>";
      stringArray0[1] = "YaT4`j_KR(R|>308h";
      stringArray0[2] = "&lt;anonymous&gt;";
      stringArray0[3] = "-zip";
      stringArray0[4] = "<FONT COLOR=\"#00FF00\">";
      stringArray0[5] = "hdR8";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // <FONT COLOR=\"#00FF00\"> (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "<A HREF=\"java.io.InputStream_cp.html#cp3\" TARGET=ConstantPool>NullPointerException</A>";
      stringArray0[1] = "-d";
      stringArray0[2] = "<A HREF=\"java.io.InputStream_cp.html#cp3\" TARGET=ConstantPool>NullPointerException</A>";
      stringArray0[3] = "<A HREF=\"java.io.InputStream_cp.html#cp3\" TARGET=ConstantPool>NullPointerException</A>";
      stringArray0[4] = "-d";
      stringArray0[5] = "-d";
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
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "&O(XPJc8yh]ce^Q";
      stringArray0[1] = "-";
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[2] = "-d";
      stringArray0[3] = "I41d9?uk";
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
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "<A HREF=\"-d.html\" TARGET=_top>-d</A>";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d";
      stringArray0[5] = "-d";
      stringArray0[6] = "-d";
      stringArray0[7] = "org.apache.commons.io.filefilter.CanReadFileFilter";
      Class2HTML.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassName("dsub");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "d");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "-d");
      String string0 = Class2HTML.referenceClass((byte)3);
      assertEquals("<A HREF=\"java.io.InputStream_cp.html#cp3\" TARGET=ConstantPool>NullPointerException</A>", string0);
  }
}
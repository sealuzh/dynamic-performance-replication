/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:41:15 GMT 2019
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
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Class2HTML.referenceType("double");
      assertEquals("<FONT COLOR=\"#00FF00\">double</FONT>", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.referenceType("");
      assertEquals("<A HREF=\".html\" TARGET=_top></A>", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-3049));
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
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(3176);
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
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n</FRAMESET>\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Code\" SRC=\"");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, "java.lang.CharSequence");
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
      String string0 = Class2HTML.toHTML("_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>");
      assertEquals("_methods.html\"\\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\"&gt;\\n&lt;/FRAMESET&gt;&lt;/FRAMESET&gt;&lt;/HTML&gt;", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-zip";
      stringArray0[1] = "ssz";
      stringArray0[2] = "J";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // ssz (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "S{)a-Ak=YF(eduI$V";
      stringArray0[1] = " not found.";
      stringArray0[2] = "float";
      stringArray0[3] = "e";
      stringArray0[4] = "ubZb,";
      stringArray0[5] = "-d";
      stringArray0[6] = "S{)a-Ak=YF(eduI$V";
      stringArray0[7] = "short";
      stringArray0[8] = "9awf{\"D)@kHk^caI?";
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
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "m";
      stringArray0[1] = "-d/";
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
  public void test12()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "S{)a-Ak=YF(eduI$V";
      stringArray0[1] = " not found.";
      stringArray0[2] = "float";
      stringArray0[3] = "e";
      stringArray0[4] = "ubZb,";
      stringArray0[5] = "-d";
      stringArray0[6] = "S{)a-Ak=YF(eduI$V";
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d";
      stringArray0[5] = "S";
      stringArray0[6] = "-d";
      stringArray0[7] = "-d";
      Class2HTML.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassName("double");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "MvJ^OS:F1P;1hb!");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance(classPath0);
      Class<BufferedInputStream> class0 = BufferedInputStream.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "(Ef_e");
  }
}

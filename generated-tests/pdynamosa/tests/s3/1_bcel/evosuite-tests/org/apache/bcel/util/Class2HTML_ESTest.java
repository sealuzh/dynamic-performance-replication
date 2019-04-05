/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:20:33 GMT 2019
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-d";
      stringArray0[1] = "kkN4VO@,nz[gZzdD";
      stringArray0[2] = "_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>";
      stringArray0[3] = "-d";
      stringArray0[4] = "kkN4VO@,nz[gZzdD";
      stringArray0[5] = "%{3\"a#;/WWkf";
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
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "-");
      String string0 = Class2HTML.referenceClass((byte)3);
      assertEquals("<A HREF=\"java.io.InputStream_cp.html#cp3\" TARGET=ConstantPool>NullPointerException</A>", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Class2HTML.referenceType("-zip");
      assertEquals("<A HREF=\"-zip.html\" TARGET=_top>-zip</A>", string0);
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
        Class2HTML.referenceClass((byte)3);
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
        Class2HTML.referenceClass((-762));
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
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[6];
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
      String[] stringArray0 = new String[6];
      stringArray0[0] = "<A HREF=\"-zip.html\" TARGET=_top>-zip</A>";
      stringArray0[1] = "-zip";
      stringArray0[3] = "<A HREF=\"-zip.html\" TARGET=_top>-zip</A>";
      stringArray0[4] = "<A HREF=\"-zip.html\" TARGET=_top>-zip</A>";
      stringArray0[5] = "-zip";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      Class<String> class0 = String.class;
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "]+T%-X7!\"N");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, "org.apache.bcel.classfile.ConstantUtf8");
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
      String string0 = Class2HTML.toHTML("_code.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n<FRAME NAME=\"Methods\" SRC=\"");
      assertEquals("_code.html\"\\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\"&gt;\\n&lt;FRAME NAME=\"Methods\" SRC=\"", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "<A HREF=\"-zip.html\" TARGET=_top>-zip</A>";
      stringArray0[1] = "<A HREF=\"-zip.html\" TARGET=_top>-zip</A>";
      stringArray0[2] = "<A HREF=\"-zip.html\" TARGET=_top>-zip</A>";
      stringArray0[3] = "-zip";
      stringArray0[5] = "-zip";
      stringArray0[6] = "<A HREF=\"-zip.html\" TARGET=_top>-zip</A>";
      stringArray0[7] = "Done.";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // <A HREF=\"-zip.html\" TARGET=_top>-zip</A> (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[4];
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
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d";
      stringArray0[3] = "WP1P0L|%/#XF1bxm/";
      Class2HTML.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "java.lang.Throwable";
      stringArray0[1] = "org.apache.commons.io.filefilter.NotFileFilter";
      stringArray0[2] = ".4Fs+R.E*;'+b";
      stringArray0[3] = "java.lang.String";
      stringArray0[4] = "K*3oAp^a|1t>G)V6]Z!";
      stringArray0[5] = "-skCw6DM(Z1";
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
  public void test21()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("iinc");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      javaClass0.setClassName("iinc");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "iinc");
  }
}

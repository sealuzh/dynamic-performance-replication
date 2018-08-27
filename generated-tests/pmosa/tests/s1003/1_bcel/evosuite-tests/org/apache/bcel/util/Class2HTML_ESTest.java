/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 23:32:16 GMT 2018
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.time.chrono.ChronoLocalDate;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Class2HTML.toHTML("");
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
      int int0 = (-3298);
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-3298));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      Class2HTML.toHTML("\"1PD PMC3uA");
      Class2HTML.main(stringArray0);
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(2400);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class2HTML.referenceType("DRli-a7B`vj=,=7r7");
      Class2HTML.toHTML("DRli-a7B`vj=,=7r7");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "DRli-a7B`vj=,=7r7";
      stringArray0[1] = "<A HREF=\"DRli-a7B`vj=,=7r7.html\" TARGET=_top>DRli-a7B`vj=,=7r7</A>";
      stringArray0[2] = "<A HREF=\"DRli-a7B`vj=,=7r7.html\" TARGET=_top>DRli-a7B`vj=,=7r7</A>";
      stringArray0[3] = "DRli-a7B`vj=,=7r7";
      stringArray0[4] = "<A HREF=\"DRli-a7B`vj=,=7r7.html\" TARGET=_top>DRli-a7B`vj=,=7r7</A>";
      stringArray0[5] = "DRli-a7B`vj=,=7r7";
      stringArray0[6] = "DRli-a7B`vj=,=7r7";
      stringArray0[7] = "DRli-a7B`vj=,=7r7";
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
  public void test04()  throws Throwable  {
      Class2HTML.toHTML("_code.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER?1/SCROLLING=\"AUTO\"8\n<FRAME NAME=\"MethCds\" SRC=\"");
      Class2HTML.toHTML("java.time.temporal.TemporalQuery");
      ClassPath classPath0 = new ClassPath("_code.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER?1/SCROLLING=\"AUTO\"8\n&lt;FRAME NAME=\"MethCds\" SRC=\"");
      ClassPath classPath1 = new ClassPath(classPath0, "_code.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER?1/SCROLLING=\"AUTO\"8\n<FRAME NAME=\"MethCds\" SRC=\"");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath1);
      JavaClass javaClass0 = classPathRepository0.loadClass("java.time.temporal.TemporalQuery");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "_code.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER?1/SCROLLING=\"AUTO\"8\n&lt;FRAME NAME=\"MethCds\" SRC=\"");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("7pNn:wH[p");
      ClassPath classPath1 = new ClassPath(classPath0, "7pNn:wH[p");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath1);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      javaClass0.setSuperclassName("7pNn:wH[p");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "7pNn:wH[p");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "-zip");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Method> class0 = Method.class;
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      javaClass0.setClassName("-e;r'o");
      String string0 = "fstore_0";
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, ".html\" TARGET=_top>");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[8];
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      stringArray0[0] = "5";
      stringArray0[1] = " but failed";
      stringArray0[2] = "-BL(7g*l]<m\"yD9Q";
      stringArray0[3] = ",Efas.8Zh)/F}";
      stringArray0[4] = "d5tucVZ.f$";
      stringArray0[5] = "(J";
      stringArray0[6] = "/b_[:Fs@}oCa*bw4";
      stringArray0[7] = "Class2HTML: No input files specified.";
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
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-d/";
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
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "java.lang.reflect.AnnotatedElement";
      stringArray0[1] = "-d";
      stringArray0[2] = "_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>";
      stringArray0[3] = "_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>";
      stringArray0[4] = "'OuD1C:]Ey";
      stringArray0[5] = "_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>";
      stringArray0[6] = "_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>";
      stringArray0[7] = "_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>";
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
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "boolean";
      stringArray0[1] = "-zip";
      stringArray0[2] = "char";
      stringArray0[3] = "sAjoxF]&\"Uy;fYh_G31";
      stringArray0[4] = ", name_and_type_index = ";
      stringArray0[5] = "lC\"YCP*QjQnqR@9";
      stringArray0[6] = "A@UftLe#d`W^O";
      stringArray0[7] = "-c OaWo nBVGgPt!p";
      stringArray0[8] = "<TABLE BORDER=1><TR>";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // char (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      stringArray0[2] = "<tfQjS6.wL1JV";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d";
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
  public void test14()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "float";
      stringArray0[1] = "-d";
      stringArray0[2] = "_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\"&gt;\n&lt;/FRAMESET&gt;\n&lt;FRAMESET BORDER=1 rows=\"80%,*\"&gt;\n&lt;FRAME NAME=\"Code\" SRC=\"/";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d";
      stringArray0[6] = "-d";
      stringArray0[6] = "-d";
      stringArray0[7] = "-d";
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
}

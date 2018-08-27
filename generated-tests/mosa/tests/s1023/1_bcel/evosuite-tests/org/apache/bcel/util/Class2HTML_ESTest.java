/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:08:05 GMT 2018
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
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "boolean");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<Method> class0 = Method.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "tObI/QT!D");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "d%g89px%56%}=}K9Qx";
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
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-yvMs<g^T0N$";
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
  public void test4()  throws Throwable  {
      Class2HTML.referenceType("F<A64:");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "F<A64:";
      stringArray0[1] = "-zip";
      stringArray0[2] = "F<A64:";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // F<A64: (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      stringArray0[1] = "?+K% BA55QE";
      Class2HTML.main(stringArray0);
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("SeS tem");
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "SeS tem";
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      javaClass0.setClassName("SeS tem");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "SeS tem");
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class2HTML.toHTML("_code.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n<FRAME NAME=\"Methods\" SRC=\"");
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-d";
      stringArray0[1] = "sun.reflect.generics.factory.CoreReflectionFactory";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d";
      stringArray0[5] = "uW7>dyk/";
      stringArray0[6] = "-d";
      stringArray0[7] = "B{'`";
      stringArray0[8] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }
}
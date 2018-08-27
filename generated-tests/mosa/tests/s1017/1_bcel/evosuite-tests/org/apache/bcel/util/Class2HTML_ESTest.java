/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:13:24 GMT 2018
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.chrono.ChronoLocalDate;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "t/Tw>\n";
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
  public void test1()  throws Throwable  {
      Class2HTML.toHTML("-da");
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-da";
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
  public void test2()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, (String) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class2HTML.toHTML("K`/2QD8");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-zip";
      stringArray0[1] = "K`/2QD8";
      stringArray0[2] = "K`/2QD8";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // K`/2QD8 (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "+Y&");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class2HTML.toHTML("t/Tw>\n");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "t/Tw&gt;\n";
      stringArray0[1] = "-d";
      stringArray0[2] = "t/Tw&gt;\n";
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
  public void test6()  throws Throwable  {
      Class2HTML.toHTML("t/Tw>\n");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-d";
      stringArray0[1] = "t/Tw&gt;\n";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      Class2HTML.main(stringArray0);
      Class2HTML.toHTML("putStatic");
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      classLoader0.getParent();
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      stringArray0[1] = "t/\u0005Twy\n/";
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      classLoader0.getParent();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      stringArray0[1] = "t/\u0005Twy\n/";
      Class2HTML.main(stringArray0);
  }
}
/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:43:06 GMT 2018
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = Class2HTML.toHTML("_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n</FRAMESET>\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Code\" SRC=\"");
      assertEquals("_attributes.html\"\\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\"&gt;\\n&lt;/FRAMESET&gt;\\n&lt;FRAMESET BORDER=1 rows=\"80%,*\"&gt;\\n&lt;FRAME NAME=\"Code\" SRC=\"", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "?vDm>\"I";
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
  public void test2()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDoR=\"1\" SCROLLING=\"AUTO\">\n</FRAMESET>\n<FRAMESET UORDER=1 rowsD\"80%,*\">\n<FRAME NAME=\"Code\" SRC=\"");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = Class2HTML.referenceType("[dkQy,Y\"ogf7y");
      assertEquals("<A HREF=\".html\" TARGET=_top>[dkQy,Y\"ogf7y</A>", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      javaClass0.setClassName("\t<");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "java.lang.StringBuilder");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-7097));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -7097. Constant pool size is: 62
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      stringArray0[1] = "f:p90";
      Class2HTML.main(stringArray0);
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[1] = "-d";
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-Pd";
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = ".html\" TARGET=_top>";
      stringArray0[1] = "PrB0&Qn$";
      stringArray0[2] = "-zip";
      stringArray0[3] = "kfHiL l";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // kfHiL l (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "boolean";
      stringArray0[1] = "-d";
      stringArray0[2] = ")</A>\n/";
      stringArray0[3] = "J:{axOo&1I}<Xks0";
      stringArray0[4] = "</FONT>&nbsp;<A NAME=method";
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
}
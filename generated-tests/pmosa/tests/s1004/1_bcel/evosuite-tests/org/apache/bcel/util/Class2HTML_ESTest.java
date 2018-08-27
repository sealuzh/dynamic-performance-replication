/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 23:58:16 GMT 2018
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>";
      String[] stringArray0 = new String[1];
      stringArray0[0] = "_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>";
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
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Class<InputStream> class0 = InputStream.class;
          SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
          JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
          Class2HTML class2HTML0 = new Class2HTML(javaClass0, "^'vqt");
          String string0 = Class2HTML.toHTML("^'vqt");
          assertEquals("^'vqt", string0);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.toHTML("_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>");
      assertEquals("_methods.html\"\\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\"&gt;\\n&lt;/FRAMESET&gt;&lt;/FRAMESET&gt;&lt;/HTML&gt;", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("j");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      JavaClass javaClass0 = classPathRepository0.loadClass("sun.reflect.MethodAccessor");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "j");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class2HTML.referenceType("uF(>o~JQW");
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      java.lang.ClassLoader classLoader1 = classLoader0.getParent();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader1);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, (String) null);
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((byte)2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `CONSTANT_Class' at index 2 and got CONSTANT_Methodref[10](class_index = 1, name_and_type_index = 50)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("");
      ClassPath classPath1 = new ClassPath(classPath0, "");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath1);
      Class<Method> class0 = Method.class;
      classPathRepository0.loadClass(class0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-zip";
      stringArray0[1] = "Done.";
      stringArray0[2] = "Y(kLS>yKc:";
      Class2HTML.toHTML("m?B \">");
      Class2HTML.toHTML("Done.");
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Done. (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class2HTML.referenceType("uF(>o~JQW");
      java.lang.ClassLoader.getSystemClassLoader();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "<A HREF=\"uF(>o~JQW.html\" TARGET=_top>uF(>o~JQW</A>";
      stringArray0[1] = "-#{.^d";
      stringArray0[2] = "FlNa#Ro_r<(-1Xk+";
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
  public void test07()  throws Throwable  {
      java.lang.ClassLoader.getSystemClassLoader();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      classLoaderRepository0.getClassPath();
      ClassPathRepository classPathRepository0 = new ClassPathRepository((ClassPath) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "#.o*LX86_el`R";
      stringArray0[1] = "float";
      stringArray0[2] = "}:qVxcUU71KYWUy4\"E}";
      stringArray0[3] = "-d";
      stringArray0[4] = "\" TARGET=Code>Byte code</A></LI></UL>\n";
      stringArray0[5] = "The array of suffixes must not be null";
      stringArray0[6] = "'LMoOx$";
      stringArray0[7] = "java.time.LocalTime";
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
  public void test08()  throws Throwable  {
      java.lang.ClassLoader.getSystemClassLoader();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SyntheticRepository.getInstance();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      stringArray0[2] = "_code.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n<FRAME NAME=\"Methods\" SRC=\"";
      stringArray0[3] = "\" TARGET=Code>Byte code</A></LI></UL>\n";
      stringArray0[4] = "\" TARGET=Code>Byte code</A></LI></UL>\n";
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
  public void test10()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      syntheticRepository0.loadClass(class0);
      Class<MockMinguoDate> class1 = MockMinguoDate.class;
      syntheticRepository0.loadClass(class1);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>/";
      stringArray0[2] = "Jt[h/%nA/I\u0001rnq";
      stringArray0[3] = "aload_2";
      stringArray0[4] = "int";
      stringArray0[5] = "y";
      stringArray0[6] = "ax{N";
      stringArray0[7] = "void";
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
      SyntheticRepository.getInstance();
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[3];
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
  public void test12()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          SyntheticRepository.getInstance();
          FileSystemHandling.shouldAllThrowIOExceptions();
          SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
          Class<Method> class0 = Method.class;
          JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
          String string0 = "-zip";
          javaClass0.setClassName("-zip");
          Class2HTML class2HTML0 = new Class2HTML(javaClass0, "-zip");
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
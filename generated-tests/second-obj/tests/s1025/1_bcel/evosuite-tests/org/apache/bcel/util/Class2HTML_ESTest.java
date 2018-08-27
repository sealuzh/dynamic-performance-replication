/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:39:23 GMT 2018
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Signature;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
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
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Class2HTML.referenceType("");
      assertEquals("<A HREF=\".html\" TARGET=_top></A>", string0);
      
      String string1 = Class2HTML.toHTML("<A HREF=\".html\" TARGET=_top></A>");
      assertEquals("&lt;A HREF=\".html\" TARGET=_top&gt;&lt;/A&gt;", string1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.referenceType("[");
      assertEquals("<A HREF=\".html\" TARGET=_top>[</A>", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ";F`$KcKHz-h$";
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
      String[] stringArray0 = new String[4];
      stringArray0[0] = "j4h8$/X[*,91'nye7QEH";
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.toString();
      classLoader0.clearAssertionStatus();
      classLoaderRepository0.clear();
      javaClass0.isVarArgs(true);
      JavaClass javaClass1 = javaClass0.getSuperClass();
      javaClass1.isInterface(true);
      Class2HTML class2HTML0 = new Class2HTML(javaClass1, "j4h8$/X[*,91'nye7QEH");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
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
  public void test05()  throws Throwable  {
      Class2HTML.toHTML("\n     ");
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class2HTML.toHTML("-Ew~{XHXEb1zT&-w(");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-Ew~{XHXEb1zT&-w(";
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
  public void test07()  throws Throwable  {
      Class2HTML.toHTML("-d");
      java.lang.ClassLoader.getSystemClassLoader();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "i*O";
      stringArray0[1] = "5@Ode-<Ta0";
      stringArray0[2] = "-d";
      stringArray0[3] = "5@Ode-<Ta0";
      stringArray0[4] = "-d";
      stringArray0[5] = "";
      stringArray0[6] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      java.lang.ClassLoader.getSystemClassLoader();
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "5@Ode-<Ta0";
      stringArray0[1] = "5@Ode-<Ta0";
      stringArray0[2] = "-d";
      stringArray0[3] = "5@Ode-<Ta0";
      stringArray0[6] = "-d";
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
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = ", ";
      stringArray0[1] = "-zip";
      stringArray0[2] = "java.lang.Class";
      stringArray0[3] = "kqY&%\"AyOesP/M";
      String string0 = "-)RhFZ;PD_^{ gVKV#";
      stringArray0[4] = "-)RhFZ;PD_^{ gVKV#";
      stringArray0[5] = "char";
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // java.lang.Class (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      java.lang.ClassLoader.getSystemClassLoader();
      java.lang.ClassLoader.getSystemClassLoader();
      Class2HTML.toHTML("5@Ode-<Ta0");
      String string0 = "\t";
      String[] stringArray0 = new String[5];
      stringArray0[0] = "5@Ode-<Ta0";
      stringArray0[1] = "-d";
      stringArray0[2] = "</A>/";
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
      Class2HTML.referenceType("sun.reflect.MethodAccessor");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "<A HREF=\"sun.reflect.MethodAccessor.html\" TARGET=_top>sun.reflect.MethodAccessor</A>";
      stringArray0[1] = "instanceof";
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "sun.reflect.MethodAccessor");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Class2HTML.referenceType("byte");
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      String string0 = "%$1\\*tMB'* ?Fk|b2B";
      classLoader0.setClassAssertionStatus("%$1*tMB'* ?Fk|b2B", true);
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
/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 00:20:29 GMT 2018
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.bcel.util.MemorySensitiveClassPathRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String string0 = Class2HTML.toHTML("_methods.hml\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUT\">\n</FRAMESET></FRAMESET></HTML>");
      assertEquals("_methods.hml\"\\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUT\"&gt;\\n&lt;/FRAMESET&gt;&lt;/FRAMESET&gt;&lt;/HTML&gt;", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "m7xh[~t1WVaQW#:";
      ClassPath classPath0 = new ClassPath("m7xh[~t1WVaQW#:");
      ClassPath classPath1 = new ClassPath(",vz)<fq<");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath1);
      JavaClass javaClass0 = classPathRepository0.loadClass("java.lang.reflect.Type");
      javaClass0.setRepository(classPathRepository0);
      String string1 = "invokeSpecial";
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "invokeSpecial");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((byte)1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `CONSTANT_Class' at index 1 and got CONSTANT_Methodref[10](class_index = 3, name_and_type_index = 10)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class2HTML.referenceType("shGJd");
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/1_bcel/java.util.Localeorg.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate_cp.html");
      FileSystemHandling.createFolder(evoSuiteFile0);
      classLoader0.clearAssertionStatus();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      classLoaderRepository0.getClassPath();
      MemorySensitiveClassPathRepository memorySensitiveClassPathRepository0 = new MemorySensitiveClassPathRepository((ClassPath) null);
      Class<MockJapaneseDate> class0 = MockJapaneseDate.class;
      java.lang.ClassLoader.getSystemClassLoader();
      JavaClass javaClass0 = memorySensitiveClassPathRepository0.loadClass(class0);
      classLoaderRepository0.loadClass(class0);
      String string0 = "java.util.Locale";
      String string1 = "N@B.kAk4#9.djCU1";
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML(javaClass0, "java.util.Locale");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Class2HTML.referenceType("~)Ult3I'P@N[Ued");
      assertEquals("<A HREF=\"~)Ult3I'P@N.html\" TARGET=_top>~)Ult3I'P@N[Ued</A>", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[8];
      Pattern.quote("shGrt");
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      classLoaderRepository0.getClassPath();
      MemorySensitiveClassPathRepository memorySensitiveClassPathRepository0 = new MemorySensitiveClassPathRepository((ClassPath) null);
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      JavaClass javaClass0 = memorySensitiveClassPathRepository0.loadClass(class0);
      javaClass0.setClassName("u1FlwSc");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "QshGrtE");
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
      Class2HTML.referenceType("shGJd");
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class2HTML.toHTML("java.util.Locale");
      String[] stringArray0 = new String[3];
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[0] = "-d";
      stringArray0[1] = "N@B.kAk4#9.djCU1";
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
  public void test06()  throws Throwable  {
      Class2HTML.referenceType("shGJd");
      java.lang.ClassLoader.getSystemClassLoader();
      Class2HTML.toHTML("java.util.Locale");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-d";
      stringArray0[1] = "<A HREF=\"shGJd.html\" TARGET=_top>shGJd</A>";
      stringArray0[2] = "C'p+";
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
      Class2HTML.referenceType("shGJd");
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      classLoaderRepository0.getClassPath();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-,d";
      stringArray0[2] = "shGJd";
      stringArray0[2] = "C'p+";
      java.lang.ClassLoader.getSystemClassLoader();
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
  public void test08()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "nC2$ ,l727+&");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      stringArray0[1] = "_methods.html\"\n MARGINWIDTH=0 MARGINHEIOHT=0 FRaMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMES7T></FRAMESET<</HTML>";
      Class2HTML.main(stringArray0);
      Class2HTML.main(stringArray0);
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(101);
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
      stringArray0[0] = "java.lang.annotation.Annotation";
      String string0 = "-zip";
      stringArray0[1] = "-zip";
      stringArray0[2] = "3[=Cfv";
      String string1 = "~sl9";
      stringArray0[3] = "~sl9";
      stringArray0[4] = "class";
      stringArray0[5] = ".J9vH%/v_Jva18=<)";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // 3[=Cfv (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class2HTML.referenceType("shpJ_");
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      java.lang.ClassLoader.getSystemClassLoader();
      classLoader0.clearAssertionStatus();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class2HTML.toHTML("shpJ_");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "shpJ_";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d/";
      stringArray0[3] = "<A HREF=\"shpJ_.html\" TARGET=_top>shpJ_</A>";
      stringArray0[4] = "shpJ_";
      stringArray0[5] = "-d";
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
}

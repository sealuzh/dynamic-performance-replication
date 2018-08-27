/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 03:21:03 GMT 2018
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
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "pX0wscM~(wt/*.I<u; ";
      Class2HTML.referenceType("pX0wscM~(wt/*.I<u; ");
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      java.lang.ClassLoader classLoader1 = classLoader0.getParent();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader1);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classLoader0.clearAssertionStatus();
      String string1 = "C(";
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "C(");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<InputStream> class0 = InputStream.class;
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/1_bcel/charjava.io.InputStream_cp.html");
      FileSystemHandling.createFolder(evoSuiteFile0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML(javaClass0, "char");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class2HTML.toHTML("impdep2");
      Class2HTML.toHTML("impdep2");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"";
      stringArray0[1] = "impdep2";
      stringArray0[2] = "impdep2";
      stringArray0[3] = "impdep2";
      stringArray0[4] = "char";
      stringArray0[5] = "impdep2";
      stringArray0[6] = "impdep2";
      stringArray0[7] = "impdep2";
      stringArray0[8] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class2HTML.toHTML("iomG3x*");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "iomG3x*";
      stringArray0[0] = "iomG3x*";
      stringArray0[2] = "_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n</FRAMESET>\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Code\" SRC=\"";
      Class2HTML.toHTML("_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n</FRAMESET>\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Code\" SRC=\"");
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
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = "_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"";
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      stringArray0[0] = "_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"";
      stringArray0[1] = "->";
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
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "->";
      Class2HTML.main(stringArray0);
      // Undeclared exception!
      try { 
        Class2HTML.toHTML((String) null);
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
      classLoaderRepository0.loadClass(class0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "FF^,Bo&`IQAWF.";
      stringArray0[1] = "-zip";
      stringArray0[2] = "V|K154z6D8";
      stringArray0[3] = "char";
      stringArray0[4] = "java.time.chrono.JapaneseDate";
      stringArray0[5] = "_d?$uW(6uc1_[";
      stringArray0[6] = "g)Lg^oxQ";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // V|K154z6D8 (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      classLoader0.getParent();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      String string0 = "";
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-d";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n</FRAMESET>\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Code\" SRC=\"";
      stringArray0[2] = "java.time.temporal.TemporalAccessor";
      stringArray0[3] = "-d";
      stringArray0[4] = "_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n</FRAMESET>\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Code\" SRC=\"";
      stringArray0[5] = "_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n</FRAMESET>\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Code\" SRC=\"";
      stringArray0[6] = "-d";
      stringArray0[7] = "_attributes.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n</FRAMESET>\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Code\" SRC=\"";
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
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d";
      stringArray0[3] = "FG=ASw;Qlhyf -6E/";
      stringArray0[4] = "-d";
      stringArray0[5] = "-d";
      stringArray0[6] = "-d";
      stringArray0[7] = "java.time.temporal.TemporalUnit";
      Class2HTML.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      javaClass0.setClassName("");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "Qfzf;Y;*4T4F0r3B0");
  }
}
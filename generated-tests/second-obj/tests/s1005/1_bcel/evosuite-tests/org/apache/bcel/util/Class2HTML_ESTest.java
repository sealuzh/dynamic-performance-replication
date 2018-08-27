/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:50:37 GMT 2018
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.regex.Pattern;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Signature;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.MemorySensitiveClassPathRepository;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class2HTML.toHTML("_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attribmtes\" SRC=\"");
      java.lang.ClassLoader.getSystemClassLoader();
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, "_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\"&gt;\n&lt;FRAME NAME=\"Attribmtes\" SRC=\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"";
      java.lang.ClassLoader.getSystemClassLoader();
      ClassPath classPath0 = new ClassPath("_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"");
      MemorySensitiveClassPathRepository memorySensitiveClassPathRepository0 = new MemorySensitiveClassPathRepository(classPath0);
      Class<String> class0 = String.class;
      memorySensitiveClassPathRepository0.loadClass(class0);
      memorySensitiveClassPathRepository0.findClass("_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"");
      classPath0.getResources("@s& g0.kAz#d.");
      JavaClass javaClass0 = memorySensitiveClassPathRepository0.loadClass("java.lang.String$1");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"");
      Class2HTML.toHTML("java.lang.String$1");
      // Undeclared exception!
      try { 
        Signature.translate("<FONT COLOR=\"#00FF00\">");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal signature: <FONT COLOR=\"#00FF00\"> read F
         //
         verifyException("org.apache.bcel.classfile.Signature", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-gip";
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
  public void test3()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("HoN1rcT4K3YaLlmq:");
      MemorySensitiveClassPathRepository memorySensitiveClassPathRepository0 = new MemorySensitiveClassPathRepository(classPath0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "b[Y}N Qt");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-zip";
      stringArray0[1] = "v.?EMw)b2(^ :c?";
      stringArray0[2] = "HoN1rcT4K3YaLlmq:";
      stringArray0[3] = "HoN1rcT4K3YaLlmq:";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // v.?EMw)b2(^ :c? (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("7VeF");
      String[] stringArray0 = new String[3];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/1_bcel/ayafHhJoW!!:go3ljava.lang.Object_code.html");
      FileSystemHandling.createFolder(evoSuiteFile0);
      stringArray0[0] = "-gp";
      stringArray0[1] = "-gp";
      stringArray0[2] = "-gp";
      Class2HTML.main(stringArray0);
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<InputStream> class0 = InputStream.class;
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "i");
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "i");
      String string0 = Class2HTML.toHTML("i");
      assertEquals("i", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/1_bcel/~I/ QUjava.lang.Object_methods.html");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Class2HTML.toHTML("Xl5");
      Class2HTML.toHTML("-d");
      ClassPath classPath0 = new ClassPath("");
      Class2HTML.toHTML("");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Xl5";
      stringArray0[1] = "-d";
      ClassPath.getClassPath();
      stringArray0[2] = "";
      stringArray0[3] = "-d";
      stringArray0[4] = "ong";
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
  public void test6()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/1_bcel/~I/ QUjava.lang.Object_methods.html");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      Class2HTML.toHTML("~I/ QU");
      Class2HTML.toHTML("~I/ QU");
      ClassPath classPath0 = new ClassPath("~I/ QU");
      Pattern.quote("(S-j[");
      ClassPath.getClassPath();
      String[] stringArray0 = new String[10];
      stringArray0[0] = "&lt;";
      stringArray0[1] = "Q(S-j[E";
      stringArray0[2] = "~I/ QU";
      stringArray0[3] = "~I/ QU";
      stringArray0[4] = "-d";
      stringArray0[5] = "Q(S-j[E";
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

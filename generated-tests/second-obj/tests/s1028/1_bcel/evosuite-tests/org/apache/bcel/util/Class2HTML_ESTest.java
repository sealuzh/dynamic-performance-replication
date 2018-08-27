/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:18:15 GMT 2018
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.regex.Pattern;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.BCELComparator;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "sun.reflect.ConsvantPool";
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-818));
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
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      java.lang.ClassLoader classLoader1 = classLoader0.getParent();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader1);
      classLoader1.getParent();
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.isSynchronized(false);
      classLoaderRepository0.loadClass(class0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/1_bcel/Lb:{sZ.FFR:_java.io.InputStream_code.html");
      FileSystemHandling.createFolder(evoSuiteFile0);
      String string0 = "Lb:{sZ.FFR:_";
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML(javaClass0, "Lb:{sZ.FFR:_");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/1_bcel/\\Qsun.reflect.ConstantPool\\E");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, true);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Pattern.quote("sun.reflect.ConstantPool");
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      ClassPath classPath0 = new ClassPath("</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"ConstantPool\" SRC=\"");
      Class2HTML.toHTML("</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"ConstantPool\" SRC=\"");
      Pattern.quote("sun.reflect.ConstantPool");
      FileSystemHandling.shouldAllThrowIOExceptions();
      Pattern.quote("b");
      ClassPath classPath1 = new ClassPath("</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"ConstantPool\" SRC=\"");
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      classLoader0.getParent();
      classLoader0.setPackageAssertionStatus("sun.reflect.ConstantPool", false);
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      javaClass0.isSynchronized(false);
      JavaClass javaClass1 = javaClass0.getSuperClass();
      javaClass1.setClassName("b");
      Class<Object> class1 = Object.class;
      JavaClass javaClass2 = syntheticRepository0.loadClass(class1);
      javaClass2.isVolatile(true);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "m6/I%K286oOmNMUO*L|");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-x";
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/1_bcel/.=my[org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate_methods.html");
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, "\" TARGET=\"ConstantPool\">Constant value index(/");
      assertTrue(boolean0);
      
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      BCELComparator bCELComparator0 = Field.getComparator();
      assertNotNull(bCELComparator0);
      
      JavaClass.setComparator(bCELComparator0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-zip";
      stringArray0[1] = "boolean";
      stringArray0[2] = ".=my[";
      stringArray0[3] = "java.time.temporal.TemporalAdjuster";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // boolean (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = Pattern.quote("sun.reflect.ConstantPool");
      assertNotNull(string0);
      assertEquals("\\Qsun.reflect.ConstantPool\\E", string0);
      
      ClassPath classPath0 = new ClassPath("Qsun.reflect.ConstantPoolE");
      assertNotNull(classPath0);
      
      String string1 = Class2HTML.toHTML("Qsun.reflect.ConstantPoolE");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("Qsun.reflect.ConstantPoolE", string1);
      
      String string2 = Pattern.quote("sun.reflect.ConstantPool");
      assertFalse(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertNotNull(string2);
      assertEquals("\\Qsun.reflect.ConstantPool\\E", string2);
      
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      assertNotNull(fileSystemHandling0);
      
      String string3 = Class2HTML.referenceType("Qsun.reflect.ConstantPoolE");
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertNotNull(string3);
      assertEquals("<A HREF=\"Qsun.reflect.ConstantPoolE.html\" TARGET=_top>Qsun.reflect.ConstantPoolE</A>", string3);
      
      String string4 = Class2HTML.toHTML("-d");
      assertFalse(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string1));
      assertFalse(string4.equals((Object)string0));
      assertFalse(string4.equals((Object)string2));
      assertNotNull(string4);
      assertEquals("-d", string4);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "<A HREF=\"Qsun.reflect.ConstantPoolE.html\" TARGET=_top>Qsun.reflect.ConstantPoolE</A>";
      stringArray0[1] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = Pattern.quote("sun.reflect.ConstantPool");
      assertNotNull(string0);
      assertEquals("\\Qsun.reflect.ConstantPool\\E", string0);
      
      ClassPath classPath0 = new ClassPath("</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"ConstantPool\" SRC=\"");
      assertNotNull(classPath0);
      
      String string1 = Pattern.quote("sun.reflect.ConstantPool");
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("\\Qsun.reflect.ConstantPool\\E", string1);
      
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      java.lang.ClassLoader classLoader1 = classLoader0.getParent();
      assertFalse(classLoader1.equals((Object)classLoader0));
      assertNotNull(classLoader1);
      
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      assertNotNull(fileSystemHandling0);
      
      String string2 = Class2HTML.referenceType("Qsun.reflect.ConstantPoolE");
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertNotNull(string2);
      assertEquals("<A HREF=\"Qsun.reflect.ConstantPoolE.html\" TARGET=_top>Qsun.reflect.ConstantPoolE</A>", string2);
      
      String string3 = Class2HTML.toHTML("-d");
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string1));
      assertNotNull(string3);
      assertEquals("-d", string3);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "<A HREF=\"Qsun.reflect.ConstantPoolE.html\" TARGET=_top>Qsun.reflect.ConstantPoolE</A>";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d";
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
  public void test7()  throws Throwable  {
      ClassPath classPath0 = new ClassPath(".=my[");
      assertNotNull(classPath0);
      
      String string0 = Pattern.quote(".=my[");
      assertNotNull(string0);
      assertEquals("\\Q.=my[\\E", string0);
      
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      assertNotNull(fileSystemHandling0);
      
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      assertFalse(fileSystemHandling1.equals((Object)fileSystemHandling0));
      assertNotNull(fileSystemHandling1);
      
      String string1 = Class2HTML.referenceType("Q.=my[E");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("<A HREF=\"Q.=my.html\" TARGET=_top>Q.=my[E</A>", string1);
      
      String string2 = Class2HTML.toHTML("RJ{PdfHSNSg>");
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals("RJ{PdfHSNSg&gt;", string2);
      
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-d";
      stringArray0[1] = "<A HREF=\"Q.=my.html\" TARGET=_top>Q.=my[E</A>";
      stringArray0[2] = "-d";
      stringArray0[3] = "RJ{PdfHSNSg>";
      stringArray0[4] = "RJ{PdfHSNSg&gt;";
      stringArray0[5] = "\" TARGET=\"ConstantPool\">Constant value index(";
      stringArray0[6] = "<A HREF=\"Q.=my.html\" TARGET=_top>Q.=my[E</A>";
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
  public void test8()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      assertNotNull(syntheticRepository0);
      
      ClassPath classPath0 = new ClassPath("</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Constantxool\" SRC=\"");
      assertNotNull(classPath0);
      
      String string0 = Class2HTML.toHTML("</TITLE></HEAD>\n<FRAMESET BORDER=1 cols=\"30%,*\">\n<FRAMESET BORDER=1 rows=\"80%,*\">\n<FRAME NAME=\"Constantxool\" SRC=\"");
      assertNotNull(string0);
      assertEquals("&lt;/TITLE&gt;&lt;/HEAD&gt;\\n&lt;FRAMESET BORDER=1 cols=\"30%,*\"&gt;\\n&lt;FRAMESET BORDER=1 rows=\"80%,*\"&gt;\\n&lt;FRAME NAME=\"Constantxool\" SRC=\"", string0);
      
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      assertNotNull(fileSystemHandling0);
      
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      assertFalse(fileSystemHandling1.equals((Object)fileSystemHandling0));
      assertNotNull(fileSystemHandling1);
      
      String string1 = Class2HTML.referenceType("m6/I%K286oOmNMUO*L|");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("<A HREF=\"m6/I%K286oOmNMUO*L|.html\" TARGET=_top>m6.I%K286oOmNMUO*L|</A>", string1);
      
      String string2 = Class2HTML.toHTML("-d");
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals("-d", string2);
      
      String string3 = Class2HTML.toHTML("");
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string2));
      assertNotNull(string3);
      assertEquals("", string3);
      
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-d";
      stringArray0[1] = "";
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
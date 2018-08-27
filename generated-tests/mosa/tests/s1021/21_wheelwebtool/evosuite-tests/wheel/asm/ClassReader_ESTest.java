/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 12:10:58 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("The array of suffixes must not be null");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read(byteArray0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassReader classReader1 = new ClassReader(classReader0.b);
      assertEquals(530, classReader1.header);
      
      String string0 = classReader1.getClassName();
      assertEquals("org/apache/commons/io/filefilter/TrueFileFilter", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassReader classReader0 = new ClassReader(byteArrayInputStream0);
      classReader0.getInterfaces();
      assertEquals(10, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter0, 2);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      assertNotNull(classReader0);
      assertEquals(530, classReader0.header);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(33, classReader0.getAccess());
      
      ClassWriter classWriter0 = new ClassWriter(1);
      assertNotNull(classWriter0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
      
      int int0 = classReader0.readByte(1);
      assertEquals(254, int0);
      assertEquals(530, classReader0.header);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(33, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      assertNotNull(classReader0);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(1531, classReader0.header);
      assertEquals(49, classReader0.getAccess());
      
      // Undeclared exception!
      try { 
        classReader0.getItem((-1974));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1974
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      assertNotNull(classReader0);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(530, classReader0.header);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(33, classReader0.getAccess());
      
      ClassWriter classWriter0 = new ClassWriter(1);
      assertNotNull(classWriter0);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
      
      classReader0.accept((ClassVisitor) classWriter0, 1);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(530, classReader0.header);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
      assertEquals(33, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      assertNotNull(classReader0);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(1531, classReader0.header);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(49, classReader0.getAccess());
      
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1531);
      assertNotNull(classWriter0);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(1531, classReader0.header);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
      assertEquals(49, classReader0.getAccess());
      
      classReader0.accept((ClassVisitor) classWriter0, 2);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(1531, classReader0.header);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
      assertEquals(49, classReader0.getAccess());
      
      // Undeclared exception!
      try { 
        classReader0.readConst(3, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
          assertNotNull(classReader0);
          assertEquals(1, ClassReader.SKIP_CODE);
          assertEquals(8, ClassReader.EXPAND_FRAMES);
          assertEquals(1531, classReader0.header);
          assertEquals(2, ClassReader.SKIP_DEBUG);
          assertEquals(4, ClassReader.SKIP_FRAMES);
          assertEquals(49, classReader0.getAccess());
          
          ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
          assertNotNull(classWriter0);
          assertEquals(1, ClassReader.SKIP_CODE);
          assertEquals(8, ClassReader.EXPAND_FRAMES);
          assertEquals(1531, classReader0.header);
          assertEquals(2, ClassReader.SKIP_DEBUG);
          assertEquals(4, ClassReader.SKIP_FRAMES);
          assertEquals(1, ClassWriter.COMPUTE_MAXS);
          assertEquals(2, ClassWriter.COMPUTE_FRAMES);
          assertEquals(49, classReader0.getAccess());
          
          classReader0.accept((ClassVisitor) classWriter0, 1);
          assertEquals(1, ClassReader.SKIP_CODE);
          assertEquals(8, ClassReader.EXPAND_FRAMES);
          assertEquals(1531, classReader0.header);
          assertEquals(2, ClassReader.SKIP_DEBUG);
          assertEquals(4, ClassReader.SKIP_FRAMES);
          assertEquals(1, ClassWriter.COMPUTE_MAXS);
          assertEquals(2, ClassWriter.COMPUTE_FRAMES);
          assertEquals(49, classReader0.getAccess());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      assertNotNull(classReader0);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(530, classReader0.header);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(33, classReader0.getAccess());
      
      ClassWriter classWriter0 = new ClassWriter(2);
      assertNotNull(classWriter0);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
      
      classReader0.accept((ClassVisitor) classWriter0, 8);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(530, classReader0.header);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
      assertEquals(33, classReader0.getAccess());
      
      int int0 = classReader0.getAccess();
      assertEquals(33, int0);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(530, classReader0.header);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(33, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      assertNotNull(classReader0);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(530, classReader0.header);
      assertEquals(33, classReader0.getAccess());
      
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(classReader0.b);
      assertNotNull(byteArrayInputStream0);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(530, classReader0.header);
      assertEquals(33, classReader0.getAccess());
      assertEquals(840, byteArrayInputStream0.available());
      
      ClassReader classReader1 = new ClassReader(byteArrayInputStream0);
      assertFalse(classReader1.equals((Object)classReader0));
      assertNotNull(classReader1);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(530, classReader0.header);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(530, classReader1.header);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(33, classReader0.getAccess());
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(33, classReader1.getAccess());
      
      String[] stringArray0 = classReader0.getInterfaces();
      assertFalse(classReader0.equals((Object)classReader1));
      assertNotNull(stringArray0);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(530, classReader0.header);
      assertEquals(33, classReader0.getAccess());
      assertNotSame(classReader0, classReader1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      assertNotNull(classReader0);
      assertEquals(530, classReader0.header);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(33, classReader0.getAccess());
      
      ClassReader classReader1 = new ClassReader(classReader0.b);
      assertFalse(classReader1.equals((Object)classReader0));
      assertNotNull(classReader1);
      assertEquals(530, classReader0.header);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(530, classReader1.header);
      assertEquals(33, classReader0.getAccess());
      assertEquals(33, classReader1.getAccess());
      
      String string0 = classReader1.getSuperName();
      assertFalse(classReader0.equals((Object)classReader1));
      assertFalse(classReader1.equals((Object)classReader0));
      assertNotNull(string0);
      assertEquals("java/lang/Object", string0);
      assertEquals(530, classReader0.header);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(530, classReader1.header);
      assertEquals(33, classReader0.getAccess());
      assertEquals(33, classReader1.getAccess());
      assertNotSame(classReader0, classReader1);
      assertNotSame(classReader1, classReader0);
      
      ClassReader classReader2 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      assertFalse(classReader2.equals((Object)classReader0));
      assertFalse(classReader2.equals((Object)classReader1));
      assertNotNull(classReader2);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(530, classReader2.header);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(33, classReader2.getAccess());
      
      char[] charArray0 = new char[5];
      charArray0[0] = '7';
      charArray0[1] = 'a';
      charArray0[2] = '(';
      charArray0[3] = 'a';
      charArray0[4] = 'r';
      // Undeclared exception!
      try { 
        classReader0.readConst(4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      assertNotNull(classReader0);
      assertEquals(8070, classReader0.header);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(33, classReader0.getAccess());
      
      String string0 = classReader0.getSuperName();
      assertNotNull(string0);
      assertEquals("java/lang/Object", string0);
      assertEquals(8070, classReader0.header);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(33, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      assertNotNull(classReader0);
      assertEquals(1531, classReader0.header);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(49, classReader0.getAccess());
      
      ClassWriter classWriter0 = new ClassWriter(8);
      assertNotNull(classWriter0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
      
      classReader0.accept((ClassVisitor) classWriter0, 1840);
      assertEquals(1531, classReader0.header);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
      assertEquals(49, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      assertNotNull(classReader0);
      assertEquals(530, classReader0.header);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(33, classReader0.getAccess());
      
      String string0 = classReader0.getSuperName();
      assertNotNull(string0);
      assertEquals("java/lang/Object", string0);
      assertEquals(530, classReader0.header);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(33, classReader0.getAccess());
      
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 1, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 842
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      assertNotNull(classReader0);
      assertEquals(1, ClassReader.SKIP_CODE);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
      assertEquals(8070, classReader0.header);
      assertEquals(2, ClassReader.SKIP_DEBUG);
      assertEquals(4, ClassReader.SKIP_FRAMES);
      assertEquals(33, classReader0.getAccess());
      
      ClassWriter classWriter0 = new ClassWriter(50);
      assertNotNull(classWriter0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
      
      classReader0.accept((ClassVisitor) classWriter0, 2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      classReader0.accept((ClassVisitor) classWriter0, 2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, 2);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 2);
      char[] charArray0 = new char[2];
      charArray0[0] = 'd';
      charArray0[1] = 'r';
      classReader0.readConst(2, charArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassReader classReader1 = new ClassReader(classReader0.b, 530, 924);
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter(classReader1, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 512
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(1840, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter((-60));
      classReader0.accept((ClassVisitor) classWriter0, 108);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter((-60));
      ClassWriter classWriter1 = new ClassWriter((-2024));
      classReader0.accept((ClassVisitor) classWriter1, (-2024));
      Label[] labelArray0 = new Label[0];
      classReader0.readLabel(classWriter1.COMPUTE_MAXS, labelArray0);
  }
}
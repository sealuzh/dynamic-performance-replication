/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:35:21 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassAdapter;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("Signature");
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
      byte[] byteArray0 = new byte[19];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassReader classReader0 = new ClassReader(byteArrayInputStream0);
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      String string0 = classReader0.getSuperName();
      assertNull(string0);
      
      char[] charArray0 = new char[3];
      int int0 = classReader0.getItem(49);
      assertEquals(927, classReader0.header);
      assertEquals(457, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      classReader0.getInterfaces();
      assertEquals(927, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      assertEquals(927, classReader0.header);
      
      String string0 = classReader0.getClassName();
      assertNotNull(string0);
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.HiddenFileFilter");
      int int0 = classReader0.getAccess();
      assertEquals(609, classReader0.header);
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassReader classReader1 = new ClassReader(classReader0.b, 927, 927);
      // Undeclared exception!
      try { 
        classReader1.getInterfaces();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassReader classReader1 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader1, 1);
      classReader1.accept((ClassVisitor) classWriter0, 927);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
      classReader0.accept((ClassVisitor) classWriter0, 2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (-2152));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.HiddenFileFilter");
      classReader0.getSuperName();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(2);
      classReader0.accept((ClassVisitor) classWriter0, 4);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      classReader0.readByte(12);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.HiddenFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.accept((ClassVisitor) classWriter0, 2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.HiddenFileFilter");
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter0, 2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.HiddenFileFilter");
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter0, 248);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.HiddenFileFilter");
      ClassReader classReader1 = new ClassReader(classReader0.b, 808, 4);
      classReader0.getInterfaces();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      char[] charArray0 = new char[14];
      // Undeclared exception!
      try { 
        classReader0.readConst(1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      char[] charArray0 = new char[19];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(16);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, (Attribute[]) null, 770);
      ClassWriter classWriter1 = new ClassWriter(4);
      classWriter1.cr = classReader0;
      classReader0.accept((ClassVisitor) classWriter1, 248);
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
      charArray0[1] = 'Z';
      charArray0[2] = ')';
      charArray0[3] = 'O';
      charArray0[4] = 'Y';
      // Undeclared exception!
      try { 
        classReader0.readClass((-487), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      classReader0.accept((ClassVisitor) classWriter0, 2);
      ClassWriter classWriter1 = new ClassWriter(classReader0, 2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(8);
      classReader0.accept((ClassVisitor) classWriter0, 0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      ClassWriter classWriter0 = new ClassWriter(classReader0, 0);
      classReader0.copyPool(classWriter0);
      ClassWriter classWriter1 = new ClassWriter(686);
      classReader0.accept((ClassVisitor) classWriter1, 88);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassReader classReader1 = new ClassReader("wheel.asm.ClassReader");
      ClassReader classReader2 = null;
      try {
        classReader2 = new ClassReader(classReader1.b, 4, 1000);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 52168
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }
}
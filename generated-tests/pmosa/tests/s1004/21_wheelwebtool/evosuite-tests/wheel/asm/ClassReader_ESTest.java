/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 00:25:03 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.ClassAdapter;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.Edge;
import wheel.asm.Frame;
import wheel.asm.Label;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassReader classReader0 = new ClassReader(byteArrayInputStream0);
      Frame frame0 = new Frame();
      int int0 = 1329;
      Label label0 = frame0.owner;
      Label label1 = new Label();
      // Undeclared exception!
      try { 
        classReader0.getClassName();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassReader classReader0 = new ClassReader(byteArrayInputStream0);
      Frame frame0 = new Frame();
      frame0.inputLocals = null;
      classReader0.getAccess();
      // Undeclared exception!
      try { 
        classReader0.getInterfaces();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassReader classReader0 = new ClassReader(byteArrayInputStream0);
      classReader0.getInterfaces();
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0, 1, 8);
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Type");
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader("$7l");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassReader classReader0 = new ClassReader(byteArrayInputStream0);
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.readShort(2);
      classReader0.getAccess();
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getItem(26);
      char[] charArray0 = new char[8];
      charArray0[0] = 'F';
      charArray0[1] = 'P';
      charArray0[2] = 'y';
      charArray0[3] = 'k';
      charArray0[4] = ']';
      charArray0[5] = 'N';
      charArray0[6] = 'C';
      ClassWriter classWriter0 = new ClassWriter((-313));
      classReader0.copyPool(classWriter0);
      charArray0[7] = '=';
      classReader0.readConst(26, charArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getItem(26);
      classReader0.readInt(132);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 705);
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getSuperName();
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassReader classReader1 = new ClassReader(classReader0.b);
      classReader1.accept((ClassVisitor) classWriter0, 6);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getItem(26);
      classReader0.readInt(132);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 728);
      int int0 = 6;
      char[] charArray0 = new char[0];
      classReader0.readUTF8(int0, charArray0);
      classReader0.readLong(int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getItem(42);
      int int0 = Type.INT;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 42);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 26);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      classReader0.accept((ClassVisitor) classWriter0, (-2856));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getItem(23);
      ClassWriter classWriter0 = new ClassWriter(56);
      classReader0.copyPool(classWriter0);
      char[] charArray0 = new char[0];
      classReader0.readConst(83, charArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      int int0 = classReader0.getItem(26);
      assertEquals(132, int0);
      
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
      
      int int1 = classReader0.readByte(132);
      assertEquals(1, int1);
      assertEquals(8070, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getItem(26);
      classReader0.readInt(85);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 26);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getItem(26);
      classReader0.readInt(26);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 2, 728);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 52168
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getItem(42);
      int int0 = Type.INT;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter0, 2756);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getItem(26);
      classReader0.readInt(132);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      ClassWriter classWriter1 = new ClassWriter(2);
      ClassAdapter classAdapter1 = new ClassAdapter(classWriter1);
      classReader0.accept((ClassVisitor) classAdapter0, 29426114);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getSuperName();
      MockFile mockFile0 = new MockFile("wheel.asm.ClassReader");
      ClassReader classReader1 = new ClassReader("java/lang/Class");
      ClassWriter classWriter0 = new ClassWriter(2157);
      classReader1.accept((ClassVisitor) classWriter0, (-359));
      classReader0.readShort((-359));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      ClassReader classReader1 = new ClassReader(classReader0.b);
      ClassWriter classWriter0 = new ClassWriter(classReader1, 4);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 1395);
      ClassReader classReader2 = new ClassReader(classReader1.b, 8070, 2);
      classReader2.copyPool(classWriter0);
  }
}
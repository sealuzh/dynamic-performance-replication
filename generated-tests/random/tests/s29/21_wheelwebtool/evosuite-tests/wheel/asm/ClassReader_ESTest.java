/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 14:09:56 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassAdapter;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getSuperName();
      char[] charArray0 = new char[8];
      charArray0[0] = '7';
      charArray0[1] = '`';
      charArray0[2] = ')';
      charArray0[3] = 'W';
      charArray0[5] = '+';
      charArray0[6] = '\"';
      charArray0[7] = 't';
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 2);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        classWriter0.addType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassWriter");
      ClassWriter classWriter0 = new ClassWriter(2);
      classReader0.copyPool(classWriter0);
      int int0 = 290;
      Label[] labelArray0 = new Label[4];
      // Undeclared exception!
      try { 
        classReader0.readLabel((-3794), labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3794
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "TKYb(");
      classReader0.getSuperName();
      classReader0.getItem(4);
      classReader0.getAccess();
      ClassWriter classWriter0 = new ClassWriter(2);
      classReader0.accept((ClassVisitor) classWriter0, 0);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "org.apache.commons.io.IOCase";
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      char[] charArray0 = new char[8];
      ClassWriter classWriter0 = new ClassWriter(23);
      classReader0.accept((ClassVisitor) classWriter0, 47);
      charArray0[0] = '(';
      charArray0[1] = '[';
      charArray0[2] = 'p';
      charArray0[3] = 'a';
      charArray0[4] = '?';
      charArray0[5] = 'c';
      charArray0[6] = '+';
      charArray0[7] = 'e';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(23, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      classReader0.readInt(1);
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) null, (-4050));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "3,");
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getSuperName();
      char[] charArray0 = new char[8];
      charArray0[0] = '7';
      charArray0[1] = '`';
      charArray0[2] = ')';
      charArray0[3] = 'W';
      charArray0[4] = '>';
      charArray0[5] = '+';
      charArray0[6] = '\"';
      charArray0[7] = 't';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(851, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "4mK");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)16;
      byteArray0[2] = (byte) (-126);
      byteArray0[3] = (byte)64;
      byteArray0[4] = (byte) (-6);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-6), (byte)16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
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
  public void test08()  throws Throwable  {
      byte[] byteArray0 = null;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((byte[]) null, 4314, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)89;
      byteArray0[1] = (byte)43;
      byteArray0[2] = (byte) (-67);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte)89, (byte) (-67));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      int int0 = 356;
      ClassWriter classWriter0 = new ClassWriter(356);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[1];
      Attribute attribute0 = new Attribute("Ohv");
      attributeArray0[0] = attribute0;
      classReader0.accept((ClassVisitor) classAdapter0, attributeArray0, 1);
      int int1 = 68;
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        classReader0.readUTF8((-1913), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("W5n;/:rl1m%-pnN");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "org.apache.commons.io.filefilter.AgeFileFilter";
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AgeFileFilter");
      // Undeclared exception!
      try { 
        classReader0.getItem(138);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 138
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File file0 = MockFile.createTempFile("LocalVariableTable", ",N< 3*lfO");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(mockFileInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(4);
      String string0 = "LineNumberTable";
      String string1 = "LocalVariableTypeTable";
      String string2 = "^0J=+/hF";
      boolean boolean0 = true;
      int int0 = (-140);
      classReader0.accept((ClassVisitor) classWriter0, (-140));
      String string3 = "Label offset position has not been resolved yet";
      classWriter0.threshold = 58;
      // Undeclared exception!
      try { 
        classWriter0.newMethod((String) null, "vx5<ePJH1u5M", "LineNumberTable", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        mockFileInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-977));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      int int0 = 1;
      classReader0.readInt(1);
      char[] charArray0 = new char[5];
      charArray0[0] = ';';
      charArray0[2] = '9';
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      classReader0.copyPool(classWriter0);
      charArray0[3] = 'E';
      classReader0.accept((ClassVisitor) classWriter0, 5);
      classReader0.getInterfaces();
      classReader0.getClassName();
      charArray0[4] = 'f';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

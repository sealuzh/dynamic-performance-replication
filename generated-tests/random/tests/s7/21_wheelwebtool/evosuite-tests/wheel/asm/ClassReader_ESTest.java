/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 15:28:00 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
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
      FileSystemHandling.shouldAllThrowIOExceptions();
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      classReader0.readLong(8);
      int int0 = 10;
      ClassWriter classWriter0 = new ClassWriter(classReader0, 10);
      Attribute[] attributeArray0 = new Attribute[6];
      Attribute attribute0 = new Attribute("StackMapTable");
      int int1 = 247;
      int int2 = 3060;
      char[] charArray0 = new char[5];
      charArray0[0] = 'N';
      charArray0[1] = 'x';
      charArray0[2] = 'w';
      charArray0[3] = 'x';
      charArray0[4] = 'N';
      Label[] labelArray0 = new Label[7];
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream((FileDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      char[] charArray0 = new char[4];
      charArray0[0] = '!';
      charArray0[1] = 'U';
      charArray0[2] = '^';
      charArray0[3] = ' ';
      // Undeclared exception!
      try { 
        classReader0.readClass(2571, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1377
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classWriter0.addUninitializedType("wheel.asm.Edge", (-224));
      classReader0.accept((ClassVisitor) classWriter0, (-224));
      char[] charArray0 = new char[1];
      classWriter0.visitAnnotation("wheel.asm.Edge", false);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      charArray0[0] = '/';
      // Undeclared exception!
      try { 
        classReader0.readUTF8((-224), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.CanReadFileFilter");
      int int0 = (-2170);
      classReader0.getInterfaces();
      classReader0.getSuperName();
      classReader0.getClassName();
      // Undeclared exception!
      try { 
        classReader0.getItem((-2170));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2170
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.CanReadFileFilter");
      int int0 = (-2170);
      char[] charArray0 = new char[3];
      FileSystemHandling.shouldAllThrowIOExceptions();
      charArray0[0] = '(';
      charArray0[1] = '>';
      charArray0[2] = 'u';
      classReader0.getInterfaces();
      // Undeclared exception!
      try { 
        classReader0.readUTF8((-2170), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      classReader0.getItem(8);
      classReader0.readLong(46);
      classReader0.getInterfaces();
      char[] charArray0 = new char[5];
      charArray0[0] = '2';
      charArray0[1] = 'J';
      charArray0[2] = 'n';
      char char0 = '0';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(46, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      // Undeclared exception!
      try { 
        classReader0.getItem((-2048));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2048
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      Attribute[] attributeArray0 = new Attribute[8];
      Attribute attribute0 = new Attribute("wheel.asm.ClassWriter");
      ClassReader classReader1 = null;
      int int0 = (-2307);
      char[] charArray0 = new char[7];
      charArray0[0] = 'v';
      charArray0[1] = '=';
      charArray0[2] = 'Z';
      char char0 = '_';
      charArray0[3] = '_';
      charArray0[4] = 'I';
      char char1 = 'd';
      charArray0[5] = 'd';
      charArray0[6] = '0';
      int int1 = 1685;
      Label[] labelArray0 = new Label[2];
      int int2 = 4;
      // Undeclared exception!
      try { 
        classReader0.readLabel(4, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
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
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-118);
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte) (-4);
      byteArray0[3] = (byte)12;
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte) (-66);
      byteArray0[6] = (byte)76;
      byteArray0[7] = (byte)73;
      byteArray0[8] = (byte)0;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-4), (byte)76);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("w-");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-103);
      byteArray0[0] = (byte) (-103);
      byteArray0[1] = (byte) (-57);
      byteArray0[2] = (byte)0;
      byte byte1 = (byte) (-87);
      byteArray0[3] = (byte) (-87);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-103), 3809);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-110);
      byteArray0[1] = (byte)47;
      byteArray0[2] = (byte)77;
      byte byte0 = (byte) (-68);
      byteArray0[3] = (byte) (-68);
      byte byte1 = (byte)0;
      byteArray0[4] = (byte)0;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((InputStream) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      int int0 = (-553);
      // Undeclared exception!
      try { 
        classReader0.readLong((-553));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "The size must be non-negative");
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)41;
      byteArray0[0] = (byte)41;
      byteArray0[1] = (byte) (-54);
      byteArray0[2] = (byte)15;
      byteArray0[3] = (byte)64;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte) (-76);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)36;
      byteArray0[1] = (byte) (-108);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      ClassWriter classWriter0 = new ClassWriter((-3596));
      classReader0.copyPool(classWriter0);
      Attribute[] attributeArray0 = new Attribute[12];
      Attribute attribute0 = new Attribute("wheel.asm.Frame");
      char[] charArray0 = new char[7];
      charArray0[0] = 'H';
      charArray0[1] = 'v';
      charArray0[2] = 'c';
      charArray0[3] = 'f';
      charArray0[4] = 'c';
      charArray0[5] = 'G';
      Label label0 = new Label();
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 2);
      Attribute attribute1 = new Attribute("wheel.asm.Frame");
      attributeArray0[1] = attribute1;
      ClassReader classReader1 = new ClassReader(classReader0.b);
      Attribute attribute2 = new Attribute("wheel.asm.Frame");
      attributeArray0[5] = attribute2;
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, (-3596));
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-103);
      byteArray0[0] = (byte) (-103);
      byteArray0[1] = (byte) (-57);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-87);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-103), (byte) (-87));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)105;
      byteArray0[1] = (byte)9;
      byteArray0[2] = (byte)9;
      byteArray0[3] = (byte)58;
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-71);
      byteArray0[7] = (byte)56;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, 64, (byte)105);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      int int0 = ClassReader.SKIP_FRAMES;
      classReader0.readLong(4);
      classReader0.getInterfaces();
      classReader0.getInterfaces();
      char[] charArray0 = new char[5];
      charArray0[0] = '2';
      classReader0.getSuperName();
      charArray0[1] = 'X';
      charArray0[2] = 'n';
      char char0 = '0';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)47;
      byteArray0[1] = (byte)121;
      byteArray0[2] = (byte)31;
      byteArray0[3] = (byte)36;
      byteArray0[4] = (byte) (-51);
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertFalse(boolean0);
  }
}
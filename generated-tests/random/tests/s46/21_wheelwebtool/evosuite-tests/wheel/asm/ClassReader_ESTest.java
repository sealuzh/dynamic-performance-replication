/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 07:48:49 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
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
      classReader0.getInterfaces();
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.copyPool(classWriter0);
      classReader0.getSuperName();
      Label[] labelArray0 = new Label[2];
      classReader0.getInterfaces();
      Label label0 = new Label();
      labelArray0[1] = label0;
      classReader0.readLabel(1, labelArray0);
      int int0 = classReader0.getAccess();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, (Attribute[]) null, 2);
      // Undeclared exception!
      try { 
        classReader0.readUnsignedShort((-348));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ClassReader classReader0 = new ClassReader("wheel.asm.MethodWriter");
      classReader0.getInterfaces();
      classReader0.getClassName();
      char[] charArray0 = new char[8];
      charArray0[0] = '&';
      charArray0[1] = '';
      charArray0[2] = '6';
      charArray0[3] = ';';
      charArray0[4] = 'D';
      charArray0[5] = 'V';
      charArray0[6] = '&';
      charArray0[7] = 'X';
      // Undeclared exception!
      try { 
        classReader0.readConst(25, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getInterfaces();
      ClassWriter classWriter0 = new ClassWriter(4);
      classWriter0.visitAnnotation("wheel.asm.ClassReader", false);
      classReader0.copyPool(classWriter0);
      Label[] labelArray0 = new Label[5];
      Label label0 = new Label();
      labelArray0[0] = label0;
      label0.visitSubroutine(label0, 4, 1);
      Label label1 = new Label();
      label0.info = (Object) label1;
      Label label2 = classReader0.readLabel(1, labelArray0);
      assertFalse(label2.equals((Object)label1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      classReader0.getInterfaces();
      assertEquals(8070, classReader0.header);
      
      ClassWriter classWriter0 = new ClassWriter(4);
      classWriter0.newUTF8("wheel.asm.ClassReader");
      classReader0.copyPool(classWriter0);
      classWriter0.version = 1;
      classWriter0.visitAnnotation("wheel.asm.ClassReader", false);
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
      
      int int0 = classReader0.readByte(1);
      assertEquals(254, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-74);
      byteArray0[1] = (byte)12;
      byteArray0[2] = (byte) (-41);
      byte byte0 = (byte) (-8);
      byteArray0[3] = (byte) (-8);
      byteArray0[4] = (byte) (-57);
      byteArray0[5] = (byte) (-83);
      byteArray0[6] = (byte) (-62);
      byteArray0[7] = (byte)5;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-8), 126);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.NotFileFilter");
      int int0 = 91;
      char[] charArray0 = new char[5];
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      charArray0[0] = 'I';
      charArray0[1] = 'e';
      charArray0[2] = 'L';
      charArray0[3] = '6';
      classReader0.getClassName();
      charArray0[4] = 'o';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(406, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getSuperName();
      classReader0.readLong(1763);
      ClassWriter classWriter0 = new ClassWriter(1763);
      classReader0.copyPool(classWriter0);
      classReader0.getItem(1);
      char[] charArray0 = new char[7];
      charArray0[0] = '%';
      charArray0[1] = 'I';
      charArray0[2] = 'T';
      charArray0[3] = 'o';
      charArray0[4] = '@';
      charArray0[5] = ')';
      charArray0[6] = '[';
      // Undeclared exception!
      try { 
        classReader0.readClass(96, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-56);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.skip((byte) (-56));
      byteArrayInputStream0.read();
      byteArrayInputStream0.close();
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
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)1;
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-69);
      byteArray0[3] = (byte)0;
      byte byte1 = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte)0, 68);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.NotFileFilter");
      classReader0.getSuperName();
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      Attribute[] attributeArray0 = new Attribute[6];
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.NotFileFilter");
      attributeArray0[0] = attribute0;
      char[] charArray0 = new char[4];
      charArray0[0] = 'I';
      charArray0[1] = 'S';
      charArray0[2] = '?';
      charArray0[3] = 't';
      Attribute attribute1 = attribute0.read(classReader0, 1, 1010, charArray0, 1010, (Label[]) null);
      attributeArray0[1] = attribute1;
      Attribute attribute2 = new Attribute("org.apache.commons.io.filefilter.NotFileFilter");
      attributeArray0[2] = attribute2;
      Attribute attribute3 = attribute0.next;
      attributeArray0[3] = null;
      Attribute attribute4 = attribute1.next;
      attributeArray0[4] = null;
      Attribute attribute5 = attribute0.next;
      attributeArray0[5] = null;
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 982);
      classReader0.readConst(2, charArray0);
      classReader0.copyPool(classWriter0);
      assertEquals(701, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)101;
      byteArray0[1] = (byte) (-91);
      byteArray0[2] = (byte)100;
      byteArray0[3] = (byte)2;
      byte byte0 = (byte)0;
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
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(8070, classReader0.header);
      assertEquals(0, stringArray0.length);
      
      ClassWriter classWriter0 = new ClassWriter(4);
      classWriter0.visitAnnotation("wheel.asm.ClassReader", false);
      classReader0.copyPool(classWriter0);
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
      assertNotNull(string0);
      
      Label[] labelArray0 = new Label[2];
      Label label0 = new Label();
      labelArray0[0] = label0;
      label0.visitSubroutine(label0, 4, 1);
      Label label1 = new Label();
      label0.inputStackTop = 8;
      labelArray0[1] = label1;
      classReader0.readLabel(1, labelArray0);
      short short0 = classReader0.readShort(2);
      assertEquals((short) (-17730), short0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = MockFile.createTempFile("l;_90a", "/h*7j*0C");
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
  public void test15()  throws Throwable  {
      String string0 = "wheel.asm.Item";
      ClassReader classReader0 = new ClassReader("wheel.asm.Item");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      int int0 = 2327;
      classReader0.accept((ClassVisitor) classWriter0, 2327);
      ClassWriter classWriter1 = new ClassWriter(8);
      classReader0.copyPool(classWriter1);
      char[] charArray0 = new char[2];
      char char0 = '1';
      charArray0[0] = '1';
      classWriter1.newClass("wheel.asm.Item");
      char char1 = 'N';
      charArray0[1] = 'N';
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
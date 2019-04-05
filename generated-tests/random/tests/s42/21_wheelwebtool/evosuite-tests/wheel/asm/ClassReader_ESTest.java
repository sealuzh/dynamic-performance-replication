/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 03:48:37 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
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
import wheel.asm.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.newFieldItem("wheel.asm.ClassReader", "wheel.asm.ClassReader", "wheel.asm.ClassReader");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
      char[] charArray0 = new char[1];
      charArray0[0] = '%';
      // Undeclared exception!
      try { 
        classReader0.readClass(22, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AgeFileFilter");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      int int0 = 48;
      char[] charArray0 = new char[7];
      charArray0[0] = 'c';
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "jKWjo.");
      charArray0[1] = '';
      char char0 = '3';
      charArray0[2] = '3';
      charArray0[3] = 'O';
      charArray0[4] = '9';
      // Undeclared exception!
      try { 
        classReader0.readConst(48, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      assertEquals(271, classReader0.header);
      
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      ClassWriter classWriter0 = new ClassWriter(271);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
      int int0 = ClassReader.SKIP_FRAMES;
      short short0 = classReader0.readShort(126);
      assertEquals((short)27695, short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DelegateFileFilter");
      int int0 = 5;
      char[] charArray0 = new char[9];
      charArray0[0] = 'd';
      charArray0[1] = 'Q';
      charArray0[2] = '(';
      charArray0[3] = 'o';
      charArray0[4] = 'v';
      charArray0[5] = '3';
      charArray0[6] = '@';
      charArray0[7] = '/';
      charArray0[8] = 'L';
      // Undeclared exception!
      try { 
        classReader0.readConst(5, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      assertEquals(271, classReader0.header);
      
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
      int int0 = classReader0.readUnsignedShort(2);
      assertEquals(47806, int0);
      
      short short0 = classReader0.readShort(126);
      assertEquals((short)27695, short0);
      
      int int1 = classReader0.readByte(126);
      assertEquals(108, int1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      ClassWriter classWriter0 = new ClassWriter(575);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classWriter0.index = 927;
      classReader0.accept((ClassVisitor) classAdapter0, 2);
      classReader0.getClassName();
      // Undeclared exception!
      try { 
        classReader0.readShort((-881));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -881
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "wheel.asm.ClassAdapter";
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassAdapter");
      int int0 = 128;
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.copyPool(classWriter0);
      classWriter0.newDouble(8);
      Label[] labelArray0 = null;
      // Undeclared exception!
      try { 
        classReader0.readLabel(128, (Label[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.HiddenFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      classReader0.copyPool(classWriter0);
      classReader0.getClassName();
      classReader0.getInterfaces();
      // Undeclared exception!
      try { 
        classReader0.getItem((-547));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -547
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
      int int0 = classReader0.readUnsignedShort(2);
      assertEquals(47806, int0);
      
      short short0 = classReader0.readShort(126);
      assertEquals((short)27695, short0);
      
      int int1 = classReader0.getAccess();
      assertEquals(32, int1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "wheel.asm.ClassReader";
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      int int0 = (-2117);
      // Undeclared exception!
      try { 
        classReader0.readShort((-2117));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2117
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.EmptyFileFilter");
      int int0 = (-657);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ClassWriter classWriter0 = new ClassWriter(classReader0, 46);
      classReader0.accept((ClassVisitor) classWriter0, 32);
      // Undeclared exception!
      try { 
        classReader0.readUnsignedShort((-657));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassWriter classWriter0 = new ClassWriter(530);
      classReader0.copyPool(classWriter0);
      classReader0.getClassName();
      int int0 = 2654;
      Label[] labelArray0 = new Label[2];
      Label label0 = classReader0.readLabel(1, labelArray0);
      Label label1 = label0.next;
      labelArray0[0] = null;
      // Undeclared exception!
      try { 
        classReader0.readLabel(153, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 153
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)38;
      byteArray0[1] = (byte) (-8);
      String string0 = "f=";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "f=");
      byteArray0[2] = (byte)73;
      byteArray0[3] = (byte)34;
      byteArray0[4] = (byte)36;
      byte byte0 = (byte)81;
      byteArray0[5] = (byte)81;
      byteArray0[6] = (byte)6;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-8), 37);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)85;
      byteArray0[3] = (byte) (-128);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-127);
      byteArray0[6] = (byte)90;
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.getClassName();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)107;
      byteArray0[2] = (byte)29;
      byteArray0[3] = (byte) (-84);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)4, 332);
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
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)85;
      byteArray0[3] = (byte) (-128);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-127);
      byteArray0[6] = (byte)90;
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
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassAdapter");
      int int0 = 381;
      classReader0.getInterfaces();
      char[] charArray0 = new char[4];
      charArray0[0] = 'p';
      ClassWriter classWriter0 = new ClassWriter(1302);
      classReader0.accept((ClassVisitor) classWriter0, 392);
      charArray0[1] = 'T';
      charArray0[2] = 'f';
      charArray0[3] = '3';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(381, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("D/U=?$;&Q,a`@");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-118);
      byteArray0[1] = (byte)109;
      byteArray0[2] = (byte)9;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte) (-124);
      byteArray0[5] = (byte) (-86);
      byteArray0[6] = (byte)63;
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
  public void test20()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ClassReader classReader0 = new ClassReader("wheel.asm.MethodWriter");
      classReader0.getSuperName();
      ClassWriter classWriter0 = new ClassWriter(1);
      // Undeclared exception!
      classReader0.accept((ClassVisitor) classWriter0, 56);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-72);
      byteArray0[1] = (byte)67;
      byteArray0[2] = (byte)46;
      byteArray0[3] = (byte)58;
      byteArray0[4] = (byte) (-79);
      byteArray0[5] = (byte)0;
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
  public void test22()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      PipedInputStream pipedInputStream1 = null;
      try {
        pipedInputStream1 = new PipedInputStream(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)44;
      byteArray0[1] = (byte)56;
      byte byte0 = (byte) (-1);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)49;
      byteArray0[4] = (byte)25;
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
  public void test24()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
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
}

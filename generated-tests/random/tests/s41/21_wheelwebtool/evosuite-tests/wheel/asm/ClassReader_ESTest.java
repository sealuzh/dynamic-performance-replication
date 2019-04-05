/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 02:09:45 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
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
import wheel.asm.Frame;
import wheel.asm.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ClassReader classReader0 = new ClassReader("java/lang/String");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 364);
      classReader0.accept((ClassVisitor) classWriter0, (-638));
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 6);
      classReader0.copyPool(classWriter0);
      int int0 = classReader0.getAccess();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Handler");
      ClassWriter classWriter0 = new ClassWriter(273);
      classWriter0.newFloat(2);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      int int0 = (-3658);
      // Undeclared exception!
      try { 
        classReader0.readShort((-3658));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3658
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "wheel.asm.ClassWriter";
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1670);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[6];
      Attribute attribute0 = new Attribute("");
      attributeArray0[0] = attribute0;
      Attribute attribute1 = new Attribute("aQzvrb$:LE{v");
      attributeArray0[1] = attribute1;
      char[] charArray0 = new char[9];
      charArray0[0] = 'o';
      charArray0[1] = '5';
      charArray0[2] = 'Y';
      charArray0[3] = 'V';
      charArray0[4] = 'C';
      charArray0[5] = 's';
      charArray0[6] = 'Z';
      charArray0[7] = '*';
      charArray0[8] = 'Y';
      int int0 = 6;
      Label[] labelArray0 = new Label[0];
      // Undeclared exception!
      try { 
        attribute1.read(classReader0, (-2296), 2, charArray0, 6, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 510);
      classReader0.accept((ClassVisitor) classWriter0, 734);
      char[] charArray0 = new char[2];
      charArray0[0] = 't';
      charArray0[1] = 'R';
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

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
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
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.EmptyFileFilter");
      FileSystemHandling.shouldAllThrowIOExceptions();
      ClassWriter classWriter0 = new ClassWriter(classReader0, 3028);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[9];
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.EmptyFileFilter");
      Attribute attribute1 = attribute0.next;
      attributeArray0[0] = null;
      Attribute attribute2 = new Attribute("StackMap");
      attributeArray0[1] = attribute2;
      Attribute attribute3 = new Attribute("");
      attributeArray0[2] = attribute3;
      Attribute attribute4 = new Attribute("org.apache.commons.io.filefilter.EmptyFileFilter");
      attributeArray0[3] = attribute4;
      Attribute attribute5 = new Attribute("W9S*ow44");
      attributeArray0[4] = attribute5;
      Attribute attribute6 = new Attribute("W9S*ow44");
      attributeArray0[5] = attribute6;
      Attribute attribute7 = new Attribute("W9S*ow44");
      attributeArray0[6] = attribute7;
      Attribute attribute8 = new Attribute("Ljava/lang/Synthetic;");
      attributeArray0[7] = attribute8;
      int int0 = 67;
      int int1 = 4;
      char[] charArray0 = new char[5];
      charArray0[0] = ',';
      charArray0[1] = 'F';
      charArray0[2] = '{';
      charArray0[3] = '0';
      charArray0[4] = 'm';
      int int2 = 193;
      Label[] labelArray0 = new Label[6];
      Frame frame0 = new Frame();
      Label label0 = frame0.owner;
      labelArray0[0] = null;
      Label label1 = classReader0.readLabel(1, labelArray0);
      labelArray0[1] = label1;
      // Undeclared exception!
      try { 
        classReader0.readLabel(193, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 193
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("/WdzE3=@j'ddg*");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
      assertEquals(4951, classReader0.header);
      
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.EmptyFileFilter");
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        classReader0.readUnsignedShort((-2743));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Type");
      char[] charArray0 = new char[13];
      charArray0[0] = 'X';
      charArray0[12] = 'X';
      classReader0.getSuperName();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      charArray0[2] = 's';
      classReader0.readClass(43, charArray0);
      classReader0.getClassName();
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.copyPool(classWriter0);
      // Undeclared exception!
      try { 
        classReader0.readUTF8(43, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 248);
      classReader0.copyPool(classWriter0);
      classReader0.readByte(247);
      // Undeclared exception!
      try { 
        classReader0.readConst((-1180), (char[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1180
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      ClassWriter classWriter0 = new ClassWriter(2);
      classReader0.accept((ClassVisitor) classWriter0, 3925);
      long long0 = classReader0.readLong(332);
      assertEquals(22049, classReader0.header);
      assertEquals(249960775156988170L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-14);
      byteArray0[1] = (byte)16;
      byteArray0[2] = (byte) (-89);
      int int0 = 70;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (-1590), 70);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)28;
      byteArray0[1] = (byte)91;
      byteArray0[2] = (byte)111;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)23;
      byteArray0[5] = (byte)77;
      byteArray0[6] = (byte)64;
      byteArray0[7] = (byte)84;
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
}
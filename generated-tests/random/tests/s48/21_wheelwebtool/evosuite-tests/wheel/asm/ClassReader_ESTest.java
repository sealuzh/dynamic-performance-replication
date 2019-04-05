/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:29:27 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      ClassReader classReader0 = new ClassReader("wheel.asm.Type");
      classReader0.readShort(2623);
      ClassWriter classWriter0 = new ClassWriter((short)29185);
      classReader0.accept((ClassVisitor) classWriter0, 3658);
      Label[] labelArray0 = new Label[6];
      // Undeclared exception!
      try { 
        classReader0.readLabel(4944, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4944
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      Attribute[] attributeArray0 = new Attribute[1];
      Attribute attribute0 = new Attribute("1*W~G>\"cu?HY]");
      attributeArray0[0] = attribute0;
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
      classReader0.readLong(16);
      int int0 = classReader0.getAccess();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      String string0 = classReader0.getClassName();
      assertEquals("wheel/asm/FieldWriter", string0);
      
      int int0 = classReader0.getAccess();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      // Undeclared exception!
      try { 
        classReader0.getItem((-3167));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3167
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)101;
      byteArray0[1] = (byte) (-111);
      byteArray0[2] = (byte) (-59);
      byteArray0[3] = (byte)1;
      byte byte0 = (byte)124;
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray0[4] = (byte)124;
      byteArray0[5] = (byte)12;
      byteArray0[6] = (byte) (-8);
      byteArray0[7] = (byte) (-8);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-8), 371);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      int int0 = 1;
      char[] charArray0 = new char[5];
      charArray0[0] = ':';
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
      classReader0.accept((ClassVisitor) classWriter0, 4951);
      charArray0[0] = 'I';
      char char0 = 'u';
      charArray0[2] = 'u';
      char char1 = 'J';
      // Undeclared exception!
      try { 
        classReader0.readClass(1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Type");
      String string0 = classReader0.getSuperName();
      assertNotNull(string0);
      assertEquals(3065, classReader0.header);
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      long long0 = classReader0.readLong(16);
      assertEquals(26459055983713792L, long0);
      assertEquals(1734, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte) (-81);
      byteArray0[2] = (byte) (-50);
      byteArray0[3] = (byte)46;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-50), (byte) (-50));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)92;
      byteArray0[2] = (byte) (-114);
      byteArray0[3] = (byte) (-119);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-61);
      byteArray0[6] = (byte) (-100);
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
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      int int0 = 1;
      char[] charArray0 = new char[5];
      charArray0[0] = ':';
      charArray0[1] = 'I';
      charArray0[2] = 'u';
      char char0 = 'J';
      // Undeclared exception!
      try { 
        classReader0.readClass(1, charArray0);
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
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ro#S[9");
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)12;
      byteArray0[2] = (byte)2;
      byteArray0[3] = (byte) (-1);
      int int0 = 352;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 352, 357);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      sequenceInputStream0.available();
      sequenceInputStream0.available();
      sequenceInputStream0.read(byteArray0);
      sequenceInputStream0.read();
      sequenceInputStream0.markSupported();
      byteArrayInputStream0.markSupported();
      byteArrayInputStream0.read(byteArray0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(sequenceInputStream0);
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
        classReader0 = new ClassReader((byte[]) null, 81, 101);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      PipedInputStream pipedInputStream0 = new PipedInputStream(1122);
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
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-80);
      byteArray0[1] = (byte) (-13);
      byteArray0[2] = (byte)35;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)46;
      byteArray0[5] = (byte) (-19);
      byteArray0[6] = (byte) (-71);
      byteArray0[7] = (byte)66;
      byteArray0[8] = (byte)4;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-19), (byte) (-80));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      int int0 = 1;
      char[] charArray0 = new char[5];
      char char0 = '+';
      charArray0[0] = '+';
      ClassWriter classWriter0 = new ClassWriter((-3127));
      classReader0.accept((ClassVisitor) classWriter0, 1346);
      charArray0[1] = 'I';
      char char1 = 'u';
      classWriter0.cr = classReader0;
      charArray0[2] = 'u';
      char char2 = 'R';
      classReader0.copyPool(classWriter0);
      // Undeclared exception!
      try { 
        classReader0.readClass(1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      int int0 = 1;
      char[] charArray0 = new char[5];
      classReader0.getClassName();
      charArray0[0] = ':';
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
      classReader0.accept((ClassVisitor) classWriter0, 1346);
      charArray0[0] = 'I';
      char char0 = 'u';
      charArray0[2] = 'u';
      char char1 = 'J';
      // Undeclared exception!
      try { 
        classReader0.readClass(1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)88;
      byte byte0 = (byte)48;
      byteArray0[1] = (byte)48;
      int int0 = 18;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, 18, 54);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
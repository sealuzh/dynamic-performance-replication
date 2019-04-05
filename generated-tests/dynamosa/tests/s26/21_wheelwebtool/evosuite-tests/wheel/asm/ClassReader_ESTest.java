/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 15:09:53 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.Label;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      int int0 = classReader0.readUnsignedShort(63);
      assertEquals(28013, int0);
      assertEquals(530, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      short short0 = classReader0.readShort(4);
      assertEquals((short)0, short0);
      assertEquals(530, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      short short0 = classReader0.readShort(2);
      assertEquals(1531, classReader0.header);
      assertEquals((short) (-17730), short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      Label[] labelArray0 = new Label[8];
      classReader0.readLabel(2, labelArray0);
      assertEquals(530, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      int int0 = classReader0.readInt(332);
      assertEquals(1531, classReader0.header);
      assertEquals(1869768495, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      Type type0 = (Type)classReader0.readConst(2, (char[]) null);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      assertEquals(1531, classReader0.header);
      
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
      char[] charArray0 = new char[2];
      String string0 = classReader0.readClass(28, charArray0);
      assertEquals("INSENSITIVE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      classReader0.readByte(11);
      assertEquals(530, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      // Undeclared exception!
      try { 
        classReader0.readUnsignedShort((-1128));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readUTF8((-427), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      short short0 = classReader0.readShort(185);
      assertEquals((short)2889, short0);
      assertEquals(1531, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      long long0 = classReader0.readLong(0);
      assertEquals(530, classReader0.header);
      assertEquals((-3819410108757049297L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      Label[] labelArray0 = new Label[2];
      // Undeclared exception!
      try { 
        classReader0.readLabel((-4636), labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4636
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      int int0 = classReader0.readInt(2);
      assertEquals(1531, classReader0.header);
      assertEquals((-1161953280), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readConst(2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      // Undeclared exception!
      try { 
        classReader0.readConst((-8166), (char[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -8166
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        classReader0.readClass(28, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readClass((-733), (char[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      int int0 = classReader0.readByte(15);
      assertEquals(9, int0);
      assertEquals(1531, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      int int0 = classReader0.getItem(2);
      assertEquals(1531, classReader0.header);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 47);
      classReader0.copyPool(classWriter0);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassWriter classWriter0 = new ClassWriter(2);
      Attribute[] attributeArray0 = new Attribute[1];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, (-902));
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 320);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 2);
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-3134));
      classReader0.accept((ClassVisitor) classWriter0, 0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      // Undeclared exception!
      try { 
        classReader0.readUTF8((byte)11, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readLong((-379));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -379
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readLabel((-1215), (Label[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      Label[] labelArray0 = new Label[0];
      // Undeclared exception!
      try { 
        classReader0.readLabel(8, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      // Undeclared exception!
      try { 
        classReader0.readInt((-134));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -134
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassReader classReader1 = new ClassReader(classReader0.b, 530, 1);
      // Undeclared exception!
      try { 
        classReader1.getInterfaces();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassReader classReader1 = new ClassReader(classReader0.b, 1531, 1531);
      // Undeclared exception!
      try { 
        classReader1.getClassName();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      // Undeclared exception!
      try { 
        classReader0.copyPool((ClassWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      Attribute[] attributeArray0 = new Attribute[3];
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) null, attributeArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassReader classReader1 = new ClassReader(classReader0.b, 1531, 1531);
      ClassWriter classWriter0 = new ClassWriter(371);
      // Undeclared exception!
      try { 
        classReader1.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) null, 319);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassReader classReader1 = new ClassReader(classReader0.b, 1531, 1531);
      ClassWriter classWriter0 = new ClassWriter(615);
      // Undeclared exception!
      try { 
        classReader1.accept((ClassVisitor) classWriter0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((byte[]) null, 1217, 1217);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
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
  public void test39()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 109, 1218);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArrayInputStream0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassWriter classWriter0 = new ClassWriter(535);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      char[] charArray0 = new char[0];
      String string0 = classReader0.readUTF8(1531, charArray0);
      assertEquals("<init>", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(2596, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassWriter classWriter0 = new ClassWriter(46);
      Attribute[] attributeArray0 = new Attribute[4];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
      assertEquals(4, attributeArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readClass(189, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      int int0 = classReader0.readInt(0);
      assertEquals(1531, classReader0.header);
      assertEquals((-889275714), int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.FilenameUtils");
      long long0 = classReader0.readLong(4);
      assertEquals(201885223424L, long0);
      assertEquals(3839, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.FilenameUtils");
      // Undeclared exception!
      try { 
        classReader0.readShort((-1469));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1469
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readConst(2, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassReader classReader1 = new ClassReader(classReader0.b, 1531, 1531);
      // Undeclared exception!
      try { 
        classReader1.getSuperName();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 40
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.FilenameUtils");
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        classReader0.readConst(122, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4428);
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.FilenameUtils");
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 332);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassWriter classWriter0 = new ClassWriter((-81));
      classReader0.accept((ClassVisitor) classWriter0, (-81));
      assertEquals(33, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
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
  public void test56()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("?BApgT");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(530, classReader0.header);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.FilenameUtils");
      classReader0.getInterfaces();
      assertEquals(3839, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      assertEquals(530, classReader0.header);
      
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 1, (-927));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 842
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      assertEquals(530, classReader0.header);
      
      String string0 = classReader0.getClassName();
      assertEquals("org/apache/commons/io/filefilter/TrueFileFilter", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      // Undeclared exception!
      try { 
        classReader0.readByte((-635));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -635
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      // Undeclared exception!
      try { 
        classReader0.getItem((-419));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -419
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      int int0 = classReader0.getAccess();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.FilenameUtils");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      assertEquals(3839, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassReader classReader1 = new ClassReader("org.apache.commons.io.IOCase");
      ClassWriter classWriter0 = new ClassWriter(classReader1, 247);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      assertNotSame(classReader0, classReader1);
  }
}

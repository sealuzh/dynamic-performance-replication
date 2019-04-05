/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:33:44 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      int int0 = 711;
      char[] charArray0 = new char[5];
      classReader0.getInterfaces();
      charArray0[0] = 's';
      charArray0[1] = 'v';
      char char0 = '-';
      // Undeclared exception!
      try { 
        classReader0.readConst(2642, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2642
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "wheel.asm.ClassAdapter";
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassAdapter");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      classReader0.readByte(148);
      classReader0.getClassName();
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.copyPool(classWriter0);
      classReader0.getInterfaces();
      Attribute[] attributeArray0 = new Attribute[8];
      Attribute attribute0 = new Attribute("wheel/asm/ClassAdapter");
      char[] charArray0 = new char[9];
      charArray0[0] = 'U';
      charArray0[1] = 'J';
      charArray0[2] = '<';
      charArray0[3] = '+';
      charArray0[4] = 'A';
      charArray0[5] = 'P';
      charArray0[6] = 'd';
      charArray0[7] = '8';
      charArray0[8] = 'Q';
      int int0 = 8;
      Label[] labelArray0 = null;
      // Undeclared exception!
      try { 
        attribute0.read(classReader0, 133, (-1934), charArray0, 8, (Label[]) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.MethodWriter");
      int int0 = 3147;
      ClassWriter classWriter0 = new ClassWriter(8);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 3147);
      classReader0.getInterfaces();
      char[] charArray0 = new char[3];
      char char0 = 't';
      // Undeclared exception!
      try { 
        classReader0.readConst(1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 1, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 938
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      classReader0.getItem(7);
      char[] charArray0 = new char[8];
      charArray0[0] = '~';
      charArray0[1] = 'h';
      charArray0[2] = 'a';
      charArray0[3] = 's';
      charArray0[4] = 'z';
      charArray0[5] = '@';
      charArray0[6] = 'o';
      charArray0[7] = 'e';
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
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Attribute");
      classReader0.readByte(1675);
      classReader0.readLong(1675);
      ClassWriter classWriter0 = new ClassWriter(1274);
      Attribute[] attributeArray0 = new Attribute[3];
      Attribute attribute0 = new Attribute("wheel.asm.Attribute");
      char[] charArray0 = new char[4];
      charArray0[0] = 'M';
      ClassWriter classWriter1 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter1, attributeArray0, 6);
      charArray0[1] = '`';
      charArray0[2] = '=';
      charArray0[3] = 'X';
      Attribute attribute1 = attribute0.read(classReader0, 2, 8, charArray0, 0, (Label[]) null);
      attributeArray0[0] = attribute1;
      Attribute attribute2 = attribute1.next;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      attributeArray0[1] = null;
      Attribute attribute3 = attribute1.next;
      String string0 = classReader0.getSuperName();
      attributeArray0[2] = null;
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
      Object object0 = classReader0.readConst(76, charArray0);
      assertFalse(object0.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.MethodWriter");
      char[] charArray0 = new char[1];
      charArray0[0] = '\'';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(726, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 19;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((byte[]) null, 19, 19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-89);
      byteArray0[1] = (byte) (-97);
      byteArray0[2] = (byte) (-80);
      byteArray0[3] = (byte)40;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, 0, (byte) (-97));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      sequenceInputStream0.skip((-348L));
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
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)59;
      byteArray0[1] = (byte)39;
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
  public void test11()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("<;/V?m{| tf^YWJ!");
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
  public void test13()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("&]^!BuuB<*y9yvl)");
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)76;
      byte byte0 = (byte) (-32);
      byteArray0[1] = (byte) (-32);
      byteArray0[2] = (byte) (-1);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-32), (byte)76);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)92;
      byteArray0[2] = (byte)100;
      byteArray0[3] = (byte) (-8);
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte) (-6);
      byte byte0 = (byte) (-17);
      byteArray0[6] = (byte) (-17);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-8), 255);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "wheel.asm.ClassReader";
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8070);
      String string1 = "LIJJBB%M7gzoFaW,9>";
      char[] charArray0 = new char[1];
      charArray0[0] = 'd';
      // Undeclared exception!
      try { 
        classReader0.readConst(1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("LineNumberTable");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-64);
      byteArray0[0] = (byte) (-64);
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
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.getAccess();
      ClassWriter classWriter0 = new ClassWriter(22049);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classWriter0.version = 22049;
      String string0 = "StackMapTable";
      classWriter0.newField("StackMapTable", "java/lang/Class", "StackMapTable");
      // Undeclared exception!
      classReader0.accept((ClassVisitor) classAdapter0, 88);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 5;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((byte[]) null, 5, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("`XfNRa1K_Nw`cx7t$");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }
}

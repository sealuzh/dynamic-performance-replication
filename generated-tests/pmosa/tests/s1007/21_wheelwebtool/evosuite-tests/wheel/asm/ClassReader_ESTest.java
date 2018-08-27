/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 10:50:55 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[9];
      charArray0[0] = '~';
      charArray0[1] = '`';
      charArray0[2] = 'f';
      charArray0[3] = '%';
      charArray0[4] = '0';
      charArray0[5] = 't';
      charArray0[6] = ';';
      charArray0[7] = '5';
      charArray0[8] = 'Y';
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
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
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '~';
      charArray0[1] = '`';
      charArray0[2] = 'f';
      charArray0[3] = '%';
      charArray0[4] = '0';
      charArray0[5] = 't';
      charArray0[7] = '5';
      charArray0[8] = 'Y';
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
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
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-1);
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.getSuperName();
      int int0 = 91;
      ClassWriter classWriter0 = new ClassWriter(91);
      classReader0.getSuperName();
      classReader0.accept((ClassVisitor) classWriter0, (int) (byte) (-1));
      Label[] labelArray0 = null;
      classReader0.readLabel(2, (Label[]) null);
      char char0 = '.';
      char char1 = 'I';
      char[] charArray0 = new char[4];
      charArray0[0] = char0;
      charArray0[1] = char1;
      charArray0[2] = char1;
      char char2 = 'K';
      charArray0[3] = char2;
      classReader0.readUTF8(int0, charArray0);
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = true;
      boolean boolean1 = false;
      boolean boolean2 = false;
      FileSystemHandling.setPermissions(evoSuiteFile0, boolean0, boolean1, boolean2);
      int int1 = (-4551);
      classReader0.readLong(int1);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, (int) byteArray0[1]);
      int int2 = (-1001);
      classReader0.readLabel(int2, labelArray0);
      classReader0.readUnsignedShort(int2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte) (-15);
      char char0 = '*';
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      char[] charArray0 = new char[5];
      charArray0[0] = '*';
      charArray0[1] = '*';
      charArray0[2] = '*';
      classReader0.getSuperName();
      charArray0[3] = '*';
      charArray0[4] = '*';
      classReader0.readByte(119);
      // Undeclared exception!
      try { 
        classReader0.readConst((byte) (-15), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -15
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-1);
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte) (-15);
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      char[] charArray0 = new char[7];
      charArray0[0] = '*';
      charArray0[1] = '*';
      ClassWriter classWriter0 = new ClassWriter(classReader0, 119);
      classReader0.accept((ClassVisitor) classWriter0, (-5037));
      classReader0.readLabel(119, (Label[]) null);
      int int0 = 129;
      classReader0.readShort(int0);
      String string0 = "ConstantValue";
      Attribute attribute0 = new Attribute(string0);
      classReader0.readUnsignedShort(byte0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      ClassWriter classWriter1 = new ClassWriter(classReader0, 26);
      classReader0.accept((ClassVisitor) classWriter1, 2);
      Label[] labelArray0 = null;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = 28;
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(":/uO");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte) (-15);
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getClassName();
      char[] charArray0 = new char[7];
      charArray0[0] = '*';
      charArray0[1] = '*';
      charArray0[2] = '*';
      charArray0[3] = '*';
      charArray0[6] = '*';
      charArray0[6] = '*';
      // Undeclared exception!
      try { 
        classReader0.readConst(91, charArray0);
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
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte) (-15);
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-392));
      classReader0.accept((ClassVisitor) classWriter0, 1);
      // Undeclared exception!
      try { 
        classReader0.readLabel((byte) (-15), (Label[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-1);
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      char[] charArray0 = new char[7];
      charArray0[0] = '*';
      charArray0[1] = '*';
      charArray0[2] = '*';
      charArray0[3] = '*';
      charArray0[4] = '*';
      charArray0[5] = '*';
      charArray0[6] = '*';
      // Undeclared exception!
      try { 
        classReader0.readConst(12, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      assertEquals(8070, classReader0.header);
      
      ClassWriter classWriter0 = new ClassWriter(classReader0, 700);
      classReader0.accept((ClassVisitor) classWriter0, 268);
      classReader0.readShort(700);
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.TrueFileFilter");
      classReader0.readUnsignedShort(3222);
      classReader0.getItem(700);
      int int0 = classReader0.readInt(268);
      assertEquals(50332160, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      int int0 = 699;
      char[] charArray0 = new char[2];
      charArray0[0] = 'v';
      charArray0[1] = 'L';
      // Undeclared exception!
      try { 
        classReader0.readConst(699, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      char[] charArray0 = new char[7];
      charArray0[0] = '*';
      // Undeclared exception!
      try { 
        classReader0.readConst(2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      int int0 = 94;
      ClassWriter classWriter0 = new ClassWriter(94);
      classWriter0.newLong((-423L));
      classReader0.accept((ClassVisitor) classWriter0, 94);
      char[] charArray0 = new char[2];
      char char0 = '7';
      charArray0[0] = char0;
      char char1 = 'N';
      charArray0[1] = char1;
      classReader0.readClass(int0, charArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 2, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 52168
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      char[] charArray0 = new char[4];
      charArray0[0] = '|';
      charArray0[1] = '[';
      charArray0[2] = '8';
      charArray0[3] = '.';
      // Undeclared exception!
      try { 
        classReader0.readConst(404, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '*';
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(713);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 2);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, (-2360));
      classReader0.getInterfaces();
      classReader0.getClassName();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '*';
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(713);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, (-2360));
      classReader0.getInterfaces();
      classReader0.getClassName();
      int int0 = 76;
      classReader0.readConst(int0, charArray0);
      classReader0.readUnsignedShort(classWriter0.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(8070);
      classReader0.accept((ClassVisitor) classWriter0, 100);
      int int0 = 31;
      classReader0.accept((ClassVisitor) classWriter0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '*';
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(713);
      ClassReader classReader1 = new ClassReader("wheel.asm.ClassReader");
      classReader1.getSuperName();
      ClassWriter classWriter1 = new ClassWriter(4);
      classReader1.accept((ClassVisitor) classWriter1, 8070);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(156);
      classReader0.accept((ClassVisitor) classWriter0, 91);
      classReader0.getAccess();
      classReader0.copyPool(classWriter0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-1);
      byteArray0[1] = (byte) (-1);
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.getSuperName();
      ClassWriter classWriter0 = new ClassWriter(4);
      char[] charArray0 = new char[3];
      charArray0[0] = 'm';
      charArray0[1] = '$';
      charArray0[2] = '6';
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
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      classReader0.getInterfaces();
      char[] charArray0 = new char[5];
      charArray0[0] = '>';
      charArray0[1] = '6';
      charArray0[2] = 'F';
      charArray0[3] = 'z';
      charArray0[4] = '7';
      // Undeclared exception!
      try { 
        classReader0.readClass(1000, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-1);
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      classReader0.getSuperName();
      ClassWriter classWriter0 = new ClassWriter(4);
      String[] stringArray0 = classReader0.getInterfaces();
      assertNotNull(stringArray0);
  }
}
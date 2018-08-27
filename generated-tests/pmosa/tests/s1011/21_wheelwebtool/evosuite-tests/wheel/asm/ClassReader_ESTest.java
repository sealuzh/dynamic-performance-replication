/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 19:57:01 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectStreamConstants;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
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
import wheel.asm.FieldWriter;
import wheel.asm.Frame;
import wheel.asm.Label;
import wheel.asm.MethodWriter;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-109);
      byteArray0[1] = (byte)53;
      byteArray0[0] = (byte)118;
      byteArray0[3] = (byte)98;
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      char[] charArray0 = new char[7];
      charArray0[0] = '\u0085';
      charArray0[1] = 'a';
      charArray0[2] = '{';
      int int0 = Type.BYTE;
      int int1 = classReader0.readInt(255);
      assertEquals(1195725827, int1);
      
      short short0 = ObjectStreamConstants.STREAM_VERSION;
      int int2 = classReader0.getItem((byte)53);
      assertEquals(1903, classReader0.header);
      assertEquals(300, int2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = classWriter0.lastField;
      ClassReader classReader1 = new ClassReader(classReader0.b, 8, 2251);
      // Undeclared exception!
      try { 
        classReader1.copyPool(classWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-109);
      byteArray0[1] = (byte)53;
      byteArray0[2] = (byte)118;
      byteArray0[3] = (byte)98;
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      char[] charArray0 = new char[7];
      charArray0[0] = 'f';
      int int0 = Type.BYTE;
      int int1 = classReader0.getAccess();
      assertEquals(33, int1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-109);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[1] = (byte)53;
      byteArray0[2] = (byte)118;
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      assertEquals(1903, classReader0.header);
      
      char[] charArray0 = new char[7];
      charArray0[0] = 'f';
      int int0 = Type.BYTE;
      String string0 = classReader0.getClassName();
      assertEquals("wheel/asm/Label", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getInterfaces();
      ClassWriter classWriter0 = new ClassWriter(1903);
      classReader0.copyPool(classWriter0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      int int0 = Type.BYTE;
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 3);
      assertEquals(1903, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getSuperName();
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.cr = classReader0;
      classReader0.accept((ClassVisitor) classWriter0, 1);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      classWriter0.firstMethod = methodWriter0;
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getSuperName();
      int int0 = Type.BYTE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      int int1 = Type.BYTE;
      int int2 = Type.BYTE;
      Attribute[] attributeArray0 = new Attribute[9];
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) null, attributeArray0, 3);
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
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter((-2279));
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 2);
      ClassWriter classWriter1 = new ClassWriter(32);
      ClassReader classReader1 = new ClassReader("java/lang/Object");
      assertEquals(927, classReader1.header);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      classReader0.accept((ClassVisitor) classWriter0, 770);
      assertEquals(33, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getSuperName();
      int int0 = Type.BYTE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      int int1 = Type.BYTE;
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(4463);
      classReader0.getClassName();
      char[] charArray0 = new char[6];
      charArray0[0] = 'H';
      charArray0[1] = 'f';
      charArray0[2] = 'Z';
      charArray0[3] = '_';
      charArray0[4] = ':';
      charArray0[5] = 'M';
      // Undeclared exception!
      try { 
        classReader0.readConst(15, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getInterfaces();
      ClassWriter classWriter0 = new ClassWriter(8);
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 1561, 1561);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7214
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(4463);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      classReader0.getClassName();
      char[] charArray0 = new char[6];
      charArray0[0] = 'H';
      charArray0[1] = 'f';
      charArray0[2] = 'Z';
      classReader0.getInterfaces();
      // Undeclared exception!
      try { 
        classReader0.readClass(2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getInterfaces();
      assertEquals(1903, classReader0.header);
      
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      classReader0.copyPool(classWriter0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      int int0 = Type.BYTE;
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 3);
      int int1 = classReader0.readByte(69);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getSuperName();
      int int0 = Type.BYTE;
      int int1 = Type.BYTE;
      ClassWriter classWriter0 = new ClassWriter(2902);
      classWriter0.newFloat((-1.0F));
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, (-3616));
      char[] charArray0 = new char[5];
      charArray0[0] = 'Y';
      charArray0[1] = 'T';
      charArray0[2] = 'r';
      charArray0[3] = '^';
      charArray0[4] = 'b';
      // Undeclared exception!
      try { 
        classReader0.readConst(207, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 207
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getSuperName();
      int int0 = Type.BYTE;
      int int1 = Type.BYTE;
      ClassWriter classWriter0 = new ClassWriter(2902);
      classWriter0.newFloat((-1.0F));
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, (-3616));
      char[] charArray0 = new char[5];
      charArray0[0] = 'Y';
      charArray0[1] = 'T';
      charArray0[2] = 'r';
      charArray0[3] = '&';
      charArray0[4] = 'b';
      int int2 = Type.BYTE;
      assertEquals(3, int2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getSuperName();
      int int0 = Type.BYTE;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      char[] charArray0 = new char[8];
      charArray0[0] = 'U';
      charArray0[1] = '\"';
      charArray0[2] = '3';
      charArray0[3] = '5';
      charArray0[4] = '=';
      charArray0[5] = '}';
      charArray0[6] = 'V';
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1903);
      classReader0.accept((ClassVisitor) classWriter0, 2);
      charArray0[7] = 'I';
      Type type0 = (Type)classReader0.readConst(3, charArray0);
      assertEquals(1, type0.getDimensions());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getInterfaces();
      ClassWriter classWriter0 = new ClassWriter(1903);
      classReader0.copyPool(classWriter0);
      char[] charArray0 = new char[9];
      charArray0[0] = ':';
      charArray0[1] = 'D';
      charArray0[2] = 'M';
      charArray0[3] = 'M';
      charArray0[4] = ':';
      charArray0[5] = 'M';
      charArray0[6] = 'L';
      charArray0[7] = 'M';
      charArray0[8] = 'M';
      // Undeclared exception!
      try { 
        classReader0.readConst(2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(1603);
      classReader0.accept((ClassVisitor) classWriter0, 333);
      assertEquals(33, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(2);
      classReader0.accept((ClassVisitor) classWriter0, 792);
      ClassWriter classWriter1 = new ClassWriter(4463);
      classReader0.copyPool(classWriter1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(4463);
      classReader0.accept((ClassVisitor) classWriter0, 2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 1818);
      ClassWriter classWriter1 = new ClassWriter(1);
      ClassReader classReader1 = new ClassReader("Synthetic");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(4463);
      classReader0.getClassName();
      char[] charArray0 = new char[6];
      charArray0[0] = 'H';
      // Undeclared exception!
      try { 
        classReader0.readConst(1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4463);
      classReader0.copyPool(classWriter0);
      int int0 = Type.BYTE;
      char[] charArray0 = new char[3];
      charArray0[0] = '3';
      charArray0[1] = '7';
      charArray0[2] = 'c';
      // Undeclared exception!
      try { 
        classReader0.readConst(3, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassReader classReader1 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(174);
      classReader1.accept((ClassVisitor) classWriter0, 174);
      ClassWriter classWriter1 = new ClassWriter(4463);
      classWriter1.visitInnerClass("java/lang/Throwable", "Invalid IOCase name: ", "Invalid IOCase name: ", (-2056));
      classReader0.copyPool(classWriter1);
      char[] charArray0 = new char[6];
      charArray0[0] = ';';
      charArray0[1] = 'V';
      charArray0[2] = '/';
      charArray0[3] = ':';
      charArray0[4] = 'l';
      charArray0[5] = 'P';
      classReader0.readConst(16777222, charArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getSuperName();
      int int0 = Type.BYTE;
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1302));
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(classReader0.b);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 1);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, pushbackInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 1);
      ClassReader classReader1 = new ClassReader(bufferedInputStream0);
      classReader1.accept((ClassVisitor) classWriter0, 8);
      char[] charArray0 = new char[5];
      charArray0[0] = 'E';
      charArray0[1] = 'l';
      charArray0[2] = '3';
      charArray0[3] = 'A';
      charArray0[4] = '>';
      // Undeclared exception!
      try { 
        classReader1.readConst(2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      classReader0.getSuperName();
      int int0 = Type.BYTE;
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1302));
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(classReader0.b);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 1);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, pushbackInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 1);
      ClassReader classReader1 = new ClassReader(bufferedInputStream0);
      classReader1.accept((ClassVisitor) classWriter0, 8);
      char[] charArray0 = new char[5];
      charArray0[0] = 'E';
      charArray0[1] = 'l';
      bufferedInputStream0.available();
      charArray0[2] = '3';
      // Undeclared exception!
      try { 
        classReader1.readConst(109, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      classReader0.accept((ClassVisitor) classWriter0, 1883);
      ClassWriter classWriter1 = new ClassWriter(8);
      classReader0.copyPool(classWriter0);
      // Undeclared exception!
      try { 
        classReader0.getItem((-1064));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1064
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      classReader0.accept((ClassVisitor) classWriter0, 2);
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      int int0 = 1883;
      char[] charArray0 = new char[1];
      charArray0[0] = '6';
      // Undeclared exception!
      try { 
        classReader0.readConst(339, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      ClassWriter classWriter1 = new ClassWriter(2053);
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 2, 2053);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19122
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassReader classReader1 = new ClassReader(classReader0.b);
      char[] charArray0 = new char[4];
      charArray0[0] = '?';
      charArray0[1] = 'K';
      classReader0.getInterfaces();
      charArray0[2] = '?';
      charArray0[3] = '?';
      // Undeclared exception!
      try { 
        classReader1.readConst(24, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(2);
      classReader0.accept((ClassVisitor) classWriter0, 64);
      ClassWriter classWriter1 = new ClassWriter(classWriter0.COMPUTE_FRAMES);
      classReader0.copyPool(classWriter1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(8070);
      int int0 = 64;
      classReader0.accept((ClassVisitor) classWriter0, 6);
      ClassWriter classWriter1 = new ClassWriter(int0);
      int int1 = 1310;
      ClassWriter classWriter2 = new ClassWriter(int1);
      classReader0.copyPool(classWriter2);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(327);
      classReader0.accept((ClassVisitor) classWriter0, 327);
      ClassWriter classWriter1 = new ClassWriter(4);
      classReader0.copyPool(classWriter0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(58);
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 52168
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }
}
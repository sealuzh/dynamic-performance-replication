/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 12:01:34 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
import wheel.asm.Frame;
import wheel.asm.Label;
import wheel.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
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
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      assertEquals(271, classReader0.header);
      
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2251);
      classReader0.accept((ClassVisitor) classWriter0, 189);
      String string0 = classReader0.getClassName();
      assertEquals("wheel/asm/Edge", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      classReader0.getInterfaces();
      long long0 = classReader0.readLong(4);
      assertEquals(271, classReader0.header);
      assertEquals(214750071296L, long0);
      
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1818));
      classReader0.getSuperName();
      String[] stringArray0 = new String[5];
      int int0 = (-1719);
      char[] charArray0 = new char[7];
      char char0 = 'V';
      charArray0[0] = 'V';
      char char1 = ' ';
      charArray0[1] = ' ';
      char char2 = ',';
      charArray0[2] = ',';
      classReader0.getInterfaces();
      char char3 = ' ';
      charArray0[3] = ' ';
      char char4 = '7';
      charArray0[4] = '7';
      charArray0[5] = '}';
      char char5 = 'l';
      charArray0[6] = 'l';
      // Undeclared exception!
      try { 
        classReader0.readConst(255, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 255
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1818));
      classReader0.getSuperName();
      char[] charArray0 = new char[7];
      charArray0[0] = 'V';
      charArray0[1] = ' ';
      charArray0[2] = ',';
      charArray0[3] = ' ';
      charArray0[4] = '7';
      charArray0[5] = '}';
      classReader0.readConst(1, charArray0);
      ClassWriter classWriter1 = new ClassWriter(classReader0, 61);
      MethodWriter methodWriter0 = classWriter1.firstMethod;
      classWriter0.lastMethod = null;
      classReader0.getClassName();
      int int0 = classReader0.readByte(1);
      assertEquals(254, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      assertEquals(927, classReader0.header);
      
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1818));
      classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Object");
      char[] charArray0 = new char[7];
      charArray0[0] = 'V';
      charArray0[1] = ' ';
      charArray0[2] = ',';
      charArray0[3] = '\u0011';
      charArray0[4] = '7';
      classReader0.accept((ClassVisitor) classWriter0, 70);
      String string0 = classReader0.getClassName();
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.EmptyFileFilter");
      classReader0.getClassName();
      ClassWriter classWriter0 = new ClassWriter(331);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 1);
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 1);
      assertEquals(927, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      classReader0.accept((ClassVisitor) classWriter0, (-1463));
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      int int0 = (-1818);
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1818));
      char[] charArray0 = new char[7];
      charArray0[0] = 'V';
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
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      assertEquals(927, classReader0.header);
      
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1818));
      classReader0.getSuperName();
      char[] charArray0 = new char[7];
      charArray0[0] = 'V';
      charArray0[1] = ' ';
      charArray0[2] = ' ';
      charArray0[3] = ' ';
      charArray0[4] = ' ';
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 892);
      int int0 = classReader0.readUnsignedShort(139);
      assertEquals(25971, int0);
      
      long long0 = classReader0.readLong(46);
      assertEquals(720577040881221692L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1818));
      classReader0.getSuperName();
      char[] charArray0 = new char[7];
      charArray0[0] = 'V';
      charArray0[1] = ' ';
      charArray0[2] = ',';
      charArray0[3] = ' ';
      charArray0[4] = '7';
      charArray0[5] = '}';
      classReader0.readConst(1, charArray0);
      ClassWriter classWriter1 = new ClassWriter(classReader0, 61);
      MethodWriter methodWriter0 = classWriter1.firstMethod;
      classReader0.readConst(6, charArray0);
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 4, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 46275
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1818));
      classReader0.getSuperName();
      ClassWriter classWriter1 = new ClassWriter(classReader0, 255);
      classReader0.getSuperName();
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 41);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1818));
      classReader0.getSuperName();
      char[] charArray0 = new char[7];
      charArray0[0] = 'V';
      charArray0[1] = ' ';
      charArray0[2] = ',';
      ClassWriter classWriter1 = new ClassWriter(2777);
      classReader0.accept((ClassVisitor) classWriter1, (Attribute[]) null, 167);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1818));
      classReader0.getSuperName();
      classReader0.getClassName();
      Label[] labelArray0 = new Label[6];
      Label label0 = new Label();
      labelArray0[0] = label0;
      Label label1 = label0.next;
      labelArray0[1] = null;
      Label label2 = classReader0.readLabel(4, labelArray0);
      labelArray0[2] = label2;
      Label label3 = label2.next;
      labelArray0[2] = null;
      Frame frame0 = new Frame();
      Label label4 = frame0.owner;
      labelArray0[4] = null;
      Label label5 = new Label();
      classReader0.getItem(2);
      labelArray0[5] = label5;
      // Undeclared exception!
      try { 
        classReader0.readLabel(148, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 148
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-554));
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      classReader0.accept((ClassVisitor) classWriter0, (-2590));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1818));
      classReader0.getSuperName();
      char[] charArray0 = new char[7];
      charArray0[0] = 'V';
      charArray0[1] = ' ';
      charArray0[2] = ',';
      ClassWriter classWriter1 = new ClassWriter(2777);
      classReader0.accept((ClassVisitor) classWriter1, (Attribute[]) null, 2);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Object");
      char[] charArray0 = new char[0];
      classReader0.getClassName();
      int int0 = classReader0.getAccess();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      classReader0.getClassName();
      ClassWriter classWriter0 = new ClassWriter(2);
      String string0 = classWriter0.thisName;
      classReader0.accept((ClassVisitor) classWriter0, 645);
      classReader0.getClassName();
      Attribute attribute0 = new Attribute("java/lang/Object");
      Attribute attribute1 = attribute0.next;
      ClassReader classReader1 = new ClassReader("java/lang/Object");
      ClassWriter classWriter1 = new ClassWriter(72);
      ClassReader classReader2 = null;
      try {
        classReader2 = new ClassReader(classReader1.b, (-724), 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      classReader0.getClassName();
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassWriter classWriter1 = new ClassWriter(1);
      classWriter1.getCommonSuperClass("java/lang/Throwable", "java/lang/Throwable");
      classReader0.getSuperName();
      classReader0.accept((ClassVisitor) classWriter0, 2);
      classReader0.getClassName();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(2);
      classReader0.accept((ClassVisitor) classWriter0, 174);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      assertEquals(4463, classReader0.header);
      
      String string0 = classReader0.getClassName();
      assertEquals("java/lang/Throwable", string0);
      
      ClassWriter classWriter0 = new ClassWriter(2);
      String string1 = classWriter0.thisName;
      classReader0.getInterfaces();
      ClassWriter classWriter1 = new ClassWriter(1);
      classReader0.getClassName();
      String string2 = classReader0.getClassName();
      assertEquals("java/lang/Throwable", string2);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      classReader0.getClassName();
      ClassWriter classWriter0 = new ClassWriter((-221));
      ClassWriter classWriter1 = new ClassWriter((-1918));
      classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Throwable");
      classReader0.getSuperName();
      ClassReader classReader1 = new ClassReader(classReader0.b);
      classReader1.accept((ClassVisitor) classWriter1, 10);
      classReader1.getClassName();
      classReader0.readUnsignedShort(43);
      // Undeclared exception!
      try { 
        classReader1.getItem((-1918));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1918
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      classReader0.getClassName();
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1886));
      classReader0.getSuperName();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      ClassReader classReader1 = new ClassReader(classReader0.b);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader1.accept((ClassVisitor) classAdapter0, (-534));
      char[] charArray0 = new char[0];
      classReader0.readConst(4, charArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(436);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      classReader0.accept((ClassVisitor) classWriter0, 616);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      classReader0.getClassName();
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.getSuperName();
      ClassReader classReader1 = new ClassReader(classReader0.b);
      char[] charArray0 = new char[4];
      charArray0[0] = '8';
      charArray0[1] = ';';
      charArray0[2] = '9';
      charArray0[3] = 'Q';
      // Undeclared exception!
      try { 
        classReader1.readConst(2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(8);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 2);
      char[] charArray0 = new char[6];
      charArray0[0] = '>';
      charArray0[1] = 'Y';
      charArray0[2] = '%';
      charArray0[3] = '=';
      charArray0[4] = 'L';
      charArray0[5] = 'A';
      classReader0.readConst(334, charArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassWriter");
      ClassWriter classWriter0 = new ClassWriter(7316);
      Attribute[] attributeArray0 = new Attribute[8];
      Attribute attribute0 = new Attribute("PTboi}");
      attributeArray0[0] = attribute0;
      char[] charArray0 = new char[7];
      charArray0[0] = '.';
      charArray0[1] = 'L';
      charArray0[2] = 'D';
      charArray0[3] = ';';
      charArray0[4] = '>';
      charArray0[5] = 'X';
      charArray0[6] = 'v';
      Attribute attribute1 = attribute0.read(classReader0, 255, 1, charArray0, 7316, (Label[]) null);
      attributeArray0[1] = attribute1;
      Attribute attribute2 = attribute1.read(classReader0, 182, 2, charArray0, 6, (Label[]) null);
      attributeArray0[2] = attribute2;
      Attribute attribute3 = attribute1.read(classReader0, 68, 1969, charArray0, 182, (Label[]) null);
      attributeArray0[3] = attribute3;
      Attribute attribute4 = new Attribute("PTboi}");
      attributeArray0[4] = attribute4;
      Attribute attribute5 = new Attribute("fLLUvY_=#");
      attributeArray0[5] = attribute5;
      Attribute attribute6 = attribute2.next;
      attributeArray0[6] = null;
      Attribute attribute7 = attribute5.read(classReader0, 4, 68, charArray0, 2133, (Label[]) null);
      attributeArray0[7] = attribute7;
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(8);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 2);
      char[] charArray0 = new char[6];
      charArray0[1] = 'Y';
      charArray0[2] = '%';
      ClassReader classReader1 = new ClassReader(classReader0.b, 2101, 66);
      classReader1.accept((ClassVisitor) classWriter0, classReader0.EXPAND_FRAMES);
      classReader0.getClassName();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      char[] charArray0 = new char[5];
      charArray0[0] = '>';
      charArray0[1] = '>';
      charArray0[2] = 'Y';
      charArray0[3] = 'Y';
      charArray0[4] = '>';
      // Undeclared exception!
      try { 
        classReader0.readConst(152, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      classReader0.getClassName();
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassReader classReader1 = new ClassReader("java/lang/Throwable");
      classReader1.accept((ClassVisitor) classWriter0, 255);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }
}
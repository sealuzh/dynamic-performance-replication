/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 16:55:35 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassAdapter");
      classReader0.getInterfaces();
      int int0 = 2039;
      classReader0.readInt(2039);
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      classReader0.accept((ClassVisitor) classWriter0, 2039);
      char[] charArray0 = new char[6];
      classReader0.getSuperName();
      classReader0.getSuperName();
      charArray0[0] = '^';
      charArray0[1] = '#';
      char char0 = ';';
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      // Undeclared exception!
      try { 
        classReader0.readClass((-1758), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/String");
      classReader0.getInterfaces();
      int int0 = 23;
      char[] charArray0 = new char[5];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      char char0 = 'X';
      charArray0[0] = 'X';
      charArray0[1] = 'Q';
      // Undeclared exception!
      try { 
        classReader0.readConst(23, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "wheel.asm.Frame";
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      classReader0.getSuperName();
      int int0 = 67;
      classReader0.readByte(67);
      classReader0.getInterfaces();
      char[] charArray0 = new char[2];
      charArray0[0] = 'e';
      // Undeclared exception!
      try { 
        classReader0.readConst(85, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "wheel.asm.Frame";
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      classReader0.getSuperName();
      classReader0.readByte(4);
      classReader0.getInterfaces();
      char[] charArray0 = new char[2];
      char char0 = 'e';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "wheel.asm.Frame");
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      int int0 = 59;
      classReader0.readByte(59);
      classReader0.getInterfaces();
      char[] charArray0 = new char[2];
      char char0 = 'e';
      // Undeclared exception!
      try { 
        classReader0.readConst(132, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.TrueFileFilter");
      ClassWriter classWriter0 = new ClassWriter((-374));
      classWriter0.getCommonSuperClass("org.apache.commons.io.filefilter.TrueFileFilter", "org.apache.commons.io.filefilter.TrueFileFilter");
      classWriter0.newUTF8("org.apache.commons.io.filefilter.TrueFileFilter");
      classWriter0.visitAnnotation("RuntimeInvisibleAnnotations", false);
      classWriter0.threshold = 4;
      classReader0.copyPool(classWriter0);
      classReader0.getAccess();
      classReader0.readByte(33);
      classReader0.getClassName();
      char[] charArray0 = new char[4];
      charArray0[0] = '0';
      charArray0[1] = '3';
      classReader0.readConst(33, charArray0);
      charArray0[2] = '~';
      classWriter0.cr = classReader0;
      charArray0[3] = 'O';
      // Undeclared exception!
      try { 
        classReader0.readClass(17, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7690
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      classReader0.getSuperName();
      int int0 = (-1530);
      // Undeclared exception!
      try { 
        classReader0.getItem((-1530));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1530
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8070);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[7];
      Attribute attribute0 = new Attribute("SJn");
      Attribute attribute1 = attribute0.next;
      String string0 = "";
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader("");
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
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.FalseFileFilter");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      ClassWriter classWriter0 = new ClassWriter((-1048576));
      Attribute[] attributeArray0 = new Attribute[1];
      Attribute attribute0 = new Attribute("y$_)('LJ.h^(y");
      attributeArray0[0] = attribute0;
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 69);
      // Undeclared exception!
      try { 
        classReader0.readInt((-515));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -515
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      int int0 = (-462);
      // Undeclared exception!
      try { 
        classReader0.readShort((-462));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -462
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "char");
      classReader0.getClassName();
      char[] charArray0 = new char[5];
      charArray0[0] = 'I';
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      charArray0[1] = '';
      charArray0[2] = '<';
      charArray0[3] = 'j';
      charArray0[4] = '?';
      // Undeclared exception!
      try { 
        classReader0.readConst(155, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 155
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)63;
      byteArray0[1] = (byte)84;
      byteArray0[2] = (byte) (-8);
      byteArray0[3] = (byte)37;
      byte byte0 = (byte)1;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte) (-14);
      byteArray0[6] = (byte)81;
      byte byte1 = (byte)36;
      byteArray0[7] = (byte)36;
      byteArray0[8] = (byte) (-1);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-8), 2137);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "wheel.asm.Frame";
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      classReader0.getSuperName();
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.copyPool(classWriter0);
      int int0 = 59;
      classReader0.readByte(59);
      classReader0.getInterfaces();
      char[] charArray0 = new char[2];
      char char0 = 'c';
      // Undeclared exception!
      try { 
        classReader0.readUTF8(59, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
      Attribute[] attributeArray0 = new Attribute[4];
      Attribute attribute0 = new Attribute("org.apache.commons.io.IOCase");
      int int0 = 2;
      int int1 = 10;
      char[] charArray0 = new char[0];
      int int2 = 294;
      Label[] labelArray0 = new Label[3];
      // Undeclared exception!
      try { 
        classReader0.readLabel(294, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 294
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "char");
      char[] charArray0 = new char[5];
      charArray0[0] = 'I';
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      charArray0[1] = '';
      charArray0[2] = '<';
      charArray0[3] = 'j';
      charArray0[4] = '?';
      // Undeclared exception!
      try { 
        classReader0.readConst(155, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 155
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "wheel.asm.Frame");
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      classReader0.readByte(59);
      classReader0.getInterfaces();
      char[] charArray0 = new char[2];
      charArray0[0] = 'e';
      charArray0[1] = 'A';
      // Undeclared exception!
      try { 
        classReader0.readClass(59, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 55050
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("8(,:)zo*fr_It}lJl");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-70);
      byteArray0[1] = (byte)84;
      byteArray0[2] = (byte)0;
      byte byte0 = (byte)110;
      byteArray0[3] = (byte)110;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)8;
      byteArray0[6] = (byte) (-73);
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)0;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, 121, 2);
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
      byteArray0[0] = (byte) (-115);
      byteArray0[1] = (byte)46;
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
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-97);
      byteArray0[1] = (byte) (-111);
      byteArray0[2] = (byte)71;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (-857), (byte) (-97));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)101;
      byteArray0[1] = (byte)11;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-124);
      byteArray0[4] = (byte) (-124);
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
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-115);
      byteArray0[1] = (byte) (-115);
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.FalseFileFilter");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      assertEquals(534, classReader0.header);
      
      ClassWriter classWriter0 = new ClassWriter((-1048576));
      Attribute[] attributeArray0 = new Attribute[1];
      Attribute attribute0 = new Attribute("y$_)('LJ.h^(y");
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 8);
      int int0 = ClassReader.EXPAND_FRAMES;
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(1, stringArray0.length);
      
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.FalseFileFilter");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      ClassWriter classWriter0 = new ClassWriter((-1048576));
      Attribute[] attributeArray0 = new Attribute[1];
      Attribute attribute0 = new Attribute("y$_)('LJ.h^(y");
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 8);
      // Undeclared exception!
      try { 
        classReader0.readInt((-515));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -515
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.FalseFileFilter");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, classReader0.b);
      assertEquals(534, classReader0.header);
      
      ClassWriter classWriter0 = new ClassWriter(2604);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 2);
      ClassWriter classWriter1 = new ClassWriter(classReader0, 4);
      Attribute[] attributeArray0 = new Attribute[1];
      Attribute attribute0 = new Attribute("y$_)('LJ.h^(y");
      attributeArray0[0] = attribute0;
      classReader0.accept((ClassVisitor) classWriter1, attributeArray0, 69);
      int int0 = classReader0.readInt(1);
      assertEquals((-21316096), int0);
      
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
  }
}
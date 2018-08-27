/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 02:41:51 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.Edge;
import wheel.asm.FieldWriter;
import wheel.asm.Frame;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(86);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "", "", "", "");
      Attribute attribute0 = new Attribute((String) null);
      fieldWriter0.visitAttribute(attribute0);
      int int0 = Edge.NORMAL;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(86);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      Attribute attribute0 = new Attribute((String) null);
      fieldWriter0.visitAttribute(attribute0);
      int int0 = Edge.NORMAL;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(86);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "", "", "", "");
      Attribute attribute0 = new Attribute((String) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitAttribute(attribute0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-9);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-9), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(444);
      FieldWriter fieldWriter0 = classWriter0.firstField;
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-727), "", "K[%qXYpp,j", "", "K[%qXYpp,j");
      fieldWriter1.getSize();
      fieldWriter1.visitEnd();
      classWriter0.version = (-727);
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, (-727), "", "", "", (Object) null);
      fieldWriter2.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter2.put(byteVector0);
      fieldWriter1.visitAnnotation("", true);
      Attribute attribute0 = new Attribute("");
      ByteVector byteVector1 = byteVector0.put12((-3420), 36);
      fieldWriter1.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(444);
      FieldWriter fieldWriter0 = classWriter0.firstField;
      boolean boolean0 = true;
      String string0 = "K[%qXYpp,j";
      String string1 = "";
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-727), "", "K[%qXYpp,j", "", "K[%qXYpp,j");
      int int0 = Frame.BASE_VALUE;
      fieldWriter1.visitEnd();
      classWriter0.version = (-727);
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, (-727), "", "", "", (Object) null);
      fieldWriter2.visitAnnotation("/`GT", true);
      fieldWriter2.getSize();
      ByteVector byteVector0 = null;
      try {
        byteVector0 = new ByteVector((-727));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(444);
      FieldWriter fieldWriter0 = classWriter0.firstField;
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-727), "", "K[%qXYpp,j", "", "K[%qXYpp,j");
      fieldWriter1.getSize();
      fieldWriter1.visitEnd();
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, (-727), "", "", "", (Object) null);
      ByteVector byteVector0 = new ByteVector(2438);
      ByteVector byteVector1 = classWriter0.pool;
      fieldWriter1.put(byteVector0);
      fieldWriter1.visitAnnotation("bJ", false);
      Attribute attribute0 = new Attribute("1jIHU6ojTj]q ");
      ByteVector byteVector2 = classWriter0.pool;
      byteVector0.put12(49, (-727));
      fieldWriter1.put(byteVector1);
      System.setCurrentTimeMillis((byte) (-95));
      Attribute attribute1 = attribute0.next;
      FieldWriter fieldWriter3 = classWriter0.lastField;
      // Undeclared exception!
      try { 
        fieldWriter3.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(444);
      FieldWriter fieldWriter0 = classWriter0.firstField;
      String string0 = "";
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-727), "", "K[%qXYpp,j", "", "K[%qXYpp,j");
      fieldWriter1.getSize();
      fieldWriter1.visitEnd();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)1;
      Attribute attribute0 = new Attribute("tV_+81GI9Vk");
      classWriter0.visitAttribute(attribute0);
      byteArray0[1] = (byte) (-47);
      byteArray0[2] = (byte)3;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      classWriter0.version = (-727);
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, (-727), "", "", "", (Object) null);
      fieldWriter2.visitAnnotation("/`GT", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter2.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter2.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(444);
      FieldWriter fieldWriter0 = classWriter0.firstField;
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-727), "", "K[%qXYpp,j", "", "K[%qXYpp,j");
      fieldWriter1.getSize();
      fieldWriter1.visitEnd();
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, (-727), "", "", "", (Object) null);
      ByteVector byteVector0 = new ByteVector(2438);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-95);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-95);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FieldWriter fieldWriter3 = classWriter0.firstField;
      fieldWriter3.visitAnnotation("K[%qXYpp,j", false);
      Attribute attribute0 = new Attribute("");
      ByteVector byteVector1 = classWriter0.pool;
      byteVector1.put12(1693, 1);
      fieldWriter1.put(byteVector0);
      fieldWriter3.getSize();
      fieldWriter1.visitEnd();
      assertSame(fieldWriter1, fieldWriter3);
  }
}
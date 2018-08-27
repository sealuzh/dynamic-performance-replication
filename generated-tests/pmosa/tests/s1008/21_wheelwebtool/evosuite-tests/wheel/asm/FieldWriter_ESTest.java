/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 12:02:35 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "c@}w", "c@}w", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(346);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 346, "Cc#o8)BQW9FT'", "Cc#o8)BQW9FT'", "long", (Object) null);
      fieldWriter0.visitEnd();
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put11(0, (-755));
      ByteVector byteVector2 = byteVector1.put12(1667, 0);
      ByteVector byteVector3 = byteVector2.putByte(1578);
      byteVector0.put12(0, (-3868));
      byteVector1.putLong(0L);
      ByteVector byteVector4 = byteVector3.putInt((-1011));
      fieldWriter0.put(byteVector4);
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector4);
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "Deprecated", "Signature", "Deprecated", "Deprecated");
      fieldWriter0.visitAnnotation("The wildcard array must not be null", false);
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("Signature", false);
      fieldWriter0.visitEnd();
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.putByte((-675));
      ByteVector byteVector1 = byteVector0.putUTF8("!}eF+");
      fieldWriter0.put(byteVector1);
      fieldWriter0.visitAnnotation("Signature", false);
      fieldWriter0.visitAnnotation("Signature", false);
      classWriter0.index = (-675);
      Attribute attribute0 = new Attribute("J");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 628, "", "", "The list of prefixes must not be null", "");
      fieldWriter0.getSize();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-22), "Deprecatekd", "Deprecatekd", "Deprecatekd", "Deprecatekd");
      classWriter0.toByteArray();
      FieldWriter fieldWriter1 = fieldWriter0.next;
      FieldWriter fieldWriter2 = classWriter0.lastField;
      assertSame(fieldWriter2, fieldWriter0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "c2uX=1l>s:#;O0V", "Signature", (String) null, (Object) null);
      fieldWriter0.visitAnnotation("Signature", true);
      fieldWriter0.getSize();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-489), "\b|cRP\"UF<PZzD&'$GY", "c2uX=1l>s:#;O0V", "long", "c2uX=1l>s:#;O0V");
      int int0 = fieldWriter0.getSize();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putByteArray((byte[]) null, (-22), 2);
      ByteVector byteVector1 = byteVector0.put11(131072, (-22));
      byteVector1.putUTF8("");
      fieldWriter0.put(byteVector1);
      fieldWriter0.getSize();
      FieldWriter fieldWriter1 = fieldWriter0.next;
      FieldWriter fieldWriter2 = classWriter0.lastField;
      assertSame(fieldWriter2, fieldWriter0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      String[] stringArray0 = new String[0];
      classWriter0.visit((-22), (-22), "Deprecatekd", "Deprecatekd", "org.apache.commons.io.filefilter.DirectoryFileFilter", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-22), "Deprecatekd", "Deprecatekd", "Deprecatekd", "Deprecatekd");
      classWriter0.toByteArray();
      ClassWriter classWriter1 = new ClassWriter(141);
      fieldWriter0.visitEnd();
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }
}
/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:00:06 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;
import wheel.asm.Frame;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.index = 0;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "-5y$Sgi15)+{", "-5y$Sgi15)+{", "-5y$Sgi15)+{", "7");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put12((-1727), 0);
      fieldWriter0.put(byteVector0);
      fieldWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByte(1250);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "ConstantValue", "", "ConstantValue", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.index = 0;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "-5y$Sgi15)+{", "-5y$Sgi15)+{", "-5y$Sgi15)+{", "7");
      fieldWriter0.visitAnnotation("u", false);
      ByteVector byteVector0 = new ByteVector();
      byteVector0.put12(4, 1);
      fieldWriter0.put(byteVector0);
      fieldWriter0.put(byteVector0);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-681), "ConstantValue", "", "ConstantValue", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, (-681), "ConstantValue", "", "$dOLK", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.index = 0;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "-5y$Sgi15)+{", "-5y$Sgi15)+{", "-5y$Sgi15)+{", "7");
      fieldWriter0.visitAnnotation("u", false);
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "B*!-[3quvc", "", "", "wheel.asm.ClassReader");
      fieldWriter0.visitAnnotation("", false);
      fieldWriter0.visitEnd();
      fieldWriter0.getSize();
      // Undeclared exception!
      try { 
        fieldWriter0.put((ByteVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "a>|zo", "Deprecated", "a>|zo");
      fieldWriter0.getSize();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("i-A_x1.Gzk", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByte(1250);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-681), "ConstantValue", "", "ConstantValue", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-694), "7", "UFb!ZM!mGrM85Lm", "7", "-5y$Sgi15)+{");
      fieldWriter0.visitAnnotation("3x:ZKPah1r^0", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      classWriter0.version = 340;
      byteVector0.put12((-1163), (-694));
      fieldWriter0.put(byteVector0);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.put(byteVector0);
      FieldWriter fieldWriter2 = null;
      try {
        fieldWriter2 = new FieldWriter(classWriter0, 1, "RuntimeVisibleAnnotations", (String) null, "Deprecated", classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "7", "", (String) null, "-5y$Sgi15)+{");
      fieldWriter0.visitAnnotation("", true);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putShort(0);
      ByteVector byteVector2 = byteVector1.put12(2589, (-362));
      fieldWriter0.put(byteVector2);
      fieldWriter0.put(byteVector2);
      assertSame(byteVector0, byteVector2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3572);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 262144, "fm8`Rg{vZsKY(C|-b", "fm8`Rg{vZsKY(C|-b", "-5y$Sgi15)+{", "7");
      fieldWriter0.visitAnnotation("df6^BpPQQ}s1EW`Qp_", true);
      ByteVector byteVector0 = new ByteVector(3572);
      ByteVector byteVector1 = byteVector0.put12(3572, 49);
      fieldWriter0.put(byteVector1);
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.index = 0;
      classWriter0.newDouble(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "-5y$Sgi15)+{", "-5y$Sgi15)+{", "-5y$Sgi15)+{", "7");
      Attribute attribute0 = new Attribute("7");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
      byteVector0.putInt(2);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-681), "ConstantValue", "", "ConstantValue", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
      
      System.setCurrentTimeMillis(0);
      System.setCurrentTimeMillis(2589);
      String[] stringArray0 = new String[9];
      stringArray0[0] = " DaOM>i,zk&6b2g6~";
      stringArray0[1] = "";
      stringArray0[2] = " DaOM>i,zk&6b2g6~";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = " DaOM>i,zk&6b2g6~";
      stringArray0[7] = " DaOM>i,zk&6b2g6~";
      stringArray0[8] = "-o_r)s7>';:Fd#;)";
      classWriter0.visit((-681), (-681), " DaOM>i,zk&6b2g6~", "", "", stringArray0);
      fieldWriter0.visitEnd();
      int int1 = fieldWriter0.getSize();
      assertEquals(22, int1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 0;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ClassWriter classWriter0 = new ClassWriter(0);
      int int1 = 2589;
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-681), "ConstantValue", "", "ConstantValue", (Object) null);
      Attribute attribute0 = new Attribute("ConstantValue");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }
}
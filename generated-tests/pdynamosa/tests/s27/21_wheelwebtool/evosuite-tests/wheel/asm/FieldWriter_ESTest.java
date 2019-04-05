/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 14:14:15 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.index = (-3826);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 5404, "AnnotationDefault", "AnnotationDefault", "", "AnnotationDefault");
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      classWriter0.index = (-3826);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 5404, "AnnotationDefault", "AnnotationDefault", "", "AnnotationDefault");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "3S+SBTZrKVEtt5 3r }", "", "", "");
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
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 74, "", "", "", "");
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
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 74, "", "", "", "");
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 74, "", "", "", "");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", false);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 74, "", "", "", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.AnnotationWriter@a
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "E&V~^62Hvv7Z", " 2>$P:u0XBWhy5;<7/C", "AnnotationDefault", " 2>$P:u0XBWhy5;<7/C");
      Attribute attribute0 = new Attribute(" 2>$P:u0XBWhy5;<7/C");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 74, "Wp", "Wp", "Wp", "Wp");
      fieldWriter0.visitAnnotation("Wp", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4, "fQ|", "kW+- ", "", "");
      fieldWriter0.visitAnnotation("kW+- ", true);
      ByteVector byteVector0 = new ByteVector(49);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.visit(74, 2, ",B:E", (String) null, ",B:E", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "M{B5&)8c", "", (String) null, ",B:E");
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      ByteVector byteVector0 = new ByteVector();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-877), "c", "AnnotationDefault", "", (Object) null);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      classWriter0.visit(74, 2, ",B:E", (String) null, ",B:E", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "M{B5&)8c", "", (String) null, ",B:E");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 74, ",B:E", ",B:E", (String) null, ",B:E");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "3S+SBTZrKVEtt5 3r }", "", "", "");
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 74, "Wp", "Wp", "Wp", "Wp");
      fieldWriter0.visitAnnotation("Wp", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-877), "c", "AnnotationDefault", "", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "3S+SBTZrKVEtt5 3r }", "", "", "");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 74, "", "", "", "");
      Attribute attribute0 = new Attribute("");
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

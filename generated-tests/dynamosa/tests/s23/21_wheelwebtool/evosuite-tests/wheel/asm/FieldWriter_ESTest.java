/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 10:46:52 GMT 2019
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
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(202, (-3906), "", "", "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "wheel.asm.Type", "RuntimeVisibleAnnotations", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(3);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(202, (-3906), "", "", "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "wheel.asm.Type", "RuntimeVisibleAnnotations", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-23));
      classWriter0.index = (-127);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "(Q_L]c(_s9", "(Q_L]c(_s9", "(Q_L]c(_s9", "(Q_L]c(_s9");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "(Q_aL]]c(_s9", "(Q_aL]]c(_s9", "(Q_aL]]c(_s9", "(Q_aL]]c(_s9");
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
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-31));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "(Q_L]c(_s9", "(Q_L]c(_s9", "(Q_L]c(_s9", "(Q_L]c(_s9");
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
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "wheel.asm.Type", "RuntimeVisibleAnnotations", (String) null, (Object) null);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4133));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2689, "RuntimeInvisibleAnnotations", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[9];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("wheel.asm.Type", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "wheel.asm.Type", "wheel.asm.Type", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(8);
      byteVector0.length = 301;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-10);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -10
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-22), (String) null, "wheelg.asm.Tyke", (String) null, "wheelg.asm.Tyke");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "The array of suffixes must not be null", "RuntimeVisibleAnnotations", "", "SourceDebugExtension");
      ByteVector byteVector0 = classWriter0.pool;
      Attribute attribute0 = new Attribute("5TU&}G<^66");
      fieldWriter0.visitAttribute(attribute0);
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
      ClassWriter classWriter0 = new ClassWriter((-10));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type");
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.visitAnnotation("wheel.asm.Type", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-720), "wheel.asm.Type", "H]M{m%6P", "RuntimeVisibleAnnotations", "");
      fieldWriter0.visitAnnotation("RuntimeVisibleAnnotations", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type");
      ByteVector byteVector0 = new ByteVector(1);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "6hF\"CC,PD2BJ<=";
      stringArray0[1] = "{{96L/ S.[HbQ";
      stringArray0[2] = "AnnotationDefault";
      stringArray0[3] = "{{96L/ S.[HbQ";
      stringArray0[4] = "{{96L/ S.[HbQ";
      stringArray0[5] = "AnnotationDefault";
      stringArray0[6] = "";
      stringArray0[7] = "6hF\"CC,PD2BJ<=";
      classWriter0.visit(49, (-1374), "{{96L/ S.[HbQ", "6hF\"CC,PD2BJ<=", "AnnotationDefault", stringArray0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-66));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-66), "Iheelg.asm.Tyke", "Iheelg.asm.Tyke", (String) null, (Object) null);
      Attribute attribute0 = new Attribute("(}QiJ;[n.");
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

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "6hF\"CC,PD2BJ<=";
      stringArray0[1] = "{{96L/ S.[HbQ";
      stringArray0[2] = "AnnotationDefault";
      stringArray0[3] = "{{96L/ S.[HbQ";
      stringArray0[4] = "{{96L/ S.[HbQ";
      stringArray0[5] = "AnnotationDefault";
      stringArray0[6] = "";
      stringArray0[7] = "6hF\"CC,PD2BJ<=";
      classWriter0.visit(49, (-1374), "{{96L/ S.[HbQ", "6hF\"CC,PD2BJ<=", "AnnotationDefault", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-720), "wheel.asm.Type", "H]M{m%6P", "RuntimeVisibleAnnotations", "");
      fieldWriter0.visitAnnotation("RuntimeVisibleAnnotations", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type", "wheel.asm.Type");
      fieldWriter0.visitAnnotation("wheel.asm.Type", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-28));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-28), "wheel.asm.Type", "RuntimeVisibleAnnotations", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(8);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, (-28), "boolean", "z*K4089caIv;", "", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ByteVector@9
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1416));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-849), "java/lang/Object", "java/lang/Object", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      fieldWriter0.visitEnd();
  }
}
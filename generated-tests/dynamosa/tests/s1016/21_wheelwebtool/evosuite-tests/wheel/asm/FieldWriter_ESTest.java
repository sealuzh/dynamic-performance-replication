/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 23:26:16 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-1995));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "XcV6CF:nd<Lb@ZCIYXD";
      stringArray0[1] = "Signature";
      classWriter0.visit((-104), (-1995), "Signature", "wheel.asm.ClassWriter", "Signature", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "XcV6CF:nd<Lb@ZCIYXD", "XcV6CF:nd<Lb@ZCIYXD", ":OK>bj^`", ":OK>bj^`");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1785));
      classWriter0.index = (-1594);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "$C}t4m#`Q WUqR*F", "$C}t4m#`Q WUqR*F", "$C}t4m#`Q WUqR*F", "$C}t4m#`Q WUqR*F");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2025));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2025), ":IA4\"", ":IA4\"", ":IA4\"", ":IA4\"");
      classWriter0.visit(49, 64503, "", "", "", (String[]) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1785));
      classWriter0.index = (-1594);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "$C}t4m#`Q WUqR*F", "$C}t4m#`Q WUqR*F", "$C}t4m#`Q WUqR*F", "$C}t4m#`Q WUqR*F");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "value ", "Oa", "VX})luJB", "Oa");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2337);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "$C}t4m#`Q W@qR*F", "$C}t4m#`Q W@qR*F", "$C}t4m#`Q W@qR*F", "$C}t4m#`Q W@qR*F");
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
      ClassWriter classWriter0 = new ClassWriter((-1995));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 285212675, "8P>L1dr_Y&n", "8P>L1dr_Y&n", "(tXQZ&X@U", "8P>L1dr_Y&n");
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1995));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "o,%I", "Y-Q=n", "o,%I", "o,%I");
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(189);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 189, "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 4096;
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
      ClassWriter classWriter0 = new ClassWriter((-1995));
      classWriter0.index = 65432;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1995), ":IA4\"", ":IA4\"", ":IA4\"", ":IA4\"");
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4609));
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 8, "AnnotationDefault", (String) null, "The array of names must not be null", object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(309);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 309, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 16777228, "o,%I", "Y-Q=n", "Thp1I!(yAN", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("Y-Q=n");
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
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "value ", "Oa", "VX})luJB", "Oa");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("wheel.asm.ClassAdapter", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 16777228, "o,%I", "Y-Q=n", "Thp1I!(yAN", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("org.apache.commons.io.IOCase", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2005));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2005), ":IA4\"", ":IA4\"", ":IA4\"", ":IA4\"");
      ByteVector byteVector0 = new ByteVector(2);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "DMp=";
      stringArray0[1] = ":IA4\"";
      stringArray0[2] = "x$Cf,6S[Z[h93";
      stringArray0[3] = "DMp=";
      stringArray0[4] = "";
      stringArray0[5] = "";
      classWriter0.visit(49, 49, ":IA4\"", "DMp=", "", stringArray0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2025));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2025), ":IA4\"", ":IA4\"", ":IA4\"", ":IA4\"");
      ByteVector byteVector0 = new ByteVector(36);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(331);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 331, "wheelasm.FieldWriter", "wheelasm.FieldWriter", "wheelasm.FieldWriter", "wheelasm.FieldWriter");
      Attribute attribute0 = new Attribute("wheelasm.FieldWriter");
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
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1785));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "$C}t4m#`Q WUqR*F", "$C}t4m#`Q WUqR*F", "$C}t4m#`Q WUqR*F", "$C}t4m#`Q WUqR*F");
      fieldWriter0.visitAnnotation("$C}t4m#`Q WUqR*F", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1995));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1995), ":I;4\"", ":I;4\"", ":I;4\"", ":I;4\"");
      fieldWriter0.visitAnnotation(":I;4\"", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "|I?yU1LO;Kt3*#&o}", "|I?yU1LO;Kt3*#&o}", (String) null, "|I?yU1LO;Kt3*#&o}");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2025));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2025), ":IA4\"", ":IA4\"", ":IA4\"", ":IA4\"");
      String[] stringArray0 = new String[8];
      stringArray0[0] = ":IA4\"";
      stringArray0[1] = ":IA4\"";
      stringArray0[2] = "RuntimeVisibleAnnotations";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = ":IA4\"";
      stringArray0[6] = "RuntimeVisibleAnnotations";
      stringArray0[7] = "RuntimeVisibleAnnotations";
      classWriter0.visit((-2025), (-1024), ":IA4\"", ":IA4\"", "", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 16777228, "o,%I", "Y-Q=n", "Thp1I!(yAN", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-6), "|I?yU1LO;Kt3*#&o}", "|I?yU1LO;Kt3*#&o}", (String) null, "|I?yU1LO;Kt3*#&o}");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2025));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2025), ":IA4\"", ":IA4\"", ":IA4\"", ":IA4\"");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-2025), ":IA4\"", "", "wlJgz4j?(Bpj!/0AdD", ":IA4\"");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1995));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1980), "8P>L1dr_Y&n", "8P>L1dr_Y&n", "8P>L1dr_Y&n", "8P>L1dr_Y&n");
      fieldWriter0.visitEnd();
  }
}
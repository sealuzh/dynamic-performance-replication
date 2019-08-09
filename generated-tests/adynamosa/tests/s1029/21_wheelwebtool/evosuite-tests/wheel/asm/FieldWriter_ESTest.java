/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 22:36:15 GMT 2019
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
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;
import wheel.asm.Item;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1308), "Ax.'3L*3a:NXo}", "h arr=\" o9 nmes mustAot be null", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.version = 50;
      fieldWriter0.next = fieldWriter0;
      fieldWriter0.next.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1308));
      classWriter0.index = (-1308);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1, "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1308), "Ax.'3L*3a:NXo}", "h arr=\" o9 nmes mustAot be null", (String) null, (Object) null);
      classWriter0.version = 50;
      int int0 = fieldWriter0.getSize();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1308));
      classWriter0.index = (-1308);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1, "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "HV41emGM#", "", "HV41emGM#", "HV41emGM#");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(512);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1241, "Ee$5**rK,(hCc-", "Ee$5**rK,(hCc-", "S6", "S6");
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
      ClassWriter classWriter0 = new ClassWriter((-1308));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1308), "Ax.'3L*3a:NXo}", "h arr=\" o9 nmes mustAot be null", (String) null, (Object) null);
      fieldWriter0.next = fieldWriter0;
      // Undeclared exception!
      try { 
        fieldWriter0.next.visitAnnotation((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(512);
      Item item0 = classWriter0.newLong(3);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 4, "", "8o;", (String) null, item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.Item@6
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(512);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1241, "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "S6", "S6");
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("");
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
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1308));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1, "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("h arr=\" o9 nmes mustAot be null", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1329));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1, "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1329), "Ax.'3L*3a:NXo}", "Th ar=y o9 names must ot b null", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.next = (FieldWriter) fieldVisitor0;
      fieldWriter0.next.visitAnnotation("Ax.'3L*3a:NXo}", true);
      fieldWriter0.next.put(byteVector0);
      assertNotSame(fieldWriter0, fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1329), "Ax.'3L*3a:NXo}", "Th ar=y o9 names must ot b null", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.version = 49;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1329));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1329), "Ax.'3L*3a:NXo}", "Th ar=y o9 names must ot b null", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(512);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1241, "Ee$5**rK,(hCc-", "Ee$5**rK,(hCc-", "S6", "S6");
      Attribute attribute0 = new Attribute("Signature");
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
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1329));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1, "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1329), "Ax.'3L*3a:NXo}", "Th ar=y o9 names must ot b null", (String) null, (Object) null);
      fieldWriter1.next = fieldWriter0;
      fieldWriter1.next.visitAnnotation("Ax.'3L*3a:NXo}", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1329), "Ax.'3L*3a:NXo}", "Th ar=y o9 names must ot b null", (String) null, (Object) null);
      classWriter0.version = 49;
      int int0 = fieldWriter0.getSize();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1308));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1, "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}", "Ax.'3L*3a:NXo}");
      fieldWriter0.visitAnnotation("h arr=\" o9 nmes mustAot be null", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1329));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1329), "Ax.'3L*3a:NXo}", "Th ar=y o9 names must ot b null", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 10, "Synthetic", "Synthetic", "Synthetic", (Object) null);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 2, "wheel.asm.FieldWriter", (String) null, "", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "HV41emGM#", "", "HV41emGM#", "HV41emGM#");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(512);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "Ke*38M", "Ee$5**rK,(hCc-", "RuntimeVisibleAnnotations", "Ee$5**rK,(hCc-");
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
}
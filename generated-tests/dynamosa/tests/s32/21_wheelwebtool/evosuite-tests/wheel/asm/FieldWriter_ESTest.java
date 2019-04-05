/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 21:23:19 GMT 2019
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(555);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4099, "3xXJq~,K", "3xXJq~,K", "3xXJq~,K", "3xXJq~,K");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "3xXJq~,K";
      stringArray0[1] = "3xXJq~,K";
      stringArray0[2] = "3xXJq~,K";
      stringArray0[3] = "long";
      stringArray0[4] = "3xXJq~,K";
      stringArray0[5] = "3xXJq~,K";
      classWriter0.visit(555, (-1652), "3xXJq~,K", "long", "", stringArray0);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(565);
      classWriter0.index = (-1284);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "3xXJq~,K", "$oeztxP,B6u0IbN", "kCbX-p", "$oeztxP,B6u0IbN");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(555);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4099, "3xXJq~,K", "3xXJq~,K", "3xXJq~,K", "3xXJq~,K");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "3xXJq~,K";
      stringArray0[1] = "3xXJq~,K";
      stringArray0[2] = "3xXJq~,K";
      stringArray0[3] = "long";
      stringArray0[4] = "3xXJq~,K";
      stringArray0[5] = "3xXJq~,K";
      classWriter0.visit(555, (-1652), "3xXJq~,K", "long", "", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(565);
      classWriter0.index = (-1284);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "3xXJq~,K", "$oeztxP,B6u0IbN", "kCbX-p", "$oeztxP,B6u0IbN");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(447);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "0NG", "<vq[:+", "Xe*ys~A]!a<|n9xj", "0NG");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(447);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(447, "wheel.asm.LaY4bel", "wheel.asm.LaY4bel", "wheel.asm.LaY4bel", "wheel.asm.LaY4bel");
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
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
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
      ClassWriter classWriter0 = new ClassWriter(565);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4119, "3xXJq~,K", "3xXJq~,K", "3xXJq~,K", "3xXJq~,K");
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
      ClassWriter classWriter0 = new ClassWriter(565);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 565, "3xXJq~,K", "3xXJq~,K", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 565;
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
      ClassWriter classWriter0 = new ClassWriter(447);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, (String) null, "wheel.asm.Label", "?sd7V", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "<bL?PoVUlN|XNCpsIs", "<bL?PoVUlN|XNCpsIs", "Deprecated", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      classWriter0.visit(49, (-889275714), "F\"JVc/kB\"Vy", "", "F\"JVc/kB\"Vy", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "", "", "F\"JVc/kB\"Vy", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "", "", "F\"JVc/kB\"Vy", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(565);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 565, "3xXJq~,K", "3xXJq~,K", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(1496);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(244);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 244, "3xXJqREK", "3xXJqREK", "3xXJqREK", "3xXJqREK");
      Attribute attribute0 = new Attribute("3xXJqREK");
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
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(447);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "0NG", "<vq[:+", "Xe*ys~A]!a<|n9xj", "0NG");
      fieldWriter0.visitAnnotation("'MR{TqZSa& ", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(562);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 562, "3x:EXJq~,K", "3x:EXJq~,K", "3x:EXJq~,K", "3x:EXJq~,K");
      fieldWriter0.visitAnnotation("wheel.asm.ClassWriter", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      classWriter0.visit(49, (-889275714), "F\"JVc/kB\"Vy", "", "F\"JVc/kB\"Vy", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "", "", "F\"JVc/kB\"Vy", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "", "", "F\"JVc/kB\"Vy", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(551);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 551, "3xXJq~,K", "3xXJq~,K", "3xXJq~,K", "3xXJq~,K");
      fieldWriter0.visitAnnotation("3xXJq~,K", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(268);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 268, "A'TH~9q)6v!DTgGW9T", "A'TH~9q)6v!DTgGW9T", "A'TH~9q)6v!DTgGW9T", "A'TH~9q)6v!DTgGW9T");
      fieldWriter0.visitAnnotation("A'TH~9q)6v!DTgGW9T", false);
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(565);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 565, "3xXJq~,K", "3xXJq~,K", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "", "", "F\"JVc/kB\"Vy", "");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 285212682, "", "", "Deprecated", "");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(447);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(447, "wheel.asm.Label", "wheel.asm.Label", "", "");
      fieldVisitor0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "3xXJq~,K", "3xXJq~,K", "3xXJq~,K", "3xXJq~,K");
      Attribute attribute0 = new Attribute("3xXJq~,K");
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
}
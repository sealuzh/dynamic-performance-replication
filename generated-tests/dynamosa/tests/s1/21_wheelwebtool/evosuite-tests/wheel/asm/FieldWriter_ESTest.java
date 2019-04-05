/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 10:03:32 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-55));
      classWriter0.index = (-55);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "vz_noJviXQ&[", "vz_noJviXQ&[", "vz_noJviXQ&[", "vz_noJviXQ&[");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "The FilenameFilter must not be null", "The FilenameFilter must not be null", "The FilenameFilter must not be null", "The FilenameFilter must not be null");
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
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-509));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-509), "The FilnameFilter must not b# nul", "The FilnameFilter must not b# nul", "The FilnameFilter must not b# nul", "The FilnameFilter must not b# nul");
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
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "cys681o?|Wq#uJ8mY", "The FilenameFilter must not be null", "The FilenameFilter must not be null", "cys681o?|Wq#uJ8mY");
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
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "The FilenameFilter must not be null", "The FilenameFilter must not be null", "The FilenameFilter must not be null", "The FilenameFilter must not be null");
      ByteVector byteVector0 = classWriter0.pool;
      Attribute attribute0 = new Attribute("The FilenameFilter must not be null");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-48));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-48), "The FilenameFilter must not be null", "The FilenameFilter must not be null", "The FilenameFilter must not be null", "The FilenameFilter must not be null");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 131072;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, (String) null, (String) null, (String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "7i[m[wq}", "7i[m[wq}", "7i[m[wq}", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(254);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 254;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 254, "|", "|", "|", "|");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "The FilenameFilter must not be null", "The FilenameFilter must not be null", "The FilenameFilter must not be null", "The FilenameFilter must not be null");
      ByteVector byteVector0 = classWriter0.pool;
      Attribute attribute0 = new Attribute("The FilenameFilter must not be null");
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
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "cys681o?|Wq#uJ8mY", "\"dz$/pE1tM&+u>ta+)n", "H;_X e ZnX@e", "H;_X e ZnX@e");
      fieldWriter0.next = fieldWriter0;
      fieldWriter0.next.visitAnnotation("\"dz$/pE1tM&+u>ta+)n", false);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.next.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-48));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "The FilenameFilter must not be null", "RuntimeVisibleAnnotations", "&%RaQ9<9", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "\"dz$/pE1tM&+u>ta+)n", "cys681o?|Wq#uJ8mY", (String) null, "cys681o?|Wq#uJ8mY");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "cys681o?|Wq#uJ8mY", "\"dz$/pE1tM&+u>ta+)n", "\"dz$/pE1tM&+u>ta+)n", "\"dz$/pE1tM&+u>ta+)n");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 131072, "\"dz$/pE1tM&+u>ta+)n", "cys681o?|Wq#uJ8mY", (String) null, "cys681o?|Wq#uJ8mY");
      int int0 = fieldWriter0.next.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-516));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Y-aWz!M{Ov#^L#";
      stringArray0[1] = "Y-aWz!M{Ov#^L#";
      stringArray0[2] = "Y-aWz!M{Ov#^L#";
      stringArray0[3] = "feHyC\"Q3Q|[e9$w'ZKv";
      stringArray0[4] = "Y-aWz!M{Ov#^L#";
      classWriter0.visit((-1807), (-1807), "Y-aWz!M{Ov#^L#", "Y-aWz!M{Ov#^L#", "Y-aWz!M{Ov#^L#", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-516), "The FilnameFilter must not b# nul", "The FilnameFilter must not b# nul", "The FilnameFilter must not b# nul", "The FilnameFilter must not b# nul");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "cys681o?|Wq#uJ8mY", "\"dz$/pE1tM&+u>ta+)n", "H;_X e ZnX@e", "H;_X e ZnX@e");
      fieldWriter0.next = fieldWriter0;
      int int0 = fieldWriter0.next.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-48));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "The FilenameFilter must not be null", "RuntimeVisibleAnnotations", "&%RaQ9<9", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "cys681o?|Wq#uJ8mY", "\"dz$/pE1tM&+u>ta+)n", "H;_X e ZnX@e", "H;_X e ZnX@e");
      fieldWriter0.visitAnnotation("cys681o?|Wq#uJ8mY", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "cys681o?|Wq#uJ8mY", "\"dz$/pE1tM&+u>ta+)n", "H;_X e ZnX@e", "H;_X e ZnX@e");
      fieldWriter0.next = fieldWriter0;
      fieldWriter0.next.visitAnnotation("\"dz$/pE1tM&+u>ta+)n", false);
      int int0 = fieldWriter0.next.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1903);
      classReader0.accept((ClassVisitor) classWriter0, 2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-4), "wheel.asm.Label", "wheel.asm.Label", "wheel.asm.Label", "wheel.asm.Label");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "cys681o?|Wq#uJ8mY", "\"dz$/pE1tM&+u>ta+)n", "H;_X e ZnX@e", "H;_X e ZnX@e");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1257), "cys681o?|Wq#uJ8mY", "\"dz$/pE1tM&+u>ta+)n", "H;_X e ZnX@e", "H;_X e ZnX@e");
      fieldWriter0.next = fieldWriter0;
      Attribute attribute0 = new Attribute("H;_X e ZnX@e");
      fieldWriter0.next.visitAttribute(attribute0);
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

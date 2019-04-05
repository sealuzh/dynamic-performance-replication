/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 01:34:34 GMT 2019
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
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1943));
      classWriter0.index = (-1943);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1943), "void", "3:OIy", "3:OIy", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1943));
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-365), "6MH}ge", "", "", "6MH}ge");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1943));
      classWriter0.index = (-1943);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1943), "void", "3:OIy", "3:OIy", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1943));
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-365), "6MH}ge", "", "", "6MH}ge");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4133);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "J ~sk.U^, VqJj|", "J ~sk.U^, VqJj|", ")xF{^:3<q", ")xF{^:3<q");
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
      ClassWriter classWriter0 = new ClassWriter(4133);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, ")xF{^:3<q", "", "wheel.asm.ClassAdapter", "J ~sk.U^, VqJj|");
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
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1940));
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-1), "Signature", "7!,g-D-,emSO~", (String) null, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@2e8d5387
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1940));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "KU GDcC9!qNt", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
      ByteVector byteVector0 = new ByteVector(1);
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4133);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "J ~sk.U^, VqJj|", "J ~sk.U^, VqJj|", ")xF{^:3<q", ")xF{^:3<q");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("t<", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4133);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "J ~sk.U^, VqJj|", "J ~sk.U^, VqJj|", ")xF{^:3<q", ")xF{^:3<q");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation(")xF{^:3<q", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1940));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), ")xF{^:3<q", "J ~sk.U^, VqJj|", (String) null, "J ~sk.U^, VqJj|");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1943));
      classWriter0.version = 55;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-365), "6MH}ge", "6MH}ge", "6MH}ge", "6MH}ge");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1940));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
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

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1943));
      classWriter0.version = 55;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-365), "6MH}ge", "6MH}ge", "6MH}ge", "6MH}ge");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4133);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "J ~sk.U^, VqJj|", "J ~sk.U^, VqJj|", ")xF{^:3<q", ")xF{^:3<q");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4133);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "J ~sk.U^, VqJj|", "J ~sk.U^, VqJj|", ")xF{^:3<q", ")xF{^:3<q");
      fieldWriter0.visitAnnotation(")xF{^:3<q", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1940));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), ")xF{^:3<q", "J ~sk.U^, VqJj|", (String) null, "J ~sk.U^, VqJj|");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "", "");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1), "", "Synthetic", "", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4133);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "J ~sk.U^, VqJj|", "J ~sk.U^, VqJj|", ")xF{^:3<q", ")xF{^:3<q");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1940));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "", "RuntimeInvisibleAnnotations");
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

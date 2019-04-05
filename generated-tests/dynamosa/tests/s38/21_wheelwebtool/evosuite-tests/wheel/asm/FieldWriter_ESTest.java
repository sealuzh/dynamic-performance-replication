/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 04:29:05 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-2270));
      classWriter0.index = (-2270);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "rJxQ,{$A2q", "rJxQ,{$A2q", "rJxQ,{$A2q", "rJxQ,{$A2q");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(175);
      classWriter0.version = 1;
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-423), "d}", "d}", "d}", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(63794);
      classWriter0.index = (-448);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2292));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2849, "", "RW*L.ND)Q4r^E", "8HXGW+t;/KV&)bB^-", "8HXGW+t;/KV&)bB^-");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1742));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "D2 S]n/i*i[9JS@n=", "", ",", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(63794);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "m/.?5n d6'cwT", "m/.?5n d6'cwT", "m/.?5n d6'cwT", "m/.?5n d6'cwT");
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
      ClassWriter classWriter0 = new ClassWriter(63788);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "m/?5n d6'cw7T", "m/?5n d6'cw7T", (String) null, "m/?5n d6'cw7T");
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
      ClassWriter classWriter0 = new ClassWriter(63794);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T");
      Attribute attribute0 = new Attribute("m/?5n d6'cw7T");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(63794);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 63794;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(63794);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 63794;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-20));
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
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 0, "}", "}", "}", classWriter0);
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
      ClassWriter classWriter0 = new ClassWriter((-1742));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "D2 S]n/i*i[9JS@n=", "", ",", "");
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
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1742));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "The array of names must not be null", ",", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("a]lU", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2292));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2849, "m./?5n d6'cw7T", "<QqPr(uRX_Yklb", (String) null, "<QqPr(uRX_Yklb");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1742));
      classWriter0.version = (-1742);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1742), "The array of names must not be null", "", ",", "-]");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1742));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1742), "The array of names must not be null", "", ",", "-]");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(63823);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T");
      Attribute attribute0 = new Attribute("m/?5n d6'cw7T");
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
      ClassWriter classWriter0 = new ClassWriter(63794);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T");
      fieldWriter0.visitAnnotation("m/?5n d6'cw7T", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(63794);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T", "m/?5n d6'cw7T");
      fieldWriter0.visitAnnotation("m/?5n d6'cw7T", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2292));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2849, "m./?5n d6'cw7T", "<QqPr(uRX_Yklb", (String) null, "<QqPr(uRX_Yklb");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1742));
      classWriter0.version = (-1742);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1742), "The array of names must not be null", "", ",", "-]");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1742));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1742), "The array of names must not be null", "", ",", "-]");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2270));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "rJxQ,{$A2q", "rJxQ,{$A2q", "rJxQ,{$A2q", "rJxQ,{$A2q");
      fieldWriter0.visitAnnotation("rJxQ,{$A2q", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1742));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "The array of names must not be null", ",", (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1742), "The array of names must not be null", "", ",", "-]");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2292));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2849, "m./?5n d6'cw7T", "<QqPr(uRX_Yklb", (String) null, "<QqPr(uRX_Yklb");
      fieldWriter0.visitEnd();
  }
}
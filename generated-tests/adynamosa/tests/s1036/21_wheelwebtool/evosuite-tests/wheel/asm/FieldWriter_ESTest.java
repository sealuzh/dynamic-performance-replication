/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 10:03:51 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-184), "", "7l^\"Fn", "7l^\"Fn", "7l^\"Fn");
      ByteVector byteVector0 = new ByteVector();
      classWriter0.version = (-822);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      classWriter0.index = (-4937);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "JV", "7l^\"Fn", "JV", "JV");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-184), "", "7l^\"Fn", "7l^\"Fn", "7l^\"Fn");
      classWriter0.version = (-822);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      classWriter0.index = (-4937);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "JV", "7l^\"Fn", "JV", "JV");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "[lxuGD]*S@6Y$]Cy", "SE[B&ab)fg", "Synthetic", "SE[B&ab)fg");
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
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "[lxuGD]*S@6Y$]Cy", "SE[B&ab)fg", "Synthetic", "SE[B&ab)fg");
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
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "JV", "7l^\"Fn", "JV", "JV");
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 0, "SE[B&ab)fg", "Z%KyB:n/CQVj.[7", (String) null, classWriter0);
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
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-184), "", "7l^\"Fn", "7l^\"Fn", "7l^\"Fn");
      Attribute attribute0 = new Attribute("");
      ByteVector byteVector0 = new ByteVector();
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
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "7f;Ax#OK", "JV", (String) null, "JV");
      ByteVector byteVector0 = new ByteVector(262144);
      fieldWriter0.visitAnnotation("`;1.-arO5-", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "7l^\"Fn", "7l^\"Fn", "7l^\"Fn", "7l^\"Fn");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      ByteVector byteVector0 = new ByteVector();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1566), "RutimeInvisibleAnnotations", "W[TpH", "RutimeInvisibleAnnotations", "RutimeInvisibleAnnotations");
      classWriter0.version = 49;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      ByteVector byteVector0 = new ByteVector();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "ho#h`J{lsB!b(b", "", "JV", (Object) null);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      Attribute attribute0 = new Attribute("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "ho#h`J{lsB!b(b", "", "JV", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "TveBGQ+(GBTq?i3J$@", "7l^\"Fn", "TveBGQ+(GBTq?i3J$@", "TveBGQ+(GBTq?i3J$@");
      fieldWriter0.visitAnnotation("TveBGQ+(GBTq?i3J$@", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1566), "RutimeInvisibleAnnotations", "RutimeInvisibleAnnotations", "RutimeInvisibleAnnotations", "RutimeInvisibleAnnotations");
      classWriter0.version = 49;
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1667, ";-q", "RutimeInvisibleAnnotations", ",!e", ";-q");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1566), "RutimeInvisibleAnnotations", "W[TpH", "RutimeInvisibleAnnotations", "RutimeInvisibleAnnotations");
      fieldWriter1.next = fieldWriter0;
      fieldWriter1.next.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "7f;Ax#OK", "JV", (String) null, "JV");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(99);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "JV", "7l^\"Fn", "JV", "JV");
      fieldWriter0.visitEnd();
  }
}

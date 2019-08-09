/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 07:34:56 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-104), "", "Deprecated", (String) null, (Object) null);
      classWriter0.version = (-288);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-104), "", "Deprecated", (String) null, (Object) null);
      classWriter0.version = (-288);
      int int0 = fieldWriter0.getSize();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "", "");
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
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 708, "EyQQWN", "^cNHw", "^cNHw", "EyQQWN");
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
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 127, "EyQQWN", "EyQQWN", "EyQQWN", "");
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
  public void test05()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 0, "", "", ".rBN_ r", "ym@Id%;r");
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
      ClassWriter classWriter0 = new ClassWriter((-954));
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-974), "", "Mj[g%a7_f,Zu$vr5bz", "", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@66fed319
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 187, "9S47*3{D]4_55,O", "java/lang/Throwable", "9S47*3{D]4_55,O", "9S47*3{D]4_55,O");
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 187, "9S47*3{D]4_55,O", "java/lang/Throwable", "9S47*3{D]4_55,O", "9S47*3{D]4_55,O");
      fieldWriter0.visitAnnotation("RuntimeVisibleAnnotations", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      fieldWriter0.visitAnnotation("", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "", "");
      String[] stringArray0 = new String[0];
      classWriter0.visit(49, (-5334), "java/lang/String", (String) null, "java/lang/String", stringArray0);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "", "");
      String[] stringArray0 = new String[0];
      classWriter0.visit(49, (-5334), "java/lang/String", (String) null, "java/lang/String", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 285212684, "wheel.asm.FieldWriter", "HvLow", (String) null, "wheel.asm.FieldWriter");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "", "");
      fieldWriter0.visitAnnotation("|I%", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 187, "9S47*3{D]4_55,O", "java/lang/Throwable", "9S47*3{D]4_55,O", "9S47*3{D]4_55,O");
      fieldWriter0.visitAnnotation("RuntimeVisibleAnnotations", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-126), "", "Deprecated", (String) null, (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 285212684, "wheel.asm.FieldWriter", "HvLow", (String) null, "wheel.asm.FieldWriter");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "", "");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1831);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "", "");
      Attribute attribute0 = new Attribute("|I%");
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
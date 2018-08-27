/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:41:51 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
      ClassWriter classWriter0 = new ClassWriter((-1219));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "#g-", "#g-", "#g-", "#g-");
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "#-", "#-", "#-", "#-");
      Object object0 = new Object();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 1, "6", "#-", "#-", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@27399417
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1219));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1219), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitEnd();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      ClassWriter classWriter1 = new ClassWriter((-1252));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter1, (-930), "", "", "=!}NppG", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("=!}NppG", false);
      fieldWriter0.put(byteVector0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "#-", "#-", (String) null, "#-");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1251));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1836), "The suffix must not be null", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "#g-", "#g-", "#g-", "#g-");
      fieldWriter0.visitAnnotation("Dj$&(zJ6f!k2", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2921), "The filters must not be null", "The filters must not be null", "/f%x%u", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      ClassWriter classWriter1 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "#-", "#-", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1219));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1219), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
      System.setCurrentTimeMillis((-1252));
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
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "sF-NGDC>XQdY_Hu", "sF-NGDC>XQdY_Hu");
      fieldWriter0.visitAnnotation("", false);
      fieldWriter0.getSize();
      int int0 = fieldWriter0.getSize();
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      classWriter0.version = 4096;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "sF-NGDC>XQdY_Hu", "sF-NGDC>XQdY_Hu");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1219));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1219), "", "", "", "");
      Attribute attribute0 = new Attribute("");
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
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1219));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1219), "", "", "", "");
      fieldWriter0.visitAnnotation("m>7iV85TzCcuWcuT$", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4312);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "eKb~lIS+DT1m(Z";
      stringArray0[1] = "eKb~lIS+DT1m(Z";
      classWriter0.visit(4312, 1, "eKb~lIS+DT1m(Z", "eKb~lIS+DT1m(Z", "eKb~lIS+DT1m(Z", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4312, "Deprecated", "Deprecated", "Deprecated", "Deprecated");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }
}
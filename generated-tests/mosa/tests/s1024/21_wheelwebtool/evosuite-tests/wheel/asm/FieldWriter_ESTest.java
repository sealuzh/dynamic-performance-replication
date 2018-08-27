/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 15:23:27 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;
import wheel.asm.Frame;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      System.setCurrentTimeMillis(2);
      ByteVector byteVector0 = new ByteVector(0);
      ClassWriter classWriter1 = new ClassWriter((-581));
      FieldWriter fieldWriter1 = new FieldWriter(classWriter1, 47, "", "J9ANE-rg2|/DT%", (String) null, (Object) null);
      System.setCurrentTimeMillis(2);
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      Attribute attribute0 = new Attribute("Signature");
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.visitAnnotation("X!Z+\"qyJKPg", true);
      fieldWriter0.visitAttribute(attribute0);
      assertTrue(attribute0.isUnknown());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation(">R'=(<9J", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-16), "", "", "", "");
      int int0 = Frame.UNINITIALIZED;
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitAnnotation("8,bh%bTErM@", false);
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitAnnotation("8,bh%bTErM@", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 8, "", "", "", "");
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("", true);
      System.setCurrentTimeMillis((-1134L));
      fieldWriter0.getSize();
      System.setCurrentTimeMillis(2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 8, "", "", "", "");
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("bNr3WzAV", false);
      ByteVector byteVector0 = new ByteVector(8);
      ByteVector byteVector1 = byteVector0.put12(2, (-178));
      fieldWriter0.put(byteVector0);
      FieldWriter fieldWriter1 = classWriter0.lastField;
      fieldWriter1.getSize();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      fieldWriter1.visitAnnotation("", true);
      fieldWriter1.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 8, "", "", "", "");
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAnnotation("bNr3WzAV", false);
      ByteVector byteVector0 = new ByteVector(8);
      byteVector0.put12(344, 255);
      byteVector0.put12(2, (-178));
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
  public void test07()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ClassWriter classWriter0 = new ClassWriter(6);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "*(J", "*(J", "2vJfpZvr~.'eY", (Object) null);
      FieldWriter fieldWriter1 = fieldWriter0.next;
      fieldWriter0.next = null;
      fieldWriter0.getSize();
      FieldWriter fieldWriter2 = classWriter0.firstField;
      fieldWriter2.getSize();
      ByteVector byteVector0 = new ByteVector();
      byteVector0.putUTF8("");
      fieldWriter2.put(byteVector0);
      assertSame(fieldWriter2, fieldWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.thisName = "G,5/EwJ1Zt#y$( ";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 8, "", "", "", "");
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = new ByteVector(8);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 49, "^=1>@j", "", "^=1>@j", "G,5/EwJ1Zt#y$( ");
      fieldWriter1.put(byteVector0);
      System.setCurrentTimeMillis(2);
      fieldWriter1.visitEnd();
      fieldWriter1.getSize();
      Attribute attribute0 = new Attribute("G,5/EwJ1Zt#y$( ");
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
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-16), "", "", "", "");
      classWriter0.newClassItem("8,bh%b~TErM@");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 6, "", "", "", (Object) null);
      fieldWriter1.getSize();
      System.setCurrentTimeMillis(2);
      int int0 = fieldWriter1.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-16), "", "", "", "");
      classWriter0.newClassItem("8,bh%b~TErM@");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      classWriter0.visit((-16), (-16), "8,bh%b~TErM@", "8,bh%b~TErM@", (String) null, stringArray0);
      int int0 = Frame.UNINITIALIZED;
      System.setCurrentTimeMillis(25165824);
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      System.setCurrentTimeMillis((-4261L));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 8, "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = new ByteVector(8);
      byteVector0.put12(2, (-178));
      fieldWriter0.put(byteVector0);
      ByteVector byteVector1 = new ByteVector(0);
      byteVector1.put11(0, 2);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-992), "", "", (String) null, (Object) null);
      fieldWriter1.put(byteVector0);
      ByteVector byteVector2 = new ByteVector(0);
      fieldWriter1.getSize();
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

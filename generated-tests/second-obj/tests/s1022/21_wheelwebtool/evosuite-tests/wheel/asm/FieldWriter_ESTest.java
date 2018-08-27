/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:24:24 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.lang.reflect.Member;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;
import wheel.asm.Frame;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "", "", "", "");
      FieldWriter fieldWriter1 = classWriter0.firstField;
      int int0 = fieldWriter1.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "Wo&(:M_4/S");
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.getSize();
      classWriter0.firstField.visitEnd();
      ByteVector byteVector0 = new ByteVector(24);
      fieldWriter0.put(byteVector0);
      assertSame(fieldWriter0, fieldWriter1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "RuntimeInvisibleAnnotations", "", "Deprecated", "Wo&(:M_4/S");
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.getSize();
      int int0 = Member.DECLARED;
      AnnotationVisitor annotationVisitor0 = fieldWriter1.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-235), "", "", "", "Wo&(:M_4/S");
      classWriter0.visitAnnotation("System", false);
      fieldWriter0.visitAnnotation("", true);
      classWriter0.firstField = fieldWriter0;
      FieldWriter fieldWriter1 = classWriter0.firstField;
      FieldWriter fieldWriter2 = classWriter0.firstField;
      fieldWriter1.getSize();
      classWriter0.firstField.visitEnd();
      ByteVector byteVector0 = null;
      try {
        byteVector0 = new ByteVector((-235));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "", "", "", "Wo&(:M_4/S");
      classWriter0.firstField = fieldWriter0;
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.getSize();
      classWriter0.firstField.visitEnd();
      ByteVector byteVector0 = new ByteVector(36);
      fieldWriter0.put(byteVector0);
      assertSame(fieldWriter0, fieldWriter1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-956));
      String string0 = "tovAxoe+?";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "tovAxoe+?", "tovAxoe+?", "tovAxoe+?", (Object) null);
      FieldWriter fieldWriter1 = classWriter0.lastField;
      fieldWriter0.next = fieldWriter1;
      Attribute attribute0 = new Attribute("tovAxoe+?");
      fieldWriter1.getSize();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("\"%gD");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "", "", "", "Wo&(:M_4/S");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      classWriter0.firstField = fieldWriter0;
      Attribute attribute0 = new Attribute("4}@_+uT-a41");
      classWriter0.firstField.visitAttribute(attribute0);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      // Undeclared exception!
      try { 
        fieldWriter1.getSize();
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
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "java/lang/String", "", "java/lang/String", "Wo&(:M_4/S");
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1565), "java/lang/String", "Wo&(:M_4/S", "java/lang/String", "");
      FieldWriter fieldWriter2 = classWriter0.firstField;
      fieldWriter1.getSize();
      fieldWriter1.visitEnd();
      ByteVector byteVector1 = new ByteVector(36);
      fieldWriter2.put(byteVector1);
      assertNotSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-744), "", "java/lang/String", (String) null, "");
      ByteVector byteVector0 = new ByteVector(1492);
      fieldWriter0.put(byteVector0);
      int int0 = Frame.VALUE;
      fieldWriter0.put(byteVector0);
      ClassWriter classWriter1 = new ClassWriter((-1565));
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitOuterClass("Q8]u+bjf", "Q8]u+bjf", "Q8]u+bjf");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Q8]u+bjf";
      stringArray0[1] = "RuntimeInvisibleAnnotations";
      stringArray0[2] = "boolean";
      stringArray0[3] = "";
      stringArray0[4] = "Bz^w*A_RL|/0@&|@k1";
      stringArray0[5] = "wheel.asm.Label";
      classWriter0.visitMethod(0, "Bz^w*A_RL|/0@&|@k1", "~FH6", "wheel.asm.Label", stringArray0);
      classWriter0.visitInnerClass("Q8]u+bjf", "~FH6", "@_.F", 0);
      classWriter0.version = 2539;
      classWriter0.newMethodItem("~FH6", "Q8]u+bjf", "\"O", false);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4213, "`1NJ@W:Mw=>q2NA", "", "`1NJ@W:Mw=>q2NA", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "", "", "", "Wo&(:M_4/S");
      classWriter0.firstField = fieldWriter0;
      classWriter0.firstField.getSize();
      classWriter0.firstField.visitAnnotation("Wo&(:M_4/S", true);
      classWriter0.firstField.visitEnd();
      ByteVector byteVector0 = new ByteVector(36);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 34, "|f", "", "", "");
      classWriter0.visitAnnotation("|f", false);
      fieldWriter0.visitAnnotation("", false);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter0.getSize();
      // Undeclared exception!
      try { 
        fieldWriter1.visitAnnotation((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-235), "", "", "", "Wo&(:M_4/S");
      classWriter0.visitAnnotation("System", false);
      fieldWriter0.visitAnnotation("", false);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      FieldWriter fieldWriter2 = classWriter0.firstField;
      fieldWriter2.getSize();
      fieldWriter0.visitAnnotation("", false);
      Attribute attribute0 = new Attribute("");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter1.put(byteVector0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      String string0 = "";
      String string1 = "";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "Wo&(:M_4/S");
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.getSize();
      Attribute attribute0 = new Attribute("Wo&(:M_4/S");
      fieldWriter1.visitAttribute(attribute0);
      classWriter0.firstField.visitEnd();
      ByteVector byteVector0 = new ByteVector(24);
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
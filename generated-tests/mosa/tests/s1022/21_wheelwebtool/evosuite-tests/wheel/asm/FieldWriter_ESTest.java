/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:29:28 GMT 2018
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
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "S^(/SPq7ZlNmFZ", "O-Glo6A]F$x]*", "S^(/SPq7ZlNmFZ", "O-Glo6A]F$x]*");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1565), "", "9H;@", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1565), "", "9H;@", "9H;@", "9H;@");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1565), "", "9H;@", "9H;@", "9H;@");
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("");
      Attribute attribute1 = attribute0.next;
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
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2569), "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1570));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "9H;@", "9H;@", "", "9H;@");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1565), "", ".class", "Wo&(:M_4/S", "Wo&(:M_4/S");
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-36), "", "", "", "");
      FieldWriter fieldWriter1 = classWriter0.lastField;
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, 1, "", "", "<6r<9Y'*'\"@te'NrP~", "");
      int int0 = fieldWriter2.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1565), "Wo&(:M_4/S", ".class", (String) null, ".class");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "ConstantValue", (String) null, "ConstantValue");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      classWriter0.cr = null;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "", "", "", "");
      classWriter0.firstField = fieldWriter0;
      Attribute attribute0 = new Attribute("ConstantValue");
      classWriter0.firstField.visitAttribute(attribute0);
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
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1565), "wx@1r.8hsEGr^r1", "[Q", "wx@1r.8hsEGr^r1", "wx@1r.8hsEGr^r1");
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1565), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      byteVector0.putShort((-1565));
      // Undeclared exception!
      try { 
        classWriter0.firstField.put(byteVector0);
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
      ClassWriter classWriter0 = new ClassWriter((-1565));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1565), "", "9H;@", "9H;@", "9H;@");
      fieldWriter0.visitAnnotation("Class not found", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      classWriter0.visit((-990), (-1565), "Ma!T", "", "Ma!T", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "", "", "", "");
      classWriter0.firstField = fieldWriter0;
      ByteVector byteVector0 = new ByteVector();
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitOuterClass("Q8]u+bjf", "Q8]u+bjf", "Q8]u+bjf");
      classWriter0.version = (-2541);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Q8]u+bjf";
      stringArray0[1] = "RuntimeInvisibleAnnotations";
      stringArray0[2] = "boolean";
      stringArray0[3] = "";
      stringArray0[4] = "Bz^w*A_RL|/0@&|@k1";
      classWriter0.visitField((-2541), "", "EnclosingMethod", "wheel.asm.Label", "Bz^w*A_RL|/0@&|@k1");
      stringArray0[5] = "wheel.asm.Label";
      classWriter0.visitMethod(0, "Bz^w*A_RL|/0@&|@k1", "Q8]u+bjf", "wheel.asm.Label", stringArray0);
      classWriter0.visitInnerClass("Q8]u+bjf", "Q8]u+bjf", "@_.F", 0);
      classWriter0.newMethodItem("Q8]u+bjf", "Q8]u+bjf", "\"O", false);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4213, "`1%J9W:Mw=>q2NA", "", "`1%J9W:Mw=>q2NA", "");
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.putShort(4213);
      ByteVector byteVector1 = byteVector0.putShort(4213);
      fieldWriter0.put(byteVector1);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("\"O");
      fieldWriter0.visitAttribute(attribute0);
      assertFalse(attribute0.isCodeAttribute());
  }
}
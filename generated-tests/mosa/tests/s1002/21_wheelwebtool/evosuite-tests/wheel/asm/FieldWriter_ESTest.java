/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:53:07 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
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
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-496), "", "U", (String) null, "");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "%=HLfoGjH", "%=HLfoGjH", "U", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "$u'2");
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.visitEnd();
      assertSame(fieldWriter1, fieldWriter0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "WicW0im)O*q!J", "U", "WicW0im)O*q!J", "WicW0im)O*q!J");
      fieldWriter0.visitAnnotation("~qKO=", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-17));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-17), "iGLT3aZVSVS5,", "iGLT3aZVSVS5,", "iGLT3aZVSVS5,", "iGLT3aZVSVS5,");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "#!T8|hu(&C1&Xx", "#!T8|hu(&C1&Xx", "#!T8|hu(&C1&Xx", "WicW0im)O*q!J");
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(33);
      fieldWriter0.visitAnnotation("", false);
      fieldWriter0.put(byteVector1);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 99, "?\"", "K(As", "%", "K(As");
      fieldWriter0.getSize();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("K(As", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2707), "%HLfoGjH", "%HLfoGjH", "U", (Object) null);
      fieldWriter0.visitAnnotation("%HLfoGjH", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2707), "Deprecated", "Deprecated", "U", (Object) null);
      Attribute attribute0 = new Attribute("U");
      fieldWriter0.visitAttribute(attribute0);
      FieldWriter fieldWriter1 = fieldWriter0.next;
      fieldWriter0.visitAnnotation("Deprecated", false);
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, 2, "u", "U", "Deprecated", (Object) null);
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
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "The wildcard must not be null", "#!T8|hu(&C1&Xx", (Object) null);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-17));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-17), "#!T8|hu(&C1&Xx", "#!T8|hu(&C1&Xx", "#!T8|hu(&C1&Xx", "iGLT3aZVSVS5,");
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("#!T8|hu(&C1&Xx", true);
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-17));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 51, "#!T8|hu(&C1&Xx", "iGLT3aZVSVS5,", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-4), "", "7F`?M~]Ti V_", "z{~Is#}l_,*Ook<|", "#!T8|hu(&C1&Xx");
      fieldWriter0.getSize();
      classWriter0.version = (-4);
      ByteVector byteVector0 = new ByteVector(3);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-17));
      classWriter0.version = (-17);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-17), "#!T8|hu(&C1&Xx", "#!T8|hu(&C1&Xx", "#!T8|hu(&C1&Xx", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "WicW0im)O*q!J");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2681), "Deprecated", "Deprecated", "U", "U");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-96);
      byteArray0[1] = (byte)6;
      byteArray0[2] = (byte)2;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      classWriter0.newConst("#!T|u(&C1&d");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1788, "^Vf7t@?J~/:.B^+|g\"", "^Vf7t@?J~/:.B^+|g\"", "#!T|u(&C1&d", "^Vf7t@?J~/:.B^+|g\"");
      ByteVector byteVector0 = classWriter0.pool;
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
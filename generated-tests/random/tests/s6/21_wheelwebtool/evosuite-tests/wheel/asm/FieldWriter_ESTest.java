/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 14:54:12 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3184, "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "L1(h+IfRCYiBiS$", "L1(h+IfRCYiBiS$", "L1(h+IfRCYiBiS$", (Object) null);
      ByteVector byteVector0 = new ByteVector(1);
      Attribute attribute0 = new Attribute("ConstantValue");
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
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2158, "Insensitive", "Insensitive", "", "Insensitive");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2158, "Insensitive", "Insensitive", "", "Insensitive");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(86);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3841), "IZpLf%c&4!*F3.GUA", "IZpLf%c&4!*F3.GUA", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1048576));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      classWriter0.visit((-1271), (-897), "ConstantValue", "", "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1271), "wheel.asm.Frame", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "[4", "-)|?Kl,M{Jap/0wE9", "", "[4");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1243));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1243), "ConstantValue", "ConstantValue", "ConstantValue", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1243));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1243), "ConstantValue", "ConstantValue", "ConstantValue", (Object) null);
      fieldWriter0.visitAnnotation("g5FKMX|h", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1243));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1243), "ConstantValue", "ConstantValue", "ConstantValue", (Object) null);
      fieldWriter0.visitAnnotation("|0IxQ.jC^K!<3^>gb", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 41, "Deprecated", "", (String) null, (Object) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "?2", "?2", "?2");
      Object object0 = new Object();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 2, "", "", "?2", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@49eb24df
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1243));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1243), "ConstantValue", "ConstantValue", "ConstantValue", (Object) null);
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1243));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1243), "ConstantValue", "ConstantValue", "ConstantValue", (Object) null);
      Attribute attribute0 = new Attribute("ConstantValue");
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

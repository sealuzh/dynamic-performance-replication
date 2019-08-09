/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 03:49:27 GMT 2019
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
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1304));
      classWriter0.index = (-1304);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "GXJ:@&i_~WQ9!Mk)Wz", "3yqWZO", "93TPjm", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1837), "P{a0m?)~7>rpM^L5", "7", "", "7");
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.version = (-1287);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1304));
      classWriter0.index = (-1304);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "GXJ:@&i_~WQ9!Mk)Wz", "3yqWZO", (String) null, "GXJ:@&i_~WQ9!Mk)Wz");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1304));
      classWriter0.index = (-1304);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "GXJ:@&i_~WQ9!Mk)Wz", "3yqWZO", "93TPjm", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1837), "P{a0m?)~7>rpM^L5", "7", "", "7");
      classWriter0.version = (-1287);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1304));
      classWriter0.index = (-1304);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "GXJ:@&i_~WQ9!Mk)Wz", "3yqWZO", (String) null, "GXJ:@&i_~WQ9!Mk)Wz");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2954);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 79, "Qe?GHW@8?I", "Qe?GHW@8?I", (String) null, (Object) null);
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1837), "P{a0m?)~7>rpM^L5", "(o9xJZ", "", "(o9xJZ");
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3849));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2861, ",\" ", "", (String) null, (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 5, ",\" ", "MrBvl:%<Py2lWz", "MrBvl:%<Py2lWz", "MrBvl:%<Py2lWz");
      fieldWriter1.next = fieldWriter0;
      // Undeclared exception!
      try { 
        fieldWriter1.next.visitAnnotation((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("\" :TopsZR");
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
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1276));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1075), "", "", "", "");
      fieldWriter0.visitAnnotation("Nn8Pq{,1", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1276));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1075), "", "", "", "");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "V6hp6&P}U&y'`";
      stringArray0[1] = "V6hp6&P}U&y'`";
      classWriter0.visit(49, 131072, "", "", "V6hp6&P}U&y'`", stringArray0);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(251658240, "", "`Am;", "5\"&zz:", "5\"&zz:");
      Attribute attribute0 = new Attribute("5{T~+5|=Pz^sdI;w");
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
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "", "", "");
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1276));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1075), "", "", "", "");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "V6hp6&P}U&y'`";
      stringArray0[1] = "V6hp6&P}U&y'`";
      classWriter0.visit(49, 131072, "", "", "V6hp6&P}U&y'`", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1276));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1075), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1837), "P{a0m?)~7>rpM^L5", "(o9xJZ", "", "(o9xJZ");
      fieldWriter0.visitAnnotation("", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1276));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1075), "", "", "", "");
      fieldWriter0.visitAnnotation("Nn8Pq{,1", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(251658240, "", "`Am;", "5\"&zz:", "5\"&zz:");
      fieldVisitor0.visitEnd();
  }
}
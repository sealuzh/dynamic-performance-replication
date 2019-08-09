/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 18:57:57 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-1227));
      classWriter0.version = (-2885);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2885), "Wcsr_S-hE%f", "q", "q", "ConstantValue");
      ByteVector byteVector0 = new ByteVector(1038);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1248));
      classWriter0.index = (-1248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1248), "Wcsr_S-hE%f", "1[>!|u", "R", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1227));
      classWriter0.version = (-2885);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2885), "Wcsr_S-hE%f", "q", "q", "ConstantValue");
      fieldWriter0.next = fieldWriter0;
      int int0 = fieldWriter0.next.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1248));
      classWriter0.index = (-1248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1248), "Wcsr_S-hE%f", "1[>!|u", "R", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1248));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2885), "Wcsr_S-hE%f", "", "", "ConstantValue");
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
      ClassWriter classWriter0 = new ClassWriter((-1248));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "2YrX})M,$a", "ji9F+*w@", "|", "2YrX})M,$a");
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
      ClassWriter classWriter0 = new ClassWriter((-1248));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "0|3Pjg;u?z6", (String) null, (Object) null);
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
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, (-996), "", "", "", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter((-1248));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 0, "", "short", "Synthetic", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1248), "2YrX})M,$a", "2YrX})M,$a", "a]@u.j;d_", "ji9F+*w@");
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("ji9F+*w@");
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
      ClassWriter classWriter0 = new ClassWriter((-1227));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2885), "Wcsr_S-hE%f", "q", "q", "ConstantValue");
      fieldWriter0.next = fieldWriter0;
      fieldWriter0.next.visitAnnotation("Wcsr_S-hE%f", false);
      ByteVector byteVector0 = new ByteVector(1038);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1248), "2YrX})M,$a", "2YrX})M,$a", "a]@u.j;d_", "ji9F+*w@");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("ji9F+*w@", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2862);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2847), "gb5P<", "gb5P<", "gb5P<", "gb5P<");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "gb5P<";
      stringArray0[1] = "gb5P<";
      classWriter0.visit(49, (-2847), "gb5P<", "gb5P<", "long", stringArray0);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1248));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "", "", "");
      Attribute attribute0 = new Attribute("lk#60gE|T8#)3$>3Qc");
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
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "", "", "");
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2862);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2847), "gb5P<", "gb5P<", "gb5P<", "gb5P<");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "gb5P<";
      stringArray0[1] = "gb5P<";
      classWriter0.visit(49, (-2847), "gb5P<", "gb5P<", "long", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1227));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2885), "Wcsr_S-hE%f", "q", "q", "ConstantValue");
      fieldWriter0.next = fieldWriter0;
      fieldWriter0.next.visitAnnotation("Wcsr_S-hE%f", false);
      int int0 = fieldWriter0.next.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1248));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1248));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1248), "Wcsr_S-hE%f", "1[>!|u", "R", "");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "Wcsr_S-hE%f", ";>vd+a_tnvsv/F", "L@aEjoQIu}4IKi:I.", "");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1248));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2904), "Wcsr_S-hE%f", "", "", "ConstantValue");
      fieldWriter0.visitEnd();
  }
}
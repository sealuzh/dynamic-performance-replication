/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 17:24:29 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
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
      ClassWriter classWriter0 = new ClassWriter(50);
      classWriter0.version = 50;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1408), "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      classWriter0.index = (-7);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(50);
      classWriter0.version = 50;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1408), "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      classWriter0.index = (-7);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", (String) null, "");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4101);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 187, "hO}UOj@2q]$*U=cHZy6", "a4&u}erhmiS8I4R", (String) null, "a4&u}erhmiS8I4R");
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
      ClassWriter classWriter0 = new ClassWriter(4101);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "&E>|", "&E>|", "&E>|", "&E>|");
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
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-585), "hO}UOj@2q]$*U=cHZy6", "", "", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(50);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1408), "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-272);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -272
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "E[-\"w0\"ye?u`0w", "_1q3Dim  A.h:2%Xf} ", "E[-\"w0\"ye?u`0w", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("_1q3Dim  A.h:2%Xf} ");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1080));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Signature", "Signature", "Signature", "Signature");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[0];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 0, "1oDOy@XE)wFknag\"N6a", "", "1oDOy@XE)wFknag\"N6a", "1oDOy@XE)wFknag\"N6a");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.PipedInputStream@21bb8513
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "E[-\"w0\"ye?u`0w", "_1q3Dim  A.h:2%Xf} ", "E[-\"w0\"ye?u`0w", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("_1q3Dim  A.h:2%Xf} ");
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
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-585), "hO}UOj@2q]$*U=cHZy6", "", "", (Object) null);
      fieldWriter0.visitAnnotation("hO}UOj@2q]$*U=cHZy6", false);
      ByteVector byteVector0 = new ByteVector(4096);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1408), "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("8hbJ\u0000ihO7)zDe^vxg", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1408), "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(44);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 44, "0[kV`)2B_]r2)2", "0[kV`)2B_]r2)2", "0[kV`)2B_]r2)2", "0[kV`)2B_]r2)2");
      Attribute attribute0 = new Attribute("0[kV`)2B_]r2)2");
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
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "'<crUy`AsDc", "float", "hO}UOj@2q]$*U=cHZy6", (Object) null);
      fieldWriter0.visitAnnotation("float", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1408), "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1408), "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-585), "hO}UOj@2q]$*U=cHZy6", "", "", (Object) null);
      fieldWriter0.visitAnnotation("hO}UOj@2q]$*U=cHZy6", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1408), "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1", "|}fh{8+yJ74X6?1");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-585), "hO}UOj@2q]$*U=cHZy6", "", "", (Object) null);
      fieldWriter0.visitEnd();
  }
}
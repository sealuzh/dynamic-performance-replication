/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 02:13:16 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-2309));
      classWriter0.version = (-2309);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-725), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2309));
      classWriter0.index = (-2309);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-743), "RutimeVisibleAnXotation", "RutimeVisibleAnXotation", "RutimeVisibleAnXotation", "RutimeVisibleAnXotation");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2309));
      classWriter0.version = (-2309);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-725), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2309));
      classWriter0.index = (-2309);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-743), "RutimeVisibleAnXotation", "RutimeVisibleAnXotation", "RutimeVisibleAnXotation", "RutimeVisibleAnXotation");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "wet{w4", "", "", "");
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
      ClassWriter classWriter0 = new ClassWriter((-18));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "", "");
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
      ClassWriter classWriter0 = new ClassWriter((-228));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "8f~/0C~vi{lE", "nvU~{\"iPDv}@u?WKov", "dp", "nvU~{\"iPDv}@u?WKov");
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
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 0, "", "", "", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2309));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-725), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      fieldWriter0.visitAnnotation("u6.e]I8E8XpE>B}Z~/", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "wet{w4", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2301));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "gyw(H7)gos-)~-B]E@", "-|~ka[Ehv", (String) null, "gyw(H7)gos-)~-B]E@");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1265));
      String[] stringArray0 = new String[0];
      classWriter0.visit(49, (-1265), "~WivQbOZU@mOa=", "", "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1265), "~WivQbOZU@mOa=", "~WivQbOZU@mOa=", "j4%h!L(ur'$jZ7*L}r?@", "~WivQbOZU@mOa=");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-228));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 8, "dUH", "-|~ka[Ehv", "", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-167), "", "", "", "");
      Attribute attribute0 = new Attribute("");
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
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1265));
      String[] stringArray0 = new String[0];
      classWriter0.visit(49, (-1265), "~WivQbOZU@mOa=", "", "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1265), "~WivQbOZU@mOa=", "~WivQbOZU@mOa=", "j4%h!L(ur'$jZ7*L}r?@", "~WivQbOZU@mOa=");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "[]", "-js`o_v0Sx-]b~36-", "", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "wet{w4", "", "", "");
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2309));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-725), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      fieldWriter0.visitAnnotation("u6.e]I8E8XpE>B}Z~/", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2301));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1, ".", ".", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1265));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1265), "~WivQbOZU@mOa=", "~WivQbOZU@mOa=", "j4%h!L(ur'$jZ7*L}r?@", "~WivQbOZU@mOa=");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1603, "1itE<pvA8-Aao!vQ)g", "1itE<pvA8-Aao!vQ)g", "Y-{O", "");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "h^hL/' ACeH", "wheel.asm.FieldWriter", "86!S>g%-*szhEhsmOR", "86!S>g%-*szhEhsmOR");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-167), "", "", "", "");
      Attribute attribute0 = new Attribute("\"M0AcXH");
      fieldWriter0.visitAttribute(attribute0);
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

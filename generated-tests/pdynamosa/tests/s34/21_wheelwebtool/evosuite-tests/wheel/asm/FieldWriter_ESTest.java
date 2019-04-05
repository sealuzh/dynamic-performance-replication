/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 22:12:16 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-2028));
      classWriter0.index = (-2028);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2603), "org.apache.commons.io.filefilter.NameFileFilter", "org.apache.commons.io.filefilter.NameFileFilter", "$?WW8HGa3i^|>^", "org.apache.commons.io.filefilter.NameFileFilter");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2028));
      classWriter0.index = (-2028);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2603), "org.apache.commons.io.filefilter.NameFileFilter", "org.apache.commons.io.filefilter.NameFileFilter", "$?WW8HGa3i^|>^", "org.apache.commons.io.filefilter.NameFileFilter");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(952);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2456), "", "y", "", "org.apache.commons.io.filefilter.NameFileFilter");
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
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 248, "", "", "", "");
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
      ClassWriter classWriter0 = new ClassWriter(248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 248, "", "", "", "");
      fieldWriter0.next = fieldWriter0;
      // Undeclared exception!
      try { 
        fieldWriter0.next.visitAnnotation((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-654));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 56, "Deprecated", "Deprecated", "Deprecated", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("Deprecated");
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
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1668));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "U(I-LJuIbj&B5K='PW`", "U(I-LJuIbj&B5K='PW`", "U(I-LJuIbj&B5K='PW`", "U(I-LJuIbj&B5K='PW`");
      fieldWriter0.visitAnnotation("U(I-LJuIbj&B5K='PW`", false);
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1668));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "U(I-LJuIbj&B5K='PW`", "U(I-LJuIbj&B5K='PW`", "U(I-LJuIbj&B5K='PW`", "U(I-LJuIbj&B5K='PW`");
      fieldWriter0.visitAnnotation("", true);
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1565));
      classWriter0.version = (-936);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1565), "$?|W8HGa3i^|>^", "org.apache.commons.io.filefilter.NameFileFilter", "org.apache.commons.io.filefilter.NameFileFilter", "$?|W8HGa3i^|>^");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2068));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "long", "long", (String) null, "long");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2602));
      classWriter0.visit((-2602), (-2602), "", "", "`nFX<LqoRWbH.>", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2602), "", "", "z<s%MW?tTU82z ", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-654));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "Deprecated", "Deprecated", "Deprecated", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-654));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "Deprecated", "Deprecated", "Deprecated", (Object) null);
      fieldWriter0.visitAnnotation("Deprecated", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1668));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "U(I-LJuIbj&B5K='PW`", "U(I-LJuIbj&B5K='PW`", "U(I-LJuIbj&B5K='PW`", "U(I-LJuIbj&B5K='PW`");
      fieldWriter0.visitAnnotation("U(I-LJuIbj&B5K='PW`", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2028));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "SourceFile", "SourceFile", (String) null, "org.apache.commons.io.filefilter.NameFileFilter");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 248, "", "", "", "");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "", "f<26AST", "3v|!<N_SFBr,Ceiz|", "8^MP3jn)N");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-654));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "Deprecated", "Deprecated", "Deprecated", (Object) null);
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-654));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "Deprecated", "Deprecated", "Deprecated", (Object) null);
      Attribute attribute0 = new Attribute("Deprecated");
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
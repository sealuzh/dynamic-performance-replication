/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 08:27:55 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "v", "v", "5", (Object) null);
      classWriter0.visit(4267, 5503, "5", "v", "v", (String[]) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-238));
      classWriter0.index = (-32768);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W");
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-80));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-80), "", "", "", (Object) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.apache.commons.io.filefilter.AbstractFileFilter";
      stringArray0[1] = "&by.l'YJ";
      stringArray0[2] = "&by.l'YJ";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "Nl8Ew(uX+";
      stringArray0[6] = "";
      classWriter0.visit(49, 48, "&by.l'YJ", "&by.l'YJ", "&by.l'YJ", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-238));
      classWriter0.index = (-32768);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-80));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-80), "", "", "", (Object) null);
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-504), "lk\"zM !{F,#4y\".Kj", "61tLh+9Z\"%v", "F/", "lk\"zM !{F,#4y\".Kj");
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
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1807));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "H=", "H=", (String) null, (Object) null);
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(929);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "rsmiuh:A_", "rsmiuh:A_", (String) null, (Object) null);
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "2", "2", "2", "2");
      ByteVector byteVector0 = classWriter0.pool;
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(929);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "rsmiuh:A_", "rsmiuh:A_", "rsmiuh:A_", "rsmiuh:A_");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 929;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1135));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "v", "e[D5)(N!:V>g<", (String) null, (Object) null);
      Attribute attribute0 = new Attribute("");
      byte[] byteArray0 = new byte[6];
      attribute0.value = byteArray0;
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "v", "v", "]5", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[8];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, (String) null, (String) null, (String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2021));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-2021), "I", "I", "I", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-2673);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1836, "&O", "/p7(", "G", "/p7(");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1135));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "v", "e[D5)(N!:V>g<", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "G", "G", "G", (Object) null);
      fieldWriter0.visitAnnotation("G", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "G", "G", "G", (Object) null);
      fieldWriter0.visitAnnotation("G", true);
      ByteVector byteVector0 = new ByteVector(48);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "G", "G", "G", (Object) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "G";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "G";
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visit(49, (-1467), "0yVC,5H;g9.!X)z3%.;", "C~fafh?0dh>CPEw\"X", "", stringArray0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-238));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W");
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "v", "v", "5", (Object) null);
      classWriter0.visit(4267, 5503, "5", "v", "v", (String[]) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-238));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W", "+=$Y|GJ+nQ.W");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "G", "G", "G", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "G", "G", "G", (Object) null);
      fieldWriter0.visitAnnotation("G", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "G", "G", "G", (Object) null);
      fieldWriter0.visitAnnotation("G", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-65));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-65), "G", "G", "G", (Object) null);
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-65), "s{{Q#(v@t3^{m", "G", "s{{Q#(v@t3^{m", "");
      assertNotSame(fieldVisitor0, fieldWriter0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "rsmiua:A_", "LO", "rsmiua:A_", "rsmiua:A_");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1135));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "v", "e[D5)(N!:V>g<", (String) null, (Object) null);
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
      }
  }
}

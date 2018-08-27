/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:06:03 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;
import wheel.asm.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(563);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(856);
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "H$ntdjnEoavN", "H$ntdjnEoavN", "H$ntdjnEoavN", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(856);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1933), "H$ntdjnEoavC", "H$ntdjnEoavC", "H$ntdjnEoavC", "H$ntdjnEoavC");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 870, "fC", "fC", "fC", (Object) null);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 870, "fC", "fC", (String) null, label0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value L6
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(636);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1910), "H$ntdjnEoa?C", "org.apache.commons.io.filefilter.DirectoryFileFilter", "H$ntdjnEoa?C", "org.apache.commons.io.filefilter.DirectoryFileFilter");
      fieldWriter0.getSize();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.DirectoryFileFilter", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(856);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1933), "H$ntdjnEoavC", "H$ntdjnEoavC", "H$ntdjnEoavC", "H$ntdjnEoavC");
      fieldWriter0.visitAnnotation("7#;1=7r)IsX", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(856);
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1933), "H$ntdjnEoavC", "H$ntdjnEoavC", "H$ntdjnEoavC", (Object) null);
      fieldWriter0.getSize();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("H$ntdjnEoavC", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(856);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1933), "H$ntdjnEoavC", "org.apache.commons.io.filefilter.DirectoryFileFilter", "H$ntdjnEoavC", "org.apache.commons.io.filefilter.DirectoryFileFilter");
      fieldWriter0.visitAnnotation("H$ntdjnEoavC", false);
      fieldWriter0.getSize();
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(839);
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 839, "H$ntdjn)oavC", "H$ntdjn)oavC", "H$ntdjn)oavC", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1933), "H$ntdjn)oavC", "H$ntdjn)oavC", "H$ntdjn)oavC", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(636);
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "4A/FRaN4`o-xD]Vpxe", "4A/FRaN4`o-xD]Vpxe", (String) null, "4A/FRaN4`o-xD]Vpxe");
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      System.setCurrentTimeMillis(636);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1933), "H$ntdjn)oavC", "H$ntdjn)oavC", "H$ntdjn)oavC", (Object) null);
      fieldWriter0.visitAnnotation("+@pD1it'I~o\";B4geww", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(856);
      Label label0 = new Label();
      Object object0 = label0.info;
      Label label1 = label0.getFirst();
      label0.next = label1;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1940), "", "", "", (Object) null);
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
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
      ClassWriter classWriter0 = new ClassWriter(856);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "H$ntdjnEoavC", "", "H$ntdjnEoavC", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(856);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1933), "H$ntdjnEoavC", "org.apache.commons.io.filefilter.DirectoryFileFilter", "H$ntdjnEoavC", "org.apache.commons.io.filefilter.DirectoryFileFilter");
      Attribute attribute0 = new Attribute("H$ntdjnEoavC");
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
      ClassWriter classWriter0 = new ClassWriter(856);
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-910), "H$ntdjn)oavC", "H$ntdjn)oavC", (String) null, "H$ntdjn)oavC");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1933), "H$ntdjn)oavC", "H$ntdjn)oavC", "H$ntdjn)oavC", (Object) null);
      fieldWriter0.visitAnnotation("H$ntdjn)oavC", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(873);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Label label0 = new Label();
      Object object0 = label0.info;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "[-yWRtWdI:";
      stringArray0[1] = "H$ntdjn)oavC";
      stringArray0[2] = "[-yWRtWdI:";
      classWriter0.visit(363, (-1933), "H$ntdjn)oavC", "[-yWRtWdI:", "H$ntdjn)oavC", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1933), "H$ntdjn)oavC", "H$ntdjn)oavC", "H$ntdjn)oavC", (Object) null);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      ByteVector byteVector0 = new ByteVector();
      classWriter0.newDouble(0.0);
      ByteVector byteVector1 = byteVector0.putInt(873);
      fieldWriter1.put(byteVector0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)40;
      byteArray0[2] = (byte)40;
      byteArray0[3] = (byte) (-3);
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte) (-84);
      byteArray0[6] = (byte)56;
      byteArray0[7] = (byte)117;
      // Undeclared exception!
      try { 
        byteVector1.putByteArray(byteArray0, 873, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(856);
      classWriter0.visit(363, 856, "\"'`UIG", "gdrL", "\"'`UIG", (String[]) null);
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1933), "H$ntdjnEoavN", "H$ntdjnEoavN", "H$ntdjnEoavN", (Object) null);
      label0.inputStackTop = (-1933);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("System");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitEnd();
  }
}
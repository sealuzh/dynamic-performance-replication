/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 07:53:02 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 376, "org.apache.commons.io.filefilter.DirectoryFileFilter", "org.apache.commons.io.filefilter.DirectoryFileFilter", ">e%:=H|", "org.apache.commons.io.filefilter.DirectoryFileFilter");
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.DirectoryFileFilter");
      byte[] byteArray0 = new byte[2];
      attribute0.value = byteArray0;
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3920, "t98%^O$VXk<", "t98%^O$VXk<", ".class", "t98%^O$VXk<");
      Attribute attribute0 = new Attribute("$z6");
      classWriter0.lastField.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(4);
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
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3920, "t98%^O$VXk<", "t98%^O$VXk<", ".class", "t98%^O$VXk<");
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = new ByteVector(4);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3920, "t98%^O$VXk<", "t98%^O$VXk<", ".class", "t98%^O$VXk<");
      fieldWriter0.visitAnnotation("MEk9=wG@2=h0Q'qy4", true);
      ByteVector byteVector0 = new ByteVector(4);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-447));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-447), "", "-n}q3]<8hV{JSg[W,ju", (String) null, "");
      ByteVector byteVector0 = new ByteVector(131072);
      classWriter0.version = (-1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-447));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-447), "", "-n}q3]<8hV{JSg[W,ju", (String) null, "");
      ByteVector byteVector0 = new ByteVector(131072);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-447));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-447), "", "-n}q3]<8hV{JSg[W,ju", (String) null, "");
      classWriter0.version = (-1);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-447));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-447), "", "-n}q3]<8hV{JSg[W,ju", (String) null, "");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-156));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 376, "org.apache.commons.io.filefilter.DirectoryFileFilter", "org.apache.commons.io.filefilter.DirectoryFileFilter", ">e%:=H|", "org.apache.commons.io.filefilter.DirectoryFileFilter");
      fieldWriter0.visitAnnotation("wheel.asm.ClassWriter", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 376, "org.apache.commons.io.filefilter.DirectoryFileFilter", "org.apache.commons.io.filefilter.DirectoryFileFilter", ">e%:=H|", "org.apache.commons.io.filefilter.DirectoryFileFilter");
      fieldWriter0.visitAnnotation(">e%:=H|", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-113));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1048577, "oe Lrm", "oe Lrm", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 376, "org.apache.commons.io.filefilter.DirectoryFileFilter", "org.apache.commons.io.filefilter.DirectoryFileFilter", ">e%:=H|", "org.apache.commons.io.filefilter.DirectoryFileFilter");
      FieldVisitor fieldVisitor0 = classWriter0.visitField((byte)104, "tH*T#xIIT@cAZXoy67Y", "", (String) null, "");
      assertNotSame(fieldVisitor0, fieldWriter0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-447));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-447), "", "-n}q3]<8hV{JSg[W,ju", (String) null, "");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-447));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-447), "", "-n}q3]<8hV{JSg[W,ju", (String) null, "");
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
}

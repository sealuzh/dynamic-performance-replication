/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 03:27:11 GMT 2018
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
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String string0 = "0 d#ALP}AVvKU";
      classWriter0.visitField(0, "ZPz[y5k>'6Wo ^u", "t$;Fp&/dq`Y7", "t$;Fp&/dq`Y7", "");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "0 d#ALP}AVvKU", "0 d#ALP}AVvKU", "ZPz[y5k>'6Wo ^u", (Object) null);
      fieldWriter0.visitEnd();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-13);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "hz)UG4z", "hz)UG4z", "hz)UG4z", "hz)UG4z");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "hz)UG4z", "hz)UG4z", "hz)UG4z", "hz)UG4z");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2869));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2869), "F?i(F~xJtZp8r{8J7", "b", "H$O", "F?i(F~xJtZp8r{8J7");
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2845));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2845), "F?i(F~xJtZp8r{8J7", "", "8'GDbXi(r`>@hHq@7m/", "F?i(F~xJtZp8r{8J7");
      fieldWriter0.visitEnd();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("F?i(F~xJtZp8r{8J7", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "hz)UG4z", "hz)UG4z", "hz)UG4z", "hz)UG4z");
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 8, "Signature", "Signature", (String) null, "hz)UG4z");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65548, "java/lang/Object", "char", "<_e|l{d|!TwVy2Y0*A", (Object) null);
      fieldWriter0.visitAnnotation("_d=*(QS", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65533);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "hz)UG4z", "hz)UG4z", "hz)UG4z", "hz)UG4z");
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "iG0jfJd", "", (String) null, "");
      fieldWriter1.put(byteVector0);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-60);
      byteArray0[2] = (byte) (-65);
      byteArray0[3] = (byte)49;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ClassWriter classWriter0 = new ClassWriter(65535);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "hz)UG4z", "hz)UG4z", "hz)UG4z", "hz)UG4z");
      fieldWriter0.getSize();
      classWriter0.version = 83;
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      classWriter0.version = 16777215;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "hz)UG4z", "hz)UG4z", "hz)UG4z", "hz)UG4z");
      fieldWriter0.getSize();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("hz)UG4z", true);
      assertNotNull(annotationVisitor0);
  }
}
/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 18:36:20 GMT 2018
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
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1901);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "The suffix must not be null", "The suffix must not be null");
      fieldWriter0.visitAnnotation("The suffix must not be null", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1556));
      String string0 = "XR k5uzZ2hQ";
      String string1 = "";
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-2068), "XR k5uzZ2hQ", "", (String) null, classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1901);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1964, "rN'_D", "Sd#'=O~UK", "Sd#'=O~UK", "Sd#'=O~UK");
      FieldWriter fieldWriter1 = fieldWriter0.next;
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("rN'_D", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1901);
      ByteVector byteVector0 = new ByteVector();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "Sd#'=O~UK", "", "Sd#'=O~UK");
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1901);
      String string0 = "rN'_D";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1964, "rN'_D", "Sd#'=O~UK", "Sd#'=O~UK", "Sd#'=O~UK");
      FieldWriter fieldWriter1 = fieldWriter0.next;
      fieldWriter0.getSize();
      boolean boolean0 = false;
      ByteVector byteVector0 = new ByteVector();
      String string1 = "";
      ByteVector byteVector1 = byteVector0.putUTF8("");
      Attribute attribute0 = new Attribute("rN'_D");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector2 = byteVector1.putShort((-1285));
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1901);
      ByteVector byteVector0 = new ByteVector();
      boolean boolean0 = ClassReader.FRAMES;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-962), "Sd#'=O~UK", "ufiOX(po~=FGky:", "", (Object) null);
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("");
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1901);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1964, "rN'_D", "rN'_D", "rN'_D", "rN'_D");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "rN'_D");
      ClassWriter classWriter1 = new ClassWriter(2);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "rN'_D", "", "ZQ[{3d", (Object) null);
      fieldWriter0.getSize();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Signature");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
      
      Attribute attribute0 = new Attribute("");
      FieldWriter fieldWriter2 = classWriter1.firstField;
      int int1 = fieldWriter1.getSize();
      assertEquals(16, int1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3180);
      ByteVector byteVector0 = classWriter0.pool;
      boolean boolean0 = ClassReader.FRAMES;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.FalseFileFilter", "a|b#l3npRG2{$7", "rN'_D", (Object) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "rN'_D");
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("");
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1901);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.version = (-1749);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1749), "The list of suffixes must not be null", "", "The list of suffixes must not be null", "");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "u$IP(e1whWU)E)?04n_");
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("");
      fieldWriter0.getSize();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1901);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.version = 1901;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1901, "", "Sd#'=O~UK", (String) null, (Object) null);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.getSize();
      Attribute attribute0 = new Attribute("Sd#'=O~UK");
      fieldWriter1.put(byteVector0);
      AnnotationVisitor annotationVisitor0 = fieldWriter1.visitAnnotation("Sd#'=O~UK", false);
      assertNotNull(annotationVisitor0);
  }
}
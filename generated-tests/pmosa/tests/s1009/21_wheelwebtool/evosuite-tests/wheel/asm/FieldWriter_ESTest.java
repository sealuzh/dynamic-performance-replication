/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 15:02:05 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;
import wheel.asm.Frame;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newMethodItem("Nl\"r=NTe,c{zz/", "Nl\"r=NTe,c{zz/", "org.apache.commons.io.filefilter.CanReadFileFilter", true);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.CanReadFileFilter");
      classWriter0.visitAnnotation("0", false);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-302), "0", "GD", "GD", "org.apache.commons.io.filefilter.FalseFileFilter");
      fieldWriter0.getSize();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      Attribute attribute0 = new Attribute("ConstantValue");
      Attribute attribute1 = attribute0.next;
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
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "RuntimevisileAnnotations", "SOL8'~+I]m7", "RuntimevisileAnnotations", "RuntimevisileAnnotations");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-30));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-30), "Z]H|;L)#=w`", "Z]H|;L)#=w`", "Z]H|;L)#=w`", "Z]H|;L)#=w`");
      fieldWriter0.getSize();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("Deprecated", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1296);
      FileSystemHandling.shouldAllThrowIOExceptions();
      ClassWriter classWriter1 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter1, 1, "java/lang/Throwable", "wOm`kT+fNRH-UkSW", "BIx%R`+=|xAbuh", (Object) null);
      Attribute attribute0 = new Attribute("wOm`kT+fNRH-UkSW");
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
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-137), "RuntimevisileAnnotations", "RuntimevisileAnnotations", "RuntimevisileAnnotations", "RuntimevisileAnnotations");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "3p:D&do$");
      classWriter0.newMethodItem("org.apache.commons.io.filefilter.CanReadFileFilter", "org.apache.commons.io.filefilter.CanReadFileFilter", "0", false);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-294), "Pg3UL)Hzi;~m~vFY25C", "=bsM%P1Sh5+2", (String) null, (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 101, "org.apache.commons.io.filefilter.CanReadFileFilter", "org.apache.commons.io.filefilter.CanReadFileFilter", "=bsM%P1Sh5+2", "=bsM%P1Sh5+2");
      fieldWriter1.getSize();
      ByteVector byteVector0 = new ByteVector();
      FieldWriter fieldWriter2 = classWriter0.firstField;
      fieldWriter2.put(byteVector0);
      assertNotSame(fieldWriter2, fieldWriter1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "3p:D&do$");
      classWriter0.newMethodItem("org.apache.commons.io.filefilter.CanReadFileFilter", "org.apache.commons.io.filefilter.CanReadFileFilter", "0", false);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-294), "org.apache.commons.io.filefilter.DirectoryFileFilter", "=bsM%P1Sh5+2", (String) null, (Object) null);
      fieldWriter0.getSize();
      FieldWriter fieldWriter1 = classWriter0.firstField;
      assertSame(fieldWriter1, fieldWriter0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-30));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-30), "Z]H|;L)#=w`", "Z]H|;L)#=w`", "Z]H|;L)#=w`", "Z]H|;L)#=w`");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Z]H|;L)#=w`";
      stringArray0[1] = "w)0n2e1lzC^>";
      stringArray0[2] = "w)0n2e1lzC^>";
      stringArray0[3] = "w)0n2e1lzC^>";
      stringArray0[4] = "=X8Wi";
      classWriter0.visit(828, 131072, "Z]H|;L)#=w`", "=X8Wi", "w)0n2e1lzC^>", stringArray0);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.put12(16, 1465);
      ByteVector byteVector2 = byteVector1.put12(2, (-3616));
      ByteVector byteVector3 = byteVector2.putInt(1);
      fieldWriter0.put(byteVector3);
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-30));
      classWriter0.version = (-30);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-629), "ConstantValue", "org.apache.commons.io.filefilter.CanReadFileFilter", "", "org.apache.commons.io.filefilter.CanReadFileFilter");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      int int0 = Frame.KIND;
      int int1 = fieldWriter0.getSize();
      assertEquals(30, int1);
  }
}
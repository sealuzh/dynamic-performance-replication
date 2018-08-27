/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:16:31 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileDescriptor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
      ClassWriter classWriter0 = new ClassWriter((-1673));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "^Um?P\"iSFBR", "^Um?P\"iSFBR", "^Um?P\"iSFBR", (Object) null);
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.getSize();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("^Um?P\"iSFBR", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1673));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1673), "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1673));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "7Uq\"8/rDIF=s\tz8c6", "7Uq\"8/rDIF=s\tz8c6", "7Uq\"8/rDIF=s\tz8c6", "7Uq\"8/rDIF=s\tz8c6");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2047);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-841), "'PL7 I,a|F", "'PL7 I,a|F", (String) null, "'PL7 I,a|F");
      fieldWriter0.visitEnd();
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1673));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1673), "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.FileFileFilter", true);
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector0);
      fieldWriter0.getSize();
      System.setCurrentTimeMillis(48);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(50);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      fieldWriter0.visitEnd();
      fieldWriter0.visitAnnotation("", true);
      Attribute attribute0 = new Attribute("");
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1673));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1673), "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.FileFileFilter", false);
      fieldWriter0.getSize();
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1673));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1673), "org.apache.commons.io.filefilter.FileFileFilter", "j31x", "j31x", "j31x");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      classWriter0.newInteger((-1));
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.FileFileFilter", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1987);
      classWriter0.version = 1987;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-923), "", ".va\"N}", ".va\"N}", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = new ByteVector();
      fieldWriter0.put(byteVector1);
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitAnnotation("Deprecated", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(34, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1673));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "7Uq\"8/rDIF=s\tz8c6", "7Uq\"8/rDIF=s\tz8c6", "7Uq\"8/rDIF=s\tz8c6", "7Uq\"8/rDIF=s\tz8c6");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "7Uq\"8/rDIF=s\tz8c6", "7Uq\"8/rDIF=s\tz8c6", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter1.put(byteVector0);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1673));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1673), "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      String[] stringArray0 = new String[0];
      classWriter0.visit((-1673), (-1256), "org.apache.commons.io.filefilter.FileFileFilter", (String) null, (String) null, stringArray0);
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.FileFileFilter", false);
      System.setCurrentTimeMillis((-1806L));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassWriter classWriter1 = new ClassWriter(0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "'PL7 I,a|F", "'PL7 I,a|F", "<:A1/:?x9pgK{1G", (Object) null);
      Attribute attribute0 = new Attribute((String) null);
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitEnd();
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

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(50);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      fieldWriter0.visitEnd();
      String string0 = "";
      fieldWriter0.visitAnnotation("", true);
      ByteVector byteVector0 = new ByteVector();
      FieldWriter fieldWriter1 = classWriter0.lastField;
      fieldWriter1.put(byteVector0);
      FieldWriter fieldWriter2 = classWriter0.firstField;
      fieldWriter2.next = fieldWriter1;
      Attribute attribute0 = new Attribute(")v6i+L1gi$h&/m");
      fieldWriter2.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter2.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }
}

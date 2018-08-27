/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 12:59:22 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.Edge;
import wheel.asm.FieldWriter;
import wheel.asm.Frame;
import wheel.asm.Label;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1683));
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "o", "o", "");
      ByteVector byteVector1 = new ByteVector();
      ByteVector byteVector2 = byteVector1.putUTF8("");
      byteVector2.putByte(1);
      fieldWriter0.put(byteVector2);
      fieldWriter0.getSize();
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
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "7d9N", "7d9N", (String) null, "");
      fieldWriter0.getSize();
      classWriter0.visitMethod(16, "]2on`1", "", "]2on`1", (String[]) null);
      fieldWriter0.visitAnnotation("4R^=vH,q<P*|H|g6", true);
      fieldWriter0.visitAnnotation("o", false);
      MockFile mockFile0 = new MockFile("");
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1678));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      int int0 = Frame.BOOLEAN;
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1678), "", "", "", "");
      Attribute attribute0 = new Attribute("jsl5h");
      fieldWriter0.visitAnnotation("Synthetic", true);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putInt(1);
      byteVector1.putLong((-1678));
      fieldWriter1.put(byteVector1);
      FieldWriter fieldWriter2 = classWriter0.lastField;
      fieldWriter1.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1678));
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1678), "", "", "", "");
      Attribute attribute0 = new Attribute("jsl5h");
      ByteVector byteVector0 = new ByteVector();
      FieldWriter fieldWriter1 = classWriter0.lastField;
      fieldWriter1.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1671));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "o", "", "");
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("ConstantValue", true);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "Deprecated", "Deprecated", (String) null, "Deprecated");
      Attribute attribute0 = new Attribute("");
      classWriter0.newUTF8("Deprecated");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)0;
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putInt((byte)8);
      fieldWriter1.put(byteVector1);
      fieldWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1683));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "p{\"=W,&[vSpN", "", "BI>@NlSuAW+L", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("BI>@NlSuAW+L", false);
      FieldWriter fieldWriter1 = classWriter0.lastField;
      fieldWriter1.visitAnnotation("org.apache.commons.io.filefilter.HiddenFileFilter", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("lr@+~!BV");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1678));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "o", "", "");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = Type.SHORT;
      boolean boolean0 = true;
      fieldWriter0.visitAnnotation("o", true);
      String string0 = "qY@RWf";
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1678), "", "", "qY@RWf", "");
      Attribute attribute0 = new Attribute("jsl5h");
      fieldWriter0.visitAnnotation("Synthetic", true);
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      fieldWriter1.visitAttribute(attribute0);
      ByteVector byteVector1 = byteVector0.putInt(40);
      byteVector1.putLong((-1678));
      // Undeclared exception!
      try { 
        fieldWriter1.put(byteVector1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1678));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "o", "", "");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String string0 = "Deprecated";
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1678), "", "", "Deprecated", "");
      Attribute attribute0 = new Attribute("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      fieldWriter1.visitAttribute(attribute0);
      boolean boolean0 = true;
      fieldWriter0.visitAnnotation("jsl5h", true);
      // Undeclared exception!
      try { 
        fieldWriter1.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1678));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "A", "", "");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = Frame.BOOLEAN;
      fieldWriter0.visitAnnotation("A", false);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1678), "", "", "Deprecated", "");
      Attribute attribute0 = new Attribute("3njsl5h");
      fieldWriter0.visitAnnotation("(ynthetic", false);
      fieldWriter0.getSize();
      int int1 = fieldWriter0.getSize();
      assertEquals(40, int1);
      
      ByteVector byteVector0 = new ByteVector();
      byteVector0.putInt(40);
      ByteVector byteVector1 = new ByteVector();
      byteVector1.putUTF8("");
      byteVector1.putLong(2);
      fieldWriter0.put(byteVector1);
      FieldWriter fieldWriter2 = classWriter0.lastField;
      FieldWriter fieldWriter3 = classWriter0.lastField;
      classWriter0.version = (-2093);
      fieldWriter3.put(byteVector0);
      fieldWriter1.getSize();
      fieldWriter2.visitEnd();
      int int2 = fieldWriter3.getSize();
      assertEquals(30, int2);
  }
}
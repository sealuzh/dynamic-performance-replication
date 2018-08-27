/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 19:58:49 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;
import wheel.asm.Frame;
import wheel.asm.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2098));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "fxF1%<,Si:H8:", "fxF1%<,Si:H8:", "fxF1%<,Si:H8:", "wheel.asm.MethodWriter");
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2037);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1422, "H6", "H6", "H6", "H6");
      Attribute attribute0 = new Attribute("v'{");
      fieldWriter0.visitAttribute(attribute0);
      Attribute attribute1 = new Attribute("v'{");
      fieldWriter0.visitAttribute(attribute1);
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

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4015));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "fxF1%<,Si:H8:", "wheel.asm.MethodWriter", "wheel.asm.MethodWriter", "fxF1%<,Si:H8:");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-82));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-82), "", "RuntimeInvisibleAnnotations", "", "RuntimeInvisibleAnnotations");
      ByteVector byteVector0 = new ByteVector(496);
      ByteVector byteVector1 = byteVector0.put11(2, 496);
      ByteVector byteVector2 = byteVector1.putLong(1);
      byteVector2.putShort(2779);
      int int0 = 169;
      ByteVector byteVector3 = byteVector2.putShort(169);
      ByteVector byteVector4 = byteVector3.putUTF8("");
      fieldWriter0.put(byteVector4);
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("<init>");
      Attribute attribute1 = attribute0.next;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)25;
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
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4015));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "fxF1%<,Si:H8:", "fxF1%<,Si:H8:", "fxF1%<,Si:H8:", "fxF1%<,Si:H8:");
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2098));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "fxF1%<,Si:H8:", "fxF1%<,Si:H8:", "fxF1%<,Si:H8:", "wheel.asm.MethodWriter");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4015));
      classWriter0.newClass("char");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "fxF1%<,Si:H8:", "wheel.asm.MethodWriter", "wheel.asm.MethodWriter", "fxF1%<,Si:H8:");
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1452), "A^izlLOan1b4(\">)", "Synthetic", "A^izlLOan1b4(\">)", "A^izlLOan1b4(\">)");
      Attribute attribute0 = new Attribute("java/lang/Object");
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.FileFileFilter");
      char[] charArray0 = new char[3];
      charArray0[0] = '$';
      charArray0[1] = 'P';
      charArray0[2] = ':';
      fieldWriter0.visitAttribute(attribute0);
      Attribute attribute1 = new Attribute("f_qh;");
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 1320, "org.apache.commons.io.filefilter.FileFileFilter", "f_qh;", "ydX/N", classWriter0);
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
      ClassWriter classWriter0 = new ClassWriter((-82));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-82), "", "RuntimeInvisibleAnnotations", "", "RuntimeInvisibleAnnotations");
      boolean boolean0 = false;
      fieldWriter0.visitAnnotation("", false);
      String string0 = null;
      classWriter0.visitInnerClass("", "rw:h6>", "", (-82));
      ByteVector byteVector0 = null;
      FieldWriter fieldWriter1 = classWriter0.firstField;
      // Undeclared exception!
      try { 
        fieldWriter1.put((ByteVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-82));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-82), "", "RuntimeInvisibleAnnotations", "", "RuntimeInvisibleAnnotations");
      ByteVector byteVector0 = new ByteVector(496);
      ByteVector byteVector1 = byteVector0.put11(2, 496);
      ByteVector byteVector2 = byteVector1.putLong(1);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-127);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)54;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-107);
      byteArray0[5] = (byte)98;
      byteArray0[6] = (byte) (-55);
      byteArray0[7] = (byte)64;
      byteVector2.putByteArray(byteArray0, 3, 2);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 285212684, "k\u0005Ose", "bKg", (String) null, byteVector2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ByteVector@a
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "L>Y?", "L>Y?", "wheel.asm.MethodWriter", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4015));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1429, "RuntimeInvisibleAnnotations", "fxF1%<,Si:H8:", "n_M`1\"Rg:%FH'%", (Object) null);
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector(73);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4015));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "2WnJdvt";
      stringArray0[1] = "2WnJdvt";
      stringArray0[2] = "2WnJdvt";
      classWriter0.visit((-4015), 55, "2WnJdvt", "2WnJdvt", "2WnJdvt", stringArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "fxF1%<,Si:H8:", "fxF1%<,Si:H8:", "fxF1%<,Si:H8:", "fxF1%<,Si:H8:");
      int int0 = Frame.NULL;
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      ByteVector byteVector1 = new ByteVector(143);
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4025));
      Label label0 = new Label();
      Object object0 = label0.info;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "U3>+v#du1xy06{jWe", "U3>+v#du1xy06{jWe", "#Ohr!aR4n!8u[3lu", (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-4025), "fxF1%<,Si:H8:", "", (String) null, (Object) null);
      int int0 = fieldWriter1.getSize();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4025));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-4025), "fxF1%<,Si:H8:", "cBXt+\"Y#E}=:%E1E{K", (String) null, (Object) null);
      fieldWriter0.getSize();
      ClassWriter classWriter1 = new ClassWriter(86);
      ByteVector byteVector0 = classWriter1.pool;
      fieldWriter0.put(byteVector0);
  }
}
/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:30:54 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(552);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitEnd();
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1412));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 6, "|72q2<&vyM/Gk", "Uw94", "Uw94", "|72q2<&vyM/Gk");
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("|72q2<&vyM/Gk", true);
      Attribute attribute0 = new Attribute("Uw94");
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      System.setCurrentTimeMillis((-1L));
      ClassWriter classWriter1 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Insensitive", "Synthetic", "Insensitive", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      ClassWriter classWriter1 = new ClassWriter(4);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2437), "s", "XeMprO>Z|-w#~K|x~<", "s", "s");
      ByteVector byteVector0 = classWriter1.pool;
      ByteVector byteVector1 = byteVector0.put12(1, (-1197));
      fieldWriter0.put(byteVector1);
      ByteVector byteVector2 = new ByteVector();
      fieldWriter0.put(byteVector2);
      System.setCurrentTimeMillis((-2437));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(246);
      classWriter0.newNameType("3*F__G?d!wajS)", "3*F__G?d!wajS)");
      int int0 = ObjectStreamConstants.baseWireHandle;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "3*F__G?d!wajS)", "Ljava/lang/Synthetic;", "3*F__G?d!wajS)", (Object) null);
      Attribute attribute0 = new Attribute(")b");
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(131072);
      ByteVector byteVector1 = new ByteVector();
      ByteVector byteVector2 = byteVector1.putInt(8257536);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      fieldWriter0.visitAnnotation(")b", false);
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
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(552);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "s", "s", "s", "s");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitEnd();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("Qob*T", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attribute attribute0 = new Attribute("8:<eYyr\"5");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ClassWriter classWriter0 = new ClassWriter(1977);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "jD+K2_^CE`Ei/", "8:<eYyr\"5", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      Attribute attribute0 = new Attribute("8:<eYyr\"5");
      classWriter0.addType("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-925), "C0`!Gf![.J)Gp6", "{re+aW]25P,mug", "Ljava/lang/Synthetic;", (Object) null);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter0.visitAttribute(attribute0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(246);
      String string0 = "Bca1uuL6h'wB7AI&";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Bca1uuL6h'wB7AI&", "Bca1uuL6h'wB7AI&", "Bca1uuL6h'wB7AI&", "Bca1uuL6h'wB7AI&");
      fieldWriter0.next = classWriter0.lastField;
      classWriter0.lastField.next = fieldWriter0;
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.addType("Bca1uuL6h'wB7AI&");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "pllI{rG,;34ejB4-", "pllI{rG,;34ejB4-", (String) null, (Object) null);
      Attribute attribute0 = new Attribute("mxSwF*I4Tb^2n4oO=U");
      FieldWriter fieldWriter2 = fieldWriter0.next;
      fieldWriter2.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.next.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(246);
      classWriter0.newNameType("3*F__G?d!wajS)", "3*F__G?d!wajS)");
      int int0 = ObjectStreamConstants.baseWireHandle;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "3*F__G?d!wajS)", "Ljava/lang/Synthetic;", "3*F__G?d!wajS)", (Object) null);
      Attribute attribute0 = new Attribute(")b");
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(131072);
      ByteVector byteVector1 = new ByteVector();
      byteVector1.putInt(8257536);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      fieldWriter0.visitAnnotation("Ru~J&ujV", false);
      System.setCurrentTimeMillis(813L);
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
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      classWriter0.version = (-730);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1977, "8:<eYyr\"5", "8:<eYyr\"5", "8:<eYyr\"5", "8:<eYyr\"5");
      fieldWriter0.visitEnd();
      Attribute attribute0 = new Attribute("8:<eYyr\"5");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "", "", "8:<eYyr\"5", "");
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, (-730), "8:<eYyr\"5", "RuntimeVisibleAnnotations", "8:<eYyr\"5", "8:<eYyr\"5");
      fieldWriter2.getSize();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      fieldWriter2.next = fieldWriter1;
      fieldWriter0.getSize();
      fieldWriter2.next.visitAttribute(attribute0);
      fieldWriter2.visitAnnotation("RuntimeVisibleAnnotations", true);
      fieldWriter2.visitEnd();
      fieldWriter0.getSize();
      fieldWriter2.next.visitEnd();
      System.setCurrentTimeMillis((-3021L));
      fieldWriter2.visitEnd();
      assertFalse(fieldWriter2.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-730));
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-4246), "", "", (String) null, "Deprecated");
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putUTF8("Deprecated");
      ByteVector byteVector2 = byteVector1.putByte((-2319));
      byteVector2.put12(1930, 1);
      fieldWriter0.put(byteVector1);
      ByteVector byteVector3 = new ByteVector();
      ByteVector byteVector4 = byteVector3.put11((-730), 65535);
      fieldWriter0.put(byteVector4);
      System.setCurrentTimeMillis((-1L));
      fieldWriter0.visitEnd();
  }
}
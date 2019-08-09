/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 16:50:41 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
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
      ClassWriter classWriter0 = new ClassWriter((-2335));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2335), "", "U */", "", (Object) null);
      classWriter0.version = 167;
      ByteVector byteVector0 = new ByteVector(7);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2335));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2335), "", "U */", "", (Object) null);
      classWriter0.version = 167;
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2392));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3915, "f>]iStHR}7", "fGtYz=*us,]", "", (Object) null);
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
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2335));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 19, "8Kbz&X|6w~:WL;MJgFX", "8Kbz&X|6w~:WL;MJgFX", "8Kbz&X|6w~:WL;MJgFX", "8Kbz&X|6w~:WL;MJgFX");
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
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2335));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "-)TKe1b", "UEl!9R^7kF8", "1q", "1q");
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
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2335));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-1944), "", (String) null, "", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2335));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "8Kbz&X|6w~:WL;MJgFX", "8Kbz&X|6w~:WL;MJgFX", (String) null, classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "h", "h", "", "h");
      ByteVector byteVector0 = classWriter0.pool;
      Attribute attribute0 = new Attribute("h");
      fieldWriter0.visitAttribute(attribute0);
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(207);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(49, "Deprecated", "Deprecated", "Deprecated", "Deprecated");
      fieldVisitor0.visitAnnotation("EGXV+M85uRXJw=d7", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(153, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 180, "#yTuIe-_K", "5nE()eH:fq?O*", "5nE()eH:fq?O*", (Object) null);
      fieldWriter0.visitAnnotation("Kg/=v=ZI}jTy@VI", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(207);
      classWriter0.version = 30;
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-75), "EGXV+M85uRXJw=d7", "EGXV+M85uRXJw=d7", (String) null, (Object) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(207);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-75), "EGXV+M85uRXJw=d7", "EGXV+M85uRXJw=d7", (String) null, (Object) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "h", "h", "", "h");
      Attribute attribute0 = new Attribute("h");
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
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-256), "", "8Kbz&X|6w~:WL;MJgFX", "", "8Kbz&X|6w~:WL;MJgFX");
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(207);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(49, "Deprecated", "Deprecated", "Deprecated", "Deprecated");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-75), "EGXV+M85uRXJw=d7", "EGXV+M85uRXJw=d7", (String) null, (Object) null);
      assertFalse(fieldWriter0.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "h", "h", "", "h");
      fieldWriter0.visitEnd();
  }
}
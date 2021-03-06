/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 04:00:54 GMT 2019
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
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1611));
      classWriter0.version = 85;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1611), "wtVo~$0#,)ojKK'", "wtVo~$0#,)ojKK'", "wtVo~$0#,)ojKK'", "wtVo~$0#,)ojKK'");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(116, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1611));
      classWriter0.index = (-1611);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1611), "wtVo~$0#,)ojKK'", "wtVo~$0#,)ojKK'", "wtVo~$0#,)ojKK'", "wtVo~$0#,)ojKK'");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(134, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1608));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1608), "SbV?IRPE#|R", "SbV?IRPE#|R", "SbV?IRPE#|R", "SbV?IRPE#|R");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "?B2Fo'sZm[up-EA8", "kM_(F*LlR7Cvy", (String) null, "byte");
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
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-916));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "ynuI", "ynuI", "ynuI", "ynuI");
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
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 242, "Nvt4\"p,+shMN>A", "Nvt4\"p,+shMN>A", "org.apache.commons.io.filefilter.NotFileFilter", "-@7AV8ZfWr*},KHdfEa");
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-747));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "wteVo~$0j#,)oj4KK'", "wteVo~$0j#,)oj4KK'", "wteVo~$0j#,)oj4KK'", "wteVo~$0j#,)oj4KK'");
      Attribute attribute0 = new Attribute("wteVo~$0j#,)oj4KK'");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(24);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-715));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "=9XSW\nFh]'kJVmD|", "=9XSW\nFh]'kJVmD|", "=9XSW\nFh]'kJVmD|", "=9XSW\nFh]'kJVmD|");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-580);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131065);
      classWriter0.index = 65535;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131065, "3Nrbtj.[5", "|qqx!KgWzH", (String) null, (Object) null);
      classWriter0.toByteArray();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 4, " M,f6p~", "", (String) null, "");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, (-714), "", "EnclosingMethod", "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131064);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131064, "wteVo~$0j#,)oj4KK'", "wteVo~$0j#,)oj4KK'", "wteVo~$0j#,)oj4KK'", "wteVo~$0j#,)oj4KK'");
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 69, "wteVo~$0j#,)oj4KK'", "wteVo~$0j#,)oj4KK'", "wteVo~$0j#,)oj4KK'", fieldWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.FieldWriter@8
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-779));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "wteVo~$0j#,)ojF4KK'", "wteVo~$0j#,)ojF4KK'", "wteVo~$0j#,)ojF4KK'", "wteVo~$0j#,)ojF4KK'");
      Attribute attribute0 = new Attribute("wteVo~$0j#,)ojF4KK'");
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
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1608));
      classWriter0.version = 47;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1608), "SbV?IRPE#|R", "SbV?IRPE#|R", "SbV?IRPE#|R", "SbV?IRPE#|R");
      classWriter0.version = 49;
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(112, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-740));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "=9XSWGF3hO'kJVmD|", "=9XSWGF3hO'kJVmD|", "=9XSWGF3hO'kJVmD|", "=9XSWGF3hO'kJVmD|");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-740));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "=9XSWGF3hO'kJVmD|", "=9XSWGF3hO'kJVmD|", "=9XSWGF3hO'kJVmD|", "=9XSWGF3hO'kJVmD|");
      fieldWriter0.visitAnnotation("=9XSWGF3hO'kJVmD|", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(139, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-711));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(124, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "wteVo~$0j#,)oj4KK'", "kM_(F*LlR7Cvy", (String) null, "byte");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-740));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "=9XSWGF3hO'kJVmD|", "=9XSWGF3hO'kJVmD|", "=9XSWGF3hO'kJVmD|", "=9XSWGF3hO'kJVmD|");
      Attribute attribute0 = new Attribute("=9XSWGF3hO'kJVmD|");
      fieldWriter0.visitAttribute(attribute0);
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
}

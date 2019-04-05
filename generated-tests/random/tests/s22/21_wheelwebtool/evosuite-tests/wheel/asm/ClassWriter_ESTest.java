/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 06:41:19 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.Item;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(26);
      classWriter0.visitOuterClass("", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(6, "org.apache.commons.io.filefilter.NotFileFilter", "", (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(66, (String) null, (String) null, "f%V8", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-194));
      classWriter0.visitInnerClass("@`H;*}m}", "The list of names must not be null", "", (-194));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212676);
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-419), "", "", "", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2798));
      // Undeclared exception!
      try { 
        classWriter0.visit((-2798), (-2798), (String) null, (String) null, (String) null, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2047));
      int int0 = classWriter0.newNameType("", "SourceDebugExtension");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-748));
      Item item0 = classWriter0.newMethodItem("Fj^)r],", "Fj^)r],", "InnerClasses", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-514));
      Item item0 = classWriter0.newLong(0L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2047));
      Item item0 = classWriter0.newLong(3);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(169);
      Item item0 = classWriter0.newInteger(169);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1305));
      Item item0 = classWriter0.newFloat(0.0F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(318);
      Item item0 = classWriter0.newFloat((-1417.2F));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2798));
      Item item0 = classWriter0.newFieldItem("C_TI)N.8V6=p\";", "!d'g_|9+v", "C_TI)N.8V6=p\";");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(85);
      Item item0 = classWriter0.newFieldItem("", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2047));
      Item item0 = classWriter0.newDouble(3282.5278773869445);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(318);
      // Undeclared exception!
      try { 
        classWriter0.newConst((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-534));
      Item item0 = classWriter0.newClassItem("");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2509));
      int int0 = classWriter0.newClass("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-534));
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("", "lx~");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: 
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-514));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.apache.commons.io.filefilter.WildcardFileFilter";
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(262144, "L", "G*smj4][u='&:Jg~", "", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(278);
      Item item0 = classWriter0.newFloat(278);
      // Undeclared exception!
      try { 
        classWriter0.visitField(278, "", "", "", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.Item@6
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      classWriter0.visit(32, 2, "{Ftq-2", "#pIN77WNOQ%9*^v|@^", "{Ftq-2", (String[]) null);
      classWriter0.invalidFrames = true;
      classWriter0.visitMethod(1, "", "", "&kH", (String[]) null);
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(348);
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem("TTXj^l/G}RU7", (String) null, "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212673);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.AnnotationWriter@8
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-194));
      // Undeclared exception!
      try { 
        classWriter0.newClassItem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212676);
      classWriter0.addUninitializedType("", 285212676);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(285212676, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 285212676
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("Ov65N#RMV", "Deprecated");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'Ov65N#RMV.class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      // Undeclared exception!
      try { 
        classWriter0.addUninitializedType((String) null, (-1703));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2798));
      classWriter0.threshold = (-2798);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("C_TI)N.8V6=p\";", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      int int0 = classWriter0.newNameType("", "");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(169);
      int int0 = classWriter0.newUTF8("yi!7");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      classWriter0.visitSource("", "");
      int int0 = classWriter0.newUTF8("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(101);
      String[] stringArray0 = new String[0];
      classWriter0.visit(Integer.MAX_VALUE, Integer.MAX_VALUE, "wheel.asm.Frame", "wheel.asm.Frame", "SourceDebugExtension", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      int int0 = classWriter0.newClass("Y/OH9!v9X[h/1r:");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      classWriter0.threshold = 18;
      classWriter0.newClassItem("!?%qh$ff<E");
      classWriter0.threshold = (-1087);
      int int0 = classWriter0.newField("-6&!;ck%}vzZb:y%l", "f%V8", "f%V8");
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-92));
      classWriter0.threshold = (-92);
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        classWriter0.visit((byte) (-1), (-92), "EnclosingMethod", "EnclosingMethod", "EnclosingMethod", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      String string0 = classWriter0.getCommonSuperClass("org.apache.commons.io.filefilter.NotFileFilter", "org.apache.commons.io.filefilter.NotFileFilter");
      assertEquals("org.apache.commons.io.filefilter.NotFileFilter", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(318);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addUninitializedType("1($,8}A?\"c%E", 16);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(26);
      classWriter0.addUninitializedType("", 26);
      int int0 = classWriter0.addUninitializedType("", 26);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2342));
      int int0 = classWriter0.addType("C.^U'#$");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("C.^U'#$");
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-748));
      int int0 = classWriter0.newMethod("java/lang/Object", "", "", false);
      assertEquals(5, int0);
      
      int int1 = classWriter0.newMethod("", "", "", false);
      assertEquals(7, int1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(169);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(3516, "rd]9G*J4-", "rd]9G*J4-", "rd]9G*J4-", "");
      FieldVisitor fieldVisitor1 = classWriter0.visitField(35, "", "", "!:", "");
      assertFalse(fieldVisitor1.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Item item0 = classWriter0.newDouble((-1.0));
      Item item1 = classWriter0.newDouble((-1.0));
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      Item item0 = classWriter0.newLong((-1L));
      Item item1 = classWriter0.newLong((-1));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(197);
      Item item0 = classWriter0.newFloat(197);
      Item item1 = classWriter0.newFloat(197);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newMethod("wheel.asm.Type", "", "ff9Vj6l8H42>b", true);
      Item item0 = classWriter0.newMethodItem("wheel.asm.Type", "", "ff9Vj6l8H42>b", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      Type type0 = Type.LONG_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4324));
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(169);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      // Undeclared exception!
      try { 
        classWriter0.newConst(bufferedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.BufferedInputStream@1cf027d4
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(454);
      Double double0 = Double.valueOf(0.0);
      int int0 = classWriter0.newConst(double0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(278);
      Long long0 = new Long((-1702));
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-1702), "6gFE2;n}Yciaf", "6gFE2;n}Yciaf", (String) null, long0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(473);
      Float float0 = new Float((double) 1);
      Item item0 = classWriter0.newConstItem(float0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      Boolean boolean0 = Boolean.valueOf("");
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1212));
      Boolean boolean0 = new Boolean(true);
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      Short short0 = new Short((short) (-170));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1099, "P:Ji@", "wheel.asm.Handler", ";uC;`)", short0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      Byte byte0 = new Byte((byte) (-2));
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-92));
      classWriter0.newConstItem(classWriter0.COMPUTE_MAXS);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(35, "EnclosingMethod", "EnclosingMethod", "EnclosingMethod", classWriter0.COMPUTE_MAXS);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      Attribute attribute0 = new Attribute("");
      classWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(85);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1197));
      classWriter0.visitInnerClass("", ".BVPH`lSJ,^UI", "@ADzFNgJ=ZlG@.r", (-3819));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(98, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1212));
      classWriter0.visitOuterClass("O=c7#g", "6S5,\u0001+ggc*A", "6S5,\u0001+ggc*A");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(169);
      classWriter0.visitField(3516, "rd]9G*J4-", "rd]9G*J4-", "rd]9G*J4-", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777221);
      classWriter0.visitInnerClass("6", (String) null, (String) null, 16777221);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      classWriter0.visitInnerClass((String) null, "", "Ppqeh", 24);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-514));
      classWriter0.visitInnerClass("org.apache.commons.io.filefilter.WildcardFileFilter", "G*smj4][u='&:Jg~", "org.apache.commons.io.filefilter.WildcardFileFilter", (-514));
      classWriter0.visitInnerClass("org.apache.commons.io.filefilter.WildcardFileFilter", "org.apache.commons.io.filefilter.WildcardFileFilter", "org.apache.commons.io.filefilter.WildcardFileFilter", (-514));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      classWriter0.visitAnnotation("wheel.asm.Edge", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      classWriter0.visitOuterClass("yp9Y", "", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-534));
      classWriter0.visitOuterClass("x7FzA#rX{w0A-wXOc", (String) null, "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      classWriter0.visitSource("!_}RcZ", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      classWriter0.visitSource("org.apache.commons.io.filefilter.DelegateFileFilter", "#pIN77WNOQ%9*^v|@^");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(146, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1343));
      classWriter0.visitSource((String) null, "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-92));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "EnclosingMethod";
      stringArray0[1] = "EnclosingMethod";
      stringArray0[2] = "EnclosingMethod";
      stringArray0[3] = "EnclosingMethod";
      stringArray0[4] = "";
      classWriter0.visit((byte) (-1), (-92), "EnclosingMethod", "EnclosingMethod", "EnclosingMethod", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3421));
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        classWriter0.visit((-3421), 170, "!\"H'yi</hs}pa", "!\"H'yi</hs}pa", (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      classWriter0.visit(32, 2, "{Ftq-2", "#pIN77WNOQ%9*^v|@^", "{Ftq-2", (String[]) null);
      classWriter0.invalidFrames = true;
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        classWriter0.visit((-2647), 66, "", (String) null, "", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      classWriter0.visitEnd();
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-514));
      int int0 = classWriter0.newMethod("L", "org.apache.commons.io.filefilter.WildcardFileFilter", "org.apache.commons.io.filefilter.WildcardFileFilter", false);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, 518);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-514));
      Character character0 = new Character('5');
      FieldVisitor fieldVisitor0 = classWriter0.visitField(754, "G*smj4][u='&:Jg~", "G*smj4][u='&:Jg~", "G", character0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2047));
      // Undeclared exception!
      try { 
        classWriter0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-194));
      int int0 = classWriter0.newField("@`H;*}m}", "", "");
      assertEquals(5, int0);
  }
}
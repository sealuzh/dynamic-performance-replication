/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:23:51 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;
import wheel.asm.Frame;
import wheel.asm.Item;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
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
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
      classReader0.accept((ClassVisitor) classWriter0, 39);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(classReader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassReader@1
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3618);
      classWriter0.visitEnd();
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(401);
      Double double0 = new Double(401);
      int int0 = classWriter0.newConst(double0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(76);
      int int0 = classWriter0.newConst("org.apache.commons.io.filefilter.EmptyFileFilter");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.newConst(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@5e484c6a
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = classWriter0.newMethod("", "", "", true);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3618);
      Item item0 = classWriter0.newMethodItem("", "", "", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(971);
      int int0 = classWriter0.addUninitializedType("wheel.asm.Classriter", 971);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      // Undeclared exception!
      try { 
        classWriter0.visitField(8, "4)", "4)", "4)", mockJapaneseDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate@54acfc5e
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.EmptyFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 703);
      String string0 = File.pathSeparator;
      assertEquals(":", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-42));
      classWriter0.newInteger(3512);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-42), (-42));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3618);
      classWriter0.index = 3618;
      Item item0 = classWriter0.newMethodItem("DGl$m)m% @t", "DGl$m)m% @t", "DGl$m)m% @t", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitAnnotation("eE", true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(44);
      Boolean boolean0 = Boolean.valueOf("ct/Al1=X.);");
      classWriter0.newConst(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(51);
      int int0 = Frame.BOOLEAN;
      Boolean boolean0 = new Boolean(true);
      classWriter0.newConstItem(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      Integer integer0 = new Integer(17);
      classWriter0.newConst(integer0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3537);
      classWriter0.getCommonSuperClass("wheel.asm.ClassWriter", "wheel.asm.ClassWriter");
      Short short0 = new Short((short)988);
      classWriter0.newConst(short0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(48);
      classWriter0.visitOuterClass("", "", "");
      classWriter0.toByteArray();
      classWriter0.newLong(48);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      String[] stringArray0 = new String[0];
      classWriter0.visit(5, 5, "JmPq)X('.\f4AG>7=", "SourceFile", "SourceFile", stringArray0);
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(37);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      classWriter0.visit(37, (-62), "", "", "", stringArray0);
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit((-788), 4143, "", "", "", stringArray0);
      classWriter0.visitAnnotation("", false);
      classWriter0.newFloat((-718.68805F));
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(960);
      Float float0 = new Float(247.12588739440338);
      classWriter0.newConst(float0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      classWriter0.newUTF8("s.Xm`dT$ut+$[W");
      classWriter0.addType("s.Xm`dT$ut+$[W");
      classWriter0.newConstItem("s.Xm`dT$ut+$[W");
      classWriter0.newConstItem("s.Xm`dT$ut+$[W");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(51);
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, 51);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(51, 51);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3144);
      Byte byte0 = new Byte((byte)55);
      classWriter0.newConst(byte0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      Type type0 = Type.FLOAT_TYPE;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "java/lang/Object", "java/lang/Object", "java/lang/Object", type0);
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitInnerClass((String) null, (String) null, "Ljava/lang/Synthetic;", 5);
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      classWriter0.getCommonSuperClass("wheel.asm.ClassWriter", "wheel.asm.ClassWriter");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(76);
      classWriter0.visitSource("EnclosingMethod", "EnclosingMethod");
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "7cPE`RJ&p";
      stringArray0[1] = "7cPE`RJ&p";
      stringArray0[2] = null;
      stringArray0[3] = null;
      stringArray0[4] = "7cPE`RJ&p";
      stringArray0[5] = "7cPE`RJ&p";
      stringArray0[6] = null;
      // Undeclared exception!
      try { 
        classWriter0.visit(5, 5, "7cPE`RJ&p", "7cPE`RJ&p", (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      classWriter0.visit(24, 1, ";.MW5C/o63qFus2D", "", "0'@4y4DEN?+j,&Rh", (String[]) null);
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(316);
      classWriter0.visitEnd();
      classWriter0.visitOuterClass("org.apache.commons.io.IOCase", (String) null, "org.apache.commons.io.filefilter.DirectoryFileFilter");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitInnerClass("The wildcard list must not be null", ":5&?F4TrIi8cuL2", ":5&?F4TrIi8cuL2", 0);
      classWriter0.newDouble(2);
      classWriter0.newMethodItem(":5&?F4TrIi8cuL2", ":5&?F4TrIi8cuL2", ":5&?F4TrIi8cuL2", true);
      classWriter0.visitInnerClass(":5&?F4TrIi8cuL2", "The wildcard list must not be null", ":5&?F4TrIi8cuL2", 0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(51);
      classWriter0.toByteArray();
      Long long0 = new Long(51);
      classWriter0.newConstItem(long0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(51, 51);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(76);
      classWriter0.visitSource((String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-42));
      classWriter0.visitAnnotation("The list of prefixes must not be null", true);
      classWriter0.toByteArray();
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      classWriter0.newClassItem("");
      classWriter0.visitOuterClass("", "", (String) null);
      classWriter0.newLong(9);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1590);
      classWriter0.visitAnnotation("org.apache.commons.io.FilenameUtils", false);
      classWriter0.toByteArray();
      classWriter0.thisName = "org.apache.commons.io.FilenameUtils";
      classWriter0.newFieldItem("org.apache.commons.io.FilenameUtils", "=l", "_s(h");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Character character0 = new Character('\u0084');
      Character.isBmpCodePoint(0);
      classWriter0.newConstItem(character0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      classWriter0.toByteArray();
      classWriter0.newLong(24);
      classWriter0.newLong(24);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.addUninitializedType("@w.=.`I", 5);
      classWriter0.addUninitializedType("@w.=.`I", 1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(971);
      classWriter0.addType("wheel.asm.ClassWriter");
      classWriter0.addType("wheel.asm.ClassWriter");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(76);
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51966
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(76);
      classWriter0.newMethodItem("'J(jq", "", "'J(jq", true);
      classWriter0.newNameType("", "'J(jq");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      Type type0 = Type.getObjectType("7?y*a^k-#MW%n");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "7?y*a^k-#MW%n", "java/lang/Object", "wheel5asm.ClassWriter", type0);
      FieldWriter fieldWriter1 = fieldWriter0.next;
      ClassWriter classWriter1 = new ClassWriter(8);
      // Undeclared exception!
      try { 
        classWriter1.newConstItem((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newDouble(2);
      classWriter0.newFloat(0);
      classWriter0.newFloat(0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1732);
      classWriter0.newField("The list of prefixes must not be null", "The list of prefixes must not be null", "The list of prefixes must not be null");
      classWriter0.newFieldItem("The list of prefixes must not be null", "The list of prefixes must not be null", "The list of prefixes must not be null");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3606);
      classWriter0.addUninitializedType("SourceFile", 285212681);
      classWriter0.addUninitializedType("SourceFile", 285212681);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(76);
      classWriter0.addUninitializedType("float", 76);
      classWriter0.visitMethod(76, "?YKe5R qsh7X4H", "LocalVariableTable", "?YKe5R qsh7X4H", (String[]) null);
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      classWriter0.newDouble(1.0);
      classWriter0.newDouble(1.0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3558);
      classWriter0.getCommonSuperClass("wheel.asm.ClassWriter", "org.apache.commons.io.IOCase");
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3618);
      classWriter0.version = 3618;
      classWriter0.newMethodItem("DGl$m)m% @t", "DGl$m)m% @t", "DGl$m)m% @t", true);
      classWriter0.newMethodItem("DGl$m)m% @t", "DGl$m)m% @t", "DGl$m)m% @t", true);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(37);
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
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(76);
      classWriter0.getCommonSuperClass("wheel.asm.Label", "java/lang/Object");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-985));
      Item[] itemArray0 = new Item[1];
      Item item0 = classWriter0.newLong((-985));
      itemArray0[0] = item0;
      classWriter0.typeTable = itemArray0;
      classWriter0.newUTF8("*^");
      classWriter0.addUninitializedType("<x&=(P'm3)f8o%HjY", 251);
      // Undeclared exception!
      try { 
        classWriter0.newField((String) null, (String) null, "The wildcard array must not be null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.getCommonSuperClass("org.apache.commons.io.filefilter.EmptyFileFilter", "org.apache.commons.io.IOCase");
  }
}
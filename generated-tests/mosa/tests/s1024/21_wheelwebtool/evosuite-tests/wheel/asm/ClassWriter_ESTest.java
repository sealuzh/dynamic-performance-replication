/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 15:02:40 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;
import wheel.asm.Frame;
import wheel.asm.Item;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275707));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.newConst(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@47ce302c
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      int int0 = classWriter0.addUninitializedType("{", 2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassWriter classWriter0 = new ClassWriter(4);
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      classWriter0.visitOuterClass("3>Z5W$/Rw#>QVCF2(T", "3>Z5W$/Rw#>QVCF2(T", "3>Z5W$/Rw#>QVCF2(T");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitEnd();
      classWriter0.visitOuterClass("Label offset position has not been resolved yet", "Label offset position has not been resolved yet", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      Double double0 = new Double(2);
      Item item0 = classWriter0.newConstItem(double0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, 170);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3023));
      classWriter0.threshold = (-3023);
      int int0 = classWriter0.newField("wheel.asm.ClassWriter", "wheel.asm.ClassWriter", "wheel.asm.ClassWriter");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4106);
      classWriter0.index = 3162;
      int int0 = classWriter0.newField(",2T", ",2T", ",2T");
      assertEquals(3165, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1307);
      classWriter0.newFloat(1307);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(844);
      classWriter0.visitAnnotation("org.apache.commons.io.IOCase", true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2466);
      classWriter0.visit(1, 1, "", (String) null, "Jg*5|y|fd<o ", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275755));
      classWriter0.newMethod("=B,m8", "=B,m8", "=B,m8", true);
      String[] stringArray0 = new String[0];
      classWriter0.visit(752, (-889275755), "=B,m8", "=B,m8", "=B,m8", stringArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3028));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.apache.commons.io.filefilter.CanReadFileFilter";
      stringArray0[1] = "org.apache.commons.io.filefilter.CanReadFileFilter";
      classWriter0.visit((-3028), 2083, "org.apache.commons.io.filefilter.CanReadFileFilter", "org.apache.commons.io.filefilter.CanReadFileFilter", "org.apache.commons.io.filefilter.CanReadFileFilter", stringArray0);
      classWriter0.newField("&)URH", "&)URH", "&)URH");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitField(20, "", "", "j5'H>(I", "j5'H>(I");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      classWriter0.addType("");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-889275714), (-889275714));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      classWriter0.visitInnerClass("^m", "^m", (String) null, (-889275714));
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(45);
      classWriter0.visitSource("JSR/RET are not supported with computeFrames option", "JSR/RET are not supported with computeFrames option");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      classWriter0.newLong((-889275714));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      Integer integer0 = new Integer((-889275714));
      classWriter0.newConstItem(integer0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-405));
      classWriter0.visitAnnotation("The strings must not be null", false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777216);
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, (-1643));
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2413));
      classWriter0.visitSource("EnclosingMethod", "EnclosingMethod");
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-453));
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod((-453), "\"", "\"", "d[@;wGJm", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      classWriter0.visitSource((String) null, (String) null);
      classWriter0.newInteger(33);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      Byte byte0 = new Byte((byte)90);
      classWriter0.newConstItem(byte0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3091));
      String[] stringArray0 = new String[0];
      classWriter0.visit((-3091), (-3091), "W~]", "*GUbq!", (String) null, stringArray0);
      classWriter0.newMethod("v<A1OzSJ9cTuf#xOuw{", "v<A1OzSJ9cTuf#xOuw{", "v<A1OzSJ9cTuf#xOuw{", true);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2804));
      Double double0 = new Double((-2804));
      classWriter0.newConst(double0);
      classWriter0.newDouble((-2804));
      System.setCurrentTimeMillis(1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      classWriter0.getCommonSuperClass("org.apache.commons.io.IOCase", "org.apache.commons.io.IOCase");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      Character character0 = Character.valueOf('8');
      classWriter0.newConstItem(character0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3023));
      classWriter0.visitAnnotation("", true);
      classWriter0.visitOuterClass("", "", "");
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1850));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
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
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3081));
      classWriter0.visitInnerClass("", "", "", 29);
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, 4);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-453));
      Short short0 = new Short((short)26);
      classWriter0.newConstItem(short0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1685);
      Float float0 = new Float((float) 2);
      classWriter0.newConstItem(float0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3023));
      classWriter0.visit((-3023), 384, "", "", "", (String[]) null);
      classWriter0.newClassItem("Class not found");
      classWriter0.toByteArray();
      classWriter0.visitOuterClass("Gd3#I]3*V+pET[|d", "Gd3#I]3*V+pET[|d", "Class not found");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3023));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "PT";
      stringArray0[1] = "PT";
      stringArray0[2] = "D`S`d]6@J%7P";
      stringArray0[3] = "PT";
      classWriter0.visit((-3023), 14, "D`S`d]6@J%7P", "PT", "org.apache.commons.io.filefilter.EmptyFileFilter", stringArray0);
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3023));
      classWriter0.visitOuterClass("\\>GhO=bpqW1qn^f", "\\>GhO=bpqW1qn^f", "\\>GhO=bpqW1qn^f");
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1863));
      classWriter0.newFloat((-1863));
      classWriter0.newConstItem("ConstantValue");
      classWriter0.newFloat((-1863));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      classWriter0.visitOuterClass("", (String) null, "");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      Long long0 = new Long(2);
      classWriter0.newConstItem(long0);
      classWriter0.newFloat(20);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3081));
      classWriter0.newField("Hfrf%s0O1-?W", "Hfrf%s0O1-?W", "Hfrf%s0O1-?W");
      classWriter0.visitOuterClass("Hfrf%s0O1-?W", "Hfrf%s0O1-?W", "Hfrf%s0O1-?W");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      Boolean boolean0 = new Boolean(true);
      classWriter0.newConstItem(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275692));
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.newConstItem(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      Boolean boolean0 = new Boolean("");
      classWriter0.visitField((-889275714), "", "", (String) null, (Object) null);
      classWriter0.toByteArray();
      classWriter0.newFloat((-889275714));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      classWriter0.addUninitializedType("f?kw_.}<C} w&}=95yd", 1);
      classWriter0.addType("f?kw_.}<C} w&}=95yd");
      classWriter0.addUninitializedType("f?kw_.}<C} w&}=95yd", 1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      classWriter0.newInteger((-889275714));
      classWriter0.newInteger((-889275714));
      classWriter0.newFloat((-889275714));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(368);
      classWriter0.newLong(368);
      classWriter0.newLong(368);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-453));
      classWriter0.getCommonSuperClass("wheel.asm.ClassWriter", "org.apache.commons.io.IOCase");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      classWriter0.addUninitializedType("f?kw_.}<C} w&}=95yd", 20);
      classWriter0.addType("f?kw_.}<C} w&}=95yd");
      classWriter0.addUninitializedType("f?kw_.}<C} w&}=95yd", 1);
      classWriter0.addType("f?kw_.}<C} w&}=95yd");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(169);
      Attribute attribute0 = new Attribute("enSj@fyA1\"TU");
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
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-453));
      classWriter0.threshold = (-453);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      classWriter0.newConstItem("`");
      classWriter0.newConstItem("`");
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.invalidFrames = true;
      classWriter0.newMethodItem("", "", "Ftw#xs>\"1S?HrFpk&", true);
      classWriter0.visitInnerClass("^m", "^m", "^m", 2);
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
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      classWriter0.addUninitializedType("Hhd_", 16);
      Short short0 = new Short((short)4443);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 32, "@6`huXxWUZf-JAUW9", "Deprecated", "ot $Rgfw", "@6`huXxWUZf-JAUW9");
      int int0 = Character.MIN_CODE_POINT;
      classWriter0.addType("ot $Rgfw");
      Item[] itemArray0 = new Item[3];
      ClassWriter classWriter1 = new ClassWriter(16);
      Item item0 = classWriter1.newLong(1);
      itemArray0[0] = item0;
      Item item1 = classWriter0.key3;
      itemArray0[1] = item1;
      Item item2 = classWriter0.newInteger((-3220));
      itemArray0[2] = item2;
      classWriter0.typeTable = itemArray0;
      fieldWriter0.visitAnnotation("yW;}LQalyp#", false);
      classWriter0.newMethod("", "!xfi,O}", "Deprecated", false);
      int int1 = Frame.ARRAY_OF;
      classWriter0.version = 268435456;
      classWriter1.visitOuterClass("Deprecated", "pw$q10jc3yvR", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      item1.strVal2 = "SourceFile";
      classWriter0.addUninitializedType("pw$q10jc3yvR", 32);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3028));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "The filters must not be null";
      stringArray0[2] = "mqj' >#l06h~";
      stringArray0[3] = "";
      stringArray0[4] = "";
      classWriter0.visit((-3028), (-3028), "", "", "", stringArray0);
      classWriter0.newClassItem("The filters must not be null");
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ClassWriter classWriter0 = new ClassWriter((-1850));
      String[] stringArray0 = new String[8];
      stringArray0[0] = "l]lN7~e*+-P='VvFo";
      stringArray0[1] = "rn?[z\b\u0005?Dfmn>=#3";
      stringArray0[2] = "l]lN7~e*+-P='VvFo";
      stringArray0[3] = "rn?[z\b\u0005?Dfmn>=#3";
      stringArray0[4] = "rn?[z\b\u0005?Dfmn>=#3";
      stringArray0[5] = "l]lN7~e*+-P='VvFo";
      stringArray0[6] = "rn?[z\b\u0005?Dfmn>=#3";
      stringArray0[7] = "rn?[z\b\u0005?Dfmn>=#3";
      classWriter0.visit(37, (-1850), "l]lN7~e*+-P='VvFo", "rn?[z\b\u0005?Dfmn>=#3", "rn?[z\b\u0005?Dfmn>=#3", stringArray0);
      classWriter0.toByteArray();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2576);
      classWriter0.getCommonSuperClass("org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.IOCase");
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3034));
      classWriter0.getCommonSuperClass("wheel.asm.ClassWriter", "java/lang/Object");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3920);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "U4";
      stringArray0[1] = "U4";
      stringArray0[2] = "U4";
      classWriter0.visitMethod((-724), "U4", "", "", stringArray0);
      classWriter0.newNameType(",", "U4");
      classWriter0.toByteArray();
      classWriter0.newMethodItem("U4", "U4", ",", false);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(62);
      classWriter0.newField("", "", "");
      classWriter0.newField("", "", "");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassWriter classWriter0 = new ClassWriter(4);
      Class<Byte> class0 = Byte.class;
      Type type1 = Type.getType(class0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)6;
      byteArray0[1] = (byte)6;
      byteArray0[2] = (byte)6;
      byteArray0[3] = (byte)6;
      byteArray0[4] = (byte)6;
      Type.getObjectType("JSR/RET are not supported with computeFrames option");
      byteArray0[5] = (byte)19;
      byteArray0[6] = (byte)6;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      classWriter0.newConstItem(type1);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-193));
      classWriter0.newMethod("=Mg$", "=Mg$", "=Mg$", true);
      classWriter0.newMethod("=Mg$", "=Mg$", "=Mg$", true);
      Attribute attribute0 = new Attribute("=Mg$");
      classWriter0.visitAttribute(attribute0);
  }
}
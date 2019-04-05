/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 22:55:26 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassAdapter;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;
import wheel.asm.Item;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.threshold = 10;
      classWriter0.newClassItem("++Tb ni]2qa");
      classWriter0.visitOuterClass("d#[,T", "d#[,T", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      classWriter0.visit((byte)73, (-1025), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "GVpH", (String[]) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(247);
      classWriter0.visitEnd();
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      classWriter0.visitOuterClass("", "", "VC6`]:O?Q]kAM");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      classWriter0.visitInnerClass("", "Synthetic", "SourceDebugExtension", 11);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(23, "", "", "", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(0, "", "4el$47iL^Bh}IJ5*o", "", "");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        classWriter0.visit((-779), 567, (String) null, "", "X$Bw&L#M`c]n", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(510);
      int int0 = classWriter0.newUTF8("|!Dns4oDph~]*b:e");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      int int0 = classWriter0.newUTF8("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777219);
      int int0 = classWriter0.newNameType("@E9&RS1G>Ua:(", "");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3566);
      Item item0 = classWriter0.newMethodItem("R&BnA;^OH=T[G(O", "R&BnA;^OH=T[G(O", "Fwf;n!Y4/__]Y!jM:x", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newMethodItem(" E@&8", "", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      int int0 = classWriter0.newMethod("X/=R^.{X\"Z", "", "]", false);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      int int0 = classWriter0.newMethod("", "r~FL", "", true);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      Item item0 = classWriter0.newLong(15);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777219);
      Item item0 = classWriter0.newLong((-2390L));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newInteger(0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 612);
      Item item0 = classWriter0.newInteger(17);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2022);
      Item item0 = classWriter0.newInteger((-1621));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3566);
      Item item0 = classWriter0.newFloat((-3163.923F));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777219);
      Item item0 = classWriter0.newFieldItem("w (`j%ak1y]R&|", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      Item item0 = classWriter0.newFieldItem("", "Signature", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2000));
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      Item item0 = classWriter0.newDouble(10);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      Item item0 = classWriter0.newDouble((-4454.7433347));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      int int0 = classWriter0.newClass("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-1871), (-1871));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-177), 33);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      int int0 = classWriter0.addUninitializedType("", 127);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1206);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777219);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "yWO1+";
      stringArray0[3] = "";
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(46, "", "", "", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
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
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2000));
      // Undeclared exception!
      try { 
        classWriter0.newUTF8((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1383);
      // Undeclared exception!
      try { 
        classWriter0.newNameType("org.apache.commons.io.filefilter.NotFileFilter", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      // Undeclared exception!
      try { 
        classWriter0.newField((String) null, "RuntimeVisibleAnnotations", "wheel.asm.ClassWriter");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      // Undeclared exception!
      try { 
        classWriter0.newClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1262);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("kN_rHh", "h-H=Ujp.Sr\u0007S(V");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'kN_rHh.class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(247);
      int int0 = classWriter0.newNameType("", "BYh[i.");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777219);
      int int0 = classWriter0.newClass("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1197));
      String string0 = classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(13, 13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1460);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addUninitializedType("w):D(pK-\"0u@u3w", 1328);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = classWriter0.addUninitializedType("EnclosingMethod", 0);
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("EnclosingMethod", 0);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.addType("The FileFilter must not be null");
      int int0 = classWriter0.addType("The FileFilter must not be null");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2022);
      classWriter0.newConst("HCMF");
      int int0 = classWriter0.newConst("HCMF");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      Item item0 = classWriter0.newFloat(6);
      Item item1 = classWriter0.newFloat(6);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      Item item0 = classWriter0.newMethodItem("", "", "", false);
      Item item1 = classWriter0.newMethodItem("", "", "", false);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777219);
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 0, "EnclosingMethod", "EnclosingMethod", "EnclosingMethod", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1206);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1206, "", "", "RuntimeVisibleParameterAnnotations", "");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      Double double0 = new Double((-929.52758003));
      Item item0 = classWriter0.newConstItem(double0);
      Item item1 = classWriter0.newConstItem(double0);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Float float0 = new Float((float) 0);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(46, "4el$47iL^Bh}IJ5*o", "", "", float0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4320);
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.newConst(boolean0);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1807);
      Boolean boolean0 = Boolean.TRUE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1131);
      Short short0 = new Short((short)40);
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2022);
      Character character0 = new Character(' ');
      FieldVisitor fieldVisitor0 = classWriter0.visitField(4096, "float", "HCMF", "float", character0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2000));
      Byte byte0 = new Byte((byte)90);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(47);
      Item item0 = classWriter0.newConstItem(classWriter0.COMPUTE_MAXS);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(36);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "JF/';";
      stringArray0[1] = "JF/';";
      stringArray0[2] = "JF/';";
      stringArray0[3] = "JF/';";
      stringArray0[4] = "JF/';";
      stringArray0[5] = "JF/';";
      stringArray0[6] = "JF/';";
      stringArray0[7] = "JF/';";
      classWriter0.visit(36, 36, "JF/';", "JF/';", "JF/';", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
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
      ClassWriter classWriter0 = new ClassWriter(4);
      classWriter0.visitAnnotation("lM?7{a7RjQf,fQ!*maj", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      classWriter0.visitInnerClass("Kr0Yhd$QF9ynFZk", "Z", "", 24);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.visitSource("GVpH", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(301, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.visit((byte)73, (-1025), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "GVpH", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(299, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "R|[K^s/'53'jV*O";
      stringArray0[1] = "R|[K^s/'53'jV*O";
      stringArray0[2] = "Signature";
      classWriter0.visitMethod(24, "R|[K^s/'53'jV*O", "R|[K^s/'53'jV*O", "Signature", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      Type type0 = Type.BOOLEAN_TYPE;
      classWriter0.visitField(24, "", "", "", type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      classWriter0.visitInnerClass("1 a1=5_piUwo", "", (String) null, 23);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.visitInnerClass((String) null, (String) null, "", 20);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      classWriter0.visitInnerClass("LJ[B()|,QYmB[#J_\"", "", "R|[K^s/'53'jV*O", 42);
      classWriter0.visitInnerClass((String) null, "Signature", "r9px)z", 2165);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(36);
      classWriter0.visitAnnotation("JF/';", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1476);
      classWriter0.visitOuterClass("[]", "[]", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.visitOuterClass("d#[,T", "d#[,T", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(291, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitOuterClass(" E@&8", (String) null, "0f,_0M4b,QQR8d$=");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1206);
      classWriter0.visitSource("", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 612);
      classWriter0.visit(612, (-1640), "", "org.apache.commons.io.filefilter.AbstractFileFilter", "", (String[]) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2366));
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        classWriter0.visit((-2366), (-2366), "n0R%?", "n0R%?", (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      Long long0 = new Long(2);
      classWriter0.newConst(long0);
      int int0 = classWriter0.newConst(long0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      ClassWriter classWriter0 = new ClassWriter(510);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[4];
      classReader0.accept((ClassVisitor) classAdapter0, attributeArray0, 2);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 612);
      int int0 = classWriter0.newField("org.apache.commons.io.filefilter.AbstractFileFilter", "org.apache.commons.io.filefilter.AbstractFileFilter", "org.apache.commons.io.filefilter.AbstractFileFilter");
      assertEquals(46, int0);
  }
}

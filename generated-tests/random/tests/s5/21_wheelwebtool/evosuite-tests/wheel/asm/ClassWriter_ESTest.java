/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 14:00:06 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.Item;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 16);
      classWriter0.visitEnd();
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33554432);
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(40, "", "", "gyS` n", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1185, "", "d]", (String) null, "");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(45);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(45, "", "", "", "");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1017));
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-1017), "", "/GA", "InnerClasses", "");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      int int0 = classWriter0.newNameType("", "8-Jo<TGmLj");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem("p~iusq?UiRu|", "]hu~d@K0-T:", (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1255);
      Item item0 = classWriter0.newMethodItem("9.X-5%,ci%M8\u0002<", "=@*{F&XO=oBGDD", "9.X-5%,ci%M8\u0002<", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(45);
      Item item0 = classWriter0.newMethodItem("", "", "", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 16);
      Item item0 = classWriter0.newLong(0L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 16);
      Item item0 = classWriter0.newLong(2);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1255);
      Item item0 = classWriter0.newInteger(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(45);
      Item item0 = classWriter0.newFloat(0.0F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1017));
      Item item0 = classWriter0.newFloat(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1233);
      Item item0 = classWriter0.newFieldItem("d1JnC2}/#T=~$[@qpT", "d1JnC2}/#T=~$[@qpT", "sh1')Ox?<qp|'i|");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 16);
      Item item0 = classWriter0.newFieldItem("", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1206));
      int int0 = classWriter0.newField("java/lang/Class", "", "");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      int int0 = classWriter0.newField("", "X_|:Fm& E#[IBw7M55", "");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1233);
      Item item0 = classWriter0.newDouble(6);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(167);
      Item item0 = classWriter0.newDouble((-1531.7985285617));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1455));
      Item item0 = classWriter0.newClassItem("SourceFile");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 16);
      Item item0 = classWriter0.newClassItem("");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1255);
      int int0 = classWriter0.newClass("java/lang/Class");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3422));
      int int0 = classWriter0.newClass("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(6, (-1211));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2331);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-5182), 2331);
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
      ClassWriter classWriter0 = new ClassWriter(45);
      int int0 = classWriter0.addUninitializedType("", (-4075));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1255);
      int int0 = classWriter0.addType("java/lang/Class");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1422);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1455));
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(2206, "SourceFile", (String) null, "SourceFile", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      // Undeclared exception!
      try { 
        classWriter0.visitAnnotation((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
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
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1017));
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem((String) null, "/GA", "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1461));
      // Undeclared exception!
      try { 
        classWriter0.newMethod((String) null, "", "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(45);
      // Undeclared exception!
      try { 
        classWriter0.newField((String) null, "Jo'0NSx@4QXvdu(~", "U");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2495);
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
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4458);
      classWriter0.addUninitializedType(":?jy9DN", 131072);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(2878, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2878
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("wheel.asm.Frame", "SourceDebugExtension");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'SourceDebugExtension.class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      // Undeclared exception!
      try { 
        classWriter0.addType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, 20);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.newNameType("d]", "c N8w&");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1017));
      int int0 = classWriter0.newUTF8("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3422));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "-> [^}r-yPO";
      stringArray0[2] = "VPyem0|iovj)o%=";
      stringArray0[3] = "VPyem0|iovj)o%=";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "VPyem0|iovj)o%=";
      stringArray0[8] = "-> [^}r-yPO";
      classWriter0.visit((byte)25, 7, "VPyem0|iovj)o%=", "", "-> [^}r-yPO", stringArray0);
      int int0 = classWriter0.newUTF8("-> [^}r-yPO");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      String string0 = classWriter0.getCommonSuperClass("org.apache.commons.io.filefilter.CanWriteFileFilter", "org.apache.commons.io.filefilter.CanWriteFileFilter");
      assertEquals("org.apache.commons.io.filefilter.CanWriteFileFilter", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 16);
      String string0 = classWriter0.getCommonSuperClass("org.apache.commons.io.filefilter.DirectoryFileFilter", "wheel.asm.Attribute");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1301));
      Item item0 = classWriter0.newLong((-1301));
      Item item1 = classWriter0.newLong((-1301));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1249));
      Float float0 = new Float((-1.0));
      classWriter0.newConst(float0);
      int int0 = classWriter0.newConst(float0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1367);
      int int0 = classWriter0.newMethod("RuntimeInvisibleAnnotations", "kQo(3_=FdQH})", "wheel.asm.Attribute", true);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      Type type0 = Type.BOOLEAN_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1233);
      Class<Boolean> class0 = Boolean.class;
      Type type0 = Type.getType(class0);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(48, "d1JnC2}/#T=~$[@qpT", "sh1')Ox?<qp|'i|", "d1JnC2}/#T=~$[@qpT", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
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
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      Long long0 = new Long(1789);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(0, "", "rW)Q)^X", "pNGi8)Ft?rc,}<G", long0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      Float float0 = new Float((double) 6);
      Item item0 = classWriter0.newConstItem(float0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33554432);
      Boolean boolean0 = new Boolean(true);
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33554432);
      Boolean boolean0 = new Boolean(false);
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      Short short0 = new Short((short) (-1940));
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Character character0 = Character.valueOf('f');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3422));
      Byte byte0 = new Byte((byte)25);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1422);
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
      ClassWriter classWriter0 = new ClassWriter(33);
      Attribute attribute0 = new Attribute("]qB}oac!eP_dL0,z\"D2");
      byte[] byteArray0 = new byte[1];
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(53, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1461));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1206));
      classWriter0.visitInnerClass("s?uQifZ7}Fw HZ61r", "Gpnl&ps>n_(B0']5Y", "s?uQifZ7}Fw HZ61r", 2886);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(878);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "=5I57&PA=+Iiq+K";
      stringArray0[2] = "";
      classWriter0.visit(3459, (-1598), "=5I57&PA=+Iiq+K", "=5I57&PA=+Iiq+K", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(128);
      classWriter0.visitOuterClass("", "K\"}_\"U/a`YMa$ky", "K\"}_\"U/a`YMa$ky");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1502);
      classWriter0.visitSource("a\"8]`U", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "mzS8){?H';R06/#;K";
      stringArray0[1] = "r.1)VwsI?";
      stringArray0[2] = "Ads'*20:WmWuK(1Di";
      stringArray0[3] = "Ads'*20:WmWuK(1Di";
      classWriter0.visitMethod(12, "mzS8){?H';R06/#;K", "r.1)VwsI?", "Ads'*20:WmWuK(1Di", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(142, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3422));
      classWriter0.visitField(30, "-> [^}r-yPO", "", "9[A5H36k#0r-s_/", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(115, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(909);
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, (-920));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.visitInnerClass("Ljava/lang/Synthetic;", "j9Lmfw%d", "j9Lmfw%d", 41);
      classWriter0.visitInnerClass("k(&E{k$9!uj3", ":oSG&kDO7o[B-Ub>", "", 1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1206));
      classWriter0.visitAnnotation(".s.IFJDCS", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2331);
      classWriter0.visitOuterClass("T:_`I6eCtjLA3", "T:_`I6eCtjLA3", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      classWriter0.visitOuterClass("=dp-leHuk\"a2j(_@Y0-", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3520));
      classWriter0.visitOuterClass("RuntimeVisibleAnnotations", (String) null, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      classWriter0.visitSource("=Lh<\"~bm$2K", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33554432);
      classWriter0.visitSource("q!=+f=F *4{cN FQ", "@Grf` ag67<OSzw");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitSource((String) null, "RKB+VrHRKLT.dH)bk!");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1367);
      String[] stringArray0 = new String[0];
      classWriter0.visit((-194), 1367, "krk8", (String) null, "wheel.asm.Attribute", stringArray0);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      classWriter0.visit(1789, 251658240, "", "p~iusq?UiRu|", "", (String[]) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33554432);
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        classWriter0.visit((-3391), 4866, "q!=+f=F *4{cN FQ", (String) null, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.newConst(classWriter0.COMPUTE_MAXS);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassWriter");
      ClassWriter classWriter0 = new ClassWriter((-605));
      classReader0.accept((ClassVisitor) classWriter0, 74);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 16);
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
}

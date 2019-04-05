/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 09:31:37 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;
import wheel.asm.Item;
import wheel.asm.MethodVisitor;
import wheel.asm.MethodWriter;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(132);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "SourceDebugExtension";
      stringArray0[2] = " 0Zk|/bti$t?pE";
      stringArray0[3] = "/s";
      stringArray0[4] = "";
      stringArray0[5] = ".s.IFJDCS";
      stringArray0[6] = "EnclosingMethod";
      stringArray0[7] = "";
      stringArray0[8] = "MR00f*496UU;(Z";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(76, "", "aT2ls~EMX0&", "", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-69));
      classWriter0.index = (-2354);
      int int0 = classWriter0.newMethod("", "wY$zcJ]|OVb", "", true);
      assertEquals((-2350), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(151);
      classWriter0.visitSource("", "org.apache.commons.io.filefilter.WildcardFileFilter");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.visitInnerClass("java/lang/Object", "", "java/lang/Object", (-1));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      Attribute attribute0 = new Attribute(" ");
      classWriter0.visitAttribute(attribute0);
      assertFalse(attribute0.isCodeAttribute());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(151);
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        classWriter0.visit(65535, 6, (String) null, "", "t|lFaj.ddbm%[-", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2855);
      int int0 = classWriter0.newUTF8("$-Vox");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1737));
      int int0 = classWriter0.newUTF8("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1316);
      int int0 = classWriter0.newNameType("", "]m'AJ!G}gfF6@*");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212673);
      Item item0 = classWriter0.newMethodItem(">50%0n?iZCP(1", ">50%0n?iZCP(1", "", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1737));
      Item item0 = classWriter0.newMethodItem("sb?L/ f88D<", "SourceDebugExtension", "sb?L/ f88D<", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(616);
      int int0 = classWriter0.newMethod("", "Ve;z<T{gW", "Ve;z<T{gW", false);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1316);
      int int0 = classWriter0.newMethod("", "", "", false);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      Item item0 = classWriter0.newLong(7);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(151);
      Item item0 = classWriter0.newInteger(26);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-69));
      Item item0 = classWriter0.newInteger((-4802));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      Item item0 = classWriter0.newFloat(0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2010));
      Item item0 = classWriter0.newFloat((-2010));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      Item item0 = classWriter0.newFieldItem("org.apache.commons.io.filefilter.SuffixFileFilter", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Handler");
      ClassWriter classWriter0 = new ClassWriter(classReader0, Integer.MAX_VALUE);
      Item item0 = classWriter0.newFieldItem("EnclosingMethod", "", "Xr4b");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      Item item0 = classWriter0.newFieldItem("", "InnerClasses", ";#b:w]Y]GVu");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      // Undeclared exception!
      try { 
        classWriter0.newField("29~O,fU4Uj.t7+", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777216);
      int int0 = classWriter0.newField("", "value ", "");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(151);
      Item item0 = classWriter0.newDouble(26);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1386));
      Item item0 = classWriter0.newDouble((-1386));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      Item item0 = classWriter0.newClassItem(",D$");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1316);
      Item item0 = classWriter0.newClassItem("");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777216);
      int int0 = classWriter0.newClass("L");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("_", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class '_.class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("", "7itj<T<79|;bd~@M*");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: 
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-90));
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".2E(b:#-)P%H:b*R&/";
      // Undeclared exception!
      try { 
        classWriter0.visitMethod((-90), "]^Wn}M@y>", "]^Wn}M@y>", ".2E(b:#-)P%H:b*R&/", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777215);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 168, "C:TM@GHQb5\"@7#(", "C:TM@GHQb5\"@7#(", "C:TM@GHQb5\"@7#(", stringArray0, false, false);
      methodWriter0.classReaderOffset = 1;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2507);
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem((String) null, (String) null, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      // Undeclared exception!
      try { 
        classWriter0.newField((String) null, "", "RuntimeInvisibleAnnotations");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
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
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(539);
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
      ClassReader classReader0 = new ClassReader("wheel.asm.Handler");
      ClassWriter classWriter0 = new ClassWriter(classReader0, Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("wheel.asm.Handler", "KH<=dV`");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'KH<=dV`.class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(616);
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
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1737));
      int int0 = classWriter0.newClass("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4634));
      classWriter0.newDouble(0.0);
      classWriter0.threshold = (-4634);
      classWriter0.visitInnerClass(")V", (String) null, "9h93\"J", 63);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-343));
      classWriter0.threshold = (-1699);
      classWriter0.visitSource("iu`k(hYOG", "1E6KdD");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-69));
      classWriter0.visitOuterClass(".s.IFJDCS", "", "");
      Item item0 = classWriter0.newMethodItem("", "", "TBRWx#+F:/q1r", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2010));
      String string0 = classWriter0.getCommonSuperClass("wheel.asm.Frame", "wheel.asm.Frame");
      assertEquals("wheel.asm.Frame", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1719));
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(14, 14);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(151);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addUninitializedType("org.apache.commons.io.filefilter.WildcardFileFilter", 200);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("", 7);
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.addUninitializedType("", (-1));
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-1), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(616);
      classWriter0.addType("RuntimeInvisibleAnnotations");
      int int0 = classWriter0.addType("RuntimeInvisibleAnnotations");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newNameType("_", "");
      int int0 = classWriter0.newField("_", "_", "");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2855);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 59, "hs", "+bzR[ja#OQKJA)i=", "+bzR[ja#OQKJA)i=", "hs");
      int int0 = classWriter0.newConst("hs");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212673);
      Item item0 = classWriter0.newDouble(0.0);
      Item item1 = classWriter0.newDouble(0.0);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1386));
      Item item0 = classWriter0.newLong((-1386));
      Item item1 = classWriter0.newLong((-1386));
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Item item0 = classWriter0.newFloat(2);
      Item item1 = classWriter0.newFloat(2);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-90));
      Item item0 = classWriter0.newConstItem(classWriter0.COMPUTE_MAXS);
      Item item1 = classWriter0.newConstItem(classWriter0.COMPUTE_MAXS);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3665);
      classWriter0.newField("WoNkY`u7jw?0brsNw", "'`h;`7", "java/lang/String");
      int int0 = classWriter0.newField("WoNkY`u7jw?0brsNw", "'`h;`7", "java/lang/String");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      Type type0 = Type.FLOAT_TYPE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(11, "void", "void", "Stt9\u0001,RW", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4329);
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
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      Class<Type> class0 = Type.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1719));
      Long long0 = Long.valueOf((long) 1);
      int int0 = classWriter0.newConst(long0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      Float float0 = new Float(0.0);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1463, ",=", ",=", ")<;ZGc:M", float0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(777);
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      Boolean boolean0 = Boolean.valueOf("#\"GNZO");
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      Character character0 = new Character('I');
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-1), "{y_HC;l", "RuntimeInvisibleAnnotations", "", character0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Byte byte0 = new Byte((byte) (-42));
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1737));
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
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-69));
      classWriter0.visitAnnotation(".s.IFJDCS", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      classWriter0.visitAnnotation("EnclosingMethod", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1737));
      classWriter0.visitOuterClass("RKxyu0[hZJ8:", "RKxyu0[hZJ8:", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-343));
      classWriter0.visitSource("iu`k(hYOG", "1E6KdD");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "/%/P ";
      stringArray0[1] = "/%/P ";
      stringArray0[2] = "/%/P ";
      stringArray0[3] = "/%/P ";
      stringArray0[4] = "/%/P ";
      classWriter0.visit(18, 65535, "/%/P ", "/%/P ", "/%/P ", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777215);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 168, "C:TM@GHQb5\"@7#(", "C:TM@GHQb5\"@7#(", "C:TM@GHQb5\"@7#(", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-265));
      classWriter0.visitField((-265), "j<'0t^-'<8~Xt", "j<'0t^-'<8~Xt", "j<'0t^-'<8~Xt", "j<'0t^-'<8~Xt");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(132, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1386));
      classWriter0.visitInnerClass((String) null, (String) null, "", (-1386));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      classWriter0.visitInnerClass((String) null, "/%/P ", (String) null, 2984);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(66, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      classWriter0.visitInnerClass("-=6ZiJ:=1&dy4L7 LS*", "-=6ZiJ:=1&dy4L7 LS*", "-=6ZiJ:=1&dy4L7 LS*", 13);
      classWriter0.visitInnerClass("Insensitive", "org.apache.commons.io.IOCase", "mMDTh", 2189);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(616);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      classWriter0.visitOuterClass("", "", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      classWriter0.visitOuterClass("%[-g", "", "%[-g");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      classWriter0.visitOuterClass("org.apache.commons.io.filefilter.SuffixFileFilter", (String) null, "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212673);
      classWriter0.visitSource(">50%0n?iZCP(1", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(42);
      classWriter0.visitSource((String) null, "Ey'/Ghhi");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = ")<;ZGc:M";
      stringArray0[2] = ",=";
      stringArray0[3] = ",=";
      stringArray0[4] = ",=";
      stringArray0[5] = ",=";
      stringArray0[6] = ",=";
      stringArray0[7] = ",=";
      classWriter0.visit(1463, (-2282), ",=", ")<;ZGc:M", ",=", stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      String[] stringArray0 = new String[0];
      classWriter0.visit((-2347), 19, "", "T;TP&8 ", "", stringArray0);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1719));
      classWriter0.visit((-1064), (-1064), "F9ZE|ye|}k\"qo", "F9ZE|ye|}k\"qo", "F9ZE|ye|}k\"qo", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212673);
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        classWriter0.visit(285212673, 285212673, "", (String) null, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4634));
      Short short0 = new Short((short) (-8331));
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1737));
      classWriter0.visitEnd();
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1737));
      int int0 = classWriter0.newMethod("rD*{,@)W:QtU", "rD*{,@)W:QtU", "", true);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Handler");
      ClassWriter classWriter0 = new ClassWriter(classReader0, Integer.MAX_VALUE);
      classWriter0.visitSource("wheel.asm.Handler", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(42);
      Double double0 = new Double((-1.0));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(6, "Ey'/Ghhi", ",*Gb%G|[;I", ",*Gb%G|[;I", double0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5279));
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

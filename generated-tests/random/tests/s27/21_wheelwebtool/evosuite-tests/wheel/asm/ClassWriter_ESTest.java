/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 11:59:45 GMT 2019
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
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.Item;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(241);
      classWriter0.visitSource("", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1439);
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(1, "", "org.apache.commons.io.filefilter.TrueFileFilter", "njw%40&w&KGKj+bE", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1025);
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(505, "6%A", "", "wheel.asm.Item", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-589));
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        classWriter0.visitMethod((-117), "G1", "`kD1~]", "RuntimeInvisibleAnnotations", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitInnerClass("", "", "", 220);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1439);
      int int0 = classWriter0.newNameType("Invalid IOCase name: ", "AK");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1479));
      Item item0 = classWriter0.newMethodItem("yN*)|b(Qc 1A'7s=", "yN*)|b(Qc 1A'7s=", "yN*)|b(Qc 1A'7s=", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2307));
      Item item0 = classWriter0.newMethodItem("", "", "", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      int int0 = classWriter0.newMethod("", "U6,j:)Fcm[&PNZ5", "7p9-R;2}y", false);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1039);
      Item item0 = classWriter0.newLong(0L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      Item item0 = classWriter0.newLong(16);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-463));
      Item item0 = classWriter0.newInteger((-463));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2307));
      Item item0 = classWriter0.newFloat(0.0F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(901);
      Item item0 = classWriter0.newFloat(901);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-170));
      Item item0 = classWriter0.newFieldItem("nq Da7N-H3+P'I.Pj^4", "!Ue#Qa]N-$}YiI3-bk", "nq Da7N-H3+P'I.Pj^4");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      // Undeclared exception!
      try { 
        classWriter0.newField("", (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(43);
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1691);
      Item item0 = classWriter0.newClassItem("|7+DDtZFezn[aqs ");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(316);
      Item item0 = classWriter0.newClassItem("");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("5K0p=-Cpp~Nx", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class '5K0p=-Cpp~Nx.class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-188));
      int int0 = classWriter0.addUninitializedType("v Jw", (-188));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1279);
      int int0 = classWriter0.addUninitializedType("", 46);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3343));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.visitField((-3343), "X%Cmj/r", "G_U&;6TT@*srD", "X%Cmj/r", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@4de7a21e
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
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
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(901);
      // Undeclared exception!
      try { 
        classWriter0.newNameType((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1534);
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem((String) null, "", "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1691);
      // Undeclared exception!
      try { 
        classWriter0.newFieldItem("}6yh%'zou\"1LVd@?i", (String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3193));
      // Undeclared exception!
      try { 
        classWriter0.newField("i~};YFke!l l", "i~};YFke!l l", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4928);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      classWriter0.addType("a>fn@KZ&6xoY");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'a>fn@KZ&6xoY.class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-170));
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("+sRUHKdzknDms>mee&x", "nq Da7N-H3+P'I.Pj^4");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class '+sRUHKdzknDms>mee&x.class' should be in target project, but could not be found!
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(901);
      int int0 = classWriter0.newNameType("", "");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1279);
      int int0 = classWriter0.newUTF8("org.apache.commons.io.filefilter.PrefixFileFilter");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(901);
      classWriter0.visitOuterClass("W#=}C8bo]8;(<Ai!", "", "cl9H-t'1oX$p8X");
      int int0 = classWriter0.newUTF8("");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1479));
      int int0 = classWriter0.newClass("yN*)|b(Qc 1A'7s=");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.newField("", "", "Deprecated");
      assertEquals(5, int0);
      
      int int1 = classWriter0.newMethod("-", "FH", "", true);
      assertEquals(10, int1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-589));
      String string0 = classWriter0.getCommonSuperClass("wheel.asm.Edge", "wheel.asm.Edge");
      assertEquals("wheel.asm.Edge", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(9, 65535);
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
      ClassWriter classWriter0 = new ClassWriter(1691);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addUninitializedType("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", 4);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4179);
      classWriter0.addUninitializedType("float", 4179);
      int int0 = classWriter0.addUninitializedType("float", 4179);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(43);
      classWriter0.addType("8c");
      int int0 = classWriter0.addType("8c");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(529);
      int int0 = classWriter0.newMethod("", "", " ]kXG2n.`i", true);
      assertEquals(5, int0);
      
      int int1 = classWriter0.newField("", "", " ]kXG2n.`i");
      assertEquals(6, int1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      classWriter0.newConst("&3]s;,Z3`y.");
      Item item0 = classWriter0.newConstItem("&3]s;,Z3`y.");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3219);
      Double double0 = new Double(1);
      Item item0 = classWriter0.newConstItem(double0);
      Item item1 = classWriter0.newDouble(1);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-188));
      Item item0 = classWriter0.newLong((-188));
      Item item1 = classWriter0.newLong((-188));
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-170));
      Float float0 = new Float(0.0F);
      classWriter0.newConst(float0);
      int int0 = classWriter0.newConst(float0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2238);
      Item item0 = classWriter0.newInteger(5);
      Item item1 = classWriter0.newInteger(5);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(43);
      Item item0 = classWriter0.newMethodItem("Insensitive", "Insensitive", "Insensitive", false);
      Item item1 = classWriter0.newMethodItem("Insensitive", "Insensitive", "Insensitive", false);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1439);
      Item item0 = classWriter0.newFieldItem("", "", "");
      Item item1 = classWriter0.newFieldItem("", "", "");
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(781);
      Type type0 = Type.getObjectType("_%\"/7|em.U(3M^");
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3136));
      Type type0 = Type.LONG_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-491), "EnclosingMethod", "-", "lb9oM,ySZ", "");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      Long long0 = new Long(1);
      int int0 = classWriter0.newConst(long0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      Boolean boolean0 = new Boolean(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(35);
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
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(43);
      Character character0 = new Character('c');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      Byte byte0 = new Byte((byte) (-50));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(35);
      Item item0 = classWriter0.newConstItem(classWriter0.COMPUTE_MAXS);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3197);
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
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Attribute attribute0 = new Attribute("{gh*m?iQ:W 2");
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
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1279);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      classWriter0.visitAnnotation("{gh*m?iQ:W 2", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1479));
      classWriter0.visitInnerClass("e?G", "'yj9@rgSH", "yN*)|b(Qc 1A'7s=", 17);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(105);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(105, (-1505), "", "", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      classWriter0.visitOuterClass("X.Pz*", "X.Pz*", "X.Pz*");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(68, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1479));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "yN*)|b(Qc 1A'7s=";
      stringArray0[1] = "SourceFile";
      stringArray0[2] = "yN*)|b(Qc 1A'7s=";
      stringArray0[3] = "yN*)|b(Qc 1A'7s=";
      stringArray0[4] = "yN*)|b(Qc 1A'7s=";
      stringArray0[5] = "x8@zG[_A@n;%";
      stringArray0[6] = "e?G";
      stringArray0[7] = "e?G";
      stringArray0[8] = "yN*)|b(Qc 1A'7s=";
      classWriter0.visitMethod(26, "", "yN*)|b(Qc 1A'7s=", (String) null, stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(141, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      classWriter0.visitInnerClass("ek|u]MU", "wheel.asm.FieldWriter", (String) null, 2507);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      classWriter0.visitInnerClass("org.apache.commons.io.filefilter.AndFileFilter", (String) null, "", 131072);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(316);
      classWriter0.visitInnerClass((String) null, "", "", (-5237));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(268);
      classWriter0.visitInnerClass("-Z0/s_", "Deprecated", "-Z0/s_", 268);
      classWriter0.visitInnerClass("Deprecated", "Deprecated", "JSR/RET are not supported with computeFrames option", 268);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(316);
      classWriter0.visitOuterClass("", ";2bxV&hD1NO", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      classWriter0.visitOuterClass("", (String) null, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(316);
      classWriter0.visitSource("Synthetic", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1479));
      classWriter0.visitSource("yN*)|b(Qc 1A'7s=", "yN*)|b(Qc 1A'7s=");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(113, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1534);
      classWriter0.visitSource((String) null, ":mUbx%}");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1479));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "yN*)|b(Qc 1A'7s=";
      stringArray0[1] = "SourceFile";
      stringArray0[2] = "yN*)|b(Qc 1A'7s=";
      stringArray0[3] = "yN*)|b(Qc 1A'7s=";
      stringArray0[4] = "yN*)|b(Qc 1A'7s=";
      stringArray0[5] = "x8@zG[_A@n;%";
      stringArray0[6] = "e?G";
      stringArray0[7] = "e?G";
      stringArray0[8] = "yN*)|b(Qc 1A'7s=";
      classWriter0.visit((-1479), 17, "e?G", "e?G", "yN*)|b(Qc 1A'7s=", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(129, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(35);
      classWriter0.visit(498, 35, "", "*v,~B(_#qh}=g", "", (String[]) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      String[] stringArray0 = new String[0];
      classWriter0.visit(65535, 1, "The wildcard list must not be null", "", "SourceFile", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      String[] stringArray0 = new String[0];
      classWriter0.visit(131072, Integer.MAX_VALUE, "org.apache.commons.io.filefilter.SuffixFileFilter", (String) null, (String) null, stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(116, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3193));
      Short short0 = new Short((short)3);
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1706);
      classWriter0.visitEnd();
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3219);
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(12, "RuntimeVisibleParameterAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleParameterAnnotations", (String[]) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.CanReadFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 883);
      Item item0 = classWriter0.newFloat((-1977.106F));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Boolean boolean0 = Boolean.valueOf("");
      classWriter0.visitField(1, "", "", "", boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-188));
      int int0 = classWriter0.newField("v Jw", "v Jw", "");
      assertEquals(5, int0);
  }
}
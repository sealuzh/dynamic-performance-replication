/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 06:14:54 GMT 2019
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
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-321));
      classWriter0.visitOuterClass("", "", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-19));
      classWriter0.visitInnerClass("", "", "", 868);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(226);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(226, "2'0z!TI]ym9G", "2'0z!TI]ym9G", "", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      classWriter0.visit((-1388), 1115, "", "", "", (String[]) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      int int0 = classWriter0.newUTF8("org.apache.commons.io.filefilter.FileFileFilter");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1891));
      int int0 = classWriter0.newUTF8("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-975));
      int int0 = classWriter0.newNameType("", "");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      Item item0 = classWriter0.newMethodItem("", "", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-656));
      int int0 = classWriter0.newMethod("]0Q0k", "SourceFile", "", false);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      Item item0 = classWriter0.newLong(0L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      Item item0 = classWriter0.newLong((-1L));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1572));
      Item item0 = classWriter0.newInteger((-1572));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      Item item0 = classWriter0.newFloat(0.0F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1891));
      Item item0 = classWriter0.newFloat(2138.5073F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-975));
      int int0 = classWriter0.newField("value ", "{J.X$pGY", "long");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4172));
      Item item0 = classWriter0.newDouble((-4172));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-325));
      Item item0 = classWriter0.newClassItem("wheel.asm.FieldWriter");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1483);
      int int0 = classWriter0.newClass("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      int int0 = classWriter0.addUninitializedType(",", (-581));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-325));
      int int0 = classWriter0.addUninitializedType("", 6);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1483);
      // Undeclared exception!
      try { 
        classWriter0.visitOuterClass((String) null, "wheel.asm.ClassWriter", "org.apache.commons.io.IOCase");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "OsA3IWgYYiHB4J2W5";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(2, "RuntimeInvisibleAnnotations", "OsA3IWgYYiHB4J2W5", "", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1093);
      Item item0 = classWriter0.newConstItem("O kK`r[n@");
      // Undeclared exception!
      try { 
        classWriter0.visitField(292552704, "org.apache.commons.io.filefilter.NameFileFilter", "", "", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.Item@7
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(936);
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem((String) null, "&=z`a&#0z;i?s(\"b", (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-975));
      // Undeclared exception!
      try { 
        classWriter0.newFieldItem("v)4,yPCd4", "", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Item item0 = classWriter0.newFieldItem("", "", "");
      // Undeclared exception!
      try { 
        classWriter0.newConst(item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.Item@9
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4172));
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
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      Item[] itemArray0 = new Item[9];
      classWriter0.typeTable = itemArray0;
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-2076), 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2076
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(226);
      // Undeclared exception!
      try { 
        classWriter0.getCommonSuperClass("", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: 
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1252);
      // Undeclared exception!
      try { 
        classWriter0.addUninitializedType((String) null, 1252);
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
      ClassWriter classWriter0 = new ClassWriter(4390);
      classWriter0.index = 4390;
      int int0 = classWriter0.addType("+s&l|&}j?}h2M$>");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(567);
      classWriter0.newField("x2[ayrY!+Jx`sU#]{", "JSR/RET are not supported with computeFrames option", "");
      Item item0 = classWriter0.newInteger(6);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      Item item0 = classWriter0.newFloat((-295.98F));
      Item item1 = classWriter0.newFloat((-295.98F));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(26);
      int int0 = classWriter0.newClass("'cquCJ");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2145));
      classWriter0.threshold = (-2145);
      Item item0 = classWriter0.newFieldItem("%>9)", "%>9)", "Synthetic");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitOuterClass("wheel.asm.ClassWriter", "gG,2YI9K5SC< D)", "wheel.asm.ClassWriter");
      Item item0 = classWriter0.newMethodItem("", "", ">i)^XR", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String string0 = classWriter0.getCommonSuperClass("org.apache.commons.io.filefilter.FileFileFilter", "org.apache.commons.io.filefilter.FileFileFilter");
      assertEquals("org.apache.commons.io.filefilter.FileFileFilter", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(6, 1);
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
      ClassWriter classWriter0 = new ClassWriter(6);
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addUninitializedType("M\"fh q+F'i", 6);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      classWriter0.addType("?");
      int int0 = classWriter0.addType("?");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.newNameType("Tu~n%L", "Tu~n%L");
      classWriter0.visitOuterClass("hJYXd&WQ_DA-", "Tu~n%L", "Tu~n%L");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      Item item0 = classWriter0.newConstItem("x6XDna6w!%Z");
      Item item1 = classWriter0.newConstItem("x6XDna6w!%Z");
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      Item item0 = classWriter0.newDouble(168);
      Item item1 = classWriter0.newDouble(168);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      Item item0 = classWriter0.newLong(8);
      Item item1 = classWriter0.newLong(8);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3167);
      Byte byte0 = new Byte((byte)36);
      classWriter0.newConst(byte0);
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-19));
      classWriter0.newMethodItem("", "", "9Lvm5", false);
      int int0 = classWriter0.newMethod("", "", "9Lvm5", false);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-656));
      Item item0 = classWriter0.newMethodItem("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "^", "^", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Item item0 = classWriter0.newFieldItem("", "", "");
      Item item1 = classWriter0.newFieldItem("", "", "");
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      Class<Byte> class0 = Byte.class;
      Type type0 = Type.getType(class0);
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1858);
      Type type0 = Type.VOID_TYPE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-1907), "Synthetic", "The list of suffixes must not be null", "Synthetic", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-19));
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
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-656));
      Double double0 = new Double((-1286.733365981));
      Item item0 = classWriter0.newConstItem(double0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      Long long0 = new Long((-4776L));
      int int0 = classWriter0.newConst(long0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(567);
      Float float0 = new Float((double) 2);
      Item item0 = classWriter0.newConstItem(float0);
      assertNotNull(item0);
      
      int int0 = classWriter0.newConst(float0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      Boolean boolean0 = new Boolean("");
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(226);
      Short short0 = new Short((short) (-4599));
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2145));
      Character character0 = new Character('c');
      Item item0 = classWriter0.newConstItem(character0);
      classWriter0.threshold = (-2145);
      Item item1 = classWriter0.newFieldItem("%>9)", "%>9)", "Synthetic");
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1886));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 6, "", "", "", classWriter0.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-325));
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
      ClassWriter classWriter0 = new ClassWriter((-1572));
      Attribute attribute0 = new Attribute("):OM&wcxR");
      byte[] byteArray0 = new byte[9];
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(51, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1572));
      Attribute attribute0 = new Attribute("):OM&wcxR");
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
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6338);
      classWriter0.visitAnnotation("wheel.asm.ClassReader", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-656));
      classWriter0.visitAnnotation("SourceFile", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6338);
      classWriter0.visitInnerClass("wheel.asm.ClassReader", "", "", (-379));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(256);
      String[] stringArray0 = new String[0];
      classWriter0.visit(256, (-685), "Deprecated", "Deprecated", "Deprecated", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(66, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1020);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      classWriter0.visitMethod((byte)33, "", "", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitField(6, ">i)^XR", ">i)^XR", "P22o=uG\"~;6B%}]0j", ">i)^XR");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(109, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-656));
      classWriter0.visitInnerClass(";s)mY~X_IDW", "SourceFile", (String) null, 57);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      classWriter0.visitInnerClass("qrVV", (String) null, "", (-1388));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      classWriter0.visitInnerClass((String) null, "WAx3", "WAx3", (-1623));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(302);
      classWriter0.visitInnerClass("#Fmz,%", "mK(?u(:S&jCM1[39c", "#Fmz,%", 302);
      classWriter0.visitInnerClass("The array of suffixes must not be null", "SourceFile", "The array of suffixes must not be null", 268435455);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(158);
      classWriter0.visitOuterClass("short", ".", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.visitOuterClass("wheel.asm.ClassWriter", "gG,2YI9K5SC< D)", "wheel.asm.ClassWriter");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      classWriter0.visitOuterClass("", (String) null, "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889275714));
      classWriter0.visitSource("5|D,{Ir3oH6s9? c2}", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.visitSource("x6XDna6w!%Z", "D6");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.visitSource((String) null, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "x6XDna6w!%Z";
      stringArray0[1] = "x6XDna6w!%Z";
      stringArray0[2] = "x6XDna6w!%Z";
      classWriter0.visit(20, (-1219), "x6XDna6w!%Z", "x6XDna6w!%Z", (String) null, stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        classWriter0.visit(20, (-1219), "x6XDna6w!%Z", "x6XDna6w!%Z", (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(26);
      String[] stringArray0 = new String[0];
      classWriter0.visit(26, 65535, "'cquCJ", (String) null, "'cquCJ", stringArray0);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-975));
      Boolean boolean0 = Boolean.TRUE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(860);
      classWriter0.visitEnd();
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-975));
      int int0 = classWriter0.newMethod("H0+PR.:5Mc2zQ:=G\"[J", "H0+PR.:5Mc2zQ:=G\"[J", "value ", true);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, (-2509));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-325));
      int int0 = classWriter0.newField("(Sc9%QP}", "", "");
      assertEquals(5, int0);
  }
}

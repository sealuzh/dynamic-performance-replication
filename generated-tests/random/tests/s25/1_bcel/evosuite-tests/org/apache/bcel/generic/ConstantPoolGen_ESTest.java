/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 09:45:19 GMT 2019
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantFieldref;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantInterfaceMethodref;
import org.apache.bcel.classfile.ConstantInvokeDynamic;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantMethodHandle;
import org.apache.bcel.classfile.ConstantMethodType;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantPoolGen_ESTest extends ConstantPoolGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType((-1324), (-1146));
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantNameAndType0, constantPoolGen1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1324
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantString constantString0 = new ConstantString((-2073432485));
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantString0, constantPoolGen1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2073432485
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantClass constantClass0 = new ConstantClass(11);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantClass0, constantPoolGen1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addFieldref("", "xs_Y/6UjSrKe%BySCt", "xs_Y/6UjSrKe%BySCt");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addInterfaceMethodref("java/lang/Class", "\"", "The value at the stack top is not of type 'long', but of type '");
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.adjustSize();
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.constants = constantArray0;
      constantPoolGen0.getConstantPool();
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantMethodType constantMethodType0 = new ConstantMethodType(3);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.setConstant(3, constantMethodType0);
      Constant constant0 = constantPoolGen0.getConstant(3);
      assertEquals(3, constantPoolGen0.getSize());
      assertNotNull(constant0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.setConstant(1, (Constant) null);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref("Warning: Padding byte != 0 in ", "", "");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref("%G%r7M@:%m", "%G%r7M@:%m", "%");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref("", "6Vp}@{zYR/G=PY)eQ2A", "6Vp}@{zYR/G=PY)eQ2A");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref("%", "xs_Y/6UjSrKe%BySCt", " not found: ");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref(" not found: ", "il.append(_factory.createCheckCast(", "");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupDouble(1840.1318306039657);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addMethodref("", "", "");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addLong((-1L));
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addFloat(0.0F);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addDouble(0.0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantLong constantLong0 = new ConstantLong(1643L);
      // Undeclared exception!
      try { 
        constantPoolGen0.setConstant((-815), constantLong0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -815
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        constantPoolGen0.getConstant((-1637));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1637
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addNameAndType("org.apache.bcel.generic.INEG", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bytes must not be null!
         //
         verifyException("org.apache.bcel.classfile.ConstantUtf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addInterfaceMethodref("(Q$pD.Ve%qF6a3", "&", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bytes must not be null!
         //
         verifyException("org.apache.bcel.classfile.ConstantUtf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addFieldref("<p", (String) null, "#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bytes must not be null!
         //
         verifyException("org.apache.bcel.classfile.ConstantUtf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.constants = constantArray0;
      // Undeclared exception!
      try { 
        constantPoolGen0.addDouble((-127.1044466));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addClass((ObjectType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Constant[] constantArray0 = new Constant[4];
      constantPoolGen0.constants = constantArray0;
      constantPoolGen0.addInteger(1513);
      constantPoolGen0.addFloat((-1));
      // Undeclared exception!
      try { 
        constantPoolGen0.addClass("%G%r7M@:%m");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addArrayClass((ArrayType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen((Constant[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Constant[] constantArray0 = new Constant[4];
      ConstantString constantString0 = new ConstantString(0);
      constantArray0[0] = (Constant) constantString0;
      constantArray0[2] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantClass constantClass0 = new ConstantClass(1825);
      constantArray0[1] = (Constant) constantClass0;
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getCachedInstance("");
      constantArray0[0] = (Constant) constantUtf8_0;
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(0, 0);
      constantArray0[2] = (Constant) constantInvokeDynamic0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantPool0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Constant[] constantArray0 = new Constant[6];
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType(2342, 2342);
      constantArray0[1] = (Constant) constantNameAndType0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref("#", "&", (String) null);
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref((String) null, (String) null, (String) null);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupMethodref((String) null, "/,ZudqNEDDCW", "pvI,{yHEe");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupNameAndType((String) null, (String) null);
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addNameAndType("&", "cR,Hr5P|6kAD9X");
      int int0 = constantPoolGen0.lookupNameAndType("&", "cR,Hr5P|6kAD9X");
      assertEquals(4, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("F^", "iaload", "F^");
      constantPoolGen0.lookupLong(0L);
      assertEquals(6, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addUtf8("kyTP!A)-fYb)=.B!<V?");
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      constantPoolGen0.lookupUtf8((String) null);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("org.apache.bcel.generic.ConstantPoolGen", "org.apache.bcel.generic.ConstantPoolGen", "org.apache.bcel.generic.ConstantPoolGen");
      int int0 = constantPoolGen0.lookupUtf8("org.apache.bcel.generic.ConstantPoolGen");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.lookupClass("f");
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantMethodType constantMethodType0 = new ConstantMethodType(64);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodType0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown constant type CONSTANT_MethodType[16](descriptor_index = 64)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref(0, 1);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantInterfaceMethodref0, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantMethodref constantMethodref0 = new ConstantMethodref((-1), 1);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodref0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantFieldref constantFieldref0 = new ConstantFieldref(4, 143);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantFieldref0, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ConstantDouble constantDouble0 = new ConstantDouble((-1));
      int int0 = constantPoolGen0.addConstant(constantDouble0, constantPoolGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantLong constantLong0 = new ConstantLong((-2410L));
      int int0 = constantPoolGen0.addConstant(constantLong0, constantPoolGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantInteger constantInteger0 = new ConstantInteger(38);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addConstant(constantArray0[0], constantPoolGen0);
      int int0 = constantPoolGen0.lookupFloat(8);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      BasicType basicType0 = Type.SHORT;
      ArrayType arrayType0 = new ArrayType(basicType0, 1);
      constantPoolGen0.addArrayClass(arrayType0);
      constantPoolGen0.toString();
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = constantPoolGen0.toString();
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("F^", "iaload", "F^");
      int int0 = constantPoolGen0.lookupMethodref("F^", "iaload", "F^");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("", "", "");
      int int0 = constantPoolGen0.addNameAndType("", "");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(1.0);
      int int0 = constantPoolGen0.addDouble(1);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble((-1376.143542286));
      int int0 = constantPoolGen0.lookupDouble(0.0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addLong(3075L);
      int int0 = constantPoolGen0.addLong(3075L);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addLong(0L);
      int int0 = constantPoolGen0.addLong(385L);
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      constantPoolGen0.addConstant(constantFloat0, constantPoolGen0);
      int int0 = constantPoolGen0.addFloat((-1.0F));
      assertEquals(4, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInteger(2640);
      int int0 = constantPoolGen0.addInteger(51);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantInteger constantInteger0 = new ConstantInteger((-483));
      constantArray0[2] = (Constant) constantInteger0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addInteger((-483));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      BasicType basicType0 = Type.SHORT;
      ArrayType arrayType0 = new ArrayType(basicType0, 1);
      constantPoolGen0.addArrayClass(arrayType0);
      int int0 = constantPoolGen0.lookupInteger(2);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("", "", "");
      int int0 = constantPoolGen0.addClass("");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString("");
      int int0 = constantPoolGen0.addString("");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.size = (-559);
      // Undeclared exception!
      try { 
        constantPoolGen0.addClass("mE");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-1637));
      constantArray0[2] = (Constant) constantMethodType0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Constant[] constantArray0 = new Constant[8];
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle((-2021161078), 234);
      constantArray0[1] = (Constant) constantMethodHandle0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(8, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantFloat constantFloat0 = new ConstantFloat((-1.0F));
      constantArray0[1] = (Constant) constantFloat0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addConstant(constantArray0[1], constantPoolGen0);
      assertEquals(1, int0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantLong constantLong0 = new ConstantLong((-2521L));
      constantArray0[1] = (Constant) constantLong0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantDouble constantDouble0 = new ConstantDouble(523.960090338232);
      constantArray0[1] = (Constant) constantDouble0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.addInteger(2);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(0, 0);
      constantArray0[2] = (Constant) constantInvokeDynamic0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Constant[] constantArray0 = new Constant[8];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getCachedInstance("org.apache.bcel.generic.DADD");
      constantArray0[2] = (Constant) constantUtf8_0;
      constantArray0[5] = (Constant) constantUtf8_0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(8, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("i!", "i!", "i!");
      ConstantPool constantPool0 = constantPoolGen0.getFinalConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(5, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString("org.apache.bcel.generic.ConstantPoolGen$Index");
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addMethodref((MethodGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getCachedInstance("Class must not be null");
      int int0 = constantPoolGen0.addConstant(constantUtf8_0, constantPoolGen0);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getConstant(122);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.lookupMethodref((MethodGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = new ObjectType("The 'value' is not of type int but of type ");
      int int0 = constantPoolGen0.addClass(objectType0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addInterfaceMethodref((MethodGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        constantPoolGen0.lookupInterfaceMethodref((MethodGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }
}

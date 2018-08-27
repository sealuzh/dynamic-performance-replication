/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:57:27 GMT 2018
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
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantPoolGen_ESTest extends ConstantPoolGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      assertEquals(1, constantPoolGen0.getSize());
      
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      assertEquals(1, constantPoolGen1.getSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantString constantString0 = new ConstantString((-1304));
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantString0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1304
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantMethodType constantMethodType0 = new ConstantMethodType(382);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodType0, constantPoolGen1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown constant type CONSTANT_MethodType[16](descriptor_index = 382)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("%", "%", "%");
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(5, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(17, 17);
      constantArray0[1] = (Constant) constantMethodHandle0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(9, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Constant[] constantArray0 = new Constant[4];
      ConstantInteger constantInteger0 = new ConstantInteger((-26));
      constantArray0[2] = (Constant) constantInteger0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(4, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addLong(0L);
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInterfaceMethodref(" (", " (", " (");
      int int0 = constantPoolGen0.addLong(4);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("%", "%", "%");
      constantPoolGen0.toString();
      assertEquals(5, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant[] constantArray0 = new Constant[11];
      ConstantString constantString0 = new ConstantString(3022);
      constantArray0[2] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3022
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getConstantPool();
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("org.apache.bcel.classfile.Method", "org.apache.bcel.classfile.Method", "org.apache.bcel.classfile.Method");
      int int0 = constantPoolGen0.addDouble(5);
      assertEquals(8, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInterfaceMethodref("JsLCSC37", "JsLCSC37", "JsLCSC37");
      int int0 = constantPoolGen0.addInteger(4);
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString(",yQ7");
      constantPoolGen0.addInteger(2);
      constantPoolGen0.lookupInteger(3);
      constantPoolGen0.adjustSize();
      assertEquals(4, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      constantPoolGen0.addInteger(2);
      Constant constant0 = constantPoolGen0.getConstant(2);
      constantPoolGen0.addFloat(2);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      int int0 = constantPoolGen0.addConstant(constant0, constantPoolGen1);
      assertEquals(4, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType(2000, 2000);
      ConstantNameAndType constantNameAndType1 = new ConstantNameAndType(constantNameAndType0);
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-1444));
      constantArray0[4] = (Constant) constantMethodType0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(7, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.size = (-3281);
      // Undeclared exception!
      try { 
        constantPoolGen0.addString("F?5!7bfd'^LtU3-(~ZaP");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.setConstant(2, (Constant) null);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("YEg_0", "YEg_0", "YEg_0");
      constantPoolGen0.addDouble(1.0);
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(256, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addClass("%");
      int int0 = constantPoolGen0.addInterfaceMethodref("%", "%", "%");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(2048, 2048);
      ConstantInvokeDynamic constantInvokeDynamic1 = new ConstantInvokeDynamic(constantInvokeDynamic0);
      Constant[] constantArray0 = new Constant[5];
      constantArray0[4] = (Constant) constantInvokeDynamic0;
      ConstantPoolGen constantPoolGen1 = null;
      try {
        constantPoolGen1 = new ConstantPoolGen(constantArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2048
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8(".T");
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
  public void test23()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantDouble constantDouble0 = new ConstantDouble(727.715);
      ConstantDouble constantDouble1 = new ConstantDouble(constantDouble0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addConstant(constantDouble1, constantPoolGen1);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("Ct");
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      constantPoolGen1.addLong((-4616189618054758400L));
      constantPoolGen0.addConstant(constantUtf8_0, constantPoolGen1);
      int int0 = constantPoolGen1.addLong(1L);
      assertEquals(5, constantPoolGen1.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(0.0);
      int int0 = constantPoolGen0.lookupDouble(1);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(0.0);
      constantPoolGen0.addDouble(0.0);
      int int0 = constantPoolGen0.addMethodref("M?-36!y1YBQz2", "SAME_EXTENDED", " to ");
      assertEquals(9, constantPoolGen0.getSize());
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInterfaceMethodref(" is no interface", " is no interface", "JavaClass.debug");
      constantPoolGen0.addString("O@*>h]ZwJN-n#$i");
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(8, constantPoolGen0.getSize());
      assertEquals(256, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInteger constantInteger0 = new ConstantInteger(238);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addConstant(constantInteger0, constantPoolGen1);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantLong constantLong0 = new ConstantLong(0L);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      constantPoolGen0.addConstant(constantLong0, constantPoolGen1);
      int int0 = constantPoolGen1.addInteger(1);
      assertEquals(2, constantPoolGen1.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = null;
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

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      constantPoolGen0.addMethodref("%", "%", "%");
      constantPoolGen0.lookupFieldref("%", "%", "%");
      constantPoolGen0.getConstantPool();
      constantPoolGen0.addLong(1830L);
      int int0 = constantPoolGen0.addLong(1830L);
      assertEquals(8, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      assertEquals(1, constantPoolGen0.getSize());
      
      Constant[] constantArray0 = new Constant[5];
      ConstantFloat constantFloat0 = new ConstantFloat((-1.0F));
      constantArray0[1] = (Constant) constantFloat0;
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      assertEquals(5, constantPoolGen1.getSize());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("%", "%", "%");
      constantPoolGen0.getConstantPool();
      ConstantClass constantClass0 = new ConstantClass(4);
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
  public void test35()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType((-75), (-75));
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen1.addConstant(constantNameAndType0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -75
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantFloat constantFloat0 = new ConstantFloat(1.0F);
      ConstantFloat constantFloat1 = new ConstantFloat(constantFloat0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addConstant(constantFloat1, constantPoolGen1);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("VZmuG.97", "VZmuG.97", "VZmuG.97");
      int int0 = constantPoolGen0.addFieldref("VZmuG.97", "VZmuG.97", "VZmuG.97");
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      assertEquals(1, constantPoolGen0.getSize());
      
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("lW");
      Constant[] constantArray0 = new Constant[3];
      constantArray0[1] = (Constant) constantUtf8_0;
      constantArray0[2] = (Constant) constantUtf8_0;
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      assertEquals(3, constantPoolGen1.getSize());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat(0.0F);
      int int0 = constantPoolGen0.addFloat(0.0F);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("VZmuG/97", "VZmuG/97", "VZmuG/97");
      constantPoolGen0.getFinalConstantPool();
      constantPoolGen0.addFloat((-2064.4517F));
      int int0 = constantPoolGen0.addFloat(1435.0F);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("a", "a", "a");
      Constant constant0 = constantPoolGen0.getConstant(4);
      int int0 = constantPoolGen0.addConstant(constant0, constantPoolGen0);
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("dstore_0");
      constantPoolGen0.addInterfaceMethodref("dstore_0", "dstore_0", "dstore_0");
      int int0 = constantPoolGen0.lookupInterfaceMethodref("dstore_0", "dstore_0", "dstore_0");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("Zstore_0", "Zstore_0", "Zstore_0");
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref(4, 4);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantInterfaceMethodref0, constantPoolGen1);
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
      constantPoolGen0.addString("Class '");
      int int0 = constantPoolGen0.addString("Class '");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      ConstantFieldref constantFieldref0 = new ConstantFieldref(256, 256);
      // Undeclared exception!
      try { 
        constantPoolGen1.addConstant(constantFieldref0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 256
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("T~]`1v", "T~]`1v", "T~]`1v");
      constantPoolGen0.getConstantPool();
      constantPoolGen0.getConstantPool();
      int int0 = constantPoolGen0.addFieldref("T~]`1v", "T~]`1v", "T~]`1v");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString("{KXf.\"CP2L+");
      constantPoolGen0.getConstantPool();
      assertEquals(3, constantPoolGen0.getSize());
      
      Constant[] constantArray0 = new Constant[6];
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("{KXf.\"CP2L+");
      ConstantUtf8 constantUtf8_1 = new ConstantUtf8(constantUtf8_0);
      constantArray0[0] = (Constant) constantUtf8_1;
      ConstantString constantString0 = new ConstantString(2);
      constantArray0[1] = (Constant) constantString0;
      ConstantUtf8 constantUtf8_2 = new ConstantUtf8("");
      constantArray0[2] = (Constant) constantUtf8_2;
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-248));
      ConstantMethodType constantMethodType1 = new ConstantMethodType(constantMethodType0);
      constantArray0[3] = (Constant) constantMethodType1;
      ConstantLong constantLong0 = new ConstantLong(729L);
      ConstantLong constantLong1 = new ConstantLong(constantLong0);
      constantArray0[4] = (Constant) constantLong1;
      ConstantString constantString1 = new ConstantString(constantString0);
      constantArray0[5] = (Constant) constantString1;
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      assertEquals(6, constantPoolGen1.getSize());
  }
}
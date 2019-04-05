/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 14:14:54 GMT 2019
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
import org.apache.bcel.generic.AALOAD;
import org.apache.bcel.generic.ACONST_NULL;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.FCMPG;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantPoolGen_ESTest extends ConstantPoolGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType(1, (-1285));
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantNameAndType0, constantPoolGen1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1285
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantClass constantClass0 = new ConstantClass(8);
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
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
  public void test02()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ConstantString constantString0 = new ConstantString((-2952));
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantString0, constantPoolGen1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2952
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantDouble constantDouble0 = new ConstantDouble(0.0);
      Constant[] constantArray0 = new Constant[5];
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addConstant(constantDouble0, constantPoolGen1);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.adjustSize();
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getConstant(6);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupMethodref((String) null, (String) null, (String) null);
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupLong(0L);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupLong(5);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref("{]RBCi:Nl&k", "{]RBCi:Nl&k", "");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref((String) null, (String) null, (String) null);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref("", "", "");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupDouble((-3312L));
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addUtf8("");
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addLong(0L);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addInteger(0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addDouble(13);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addClass("");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addMethodref((String) null, "E", "E");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Constant[] constantArray0 = new Constant[1];
      constantPoolGen0.constants = constantArray0;
      // Undeclared exception!
      try { 
        constantPoolGen0.addInterfaceMethodref("B>D0 `yLqK$", "B>D0 `yLqK$", "What's this: ");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Constant[] constantArray0 = new Constant[1];
      constantPoolGen0.constants = constantArray0;
      // Undeclared exception!
      try { 
        constantPoolGen0.addFloat(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addFieldref("D?", "", (String) null);
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      ConstantClass constantClass0 = new ConstantClass(1);
      Constant[] constantArray0 = new Constant[2];
      constantArray0[1] = (Constant) constantClass0;
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantClass cannot be cast to org.apache.bcel.classfile.ConstantUtf8
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref(")", ",LF", "<56p{&F");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref("yas", "()<null object>", "()<null object>");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addMethodref(", length = ", "org.apache.bcel.classfile.ConstantValue", "QebcEvJ5-5!qM#l^");
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupMethodref("imb}*~b'RCMg[5", "cpb_~_b$V", "{+_Q8v]s:ii#-|mJwt");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupNameAndType("", (String) null);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInteger((-1794));
      int int0 = constantPoolGen0.lookupLong((-3312L));
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addUtf8("org.apache.bcel.generic.IASTORE");
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addClass("B>D0 `yLqK$");
      int int0 = constantPoolGen0.addUtf8("B>D0 `yLqK$");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupUtf8("=.F ");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ObjectType objectType0 = new ObjectType("");
      constantPoolGen0.addClass(objectType0);
      int int0 = constantPoolGen0.lookupUtf8("");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      constantPoolGen0.addFloat(3550.7588F);
      int int0 = constantPoolGen0.lookupFloat(586.59F);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInteger((-2476));
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addClass("B>D0 `yLqK$");
      int int0 = constantPoolGen0.addInterfaceMethodref("B>D0 `yLqK$", "B>D0 `yLqK$", "What's this: ");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupString("#");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(5, 3154);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodHandle0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown constant type CONSTANT_MethodHandle[15](reference_kind = 5, reference_index = 3154)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref((-2978), (-2978));
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantInterfaceMethodref0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2978
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantMethodref constantMethodref0 = new ConstantMethodref(75, 0);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodref0, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantFieldref constantFieldref0 = new ConstantFieldref(0, 656);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantFieldref0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 656
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInteger constantInteger0 = new ConstantInteger((-1));
      int int0 = constantPoolGen0.addConstant(constantInteger0, constantPoolGen0);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("Mfu\">f#From\tTo\tHandler\tType\n#Mfu\">f");
      int int0 = constantPoolGen0.addConstant(constantUtf8_0, constantPoolGen0);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInterfaceMethodref("Z>Ih1", "XqI*h", "e$1qfev9/");
      constantPoolGen0.toString();
      assertEquals(7, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      String string0 = constantPoolGen0.toString();
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addNameAndType("#^_puk]}$JU", "#^_puk]}$JU");
      int int0 = constantPoolGen0.addNameAndType("#^_puk]}$JU", "#^_puk]}$JU");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addNameAndType("yas", "qd");
      int int0 = constantPoolGen0.lookupNameAndType("yas", "qd");
      assertEquals(4, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble((-1914.4189642052513));
      int int0 = constantPoolGen0.lookupDouble(2214.848684787995);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(0.0);
      int int0 = constantPoolGen0.addDouble(0.0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addLong(3);
      int int0 = constantPoolGen0.addLong((-2166L));
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantLong constantLong0 = new ConstantLong(1L);
      constantPoolGen0.addConstant(constantLong0, constantPoolGen0);
      int int0 = constantPoolGen0.addConstant(constantLong0, constantPoolGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat((-1));
      ConstantLong constantLong0 = new ConstantLong((-1));
      int int0 = constantPoolGen0.addConstant(constantLong0, constantPoolGen0);
      assertEquals(4, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat(0.0F);
      int int0 = constantPoolGen0.addFloat(0.0F);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantLong constantLong0 = new ConstantLong(1L);
      constantPoolGen0.addConstant(constantLong0, constantPoolGen0);
      int int0 = constantPoolGen0.lookupFloat(0.0F);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantFloat constantFloat0 = new ConstantFloat(1.0F);
      constantPoolGen0.addConstant(constantFloat0, constantPoolGen0);
      int int0 = constantPoolGen0.addFloat(2);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInteger((-1794));
      int int0 = constantPoolGen0.addInteger((-1794));
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInteger(143);
      int int0 = constantPoolGen0.addInteger(241);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInteger(161);
      int int0 = constantPoolGen0.lookupInteger(161);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addClass(":");
      int int0 = constantPoolGen0.addFieldref(":", "Dsmom[~pS", "java/lang/Object");
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString("$nje>Q~c:Kvv-");
      int int0 = constantPoolGen0.addString("$nje>Q~c:Kvv-");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addString("");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.size = 2;
      ObjectType objectType0 = new ObjectType("zO|xp9I_%zO|xp9I_");
      int int0 = constantPoolGen0.addClass(objectType0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-1205));
      constantArray0[2] = (Constant) constantMethodType0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(5, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(2729, 59);
      constantArray0[1] = (Constant) constantMethodHandle0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(9, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantDouble constantDouble0 = new ConstantDouble(0L);
      constantArray0[3] = (Constant) constantDouble0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(9, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantLong constantLong0 = new ConstantLong(95L);
      constantArray0[1] = (Constant) constantLong0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(5, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Constant[] constantArray0 = new Constant[5];
      ConstantInteger constantInteger0 = new ConstantInteger((-1205));
      constantArray0[3] = (Constant) constantInteger0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(5, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.addFloat((-1));
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.addFieldref("Unexpected constant type: ", "", "^>");
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(7, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(2025, (-247));
      constantArray0[1] = (Constant) constantInvokeDynamic0;
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -247
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("&");
      constantArray0[1] = (Constant) constantUtf8_0;
      constantArray0[2] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(9, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.addInterfaceMethodref("^>", "^>", "Unexpected constant type: ");
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(6, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantClass constantClass0 = new ConstantClass(47);
      constantArray0[5] = (Constant) constantClass0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("VHO`");
      constantArray0[0] = (Constant) constantUtf8_0;
      ConstantString constantString0 = new ConstantString(0);
      constantArray0[1] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantString constantString0 = new ConstantString(0);
      constantArray0[1] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen(constantArray0);
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
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
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
  public void test78()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ACONST_NULL aCONST_NULL0 = new ACONST_NULL();
      Type type0 = aCONST_NULL0.getType(constantPoolGen0);
      Boolean boolean0 = Boolean.valueOf(false);
      PUSH pUSH0 = new PUSH(constantPoolGen0, boolean0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      MethodGen methodGen0 = new MethodGen((-402), type0, type0.NO_ARGS, (String[]) null, "Yn3tdbK ?IPuWl1+", ")", instructionList0, constantPoolGen0);
      int int0 = constantPoolGen0.addMethodref(methodGen0);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.getConstant(1514);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1514
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FCMPG fCMPG0 = new FCMPG();
      Type type0 = fCMPG0.getType(constantPoolGen0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, false);
      InstructionList instructionList0 = new InstructionList(pUSH0);
      MethodGen methodGen0 = new MethodGen(5, type0, type0.NO_ARGS, (String[]) null, "Cannot STORE: Stack to read from is empty.", "Cannot STORE: Stack to read from is empty.", instructionList0, constantPoolGen0);
      int int0 = constantPoolGen0.lookupMethodref(methodGen0);
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
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
      ArrayType arrayType0 = new ArrayType("\n", 161);
      constantPoolGen0.addArrayClass(arrayType0);
      int int0 = constantPoolGen0.lookupInteger(161);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getCachedInstance("&");
      // Undeclared exception!
      try { 
        constantPoolGen0.setConstant((-1), constantUtf8_0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AALOAD aALOAD0 = new AALOAD();
      Type type0 = aALOAD0.getType(constantPoolGen0);
      InstructionList instructionList0 = new InstructionList();
      MethodGen methodGen0 = new MethodGen(1, type0, (Type[]) null, (String[]) null, "<56p{&F", ")", instructionList0, constantPoolGen0);
      int int0 = constantPoolGen0.addInterfaceMethodref(methodGen0);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPool constantPool0 = constantPoolGen0.getFinalConstantPool();
      assertEquals(1, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
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

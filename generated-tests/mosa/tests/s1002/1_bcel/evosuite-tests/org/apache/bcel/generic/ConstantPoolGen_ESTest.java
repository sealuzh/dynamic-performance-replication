/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:27:23 GMT 2018
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Member;
import java.util.regex.Pattern;
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
      constantPoolGen0.getConstant(1);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.adjustSize();
      constantPoolGen0.addInterfaceMethodref("ldc2_w", "ldc2_w", "ldc2_w");
      constantPoolGen0.addInteger(4287);
      int int0 = constantPoolGen0.lookupInteger(248);
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("p +", "p +", "p +");
      constantPoolGen0.getConstantPool();
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString("=E(BN>z");
      constantPoolGen0.addLong(2);
      constantPoolGen0.lookupLong((-4570959757851239563L));
      int int0 = constantPoolGen0.getSize();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("j%", "j%", "j%");
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
  public void test07()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("p +", "p +", "p +");
      constantPoolGen0.lookupFloat(4);
      assertEquals(5, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getFinalConstantPool();
      constantPoolGen0.addInterfaceMethodref("ldc2_w", "ldc2_w", "ldc2_w");
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
  public void test09()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("arraylength", "arraylength", "arraylength");
      int int0 = constantPoolGen0.addInterfaceMethodref("arraylength", "arraylength", "arraylength");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Constant[] constantArray0 = new Constant[2];
      ConstantLong constantLong0 = new ConstantLong((-5124L));
      constantArray0[0] = (Constant) constantLong0;
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(135, 135);
      constantArray0[1] = (Constant) constantInvokeDynamic0;
      ConstantPoolGen constantPoolGen1 = null;
      try {
        constantPoolGen1 = new ConstantPoolGen(constantArray0);
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
      constantPoolGen0.size = (-717);
      // Undeclared exception!
      try { 
        constantPoolGen0.addString("#");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(1580, 1580);
      Constant[] constantArray0 = new Constant[7];
      constantArray0[3] = (Constant) constantMethodHandle0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(7, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat(0.0F);
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.addMethodref("~:%~:", "~:%~:", "~:%~:");
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(6, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantLong constantLong0 = new ConstantLong((-3365L));
      Constant[] constantArray0 = new Constant[2];
      constantArray0[0] = (Constant) constantLong0;
      constantLong0.clone();
      constantArray0[1] = (Constant) constantLong0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("-/PWsA/h}");
      constantPoolGen0.addConstant(constantUtf8_0, constantPoolGen0);
      constantPoolGen0.setConstant(1, constantUtf8_0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("ldc2_w", "ldc2_w", "ldc2_w");
      constantPoolGen0.toString();
      assertEquals(5, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("ldc2_w", "ldc2_w", "ldc2_w");
      int int0 = constantPoolGen0.addDouble(4);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInteger((-1402));
      constantPoolGen0.addString(",39_G4<?j?!");
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(4, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantFieldref constantFieldref0 = new ConstantFieldref(237, 237);
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
  public void test20()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      ConstantInteger constantInteger0 = new ConstantInteger(222);
      int int0 = constantPoolGen1.addConstant(constantInteger0, constantPoolGen0);
      assertEquals(2, constantPoolGen1.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat((-994.89F));
      int int0 = constantPoolGen0.addFloat(0.0F);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      ConstantString constantString0 = new ConstantString(130);
      // Undeclared exception!
      try { 
        constantPoolGen1.addConstant(constantString0, constantPoolGen0);
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
      constantPoolGen0.addFloat(0.0F);
      constantPoolGen0.addMethodref("%", "%", "%");
      constantPoolGen0.lookupString("%");
      int int0 = constantPoolGen0.lookupFloat(0.0F);
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(1741, 1741);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodHandle0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown constant type CONSTANT_MethodHandle[15](reference_kind = 1741, reference_index = 1741)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.adjustSize();
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addDouble((-1.0));
      int int0 = constantPoolGen0.addDouble(1);
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref((-152), (-152));
      // Undeclared exception!
      try { 
        constantPoolGen1.addConstant(constantInterfaceMethodref0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -152
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType(249, 249);
      ConstantNameAndType constantNameAndType1 = new ConstantNameAndType(constantNameAndType0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantNameAndType1, constantPoolGen1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("%", "%", "%");
      assertEquals(5, constantPoolGen0.getSize());
      
      ConstantInteger constantInteger0 = new ConstantInteger(271);
      Constant[] constantArray0 = new Constant[5];
      constantArray0[0] = (Constant) constantInteger0;
      constantArray0[1] = (Constant) constantInteger0;
      constantArray0[2] = (Constant) constantInteger0;
      constantArray0[3] = (Constant) constantInteger0;
      constantArray0[4] = (Constant) constantInteger0;
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen2 = new ConstantPoolGen(constantPool0);
      ConstantPoolGen constantPoolGen3 = new ConstantPoolGen(constantArray0);
      constantPoolGen2.addConstant(constantArray0[3], constantPoolGen3);
      int int0 = constantPoolGen1.lookupString("#");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantFloat constantFloat0 = new ConstantFloat(2.0F);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      constantPoolGen0.addConstant(constantFloat0, constantPoolGen1);
      int int0 = constantPoolGen0.lookupDouble(1);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("ldc2_w", "ldc2_w", "ldc2_w");
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
  public void test31()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getFinalConstantPool();
      ConstantString constantString0 = new ConstantString((-4816));
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(516, (-1));
      ConstantMethodHandle constantMethodHandle1 = new ConstantMethodHandle((-4816), (-1));
      ConstantFieldref constantFieldref0 = new ConstantFieldref(9, 9);
      constantPoolGen0.addMethodref("%", "%", "%");
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      constantPoolGen1.addDouble(1.0);
      int int0 = constantPoolGen1.addDouble(1);
      assertEquals(3, constantPoolGen1.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantMethodref constantMethodref0 = new ConstantMethodref((-390), (-390));
      ConstantMethodref constantMethodref1 = new ConstantMethodref((-390), (-390));
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodref1, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -390
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(2.0F);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantLong constantLong0 = new ConstantLong((-746L));
      Constant[] constantArray0 = new Constant[5];
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addConstant(constantLong0, constantPoolGen1);
      int int0 = constantPoolGen0.addConstant(constantLong0, constantPoolGen1);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantDouble constantDouble0 = new ConstantDouble(0.0);
      constantArray0[1] = (Constant) constantDouble0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.lookupFloat(1521.259F);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("-/PWsA/h}");
      Constant[] constantArray0 = new Constant[3];
      constantArray0[1] = (Constant) constantUtf8_0;
      constantArray0[2] = (Constant) constantUtf8_0;
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      int int0 = Member.PUBLIC;
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantClass constantClass0 = new ConstantClass(0);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantClass0, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString("pmG$wNEPXb=|mZ6eBX");
      int int0 = constantPoolGen0.addString("pmG$wNEPXb=|mZ6eBX");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      ConstantLong constantLong0 = new ConstantLong(1L);
      constantPoolGen1.addConstant(constantLong0, constantPoolGen0);
      assertEquals(3, constantPoolGen1.getSize());
      
      String string0 = constantPoolGen0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType((-375), (-375));
      ConstantNameAndType constantNameAndType1 = new ConstantNameAndType(constantNameAndType0);
      constantArray0[0] = (Constant) constantNameAndType1;
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-375));
      constantArray0[1] = (Constant) constantMethodType0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("!", "Unknown constant type ", "!");
      int int0 = Pattern.UNICODE_CASE;
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(256, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Constant[] constantArray0 = new Constant[2];
      ConstantClass constantClass0 = new ConstantClass(0);
      ConstantClass constantClass1 = new ConstantClass(constantClass0);
      constantArray0[0] = (Constant) constantClass1;
      ConstantFloat constantFloat0 = new ConstantFloat(0);
      constantArray0[1] = (Constant) constantFloat0;
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      ConstantPoolGen constantPoolGen2 = new ConstantPoolGen();
      int int0 = constantPoolGen1.addConstant(constantFloat0, constantPoolGen2);
      assertEquals(1, int0);
      assertEquals(2, constantPoolGen1.getSize());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      ConstantDouble constantDouble0 = new ConstantDouble((-3828.66));
      int int0 = constantPoolGen0.addConstant(constantDouble0, constantPoolGen1);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("p +", "p +", "p +");
      int int0 = constantPoolGen0.lookupFieldref("p +", "p +", "p +");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInterfaceMethodref("swap", "swap", "org/apache/bcel/verifier/exc/VerifierConstraintViolatedException");
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(6, constantPoolGen0.getSize());
  }
}
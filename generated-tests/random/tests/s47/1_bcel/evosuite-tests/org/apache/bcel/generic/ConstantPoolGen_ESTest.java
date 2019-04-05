/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 08:26:47 GMT 2019
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
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType((-2406), (-2406));
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantNameAndType0, constantPoolGen1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2406
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantClass constantClass0 = new ConstantClass((-2898));
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantClass0, constantPoolGen1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2898
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ConstantString constantString0 = new ConstantString(567);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantString0, constantPoolGen1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 567
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantFieldref constantFieldref0 = new ConstantFieldref(10, 866);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantFieldref0, constantPoolGen1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 866
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(0.0);
      int int0 = constantPoolGen0.addDouble(522.4998573);
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.adjustSize();
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.setConstant((byte)88, (Constant) null);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupMethodref("", "", "");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref("", "", "'*=\"?8;-O 'hh");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFloat(0);
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref((String) null, (String) null, (String) null);
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupDouble((-1909.395));
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getConstant(0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addString("");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addInterfaceMethodref("", "|", "");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addInteger(0);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addFieldref(":", "", "j");
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.addDouble((-1158.71));
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.getConstant(2423);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2423
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        constantPoolGen0.addInterfaceMethodref((String) null, "f", ":");
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
      // Undeclared exception!
      try { 
        constantPoolGen0.addFieldref("/$p4uDa:]v/[", "org/apache/bcel/generic/LREM", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bytes must not be null!
         //
         verifyException("org.apache.bcel.classfile.ConstantUtf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantMethodref constantMethodref0 = new ConstantMethodref(0, 6);
      Constant[] constantArray0 = new Constant[7];
      constantArray0[0] = (Constant) constantMethodref0;
      constantArray0[2] = (Constant) constantMethodref0;
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
  public void test22()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupFieldref("Y,C0gp?XchqmB(C", "Ke1y\"7Dm[=,6bB-", "Y,C0gp?XchqmB(C");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupInterfaceMethodref(", offset delta=", ", offset delta=", ", offset delta=");
      assertEquals((-1), int0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupMethodref("Q", "/l9O\":.QneZLs", "/l9O\":.QneZLs");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupNameAndType("|$y%+HE8K)}Q~&rAfL`", "|$y%+HE8K)}Q~&rAfL`");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addNameAndType("org.apache.bcel.classfile.Utility", "^");
      int int0 = constantPoolGen0.lookupNameAndType("org.apache.bcel.classfile.Utility", "^");
      assertEquals(4, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addNameAndType("&V3:J,7srzg!sIBSI-", "\r");
      int int0 = constantPoolGen0.lookupDouble(3);
      assertEquals(4, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addUtf8(";9My");
      int int0 = constantPoolGen0.addUtf8(";9My");
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.lookupUtf8("ldc");
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("org.apache.bcel.verifier.statics.Pass3aVerifier$InstOperandConstraintVisitor", "org.apache.bcel.verifier.statics.Pass3aVerifier$InstOperandConstraintVisitor", "Z/;tXV65{G");
      int int0 = constantPoolGen0.lookupFloat(822.548F);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInteger(248);
      int int0 = constantPoolGen0.lookupInteger(248);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.lookupClass("_4$f;rV2AL~?");
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.lookupString("I");
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle((-1898), 34);
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantMethodHandle0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown constant type CONSTANT_MethodHandle[15](reference_kind = -1898, reference_index = 34)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref(256, (-461));
      // Undeclared exception!
      try { 
        constantPoolGen0.addConstant(constantInterfaceMethodref0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 256
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ConstantMethodref constantMethodref0 = new ConstantMethodref(46, (-1));
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
  public void test37()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantDouble constantDouble0 = new ConstantDouble(9);
      constantPoolGen0.addConstant(constantDouble0, constantPoolGen0);
      int int0 = constantPoolGen0.lookupDouble(3);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantLong constantLong0 = new ConstantLong(740L);
      int int0 = constantPoolGen0.addConstant(constantLong0, constantPoolGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantFloat constantFloat0 = new ConstantFloat((-797.0F));
      int int0 = constantPoolGen0.addConstant(constantFloat0, constantPoolGen0);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("");
      int int0 = constantPoolGen0.addConstant(constantUtf8_0, constantPoolGen0);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(0.0);
      constantPoolGen0.toString();
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = constantPoolGen0.toString();
      assertEquals("", string0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFieldref("A^A*^T`Wndy", "A^A*^T`Wndy", "A^A*^T`Wndy");
      int int0 = constantPoolGen0.lookupFieldref("A^A*^T`Wndy", "A^A*^T`Wndy", "A^A*^T`Wndy");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addInterfaceMethodref("qlR@^#z6I3bBki", "qlR@^#z6I3bBki", "qlR@^#z6I3bBki");
      int int0 = constantPoolGen0.addInterfaceMethodref("qlR@^#z6I3bBki", "qlR@^#z6I3bBki", "qlR@^#z6I3bBki");
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addMethodref("#", "Ig?D-n,?", "Ig?D-n,?");
      int int0 = constantPoolGen0.addNameAndType("Ig?D-n,?", "Ig?D-n,?");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(0.0);
      int int0 = constantPoolGen0.addDouble(0.0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addLong(959L);
      int int0 = constantPoolGen0.addLong(4616189618054758400L);
      assertEquals(5, constantPoolGen0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addLong((-1));
      int int0 = constantPoolGen0.addLong((-1L));
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addFieldref("Z$A", "+u3vj,^WaGn", "Z$A");
      int int0 = constantPoolGen0.lookupLong(14);
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat((-1.0F));
      int int0 = constantPoolGen0.addFloat((-1));
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat((-1));
      int int0 = constantPoolGen0.lookupFloat((-1.0F));
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addFloat(0.0F);
      int int0 = constantPoolGen0.lookupFloat(4);
      assertEquals(2, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addFieldref("Z$A", "+u3vj,^WaGn", "Z$A");
      int int0 = constantPoolGen0.addFloat(7);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(0.0);
      ConstantInteger constantInteger0 = new ConstantInteger((-1));
      Constant[] constantArray0 = new Constant[7];
      constantArray0[1] = (Constant) constantInteger0;
      constantPoolGen0.constants = constantArray0;
      int int0 = constantPoolGen0.lookupInteger((-803));
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addDouble(0.0);
      ConstantInteger constantInteger0 = new ConstantInteger((-1));
      Constant[] constantArray0 = new Constant[7];
      constantArray0[1] = (Constant) constantInteger0;
      constantPoolGen0.constants = constantArray0;
      int int0 = constantPoolGen0.addConstant(constantInteger0, constantPoolGen0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addClass("mNYd%z");
      int int0 = constantPoolGen0.addMethodref("mNYd%z", "^", "mNYd%z");
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addString(":");
      int int0 = constantPoolGen0.addString(":");
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.size = (-342);
      // Undeclared exception!
      try { 
        constantPoolGen0.addInteger((-3336));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(237, 237);
      constantArray0[1] = (Constant) constantMethodHandle0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Constant[] constantArray0 = new Constant[7];
      ConstantMethodType constantMethodType0 = new ConstantMethodType(229);
      constantArray0[1] = (Constant) constantMethodType0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(7, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.addFloat(7);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Constant[] constantArray0 = new Constant[6];
      ConstantLong constantLong0 = new ConstantLong(2891);
      constantArray0[1] = (Constant) constantLong0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(6, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantInteger constantInteger0 = new ConstantInteger((-3263));
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.setConstant(100, constantInteger0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(256, constantPoolGen1.getSize());
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals(256, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.addDouble(1342.5775);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.addMethodref("6`)2m&@", "6`)2m&@", "");
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(6, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      constantPoolGen0.addInterfaceMethodref("6IcDi!NPP/P", "Z$A", "");
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(7, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Constant[] constantArray0 = new Constant[6];
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic((-3027), 3008);
      constantArray0[2] = (Constant) constantInvokeDynamic0;
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
  public void test68()  throws Throwable  {
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("");
      Constant[] constantArray0 = new Constant[4];
      constantArray0[2] = (Constant) constantUtf8_0;
      constantArray0[3] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      assertEquals(4, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addFieldref("Z$A", "+u3vj,^WaGn", "Z$A");
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(256, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantPoolGen0.addString(":");
      ConstantPool constantPool0 = constantPoolGen0.getConstantPool();
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(256, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
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
  public void test72()  throws Throwable  {
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
  public void test73()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = Type.STRING;
      int int0 = constantPoolGen0.addClass(objectType0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = constantPoolGen0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ArrayType arrayType0 = new ArrayType("org.apache.bcel.generic.INSTANCEOF", 1);
      int int0 = constantPoolGen0.addArrayClass(arrayType0);
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      BasicType basicType0 = Type.FLOAT;
      String[] stringArray0 = new String[0];
      Short short0 = new Short((short) (-1910));
      PUSH pUSH0 = new PUSH(constantPoolGen0, (Number) short0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      MethodGen methodGen0 = new MethodGen(1, basicType0, basicType0.NO_ARGS, stringArray0, "dH&9", "", instructionList0, constantPoolGen0);
      constantPoolGen0.addInterfaceMethodref(methodGen0);
      int int0 = constantPoolGen0.lookupInterfaceMethodref(methodGen0);
      assertEquals(7, constantPoolGen0.getSize());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ConstantPool constantPool0 = constantPoolGen0.getFinalConstantPool();
      assertEquals(1, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
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

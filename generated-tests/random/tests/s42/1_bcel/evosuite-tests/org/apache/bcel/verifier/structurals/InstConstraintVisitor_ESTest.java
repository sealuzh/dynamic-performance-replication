/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 03:56:17 GMT 2019
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ACONST_NULL;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ARRAYLENGTH;
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.BREAKPOINT;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.D2L;
import org.apache.bcel.generic.DADD;
import org.apache.bcel.generic.DCONST;
import org.apache.bcel.generic.DDIV;
import org.apache.bcel.generic.DLOAD;
import org.apache.bcel.generic.DRETURN;
import org.apache.bcel.generic.DSTORE;
import org.apache.bcel.generic.DSUB;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.FCMPL;
import org.apache.bcel.generic.FCONST;
import org.apache.bcel.generic.FDIV;
import org.apache.bcel.generic.FLOAD;
import org.apache.bcel.generic.FMUL;
import org.apache.bcel.generic.FNEG;
import org.apache.bcel.generic.FSTORE;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.GOTO_W;
import org.apache.bcel.generic.I2B;
import org.apache.bcel.generic.I2C;
import org.apache.bcel.generic.I2L;
import org.apache.bcel.generic.IAND;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.generic.IFGT;
import org.apache.bcel.generic.IF_ICMPGE;
import org.apache.bcel.generic.IF_ICMPNE;
import org.apache.bcel.generic.ILOAD;
import org.apache.bcel.generic.IMPDEP1;
import org.apache.bcel.generic.IMPDEP2;
import org.apache.bcel.generic.INEG;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.IOR;
import org.apache.bcel.generic.ISTORE;
import org.apache.bcel.generic.IXOR;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.InvokeInstruction;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.JSR_W;
import org.apache.bcel.generic.LCONST;
import org.apache.bcel.generic.LLOAD;
import org.apache.bcel.generic.LMUL;
import org.apache.bcel.generic.LOR;
import org.apache.bcel.generic.LSHL;
import org.apache.bcel.generic.LSTORE;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.NOP;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUTSTATIC;
import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.generic.SWAP;
import org.apache.bcel.generic.TABLESWITCH;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.verifier.structurals.LocalVariables;
import org.apache.bcel.verifier.structurals.OperandStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InstConstraintVisitor_ESTest extends InstConstraintVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LSTORE lSTORE0 = new LSTORE(0);
      instConstraintVisitor0.visitLSTORE(lSTORE0);
      assertEquals((short)63, lSTORE0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      I2B i2B0 = new I2B();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitI2B(i2B0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LSHL lSHL0 = new LSHL();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLSHL(lSHL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LMUL lMUL0 = new LMUL();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLMUL(lMUL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      IOR iOR0 = new IOR();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIOR(iOR0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      I2L i2L0 = new I2L();
      InstructionList instructionList0 = new InstructionList(i2L0);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) i2L0, (Instruction) i2L0);
      IF_ICMPGE iF_ICMPGE0 = new IF_ICMPGE(instructionHandle0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIF_ICMPGE(iF_ICMPGE0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIFGT((IFGT) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      I2C i2C0 = new I2C();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitI2C(i2C0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FNEG fNEG0 = new FNEG();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFNEG(fNEG0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FDIV fDIV0 = new FDIV();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFDIV(fDIV0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FCMPL fCMPL0 = new FCMPL();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFCMPL(fCMPL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDUP((DUP) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DSUB dSUB0 = new DSUB();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDSUB(dSUB0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ObjectType objectType0 = ObjectType.getInstance("_");
      OperandStack operandStack0 = new OperandStack(57, objectType0);
      Frame frame0 = new Frame((LocalVariables) null, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      SWAP sWAP0 = new SWAP();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitSWAP(sWAP0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(0, (short)224);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitMULTIANEWARRAY(mULTIANEWARRAY0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LOR lOR0 = new LOR();
      LocalVariables localVariables0 = new LocalVariables(647);
      ObjectType objectType0 = Type.CLASS;
      OperandStack operandStack0 = new OperandStack(3, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLOR(lOR0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction LOR constraint violated: The value at the stack top is not of type 'long', but of type 'java.lang.Class'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(2);
      ObjectType objectType0 = Type.STRING;
      OperandStack operandStack0 = new OperandStack(2, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      IXOR iXOR0 = new IXOR();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIXOR(iXOR0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction IXOR constraint violated: The value at the stack top is not of type 'int', but of type 'java.lang.String'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(200, 1);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitINVOKEINTERFACE(iNVOKEINTERFACE0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(489);
      ObjectType objectType0 = Type.CLASS;
      OperandStack operandStack0 = new OperandStack(1276, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      IF_ICMPNE iF_ICMPNE0 = new IF_ICMPNE((InstructionHandle) null);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIF_ICMPNE(iF_ICMPNE0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction IF_ICMPNE constraint violated: The value at the stack top is not of type 'int', but of type 'java.lang.Class'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(1000);
      ObjectType objectType0 = Type.OBJECT;
      OperandStack operandStack0 = new OperandStack(1000, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitI2B((I2B) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ObjectType objectType0 = ObjectType.getInstance("_");
      OperandStack operandStack0 = new OperandStack(57, objectType0);
      Frame frame0 = new Frame((LocalVariables) null, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      FMUL fMUL0 = new FMUL();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFMUL(fMUL0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction FMUL constraint violated: The value at the stack top is not of type 'float', but of type '_'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(2);
      ObjectType objectType0 = Type.STRING;
      OperandStack operandStack0 = new OperandStack(2, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      DRETURN dRETURN0 = new DRETURN();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDRETURN(dRETURN0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction DRETURN constraint violated: The value at the stack top is not of type 'double', but of type 'java.lang.String'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(489);
      ObjectType objectType0 = Type.CLASS;
      OperandStack operandStack0 = new OperandStack(1276, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      DDIV dDIV0 = new DDIV();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDDIV(dDIV0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction DDIV constraint violated: The value at the stack top is not of type 'double', but of type 'java.lang.Class'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      PUTSTATIC pUTSTATIC0 = new PUTSTATIC(1);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitCPInstruction(pUTSTATIC0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(2, 2);
      instConstraintVisitor0.setFrame(frame0);
      IAND iAND0 = (IAND)InstructionConstants.IAND;
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackConsumer(iAND0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction IAND constraint violated: Cannot consume 2 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 2.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(253);
      ObjectType objectType0 = Type.THROWABLE;
      OperandStack operandStack0 = new OperandStack(253, objectType0);
      operandStack0.push(objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      CALOAD cALOAD0 = new CALOAD();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitCALOAD(cALOAD0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction CALOAD constraint violated: The 'index' is not of type int but of type java.lang.Throwable.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LLOAD lLOAD0 = new LLOAD(224);
      instConstraintVisitor0.visitLLOAD(lLOAD0);
      assertEquals((short)22, lLOAD0.getCanonicalTag());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FSTORE fSTORE0 = new FSTORE(983);
      instConstraintVisitor0.visitFSTORE(fSTORE0);
      assertEquals(983, fSTORE0.getIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      CALOAD cALOAD0 = new CALOAD();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitCALOAD(cALOAD0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ISTORE iSTORE0 = new ISTORE(1);
      instConstraintVisitor0.visitISTORE(iSTORE0);
      assertEquals((short)60, iSTORE0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ACONST_NULL aCONST_NULL0 = new ACONST_NULL();
      instConstraintVisitor0.visitACONST_NULL(aCONST_NULL0);
      assertEquals("aconst_null", aCONST_NULL0.getName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      NOP nOP0 = new NOP();
      instConstraintVisitor0.visitNOP(nOP0);
      assertEquals((short)0, nOP0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      BIPUSH bIPUSH0 = new BIPUSH((byte)124);
      instConstraintVisitor0.visitBIPUSH(bIPUSH0);
      assertEquals((short)16, bIPUSH0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ObjectType objectType0 = ObjectType.getInstance("_");
      OperandStack operandStack0 = new OperandStack(57, objectType0);
      Frame frame0 = new Frame((LocalVariables) null, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      INEG iNEG0 = new INEG();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitINEG(iNEG0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction INEG constraint violated: The value at the stack top is not of type 'int', but of type '_'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitJSR_W((JSR_W) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      GETSTATIC gETSTATIC0 = new GETSTATIC(110);
      instConstraintVisitor0.visitGETSTATIC(gETSTATIC0);
      assertEquals(110, gETSTATIC0.getIndex());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DLOAD dLOAD0 = new DLOAD(0);
      instConstraintVisitor0.visitDLOAD(dLOAD0);
      assertEquals(0, dLOAD0.getIndex());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitLSTORE((LSTORE) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ARRAYLENGTH aRRAYLENGTH0 = new ARRAYLENGTH();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitARRAYLENGTH(aRRAYLENGTH0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FLOAD fLOAD0 = new FLOAD(57);
      instConstraintVisitor0.visitFLOAD(fLOAD0);
      assertEquals(57, fLOAD0.getIndex());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      instConstraintVisitor0.setConstantPoolGen(constantPoolGen0);
      GETSTATIC gETSTATIC0 = new GETSTATIC(157);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitFieldInstruction(gETSTATIC0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction GETSTATIC constraint violated: Index '157' should refer to a CONSTANT_Fieldref_info structure, but refers to 'null'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ILOAD iLOAD0 = new ILOAD(1);
      instConstraintVisitor0.visitILOAD(iLOAD0);
      assertEquals((short)21, iLOAD0.getCanonicalTag());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DADD dADD0 = new DADD();
      // Undeclared exception!
      try { 
        dADD0.accept(instConstraintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitTABLESWITCH((TABLESWITCH) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitJSR((JSR) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      SIPUSH sIPUSH0 = new SIPUSH((short) (-656));
      instConstraintVisitor0.visitSIPUSH(sIPUSH0);
      assertEquals("sipush", sIPUSH0.getName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitGOTO((GOTO) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      IMPDEP2 iMPDEP2_0 = new IMPDEP2();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIMPDEP2(iMPDEP2_0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: In this JustIce verification pass there should not occur an illegal instruction such as IMPDEP2.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      GOTO_W gOTO_W0 = new GOTO_W((InstructionHandle) null);
      instConstraintVisitor0.visitGOTO_W(gOTO_W0);
      assertEquals(0, gOTO_W0.getIndex());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ALOAD aLOAD0 = new ALOAD(57);
      instConstraintVisitor0.visitALOAD(aLOAD0);
      assertEquals(57, aLOAD0.getIndex());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ICONST iCONST0 = new ICONST(3);
      instConstraintVisitor0.visitICONST(iCONST0);
      assertEquals((short)6, iCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LCONST lCONST0 = new LCONST(0);
      instConstraintVisitor0.visitLCONST(lCONST0);
      assertEquals(1, lCONST0.getLength());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FLOAD fLOAD0 = new FLOAD(0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLoadInstruction(fLOAD0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DUP dUP0 = (DUP)InstructionConstants.DUP;
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackInstruction(dUP0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitINVOKEDYNAMIC((INVOKEDYNAMIC) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INVOKEDYNAMIC instruction is not supported at this time
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      D2L d2L0 = new D2L();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitD2L(d2L0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.setMethodGen((MethodGen) null);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DSTORE dSTORE0 = new DSTORE(224);
      instConstraintVisitor0.visitDSTORE(dSTORE0);
      assertEquals(2, dSTORE0.getLength());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DCONST dCONST0 = new DCONST(0.0);
      instConstraintVisitor0.visitDCONST(dCONST0);
      assertEquals((short)14, dCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      IMPDEP1 iMPDEP1_0 = new IMPDEP1();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIMPDEP1(iMPDEP1_0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: In this JustIce verification pass there should not occur an illegal instruction such as IMPDEP1.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FCONST fCONST0 = new FCONST(2.0F);
      instConstraintVisitor0.visitFCONST(fCONST0);
      assertEquals((short)13, fCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      BREAKPOINT bREAKPOINT0 = new BREAKPOINT();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitBREAKPOINT(bREAKPOINT0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: In this JustIce verification pass there should not occur an illegal instruction such as BREAKPOINT.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitInvokeInstruction((InvokeInstruction) null);
  }
}

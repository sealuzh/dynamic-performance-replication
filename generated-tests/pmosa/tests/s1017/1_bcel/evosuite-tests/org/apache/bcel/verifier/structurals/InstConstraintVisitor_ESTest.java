/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 12:40:26 GMT 2018
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URI;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.ACONST_NULL;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ARRAYLENGTH;
import org.apache.bcel.generic.ATHROW;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.BREAKPOINT;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.CASTORE;
import org.apache.bcel.generic.CompoundInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DADD;
import org.apache.bcel.generic.DASTORE;
import org.apache.bcel.generic.DCONST;
import org.apache.bcel.generic.DLOAD;
import org.apache.bcel.generic.DMUL;
import org.apache.bcel.generic.DNEG;
import org.apache.bcel.generic.DRETURN;
import org.apache.bcel.generic.DSTORE;
import org.apache.bcel.generic.DSUB;
import org.apache.bcel.generic.DUP_X1;
import org.apache.bcel.generic.F2I;
import org.apache.bcel.generic.F2L;
import org.apache.bcel.generic.FADD;
import org.apache.bcel.generic.FASTORE;
import org.apache.bcel.generic.FCMPL;
import org.apache.bcel.generic.FCONST;
import org.apache.bcel.generic.FDIV;
import org.apache.bcel.generic.FLOAD;
import org.apache.bcel.generic.FRETURN;
import org.apache.bcel.generic.FSTORE;
import org.apache.bcel.generic.FSUB;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.GOTO_W;
import org.apache.bcel.generic.I2C;
import org.apache.bcel.generic.I2F;
import org.apache.bcel.generic.I2L;
import org.apache.bcel.generic.I2S;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.generic.IFEQ;
import org.apache.bcel.generic.IFLT;
import org.apache.bcel.generic.IFNULL;
import org.apache.bcel.generic.IF_ICMPEQ;
import org.apache.bcel.generic.ILOAD;
import org.apache.bcel.generic.IMPDEP1;
import org.apache.bcel.generic.IMPDEP2;
import org.apache.bcel.generic.IMUL;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.IOR;
import org.apache.bcel.generic.ISHL;
import org.apache.bcel.generic.ISHR;
import org.apache.bcel.generic.ISTORE;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.InvokeInstruction;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.JSR_W;
import org.apache.bcel.generic.L2F;
import org.apache.bcel.generic.L2I;
import org.apache.bcel.generic.LADD;
import org.apache.bcel.generic.LASTORE;
import org.apache.bcel.generic.LCMP;
import org.apache.bcel.generic.LCONST;
import org.apache.bcel.generic.LDC2_W;
import org.apache.bcel.generic.LDC_W;
import org.apache.bcel.generic.LLOAD;
import org.apache.bcel.generic.LRETURN;
import org.apache.bcel.generic.LSTORE;
import org.apache.bcel.generic.LSUB;
import org.apache.bcel.generic.LXOR;
import org.apache.bcel.generic.MONITOREXIT;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.NOP;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.POP;
import org.apache.bcel.generic.POP2;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.PUTFIELD;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.ReturnInstruction;
import org.apache.bcel.generic.SASTORE;
import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.generic.StackConsumer;
import org.apache.bcel.generic.StoreInstruction;
import org.apache.bcel.generic.TABLESWITCH;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.verifier.structurals.LocalVariables;
import org.apache.bcel.verifier.structurals.OperandStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InstConstraintVisitor_ESTest extends InstConstraintVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitSIPUSH((SIPUSH) null);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitATHROW((ATHROW) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ILOAD iLOAD0 = new ILOAD(0);
      instConstraintVisitor0.visitILOAD(iLOAD0);
      assertEquals("iload_0", iLOAD0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ACONST_NULL aCONST_NULL0 = new ACONST_NULL();
      instConstraintVisitor0.visitACONST_NULL(aCONST_NULL0);
      FCONST fCONST0 = new FCONST(0.0F);
      instConstraintVisitor0.visitFCONST(fCONST0);
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
  public void test03()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DLOAD dLOAD0 = new DLOAD(432);
      instConstraintVisitor0.visitDLOAD(dLOAD0);
      LCONST lCONST0 = new LCONST(0L);
      instConstraintVisitor0.visitLCONST(lCONST0);
      assertEquals("lconst_0", lCONST0.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(52, 206);
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
  public void test06()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LRETURN lRETURN0 = new LRETURN();
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(2250, 2250);
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
  public void test07()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FSTORE fSTORE0 = new FSTORE(196);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)59;
      byteArray0[1] = (byte)0;
      fSTORE0.toString();
      byte byte0 = (byte)97;
      byteArray0[2] = (byte)97;
      byteArray0[3] = (byte) (-121);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      Instruction.readInstruction(byteSequence0);
      instConstraintVisitor0.visitFSTORE(fSTORE0);
      PUTFIELD pUTFIELD0 = new PUTFIELD(0);
      ConstantPoolGen constantPoolGen0 = null;
      try {
        constantPoolGen0 = new ConstantPoolGen((ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      BIPUSH bIPUSH0 = new BIPUSH((byte)0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "LCONST can be used only for 0 and 1: ");
      instConstraintVisitor0.visitBIPUSH(bIPUSH0);
      PUTFIELD pUTFIELD0 = new PUTFIELD((byte)0);
      pUTFIELD0.toString(false);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitPUTFIELD(pUTFIELD0);
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
      POP2 pOP2_0 = (POP2)InstructionConstants.POP2;
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackInstruction(pOP2_0);
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
      ARRAYLENGTH aRRAYLENGTH0 = new ARRAYLENGTH();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
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
  public void test11()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitISTORE((ISTORE) null);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackConsumer((StackConsumer) null);
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
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DMUL dMUL0 = new DMUL();
      RET rET0 = new RET(1385);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitRET(rET0);
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
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(29);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitINVOKEDYNAMIC(iNVOKEDYNAMIC0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INVOKEDYNAMIC instruction is not supported at this time
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LLOAD lLOAD0 = new LLOAD(0);
      instConstraintVisitor0.visitLLOAD(lLOAD0);
      assertEquals((short)30, lLOAD0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LSUB lSUB0 = new LSUB();
      Constant[] constantArray0 = new Constant[3];
      ALOAD aLOAD0 = new ALOAD(0);
      instConstraintVisitor0.visitALOAD(aLOAD0);
      ConstantPool constantPool0 = null;
      try {
        constantPool0 = new ConstantPool((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DSTORE dSTORE0 = new DSTORE(0);
      instConstraintVisitor0.visitDSTORE(dSTORE0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
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
  public void test18()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LASTORE lASTORE0 = new LASTORE();
      lASTORE0.toString(false);
      F2L f2L0 = new F2L();
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
  public void test19()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LSTORE lSTORE0 = new LSTORE(0);
      instConstraintVisitor0.visitLSTORE(lSTORE0);
      assertEquals(1, lSTORE0.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      JSR jSR0 = new JSR((InstructionHandle) null);
      instConstraintVisitor0.visitJSR(jSR0);
      assertEquals((short)168, jSR0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Cannot produce ");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
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
  public void test23()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(1477, (short)917);
      mULTIANEWARRAY0.getExceptions();
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
  public void test24()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.setMethodGen((MethodGen) null);
      int int0 = 196;
      IOR iOR0 = new IOR();
      iOR0.toString();
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
  public void test25()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      int int0 = 3117;
      GETSTATIC gETSTATIC0 = new GETSTATIC(3117);
      instConstraintVisitor0.visitGETSTATIC(gETSTATIC0);
      DUP_X1 dUP_X1_0 = new DUP_X1();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDUP_X1(dUP_X1_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FRETURN fRETURN0 = new FRETURN();
      PipedInputStream pipedInputStream0 = new PipedInputStream(1229);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      fRETURN0.dump(dataOutputStream0);
      instConstraintVisitor0.visitInvokeInstruction((InvokeInstruction) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      fRETURN0.getType();
      MONITOREXIT mONITOREXIT0 = new MONITOREXIT();
      DRETURN dRETURN0 = new DRETURN();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitDRETURN(dRETURN0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IMUL iMUL0 = new IMUL();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      InstConstraintVisitor instConstraintVisitor1 = new InstConstraintVisitor();
      LCMP lCMP0 = new LCMP();
      DCONST dCONST0 = new DCONST(0.0);
      instConstraintVisitor0.visitDCONST(dCONST0);
      ByteSequence byteSequence0 = null;
      try {
        byteSequence0 = new ByteSequence((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitGOTO_W((GOTO_W) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      NOP nOP0 = new NOP();
      instConstraintVisitor0.visitNOP(nOP0);
      assertEquals((short)0, nOP0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FLOAD fLOAD0 = new FLOAD(529);
      instConstraintVisitor0.visitFLOAD(fLOAD0);
      assertEquals(4, fLOAD0.getLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ICONST iCONST0 = new ICONST(0);
      instConstraintVisitor0.visitICONST(iCONST0);
      assertEquals((short)3, iCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FRETURN fRETURN0 = new FRETURN();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      L2I l2I0 = new L2I();
      LRETURN lRETURN0 = new LRETURN();
      instConstraintVisitor0.visitGOTO((GOTO) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(304);
      LocalVariables localVariables1 = new LocalVariables(304);
      DADD dADD0 = new DADD();
      InstructionList instructionList0 = new InstructionList(dADD0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, "v`xT[fmyjr[T");
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) dADD0, (CompoundInstruction) pUSH0);
      JSR_W jSR_W0 = new JSR_W(instructionHandle0);
      instConstraintVisitor0.visitJSR_W(jSR_W0);
      OperandStack operandStack0 = new OperandStack(304);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Frame frame0 = new Frame(localVariables1, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      I2F i2F0 = new I2F();
      // Undeclared exception!
      try { 
        i2F0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction I2F constraint violated: Cannot consume 1 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 304.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      L2F l2F0 = new L2F();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      instConstraintVisitor0.setConstantPoolGen(constantPoolGen0);
      LDC_W lDC_W0 = new LDC_W(1174);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitCPInstruction(lDC_W0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Huh?! Constant pool index of instruction 'ldc_w[19](3) 1174' illegal? Pass 3a should have checked this!
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FCMPL fCMPL0 = new FCMPL();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      instConstraintVisitor0.setConstantPoolGen(constantPoolGen0);
      LDC_W lDC_W0 = new LDC_W(2);
      LocalVariables localVariables0 = new LocalVariables(2);
      LocalVariables localVariables1 = localVariables0.getClone();
      ObjectType objectType0 = new ObjectType("0?|TI4?5op^>-N\"LV-?");
      OperandStack operandStack0 = new OperandStack(46, objectType0);
      OperandStack operandStack1 = operandStack0.getClone();
      Frame frame0 = new Frame(localVariables1, operandStack1);
      instConstraintVisitor0.setFrame(frame0);
      I2F i2F0 = new I2F();
      // Undeclared exception!
      try { 
        i2F0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction I2F constraint violated: The value at the stack top is not of type 'int', but of type '0?|TI4?5op^>-N\"LV-?'.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }
}

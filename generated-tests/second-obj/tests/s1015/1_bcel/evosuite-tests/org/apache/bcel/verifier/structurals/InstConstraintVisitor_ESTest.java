/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:28:14 GMT 2018
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.AASTORE;
import org.apache.bcel.generic.ACONST_NULL;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ARRAYLENGTH;
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.BREAKPOINT;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.CompoundInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DCONST;
import org.apache.bcel.generic.DLOAD;
import org.apache.bcel.generic.DREM;
import org.apache.bcel.generic.DSTORE;
import org.apache.bcel.generic.DUP2;
import org.apache.bcel.generic.F2L;
import org.apache.bcel.generic.FCONST;
import org.apache.bcel.generic.FLOAD;
import org.apache.bcel.generic.FREM;
import org.apache.bcel.generic.FSTORE;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.GOTO_W;
import org.apache.bcel.generic.I2D;
import org.apache.bcel.generic.IALOAD;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.generic.IFGT;
import org.apache.bcel.generic.ILOAD;
import org.apache.bcel.generic.IMPDEP1;
import org.apache.bcel.generic.IMPDEP2;
import org.apache.bcel.generic.IMUL;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.ISTORE;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.JSR_W;
import org.apache.bcel.generic.L2D;
import org.apache.bcel.generic.LCONST;
import org.apache.bcel.generic.LLOAD;
import org.apache.bcel.generic.LRETURN;
import org.apache.bcel.generic.LSTORE;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.NOP;
import org.apache.bcel.generic.POP;
import org.apache.bcel.generic.POP2;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.PUTSTATIC;
import org.apache.bcel.generic.SALOAD;
import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.generic.TABLESWITCH;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InstConstraintVisitor_ESTest extends InstConstraintVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      I2D i2D0 = new I2D();
      // Undeclared exception!
      try { 
        i2D0.accept(instConstraintVisitor0);
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
      LCONST lCONST0 = new LCONST(0L);
      instConstraintVisitor0.visitLCONST(lCONST0);
      assertEquals(1, lCONST0.getLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DUP2 dUP2_0 = (DUP2)InstructionConstants.DUP2;
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackInstruction(dUP2_0);
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
      FCONST fCONST0 = new FCONST(1.0F);
      instConstraintVisitor0.visitFCONST(fCONST0);
      assertEquals(1, fCONST0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      POP2 pOP2_0 = new POP2();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DLOAD dLOAD0 = new DLOAD(212);
      instConstraintVisitor0.visitDLOAD(dLOAD0);
      assertEquals(212, dLOAD0.getIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      instConstraintVisitor0.setConstantPoolGen(constantPoolGen0);
      assertEquals(1, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitSIPUSH((SIPUSH) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ISTORE iSTORE0 = new ISTORE(1483);
      instConstraintVisitor0.visitISTORE(iSTORE0);
      assertEquals(1483, iSTORE0.getIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(678, (short)359);
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
  public void test11()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ILOAD iLOAD0 = (ILOAD)InstructionConstants.ILOAD_0;
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitLocalVariableInstruction(iLOAD0);
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
      GETSTATIC gETSTATIC0 = new GETSTATIC(0);
      instConstraintVisitor0.visitGETSTATIC(gETSTATIC0);
      assertEquals(3, gETSTATIC0.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      DSTORE dSTORE0 = new DSTORE(46);
      instConstraintVisitor0.visitDSTORE(dSTORE0);
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
  public void test14()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ALOAD aLOAD0 = new ALOAD(2744);
      instConstraintVisitor0.visitALOAD(aLOAD0);
      assertEquals((short)25, aLOAD0.getCanonicalTag());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      I2D i2D0 = new I2D();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitStackConsumer(i2D0);
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
      NOP nOP0 = new NOP();
      instConstraintVisitor0.visitNOP(nOP0);
      assertEquals("nop", nOP0.getName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ICONST iCONST0 = new ICONST(5);
      instConstraintVisitor0.visitICONST(iCONST0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitPOP2((POP2) null);
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
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      ACONST_NULL aCONST_NULL0 = new ACONST_NULL();
      instConstraintVisitor0.visitACONST_NULL(aCONST_NULL0);
      assertEquals((short)1, aCONST_NULL0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.setMethodGen((MethodGen) null);
      SALOAD sALOAD0 = new SALOAD();
      assertEquals(1, sALOAD0.getLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(1, (-675));
      instConstraintVisitor0.setFrame(frame0);
      LSTORE lSTORE0 = new LSTORE(1);
      instConstraintVisitor0.visitLSTORE(lSTORE0);
      assertEquals("lstore_1", lSTORE0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(2013, 2465);
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
  public void test24()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LLOAD lLOAD0 = new LLOAD(539);
      instConstraintVisitor0.visitLLOAD(lLOAD0);
      assertEquals("lload", lLOAD0.getName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      BIPUSH bIPUSH0 = new BIPUSH((byte) (-12));
      instConstraintVisitor0.visitBIPUSH(bIPUSH0);
      assertEquals(2, bIPUSH0.getLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      DREM dREM0 = new DREM();
      JSR_W jSR_W0 = new JSR_W((InstructionHandle) null);
      instConstraintVisitor0.visitJSR_W(jSR_W0);
      assertEquals("jsr_w", jSR_W0.getName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      PUTSTATIC pUTSTATIC0 = new PUTSTATIC(3);
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
  public void test28()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(55, 55);
      instConstraintVisitor0.visitInvokeInstruction(iNVOKEINTERFACE0);
      assertEquals(55, iNVOKEINTERFACE0.getIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FLOAD fLOAD0 = new FLOAD(0);
      instConstraintVisitor0.visitFLOAD(fLOAD0);
      assertEquals(0, fLOAD0.getIndex());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitILOAD((ILOAD) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      GOTO gOTO0 = new GOTO((InstructionHandle) null);
      GOTO gOTO1 = new GOTO((InstructionHandle) null);
      instConstraintVisitor0.visitGOTO(gOTO0);
      F2L f2L0 = new F2L();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitF2L(f2L0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      L2D l2D0 = new L2D();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      SALOAD sALOAD0 = new SALOAD();
      DCONST dCONST0 = new DCONST(0.0);
      instConstraintVisitor0.visitDCONST(dCONST0);
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(2608);
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
  public void test34()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      instConstraintVisitor0.visitGOTO_W((GOTO_W) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FSTORE fSTORE0 = new FSTORE(2003);
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      instConstraintVisitor0.visitFSTORE(fSTORE0);
      FREM fREM0 = (FREM)InstructionConstants.FREM;
      InstructionList instructionList0 = new InstructionList(fREM0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen();
      Boolean boolean0 = new Boolean(false);
      PUSH pUSH0 = new PUSH(constantPoolGen0, boolean0);
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      JSR jSR0 = new JSR(instructionHandle0);
      instConstraintVisitor0.visitJSR(jSR0);
      IFGT iFGT0 = new IFGT(instructionHandle0);
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitIFGT(iFGT0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }
}
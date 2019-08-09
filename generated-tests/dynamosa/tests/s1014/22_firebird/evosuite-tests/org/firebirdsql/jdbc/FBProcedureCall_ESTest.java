/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 19:55:00 GMT 2019
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.jdbc.FBProcedureCall;
import org.firebirdsql.jdbc.FBProcedureParam;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBProcedureCall_ESTest extends FBProcedureCall_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(40, 1283);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "{eC|rqxc @rZK?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-322090513));
      assertEquals((-322090513), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(2);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(37);
      assertEquals(0, fBProcedureParam0.getType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "{eC|rqxc @rZK?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(41, "{eC|rqxc @rZK?");
      fBProcedureCall0.registerOutParam((-1), 2665);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(41, fBProcedureParam0.getPosition());
      assertEquals(2665, fBProcedureParam0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "r");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType((-5496));
      fBProcedureParam0.setIndex((-5496));
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-5496));
      assertEquals(0, fBProcedureParam1.getPosition());
      assertEquals((-5496), fBProcedureParam1.getIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "r");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setIndex(0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(0);
      assertEquals(0, fBProcedureParam1.getPosition());
      assertEquals(0, fBProcedureParam1.getIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("EXECUTE PROCEDURE null");
      String string0 = fBProcedureCall0.getName();
      assertEquals("EXECUTE PROCEDURE null", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(18, "#tCpE>I<YR^|&4@");
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(19, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(817, "obl:4+8.2Ty|@Gvxl");
      fBProcedureParam0.setType(817);
      fBProcedureParam0.setIndex(817);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(817);
      assertEquals(817, fBProcedureParam1.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1385, "org.firebirdsql.gds.GDSException");
      fBProcedureParam0.setIndex(1385);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1385);
      assertEquals(1385, fBProcedureParam1.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(398, "ipdMn03iX?&cLiys3");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam((-1));
      assertEquals(398, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName((String) null);
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      String string0 = fBProcedureCall0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-2095), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2096
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 682);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1325), true);
      assertEquals((-1325), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(37);
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(400, "");
      assertEquals(400, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "{eC|rqxc @rZK?");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-485), ">yp");
      fBProcedureParam0.setType(3856);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -485
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1587, "oo");
      fBProcedureCall0.registerOutParam((-1), (-2975));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals((-2975), fBProcedureParam0.getType());
      assertEquals(1587, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(3430, "{eC|rqxc @rZK?");
      fBProcedureParam0.setIndex(63);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(63);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertFalse(fBProcedureParam0.isValueSet());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1765, "?");
      fBProcedureParam0.setValue("?");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(1765, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "OO/|?nw]r_i");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(40, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2282, "GDS Exception. ");
      fBProcedureParam0.setType(2282);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals("GDS Exception.", fBProcedureParam0.getParamValue());
      assertEquals(2282, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "07005");
      fBProcedureParam0.setType((-1));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "SELECT * FROM null");
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(9, ",i4\"Eg@x>");
      fBProcedureParam0.setIndex(3012);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(9, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(2747);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertFalse(fBProcedureParam0.isParam());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(3749, "Value of parameter ");
      fBProcedureCall0.registerOutParam((-1), 3749);
      // Undeclared exception!
      fBProcedureCall0.registerOutParam(2062, 3749);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(3763);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      fBProcedureCall0.getSQL(true);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(547, "ed4C[rqdc @rZK?");
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 547
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(2497, "nut6|");
      fBProcedureCall0.registerOutParam((-1), (-1));
      fBProcedureCall0.getOutputParam(2);
      fBProcedureCall0.getInputParam(2497);
      // Undeclared exception!
      fBProcedureCall0.getOutputParam(1464);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(3721, "~B/T,.ZY.");
      fBProcedureCall0.registerOutParam((-1), 9);
      // Undeclared exception!
      fBProcedureCall0.getInputParam((-1));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(27707229, "<3r{:Gj`JFj_");
      // Undeclared exception!
      fBProcedureCall0.clone();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-161866393), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-201774121), "jpqlf{");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -201774121
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam((FBProcedureParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam((FBProcedureParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-2), "zK");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "$BqKAd-D[");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(2, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(2137, true);
      assertEquals(2137, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.setName("9!F59a!");
      boolean boolean0 = object0.equals(fBProcedureCall0);
      assertFalse(boolean0);
      assertFalse(object0.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.setName("VAM}F_FRLTivlB");
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      //  // Unstable assertion: assertNotSame(fBProcedureCall1, fBProcedureCall0);
      //  // Unstable assertion: assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = new Object();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(0, "r");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(635, "%o");
      assertEquals(635, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(r, %o)", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4101, "eC[rqxc @rZK?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(547, "eC[rqxc @rZK?");
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Value of parameter -1 not set and it was not registered as output parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(547, "ed4C[rqdc @rZK?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(547, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(ed4C[rqdc @rZK?)", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(41, "{eC|rqxc @rZK?");
      fBProcedureParam0.setValue(fBProcedureCall0);
      assertEquals(41, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null({eC|rqxc @rZK?)", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(41, "iONIuI?Sc^C ");
      assertEquals(41, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(iONIuI?Sc^C)", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1587, "oo");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), (-2975));
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(2497, "nut6|");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2497, "nut6|");
      assertEquals(2497, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(20, "OUTxj#1JdgM bzc)s");
      assertEquals("OUTxj#1JdgM bzc)s", fBProcedureParam0.getParamValue());
      assertEquals(20, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(547, "OUT xj#1JdgM bzc)s");
      assertEquals("xj#1JdgM bzc)s", fBProcedureParam0.getParamValue());
      assertEquals(547, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam((-1));
      assertEquals((-1), fBProcedureParam1.getIndex());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(41, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "{eC|rqxc @rZK?");
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "{eC|rqxc @rZK?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2497, "nut6|");
      assertEquals(2497, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.registerOutParam((-1), (-1));
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2497, "nut6|");
      assertEquals(2497, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = object0.equals(fBProcedureCall0);
      assertTrue(boolean0);
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(887);
      try { 
        fBProcedureParam0.setValue(fBProcedureParam0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("EXECUTE PROCEDURE null");
      fBProcedureCall0.hashCode();
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(0, list0.size());
  }
}
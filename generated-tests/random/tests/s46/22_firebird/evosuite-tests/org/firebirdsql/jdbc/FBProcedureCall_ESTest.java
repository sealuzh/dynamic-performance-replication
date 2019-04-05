/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 08:02:26 GMT 2019
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      String string0 = "v:?";
      fBProcedureCall0.setName("v:?");
      int int0 = (-687);
      fBProcedureCall0.mapOutParamIndexToPosition((-687));
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "v:?");
      fBProcedureParam1.clone();
      fBProcedureParam1.setType((-687));
      fBProcedureCall0.setName("v:?");
      fBProcedureParam1.clone();
      fBProcedureParam1.setIndex((-687));
      fBProcedureParam1.setType(63);
      fBProcedureCall0.clone();
      fBProcedureCall0.addParam(1, "v:?");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.mapOutParamIndexToPosition((-687));
      fBProcedureCall0.mapOutParamIndexToPosition((-687), true);
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
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.setName("v:?");
      fBProcedureCall0.mapOutParamIndexToPosition((-687));
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3, "v:?");
      fBProcedureParam1.clone();
      fBProcedureParam1.setType((-687));
      fBProcedureCall0.setName("v:?");
      fBProcedureParam1.clone();
      fBProcedureParam1.setIndex((-687));
      fBProcedureParam1.setType(63);
      fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.mapOutParamIndexToPosition((-687));
      fBProcedureCall0.mapOutParamIndexToPosition((-687), true);
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-687), "q5");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -687
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("?K1?{]z*");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-2617));
      fBProcedureParam0.setType(774);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(4, "?K1?{]z*");
      fBProcedureCall0.mapOutParamIndexToPosition(4, true);
      fBProcedureParam1.setValue(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      fBProcedureParam1.setValue(fBProcedureParam0);
      int int0 = 59;
      fBProcedureParam1.setType(59);
      fBProcedureCall0.mapOutParamIndexToPosition(4);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.equals("?K1?{]z*");
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(24, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1115, "`1}90HAx,g$,(n|L)");
      fBProcedureParam0.setType(133);
      fBProcedureParam0.setIndex(1241);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType(1115);
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getName();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.clone();
      fBProcedureParam0.setIndex(1241);
      fBProcedureCall0.getOutputParam((-107664730));
      fBProcedureCall0.registerOutParam(1241, (-107664730));
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.getInputParam(1241);
      fBProcedureParam0.setIndex(987);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(31, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("?K1?{]z*");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-2617));
      fBProcedureParam0.setType(774);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(4, "?K1?{]z*");
      fBProcedureCall0.mapOutParamIndexToPosition(4, true);
      fBProcedureCall0.getSQL(false);
      fBProcedureParam1.setValue(fBProcedureParam0);
      int int0 = 59;
      fBProcedureParam1.setType(59);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.equals("?K1?{]z*");
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(0, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 2566;
      fBProcedureCall0.clone();
      fBProcedureCall0.addParam(2566, "maG*2-DQ+o");
      String string0 = "w :J?uxRS.)Zg?u9.zI";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2566, "w :J?uxRS.)Zg?u9.zI");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(2566);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      int int1 = 65;
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(65);
      Object object0 = fBProcedureCall0.clone();
      fBProcedureParam1.setIndex((-2746));
      try { 
        fBProcedureParam1.setValue(object0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(970, "Ex)Q65]cD{O;");
      fBProcedureParam0.setType(970);
      Object object0 = new Object();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.equals(object0);
      fBProcedureCall0.getName();
      fBProcedureCall0.mapOutParamIndexToPosition((-2582));
      try { 
        fBProcedureCall0.registerOutParam(970, 970);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.getOutputParam(1001);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1001);
      //  // Unstable assertion: assertEquals((-2078), fBProcedureParam1.getIndex());
      
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.addParam(40, "57On");
      //  // Unstable assertion: assertEquals(40, fBProcedureParam2.getPosition());
      
      fBProcedureCall0.getSQL(true);
      String string0 = fBProcedureCall0.getSQL(true);
      //  // Unstable assertion: assertEquals("SELECT * FROM null(57On, null)", string0);
      
      FBProcedureParam fBProcedureParam3 = fBProcedureCall0.getOutputParam((-1911));
      //  // Unstable assertion: assertEquals((-2078), fBProcedureParam3.getIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-246515304));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-246515304));
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.clone();
      int int0 = (-246515304);
      fBProcedureCall0.mapOutParamIndexToPosition((-246515304));
      int int1 = (-232396654);
      fBProcedureCall0.getSQL(false);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-232396654), "EXECUTE PROCEDURE null(null)");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -232396654
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(37);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(547);
      fBProcedureCall0.setName((String) null);
      fBProcedureCall0.getName();
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.setName((String) null);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(37, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.equals("EXECUTE PROCEDURE null");
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(0, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.getSQL(true);
      int int0 = 63;
      int int1 = 0;
      try { 
        fBProcedureCall0.registerOutParam(63, 0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 502;
      try { 
        fBProcedureCall0.registerOutParam(502, 502);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = true;
      fBProcedureCall0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(2, true);
      fBProcedureCall0.getOutputParam(2);
      String string0 = "iNHL`ia";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "iNHL`ia");
      fBProcedureParam0.setType(2);
      fBProcedureParam0.setIndex(2);
      fBProcedureParam0.clone();
      fBProcedureCall0.getOutputParam(2);
      fBProcedureCall0.getInputParam(2);
      fBProcedureParam0.setType((-362));
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(2, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "08S01";
      fBProcedureCall0.addParam(2510, "08S01");
      fBProcedureCall0.mapOutParamIndexToPosition((-2281));
      fBProcedureCall0.setName("08S01");
      fBProcedureCall0.mapOutParamIndexToPosition((-2281));
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParam((-1));
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureCall0.getName();
      fBProcedureCall0.equals(object0);
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1267));
      fBProcedureParam0.clone();
      fBProcedureParam0.clone();
      fBProcedureCall0.equals("SELECT * FROM 08S01(08S01)");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getOutputParams();
      fBProcedureParam0.setIndex((-2078));
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), (-1));
      fBProcedureCall0.getOutputParam(37);
      fBProcedureCall0.hashCode();
      // Undeclared exception!
      fBProcedureCall0.getInputParam((-1493));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("v:?");
      fBProcedureCall0.mapOutParamIndexToPosition((-687));
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "v:?");
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex(3);
      fBProcedureParam0.setType((-687));
      fBProcedureCall0.setName("v:?");
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex(18);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType(63);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-687), "q5");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -687
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("M6LH|4Wr[OFCN");
      fBProcedureCall0.equals("M6LH|4Wr[OFCN");
      int int0 = (-2667);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-2667));
      int int1 = 3;
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(3);
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex(2);
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
      try { 
        fBProcedureParam0.setValue(fBProcedureParam1);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-107664730));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -107664731
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addParam(2785, "SELECT * FROM null");
      fBProcedureCall0.getOutputParam(41);
      fBProcedureCall0.addParam(41, "SELECT * FROM null");
      fBProcedureCall0.setName("\t");
      assertEquals("\t", fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1089, ".YG{,I|_^Qim$oj");
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
      Object object0 = new Object();
      fBProcedureCall0.equals(object0);
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
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 40;
      fBProcedureCall0.addParam(40, "08s");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("08s");
      fBProcedureCall0.equals(fBProcedureCall1);
      try { 
        fBProcedureCall0.registerOutParam(2274, 2274);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(547, "");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("VL+`BgG_T1NwH2.(");
      FBProcedureParam fBProcedureParam1 = null;
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
}
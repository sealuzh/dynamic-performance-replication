/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 08:55:09 GMT 2018
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
      fBProcedureCall0.getOutputParam(0);
      int int0 = 40;
      try { 
        fBProcedureCall0.registerOutParam(40, 40);
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
      fBProcedureCall0.setName("07006");
      fBProcedureCall0.addParam(0, "07006");
      fBProcedureCall0.registerOutParam((-1), 0);
      assertEquals("07006", fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1);
      assertEquals(40, fBProcedureParam1.getType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "HY009";
      fBProcedureCall0.setName("HY009");
      int int0 = 0;
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.equals("HY009");
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      Object object0 = new Object();
      try { 
        fBProcedureParam0.setValue(object0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.equals(fBProcedureParam0);
      fBProcedureCall0.setName("cG@I*rs");
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "org.firebirdsql.jdbc.FBProcedureCall$NullParam");
      assertEquals(0, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      int int0 = (-1374);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-1374), (-1374));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1375
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(1280);
      int int0 = (-193);
      fBProcedureParam0.setIndex((-193));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParam(1280);
      try { 
        fBProcedureCall0.registerOutParam(1280, 1280);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1, true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 31;
      fBProcedureCall0.mapOutParamIndexToPosition(31);
      int int1 = 547;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(547);
      try { 
        fBProcedureParam0.setValue(fBProcedureCall0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addParam(222, "");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(222);
      assertEquals((-193), fBProcedureParam0.getIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      int int0 = 3708;
      String string0 = "";
      boolean boolean0 = true;
      fBProcedureCall0.getSQL(true);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(3708, false);
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
      fBProcedureCall0.setName("org.firebirdsql.jdbc.FBProcedureCall");
      fBProcedureCall0.getSQL(false);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.getInputParam(887);
      fBProcedureCall0.equals(fBProcedureCall1);
      fBProcedureCall0.getSQL(true);
      try { 
        fBProcedureCall1.mapOutParamIndexToPosition((-787), false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.setName("'");
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertFalse(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = new Object();
      fBProcedureCall0.equals(object0);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1140));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.setName("ev");
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.setName("ev");
      assertEquals("ev", fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(2);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = (-1168);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.mapOutParamIndexToPosition((-1168));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(2);
      boolean boolean0 = true;
      try { 
        fBProcedureParam1.setValue("SELECT * FROM null");
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("org.firebirdsql.jdbc.FBProcedureCall$NullParam");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(3);
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      String string0 = "";
      fBProcedureCall0.mapOutParamIndexToPosition(1);
      fBProcedureCall0.addParam(3, "");
      fBProcedureCall0.getOutputParam(0);
      try { 
        fBProcedureCall0.registerOutParam(3, 0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(222, "Cannot find parameter with the specified position.");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(222);
      assertFalse(fBProcedureParam0.isParam());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "RvT^Ngh");
      assertEquals(0, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.registerOutParam((-1), (-1204));
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(40, "/K");
      fBProcedureCall0.setName("1[z");
      fBProcedureCall0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "Hlm!(");
      assertEquals(0, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(Hlm!()", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
      
      fBProcedureCall0.setName((String) null);
      fBProcedureCall0.getOutputParams();
      assertTrue(fBProcedureCall0.equals((Object)fBProcedureCall1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.setName("SELECT * FROM");
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(boolean0);
      
      fBProcedureCall0.getInputParams();
      assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.addParam(222, "Cannot find parameter with the specified position.");
      fBProcedureCall1.setName("SELECT * FROM");
      fBProcedureCall1.getOutputParams();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(boolean0);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.getInputParams();
      assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.equals("QY+pv1PKYP'J*aeuqZ");
      fBProcedureCall0.hashCode();
      fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParams();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1072, "EXECUTE PROCEDURE null");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(1072, "QY+pv1PKYP'J*aeuqZ");
      fBProcedureParam1.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(40);
      fBProcedureParam1.setIndex((-118247033));
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(40, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      int int0 = 10;
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(1220, "Za%[WrV?2Jd;b");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-1412));
      Object object0 = new Object();
      fBProcedureCall0.equals(object0);
      int int1 = (-243294951);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-243294951), "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -243294951
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(26, "[:@TD/?4!58{f&ycM_");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getName();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(26, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = new Object();
      fBProcedureCall0.addParam(5, "m?X");
      fBProcedureCall0.getInputParam(3);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.getSQL(false);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(11, "6n^>[n5Tn?K(5dVZvz");
      assertEquals(11, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(6n^>[n5Tn?K(5dVZvz)", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getName();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(410, "tn");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(410, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.setName("r]*");
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.addParam(0, "Tnhod!./$lO~O4xF=");
      fBProcedureCall0.getName();
      fBProcedureCall0.registerOutParam((-1), (-2456));
      assertNotSame(fBProcedureCall0, object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(2291);
      assertEquals(2291, int0);
      
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(618, "m?X");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(618, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.getInputParam(4);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(null, m?X)", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.mapOutParamIndexToPosition(2291);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(618, "m?X");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      assertEquals(0, fBProcedureParam1.getPosition());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("OUT");
      fBProcedureCall0.addParam(888, "IN!tSNCq!qJ_'(mm");
      try { 
        fBProcedureCall0.registerOutParam(888, 3942);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(31);
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(188, "0It5c\"O?J");
      fBProcedureParam1.setValue(fBProcedureCall0);
      fBProcedureParam1.setIndex(7);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.getName();
      fBProcedureCall0.setName((String) null);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParam(188);
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }
}
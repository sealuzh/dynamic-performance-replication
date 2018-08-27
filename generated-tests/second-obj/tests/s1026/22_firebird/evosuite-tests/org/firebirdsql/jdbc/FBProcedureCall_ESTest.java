/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 12:13:14 GMT 2018
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
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParam(1624);
      assertNotSame(fBProcedureCall0, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(9, 9);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-71), false);
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
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "LqFR~oKT[eMPlX");
      assertEquals(40, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(19, "LqFR~oKT[eMPlX");
      assertEquals(19, fBProcedureParam0.getPosition());
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(19);
      assertEquals(9, fBProcedureParam1.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4, "OKimP}wy%1W");
      assertEquals(4, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(OKimP}wy%1W)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition((-707));
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-707), "_c6");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -707
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParams();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1815), "HY009");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1815
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(19, "LqFR~oKT[eMPlX");
      assertEquals(19, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(64);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(null, null)", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(3185);
      assertEquals(3185, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.getInputParams();
      assertNotSame(fBProcedureCall0, object0);
      assertTrue(fBProcedureCall0.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(38);
      try { 
        fBProcedureParam0.setValue("ot");
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
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(19, "LqFR~oKT[eMPlX");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(19, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(887, "08006");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(887, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(887, true);
      assertEquals(887, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getName();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(37, "ou");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(37, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-75753521), "vDDF0rxN'");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -75753521
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(243);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(243, 243);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "s.qFKw?q5N=5SHd");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getName();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      int int1 = fBProcedureCall0.hashCode();
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "s.qFKw?q5N=5SHd");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.equals("s.qFKw?q5N=5SHd");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
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
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "s.qFKw?q5N=5SHd");
      fBProcedureParam0.setType(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
      
      int int1 = fBProcedureCall0.hashCode();
      assertFalse(int1 == int0);
      
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
      
      int int2 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int2);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "s.qFKw?q5N=5SHd");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.equals("SELECT * FROM null(s.qFKw?q5N=5SHd)");
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setIndex(243);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(243, 243);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "s.qFKw?q5N=5SHd");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getName();
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.equals("s.qFKw?q5N=5SHd");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.getInputParam(0);
      int int1 = fBProcedureCall0.hashCode();
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("/(Zrv+!#");
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      fBProcedureCall0.hashCode();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      String string0 = "s.qFKw?q5N=5SHd";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2873, "s.qFKw?q5N=5SHd");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(0, "s.qFKw?q5N=5SHd");
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
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-8339742);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-8339742), "inq");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -8339742
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "s.qFKw?q5N=5SHd");
      fBProcedureParam0.setValue("s.qFKw?q5N=5SHd");
      fBProcedureParam0.setType(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getName();
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.equals("s.qFKw?q5N=5SHd");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.registerOutParam(0, (-1067));
      int int1 = fBProcedureCall0.hashCode();
      assertFalse(int1 == int0);
  }
}
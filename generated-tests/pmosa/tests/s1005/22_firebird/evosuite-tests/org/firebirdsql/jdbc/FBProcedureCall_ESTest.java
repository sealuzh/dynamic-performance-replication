/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 04:46:56 GMT 2018
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
      fBProcedureCall0.getOutputParam(0);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2116, ":DzD$6@9BoLR;");
      fBProcedureCall0.getOutputParam(186);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(547);
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(2116);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      assertEquals(0, fBProcedureParam1.getPosition());
      
      fBProcedureCall0.hashCode();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(3);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(0, "01S00");
      fBProcedureCall0.registerOutParam((-1), (-3047));
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(171);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(845, "{4_Fq]e: =<k");
      assertEquals(845, fBProcedureParam1.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 502;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(502);
      fBProcedureCall0.setName("");
      fBProcedureParam0.setType(502);
      int int1 = 0;
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.equals("");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getInputParams();
      int int2 = 0;
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
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(null)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      fBProcedureCall0.getOutputParam(0);
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
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
      
      fBProcedureCall1.addParam(0, "WPZoIO(gXk1r#Krc");
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertNotSame(fBProcedureCall1, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 31;
      fBProcedureCall0.mapOutParamIndexToPosition(31);
      boolean boolean0 = true;
      fBProcedureCall0.mapOutParamIndexToPosition(289, true);
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(289);
      fBProcedureCall0.equals(object0);
      int int1 = 1945;
      fBProcedureCall0.getInputParam(1945);
      fBProcedureCall0.getName();
      boolean boolean1 = false;
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam(1945, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition((-1093));
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(2);
      int int0 = (-2980);
      fBProcedureParam0.clone();
      fBProcedureParam0.setType((-2980));
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
      int int0 = (-201);
      fBProcedureCall0.addParam(0, "");
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-201), (-696));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -202
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 0;
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.setName("S_;\"Hn!\u0006?");
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(981, "You cannot set value of an non-existing parameter.");
      fBProcedureParam0.setType(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      Object object0 = new Object();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("!c|`J%w[2:(VBju;*Tr");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.mapOutParamIndexToPosition((-199));
      fBProcedureCall0.equals(fBProcedureCall1);
      fBProcedureCall1.getSQL(true);
      FBProcedureCall fBProcedureCall2 = (FBProcedureCall)fBProcedureCall1.clone();
      // Undeclared exception!
      try { 
        fBProcedureCall2.addParam((-199), "Cannot find parameter with the specified position.");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -199
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(1931, true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1561, "8g'");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), 1561);
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-2371);
      fBProcedureCall0.addParam(3, "-t^;X'>?W)>pTy$;");
      fBProcedureCall0.mapOutParamIndexToPosition((-2371));
      fBProcedureCall0.mapOutParamIndexToPosition(3, true);
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      boolean boolean0 = true;
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("SELECT * FROM null(-t^;X'>?W)>pTy$;)");
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(3);
      int int1 = 1241;
      Object object0 = new Object();
      try { 
        fBProcedureParam0.setValue(object0);
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
      fBProcedureCall0.addParam(0, ":/?J]${r*");
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.registerOutParam((-1), (-1));
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "-t^;X'>?W)>pTy$;");
      fBProcedureCall0.mapOutParamIndexToPosition((-2371));
      fBProcedureCall0.mapOutParamIndexToPosition(3, true);
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("SELECT * FROM null(-t^;X'>?W)>pTy$;)");
      fBProcedureCall0.getSQL(true);
      Object object0 = new Object();
      fBProcedureParam0.setValue(object0);
      fBProcedureParam0.setIndex(3);
      fBProcedureCall0.equals(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getName();
      fBProcedureCall0.getName();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-2371));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2372
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "-t^;X'>?W)>pTy$;");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(3, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1933);
      assertEquals(1933, int0);
      
      fBProcedureCall0.clone();
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1, "J^H?:*<uyaS}#*[&B");
      fBProcedureCall0.registerOutParam((-1), 1);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1), false);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3964, " not set and ");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals("not set and", fBProcedureParam0.getParamValue());
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3964, "-t^;X'>?W)>pTy$;");
      assertEquals(3964, fBProcedureParam1.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(-t^;X'>?W)>pTy$;)", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, ":/?J]${r*");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.registerOutParam((-1), (-1));
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(37, "inPi{");
      assertEquals("inPi{", fBProcedureParam0.getParamValue());
      assertEquals(37, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 5032;
      fBProcedureCall0.setName("i3EZ7|vU7Oh=pmG+Ii");
      int int1 = 178;
      fBProcedureCall0.getOutputParam(2);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.getOutputParam(599);
      fBProcedureCall0.addParam(599, " out_t 'd ");
      try { 
        fBProcedureCall1.registerOutParam(5032, 599);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName(" out_t 'd ");
      fBProcedureCall0.getOutputParam(3);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(564, " out_t 'd ");
      assertEquals(564, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.hashCode();
      assertTrue(fBProcedureCall0.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3969, "^f@r2=u?%&>hHL-#EN");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.registerOutParam((-1), 3969);
      fBProcedureCall0.setName("o=S!SL @");
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, ":/?J]${r*");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(197, ":/?J]${r*");
      fBProcedureParam0.setValue(fBProcedureParam1);
      fBProcedureCall0.registerOutParam((-1), (-1));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      int int0 = 2111;
      try { 
        fBProcedureCall0.registerOutParam(2111, 2657);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }
}
/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 09:44:48 GMT 2019
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
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-679));
      fBProcedureCall0.addParam(3705, "OBckArdT-?~");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "AJ?t2O~XB'$z}");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName(",q");
      String string0 = fBProcedureCall0.getName();
      assertEquals(",q", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1419, "?f6d{.In'");
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(1420, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1419, "?f6d{.In'");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(1419, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType(261);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2619, "ZMht5&*");
      fBProcedureParam0.setIndex(692);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(2619, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam(0, (String) null);
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
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1309), "ex");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1309
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-95699257));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -95699258
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("9xi");
      fBProcedureCall0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("kjI2@cmH");
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("kjI2@cmH");
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      //  // Unstable assertion: assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1789, "{Q zp^BaYD(?91#W");
      assertEquals(1789, fBProcedureParam1.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(null, {Q zp^BaYD(?91#W)", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1789, "{Q zp^BaYD(?91#W");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(1789, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null({Q zp^BaYD(?91#W)", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "AJ?t2O~XB'$z}");
      fBProcedureParam0.setValue(fBProcedureCall0);
      assertEquals(2, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(AJ?t2O~XB'$z})", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1419, "?f6d{.In'");
      fBProcedureParam0.setIndex(1419);
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.registerOutParam(1419, 1);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1454, "^As+QAo\"");
      fBProcedureCall0.registerOutParam((-1), (-4697));
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1419, "?f6d{.In'");
      fBProcedureParam0.setIndex(1419);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(1419, 1);
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(1177);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(50, "");
      assertEquals(50, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1690, "iNBAS]If1N_");
      assertEquals(1690, fBProcedureParam0.getPosition());
      assertEquals("iNBAS]If1N_", fBProcedureParam0.getParamValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(216);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertNull(fBProcedureParam0.getParamValue());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(2311, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1419, "?f6d{.In'");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setIndex((-1724));
      assertEquals(1419, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1724), true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1419, "?f6d{.In'");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(1419, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1724), true);
      assertEquals((-1724), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(216);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(766);
      assertEquals(766, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1419, "?f6d{.In'");
      try { 
        fBProcedureCall0.registerOutParam(1419, 1);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(216);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-228210849), (-228210849));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -228210850
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1419, "?f6d{.In'");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(1419, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(1438);
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
  public void test38()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-95699257));
      assertEquals((-95699257), int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertTrue(list0.isEmpty());
  }
}
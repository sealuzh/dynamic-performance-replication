/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:18:19 GMT 2018
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
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-901));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(2554);
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(2554, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "tz4");
      assertEquals(1, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(0, "ZK4)1");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(3816);
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(53, "Beha");
      assertEquals(53, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(Beha)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(63, "@l");
      assertEquals(63, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-649);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-649), "B(Lr+&W%~6+<.");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -649
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1348, "org.firebirdsql.jdbc.FBProcedureCall$NullParam");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(1348, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getName();
      try { 
        fBProcedureCall0.registerOutParam(342, 342);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(412, "otset ");
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-466), 412);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -467
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getName();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(887);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1714));
      assertEquals((-1714), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      assertTrue(boolean0);
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(51, true);
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
      
      fBProcedureCall0.getInputParams();
      Object object0 = fBProcedureCall0.clone();
      object0.hashCode();
      boolean boolean0 = object0.equals(fBProcedureCall0);
      assertTrue(boolean0);
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("HY105");
      fBProcedureCall0.hashCode();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall0.setName("Resource Exception. ");
      fBProcedureCall0.equals(object0);
      fBProcedureCall1.getInputParams();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-1183), 493);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1184
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-901));
      fBProcedureParam0.clone();
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
  public void test18()  throws Throwable  {
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3349, "?u");
      assertEquals(3349, fBProcedureParam1.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(null, ?u)", string0);
      
      boolean boolean0 = fBProcedureCall0.equals("SELECT * FROM null(null, ?u)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(1616, "kOMVYc5\"RQP?\u0004m\"/V");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1616);
      int int1 = fBProcedureCall0.hashCode();
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "M>(&EEQ<8R$Hp|:.&@B");
      fBProcedureParam0.setIndex(3);
      fBProcedureCall0.registerOutParam(3, 3);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(1645, "in>5472");
      assertEquals("in>5472", fBProcedureParam1.getParamValue());
      
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(1646, list0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "01S0)6");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType(3);
      FBProcedureParam fBProcedureParam1 = (FBProcedureParam)fBProcedureParam0.clone();
      fBProcedureParam0.setIndex(3);
      fBProcedureCall0.registerOutParam(3, 3);
      fBProcedureCall0.getOutputParams();
      fBProcedureParam1.setIndex(3);
      assertEquals(3, fBProcedureParam0.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(342, "?gf&./");
      assertEquals(342, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(?gf&./)", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1645, "kOMVYc5\"RQP?\u0004m\"/V");
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(1645, "kOMVYc5\"RQP?\u0004m\"/V");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      boolean boolean0 = FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY;
      fBProcedureCall0.mapOutParamIndexToPosition(1645, true);
      fBProcedureCall0.hashCode();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(1635, "kOMVYc5\"RQP?\u0004m\"/V");
      fBProcedureParam0.setType(1635);
      fBProcedureParam0.setIndex(1635);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1635);
      int int1 = fBProcedureCall0.hashCode();
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
      
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      fBProcedureCall0.setName("SELECT * FROM null");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean1 = fBProcedureCall1.equals(fBProcedureCall0);
      assertFalse(boolean1 == boolean0);
      
      int int0 = fBProcedureCall1.mapOutParamIndexToPosition((-743));
      assertEquals((-743), int0);
      
      fBProcedureCall1.getOutputParam((-743));
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1643, "kOMVYc5\"RQP?\u0004m\"/V");
      Object object0 = new Object();
      fBProcedureParam0.setValue(object0);
      fBProcedureParam0.setIndex(1643);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.hashCode();
      Object object1 = new Object();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1643);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.registerOutParam(1643, 1643);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.equals(fBProcedureParam1);
      assertEquals(1643, fBProcedureParam1.getType());
      
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(1644, list0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1602, "kOMVYc5\"RQP?\u0004m\"/V");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      int int0 = 109;
      fBProcedureParam0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(109, "kOMVYc5\"RQP?\u0004m\"/V");
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      fBProcedureParam1.setIndex(109);
      fBProcedureCall1.mapOutParamIndexToPosition(1602);
      fBProcedureCall0.getOutputParam(1603);
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.mapOutParamIndexToPosition(1535);
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Value of parameter 109 not set and it was not registered as output parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "in 5472";
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-3636), "in 5472");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3636
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1645, "kOMVYc5\"RQP?\u0004m\"/V");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(1645, "kOMVYc5\"RQP?\u0004m\"/V");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureParam0.setValue("kOMVYc5\"RQP?\u0004m\"/V");
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.equals(fBProcedureParam0);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(1645, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }
}
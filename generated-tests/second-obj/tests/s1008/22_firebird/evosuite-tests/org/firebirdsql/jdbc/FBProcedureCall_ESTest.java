/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 21:56:58 GMT 2018
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
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
      
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(10, "SELECT * FROM null");
      assertEquals(10, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(146, 146);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(41);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(41);
      assertEquals(41, int0);
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(4914, "jL-+BCGlejk");
      try { 
        fBProcedureCall0.registerOutParam(4914, 4914);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-14506066));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(4914, fBProcedureParam0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = new Object();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getName();
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(13, ";5");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(13, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-3261));
      assertEquals((-3261), int0);
      
      fBProcedureCall0.getName();
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.setName(";5");
      assertNotSame(fBProcedureCall0, object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(41);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(1427);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(4914, fBProcedureParam0.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(10);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(10, "SELECT * FROM null(null, null)");
      assertEquals(10, fBProcedureParam1.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(41, "jL-+BCGlejk");
      fBProcedureParam0.setIndex(41);
      fBProcedureCall0.hashCode();
      Object object0 = fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(41);
      assertNotSame(fBProcedureCall0, object0);
      assertEquals(41, fBProcedureParam1.getIndex());
      assertTrue(fBProcedureCall0.equals((Object)object0));
      assertSame(fBProcedureParam1, fBProcedureParam0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
      
      fBProcedureCall1.addParam(1433, "&m");
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParams();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-3302));
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
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
      
      fBProcedureCall0.setName("");
      int int1 = fBProcedureCall0.hashCode();
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(622, "?f::jq@Zf@A>;]zT2");
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-49), (-2079));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -50
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(13);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(669, "?f::jq@Zf@A>;]zT2");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-49));
      assertEquals((-49), int0);
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(?f::jq@Zf@A>;]zT2)", string0);
      
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(670, list0.size());
      assertNotSame(fBProcedureCall0, object0);
      assertTrue(fBProcedureCall0.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.setName("q?3U, M~hCU@K849tO");
      fBProcedureCall0.equals(fBProcedureCall1);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      int int0 = 789;
      int int1 = (-500);
      Object object0 = new Object();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object1 = new Object();
      fBProcedureCall0.mapOutParamIndexToPosition(0);
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
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4929, " not set and ");
      fBProcedureCall0.mapOutParamIndexToPosition(4929);
      fBProcedureParam0.setIndex(4929);
      fBProcedureCall0.registerOutParam(4929, 4929);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(4929, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(20, "{5`");
      fBProcedureParam0.setType(20);
      fBProcedureParam0.setIndex(20);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.registerOutParam(20, 20);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(20, fBProcedureParam0.getType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(669, "?f::jq@Zf@A>;]zT2");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-14506076), "?f::jq@Zf@A>;]zT2");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -14506076
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 682;
      fBProcedureCall0.addParam(13, "?f::jq@Zf@A>;]zT2");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(682, "?f::jq@Zf@A>;]zT2");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-49));
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
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("Specified parmeter does not exist.");
      fBProcedureCall0.getSQL(true);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
      
      fBProcedureCall1.mapOutParamIndexToPosition(1433, true);
      fBProcedureCall1.addParam(1433, "&m");
      fBProcedureCall0.clone();
      assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
      
      fBProcedureCall1.hashCode();
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4912, " not set and ");
      fBProcedureParam0.setType(4912);
      fBProcedureCall0.mapOutParamIndexToPosition(4912);
      fBProcedureParam0.clone();
      fBProcedureParam0.setType((-1));
      fBProcedureParam0.setIndex((-1));
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex(4912);
      fBProcedureCall0.registerOutParam(4912, 4912);
      fBProcedureCall0.mapOutParamIndexToPosition(2, true);
      Object object0 = new Object();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(4912, "?EmjNdbj4WI6Z/>");
      fBProcedureCall0.registerOutParam((-1), 2);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.addOutputParam(fBProcedureParam1);
      Object object1 = new Object();
      fBProcedureCall0.setName("&");
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      fBProcedureParam1.clone();
      // Undeclared exception!
      fBProcedureCall0.mapOutParamIndexToPosition(2, true);
  }
}
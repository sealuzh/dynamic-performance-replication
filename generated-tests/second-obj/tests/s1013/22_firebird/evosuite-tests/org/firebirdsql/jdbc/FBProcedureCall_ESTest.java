/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:18:54 GMT 2018
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
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "E;Wd-\"U!4t\"`EXJA");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(40, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(25, "'");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(25, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("x~");
      fBProcedureCall0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(758, "HY009");
      try { 
        fBProcedureCall0.registerOutParam(758, 758);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(884);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(null)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(573, 573);
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
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = object0.equals(fBProcedureCall0);
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-457);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-457));
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
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-3497), "xt");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3497
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-3034), "X-ICO=di*T*oA:");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3034
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(818, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "No6]x<~aV^Ux");
      assertEquals(1, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, "hT!N^H;Fb2");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-970));
      assertEquals((-970), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(3109);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(null, null)", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(4, "");
      assertEquals(4, fBProcedureParam1.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(3, "");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.getInputParam(3);
      assertFalse(fBProcedureCall0.equals((Object)object0));
      assertNotSame(fBProcedureCall0, object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(887);
      String string0 = "DM*]&lgV?";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(887);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getName();
      fBProcedureCall0.mapOutParamIndexToPosition((-1));
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.setName("DM*]&lgV?");
      fBProcedureCall0.equals(fBProcedureCall1);
      // Undeclared exception!
      try { 
        fBProcedureCall1.addParam(887, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(37);
      assertEquals(37, int0);
      
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(37, "OuVr23|mMnrm!)ut4");
      fBProcedureParam0.setType(37);
      fBProcedureParam0.setType(1);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.registerOutParam((-1), (-1));
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(38, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("hnm");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.getName();
      assertTrue(fBProcedureCall0.equals((Object)fBProcedureCall1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(5, "fsb8OGH3/2sSK&?");
      fBProcedureParam1.setIndex(5);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(fsb8OGH3/2sSK&?)", string0);
      
      fBProcedureCall0.getOutputParam(5);
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getInputParam(5);
      fBProcedureCall0.getName();
      FBProcedureParam fBProcedureParam3 = (FBProcedureParam)fBProcedureParam2.clone();
      assertEquals(0, fBProcedureParam3.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(1);
      fBProcedureCall0.addParam(1, "B!F\"(KD}?");
      int int0 = 40;
      fBProcedureCall0.getOutputParam(40);
      fBProcedureCall0.getOutputParams();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(25, "wu'");
      fBProcedureParam0.setIndex(25);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.equals(fBProcedureParam0);
      Object object0 = new Object();
      fBProcedureCall0.equals(object0);
      fBProcedureCall0.registerOutParam(25, 25);
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(5, "fsb8OGH3/2sSK&?");
      fBProcedureParam1.setIndex(5);
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getOutputParam(5);
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getInputParam(5);
      assertEquals(5, fBProcedureParam2.getIndex());
      
      fBProcedureParam2.setValue("SELECT * FROM null(fsb8OGH3/2sSK&?)");
      fBProcedureParam2.clone();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(fsb8OGH3/2sSK&?)", string0);
      
      fBProcedureParam2.clone();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(5);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(445, "@o[(@$,RkKi%|0a8g?");
      fBProcedureParam0.setIndex(445);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam((-51), "@o[(@$,RkKi%|0a8g?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.setName((String) null);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(446, list0.size());
      
      fBProcedureCall0.setName((String) null);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(@o[(@$,RkKi%|0a8g?)", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(874);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(874, "DM*]&lgV?");
      fBProcedureCall0.setName("DM*]&lgV?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(874, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.getName();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(25);
      assertEquals(25, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(874);
      fBProcedureCall0.getName();
      fBProcedureCall0.equals((Object) null);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(874, "DM*]&lgV?");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.setName("DM*]&lgV?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.addParam(37, "EXECUTE PROCEDURE DM*]&lgV?(DM*]&lgV?)");
      try { 
        fBProcedureCall0.getSQL(false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Value of parameter -1 not set and it was not registered as output parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(874);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(874, "DM*]&lgV?");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.setName("DM*]&lgV?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(874, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.getName();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(5, "fsb8OGH3/2sSK&?");
      fBProcedureParam0.setIndex(5);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(fsb8OGH3/2sSK&?)", string0);
      
      fBProcedureCall0.getInputParam(5);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(5);
      fBProcedureParam1.setValue("SELECT * FROM null(fsb8OGH3/2sSK&?)");
      fBProcedureParam1.clone();
      fBProcedureParam1.clone();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(5);
      assertEquals(5, int0);
      
      fBProcedureCall0.registerOutParam(5, 3532);
      FBProcedureParam fBProcedureParam2 = new FBProcedureParam();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureParam2);
      assertFalse(boolean0);
      
      fBProcedureCall0.hashCode();
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 10:06:38 GMT 2019
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.gds.XSQLDA;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][7];
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][1];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.afterLast();
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.next();
      assertFalse(fBCachedFetcher0.isFirst());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.relative(2);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize(76);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(76, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.setFetchSize((-1603));
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals((-1603), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.first();
      assertTrue(fBCachedFetcher0.isLast());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.absolute(1);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize(0);
      assertEquals(0, fBCachedFetcher0.getFetchSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.relative(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[2][1];
      // Undeclared exception!
      try { 
        fBCachedFetcher0.insertRow(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][1];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative((-4297));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][1];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.previous();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][1];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[3][8];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.last();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[0][0];
      // Undeclared exception!
      try { 
        fBCachedFetcher0.insertRow(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[3][9];
      linkedList0.add(0, byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.beforeFirst();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.absolute((-4295));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isAfterLast();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      boolean boolean0 = fBCachedFetcher0.isAfterLast();
      assertFalse(fBCachedFetcher0.isLast());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][1];
      boolean boolean0 = linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean1 = fBCachedFetcher0.isBeforeFirst();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.isBeforeFirst();
      assertFalse(boolean0);
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isBeforeFirst();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[5][0];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.last();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.first();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.next();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][1];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertTrue(fBCachedFetcher0.isBeforeFirst());
      
      fBCachedFetcher0.updateRow(byteArray0);
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isLast());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      boolean boolean0 = fBCachedFetcher0.next();
      assertEquals(2, fBCachedFetcher0.getRowNum());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isEmpty());
      
      fBCachedFetcher0.deleteRow();
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(fBCachedFetcher0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[5][6];
      // Undeclared exception!
      try { 
        fBCachedFetcher0.updateRow(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.relative(3165);
      assertFalse(fBCachedFetcher0.isLast());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.absolute((byte) (-84));
      assertFalse(fBCachedFetcher0.isLast());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      try { 
        fBCachedFetcher0.absolute(0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot position to the row 0 with absolute() method.
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(fBCachedFetcher0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA(1005);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, (-3198), 1024, isc_stmt_handle_impl0, fBResultSet0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.field.FBField", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(0, fBCachedFetcher0.getRowNum());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      fBCachedFetcher0.beforeFirst();
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.close();
      assertTrue(fBCachedFetcher0.isLast());
  }
}
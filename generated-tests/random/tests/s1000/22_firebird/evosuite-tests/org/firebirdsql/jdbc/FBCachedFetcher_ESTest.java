/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:39:14 GMT 2019
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedTransferQueue;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl;
import org.firebirdsql.jca.FBConnectionRequestInfo;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.AbstractStatement;
import org.firebirdsql.jdbc.DummyCallableStatementMetaData;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBConnection;
import org.firebirdsql.jdbc.FBFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.firebirdsql.jdbc.field.FBCachedBlobField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[7][4];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-2);
      byteArray1[1] = (byte)63;
      byteArray1[2] = (byte) (-11);
      byteArray1[3] = (byte)44;
      byteArray1[4] = (byte)53;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte) (-125);
      byteArray2[1] = (byte)53;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[0];
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[6];
      byteArray4[0] = (byte) (-11);
      byteArray4[1] = (byte) (-125);
      byteArray4[2] = (byte) (-2);
      byteArray4[3] = (byte) (-125);
      byteArray4[4] = (byte) (-65);
      byteArray4[5] = (byte)44;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[8];
      byteArray5[0] = (byte) (-125);
      byteArray5[1] = (byte) (-2);
      byteArray5[2] = (byte) (-125);
      byteArray5[3] = (byte)53;
      byteArray5[4] = (byte)44;
      byteArray5[5] = (byte) (-125);
      byteArray5[6] = (byte)53;
      byteArray5[7] = (byte)44;
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[8];
      byteArray6[0] = (byte) (-11);
      byteArray6[1] = (byte) (-11);
      byteArray6[2] = (byte) (-65);
      byteArray6[3] = (byte) (-125);
      byteArray6[4] = (byte) (-11);
      byteArray6[5] = (byte) (-2);
      byteArray6[6] = (byte) (-65);
      byteArray6[7] = (byte)44;
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[1];
      byteArray7[0] = (byte)63;
      byteArray0[6] = byteArray7;
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.first();
      linkedList0.spliterator();
      fBCachedFetcher0.relative(1211);
      fBCachedFetcher0.close();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertEquals(3, fBCachedFetcher0.getRowNum());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[2][9];
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)77;
      byteArray1[1] = (byte) (-30);
      byteArray1[2] = (byte)68;
      byteArray1[3] = (byte)104;
      byteArray1[4] = (byte) (-17);
      byteArray1[5] = (byte) (-61);
      byteArray1[6] = (byte)26;
      byteArray1[7] = (byte)109;
      byteArray1[8] = (byte) (-128);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte)77;
      byteArray2[1] = (byte)109;
      byteArray2[2] = (byte) (-61);
      byteArray2[3] = (byte)77;
      byteArray2[4] = (byte)109;
      byteArray2[5] = (byte)104;
      byteArray0[1] = byteArray2;
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(1918);
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertTrue(fBCachedFetcher0.isLast());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      byte[][] byteArray0 = new byte[9][0];
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)71;
      byteArray1[1] = (byte)70;
      byteArray1[2] = (byte) (-1);
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte) (-7);
      byteArray1[5] = (byte)60;
      byteArray1[6] = (byte) (-112);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)70;
      byteArray2[2] = (byte)71;
      byteArray2[3] = (byte) (-112);
      byteArray2[4] = (byte)71;
      byteArray2[5] = (byte) (-112);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[0];
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[3];
      byteArray4[0] = (byte)71;
      byteArray4[1] = (byte)70;
      byteArray4[2] = (byte)0;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[1];
      byteArray5[0] = (byte)71;
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[6];
      byteArray6[0] = (byte) (-112);
      byteArray6[1] = (byte) (-1);
      byteArray6[2] = (byte)60;
      byteArray6[3] = (byte) (-1);
      byteArray6[4] = (byte)71;
      byteArray6[5] = (byte)60;
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[6];
      byteArray7[0] = (byte) (-7);
      byteArray7[1] = (byte)71;
      byteArray7[2] = (byte) (-1);
      byteArray7[3] = (byte)0;
      byteArray7[4] = (byte)7;
      byteArray7[5] = (byte) (-79);
      byteArray0[6] = byteArray7;
      byte[] byteArray8 = new byte[2];
      byteArray8[0] = (byte)22;
      byteArray8[1] = (byte) (-1);
      byteArray0[7] = byteArray8;
      byte[] byteArray9 = new byte[3];
      byteArray9[0] = (byte) (-7);
      byteArray9[1] = (byte)22;
      byteArray9[2] = (byte)60;
      byteArray0[8] = byteArray9;
      linkedList0.add(byteArray0);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.afterLast();
      boolean boolean0 = fBCachedFetcher0.isAfterLast();
      assertEquals(3, fBCachedFetcher0.getRowNum());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isLast();
      Predicate<Object> predicate0 = Predicate.isEqual((Object) null);
      Predicate<Object> predicate1 = predicate0.negate();
      Predicate<Object> predicate2 = predicate1.negate();
      predicate2.or(predicate0);
      Predicate<Object> predicate3 = predicate0.or(predicate1);
      Predicate<Object> predicate4 = predicate1.or(predicate2);
      Predicate.isEqual((Object) predicate0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      Predicate<Object> predicate5 = predicate3.and(predicate1);
      predicate5.or(predicate4);
      linkedList0.removeIf(predicate5);
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
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[6][3];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)31;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[3];
      byteArray2[0] = (byte)31;
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte)31;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[9];
      byteArray3[0] = (byte)31;
      byteArray3[1] = (byte)0;
      byteArray3[2] = (byte)0;
      byteArray3[3] = (byte)0;
      byteArray3[4] = (byte)0;
      byteArray3[5] = (byte)31;
      byteArray3[6] = (byte)31;
      byteArray3[7] = (byte)0;
      byteArray3[8] = (byte)31;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[5];
      byteArray4[0] = (byte)31;
      byteArray4[1] = (byte)0;
      byteArray4[2] = (byte)31;
      byteArray4[3] = (byte)66;
      byteArray4[4] = (byte)0;
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[0];
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[2];
      byteArray6[0] = (byte)31;
      byteArray6[1] = (byte)31;
      byteArray0[5] = byteArray6;
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
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedBlockingDeque<byte[][]> linkedBlockingDeque0 = new LinkedBlockingDeque<byte[][]>();
      byte[][] byteArray0 = new byte[2][3];
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte) (-79);
      byteArray1[1] = (byte) (-1);
      byteArray1[2] = (byte)92;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[0];
      byteArray0[1] = byteArray2;
      linkedBlockingDeque0.add(byteArray0);
      linkedBlockingDeque0.addAll(linkedList0);
      linkedList0.addAll((Collection<? extends byte[][]>) linkedBlockingDeque0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.getFetchSize();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedTransferQueue<FBCachedBlobField> linkedTransferQueue0 = new LinkedTransferQueue<FBCachedBlobField>();
      linkedList0.containsAll(linkedTransferQueue0);
      linkedList0.remove((Object) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.first();
      fBCachedFetcher0.isAfterLast();
      fBCachedFetcher0.close();
      fBCachedFetcher0.absolute(107);
      fBCachedFetcher0.close();
      fBCachedFetcher0.next();
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
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.last();
      fBCachedFetcher0.afterLast();
      byte[][] byteArray0 = new byte[4][6];
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte) (-68);
      byteArray1[1] = (byte)19;
      byteArray1[2] = (byte) (-4);
      byteArray1[3] = (byte) (-4);
      byteArray1[4] = (byte) (-1);
      byteArray1[5] = (byte) (-28);
      byteArray1[6] = (byte)5;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[3];
      byteArray2[0] = (byte) (-28);
      byteArray2[1] = (byte) (-4);
      byteArray2[2] = (byte)19;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[1];
      byteArray3[0] = (byte) (-28);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[8];
      byteArray4[0] = (byte) (-4);
      byteArray4[1] = (byte)19;
      byteArray4[2] = (byte) (-1);
      byteArray4[3] = (byte) (-28);
      byteArray4[4] = (byte) (-2);
      byteArray4[5] = (byte) (-126);
      byteArray4[6] = (byte) (-68);
      byteArray4[7] = (byte) (-2);
      byteArray0[3] = byteArray4;
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
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isLast();
      Predicate<Object> predicate0 = Predicate.isEqual((Object) null);
      Predicate<Object> predicate1 = predicate0.negate();
      Predicate<Object> predicate2 = predicate1.negate();
      Predicate<Object> predicate3 = predicate0.or(predicate1);
      predicate1.or(predicate2);
      Predicate.isEqual((Object) predicate0);
      Predicate<Object> predicate4 = predicate3.and(predicate1);
      linkedList0.removeIf(predicate4);
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
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.last();
      fBCachedFetcher0.getRowNum();
      byte[][] byteArray0 = new byte[9][1];
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte) (-1);
      byteArray1[1] = (byte) (-2);
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte)1;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[1];
      byteArray2[0] = (byte)1;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[3];
      byteArray3[0] = (byte) (-1);
      byteArray3[1] = (byte) (-1);
      byteArray3[2] = (byte) (-1);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[0];
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[0];
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[3];
      byteArray6[0] = (byte)100;
      byteArray6[1] = (byte)0;
      byteArray6[2] = (byte) (-1);
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[3];
      byteArray7[0] = (byte) (-2);
      byteArray7[1] = (byte)0;
      byteArray7[2] = (byte) (-1);
      byteArray0[6] = byteArray7;
      byte[] byteArray8 = new byte[6];
      byteArray8[0] = (byte)72;
      byteArray8[1] = (byte) (-1);
      byteArray8[2] = (byte)0;
      byteArray8[3] = (byte)0;
      byteArray8[4] = (byte)100;
      byteArray8[5] = (byte)0;
      byteArray0[7] = byteArray8;
      byte[] byteArray9 = new byte[6];
      byteArray9[0] = (byte)0;
      byteArray9[1] = (byte)0;
      byteArray9[2] = (byte)0;
      byteArray9[3] = (byte) (-2);
      byteArray9[4] = (byte) (-1);
      byteArray9[5] = (byte)0;
      byteArray0[8] = byteArray9;
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
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.last();
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
  public void test11()  throws Throwable  {
      GDSHelper gDSHelper0 = null;
      int int0 = 3496;
      int int1 = 1275;
      String string0 = "";
      int int2 = 3;
      int int3 = 65;
      DummyCallableStatementMetaData dummyCallableStatementMetaData0 = new DummyCallableStatementMetaData();
      FBManagedConnection fBManagedConnection0 = mock(FBManagedConnection.class, new ViolatedAssumptionAnswer());
      doReturn((FBConnectionRequestInfo) null).when(fBManagedConnection0).getConnectionRequestInfo();
      FBConnection fBConnection0 = null;
      try {
        fBConnection0 = new FBConnection(fBManagedConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.AbstractConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize(2311);
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
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isLast();
      Predicate<Object> predicate0 = Predicate.isEqual((Object) null);
      Predicate<Object> predicate1 = predicate0.negate();
      Predicate<Object> predicate2 = predicate1.negate();
      Predicate<Object> predicate3 = predicate0.or(predicate1);
      predicate1.or(predicate2);
      Predicate.isEqual((Object) predicate0);
      Predicate<Object> predicate4 = predicate3.and(predicate1);
      linkedList0.removeIf(predicate4);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.setFetchSize(0);
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.next();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.getRowNum();
      fBCachedFetcher0.getRowNum();
      byte[][] byteArray0 = new byte[0][3];
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
  public void test14()  throws Throwable  {
      List<byte[][]> list0 = null;
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = null;
      try {
        fBResultSet0 = new FBResultSet(xSQLVARArray0, (List<byte[][]>) null);
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
      GDSHelper gDSHelper0 = null;
      int int0 = (-2270);
      int int1 = (-2134);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      FBObjectListener.ResultSetListener fBObjectListener_ResultSetListener0 = mock(FBObjectListener.ResultSetListener.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = false;
      int int2 = 1461;
      isc_stmt_handle_impl0.setStatementType(1461);
      FBResultSet fBResultSet0 = null;
      try {
        fBResultSet0 = new FBResultSet((GDSHelper) null, (AbstractStatement) null, isc_stmt_handle_impl0, fBObjectListener_ResultSetListener0, false, 1461, 1461, 1461, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.AbstractResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[5];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      XSQLVAR xSQLVAR1 = xSQLVAR0.deepCopy();
      xSQLVARArray0[1] = xSQLVAR1;
      FBManagedConnection fBManagedConnection0 = mock(FBManagedConnection.class, new ViolatedAssumptionAnswer());
      doReturn((FBConnectionRequestInfo) null).when(fBManagedConnection0).getConnectionRequestInfo();
      FBConnection fBConnection0 = null;
      try {
        fBConnection0 = new FBConnection(fBManagedConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.AbstractConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      assertTrue(fBCachedFetcher0.isLast());
      
      fBCachedFetcher0.deleteRow();
      System.setCurrentTimeMillis(0L);
      linkedList0.push((byte[][]) null);
      fBCachedFetcher0.relative(3);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      boolean boolean1 = fBCachedFetcher0.isAfterLast();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      fBCachedFetcher0.beforeFirst();
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedBlockingDeque<byte[][]> linkedBlockingDeque0 = new LinkedBlockingDeque<byte[][]>();
      byte[][] byteArray0 = new byte[2][3];
      byte[] byteArray1 = new byte[0];
      byteArray0[0] = byteArray1;
      linkedBlockingDeque0.add(byteArray0);
      linkedBlockingDeque0.addAll(linkedList0);
      linkedList0.addAll((Collection<? extends byte[][]>) linkedBlockingDeque0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isFirst();
      int int0 = FBFetcher.MAX_FETCH_ROWS;
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative(400);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[2][9];
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)77;
      byteArray1[1] = (byte) (-30);
      byteArray1[2] = (byte) (-30);
      byteArray1[3] = (byte)104;
      byteArray1[4] = (byte) (-17);
      byteArray1[6] = (byte)26;
      byteArray1[7] = (byte)109;
      byteArray1[8] = (byte)122;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte)77;
      byteArray2[1] = (byte)109;
      byteArray2[2] = (byte) (-61);
      byteArray2[3] = (byte)77;
      byteArray2[4] = (byte)109;
      byteArray2[5] = (byte)104;
      byteArray0[1] = byteArray2;
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(1884);
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.previous();
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(1, fBCachedFetcher0.getRowNum());
      assertEquals(0, int0);
  }
}

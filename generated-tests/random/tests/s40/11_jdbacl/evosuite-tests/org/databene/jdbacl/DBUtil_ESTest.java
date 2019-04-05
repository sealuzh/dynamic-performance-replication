/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 01:44:12 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.apache.derby.diag.ErrorMessages;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBExecutionResult;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.ResultsWithMetadata;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableHolder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.h2.jdbc.JdbcCallableStatement;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.h2.value.ValueLob;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcClob;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Level level0 = Level.fatal;
      ErrorHandler errorHandler0 = new ErrorHandler("", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("9>l", (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow(")", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.query((String) null, (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getMetaData("7w|}CY)$'kzO4%Bm0v", true, true, true, false, "", true, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '7w|}CY)$'kzO4%Bm0v.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'null.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[0];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "", true, stringArray0);
      boolean boolean0 = DBUtil.equivalent(dBPrimaryKeyConstraint0, dBPrimaryKeyConstraint0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = DBUtil.available("0P\"`iBE6O.\"V}2Q", "--", "----", "2 ?KEt@b");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = DBUtil.available("", "", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        DBUtil.queryScalarArray("H>&0MQkd/#r')", class0, (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryScalar("org.databene.JDBC", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getMetaData((String) null, true, true, true, false, "d", false, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'null.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.dependencyOrderedTables((TableHolder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DBUtil.checkReadOnly("rW*-r]q:}", false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("7", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Result result0 = Result.newRollbackToSavepointRequest("5!; <~GF7MrQz2#M");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      int int0 = DBUtil.executeUpdate("5!; <~GF7MrQz2#M", jdbcConnection0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object object0 = DBUtil.parseAndSimplifyResultSet(simpleResultSet0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("rW*-r]q:}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'rW*-r]q:}.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      jdbcClob jdbcClob0 = new jdbcClob("----<dGk.N/H");
      Reader reader0 = jdbcClob0.getCharacterStream();
      String[] stringArray0 = new String[1];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      Statement statement0 = DBUtil.getStatement(resultSet0);
      assertNull(statement0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = DBUtil.getOpenPreparedStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = DBUtil.getOpenResultSetCount();
      assertEquals(38, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = DBUtil.getOpenStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "5tWlX(p^/%D@A";
      DBDataType dBDataType0 = DBDataType.getInstance(77, "o<E");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("5tWlX(p^/%D@A", defaultDBTable0, dBDataType0, (Integer) null);
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "5tWlX(p^/%D@A", true, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBUniqueConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table 'null'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("pU");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("pU", dBSchema0);
      String[] stringArray0 = new String[0];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "GvX3", true, stringArray0);
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Result result0 = Result.newReleaseSavepointRequest("5!; <~GF7MrQz2#M");
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) result0;
      objectArray0[1] = (Object) "5!; <~GF7MrQz2#M";
      objectArray0[2] = (Object) result0;
      objectArray0[3] = (Object) "5!; <~GF7MrQz2#M";
      objectArray0[4] = (Object) result0;
      result0.setParameterData(objectArray0);
      int[] intArray0 = new int[1];
      intArray0[0] = 66541;
      Result result1 = new Result((-130993204), intArray0, 2048);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0, result0, result1).when(session0).execute(any(org.hsqldb.Result.class));
      doReturn(true).when(session0).isReadOnly();
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      DBUtil.getOpenConnectionCount();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)58;
      byteArray0[1] = (byte) (-21);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[2] = (byte)57;
      byteArray0[3] = (byte)103;
      byteArray0[4] = (byte)41;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Level level0 = Level.trace;
      jdbcConnection0.isReadOnly();
      ErrorHandler errorHandler0 = new ErrorHandler("5!; <~GF7MrQz2#M", level0);
      DBUtil.runScript("AdVPS?lf", (Connection) jdbcConnection0, true, errorHandler0);
      Result.newFreeStmtRequest((-259296312));
      DBUtil.assertAllDbResourcesClosed(false);
      DBUtil.queryAndSimplify("AdVPS?lf", jdbcConnection0);
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("5!; <~GF7MrQz2#M", jdbcConnection0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Database query did not return a result: 5!; <~GF7MrQz2#M
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      DBUtil.assertAllDbResourcesClosed(false);
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("--de", (Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("pU");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("pU", dBSchema0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("pU");
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly("", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "select count(*) from ", true, 449, (-2276), 443);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Result result0 = Result.newReleaseSavepointRequest("5!; <~GF7MrQz2#M");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      ResultsWithMetadata resultsWithMetadata0 = DBUtil.queryWithMetadata("\u0001\u0161", jdbcConnection0);
      assertNotNull(resultsWithMetadata0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Result result0 = Result.newReleaseSavepointRequest("5!; <~GF7MrQz2#M");
      Object[] objectArray0 = new Object[5];
      result0.setParameterData(objectArray0);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Object[] objectArray1 = DBUtil.querySingleRow("5!; <~GF7MrQz2#M", jdbcConnection0);
      assertFalse(objectArray1.equals((Object)objectArray0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Result result0 = Result.newReleaseSavepointRequest("5!; <~GF7MrQz2#M");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0, result0, (Result) null).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Level level0 = Level.trace;
      ErrorHandler errorHandler0 = new ErrorHandler("5!; <~GF7MrQz2#M", level0);
      DBUtil.runScript("AdVPS?lf", (Connection) jdbcConnection0, true, errorHandler0);
      DBUtil.queryAndSimplify("AdVPS?lf", jdbcConnection0);
      // Undeclared exception!
      try { 
        DBUtil.query("5!; <~GF7MrQz2#M", jdbcConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Result result0 = Result.newReleaseSavepointRequest("5!; <~GF7MrQz2#M");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      List<Object[]> list0 = DBUtil.query("5!; <~GF7MrQz2#M", jdbcConnection0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Result result0 = Result.newSetSavepointRequest("t=hXhGZIk4V~");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Long[] longArray0 = DBUtil.queryScalarArray("", class0, (Connection) jdbcConnection0);
      assertEquals(0, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      ErrorHandler errorHandler0 = new ErrorHandler("|RlO@- F0A=`ol");
      // Undeclared exception!
      try { 
        DBUtil.runScript("Z@kbm5m", (Connection) jdbcConnection0, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      int int0 = DBUtil.executeUpdate("", (Connection) proxy0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = DBUtil.executeUpdate((String) null, (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<jdbcCallableStatement> class0 = jdbcCallableStatement.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("select count(*) from ", 'N', (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("COMMENT", 'R', (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<JdbcCallableStatement> class0 = JdbcCallableStatement.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("oDk@ n", 'n', (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Level level0 = Level.info;
      ErrorHandler errorHandler0 = new ErrorHandler("(<RBjVLf#Lo,", level0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--<dGk.N/H", ':', (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Result result0 = Result.newRollbackToSavepointRequest("5!; <~GF7MrQz2#M");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      // Undeclared exception!
      try { 
        DBUtil.queryLong("5!; <~GF7MrQz2#M", jdbcConnection0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a row.
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)116;
      ValueLob valueLob0 = ValueLob.createSmallLob((-1), byteArray0);
      Reader reader0 = valueLob0.getReader();
      String[] stringArray0 = new String[7];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      String string0 = DBUtil.format(resultSet0);
      assertTrue(resultSet0.wasNull());
      assertEquals("C1, C2, C3, C4, C5, C6, C7\nt, , , , , , \n", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Object[] objectArray0 = DBUtil.nextLine(simpleResultSet0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ErrorMessages errorMessages0 = new ErrorMessages();
      try { 
        DBUtil.nextLine(errorMessages0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // getObject
         //
         verifyException("org.apache.derby.vti.VTITemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      jdbcClob jdbcClob0 = new jdbcClob("----<dGk.N/H");
      Reader reader0 = jdbcClob0.getCharacterStream();
      String[] stringArray0 = new String[1];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet(resultSet0, (Statement) null);
      Object object0 = DBUtil.parseAndSimplifyResultSet((ResultSet) proxy0);
      assertNotNull(object0);
      assertEquals(0, resultSet0.getRow());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("CreateDataDictionaryVersion", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "G:'/6,|s#LZ", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DBUtil.close((Connection) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      DBUtil.close((Connection) jdbcConnection0);
      assertFalse(jdbcConnection0.isClosed());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("blv`~h", "blv`~h", "blv`~h", "^8K+0U,/4)^&s1");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting blv`~h failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("", "", "", "", "}fd1-=2^9&(+G8", "6839c016-00d9-2829-dfcd-000a0a411400");
      // Undeclared exception!
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No JDBC URL specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "4>S,B)g:gNaA", "O\"cUd+f*$6", (String) null, "E%g!^Es/|kys@", (String) null);
      // Undeclared exception!
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No JDBC driver class name specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/apaniche/databene/rW*-r]q:}.env.properties");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "i#1,Fb%VeiwVb3.nya");
      JDBCConnectData jDBCConnectData0 = DBUtil.getConnectData("rW*-r]q:}");
      assertNotNull(jDBCConnectData0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet((ResultSet) null, (Statement) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, "\"[<l,,}f$sL6P:", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.connect("GvX3", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'GvX3.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.currentLine((ResultSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = DBUtil.escape("z]FyyD@~<*/206YdU'");
      assertEquals("z]FyyD@~<*/206YdU''", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Level level0 = Level.fatal;
      ErrorHandler errorHandler0 = new ErrorHandler("", level0);
      try { 
        DBUtil.runScript("", "9>l", (Connection) null, false, errorHandler0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.logMetaData((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, true);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("'Z", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = DBUtil.existsEnvironment("rW*-r]q:}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      try { 
        DBUtil.getMetaData((Connection) null, "9>", "COMMENT", true, true, false, true, "9>", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("pU");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("pU", dBSchema0);
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, " ORDER BY PKTABLE_CAT, PKTABLE_SCHEM, PKTABLE_NAME, KEY_SEQ", false, stringArray0);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "GvX3", true, stringArray0);
      boolean boolean0 = DBUtil.equivalent(dBUniqueConstraint0, dBPrimaryKeyConstraint0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 result set(s), 1 statement(s)
         //
      }
  }
}

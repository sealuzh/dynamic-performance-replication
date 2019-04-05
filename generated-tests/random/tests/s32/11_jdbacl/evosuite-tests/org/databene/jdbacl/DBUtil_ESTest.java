/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:24:05 GMT 2019
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import org.apache.derby.diag.ErrorMessages;
import org.apache.derby.impl.sql.compile.AggregateNode;
import org.apache.derby.impl.sql.compile.ColumnReference;
import org.apache.derby.impl.sql.compile.FromVTI;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBExecutionResult;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.firebirdsql.jdbc.FBStatement;
import org.h2.Driver;
import org.h2.jdbc.JdbcPreparedStatement;
import org.h2.jdbcx.JdbcXAConnection;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcClob;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.jdbcDriver;
import org.junit.runner.RunWith;
import org.postgresql.ds.PGPooledConnection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("--Expected a row.", 1);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DBUtil.getOpenStatementCount();
      ResultSet resultSet0 = null;
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
  public void test01()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("' at beginning or end of: ", 453);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DBUtil.getOpenResultSetCount();
      DBUtil.resetMonitors();
      // Undeclared exception!
      try { 
        DBUtil.queryString((PreparedStatement) null);
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
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      DBUtil.wrapWithPooledConnection(jdbcConnection0, true);
      int int0 = DBUtil.getOpenConnectionCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object[] objectArray0 = DBUtil.currentLine(simpleResultSet0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      Class<PGPooledConnection> class0 = PGPooledConnection.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("Expected a row.", (Connection) proxy0, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DBUtil.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("--80000000-00d1-15fc-60b9-000a0a0b1500");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("--80000000-00d1-15fc-60b9-000a0a0b1500", dBSchema0);
      String[] stringArray0 = new String[6];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "%2*", false, stringArray0);
      boolean boolean0 = DBUtil.equivalent(dBPrimaryKeyConstraint0, dBPrimaryKeyConstraint0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      try { 
        DBUtil.connect("U!R^BB", "Gq!Ol&uouz", "Gq!Ol&uouz", "SUPERTABLES", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting U!R^BB failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("", (Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<JdbcPreparedStatement> class0 = JdbcPreparedStatement.class;
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.queryScalarArray("D=GW]q:", class0, (Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryScalar("#s^$B", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Result.newRollbackToSavepointRequest("r{~^");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn((Result) null).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) jdbcConnection0, "--", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcPreparedStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn((Result) null).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection(jdbcConnection0, true);
      // Undeclared exception!
      try { 
        DBUtil.countRows("bGn=8~)", (Connection) proxy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Internal exception in method: public java.sql.ResultSet org.databene.jdbacl.proxy.LoggingStatementHandler.executeQuery(java.lang.String) throws java.sql.SQLException
         //
         verifyException("org.databene.commons.ExceptionMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.closeResultSetAndStatement((ResultSet) null);
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
      DBUtil.checkReadOnly("C8%?", false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("i\"GE", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object object0 = DBUtil.parseAndSimplifyResultSet(simpleResultSet0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DBUtil.close((Statement) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        DBUtil.connect("", "INDEXES", "XBCX9.S", "VYa+k", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting  failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = DBUtil.getOpenConnectionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = DBUtil.getOpenPreparedStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      ErrorHandler errorHandler0 = new ErrorHandler("");
      // Undeclared exception!
      try { 
        DBUtil.runScript("+3hy>S~t7Ep}=Fs.vOk", "{`5_uQ~]]", 'W', (Connection) proxy0, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: +3hy>S~t7Ep}=Fs.vOk
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryLong("getBytes", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      jdbcClob jdbcClob0 = new jdbcClob("");
      Reader reader0 = jdbcClob0.getCharacterStream();
      String[] stringArray0 = new String[3];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet(resultSet0, (Statement) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema((String) null, dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("h:gN|1U!4~4:oK[M}oQ", dBSchema0);
      String[] stringArray0 = new String[3];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, true, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table 'h:gN|1U!4~4:oK[M}oQ'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema((String) null);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("U>z'/2t-c7)GpLPJnr1", dBSchema0);
      String[] stringArray0 = new String[0];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, true, stringArray0);
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "Expected a row.";
      Driver.load();
      FromVTI fromVTI0 = new FromVTI();
      AggregateNode aggregateNode0 = new AggregateNode();
      aggregateNode0.getGeneratedRef();
      fromVTI0.getMatchingColumn((ColumnReference) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Database query failed: ");
      Class<PGPooledConnection> class0 = PGPooledConnection.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      fromVTI0.rejectParameters();
      Level level0 = Level.warn;
      ErrorHandler.setDefaultLevel(level0);
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

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("--80000000-00d1-15fc-60b9-000a0a0b1500");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("--80000000-00d1-15fc-60b9-000a0a0b1500", dBSchema0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("~K");
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("0_Q2pcdko", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.query(") or wrong URL format (", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("rSeKEH9M}pKzV", jdbcConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Result result0 = Result.newRollbackToSavepointRequest("r{~^");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      int int0 = DBUtil.executeUpdate("*Cr>R8poO/9/&5", jdbcConnection0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = DBUtil.executeUpdate("", (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = DBUtil.executeUpdate((String) null, (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Level level0 = Level.debug;
      ErrorHandler errorHandler0 = new ErrorHandler("wIYE`+ER:", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("wIYE`+ER:", '|', (Connection) null, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Level level0 = Level.trace;
      ErrorHandler errorHandler0 = new ErrorHandler("COMMENT", level0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("COMMENT", 's', (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Level level0 = Level.fatal;
      ErrorHandler errorHandler0 = new ErrorHandler("", level0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--</", 'Y', (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("}ucKxOIEb4uC");
      // Undeclared exception!
      try { 
        DBUtil.runScript("select count(*) from ", (Connection) null, false, errorHandler0);
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
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object[] objectArray0 = DBUtil.nextLine(simpleResultSet0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      Result result0 = Result.newRollbackToSavepointRequest((String) null);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Object[] objectArray0 = new Object[0];
      result0.add(objectArray0);
      Object[] objectArray1 = DBUtil.querySingleRow("Rx", jdbcConnection0);
      assertFalse(objectArray1.equals((Object)objectArray0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ErrorMessages errorMessages0 = new ErrorMessages();
      try { 
        DBUtil.format(errorMessages0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // getObject
         //
         verifyException("org.apache.derby.vti.VTITemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      String string0 = DBUtil.format(simpleResultSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn((Result) null).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection(jdbcConnection0, false);
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("No environment definition '", (Connection) proxy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Internal exception in method: public java.sql.ResultSet org.databene.jdbacl.proxy.LoggingStatementHandler.executeQuery(java.lang.String) throws java.sql.SQLException
         //
         verifyException("org.databene.commons.ExceptionMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DBUtil.close((Connection) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.close((Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.proxy.PooledConnectionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        DBUtil.connect((String) null, (String) null, "org.h2.util.IOUtils", (String) null, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("", "kUw{EM]e", "kUw{EM]e", "");
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
  public void test51()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("", "", "into table=[", "into table=[", "", (String) null);
      // Undeclared exception!
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No JDBC URL specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("WRjuk;/", " <=BE SSLRefused", "WRjuk;/", "");
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting  <=BE SSLRefused failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/apaniche/databene/hFDpZ>)-RtmmZnk'.env.properties");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      boolean boolean0 = DBUtil.existsEnvironment("hFDpZ>)-RtmmZnk'");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("", (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "databene", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.connect("DI]]:y7", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'DI]]:y7.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = DBUtil.escape("{iXIa O?~p");
      assertEquals("{iXIa O?~p", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Result result0 = Result.newRollbackToSavepointRequest((String) null);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("Rx", jdbcConnection0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Database query did not return a result: Rx
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<JdbcXAConnection> class0 = JdbcXAConnection.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      try { 
        DBUtil.runScript("", "", (Connection) null, false, errorHandler0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = DBUtil.available("5j&Itsy|jC;%/y", "z[.z`>Z2@j", "5j&Itsy|jC;%/y", "5[UzwqHuvbd#x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      Result.newRollbackToSavepointRequest((String) null);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn((Result) null).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection(jdbcConnection0, true);
      // Undeclared exception!
      try { 
        DBUtil.countRows("bGn=8~)", (Connection) proxy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Internal exception in method: public java.sql.ResultSet org.databene.jdbacl.proxy.LoggingStatementHandler.executeQuery(java.lang.String) throws java.sql.SQLException
         //
         verifyException("org.databene.commons.ExceptionMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("c6Ew,#<%Fbl~,6}#", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = DBUtil.existsEnvironment("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.getMetaData((Connection) proxy0, "", "wN", false, false, false, true, "wN", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.equivalent((DBUniqueConstraint) null, (DBPrimaryKeyConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
      String string0 = "pa";
      Class<FBStatement> class0 = FBStatement.class;
      jdbcDriver jdbcDriver0 = new jdbcDriver();
      // Undeclared exception!
      try { 
        jdbcDriver0.getPropertyInfo("pa", (Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbcDriver", e);
      }
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 14:08:11 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.apache.derby.diag.ErrorMessages;
import org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBExecutionResult;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBConstraint;
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
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.jdbc.AbstractStatement;
import org.firebirdsql.jdbc.FBCallableStatement;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.InternalTransactionCoordinator;
import org.h2.tools.Csv;
import org.h2.tools.Recover;
import org.h2.tools.SimpleResultSet;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("Database query did not return a result: ");
      errorHandler0.setLoggingStackTrace(false);
      // Undeclared exception!
      try { 
        DBUtil.runScript("5?]nJN=a(vU/~~qje", (Connection) null, true, errorHandler0);
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
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      Level level0 = Level.info;
      ErrorHandler errorHandler0 = new ErrorHandler("5?", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("5?", 'g', (Connection) jdbcConnection0, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.format((ResultSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.escape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn((DBConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.connect((JDBCConnectData) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DBUtil.checkReadOnly("Empty SQL string in executeUpdate()", false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      StringReader stringReader0 = new StringReader("Exceptions");
      String[] stringArray0 = new String[9];
      ResultSet resultSet0 = csv0.read((Reader) stringReader0, stringArray0);
      DBUtil.parseAndSimplifyResultSet(resultSet0);
      assertTrue(resultSet0.wasNull());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Object object0 = DBUtil.parseAndSimplifyResultSet(simpleResultSet0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DBUtil.close((Statement) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        DBUtil.connect("", "", "", "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting  failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("XeMBjgk 2Ag3SO}Ap]");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'XeMBjgk 2Ag3SO}Ap].env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = DBUtil.getOpenConnectionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = DBUtil.getOpenPreparedStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Level level0 = Level.fatal;
      ErrorHandler errorHandler0 = new ErrorHandler("XMLCOMMENT", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("CREATE SCHEMA", "", '-', (Connection) null, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: CREATE SCHEMA
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object[] objectArray0 = DBUtil.currentLine(simpleResultSet0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = DBUtil.getOpenResultSetCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryLong("]cv(", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = DBUtil.getOpenStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("JkAE!*BUi<");
      String[] stringArray0 = new String[9];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "XBCXL.S", false, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table 'JkAE!*BUi<'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "\"<5]T$Un}g9", true, stringArray0);
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBUniqueConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("info.CACHE_MAX_SIZE", 1043);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DBUtil.assertAllDbResourcesClosed(true);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Recover recover0 = new Recover();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      recover0.getLobConnection();
      boolean boolean0 = true;
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      boolean boolean1 = false;
      DBUtil.assertAllDbResourcesClosed(false);
      ResultSet resultSet0 = null;
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
  public void test24()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("uXVJW9g");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      dBSchema0.addTable(defaultDBTable0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("uXVJW9g");
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DBUtil.checkReadOnly("select count(*) from ", true);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "drop materialized view", true, 4, 79, 1210);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: drop materialized view
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "No JDBC driver class name specified", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: No JDBC driver class name specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("jHCD]b_]&a", (Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = DBUtil.executeUpdate("", (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = DBUtil.executeUpdate((String) null, (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SQLException sQLException0 = new SQLException("+~;<d:lBPw6Oi7/g", (String) null, (-421));
      Result result0 = new Result(sQLException0, "+~;<d:lBPw6Oi7/g");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      ErrorHandler errorHandler0 = new ErrorHandler("");
      // Undeclared exception!
      try { 
        DBUtil.runScript("+~;<d:lBPw6Oi7/g", 'n', (Connection) jdbcConnection0, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.sql.SQLException: null java.sql.SQLException: +~;<d:lBPw6Oi7/g in statement [+~;<d:lBPw6Oi7/g]
         //
         verifyException("org.databene.commons.ErrorHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[8];
      Result result0 = new Result(15, intArray0, 621);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      ErrorHandler errorHandler0 = new ErrorHandler("");
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("+~;<d:lBPw6Oi7/g", 'g', (Connection) jdbcConnection0, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("");
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--", (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      ColumnDescriptorList columnDescriptorList0 = new ColumnDescriptorList();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, columnDescriptorList0);
      Object[] objectArray0 = DBUtil.nextLine(fBResultSet0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      StringReader stringReader0 = new StringReader("?X");
      String[] stringArray0 = new String[8];
      ResultSet resultSet0 = csv0.read((Reader) stringReader0, stringArray0);
      String string0 = DBUtil.format(resultSet0);
      assertTrue(resultSet0.wasNull());
      assertEquals("C1, C2, C3, C4, C5, C6, C7, C8\n?X, , , , , , , \n", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      String string0 = DBUtil.format(simpleResultSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("|", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DBUtil.closeResultSetAndStatement(simpleResultSet0);
      assertTrue(simpleResultSet0.isClosed());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, "+~", false, 781, 781, 106);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DBUtil.close((Connection) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("uc%D6+^WK_}NfX", "uc%D6+^WK_}NfX", "--", "+~");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting uc%D6+^WK_}NfX failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, (String) null, "aNnM2}WpENr:: `n5V", "groupColumns=[");
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
  public void test45()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("", "--Ia-p]Ta", "+&/@zju?", (String) null, (String) null, "+~");
      // Undeclared exception!
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No JDBC driver class name specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
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
  public void test47()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet((ResultSet) null, (Statement) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "2", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int[] intArray0 = new int[8];
      Result result0 = new Result(10, intArray0, 621);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      ErrorHandler errorHandler0 = new ErrorHandler("");
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("+~;<d:lBPw6Oi7/g", 'n', (Connection) jdbcConnection0, false, errorHandler0);
      // Undeclared exception!
      try { 
        DBUtil.connect("", (boolean) dBExecutionResult0.changedStructure);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      String string0 = DBUtil.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      try { 
        DBUtil.getMetaData((Connection) null, "Tj", "", true, false, true, false, "cA", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.query("I}u@%y-@|V0iHcqM`ZX", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<FBCallableStatement> class0 = FBCallableStatement.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("rqA", "\u0002'\u0002\uFFFF\u0001'\u0012\uFFFF\u0001'\u0001\u001C\u0001)\u0002\uFFFF\u0001#\u0001\uFFFF\u0001(\u0001\u0005\u0001\u0006\u0001!\u0001\u001F\u0001\u0007\u0001 \u0001\u0019\u0001\"\n&\u0001\uFFFF\u0001\u0001\u0001\u001D\u0001\u001B\u0001\u001E\u0002\uFFFF\u0001\u0016\u0001\t\u0001\u0002\u0001\u0011\u0001\u000F\u0001\u0018\u0001\u0003\u0001\u0013\u0001\r\u0001%\u0001\n\u0001\u0014\u0001\u000E\u0001\b\u0001\u000B\u0001\f\u0001%\u0001\u0010\u0001\u0012\u0001\u0004\u0001\u0017\u0001\u0015\u0001%\u0001\u001A\u0002%\u0004\uFFFF\u0001%\u0001\uFFFF\u001A%\u0001\uFFFF\u0001$", (Connection) null, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: rqA
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      boolean boolean0 = DBUtil.available("databene", "i'!i*a`&N0Z", "C%FSpQbN{cC*$1Q)XD", "C%FSpQbN{cC*$1Q)XD");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, false);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("FD0B|\"(I ", (Connection) null);
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
      boolean boolean0 = DBUtil.existsEnvironment("Custom type maps are not supported.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
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

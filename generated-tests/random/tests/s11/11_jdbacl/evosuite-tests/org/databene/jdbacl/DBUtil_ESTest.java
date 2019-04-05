/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 19:37:37 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
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
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainerSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.firebirdsql.jdbc.FBConnection;
import org.firebirdsql.jdbc.FBResultSet;
import org.h2.engine.SessionRemote;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.jdbc.jdbcPreparedStatement;
import org.junit.runner.RunWith;
import org.postgresql.core.BaseConnection;
import org.postgresql.jdbc4.Jdbc4SQLXML;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/apaniche/databene/72.env.properties");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.apache.derby.iapi.sql.dictionary.StatementRoutinePermission");
      // Undeclared exception!
      try { 
        DBUtil.connect("72", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No JDBC URL specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Level level0 = Level.error;
      ErrorHandler errorHandler0 = new ErrorHandler("9f", level0);
      try { 
        DBUtil.runScript("", "", 'r', (Connection) null, true, errorHandler0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.query("", (Connection) null);
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
      try { 
        DBUtil.getMetaData((Connection) null, "--Connecting", "--Connecting", false, false, false, false, "g]?wxHQS\"L_ bH", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = DBUtil.existsEnvironment((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = DBUtil.existsEnvironment("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      try { 
        DBUtil.connect("K^Rznn3QwBGc2B2de", "K^Rznn3QwBGc2B2de", ", length=", ", length=", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting K^Rznn3QwBGc2B2de failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 result set(s), 2 statement(s)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryScalar(".qy.!", (Connection) null);
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
        DBUtil.parseResultRow((ResultSet) null);
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
      // Undeclared exception!
      try { 
        DBUtil.nextLine((ResultSet) null);
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
  public void test13()  throws Throwable  {
      DBUtil.checkReadOnly("", false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      Jdbc4SQLXML jdbc4SQLXML0 = new Jdbc4SQLXML((BaseConnection) null, "--W8");
      Reader reader0 = jdbc4SQLXML0.getCharacterStream();
      ResultSet resultSet0 = csv0.read(reader0, (String[]) null);
      DBUtil.close(resultSet0);
      assertEquals(1007, resultSet0.getConcurrency());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        DBUtil.connect("$lIDc", "Uq4q?Jcb)m", "Uq4q?Jcb)m", "$lIDc", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting $lIDc failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("Z");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'Z.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = DBUtil.getOpenConnectionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = DBUtil.getOpenPreparedStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("Error in executing SQL: ");
      try { 
        DBUtil.runScript("", "Error in executing SQL: ", 't', (Connection) null, true, errorHandler0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DBUtil.getOpenResultSetCount();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 2);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData(" 5-", "", "Expected a row.", "");
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
  public void test21()  throws Throwable  {
      int int0 = DBUtil.getOpenStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.executeQuery("\"y{lZLP\"5o\"s.\"N", (Connection) null);
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
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("--i?");
      String[] stringArray0 = new String[2];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "--i?", true, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table '--i?'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "DE", false, stringArray0);
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBUniqueConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DBUtil.wrapWithPooledConnection((Connection) null, false);
      DBUtil.assertAllDbResourcesClosed(false);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TableContainerSupport tableContainerSupport0 = new TableContainerSupport();
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainerSupport0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DBUtil.checkReadOnly("SELECT relname FROM pg_catalog.pg_class WHERE oid = ?", true);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly("eI!K=@}6&67}e>;S=", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: eI!K=@}6&67}e>;S=
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Result result0 = Result.newReleaseSavepointRequest("Empty SQL string in executeUpdate()");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      ResultsWithMetadata resultsWithMetadata0 = DBUtil.queryWithMetadata("Empty SQL string in executeUpdate()", jdbcConnection0);
      assertNotNull(resultsWithMetadata0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow((String) null, (Connection) null);
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
      Result result0 = Result.newRollbackToSavepointRequest("0ch]83-NG.-K_+4Xa");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow((String) null, jdbcConnection0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Database query did not return a result: null
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = "--Expected a row.";
      SessionRemote sessionRemote0 = new SessionRemote();
      Connection connection0 = sessionRemote0.getLobConnection();
      // Undeclared exception!
      try { 
        DBUtil.query(string0, connection0);
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
      Result result0 = Result.newRollbackToSavepointRequest("0ch]83-NG.-K_+4Xa");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      List<Object[]> list0 = DBUtil.query("org.apache.derby.impl.sql.compile.ActivationClassBuilder", jdbcConnection0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("There are unclosed database resources", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn((Result) null).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("$lIDc", jdbcConnection0);
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
      Result result0 = Result.newRollbackToSavepointRequest((String) null);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      int int0 = DBUtil.executeUpdate("$lIDc", jdbcConnection0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = DBUtil.executeUpdate("", (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      int int0 = DBUtil.executeUpdate((String) null, jdbcConnection0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<FBConnection> class0 = FBConnection.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("br l)5{JU5JAj:%E:oo", 'o', (Connection) null, false, errorHandler0);
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
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      Level level0 = Level.ignore;
      ErrorHandler errorHandler0 = new ErrorHandler("getLong(String)", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("9fkM&t*\t7", (Connection) proxy0, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      String string0 = DBUtil.format(simpleResultSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Object[] objectArray0 = DBUtil.nextLine(simpleResultSet0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      StringReader stringReader0 = new StringReader("Z");
      String[] stringArray0 = new String[3];
      ResultSet resultSet0 = csv0.read((Reader) stringReader0, stringArray0);
      DBUtil.parseAndSimplifyResultSet(resultSet0);
      assertTrue(resultSet0.wasNull());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<FBResultSet> class0 = FBResultSet.class;
      // Undeclared exception!
      try { 
        DBUtil.queryScalarArray((String) null, class0, (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DBUtil.close((Statement) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "jA$,3;%$IoMlJ09}", false);
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
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
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
  public void test51()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("", "Ex", "", "Ex", "WIN1256", "WIN1256");
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
  public void test52()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, (String) null, (String) null, "createStatement(");
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
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("#(Q'toJVSTrjSnlT", "#(Q'toJVSTrjSnlT", "", "");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting #(Q'toJVSTrjSnlT failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".qy.!.env.properties");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".qy.!");
      boolean boolean0 = DBUtil.existsEnvironment(".qy.!");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<jdbcPreparedStatement> class0 = jdbcPreparedStatement.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--Expected a row.", (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet((ResultSet) null, (Statement) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, "W", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
      String string0 = DBUtil.escape("46VD`y_}");
      assertEquals("46VD`y_}", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
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
  public void test62()  throws Throwable  {
      boolean boolean0 = DBUtil.available("COLUMN_TYPE", "}GPh-[53-J68q.@", "JB{", "p/{9-(vJ'<:n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
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
  public void test64()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, true);
      Proxy proxy1 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) proxy0, true);
      assertFalse(proxy1.equals((Object)proxy0));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("fjVcv0p+<HB{lmX=", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Result result0 = Result.newRollbackToSavepointRequest("0ch]83-NG.-K_+4Xa");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Object object0 = DBUtil.queryAndSimplify((String) null, jdbcConnection0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      try { 
        DBUtil.getMetaData((Connection) null, "/@`TW}D&d&AZvNM2", "~_4UXi", true, true, false, false, (String) null, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
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
  public void test69()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
  }
}

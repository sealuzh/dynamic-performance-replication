/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:32:05 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.apache.derby.diag.ErrorMessages;
import org.databene.commons.ErrorHandler;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.DBExecutionResult;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.ResultsWithMetadata;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.DefaultDatabase;
import org.databene.jdbacl.model.TableContainer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.gds.GDSException;
import org.firebirdsql.jdbc.FBResultSet;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.h2.value.ValueLobDb;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/apaniche/databene/MODE.env.properties");
      FileSystemHandling.createFolder(evoSuiteFile0);
      // Undeclared exception!
      try { 
        DBUtil.getMetaData("MODE", true, true, false, false, "bh", false, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error reading environment data for 'MODE'
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog(";Y@UOsj` ", (Database) null);
      DBSchema dBSchema0 = new DBSchema("(gZGV=w\"", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("RE", dBSchema0);
      String[] stringArray0 = new String[3];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "(gZGV=w\"", true, stringArray0);
      boolean boolean0 = DBUtil.equivalent(dBPrimaryKeyConstraint0, dBPrimaryKeyConstraint0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<FBResultSet> class0 = FBResultSet.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript((String) null, (Connection) null, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      // Undeclared exception!
      try { 
        DBUtil.queryScalar("Error in executing SQL: ", jdbcConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "database", true, 0, 0, 46);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: database
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getMetaData("MODE", true, true, false, false, "bh", false, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'MODE.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("", (Connection) null);
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
      DBUtil.checkReadOnly("7|k9] X)l+Q1W?", false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("aY-N{`", jdbcConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.Trace", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("m'", (Connection) null);
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
      try { 
        DBUtil.connect("Y", "", "1", "", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting Y failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Statement statement0 = DBUtil.getStatement(simpleResultSet0);
      assertNull(statement0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = DBUtil.getOpenConnectionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = DBUtil.getOpenPreparedStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ErrorMessages errorMessages0 = new ErrorMessages();
      try { 
        DBUtil.currentLine(errorMessages0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // getObject
         //
         verifyException("org.apache.derby.vti.VTITemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, true);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet((ResultSet) null, (Statement) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = DBUtil.getOpenStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.executeQuery("h2.defaultMaxLengthInplaceLob2", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("n(H[nJM0{N");
      String[] stringArray0 = new String[2];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("n(H[nJM0{N", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBForeignKeyConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table 'n(H[nJM0{N'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema((String) null, (DBCatalog) null);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("43", dBSchema0);
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("f`'Dtx", true, defaultDBTable0, "43");
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBCheckConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("-4EYV_Y.!c9A_9IiS");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      tableContainer0.addTable(defaultDBTable0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainer0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultDatabase defaultDatabase0 = new DefaultDatabase("Connecting the database failed silently - probably due to wrong driver (", ": b-tree leaf ", (VersionNumber) null);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(defaultDatabase0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DBUtil.checkReadOnly("select count(*) from ", true);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "F9\"", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: F9\"
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Result result0 = Result.newRollbackToSavepointRequest("r-AXFE~6");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      ResultsWithMetadata resultsWithMetadata0 = DBUtil.queryWithMetadata("--U@G`;-;J", jdbcConnection0);
      assertNotNull(resultsWithMetadata0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.query("No JDBC driver class name provided", (Connection) null);
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
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("toPlainString", (Connection) null);
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
      int int0 = DBUtil.executeUpdate("", (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = DBUtil.executeUpdate((String) null, (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GDSException gDSException0 = new GDSException(90093, 1625, "r-AXFE~6");
      Result result0 = new Result(gDSException0, "r-AXFE~6");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("r-AXFE~6", (Connection) jdbcConnection0, false, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.sql.SQLException: null org.evosuite.runtime.mock.java.lang.MockThrowable in statement [r-AXFE~6]
         //
         verifyException("org.databene.commons.ErrorHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.runScript("org.apache.derby.jdbc.XATransactionState", (Connection) null, true, (ErrorHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("COMMENT");
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--dE&kSgkN", (Connection) null, true, errorHandler0);
      // Undeclared exception!
      try { 
        DBUtil.getMetaData("--dE&kSgkN", false, false, (boolean) dBExecutionResult0.changedStructure, false, "(u", (boolean) dBExecutionResult0.changedStructure, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '--dE&kSgkN.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      byte[] byteArray0 = new byte[4];
      ValueLobDb valueLobDb0 = ValueLobDb.createSmallLob(301, byteArray0, (byte) (-119));
      Reader reader0 = valueLobDb0.getReader();
      String[] stringArray0 = new String[5];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      Object[] objectArray0 = DBUtil.nextLine(resultSet0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-119);
      ValueLobDb valueLobDb0 = ValueLobDb.createSmallLob(301, byteArray0, (byte) (-119));
      Reader reader0 = valueLobDb0.getReader();
      String[] stringArray0 = new String[5];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      String string0 = DBUtil.format(resultSet0);
      assertTrue(resultSet0.wasNull());
      assertEquals("C1, C2, C3, C4, C5\n\uFFFD, , , , \n", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object object0 = DBUtil.parseAndSimplifyResultSet(simpleResultSet0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("Connecting the database failed silently - probably due to wrong driver (", (Connection) null);
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
      DBUtil.close((Statement) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, (String) null, false, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DBUtil.close((Connection) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      DBUtil.close((Connection) jdbcConnection0);
      assertFalse(jdbcConnection0.isClosed());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData(", ", ", ", ", ", (String) null, "Failed to fetch metadata from connection ", "org.apache.derby.impl.sql.compile.FromTable");
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting ,  failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, (String) null, "fNh3?k7WA3uF>FrbBL2", (String) null);
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
  public void test47()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("", "preparing statement: ", "", "preparing statement: ");
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
  public void test48()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("MODE.env.properties");
      byte[] byteArray0 = new byte[8];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      try { 
        DBUtil.getMetaData("MODE", true, true, false, false, "bh", false, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Result result0 = Result.newRollbackToSavepointRequest("r-AXFE~6");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("r-AXFE~6", (Connection) jdbcConnection0, false, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "database", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.connect((String) null, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'null.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-119);
      ValueLobDb valueLobDb0 = ValueLobDb.createSmallLob(301, byteArray0, (byte) (-119));
      Reader reader0 = valueLobDb0.getReader();
      String[] stringArray0 = new String[5];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      DBUtil.nextLine(resultSet0);
      assertTrue(resultSet0.wasNull());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = DBUtil.escape("Database query failed: ");
      assertEquals("Database query failed: ", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Result result0 = Result.newRollbackToSavepointRequest("r-AXFE~6");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      List<Object[]> list0 = DBUtil.query("r-AXFE~6", jdbcConnection0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.runScript("getArray(", "or", (Connection) null, true, (ErrorHandler) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: getArray(
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = DBUtil.available("SYSTEM_SUBQUERY", "SYSTEM_SUBQUERY", "Vp6c", "lz?SrZjO;HkRm");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
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
  public void test59()  throws Throwable  {
      Result result0 = Result.newRollbackToSavepointRequest("*yS^l5k_VE[");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection(jdbcConnection0, false);
      // Undeclared exception!
      try { 
        DBUtil.countRows("", (Connection) proxy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a row.
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryLong("", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = DBUtil.existsEnvironment("Error in executing SQL: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
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
  public void test63()  throws Throwable  {
      try { 
        DBUtil.getMetaData((Connection) null, "", "", true, false, true, true, "", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
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
  public void test65()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 12:54:50 GMT 2019
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
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBConstraint;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainerSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.firebirdsql.jdbc.FBPreparedStatement;
import org.firebirdsql.jdbc.FBStatement;
import org.h2.engine.SessionRemote;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.h2.value.ValueLob;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Object[] objectArray0 = DBUtil.parseResultRow(simpleResultSet0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      System.setCurrentTimeMillis((-1513L));
      DBUtil.getOpenStatementCount();
      DBUtil.escape("C1mu dI<R");
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
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.connect("No JDBC driver class name provided", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'No JDBC driver class name provided.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.connect("", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = DBUtil.available("`S\fwQHV$QT}^", "`S\fwQHV$QT}^", (String) null, "ROWIDENTIFIER");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Level level0 = Level.error;
      ErrorHandler errorHandler0 = new ErrorHandler("P6", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("P6", "P6", (Connection) null, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: P6
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<jdbcCallableStatement> class0 = jdbcCallableStatement.class;
      // Undeclared exception!
      try { 
        DBUtil.queryScalarArray("Tried to mutate a database with read-only settings: ", class0, (Connection) null);
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      DBUtil.checkReadOnly((String) null, false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("|e[?%Z", (Connection) null);
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
      DBUtil.close((ResultSet) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      try { 
        DBUtil.connect("({8C__};ZAyma@!iJFm", "({8C__};ZAyma@!iJFm", "~t", "org.apache.derby.iapi.sql.dictionary.SubKeyConstraintDescriptor", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting ({8C__};ZAyma@!iJFm failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("Cp866", "", (String) null, "--P6h=>;V#c{} wvQ(7<");
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
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("Sm,#Je|(x;6&;+B_{Z");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'Sm,#Je|(x;6&;+B_{Z.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Statement statement0 = DBUtil.getStatement(simpleResultSet0);
      assertNull(statement0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = DBUtil.getOpenConnectionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = DBUtil.getOpenPreparedStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<FBPreparedStatement> class0 = FBPreparedStatement.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript((String) null, (String) null, '@', (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("+4xM\"4_i<d!f0^rPL");
      String[] stringArray0 = new String[9];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("+4xM\"4_i<d!f0^rPL", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBForeignKeyConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table '+4xM\"4_i<d!f0^rPL'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint((String) null, false, (String) null, "71");
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBCheckConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = true;
      DBUtil.assertAllDbResourcesClosed(true);
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = null;
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)56;
      byteArray0[0] = byte0;
      byte byte1 = (byte)59;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-124);
      byteArray0[2] = byte2;
      NetworkHandling.sendDataOnTcp(evoSuiteLocalAddress0, byteArray0);
      Connection connection0 = null;
      String string0 = null;
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement(connection0, string0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      DBUtil.assertAllDbResourcesClosed(false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TableContainerSupport tableContainerSupport0 = new TableContainerSupport();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      tableContainerSupport0.addTable(defaultDBTable0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainerSupport0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TableContainerSupport tableContainerSupport0 = new TableContainerSupport();
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainerSupport0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DBUtil.checkReadOnly("select count(*) from ", true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly("Error getting statement from result set", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: Error getting statement from result set
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("----~tj4*g_5mt", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.query("--\">#C&$PRn'P+A2JG", (Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("-(u4+", jdbcConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = DBUtil.executeUpdate("", (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = DBUtil.executeUpdate((String) null, (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("J7%sz+O,q");
      // Undeclared exception!
      try { 
        DBUtil.runScript("NumIyW", (Connection) null, false, errorHandler0);
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
      Level level0 = Level.warn;
      ErrorHandler errorHandler0 = new ErrorHandler("\n\tcol[", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("\n\tcol[", 'P', (Connection) null, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<FBStatement> class0 = FBStatement.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--~tj4*g_5mt", (Connection) null, false, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DBUtil.format(simpleResultSet0);
      // Undeclared exception!
      try { 
        DBUtil.format(simpleResultSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.h2.tools.SimpleResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object[] objectArray0 = DBUtil.nextLine(simpleResultSet0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Object object0 = DBUtil.parseAndSimplifyResultSet(simpleResultSet0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("", jdbcConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int[] intArray0 = new int[4];
      Result result0 = new Result(1, intArray0, (-3006));
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn((Result) null).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Level level0 = Level.ignore;
      ErrorHandler errorHandler0 = new ErrorHandler("Ea^<q|)", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("~tj4*g_5mt", (Connection) jdbcConnection0, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, (String) null, false);
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
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      DBUtil.assertAllDbResourcesClosed(false);
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly("Error getting statement from result set", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: Error getting statement from result set
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "--", (String) null, (String) null, (String) null, "EXECUTE");
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
  public void test44()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("D>", "D>", "D>", "--P6h=>;V#c{} wvQ(7<", "Connecting ", "--P6h=>;V#c{} wvQ(7<");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting D> failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("}:kHsCK #Uu!~<F3.env.properties");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "q");
      // Undeclared exception!
      try { 
        DBUtil.connect("}:kHsCK #Uu!~<F3", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No JDBC URL specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet((ResultSet) null, (Statement) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, "Xs", false);
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
      Csv csv0 = Csv.getInstance();
      StringReader stringReader0 = new StringReader("--KY");
      SessionRemote sessionRemote0 = new SessionRemote();
      ValueLob valueLob0 = ValueLob.createClob(stringReader0, 1119L, sessionRemote0);
      Reader reader0 = valueLob0.getReader();
      String[] stringArray0 = new String[6];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      DBUtil.nextLine(resultSet0);
      assertTrue(resultSet0.wasNull());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("select count(*) from ", (Connection) null, true, errorHandler0);
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
      Level level0 = Level.trace;
      ErrorHandler errorHandler0 = new ErrorHandler("%w{'pBzo_Tp|", level0);
      try { 
        DBUtil.runScript("", "", (Connection) null, true, errorHandler0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = DBUtil.available("", "--LimCP", "k", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, false);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("mm+4:ZJ&!naMI\"9a", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = DBUtil.existsEnvironment("rJRD");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      DBUtil.closeResultSetAndStatement(simpleResultSet0);
      assertEquals(0, simpleResultSet0.getRow());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      try { 
        DBUtil.getMetaData((Connection) null, "--\">#C&$PRn'P+A2JG", "--\">#C&$PRn'P+A2JG", true, true, true, true, "--\">#C&$PRn'P+A2JG", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema(",H^Y~-!");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null, dBSchema0);
      String[] stringArray0 = new String[7];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, ",H^Y~-!", false, stringArray0);
      boolean boolean0 = DBUtil.equivalent(dBPrimaryKeyConstraint0, dBPrimaryKeyConstraint0);
      assertTrue(boolean0);
  }
}

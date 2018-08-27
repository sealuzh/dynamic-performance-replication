/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:19:12 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;
import java.util.regex.PatternSyntaxException;
import org.apache.derby.diag.ErrorMessages;
import org.apache.derby.iapi.services.io.FormatableHashtable;
import org.apache.derby.iapi.sql.dictionary.DataDictionary;
import org.apache.derby.impl.sql.compile.FromVTI;
import org.apache.derby.impl.sql.compile.Predicate;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.commons.bean.TypedPropertyMutator;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBNonUniqueIndex;
import org.databene.jdbacl.model.DBNotNullConstraint;
import org.databene.jdbacl.model.DBPackage;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DBUniqueIndex;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.jdbc.AbstractConnection;
import org.firebirdsql.jdbc.FBArray;
import org.firebirdsql.jdbc.InternalTransactionCoordinator;
import org.h2.engine.ConnectionInfo;
import org.h2.engine.SessionRemote;
import org.h2.jdbc.JdbcConnection;
import org.h2.jdbc.JdbcPreparedStatement;
import org.h2.jdbc.JdbcSQLException;
import org.h2.jdbcx.JdbcXAConnection;
import org.h2.table.MetaTable;
import org.h2.tools.Csv;
import org.hsqldb.SessionInterface;
import org.hsqldb.jdbc.jdbcClob;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.junit.runner.RunWith;
import org.postgresql.jdbc3.PSQLSavepoint;
import org.postgresql.jdbc4.Jdbc4Connection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("No environment definition '", (Connection) null);
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
      DBUtil.available("", (String) null, (String) null, (String) null);
      DBUtil.existsEnvironment("opening connection to ");
      SessionRemote sessionRemote0 = new SessionRemote();
      Csv csv0 = Csv.getInstance();
      jdbcClob jdbcClob0 = new jdbcClob("opening connection to ");
      StringReader stringReader0 = new StringReader("opening connection to ");
      ResultSet resultSet0 = csv0.read((Reader) stringReader0, (String[]) null);
      DBUtil.closeResultSetAndStatement(resultSet0);
      try { 
        resultSet0.getBigDecimal("q4zcMM_:a|Di");
        fail("Expecting exception: JdbcSQLException");
      
      } catch(JdbcSQLException e) {
         //
         // Column \"q4zcMM_:a|Di\" not found [42122-136]
         //
         verifyException("org.h2.message.DbException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DBUtil.resetMonitors();
      DBUtil.checkReadOnly("derby.__deleteOnCreate", false);
      ErrorHandler.getDefault();
      Class<DBForeignKeyConstraint> class0 = DBForeignKeyConstraint.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      ErrorHandler errorHandler1 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript(")*>E#w-Y5+", ")*>E#w-Y5+", (Connection) null, false, errorHandler1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: )*>E#w-Y5+
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DBUtil.existsEnvironment("opening connection to ");
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("SEQUENTIAL", "SEQUENTIAL", 'z', (Connection) null, false, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: SEQUENTIAL
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      DBUtil.runScript("--", 'R', (Connection) null, false, errorHandler0);
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("--", (Connection) null);
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
      DBUtil.checkReadOnly("?[PkNT%Px[+[9Tc", false);
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("?[PkNT%Px[+[9Tc", '\'', (Connection) null, false, errorHandler0);
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
      DBUtil.getOpenConnectionCount();
      DBUtil.escape("}ATS4@_ H");
      DBUtil.getOpenPreparedStatementCount();
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.connect("ovo:Zh$UU-21f5nHH", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'ovo:Zh$UU-21f5nHH.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DBUtil.checkReadOnly("", false);
      ErrorHandler.getDefault();
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      Class<DBNonUniqueIndex> class0 = DBNonUniqueIndex.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DBUtil.checkReadOnly("", false);
      ErrorHandler.getDefault();
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      Class<DBNonUniqueIndex> class0 = DBNonUniqueIndex.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "", false, (-1227), 9, 48);
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
      String string0 = "j,`FSd}ce$9l:j";
      Class<JdbcPreparedStatement> class0 = JdbcPreparedStatement.class;
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "j,`FSd}ce$9l:j", "", (String) null);
      boolean boolean0 = true;
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
  public void test10()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("t>avs5\"", "t>avs5\"", ";=i[^", ";=i[^", "t>avs5\"", ";=i[^");
      boolean boolean0 = false;
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting t>avs5\" failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "E6B>HX";
      DBUtil.existsEnvironment("E6B>HX");
      Connection connection0 = null;
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
  public void test12()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(true);
      PSQLSavepoint pSQLSavepoint0 = new PSQLSavepoint("");
      pSQLSavepoint0.getPGName();
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("m`I5;1*hZuy", '3', (Connection) null, true, errorHandler0);
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
      DBUtil.resetMonitors();
      boolean boolean0 = false;
      DBUtil.checkReadOnly("?[PkNT%Px[+[9Tc", false);
      // Undeclared exception!
      try { 
        DBUtil.countRows("--", (Connection) null);
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
  public void test15()  throws Throwable  {
      PSQLSavepoint pSQLSavepoint0 = new PSQLSavepoint("");
      pSQLSavepoint0.getPGName();
      long long0 = MetaTable.ROW_COUNT_APPROXIMATION;
      DBUtil.executeUpdate(" ", (Connection) null);
      jdbcClob jdbcClob0 = new jdbcClob(" ");
      // Undeclared exception!
      try { 
        jdbcClob0.free();
        fail("Expecting exception: AbstractMethodError");
      
      } catch(AbstractMethodError e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Predicate predicate0 = new Predicate();
      FormatableHashtable formatableHashtable0 = new FormatableHashtable();
      ErrorMessages errorMessages0 = new ErrorMessages();
      try { 
        DBUtil.parseResultSet(errorMessages0);
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
      DBUtil.resetMonitors();
      int int0 = DataDictionary.SYSROUTINEPERMS_CATALOG_NUM;
      Csv csv0 = Csv.getInstance();
      jdbcClob jdbcClob0 = new jdbcClob("--No JDBC URL specified");
      Reader reader0 = jdbcClob0.getCharacterStream();
      ResultSet resultSet0 = csv0.read(reader0, (String[]) null);
      try { 
        DBUtil.currentLine(resultSet0);
        fail("Expecting exception: JdbcSQLException");
      
      } catch(JdbcSQLException e) {
         //
         // No data is available [2000-136]
         //
         verifyException("org.h2.message.DbException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBArray fBArray0 = new FBArray();
      Predicate predicate0 = new Predicate();
      predicate0.getSearchClauseHT();
      fBArray0.getResultSet((Map) null);
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
  public void test19()  throws Throwable  {
      DBUtil.resetMonitors();
      Class<JdbcPreparedStatement> class0 = JdbcPreparedStatement.class;
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("", (String) null, (String) null, (String) null);
      boolean boolean0 = true;
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
  public void test20()  throws Throwable  {
      DBUtil.checkReadOnly(">A,", false);
      ErrorHandler.getDefault();
      Class<JdbcXAConnection> class0 = JdbcXAConnection.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet((ResultSet) null, (Statement) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
      PSQLSavepoint pSQLSavepoint0 = new PSQLSavepoint("");
      pSQLSavepoint0.getPGName();
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      assertEquals(Level.fatal, errorHandler0.getLevel());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
      String string0 = "";
      String string1 = "AL2|e_4";
      // Undeclared exception!
      try { 
        DBUtil.getMetaData((Connection) null, "", "AL2|e_4", false, true, false, true, "[name=", true);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 5
         // [name=
         //      ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBArray fBArray0 = new FBArray();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "t>avs5a";
      stringArray0[1] = null;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, false, stringArray0);
      DBUtil.equivalent(dBPrimaryKeyConstraint0, dBPrimaryKeyConstraint0);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint1 = defaultDBTable0.getPrimaryKeyConstraint();
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 't>avs5a' not found in table 'null'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ErrorHandler.getDefault();
      Class<TypedPropertyMutator> class0 = TypedPropertyMutator.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      int int0 = DBUtil.executeUpdate((String) null, (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DBUtil.existsEnvironment("No JDBC URL specified");
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      Class<DBPackage> class0 = DBPackage.class;
      ErrorHandler errorHandler1 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("databene", (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Connection connection0 = null;
      DBUtil.close((Connection) null);
      DBUtil.resetMonitors();
      DBUtil.assertAllDbResourcesClosed(true);
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("--");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '--.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("E6B>HX");
      DBUtil.dependencyOrderedTables(tableContainer0);
      ErrorHandler.getDefault();
      PSQLSavepoint pSQLSavepoint0 = new PSQLSavepoint("E6B>HX");
      pSQLSavepoint0.getPGName();
      pSQLSavepoint0.getPGName();
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      assertEquals(Level.fatal, errorHandler0.getLevel());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
      PSQLSavepoint pSQLSavepoint0 = new PSQLSavepoint("");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("Closing statement failed");
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "Closing statement failed", true, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex(" failed: ", true, dBUniqueConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      String[] stringArray1 = new String[0];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(dBTable0, "", true, stringArray1);
      DBUtil.equivalent(dBPrimaryKeyConstraint0, dBPrimaryKeyConstraint0);
      defaultDBTable0.getPrimaryKeyConstraint();
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBArray fBArray0 = new FBArray();
      DBUtil.checkReadOnly("/", false);
      PSQLSavepoint pSQLSavepoint0 = new PSQLSavepoint("~!$");
      pSQLSavepoint0.getPGName();
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("\"~!$\"", '\"', (Connection) null, false, errorHandler0);
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
      FBArray fBArray0 = new FBArray();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/users/apanichella/databene/.env.properties");
      FileSystemHandling.createFolder(evoSuiteFile0);
      DBUtil.checkReadOnly("/", false);
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      Class<Method> class0 = Method.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      int int0 = SessionInterface.TX_REPEATABLE_READ;
      // Undeclared exception!
      try { 
        DBUtil.getMetaData("/", true, false, false, true, "ct", false, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error reading environment data for '/'
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DBUtil.existsEnvironment("--GLXT,[R?$,%WIuGD&gd");
      SessionRemote sessionRemote0 = new SessionRemote();
      Csv csv0 = Csv.getInstance();
      jdbcClob jdbcClob0 = new jdbcClob("--A,");
      StringReader stringReader0 = new StringReader("hz?");
      String[] stringArray0 = new String[0];
      ResultSet resultSet0 = csv0.read((Reader) stringReader0, stringArray0);
      Object[] objectArray0 = DBUtil.currentLine(resultSet0);
      assertNotNull(objectArray0);
  }
}
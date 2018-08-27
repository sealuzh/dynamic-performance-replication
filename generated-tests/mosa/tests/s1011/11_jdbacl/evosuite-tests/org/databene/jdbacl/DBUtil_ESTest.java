/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 02:57:50 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Proxy;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.regex.PatternSyntaxException;
import org.apache.derby.impl.sql.execute.ConstantActionActivation;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.CompositeDBObject;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.DefaultDatabase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.firebirdsql.jdbc.FBArray;
import org.firebirdsql.jdbc.FirebirdConnection;
import org.firebirdsql.jdbc.InternalTransactionCoordinator;
import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.h2.tools.SimpleRowSource;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.jdbcDriver;
import org.hsqldb.persist.HsqlProperties;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "Closing statement failed";
      Connection connection0 = null;
      Level level0 = Level.warn;
      ErrorHandler errorHandler0 = new ErrorHandler("", level0);
      errorHandler0.setLoggingStackTrace(false);
      errorHandler0.handleError((String) null);
      errorHandler0.setLoggingStackTrace(false);
      // Undeclared exception!
      try { 
        DBUtil.runScript("Closing statement failed", "Closing statement failed", (Connection) null, false, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: Closing statement failed
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet((SimpleRowSource) null);
      Connection connection0 = null;
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("--_1e", (Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try { 
        DBUtil.connect("", false);
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
      FBArray fBArray0 = new FBArray();
      fBArray0.getResultSet(127L, 1783);
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
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify((String) null, (Connection) null);
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
      boolean boolean0 = DBUtil.available("8+UH<y@", "8+UH<y@", "org.apache.derby.impl.sql.compile.MaxMinAggregateDefinition", "8+UH<y@");
      boolean boolean1 = DBUtil.existsEnvironment("R>^|.V|");
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("Hr?&QC lS*3:UYR>8", "Hr?&QC lS*3:UYR>8", "Hr?&QC lS*3:UYR>8", "d ");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting Hr?&QC lS*3:UYR>8 failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("", dBSchema0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "V";
      stringArray0[1] = "";
      stringArray0[2] = "V";
      stringArray0[3] = "V";
      stringArray0[4] = "V";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "V";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "V", true, stringArray0);
      DBUtil.equivalent(dBPrimaryKeyConstraint0, dBPrimaryKeyConstraint0);
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DBUtil.getOpenPreparedStatementCount();
      DBUtil.resetMonitors();
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      assertEquals(Level.fatal, errorHandler0.getLevel());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResultSet resultSet0 = null;
      DBUtil.close((ResultSet) null);
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
  public void test11()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      simpleResultSet0.getStatement();
      DBUtil.createLoggingStatementHandler((Statement) null, false);
      String string0 = "FbA`sw^";
      JdbcDataSource jdbcDataSource0 = new JdbcDataSource();
      // Undeclared exception!
      try { 
        jdbcDataSource0.getParentLogger();
        fail("Expecting exception: AbstractMethodError");
      
      } catch(AbstractMethodError e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("^;cE{", (Connection) null);
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
      jdbcDriver.getConnection("FIELD_SCALE", (Properties) null);
      // Undeclared exception!
      try { 
        DBUtil.query("YQXf", (Connection) null);
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
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
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
  public void test15()  throws Throwable  {
      Csv.getInstance();
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
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, (String) null, false, (-4), (-2098), (-2098));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DBUtil.close((Connection) null);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "}", true, (-1740), 1, 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: }
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultDatabase defaultDatabase0 = new DefaultDatabase("--", "--", (VersionNumber) null);
      defaultDatabase0.getTriggers();
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "[", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: [
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultDatabase defaultDatabase0 = new DefaultDatabase(".XC*;xb0;2@zn:W8", "d;IG /TW", (VersionNumber) null);
      defaultDatabase0.getTriggers();
      DBUtil.dependencyOrderedTables(defaultDatabase0);
      DBUtil.escape("d;IG /TW");
      HsqlProperties hsqlProperties0 = new HsqlProperties();
      jdbcConnection jdbcConnection0 = null;
      try {
        jdbcConnection0 = new jdbcConnection(hsqlProperties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.Trace", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = DBUtil.available("n", (String) null, "tq.=^e@^8", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet((SimpleRowSource) null);
      DBUtil.parseResultRow(simpleResultSet0);
      SimpleResultSet simpleResultSet1 = new SimpleResultSet((SimpleRowSource) null);
      String string0 = DBUtil.format(simpleResultSet1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Level level0 = Level.fatal;
      ErrorHandler errorHandler0 = new ErrorHandler("d IQxM`g%JPo,0\"Du/m", level0);
      Level level1 = Level.debug;
      ErrorHandler.setDefaultLevel(level1);
      // Undeclared exception!
      try { 
        DBUtil.runScript("d IQxM`g%JPo,0\"Du/m", 'M', (Connection) null, true, errorHandler0);
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
      Connection connection0 = null;
      ErrorHandler.getDefault();
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("d IQxM`g%JPo,0\"Du/m", 'w', (Connection) null, false, errorHandler0);
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
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("X9'3,I%<}Z");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "X9'3,I%<}Z";
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "O_.M4~>>", true, stringArray0);
      dBUniqueConstraint0.setTable(defaultDBTable0);
      dBUniqueConstraint0.setTable(defaultDBTable0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBUniqueConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'X9'3,I%<}Z' not found in table 'X9'3,I%<}Z'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultDatabase defaultDatabase0 = new DefaultDatabase("--", "--", (VersionNumber) null);
      defaultDatabase0.getTriggers();
      Level level0 = Level.fatal;
      ErrorHandler errorHandler0 = new ErrorHandler("--", level0);
      Level level1 = Level.error;
      ErrorHandler.setDefaultLevel(level1);
      DBUtil.runScript("--", '0', (Connection) null, true, errorHandler0);
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
  public void test26()  throws Throwable  {
      DBUtil.close((Connection) null);
      Level level0 = Level.fatal;
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "--694 d`MI?wvvqs/gW4");
      ErrorHandler errorHandler0 = new ErrorHandler("&K|T[rGp,t", level0);
      Level level1 = Level.error;
      ErrorHandler.setDefaultLevel(level1);
      // Undeclared exception!
      try { 
        DBUtil.getMetaData((Connection) null, "&K|T[rGp,t", "&K|T[rGp,t", false, false, false, false, "&K|T[rGp,t", false);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 9
         // &K|T[rGp,t
         //          ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DBUtil.close((Connection) null);
      InternalTransactionCoordinator.MetaDataTransactionCoordinator internalTransactionCoordinator_MetaDataTransactionCoordinator0 = new InternalTransactionCoordinator.MetaDataTransactionCoordinator();
      InternalTransactionCoordinator internalTransactionCoordinator0 = new InternalTransactionCoordinator(internalTransactionCoordinator_MetaDataTransactionCoordinator0);
      internalTransactionCoordinator0.getConnection();
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "3^%[KB+O@O|L", (String) null, "3^%[KB+O@O|L");
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
}
/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:43:54 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import javax.sql.ConnectionEvent;
import javax.sql.ConnectionPoolDataSource;
import org.apache.derby.diag.ErrorMessages;
import org.apache.derby.iapi.sql.depend.ProviderList;
import org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.GDSType;
import org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp;
import org.firebirdsql.gds.impl.jni.NativeGDSImpl;
import org.firebirdsql.gds.impl.wire.isc_db_handle_impl;
import org.firebirdsql.jdbc.FBArray;
import org.firebirdsql.jdbc.FBPreparedStatement;
import org.firebirdsql.jdbc.InternalTransactionCoordinator;
import org.h2.engine.ConnectionInfo;
import org.h2.engine.SessionRemote;
import org.h2.jdbcx.JdbcConnectionPool;
import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.Csv;
import org.h2.tools.Recover;
import org.h2.tools.SimpleResultSet;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DBUtil.resetMonitors();
      // Undeclared exception!
      try { 
        DBUtil.connect("{Sd", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '{Sd.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("9l<uWv", "9l<uWv", "9l<uWv", "9l<uWv", "%*", "%*");
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting 9l<uWv failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = true;
      DBUtil.assertAllDbResourcesClosed(true);
      Connection connection0 = null;
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("h_#Vcn#2)G;30'", "h_#Vcn#2)G;30'", (Connection) null, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: h_#Vcn#2)G;30'
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DBUtil.getOpenConnectionCount();
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
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.query("9l<uWv", (Connection) null);
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
      DBUtil.assertAllDbResourcesClosed(true);
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "x5rb\"MV@Fi|BP\"", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: x5rb\"MV@Fi|BP\"
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      DBUtil.close((ResultSet) simpleResultSet0);
      String string0 = "zsBcq&5@AzDIuQ3}";
      boolean boolean0 = true;
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
  public void test07()  throws Throwable  {
      DBUtil.checkReadOnly("", false);
      String string0 = DBUtil.escape("The result set is closed");
      assertEquals("The result set is closed", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Level level0 = Level.fatal;
      ErrorHandler errorHandler0 = new ErrorHandler("PliJW>+P}Urc{", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("org.postgresql.jdbc2.AbstractJdbc2Statement", (Connection) null, false, errorHandler0);
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
      DBUtil.existsEnvironment("--<>TruWrTU");
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      DBUtil.runScript("--<>TruWrTU", (Connection) null, false, errorHandler0);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "--<>TruWrTU", false);
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
      Recover recover0 = new Recover();
      recover0.getLobConnection();
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("org.databene.jdbacl.DBUtil", (Connection) null);
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
      DBUtil.resetMonitors();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("zsBcq&5@AzDIuQ3}");
      defaultDBTable0.getPrimaryKeyConstraint();
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
  public void test12()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      DBUtil.currentLine(simpleResultSet0);
      DBUtil.getOpenPreparedStatementCount();
      String string0 = "";
      DBUtil.existsEnvironment("");
      JdbcConnectionPool jdbcConnectionPool0 = JdbcConnectionPool.create("", "", "");
      String string1 = "GRv";
      // Undeclared exception!
      try { 
        jdbcConnectionPool0.getConnection("GRv", "GRv");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.h2.jdbcx.JdbcConnectionPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Recover recover0 = new Recover();
      FBArray fBArray0 = new FBArray();
      ProviderList providerList0 = new ProviderList();
      fBArray0.getResultSet((Map) providerList0);
      DBUtil.createLoggingResultSet((ResultSet) null, (Statement) null);
      ConnectionInfo connectionInfo0 = new ConnectionInfo("dm_+Mpl");
      Class<DBForeignKeyConstraint> class0 = DBForeignKeyConstraint.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      assertEquals(Level.fatal, errorHandler0.getDefaultLevel());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 result set(s)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("9l<uWv", "9l<uWv", "9l<uWv", "9l<uWv", "%*", "%*");
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 result set(s)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("", "%*", "%*", "%*", "%*", "%*");
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
  public void test17()  throws Throwable  {
      Connection connection0 = null;
      String string0 = "No";
      boolean boolean0 = true;
      boolean boolean1 = true;
      boolean boolean2 = false;
      try { 
        DBUtil.getMetaData((Connection) null, "No", "No", true, true, true, false, "u1", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("he`kGhkQ/t|)`.", (String) null, "he`kGhkQ/t|)`.", (String) null, "%*", "he`kGhkQ/t|)`.");
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
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 result set(s)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("i8msZ_?&z.", "i8msZ_?&z.", "i8msZ_?&z.", "i8msZ_?&z.", (String) null, "i8msZ_?&z.");
      DBUtil.wrapWithPooledConnection((Connection) null, false);
      DBUtil.getOpenConnectionCount();
      Random.setNextRandom(250);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 result set(s)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Level level0 = Level.warn;
      ErrorHandler.getDefault();
      ErrorHandler.setDefaultLevel(level0);
      Recover recover0 = new Recover();
      recover0.getLobConnection();
      DBUtil.close((Connection) null);
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
}

/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:06:29 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.diag.ErrorMessages;
import org.apache.derby.iapi.services.io.FormatableHashtable;
import org.apache.derby.iapi.store.raw.data.DataFactory;
import org.apache.derby.iapi.types.XML;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSequence;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.GDSType;
import org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp;
import org.firebirdsql.gds.impl.jni.LocalGDSImpl;
import org.firebirdsql.gds.impl.jni.isc_db_handle_impl;
import org.firebirdsql.jdbc.FBArray;
import org.firebirdsql.jdbc.FBCallableStatement;
import org.firebirdsql.jdbc.FBStatement;
import org.firebirdsql.jdbc.InternalTransactionCoordinator;
import org.h2.expression.Parameter;
import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.Recover;
import org.h2.tools.SimpleResultSet;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;
import org.postgresql.ds.PGConnectionPoolDataSource;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DBUtil.close((Connection) null);
      FBArray fBArray0 = new FBArray();
      Level level0 = Level.ignore;
      ErrorHandler errorHandler0 = new ErrorHandler("--st", level0);
      int int0 = DBUtil.getOpenResultSetCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DBUtil.getOpenStatementCount();
      String string0 = "";
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
  public void test02()  throws Throwable  {
      Class<Method> class0 = Method.class;
      // Undeclared exception!
      try { 
        DBUtil.queryScalarArray("Uy3ww", class0, (Connection) null);
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
      DBUtil.assertAllDbResourcesClosed(false);
      ResultSet resultSet0 = null;
      DBUtil.close((ResultSet) null);
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
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      DBUtil.getOpenPreparedStatementCount();
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "!YXAUkt$", false, 0, 0, 2);
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
      Level level0 = Level.debug;
      ErrorHandler errorHandler0 = new ErrorHandler("<{6c?A<`:|,lZZI_G%H", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("<{6c?A<`:|,lZZI_G%H", (Connection) null, false, errorHandler0);
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
      Recover recover0 = new Recover();
      recover0.getLobConnection();
      ErrorHandler errorHandler0 = new ErrorHandler("42Y64");
      // Undeclared exception!
      try { 
        DBUtil.runScript("42Y64", (Connection) null, true, errorHandler0);
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
      DBUtil.escape("h,w}77#G=<^_");
      // Undeclared exception!
      try { 
        DBUtil.connect("--r.tatemet(s)", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '--r.tatemet(s).env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "r%L,1K:4\"0hked6";
      stringArray0[2] = "~eabCP]@wmG2C$aHVPi";
      defaultDBTable0.getUniqueConstraint(stringArray0);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, " 21VA+%:$2:S4h2QB", true, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.equivalent((DBUniqueConstraint) null, dBPrimaryKeyConstraint0);
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
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, true);
      // Undeclared exception!
      try { 
        DBUtil.close((Statement) proxy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Internal exception in method: public void org.databene.jdbacl.proxy.LoggingStatementHandler.close() throws java.sql.SQLException
         //
         verifyException("org.databene.commons.ExceptionMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBArray fBArray0 = new FBArray();
      fBArray0.getResultSet(0L, (-1890));
      // Undeclared exception!
      try { 
        DBUtil.getStatement((ResultSet) null);
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
      Connection connection0 = null;
      DBUtil.close((Connection) null);
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("IDENTIFIED", (Connection) null);
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
      String string0 = ".env.properties";
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData(".env.properties", "", "", "", ".env.properties", ".env.properties");
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
      Recover recover0 = new Recover();
      recover0.getLobConnection();
      DBUtil.wrapWithPooledConnection((Connection) null, false);
      String string0 = DBUtil.escape("\"y:edFmF$_");
      assertEquals("\"y:edFmF$_", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      DBUtil.getOpenPreparedStatementCount();
      String string0 = "";
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("--", "--", "st", "X@F-|E>EyGdW'H", "CRkzo/{DcJ]KW$zP^", "X@F-|E>EyGdW'H");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting -- failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Level level0 = Level.warn;
      ErrorHandler errorHandler0 = new ErrorHandler("O9a", level0);
      DBUtil.runScript("--tg", (Connection) null, false, errorHandler0);
      DBUtil.getOpenResultSetCount();
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "jh];HE2", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: jh];HE2
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DBUtil.existsEnvironment("(last)");
      ErrorHandler errorHandler0 = new ErrorHandler("(last)");
      assertTrue(errorHandler0.isLoggingStackTrace());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = DBUtil.available("<{6c?A<`:|,lZZI_G%H", (String) null, "<{", "N}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Recover recover0 = new Recover();
      recover0.getLobConnection();
      ErrorHandler errorHandler0 = new ErrorHandler("Database query failed: ");
      // Undeclared exception!
      try { 
        DBUtil.runScript("' found", "' found", (Connection) null, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: ' found
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InternalTransactionCoordinator.MetaDataTransactionCoordinator internalTransactionCoordinator_MetaDataTransactionCoordinator0 = new InternalTransactionCoordinator.MetaDataTransactionCoordinator();
      InternalTransactionCoordinator internalTransactionCoordinator0 = new InternalTransactionCoordinator(internalTransactionCoordinator_MetaDataTransactionCoordinator0);
      internalTransactionCoordinator0.getConnection();
      // Undeclared exception!
      try { 
        DBUtil.countRows("T{wUjDt?\u00078jYa", (Connection) null);
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
      DBUtil.close((Connection) null);
      FBArray fBArray0 = new FBArray();
      FormatableHashtable formatableHashtable0 = new FormatableHashtable();
      formatableHashtable0.put("getNCharacterStream(String)", (Object) null);
      String string0 = "";
      DBSequence dBSequence0 = new DBSequence("getNCharacterStream(String)", "", "");
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("", "CRkzo/{DcJ]KW$zP^", "IDENTIFIED", (String) null, "u5j(mkR8/", (String) null);
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
  public void test22()  throws Throwable  {
      DBUtil.close((Connection) null);
      FBArray fBArray0 = new FBArray();
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
  public void test23()  throws Throwable  {
      FBArray fBArray0 = new FBArray();
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      Class<Parameter> class0 = Parameter.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("st", (Connection) jdbcConnection0, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "42Y64";
      DBUtil.available("42Y64", "42Y64", "42Y64", "42Y64");
      String string1 = "";
      Level level0 = Level.fatal;
      ErrorHandler errorHandler0 = new ErrorHandler("42Y64", level0);
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
  public void test25()  throws Throwable  {
      Connection connection0 = null;
      String string0 = "$/L,c]#Nr;P";
      try { 
        DBUtil.getMetaData((Connection) null, "$/L,c]#Nr;P", "$/L,c]#Nr;P", true, true, false, false, "$/L,c]#Nr;P", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      FBArray fBArray0 = new FBArray();
      DBUtil.checkReadOnly("9", false);
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
}
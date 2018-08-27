/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:09:55 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.derby.iapi.store.replication.master.MasterFactory;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBExecutionResult;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.TableContainerSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.jdbc.FBArray;
import org.h2.engine.SessionRemote;
import org.h2.tools.SimpleResultSet;
import org.junit.runner.RunWith;
import org.postgresql.Driver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "}}R;--", false);
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
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("preparing statement: ", (Connection) null);
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
      DBUtil.close((Connection) null);
      Boolean boolean0 = new Boolean("");
      ErrorHandler errorHandler0 = new ErrorHandler("");
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("", 'e', (Connection) null, (boolean) boolean0, errorHandler0);
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
  public void test04()  throws Throwable  {
      DBUtil.available("wpy/Z[rzoRV", "wpy/Z[rzoRV", "wpy/Z[rzoRV", "wpy/Z[rzoRV");
      Random.setNextRandom(2121);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DBUtil.close((Connection) null);
      DBUtil.existsEnvironment("");
      try { 
        DBUtil.connect("", "mdz8QQRr^", "", "mdz8QQRr^", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting  failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "";
      Connection connection0 = null;
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("", (Connection) null);
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
      DBUtil.assertAllDbResourcesClosed(false);
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("No JDBC driver class name specified", "No JDBC driver class name specified", 'u', (Connection) null, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: No JDBC driver class name specified
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("--uGL_BEv@Sz", "l`*YaK6HqO", "--uGL_BEv@Sz", "--uGL_BEv@Sz");
      boolean boolean0 = true;
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting l`*YaK6HqO failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DBUtil.close((Connection) null);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Connection connection0 = null;
      String string0 = "--EG";
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly("--EG", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: --EG
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DBUtil.close((Connection) null);
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      DBUtil.assertAllDbResourcesClosed(false);
      DBUtil.resetMonitors();
      // Undeclared exception!
      try { 
        DBUtil.queryLong("QIh3q_^", (Connection) null);
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
      DBUtil.close((Connection) null);
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 connection(s)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("No JDBC driver class name specified", (Connection) null, true, errorHandler0);
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
      Boolean boolean0 = new Boolean("Error reading environment data for '");
      ErrorHandler errorHandler0 = new ErrorHandler("Error reading environment data for '");
      // Undeclared exception!
      try { 
        DBUtil.runScript("getMetaData", 'e', (Connection) null, false, errorHandler0);
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
      DBUtil.close((Connection) null);
      DBUtil.wrapWithPooledConnection((Connection) null, false);
      DBUtil.available((String) null, (String) null, (String) null, "--No");
      // Undeclared exception!
      try { 
        DBUtil.executeQuery("#83bJA{n", (Connection) null);
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
      DBUtil.close((Connection) null);
      DBUtil.escape("XSDBC.D");
      // Undeclared exception!
      try { 
        DBUtil.countRows("XSDBC.D", (Connection) null);
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
      DBUtil.assertAllDbResourcesClosed(false);
      DBUtil.resetMonitors();
      Connection connection0 = null;
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        DBUtil.getMetaData((Connection) null, "--No JDBC driver class name specified", "p!)~crl$Jpry,", true, false, false, false, "--No JDBC driver class name specified", true);
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
      Class<Driver> class0 = Driver.class;
      // Undeclared exception!
      try { 
        DBUtil.queryScalarArray("--EG", class0, (Connection) null);
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
      TableContainerSupport tableContainerSupport0 = new TableContainerSupport();
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobStorage();
      sessionRemote0.getLobConnection();
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
  public void test20()  throws Throwable  {
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      DBUtil.close((Connection) null);
      sessionRemote0.autoCommitIfCluster();
      DBUtil.existsEnvironment("");
      DBUtil.wrapWithPooledConnection((Connection) null, false);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      Level level0 = Level.fatal;
      ErrorHandler errorHandler0 = new ErrorHandler("--", level0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--uGL_BEv@Sz", '2', (Connection) proxy0, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DBUtil.close((Connection) null);
      DBUtil.close((Connection) null);
      DBUtil.existsEnvironment("");
      DBUtil.wrapWithPooledConnection((Connection) null, false);
      DBUtil.wrapWithPooledConnection((Connection) null, false);
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      Level level0 = Level.warn;
      ErrorHandler.setDefaultLevel(level0);
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
  public void test22()  throws Throwable  {
      TableContainerSupport tableContainerSupport0 = new TableContainerSupport();
      DBUtil.dependencyOrderedTables(tableContainerSupport0);
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      String string0 = "tT=*";
      // Undeclared exception!
      try { 
        DBUtil.query("tT=*", (Connection) null);
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
      Random.setNextRandom(2000);
      String string0 = MasterFactory.MODULE;
      DBUtil.close((Statement) null);
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DBUtil.closeResultSetAndStatement(simpleResultSet0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      DBUtil.parseAndSimplifyResultSet(simpleResultSet0);
      DBUtil.checkReadOnly("org.apache.derby.iapi.store.replication.master.MasterFactory", false);
      DBUtil.createLoggingStatementHandler((Statement) null, false);
      char char0 = 'E';
      String string1 = null;
      boolean boolean0 = false;
      try { 
        DBUtil.connect("org.apache.derby.iapi.store.replication.master.MasterFactory", (String) null, (String) null, "6gJfkTOpjW^D", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting org.apache.derby.iapi.store.replication.master.MasterFactory failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Connection connection0 = null;
      boolean boolean0 = true;
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, (String) null, "EG", (String) null);
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
}
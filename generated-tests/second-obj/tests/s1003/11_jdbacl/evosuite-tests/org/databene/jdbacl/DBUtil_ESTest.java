/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:42:59 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import org.apache.derby.iapi.store.raw.xact.RawTransaction;
import org.apache.derby.impl.sql.compile.FromBaseTable;
import org.apache.derby.impl.sql.compile.GenerationClauseNode;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBSequence;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DBUniqueIndex;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.databene.jdbacl.model.TableContainerSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.firebirdsql.gds.impl.AbstractIscTrHandle;
import org.firebirdsql.jdbc.FBArray;
import org.h2.Driver;
import org.h2.engine.SessionRemote;
import org.h2.expression.Comparison;
import org.h2.expression.Function;
import org.h2.jdbcx.JdbcConnectionPool;
import org.h2.tools.Recover;
import org.h2.tools.SimpleResultSet;
import org.hsqldb.lib.FileUtil;
import org.junit.runner.RunWith;
import org.postgresql.jdbc4.Jdbc4Connection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = DBUtil.available((String) null, (String) null, (String) null, "--\"|");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = ".>=lZ54!xnk|9AGl";
      DBUtil.available(".>=lZ54!xnk|9AGl", ".>=lZ54!xnk|9AGl", "x(P/ fS ;<3T;]inmC", ".>=lZ54!xnk|9AGl");
      boolean boolean0 = false;
      char char0 = 'q';
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, ".db", "42831.S.1", ".>=lZ54!xnk|9AGl", ".db", "x(P/ fS ;<3T;]inmC");
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
  public void test02()  throws Throwable  {
      int int0 = Function.LCASE;
      DBUtil.existsEnvironment(",1zD1av,7V9");
      String string0 = "--";
      DBUtil.checkReadOnly("a<{UP:yw,I<+2Z\"pV@!", false);
      DBUtil.getOpenResultSetCount();
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("CURRENT SCHEMA", "a<{UP:yw,I<+2Z\"pV@!", "No results were returned by the query.", "--", "\"|", "No results were returned by the query.");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting a<{UP:yw,I<+2Z\"pV@! failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.connect("42XA0", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '42XA0.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Function.LCASE;
      DBUtil.existsEnvironment(",1zD1av,7V9");
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)11;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      DBUtil.assertAllDbResourcesClosed(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "=>ElL]I%G9iXo)=]";
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("=>ElL]I%G9iXo)=]");
      TableContainer tableContainer0 = new TableContainer("Connecting the database failed silently - probably due to wrong driver (", defaultDBTable0);
      tableContainer0.getSchema();
      defaultDBTable0.setSchema((DBSchema) null);
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
  public void test06()  throws Throwable  {
      Class<DBUtil> class0 = DBUtil.class;
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      // Undeclared exception!
      try { 
        DBUtil.queryScalarArray("as", class0, (Connection) null);
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
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("R/~cz9[=jTJC[qn", ' ', (Connection) null, false, errorHandler0);
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
      Recover recover0 = new Recover();
      recover0.getLobConnection();
      DBUtil.getOpenConnectionCount();
      // Undeclared exception!
      try { 
        DBUtil.runScript("sqbd.AO\"Iv`", (Connection) null, false, (ErrorHandler) null);
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
      SessionRemote sessionRemote0 = new SessionRemote();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      sessionRemote0.getLobConnection();
      Level level0 = Level.debug;
      sessionRemote0.getTempFileDeleter();
      ErrorHandler errorHandler0 = new ErrorHandler("<Be'c=99", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("You are trying to resume a transaction that has is new", (Connection) null, true, errorHandler0);
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
      DBUtil.available(".>=lZ54!xnk|9AGl", ".>=lZ54!xnk|9AGl", "x(P/ fS ;<3z;]inmC", ".>=lZ54!xnk|9AGl");
      DBUtil.assertAllDbResourcesClosed(false);
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = new Boolean(".>=lZ54!xnk|9AGl");
      DBUtil.checkReadOnly(".>=lZ54!xnk|9AGl", false);
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("0lpnKy5z2A2&03tV", (Connection) null);
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
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      DBUtil.checkReadOnly("E>J", false);
      Recover recover0 = new Recover();
      recover0.getLobConnection();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "E>J");
      try { 
        DBUtil.getMetaData((Connection) null, (String) null, "E>J", false, false, false, true, (String) null, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DBUtil.getOpenResultSetCount();
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      sessionRemote0.autoReconnect(1018);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      System.setCurrentTimeMillis(3912L);
      DBUtil.getOpenStatementCount();
      String string0 = DBUtil.escape("9%~LMI");
      assertEquals("9%~LMI", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = AbstractIscTrHandle.TRANSACTIONROLLINGBACK;
      String string0 = "--Database query failed:";
      Recover recover0 = new Recover();
      recover0.getLobConnection();
      ErrorHandler errorHandler0 = new ErrorHandler("Connecting ");
      Level level0 = Level.info;
      ErrorHandler.setDefaultLevel(level0);
      DBUtil.runScript("--Database query failed:", '>', (Connection) null, true, errorHandler0);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "Connecting ", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: Connecting 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Recover recover0 = new Recover();
      recover0.getLobConnection();
      ErrorHandler errorHandler0 = new ErrorHandler("Connecting ");
      DBUtil.runScript("--Database query failed:", '2', (Connection) null, false, errorHandler0);
      // Undeclared exception!
      try { 
        DBUtil.countRows("--Database query failed:", (Connection) null);
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
      JdbcConnectionPool.create("^0 `@iC,CN", ".>=lZ54!xnk|9AGl", "jdbc:columnlist:connection");
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("jdbc:columnlist:connection", (String) null, ".>=lZ54!xnk|9AGl", "select count(*) from ");
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
  public void test18()  throws Throwable  {
      DBUtil.getOpenResultSetCount();
      Recover recover0 = new Recover();
      recover0.getLobConnection();
      ErrorHandler errorHandler0 = new ErrorHandler("C}nhecting");
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "C}nhecting", false, 0, 0, 0);
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
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Level level0 = Level.ignore;
      ErrorHandler.setDefaultLevel(level0);
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      // Undeclared exception!
      try { 
        DBUtil.query("^]V/@`'v0!}=o{", (Connection) null);
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
      DBUtil.getOpenResultSetCount();
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      DBUtil.close((Connection) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      int int0 = Comparison.EQUAL;
      SessionRemote sessionRemote1 = new SessionRemote();
      sessionRemote1.getLobConnection();
      Integer integer0 = RawTransaction.COMMIT;
      Integer.sum((-1176), 2);
      ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("_7-:3mekJld4", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
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
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ErrorHandler errorHandler0 = new ErrorHandler("-- page count type: ");
      // Undeclared exception!
      try { 
        DBUtil.runScript("-- page count type: ", "-- page count type: ", (Connection) null, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: -- page count type: 
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, ",");
      Connection connection0 = null;
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
  public void test25()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getTempFileDeleter();
      DBUtil.existsEnvironment("--DATA_TYPE");
      sessionRemote0.getLobConnection();
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("x(P/ fS ;<3z;]inmC", (Connection) null);
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
      boolean boolean0 = FileUtil.fsIsIgnoreCase;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("25S01");
      String[] stringArray0 = new String[3];
      stringArray0[0] = ".>=lZ54!xnk|9AGl";
      stringArray0[1] = "25S01";
      stringArray0[2] = "25S01";
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, ".>=lZ54!xnk|9AGl", false, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("25S01", false, dBUniqueConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      String[] stringArray1 = new String[5];
      stringArray1[1] = "25S01";
      stringArray1[2] = ".>=lZ54!xnk|9AGl";
      stringArray1[3] = "25S01";
      stringArray1[4] = "25S01";
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint(".>=lZ54!xnk|9AGl", false, dBTable0, stringArray0, dBTable0, stringArray1);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBForeignKeyConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column '.>=lZ54!xnk|9AGl' not found in table '25S01'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBArray fBArray0 = new FBArray();
      GenerationClauseNode generationClauseNode0 = new GenerationClauseNode();
      generationClauseNode0.getAuxiliaryProviderList();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DBUtil.closeResultSetAndStatement(simpleResultSet0);
      // Undeclared exception!
      try { 
        DBUtil.parseResultRow(simpleResultSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.h2.tools.SimpleResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TableContainerSupport tableContainerSupport0 = new TableContainerSupport();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      DBSequence dBSequence0 = new DBSequence(" _+kG@zU", " _+kG@zU", " _+kG@zU");
      tableContainerSupport0.addSequence(dBSequence0);
      tableContainerSupport0.getSubContainers();
      DBUtil.dependencyOrderedTables(tableContainerSupport0);
      Driver driver0 = Driver.load();
      assertEquals(2, driver0.getMinorVersion());
  }
}

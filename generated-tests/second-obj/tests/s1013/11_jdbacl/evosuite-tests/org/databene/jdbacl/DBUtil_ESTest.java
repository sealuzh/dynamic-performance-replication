/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:19:17 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import org.apache.derby.impl.sql.compile.BinaryOperatorNode;
import org.apache.derby.impl.store.access.btree.BTree;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBProcedure;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBTrigger;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DBUniqueIndex;
import org.databene.jdbacl.model.DefaultDBTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.firebirdsql.gds.DatabaseParameterBuffer;
import org.h2.engine.SessionRemote;
import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.Csv;
import org.h2.tools.Recover;
import org.h2.tools.SimpleResultSet;
import org.h2.tools.SimpleRowSource;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DBUtil.resetMonitors();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("Connected to ", 46);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      ResultSet resultSet0 = null;
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
  public void test01()  throws Throwable  {
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "@HpVoYvhnSbV,Cf)O7", false);
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
      DBUtil.close((Connection) null);
      // Undeclared exception!
      try { 
        DBUtil.connect("}]", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '}].env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      DBSchema dBSchema0 = new DBSchema("Error reading environment data for '");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("Error reading environment data for '", dBSchema0);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, false, (String[]) null);
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
  public void test04()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler(", ");
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify(", ", (Connection) null);
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
      Recover recover0 = new Recover();
      Recover recover1 = new Recover();
      recover1.getLobConnection();
      // Undeclared exception!
      try { 
        DBUtil.query((String) null, (Connection) null);
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
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("CO=yC", "CO=yC", "--+", "''");
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting CO=yC failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("D ;&tqB@r#fumr");
      DBUtil.format(simpleResultSet0);
      DBUtil.getOpenResultSetCount();
      DBUtil.getStatement(simpleResultSet0);
      DBUtil.close((ResultSet) simpleResultSet0);
      assertTrue(simpleResultSet0.isClosed());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("Lk-h", (Connection) null);
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
      DBUtil.existsEnvironment("SYSCS_BACKUP_DATABASE_AND_ENABLE_LOG_ARCHIVE_MODE");
      DBUtil.assertAllDbResourcesClosed(true);
      // Undeclared exception!
      try { 
        DBUtil.queryScalar("_U", (Connection) null);
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
      DBUtil.close((Connection) null);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "P=$.`@~Ai", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: P=$.`@~Ai
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      DBUtil.runScript("", (Connection) null, true, errorHandler0);
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
  public void test12()  throws Throwable  {
      Class<DBProcedure> class0 = DBProcedure.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("V*7U|VB(&14", (Connection) null, false, errorHandler0);
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
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript(", ", ", ", (Connection) null, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: , 
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      DBUtil.assertAllDbResourcesClosed(true);
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "`98D#+#~m9+t", (String) null, "--1wwg]T'?", "--1wwg]T'?", "`98D#+#~m9+t");
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
  public void test15()  throws Throwable  {
      String string0 = "m%lf\\&f1Z9}5s";
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("m%lf&f1Z9}5s", (Connection) null);
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
      DBUtil.getOpenStatementCount();
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
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.runScript("@hd7l?", '8', (Connection) null, true, (ErrorHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Connection connection0 = null;
      ErrorHandler errorHandler0 = new ErrorHandler("Error closing connection");
      String string0 = "--,";
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      // Undeclared exception!
      try { 
        DBUtil.countRows("Expected exactly one row, found more.", (Connection) null);
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
      DBUtil.close((Connection) null);
      try { 
        DBUtil.getMetaData((Connection) null, "timeout", (String) null, true, true, true, true, (String) null, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ErrorHandler.getDefault();
      FileSystemHandling.shouldAllThrowIOExceptions();
      DBUtil.getOpenStatementCount();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("?vg/Y|pO4KOi");
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "Error reading environment data for '", true, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("Error reading environment data for '", true, dBUniqueConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(dBTable0, "Error reading environment data for '", true, stringArray0);
      DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint0);
      DBUtil.format(simpleResultSet0);
      int int0 = DBUtil.getOpenResultSetCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DBUtil.getOpenStatementCount();
      DBUtil.executeUpdate((String) null, (Connection) null);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable(", ");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Mg*";
      stringArray0[1] = "Mg*";
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "Mg*", true, stringArray0);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "Connecting the database failed silently - probably due to wrong driver (", true, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBUniqueConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'Mg*' not found in table ', '
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("KLemfJmuM\",c>w");
      DBUtil.runScript("COMMENT", (Connection) null, true, errorHandler0);
      DBUtil.getOpenStatementCount();
      System.setCurrentTimeMillis((-976L));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = null;
      Boolean boolean0 = new Boolean((String) null);
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.cancelStatement((-2594));
      sessionRemote0.getLobStorage();
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData(", (short) ", (String) null, ">K]Qb?k<#w=i~x+qr9", "--COMMENT", "--+", "--");
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
  public void test25()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      DBUtil.escape(">pXp^");
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, ",", false, (-1), (-1), (-2956));
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
      ErrorHandler errorHandler0 = new ErrorHandler("Column identifier must be not null.");
      Level level0 = Level.info;
      ErrorHandler.setDefaultLevel(level0);
      DBUtil.runScript("--COMMENT", (Connection) null, true, errorHandler0);
      long long0 = BTree.ROOTPAGEID;
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = BinaryOperatorNode.GT;
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("D ;&tqB@r#fumr");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/users/apanichella/databene/ref.env.properties");
      FileSystemHandling.createFolder(evoSuiteFile0);
      DBUtil.format(simpleResultSet0);
      DBUtil.getOpenResultSetCount();
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("ref");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error reading environment data for 'ref'
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("[B");
      int int0 = DatabaseParameterBuffer.SQL_ROLE_NAME;
      DBSchema dBSchema0 = new DBSchema("' et9mQO)taDs!>");
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      simpleResultSet0.getStatement();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      DBUtil.close((Statement) null);
      DBUtil.format(simpleResultSet0);
      DBUtil.available("VBj&I131", "VBj&I131", "", ".*");
      DBUtil.nextLine(simpleResultSet0);
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
}
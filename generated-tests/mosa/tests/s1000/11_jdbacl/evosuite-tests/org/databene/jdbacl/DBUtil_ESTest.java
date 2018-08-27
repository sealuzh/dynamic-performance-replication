/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 15:35:24 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.regex.PatternSyntaxException;
import org.apache.derby.diag.ErrorMessages;
import org.apache.derby.iapi.sql.dictionary.DataDictionary;
import org.apache.derby.impl.sql.execute.ConstantActionActivation;
import org.databene.commons.ErrorHandler;
import org.databene.commons.bean.TypedPropertyMutator;
import org.databene.jdbacl.DBExecutionResult;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDBTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.firebirdsql.jdbc.FBArray;
import org.h2.engine.SessionRemote;
import org.h2.value.ValueDecimal;
import org.junit.runner.RunWith;
import org.postgresql.jdbc4.Jdbc4Connection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      DBUtil.getOpenResultSetCount();
      DBUtil.assertAllDbResourcesClosed(true);
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DBUtil.getOpenConnectionCount();
      boolean boolean0 = DBUtil.available("", "", "", "3PzkN1hMg!>^9~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "0";
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        DBUtil.connect("0", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '0.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema("1u#HFV3v~", dBCatalog0);
      dBSchema0.setName("1u#HFV3v~");
      dBSchema0.isIdentical(dBCatalog0);
      DBSchema dBSchema1 = new DBSchema("1u#HFV3v~", dBCatalog0);
      DBSchema dBSchema2 = dBCatalog0.getSchema("1u#HFV3v~");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null, dBSchema2);
      defaultDBTable0.getPrimaryKeyConstraint();
      String string0 = DBUtil.escape("evA``J]TuW:L%");
      assertEquals("evA``J]TuW:L%", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.readSessionState();
      sessionRemote0.getLobConnection();
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
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      Class<TypedPropertyMutator> class0 = TypedPropertyMutator.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      String string0 = "--' found";
      // Undeclared exception!
      try { 
        DBUtil.getMetaData((Connection) null, "--' found", "--' found", true, false, true, true, "AS5?*", false);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Dangling meta character '*' near index 4
         // AS5?*
         //     ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = DBUtil.available((String) null, (String) null, (String) null, "null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("Z", 524);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DBUtil.getOpenPreparedStatementCount();
      DBUtil.assertAllDbResourcesClosed(true);
      ErrorHandler errorHandler0 = new ErrorHandler("--");
      try { 
        DBUtil.runScript("", "", 'n', (Connection) null, true, errorHandler0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "", false, stringArray0);
      dBPrimaryKeyConstraint0.setOwner(defaultDBTable0);
      dBPrimaryKeyConstraint0.isIdentical(defaultDBTable0);
      dBPrimaryKeyConstraint0.isIdentical(defaultDBTable0);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint1 = defaultDBTable0.getPrimaryKeyConstraint();
      dBPrimaryKeyConstraint1.setTable(defaultDBTable0);
      dBPrimaryKeyConstraint0.setDoc("dKr[Gf");
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column '' not found in table ''
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      Connection connection0 = null;
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "COMMENT", false);
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
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      ErrorHandler errorHandler0 = new ErrorHandler("JHzZZ");
      // Undeclared exception!
      try { 
        DBUtil.runScript("JHzZZ", (Connection) null, true, errorHandler0);
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
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      ErrorHandler errorHandler0 = new ErrorHandler("YCTB+g");
      errorHandler0.setLoggingStackTrace(false);
      // Undeclared exception!
      try { 
        DBUtil.runScript("' found", 'R', (Connection) proxy0, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema("--JHzZZ", dBCatalog0);
      dBSchema0.isIdentical(dBCatalog0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      String string0 = "42X39";
      String string1 = null;
      String string2 = "' ";
      Class<Annotation> class0 = Annotation.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript((String) null, (String) null, (Connection) null, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = DataDictionary.SYSDEPENDS_CATALOG_NUM;
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("OL2?.", "OL2?.", "OL2?.", "OL2?.", "OL2?.", "--JdzZZ");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting OL2?. failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DBUtil.getOpenResultSetCount();
      String string0 = "";
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
  public void test19()  throws Throwable  {
      DBUtil.getOpenStatementCount();
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly("--JHzZZ", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: --JHzZZ
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "' ";
      SessionRemote sessionRemote0 = new SessionRemote();
      sessionRemote0.getLobConnection();
      Class<TypedPropertyMutator> class0 = TypedPropertyMutator.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      ValueDecimal valueDecimal0 = (ValueDecimal)ValueDecimal.ONE;
      DBUtil.resetMonitors();
      // Undeclared exception!
      try { 
        DBUtil.query("' ", (Connection) null);
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
      FBArray fBArray0 = new FBArray();
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
  public void test22()  throws Throwable  {
      DBUtil.existsEnvironment("--8f(");
      DBSchema dBSchema0 = new DBSchema("--8f(");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("Jd", dBSchema0);
      defaultDBTable0.getUniqueConstraint((String[]) null);
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
}

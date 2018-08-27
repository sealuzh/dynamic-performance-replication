/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 19:34:46 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.PipedReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.io.StringReader;
import org.apache.derby.iapi.sql.dictionary.PermDescriptor;
import org.apache.derby.iapi.store.raw.xact.RawTransaction;
import org.apache.derby.iapi.types.TypeId;
import org.apache.derby.impl.sql.catalog.DataDictionaryImpl;
import org.databene.jdbacl.NameSpec;
import org.databene.jdbacl.SQLUtil;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBConstraint;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.hsqldb.rowio.RowOutputBinary;
import org.hsqldb.rowio.RowOutputText;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SQLUtil.removeComments("-,RCz");
      SQLUtil.parseColumnTypeAndSize("-,RCz");
      NameSpec nameSpec0 = NameSpec.NEVER;
      // Undeclared exception!
      try { 
        SQLUtil.fkSpec((DBForeignKeyConstraint) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SQLUtil.removeComments("-,RCz");
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("-,RCz");
      assertNull(boolean0);
      
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderColumnNames(stringArray0);
      assertEquals("()", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("create materialized viewq[4s%ujygvm+");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("create materialized viewq[4s%ujygvm+");
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "create materialized viewq[4s%ujygvm+", false, (String[]) null);
      String string0 = SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      assertEquals("CONSTRAINT \"create materialized viewq[4s%ujygvm+\" ", string0);
      
      String string1 = SQLUtil.renderValue("CONSTRAINT \"create materialized viewq[4s%ujygvm+\" ");
      assertEquals("'CONSTRAINT \"create materialized viewq[4s%ujygvm+\" '", string1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = SQLUtil.normalize("_*t5", false);
      assertEquals("_ * t5", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = SQLUtil.normalize("select intouk~uf' i!s[^ekqiin?", true);
      assertEquals("select intouk ~ uf ' i!s[^ekqiin?'", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("-,RCz");
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "-,RCz", true, (String[]) null);
      String string0 = SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      assertEquals("CONSTRAINT -,RCz ", string0);
      
      Object object0 = new Object();
      String string1 = SQLUtil.renderValue(dBPrimaryKeyConstraint0);
      assertEquals("CONSTRAINT -,RCz PRIMARY KEY ()", string1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "6DDw^/H89X";
      stringArray0[1] = "6DDw^/H89X";
      String string0 = SQLUtil.innerJoin("6DDw^/H89X", stringArray0, "6DDw^/H89X", "6DDw^/H89X", stringArray0);
      assertEquals("6DDw^/H89X as 6DDw^/H89X on 6DDw^/H89X.6DDw^/H89X = 6DDw^/H89X.6DDw^/H89X and 6DDw^/H89X.6DDw^/H89X = 6DDw^/H89X.6DDw^/H89X", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("execcatalog null");
      SQLUtil.renderValue(tableContainer0);
      // Undeclared exception!
      try { 
        SQLUtil.leftJoin("01C4D%Pt[5R-", (String[]) null, "execcatalog null", "execcatalog null", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = SQLUtil.isProcedureCall("CW:w8Y1@5:KF");
      assertFalse(boolean0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("h),9K");
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("CW:w8Y1@5:KF", false, defaultDBTable0, (String[]) null, defaultDBTable0, (String[]) null);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.fkSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("FOREIGN KEY () REFERENCES h),9K()", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = SQLUtil.normalize("_*t5", true);
      assertEquals("_ * t5", string0);
      
      TableContainer tableContainer0 = new TableContainer("_*t5");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[0];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "_ * t5", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string1 = SQLUtil.ukSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("UNIQUE ()", string1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("`0QuJMO7b");
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "x", true, (String[]) null);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.pkSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("CONSTRAINT x PRIMARY KEY ()", string0);
      
      NameSpec nameSpec1 = NameSpec.NEVER;
      String string1 = SQLUtil.pkSpec(dBPrimaryKeyConstraint0, nameSpec1);
      assertEquals("PRIMARY KEY ()", string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("7nsjk?7dtf");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SQLUtil sQLUtil0 = new SQLUtil();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      SQLUtil.renderQuery(defaultDBTable0, stringArray0, (Object[]) null);
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("7nsjk?7dtf");
      String string0 = SQLUtil.typeAndName(dBCatalog0);
      assertEquals("catalog 7nsjk?7dtf", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("-,RCz");
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "-,RCz", false, (String[]) null);
      SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      String string0 = TypeId.LONGINT_NAME;
      // Undeclared exception!
      try { 
        SQLUtil.appendConstraintName((DBConstraint) dBPrimaryKeyConstraint0, (StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = SQLUtil.normalize("o49f/durE2#(0w|5", true);
      assertEquals("o49f / durE2 # (0w | 5", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("", defaultDBTable0, (-504), "");
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("  NULL", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("- 0", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("X0Y32.S", 451);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      String string0 = "M'/>QUsx>IA";
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = SQLUtil.addRequiredCondition("M'/>QUsx>IA", stringBuilder0);
      StringBuilder stringBuilder2 = stringBuilder1.append((-1846.344136));
      // Undeclared exception!
      try { 
        stringBuilder2.append((char[]) null, (-60538510), (-60538510));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = SQLUtil.normalize("alter indexorg.apache.derby.impl.sql.compile.windowreferencenode", false);
      assertEquals("alter indexorg.apache.derby.impl.sql.compile.windowreferencenode", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SQLUtil.removeComments("-,RCz");
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "-,RCz");
      SQLUtil.addOptionalCondition("-,RCz", stringBuilder0);
      assertEquals("-,RCz or -,RCz", stringBuilder0.toString());
      
      boolean boolean0 = SQLUtil.isQuery("-,RCz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SQLUtil.isProcedureCall("drop indexu");
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = SQLUtil.isProcedureCall("drop indexu");
      assertFalse(boolean0);
      
      String string0 = SQLUtil.substituteMarkers("drop indexu", "u?&j", "u?&j");
      assertEquals("drop indexu", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      String string0 = SQLUtil.typeAndName(dBCatalog0);
      assertEquals("catalog null", string0);
      assertNotNull(string0);
      
      String string1 = SQLUtil.ownerDotComponent(dBCatalog0);
      assertEquals("null", string1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable(" 'lPzF8'J3");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "%4(&x";
      stringArray0[1] = "%4(&x";
      stringArray0[2] = " 'lPzF8'J3";
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("%4(&x = '%4(&x' AND %4(&x = '%4(&x' AND  'lPzF8'J3 = ' 'lPzF8'J3'", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = PermDescriptor.USAGE_PRIV;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("5H");
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "5H", false, (String[]) null);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string1 = SQLUtil.constraintSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("CONSTRAINT 5H PRIMARY KEY ()", string1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      String string0 = SQLUtil.typeAndName(dBCatalog0);
      assertEquals("catalog null", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "catalog null";
      String string1 = SQLUtil.renderColumnListWithTableName("catalog null", stringArray0);
      assertEquals("catalog null.catalog null", string1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "3<";
      stringArray0[1] = "3<";
      String string0 = SQLUtil.renderColumnListWithTableName("3<", stringArray0);
      assertEquals("3<.3<, 3<.3<", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SQLUtil.isProcedureCall("drop indexu");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = null;
      stringArray0[1] = null;
      stringArray0[2] = "drop indexu";
      stringArray0[3] = null;
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      RowOutputBinary rowOutputBinary0 = new RowOutputBinary(byteArray0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(rowOutputBinary0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(dataOutputStream0);
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) stringArray0[1]);
      SQLUtil.renderAddForeignKey(dBForeignKeyConstraint0, nameSpec0, printWriter0);
      assertNull(dBForeignKeyConstraint0.getName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = SQLUtil.typeAndName((DBObject) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = PermDescriptor.USAGE_PRIV;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("delete");
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "delete", false, (String[]) null);
      SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBPrimaryKeyConstraint0, nameSpec0);
      SQLUtil.addRequiredCondition("delete", stringBuilder0);
      assertEquals("CONSTRAINT delete  and delete", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "zT6Lt)Ffs:H2mvY");
      StringBuilder stringBuilder0 = new StringBuilder(467);
      SQLUtil.addOptionalCondition("cjkNM6zn;v/kS", stringBuilder0);
      assertEquals("cjkNM6zn;v/kS", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      Object object0 = new Object();
      dBCatalog0.equals(object0);
      SQLUtil.typeAndName(dBCatalog0);
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnTypeWithSize((DBColumn) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SQLUtil.removeComments("delete");
      boolean boolean0 = SQLUtil.isDML("delete");
      assertTrue(boolean0);
      
      String string0 = SQLUtil.normalize("delete", true);
      assertEquals("delete", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure("Q[4s%UJygVM+");
      assertFalse(boolean0);
      
      String string0 = SQLUtil.normalize("Q[4s%UJygVM+", true);
      assertEquals("Q [ 4s % UJygVM +", string0);
      
      Boolean boolean1 = SQLUtil.mutatesDataOrStructure("select into");
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SQLUtil.normalize("left", true);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("@!o");
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, false, (String[]) null);
      SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBPrimaryKeyConstraint0, nameSpec0);
      SQLUtil.appendConstraintName((DBConstraint) dBPrimaryKeyConstraint0, stringBuilder0);
      // Undeclared exception!
      try { 
        SQLUtil.renderQuery(defaultDBTable0, (String[]) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = SQLUtil.normalize("yR)", false);
      assertEquals("yR)", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = PermDescriptor.USAGE_PRIV;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)44;
      byteArray0[1] = (byte)15;
      byteArray0[2] = (byte) (-4);
      byteArray0[3] = (byte)45;
      byteArray0[4] = (byte)90;
      byteArray0[5] = (byte)47;
      byteArray0[6] = (byte)124;
      byteArray0[7] = (byte) (-78);
      byteArray0[8] = (byte)81;
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("USAGE");
      DBDataType dBDataType0 = DBDataType.getInstance((-64598022), "USAGE");
      Integer integer0 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("9WLQY')H$zM1Ge+", defaultDBTable0, dBDataType0, integer0);
      String string1 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("9WLQY')H$zM1Ge+ USAGE(2) NULL", string1);
      
      String string2 = SQLUtil.ownerDotComponent(defaultDBColumn0);
      assertEquals("USAGE.9WLQY')H$zM1Ge+", string2);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = PermDescriptor.USAGE_PRIV;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("USAGE");
      DBDataType dBDataType0 = DBDataType.getInstance((-64598022), "USAGE");
      Integer integer0 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("9WLQY')H$zM1Ge+", defaultDBTable0, dBDataType0, integer0);
      Integer.toUnsignedString((-2058005160));
      defaultDBColumn0.setDefaultValue("9WLQY')H$zM1Ge+");
      String string1 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("9WLQY')H$zM1Ge+ USAGE(2) DEFAULT 9WLQY')H$zM1Ge+ NULL", string1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = SQLUtil.normalize("~9 1@j%mnc:c$|c-3JJ", false);
      assertEquals("~ 9 1 @ j % mnc : c $ | c - 3JJ", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("_49f/dr^2#(Qw|5");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal column type format: _49f/dr^2#(Qw|5
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = SQLUtil.normalize("alter index", true);
      assertEquals("alter index", string0);
      
      Boolean boolean0 = SQLUtil.mutatesStructure("alter index");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[0];
      DBCatalog dBCatalog0 = new DBCatalog("");
      DBSchema dBSchema0 = new DBSchema("", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("alter materialized view", dBSchema0);
      defaultDBTable0.countProviders();
      String[] stringArray1 = new String[1];
      stringArray1[0] = "";
      SQLUtil.renderQuery(defaultDBTable0, stringArray0, stringArray0);
      dBCatalog0.setDatabase((Database) null);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      SQLUtil.renderColumnListWithTableName("SELECT * FROM alter materialized view WHERE ", stringArray1);
      String[] stringArray2 = new String[7];
      stringArray2[0] = "alter materialized view";
      stringArray2[1] = "";
      stringArray2[2] = "SELECT * FROM alter materialized view WHERE ";
      stringArray2[3] = "select intoorg.databene.jdbacl.sqlutil";
      stringArray2[4] = "(";
      stringArray2[5] = "(";
      stringArray2[6] = "org.h2.store.PageStore";
      SQLUtil.leftJoin("SELECT * FROM alter materialized view WHERE ", stringArray0, (String) null, "delete", stringArray2);
      Object object0 = new Object();
      SQLUtil.mutatesDataOrStructure("SELECT * FROM alter materialized view WHERE ");
      DBDataType dBDataType0 = DBDataType.getInstance(0, "h` 3C#R");
      assertFalse(dBDataType0.isLOB());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = SQLUtil.isProcedureCall("exec'table'");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = TypeId.DATALINK_NAME;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("delete");
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("calldrohp indexu");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      // Undeclared exception!
      try { 
        SQLUtil.constraintSpec((DBConstraint) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("");
      DBSchema dBSchema0 = new DBSchema("", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("alter materialized view", dBSchema0);
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter sessiong join b:ol5qjm?w#jd;' as ybwu-ewera?lh on null.b:ol5qjm?w#jd;' = ybwu-ewera?lh.b:ol5qjm?w#jd;' and null.null = ybwu-ewera?lh.null and null.b:ol5qjm?w#jd;' = ybwu-ewera?lh.b:ol5qjm?w#jd;' and null.null = ybwu-ewera?lh.null and null.b:ol5qjm?w#jd;' = ybwu-ewera?lh.b:ol5qjm?w#jd;' and null.g = ybwu-ewera?lh.g");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("ROWNUM()");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema((String) null);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("A=UkxU;6Y\"&uvYn`m4P", dBSchema0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = null;
      stringArray0[1] = "_49f/dr^2#(Qw|5";
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "A=UkxU;6Y\"&uvYn`m4P", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("UNIQUE (, _49f/dr^2#(Qw|5)", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("");
      String[] stringArray0 = null;
      // Undeclared exception!
      try { 
        SQLUtil.join("", "", (String[]) null, "rOhaA+;1t~7a", "aOp68jLWq", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = PermDescriptor.USAGE_PRIV;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("delete");
      DBColumn[] dBColumnArray0 = new DBColumn[1];
      DefaultDBTable defaultDBTable1 = new DefaultDBTable("delete");
      DBDataType dBDataType0 = DBDataType.getInstance((-4580), ";");
      Integer integer0 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("delete", defaultDBTable1, dBDataType0, integer0, (Integer) null);
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      SQLUtil.renderColumnNames(dBColumnArray0);
      // Undeclared exception!
      try { 
        SQLUtil.renderWhereClause((String[]) null, dBColumnArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = PermDescriptor.USAGE_PRIV;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("delete");
      DBDataType dBDataType0 = DBDataType.getInstance((-502485013), "USAGE");
      Integer integer0 = new Integer((-502485013));
      Integer integer1 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("9WLQY')H$zM1Ge+", defaultDBTable0, dBDataType0, integer1);
      String string1 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("9WLQY')H$zM1Ge+ USAGE(2) NULL", string1);
      
      SQLUtil.parseColumnTypeAndSize("9WLQY')H$zM1Ge+ USAGE(2) NULL");
      DBColumn[] dBColumnArray0 = new DBColumn[3];
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      dBColumnArray0[1] = (DBColumn) defaultDBColumn0;
      dBColumnArray0[2] = (DBColumn) defaultDBColumn0;
      String string2 = SQLUtil.renderColumnNames(dBColumnArray0);
      assertEquals("9WLQY')H$zM1Ge+, 9WLQY')H$zM1Ge+, 9WLQY')H$zM1Ge+", string2);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = SQLUtil.normalize("_49f/dr^2#(Qw|5", false);
      assertEquals("_49f / dr ^ 2 # (Qw | 5", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      dBCatalog0.getSchema("update_ * t5");
      String string0 = SQLUtil.typeAndName(dBCatalog0);
      assertEquals("catalog null", string0);
      
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("ALTER TABLE ");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable(",RCz");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("insert5h");
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      boolean boolean0 = SQLUtil.isProcedureCall(",RCz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = SQLUtil.normalize("*/", false);
      assertEquals("*/", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = SQLUtil.normalize("nMEj }ujO`A;(q,2", false);
      assertEquals("nMEj } ujO ` A ; (q, 2", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      Character character0 = Character.valueOf(')');
      String string0 = SQLUtil.renderValue(character0);
      assertEquals("')'", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      RowOutputText rowOutputText0 = new RowOutputText("alter index", "alter index", "alter index1g9", true, "alter index");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(rowOutputText0);
      mockPrintWriter0.print(true);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "alter index1g9";
      stringArray0[1] = "alter index";
      stringArray0[2] = "alter index";
      stringArray0[3] = "alter index1g9";
      stringArray0[4] = "alter index";
      stringArray0[5] = "alter index";
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("T^O=jF", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      defaultDBTable0.addForeignKey(dBForeignKeyConstraint0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      SQLUtil sQLUtil0 = new SQLUtil();
      // Undeclared exception!
      try { 
        DBDataType.getInstance("alter index1g9");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.model.DBDataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("drop materialized view(");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("call", dBSchema0);
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("call", false, defaultDBTable0, (String[]) null, defaultDBTable0, (String[]) null);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("FOREIGN KEY () REFERENCES call()", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DataDictionaryImpl dataDictionaryImpl0 = new DataDictionaryImpl();
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema("VE'=aN)#P.[?=", dBCatalog0);
      dBSchema0.getTable("(");
      DBDataType dBDataType0 = DBDataType.getInstance(8, "(");
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("VE'=aN)#P.[?=", (DBTable) null, dBDataType0, integer0, integer0);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("VE'=aN)#P.[?= ((3,3) NULL", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String string0 = SQLUtil.normalize("OOq\"dg?({Jf", false);
      assertEquals("OOq \"dg?({Jf\"", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "delete", true, (String[]) null);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("delete");
      PrintWriter printWriter0 = mockPrintWriter0.format("delete", (Object[]) null);
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, printWriter0);
      SQLUtil sQLUtil0 = new SQLUtil();
      String string0 = TypeId.LONGINT_NAME;
      assertEquals("BIGINT", string0);
  }
}
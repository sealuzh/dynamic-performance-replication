/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:00:26 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.List;
import org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList;
import org.apache.derby.iapi.sql.dictionary.SchemaDescriptor;
import org.apache.derby.iapi.store.raw.xact.RawTransaction;
import org.databene.jdbacl.NameSpec;
import org.databene.jdbacl.SQLUtil;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBConstraint;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.lib.FileUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = SQLUtil.removeComments("update)");
      assertEquals("update)", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addOptionalCondition("org.databene.jdbacl.model.AbstractCompositeDBObject", stringBuilder0);
      assertEquals("org.databene.jdbacl.model.AbstractCompositeDBObject", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = SQLUtil.normalize("\u0001\u01EF", true);
      assertEquals("\u0001 \u01EF", string0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("\u0001 \u01EF");
      String[] stringArray0 = new String[0];
      String string1 = SQLUtil.renderQuery(defaultDBTable0, stringArray0, stringArray0);
      assertEquals("SELECT * FROM \u0001 \u01EF WHERE ", string1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      String string0 = SQLUtil.typeAndName(dBCatalog0);
      assertNotNull(string0);
      assertEquals("catalog null", string0);
      
      String string1 = SQLUtil.substituteMarkers("catalog null", "catalog null", "catalog null");
      assertEquals("'catalog null'", string1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("No server ame is *vailable.", defaultDBTable0, (-1441403123), "No server ame is *vailable.");
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("No server ame is *vailable. NO SERVER AME IS *VAILABLE. NULL", string0);
      
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, (String) null, true, stringArray0);
      String string1 = SQLUtil.constraintName(dBUniqueConstraint0);
      assertEquals("", string1);
      
      DBColumn[] dBColumnArray0 = new DBColumn[2];
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      dBColumnArray0[1] = (DBColumn) defaultDBColumn0;
      String string2 = SQLUtil.renderColumnNames(dBColumnArray0);
      assertEquals("No server ame is *vailable., No server ame is *vailable.", string2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDML("CREATE CONSTRAINT ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(":)0z9Q>B");
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) ":)0z9Q>B");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, printWriter0);
      StringBuilder stringBuilder0 = new StringBuilder("J6hQ]QG ZDn*");
      SQLUtil.addOptionalCondition(":)0z9Q>B", stringBuilder0);
      assertEquals("J6hQ]QG ZDn* or :)0z9Q>B", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("--", false, "--", "ZDEd");
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CONSTRAINT -- CHECK ZDEd", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.leftJoin(" NOT", stringArray0, " NOT", " NOT", stringArray0);
      assertEquals("left join  NOT as  NOT on ", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "CREATE CONSTRAINT ";
      stringArray0[1] = "CREATE CONSTRAINT ";
      String string0 = SQLUtil.innerJoin("create unique indexdrop materialized view", stringArray0, "CREATE CONSTRAINT ", "CREATE CONSTRAINT ", stringArray0);
      assertEquals("CREATE CONSTRAINT  as CREATE CONSTRAINT  on create unique indexdrop materialized view.CREATE CONSTRAINT  = CREATE CONSTRAINT .CREATE CONSTRAINT  and create unique indexdrop materialized view.CREATE CONSTRAINT  = CREATE CONSTRAINT .CREATE CONSTRAINT ", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SQLUtil.normalize("b. iTt^s*wEu-GH", false);
      DBColumn dBColumn0 = null;
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
  public void test11()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("yMO_U~?NFOI", defaultDBTable0, (-1441403123), "yMO_U~?NFOI");
      Integer integer0 = RawTransaction.ABORT;
      defaultDBColumn0.setSize(integer0);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("yMO_U~?NFOI YMO_U~?NFOI(1) NULL", string0);
      
      String string1 = SQLUtil.typeAndName(defaultDBColumn0);
      assertEquals("column yMO_U~?NFOI", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("yMO_U~?NFOI", defaultDBTable0, (-1441403123), "yMO_U~?NFOI");
      SQLUtil.renderColumn(defaultDBColumn0);
      defaultDBColumn0.getForeignKeyConstraint();
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      // Undeclared exception!
      try { 
        SQLUtil.renderAddForeignKey((DBForeignKeyConstraint) null, nameSpec0, (PrintWriter) null);
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
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertNotNull(string0);
      
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("table null", false, "KQT", "KQT");
      String string1 = SQLUtil.constraintName(dBCheckConstraint0);
      assertEquals("CONSTRAINT \"table null\" ", string1);
      
      String string2 = SQLUtil.ownerDotComponent(dBCheckConstraint0);
      assertTrue(string2.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = SQLUtil.normalize("{D/Q(1_>Ybbu", false);
      assertEquals("{ D / Q (1_ > Ybbu", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "alter tablem[[wt(bah&dtuw*<";
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("alter tablem[[wt(bah&dtuw*<");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal column type format: alter tablem[[wt(bah&dtuw*<
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      SQLUtil.normalize("8/&K?}Cu<", true);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = null;
      try {
        defaultDBColumn0 = new DefaultDBColumn("8/&K?}Cu<", defaultDBTable0, 823, "!-g(&f cA0)~A!/\"[\"");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"&f cA0\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "UP<Li{p>";
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("UP<Li{p>");
      DefaultDBColumn defaultDBColumn0 = null;
      try {
        defaultDBColumn0 = new DefaultDBColumn("UP<Li{p>", defaultDBTable0, (-2660), "setDate(String,Date)");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"String\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SQLUtil.isProcedureCall("No server ame is *vailable.");
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addRequiredCondition("updatedelet", stringBuilder0);
      assertEquals("updatedelet", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("Qom", true, defaultDBTable0, (String[]) null, defaultDBTable0, (String[]) null);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.fkSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("CONSTRAINT Qom FOREIGN KEY () REFERENCES null()", string0);
      
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("CONSTRAINT Qom ", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "cT&_P~o+k";
      stringArray0[1] = "cT&_P~o+k";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "cT&_P~o+k", false, stringArray0);
      defaultDBTable0.removeUniqueConstraint(dBPrimaryKeyConstraint0);
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertNotNull(string0);
      assertEquals("table null", string0);
      
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string1 = SQLUtil.ukSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("UNIQUE (cT&_P~o+k, cT&_P~o+k)", string1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = SQLUtil.normalize("')<>c%+'", true);
      assertEquals("')<>c%+'", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = SQLUtil.typeAndName((DBObject) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = SQLUtil.normalize("2yUOvMx\"", false);
      assertEquals("2yUOvMx \"\"", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint(" NULL", true, " NULL", "WMKT");
      String string0 = SQLUtil.constraintName(dBCheckConstraint0);
      assertEquals("CONSTRAINT \" NULL\" ", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertEquals("table null", string0);
      
      boolean boolean0 = SQLUtil.isDML("table null");
      assertFalse(boolean0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "table null";
      stringArray0[1] = "table null";
      stringArray0[2] = "table null";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "create unique index", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string1 = SQLUtil.pkSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY (table null, table null, table null)", string1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "id$7743[2");
      StringBuilder stringBuilder1 = stringBuilder0.append(false);
      SQLUtil.addRequiredCondition("id$7743[2", stringBuilder1);
      assertEquals("id$7743[2false and id$7743[2", stringBuilder1.toString());
      assertEquals("id$7743[2false and id$7743[2", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("create unique indexalter table");
      SQLUtil sQLUtil0 = new SQLUtil();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("M[[Wt(Bah&dTUW*<");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("derby.language.statementCacheSize");
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "M[[Wt(Bah&dTUW*<");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      NameSpec nameSpec0 = NameSpec.NEVER;
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      assertSame(mockPrintWriter0, printWriter0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      SQLUtil.parseColumnTypeAndSize("drop tableild$7743[2\r@");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("NHOp}f<G$", false, "drop tableild$7743[2\r@", "SELECT * FROM ");
      defaultDBTable0.addCheckConstraint(dBCheckConstraint0);
      dBCheckConstraint0.toString();
      NameSpec nameSpec0 = NameSpec.NEVER;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("drop tableild$7743[2\r@");
      mockPrintWriter0.println();
      mockPrintWriter0.print(0.0F);
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      System.setCurrentTimeMillis(301L);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SQLUtil.normalize("No server name is *vailable.", true);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "No server name is * vailable.";
      stringArray0[1] = "No server name is * vailable.";
      stringArray0[2] = "No server name is * vailable.";
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("No server name is *vailable.", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      SQLUtil.ownerDotComponent(dBForeignKeyConstraint0);
      defaultDBTable0.getPrimaryKeyConstraint();
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      // Undeclared exception!
      try { 
        SQLUtil.ukSpec((DBUniqueConstraint) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "COLUMN_TYPE SMALLINT";
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("COLUMN_TYPE SMALLINT");
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("{yYqQ", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      SQLUtil.isDML("COLUMN_TYPE SMALLINT");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      // Undeclared exception!
      try { 
        SQLUtil.mutatesDataOrStructure((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = SQLUtil.normalize("4-;0LF|<Xu}R6:h", false);
      assertEquals("4 - ; 0LF | < Xu } R6 : h", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertEquals("table null", string0);
      
      DBDataType dBDataType0 = DBDataType.getInstance((-1840), "01S06");
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      Integer integer1 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("create table", defaultDBTable0, dBDataType0, integer0, integer1);
      String string1 = SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      assertEquals("01S06(3,2)", string1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("insert");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      SQLUtil.parseColumnTypeAndSize("drop tableild$7743[2\r@");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      SQLUtil.normalize("M(RA#", true);
      SQLUtil.mutatesDataOrStructure("select");
      SQLUtil sQLUtil0 = new SQLUtil();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("select into");
      assertTrue(boolean0);
      assertNotNull(boolean0);
      
      String[] stringArray0 = new String[9];
      stringArray0[0] = "select into";
      stringArray0[1] = "select into";
      stringArray0[2] = "select into";
      stringArray0[3] = "select into";
      stringArray0[4] = "i8d8vFo0g;i^$+?";
      stringArray0[5] = "select into";
      stringArray0[6] = "i8d8vFo0g;i^$+?";
      stringArray0[7] = "select into";
      stringArray0[8] = "select into";
      String string0 = SQLUtil.renderColumnListWithTableName("i8d8vFo0g;i^$+?", stringArray0);
      assertEquals("i8d8vFo0g;i^$+?.select into, i8d8vFo0g;i^$+?.select into, i8d8vFo0g;i^$+?.select into, i8d8vFo0g;i^$+?.select into, i8d8vFo0g;i^$+?.i8d8vFo0g;i^$+?, i8d8vFo0g;i^$+?.select into, i8d8vFo0g;i^$+?.i8d8vFo0g;i^$+?, i8d8vFo0g;i^$+?.select into, i8d8vFo0g;i^$+?.select into", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("execute");
      assertNull(boolean0);
      
      String string0 = SQLUtil.normalize("execute", false);
      assertEquals("execute", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "CREATE CONSTRAINT ";
      stringArray0[1] = "CREATE CONSTRAINT ";
      SQLUtil.mutatesDataOrStructure("alter session`ryh|msrgc}h]d>|^>");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getUniqueConstraint(stringArray0);
      defaultDBTable0.setName("DATE");
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
  public void test39()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      NameSpec nameSpec0 = NameSpec.NEVER;
      String[] stringArray0 = new String[7];
      stringArray0[0] = "A_2a~-QyRlk,:`vr(";
      stringArray0[1] = "A_2a~-QyRlk,:`vr(";
      stringArray0[2] = "A_2a~-QyRlk,:`vr(";
      stringArray0[3] = "truncatem[[wt(bah&dtuw";
      stringArray0[4] = "A_2a~-QyRlk,:`vr(";
      stringArray0[5] = "A_2a~-QyRlk,:`vr(";
      stringArray0[6] = "A_2a~-QyRlk,:`vr(";
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "A_2a~-QyRlk,:`vr(", true, stringArray0);
      String string0 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("UNIQUE (A_2a~-QyRlk,:`vr(, A_2a~-QyRlk,:`vr(, A_2a~-QyRlk,:`vr(, truncatem[[wt(bah&dtuw, A_2a~-QyRlk,:`vr(, A_2a~-QyRlk,:`vr(, A_2a~-QyRlk,:`vr()", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("KQT", true, "KQT", "KQT");
      dBCheckConstraint0.setOwner(defaultDBTable0);
      SQLUtil.constraintName(dBCheckConstraint0);
      StringBuilder stringBuilder0 = new StringBuilder("call");
      StringBuilder stringBuilder1 = stringBuilder0.append('t');
      SQLUtil.appendConstraintName((DBConstraint) dBCheckConstraint0, stringBuilder1);
      assertEquals("calltCONSTRAINT KQT ", stringBuilder1.toString());
      assertEquals("calltCONSTRAINT KQT ", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDDL("id$774 3[2R@ ");
      assertFalse(boolean0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[8];
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertEquals("table null", string0);
      
      String string1 = SQLUtil.join((String) null, "truncateclass as single parameter was found.", stringArray0, "id$774 3[2R@ ", "truncateclass as single parameter was found.", stringArray0);
      assertEquals("id$774 3[2R@  as truncateclass as single parameter was found. on truncateclass as single parameter was found..null = truncateclass as single parameter was found..null and truncateclass as single parameter was found..null = truncateclass as single parameter was found..null and truncateclass as single parameter was found..null = truncateclass as single parameter was found..null and truncateclass as single parameter was found..null = truncateclass as single parameter was found..null and truncateclass as single parameter was found..null = truncateclass as single parameter was found..null and truncateclass as single parameter was found..null = truncateclass as single parameter was found..null and truncateclass as single parameter was found..null = truncateclass as single parameter was found..null and truncateclass as single parameter was found..null = truncateclass as single parameter was found..null", string1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(mockFileReader0);
      SQLUtil.renderNumber(streamTokenizer0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("n!");
      String[] stringArray0 = new String[4];
      stringArray0[0] = null;
      stringArray0[1] = "n!";
      stringArray0[2] = null;
      stringArray0[3] = null;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, true, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("4-;0LF|<Xu}R6:h");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "4-;0LF|<Xu}R6:h";
      stringArray0[1] = "4-;0LF|<Xu}R6:h";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "select intoclass as single parameter was found.", false, stringArray0);
      SQLUtil.constraintSpec(dBPrimaryKeyConstraint0, nameSpec0);
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnNames((DBColumn[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("NCLOB", (DBTable) null, (-3297), "NCLOB");
      DBDataType dBDataType0 = DBDataType.getInstance(1924, "NCLOB");
      DefaultDBColumn defaultDBColumn1 = new DefaultDBColumn("NCLOB", (DBTable) null, dBDataType0);
      boolean boolean0 = FileUtil.fsNormalizesPosixSeparator;
      DefaultDBColumn defaultDBColumn2 = new DefaultDBColumn("org.postgresql.core.Field", (DBTable) null, 1924, "org.postgresql.core.Field");
      Integer.sum(90099, 90099);
      Integer integer0 = RawTransaction.ABORT;
      DefaultDBColumn defaultDBColumn3 = new DefaultDBColumn("Y1^P", (DBTable) null, dBDataType0, integer0);
      DBSchema dBSchema0 = new DBSchema("!/.H\"x4");
      Integer.getInteger("v47m", 90099);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("NCLOB", dBSchema0);
      DefaultDBColumn defaultDBColumn4 = new DefaultDBColumn(" int: ", defaultDBTable0, dBDataType0, integer0);
      String string0 = SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn4);
      assertEquals("NCLOB", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = SQLUtil.normalize("AT)`-)fwQ?lO!>,(<&x", false);
      assertEquals("AT) ` -) fwQ ? lO ! >, (< & x", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("-- rollback ");
      assertNull(boolean0);
      
      String string0 = SQLUtil.normalize("-- rollback ", false);
      assertEquals("-- rollback", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "% f],a[DbdHooogPg3";
      stringArray0[2] = "Trigger";
      stringArray0[3] = "Pe~Je\"CHK%#j2o&>)";
      stringArray0[4] = "v%F~&!%DO|'J`";
      stringArray0[5] = "L+bI_VdZM,";
      stringArray0[6] = "selectm[[wt(bah&dtuw*<";
      stringArray0[7] = "/*";
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "selectm[[wt(bah&dtuw*<";
      objectArray0[1] = (Object) "L+bI_VdZM,";
      objectArray0[2] = (Object) "v%F~&!%DO|'J`";
      objectArray0[3] = (Object) "v%F~&!%DO|'J`";
      objectArray0[4] = (Object) "% f],a[DbdHooogPg3";
      objectArray0[5] = (Object) "Pe~Je\"CHK%#j2o&>)";
      objectArray0[6] = (Object) "selectm[[wt(bah&dtuw*<";
      SQLUtil.renderWhereClause(stringArray0, objectArray0);
      // Undeclared exception!
      SQLUtil.mutatesStructure("/*");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(mockFileReader0);
      streamTokenizer0.sval = null;
      streamTokenizer0.nval = (-2026.802696178203);
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("- 2026.802696178203", string0);
  }
}
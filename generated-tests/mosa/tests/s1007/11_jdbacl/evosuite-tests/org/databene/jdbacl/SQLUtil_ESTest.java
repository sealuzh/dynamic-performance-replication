/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:10:46 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PipedReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.Locale;
import org.apache.derby.iapi.sql.dictionary.SchemaDescriptor;
import org.apache.derby.iapi.store.raw.Page;
import org.apache.derby.iapi.store.raw.xact.RawTransaction;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.NameSpec;
import org.databene.jdbacl.SQLUtil;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBConstraint;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBNonUniqueIndex;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DBUniqueIndex;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.DefaultDatabase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("{;`<T31C5&,`\"t");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("?{jP4PZsp)L-F0~W*", defaultDBTable0, 290, "?{jP4PZsp)L-F0~W*");
      SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("?{JP4PZSP)L-F0~W*");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = SQLUtil.normalize("P-~i[uH65]j`[;B", true);
      assertEquals("P - ~ i [ uH65 ] j ` [ ; B", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = SQLUtil.normalize("execute)", true);
      assertEquals("execute)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("P&4OGD~},Xc07OHW2");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SQLUtil.removeComments("NESTEDLOOP");
      String string0 = SQLUtil.substituteMarkers("NESTEDLOOP", "NESTEDLOOP", "NESTEDLOOP");
      assertEquals("'NESTEDLOOP'", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("null = null AND null = null", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SQLUtil.renderWhereClause(stringArray0, stringArray0);
      String string0 = SQLUtil.renderColumnListWithTableName("truncate;?sdy r7;csq~^k", stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "}q5]qKFceKr']";
      stringArray0[1] = "}q5]qKFceKr']";
      String string0 = SQLUtil.renderColumnListWithTableName("}q5]qKFceKr']", stringArray0);
      assertEquals("}q5]qKFceKr'].}q5]qKFceKr'], }q5]qKFceKr'].}q5]qKFceKr']", string0);
      
      boolean boolean0 = SQLUtil.isProcedureCall("kg^,_1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SQLUtil sQLUtil0 = new SQLUtil();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "h{2Pn>)ajg!=O$b0K1i";
      stringArray0[1] = "h{2Pn>)ajg!=O$b0K1i";
      String string0 = SQLUtil.leftJoin("h{2Pn>)ajg!=O$b0K1i", stringArray0, "h{2Pn>)ajg!=O$b0K1i", "h{2Pn>)ajg!=O$b0K1i", stringArray0);
      assertEquals("left join h{2Pn>)ajg!=O$b0K1i as h{2Pn>)ajg!=O$b0K1i on h{2Pn>)ajg!=O$b0K1i.h{2Pn>)ajg!=O$b0K1i = h{2Pn>)ajg!=O$b0K1i.h{2Pn>)ajg!=O$b0K1i and h{2Pn>)ajg!=O$b0K1i.h{2Pn>)ajg!=O$b0K1i = h{2Pn>)ajg!=O$b0K1i.h{2Pn>)ajg!=O$b0K1i", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "_(,*p;y";
      stringArray0[1] = " join ";
      String string0 = SQLUtil.innerJoin(" join ", stringArray0, "_(,*p;y", " join ", stringArray0);
      assertEquals("_(,*p;y as  join  on  join ._(,*p;y =  join ._(,*p;y and  join . join  =  join . join ", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Character character0 = new Character('I');
      String string0 = SQLUtil.renderValue(character0);
      assertEquals("'I'", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SQLUtil.isProcedureCall("create unique index");
      SQLUtil.renderColumnNames((String[]) null);
      SQLUtil.removeComments("create unique index");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      assertEquals("table", defaultDBTable0.getObjectType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SQLUtil.removeComments("!9MZ:`tLoC^|%Qw");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SQLUtil.ownerDotComponent(defaultDBTable0);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VersionNumber versionNumber0 = VersionNumber.valueOf("\u0001\u0097");
      DefaultDatabase defaultDatabase0 = new DefaultDatabase("\u0001\u0097", "\u0001\u0097", versionNumber0);
      String string0 = SQLUtil.typeAndName(defaultDatabase0);
      assertEquals("database \u0001\u0097", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[4] = stringArray0[0];
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable(stringArray0[4]);
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint(stringArray0[4], true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.fkSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("FOREIGN KEY (, , , , , , ) REFERENCES null(, , , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = SQLUtil.normalize("NESTEDLOOP", false);
      assertEquals("NESTEDLOOP", string0);
      
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("NESTEDLOOP", true, "NESTEDLOOP", "NESTEDLOOP");
      NameSpec nameSpec0 = NameSpec.NEVER;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBCheckConstraint0, nameSpec0);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertNotNull(string0);
      assertEquals("table null", string0);
      
      Integer integer0 = RawTransaction.COMMIT;
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "into", false, stringArray0);
      String string1 = dBUniqueConstraint0.toString();
      assertEquals("CONSTRAINT into UNIQUE ()", string1);
      
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string2 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("UNIQUE ()", string2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SQLUtil.removeComments(")");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      Integer integer0 = RawTransaction.COMMIT;
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, ")", true, stringArray0);
      String string0 = dBUniqueConstraint0.toString();
      assertEquals("CONSTRAINT ) UNIQUE ()", string0);
      
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string1 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("CONSTRAINT ) UNIQUE ()", string1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("!;`<T31C5&,m\"t");
      String[] stringArray0 = new String[0];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "'", false, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("!;`<T31C5&,m\"t", false, dBPrimaryKeyConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("!;`<T31C5&,m\"t", false, defaultDBTable0, stringArray0, dBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("FOREIGN KEY () REFERENCES !;`<T31C5&,m\"t()", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      SQLUtil.typeAndName(defaultDBTable0);
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "table null", true, stringArray0);
      dBUniqueConstraint0.toString();
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter index");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      SQLUtil.typeAndName(defaultDBTable0);
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("table null", defaultDBTable0, (-4877), "table null");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byteArrayOutputStream0.close();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      Locale locale0 = Locale.ROOT;
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      assertEquals(48, byteArrayOutputStream0.size());
      
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      DBColumn dBColumn0 = defaultDBTable0.getColumn("table null");
      SQLUtil.renderColumn(dBColumn0);
      String string0 = SQLUtil.ownerDotComponent(defaultDBColumn0);
      assertEquals("null.table null", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("9810800c-0121-c5e1-a2f5-00000043e718", defaultDBTable0, (DBDataType) null, (Integer) null);
      StringBuilder stringBuilder0 = new StringBuilder(741);
      StringBuilder stringBuilder1 = stringBuilder0.append("executehvj7/e_");
      StringBuilder stringBuilder2 = stringBuilder1.append('\"');
      StringBuilder stringBuilder3 = SQLUtil.addRequiredCondition("9810800c-0121-c5e1-a2f5-00000043e718", stringBuilder2);
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0, stringBuilder3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      SQLUtil.typeAndName(defaultDBTable0);
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("execute");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("!/%JY5QOs-_}'%GgB");
      SQLUtil.normalize("!/%JY5QOs-_}'%GgB", false);
      StringBuilder stringBuilder0 = new StringBuilder(23);
      String[] stringArray0 = new String[2];
      stringArray0[1] = "! / % JY5QOs - _ } '%GgB'";
      stringArray0[1] = "!/%JY5QOs-_}'%GgB";
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "!/%JY5QOs-_}'%GgB", false, stringArray0);
      dBUniqueConstraint0.toString();
      SQLUtil.addRequiredCondition("!/%JY5QOs-_}'%GgB", stringBuilder0);
      assertEquals("!/%JY5QOs-_}'%GgB", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("!;`<T31C5&,m\"t");
      String string0 = SQLUtil.normalize("!;`<T31C5&,m\"t", true);
      assertEquals("! ; ` < T31C5 &, m \"t\"", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      String string0 = Page.DIAG_MINIMUM_REC_SIZE;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "minRecSize";
      String string1 = SQLUtil.join((String) null, (String) null, stringArray0, "minRecSize", "minRecSize", stringArray0);
      assertEquals("minRecSize as minRecSize on null.minRecSize = minRecSize.minRecSize", string1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SQLUtil.isQuery("k&A}?yJe");
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("deletederbyRproperties");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("truncate)");
      SQLUtil.addOptionalCondition("truncate)", stringBuilder0);
      assertEquals("truncate) or truncate)", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = SQLUtil.typeAndName((DBObject) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SQLUtil.normalize("!/%JY5QOs-_}'%GgB", false);
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("m~,\"#R:^/(GY1&");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal column type format: m~,\"#R:^/(GY1&
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SQLUtil.removeComments(")");
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      SQLUtil.normalize("org.apache.derby.iapi.services.stream.InfoStreams", true);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("org.apache.derby.iapi.services.stream.InfoStreams");
      Boolean boolean0 = new Boolean("org.apache.derby.iapi.services.stream.InfoStreams");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SchemaDescriptor.SYSCS_DIAG_SCHEMA_UUID;
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, ".=|B'H'S", false, (String[]) null);
      String string1 = dBUniqueConstraint0.toString();
      assertEquals("CONSTRAINT .=|B'H'S UNIQUE ()", string1);
      
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("c%");
      assertNull(boolean0);
      
      String string2 = SQLUtil.constraintName(dBUniqueConstraint0);
      assertEquals("CONSTRAINT .=|B'H'S ", string2);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      SQLUtil.typeAndName(defaultDBTable0);
      String string0 = "into";
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "into", false, stringArray0);
      dBUniqueConstraint0.setDoc("table null");
      dBUniqueConstraint0.toString();
      DBColumn[] dBColumnArray0 = new DBColumn[2];
      int int0 = 460;
      DefaultDBColumn defaultDBColumn0 = null;
      try {
        defaultDBColumn0 = new DefaultDBColumn("into", defaultDBTable0, 460, "CONSTRAINT into UNIQUE ()");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertEquals("table null", string0);
      
      Integer integer0 = RawTransaction.COMMIT;
      defaultDBTable0.countProviders();
      DBDataType dBDataType0 = DBDataType.getInstance(0, "table null");
      Integer integer1 = RawTransaction.COMMIT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("table null", defaultDBTable0, dBDataType0, integer0, integer1);
      String string1 = SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      assertEquals("TABLE NULL(0,0)", string1);
      
      DefaultDBTable defaultDBTable1 = new DefaultDBTable();
      boolean boolean0 = SQLUtil.isQuery("table null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = SQLUtil.normalize("[=*O =7RalSq", false);
      assertEquals("[ = * O = 7RalSq", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertEquals("table null", string0);
      
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("table null", true, "call)", "into");
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string1 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CHECK into", string1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "select";
      stringArray0[1] = "select";
      stringArray0[2] = "select";
      stringArray0[3] = "select";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "select", false, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("select", false, dBPrimaryKeyConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("select", dBTable0, 827, "select");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byteArrayOutputStream0.close();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      Locale locale0 = Locale.ROOT;
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.renderCreateTable(dBTable0, false, nameSpec0, mockPrintWriter0);
      String string0 = SQLUtil.normalize("sBOpGGj.vBp$Hm", true);
      assertEquals("sBOpGGj.vBp $ Hm", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SQLUtil.removeComments("0");
      DBColumn[] dBColumnArray0 = new DBColumn[2];
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("0", (DBTable) null, 7, "0");
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      DefaultDBColumn defaultDBColumn1 = new DefaultDBColumn("0", (DBTable) null, 7, "0");
      dBColumnArray0[1] = (DBColumn) defaultDBColumn1;
      String string0 = SQLUtil.renderColumnNames(dBColumnArray0);
      assertEquals("0, 0", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SQLUtil.removeComments("!9MZ:`tLoC^|%Qw");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!9MZ:`tLoC^|%Qw";
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("!9MZ:`tLoC^|%Qw", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("!w87");
      PrintWriter printWriter0 = mockPrintWriter0.append('b');
      SQLUtil.renderAddForeignKey(dBForeignKeyConstraint0, nameSpec0, printWriter0);
      assertNull(dBForeignKeyConstraint0.getDoc());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SQLUtil.removeComments(")");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      stringArray0[1] = "--";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, ")", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY (, --)", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      SQLUtil.typeAndName(defaultDBTable0);
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("table null", defaultDBTable0, 1343, "select");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      Locale locale0 = Locale.ROOT;
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      assertEquals(44, byteArrayOutputStream0.size());
      
      String string0 = SQLUtil.normalize("select", true);
      assertEquals("select", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      // Undeclared exception!
      SQLUtil.isQuery("/*");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBCatalog dBCatalog0 = new DBCatalog("#;~oH)paQ<{d6");
      DBSchema dBSchema0 = new DBSchema("#;~oH)paQ<{d6");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("", defaultDBTable0, (-4884), "#");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "", false, (String[]) null);
      dBPrimaryKeyConstraint0.toString();
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex(":a&5Z6<I@Sw ?O%5", false, dBPrimaryKeyConstraint0);
      dBUniqueIndex0.getTable();
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "#");
      StringBuilder stringBuilder1 = SQLUtil.addRequiredCondition((String) null, stringBuilder0);
      SQLUtil.addOptionalCondition("*", stringBuilder1);
      assertEquals("# and null or *", stringBuilder1.toString());
      
      SQLUtil.isQuery("alter session#;~oh)paq<{d6");
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter session#;~oh)paq<{d6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      mockFileInputStream0.read((byte[]) null, (-2470), (-2470));
      mockFileInputStream0.getFD();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(mockFileReader0);
      SQLUtil.renderNumber(streamTokenizer0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      SQLUtil.mutatesDataOrStructure("- 0");
      SQLUtil.typeAndName(defaultDBTable0);
      defaultDBTable0.getPrimaryKeyConstraint();
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = SQLUtil.addOptionalCondition("\u0001\u0121", stringBuilder0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      // Undeclared exception!
      try { 
        SQLUtil.appendConstraintName((DBConstraint) null, stringBuilder1, nameSpec0);
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
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("Unknown constraint type: ", false, defaultDBTable0, (String[]) null);
      defaultDBTable0.removeIndex(dBNonUniqueIndex0);
      String[] stringArray0 = new String[5];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "select");
      stringArray0[0] = "select";
      stringArray0[1] = "select";
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[2] = "updatej'j6d:m1w(7+z`m{mf";
      stringArray0[3] = "select";
      stringArray0[4] = "select";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "select", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      SQLUtil.ukSpec(dBPrimaryKeyConstraint0, nameSpec0);
      System.setCurrentTimeMillis((-1L));
      DBColumn[] dBColumnArray0 = new DBColumn[9];
      dBPrimaryKeyConstraint0.setOwner(defaultDBTable0);
      DefaultDBColumn defaultDBColumn0 = null;
      try {
        defaultDBColumn0 = new DefaultDBColumn((String) null, defaultDBTable0, (-2), "UNIQUE (select, select, updatej'j6d:m1w(7+z`m{mf, select, select)");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"select\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("!;`<T31C5&,m\"t");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("?{jP4PZsp)L-F0~W*", defaultDBTable0, 290, "?{jP4PZsp)L-F0~W*");
      SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      SQLUtil.normalize("*/", true);
      Object[] objectArray0 = SQLUtil.parseColumnTypeAndSize("?{jP4PZsp)L-F0~W*");
      assertNotNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("!/%JY5QOs-_}'%GgB");
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("select- 0");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      String[] stringArray0 = new String[6];
      stringArray0[0] = "select- 0";
      stringArray0[1] = "!/%JY5QOs-_}'%GgB";
      stringArray0[2] = "!/%JY5QOs-_}'%GgB";
      stringArray0[3] = "select- 0";
      stringArray0[4] = "|:j|D_bZday";
      stringArray0[5] = "select- 0";
      DBDataType dBDataType0 = DBDataType.getInstance(1799, "|:j|D_bZday");
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("select- 0", defaultDBTable0, dBDataType0, integer0);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("select- 0 |:J|D_BZDAY(3) NULL", string0);
      
      String string1 = SQLUtil.renderQuery(defaultDBTable0, stringArray0, stringArray0);
      assertEquals("SELECT * FROM !/%JY5QOs-_}'%GgB WHERE select- 0 = 'select- 0' AND !/%JY5QOs-_}'%GgB = '!/%JY5QOs-_}'%GgB' AND !/%JY5QOs-_}'%GgB = '!/%JY5QOs-_}'%GgB' AND select- 0 = 'select- 0' AND |:j|D_bZday = '|:j|D_bZday' AND select- 0 = 'select- 0'", string1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertEquals("table null", string0);
      
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "into", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string1 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("UNIQUE ()", string1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Integer integer0 = RawTransaction.COMMIT;
      Integer integer1 = RawTransaction.LOCK_ESCALATE;
      SQLUtil.normalize("Y(AmU/\"", false);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("insert#;~oh)paq<{d6");
      Integer integer2 = RawTransaction.COMMIT;
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      MockFile mockFile0 = new MockFile(" ><x(i#ZZdM8-E)hJE");
      File file0 = mockFile0.getAbsoluteFile();
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "select null as PKTABLE_CAT  ,null as PKTABLE_SCHEM  ,PK.RDB$RELATION_NAME as PKTABLE_NAME  ,ISP.RDB$FIELD_NAME as PKCOLUMN_NAME  ,null as FKTABLE_CAT  ,null as FKTABLE_SCHEM  ,FK.RDB$RELATION_NAME as FKTABLE_NAME  ,ISF.RDB$FIELD_NAME as FKCOLUMN_NAME  ,CAST ((ISP.RDB$FIELD_POSITION + 1) as SMALLINT) as KEY_SEQ  ,RC.RDB$UPDATE_RULE as UPDATE_RULE  ,RC.RDB$DELETE_RULE as DELETE_RULE  ,PK.RDB$CONSTRAINT_NAME as PK_NAME  ,FK.RDB$CONSTRAINT_NAME as FK_NAME  ,null as DEFERRABILITY  from  RDB$RELATION_CONSTRAINTS PK  ,RDB$RELATION_CONSTRAINTS FK  ,RDB$REF_CONSTRAINTS RC  ,RDB$INDEX_SEGMENTS ISP  ,RDB$INDEX_SEGMENTS ISF  WHERE ", true, (String[]) null);
      defaultDBTable0.removeUniqueConstraint(dBUniqueConstraint0);
      mockFile0.createNewFile();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      assertEquals("insert#;~oh)paq<{d6", defaultDBTable0.getName());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, stringArray0[0], true, stringArray0);
      defaultDBTable0.getUniqueConstraint(stringArray0);
      DefaultDBTable defaultDBTable1 = new DefaultDBTable();
      defaultDBTable1.getPrimaryKeyConstraint();
      String string0 = SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("", defaultDBTable0, (-4884), "#");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Locale locale0 = Locale.JAPANESE;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      Object[] objectArray0 = new Object[0];
      PrintWriter printWriter0 = mockPrintWriter0.printf(locale0, "#", objectArray0);
      mockPrintWriter0.print(false);
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("My>/FfDGJ-7;d`2", false, defaultDBTable0, "call");
      Locale locale1 = Locale.JAPANESE;
      PrintWriter printWriter1 = printWriter0.printf(locale1, "V.u", objectArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, printWriter1);
      DefaultDBTable defaultDBTable1 = new DefaultDBTable();
      assertNull(defaultDBTable1.getDoc());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      mockFileInputStream0.getFD();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(mockFileReader0);
      SQLUtil.renderNumber(streamTokenizer0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance("DATE");
      Integer integer0 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("create materialized viewo9*'zpa&efime", defaultDBTable0, dBDataType0, (Integer) (-4), integer0);
      SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      DefaultDBTable defaultDBTable1 = new DefaultDBTable();
      assertNull(defaultDBTable1.getDoc());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SchemaDescriptor.STD_DECLARED_GLOBAL_TEMPORARY_TABLES_SCHEMA_NAME;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "SESSION";
      stringArray0[1] = "ekv]OAw5qT";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "SESSION", false, stringArray0);
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
  public void test55()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(mockFileReader0);
      SQLUtil.renderNumber(streamTokenizer0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      streamTokenizer0.nval = (-3521.1833074);
      SQLUtil.mutatesDataOrStructure("- 0");
      SQLUtil.normalize("- 0", false);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = null;
      stringArray0[2] = "- 0";
      stringArray0[3] = "- 0";
      stringArray0[4] = "- 0";
      stringArray0[5] = "- 0";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, true, stringArray0);
      SQLUtil.appendConstraintName((DBConstraint) dBPrimaryKeyConstraint0, (StringBuilder) null);
      SQLUtil.renderNumber(streamTokenizer0);
      defaultDBTable0.getUniqueConstraint("update");
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
}
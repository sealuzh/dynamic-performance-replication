/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:00:19 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
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
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DBUniqueIndex;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.jdbc.jdbcClob;
import org.hsqldb.lib.FileUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[7] = "lo_truncate";
      String[] stringArray1 = new String[4];
      // Undeclared exception!
      try { 
        SQLUtil.leftJoin("lo_truncate", stringArray0, "lo_truncate", "drop index", stringArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDML("delete{^n3`#t<n5xj^jbje*}");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = SQLUtil.renderValue((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      String string0 = SQLUtil.renderValue(object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderQuery(defaultDBTable0, stringArray0, stringArray0);
      assertEquals("SELECT * FROM null WHERE ", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[7];
      String string0 = SQLUtil.renderColumnNames(stringArray0);
      assertEquals("(, , , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderColumnListWithTableName("X{/a`p#!$rs", stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance((-1982), "alter tableorg.apache.derby.iapi.services.info.jvminfo");
      Integer integer0 = RawTransaction.COMMIT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("index select into5]:puqve`w", defaultDBTable0, dBDataType0, integer0);
      defaultDBColumn0.setNullable(false);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("index select into5]:puqve`w ALTER TABLEORG.APACHE.DERBY.IAPI.SERVICES.INFO.JVMINFO(0) NOT NULL", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("alter mater");
      String[] stringArray0 = new String[6];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "alter table", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.pkSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY (, , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.leftJoin("select into5]:puqve`w", stringArray0, "create table ", ">:^H@FHPK", stringArray0);
      assertEquals("left join create table  as >:^H@FHPK on ", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[9];
      String string0 = SQLUtil.innerJoin("", stringArray0, "", "drop table", stringArray0);
      assertEquals(" as drop table on .null = drop table.null and .null = drop table.null and .null = drop table.null and .null = drop table.null and .null = drop table.null and .null = drop table.null and .null = drop table.null and .null = drop table.null and .null = drop table.null", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("rename", false, "rename", "update");
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CONSTRAINT rename CHECK update", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        SQLUtil.renderWhereClause((String[]) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[3];
      Object[] objectArray0 = SQLUtil.parseColumnTypeAndSize("*yvGOXXv\",E>{");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("^TQlc", (DBSchema) null);
      // Undeclared exception!
      try { 
        SQLUtil.renderQuery(defaultDBTable0, stringArray0, objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn((String) null, (DBTable) null, (DBDataType) null);
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      LinkedList<DBColumn> linkedList0 = new LinkedList<DBColumn>();
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnNames((List<DBColumn>) linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("<;)u_^hWWSAV43H7c,_");
      // Undeclared exception!
      try { 
        SQLUtil.renderAddForeignKey((DBForeignKeyConstraint) null, nameSpec0, mockPrintWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      // Undeclared exception!
      try { 
        SQLUtil.pkSpec((DBPrimaryKeyConstraint) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.ownerDotComponent((DBObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.innerJoin("drop tabledrop table", (String[]) null, " NOT", (String) null, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.NEVER;
      // Undeclared exception!
      try { 
        SQLUtil.createConstraintSpecBuilder((DBConstraint) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.NEVER;
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
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.constraintName((DBConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "T0&-", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      // Undeclared exception!
      try { 
        SQLUtil.appendConstraintName((DBConstraint) dBUniqueConstraint0, (StringBuilder) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = null;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "create materialized view", true, (String[]) null);
      dBPrimaryKeyConstraint0.setName("!DF`nhCM8)S");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.appendConstraintName((DBConstraint) dBPrimaryKeyConstraint0, stringBuilder0, nameSpec0);
      NameSpec nameSpec1 = NameSpec.NEVER;
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SQLUtil.renderColumnNames((String[]) null);
      SQLUtil.isProcedureCall(".10.1");
      boolean boolean0 = false;
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SQLUtil.mutatesStructure("--");
      SQLUtil.isDDL("F.T{<uAl&@e");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure("drop table");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("? WgA72(2nD>@W4Ik");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("? WgA72(2nD>@W4Ik", dBSchema0);
      String[] stringArray0 = new String[4];
      stringArray0[3] = "l,Jt%C+[H;W|.=F";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "l,Jt%C+[H;W|.=F", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      SQLUtil.pkSpec(dBPrimaryKeyConstraint0, nameSpec0);
      Object object0 = null;
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = SQLUtil.isQuery("x`-ROha3C#+");
      assertFalse(boolean0);
      
      String[] stringArray0 = new String[3];
      stringArray0[2] = "selectalter";
      String string0 = SQLUtil.renderColumnListWithTableName(":z>", stringArray0);
      assertEquals(":z>.null, :z>.null, :z>.selectalter", string0);
      
      StringBuilder stringBuilder0 = new StringBuilder(string0);
      assertEquals(":z>.null, :z>.null, :z>.selectalter", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      jdbcClob jdbcClob0 = new jdbcClob("4o`&1nsgY");
      Reader reader0 = jdbcClob0.getCharacterStream();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(reader0);
      SQLUtil.renderNumber(streamTokenizer0);
      File file0 = null;
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SQLUtil.normalize("*/", true);
      SQLUtil sQLUtil0 = new SQLUtil();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SQLUtil.normalize("---- tra", false);
      String string0 = "update--- transaction log ---{----[-";
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SQLUtil.normalize("w$,pw&`-g/%dYZC", true);
      String string0 = ">zw)PYC:`nC#";
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = "V(g*M=sYNQlu";
      String string1 = SQLUtil.normalize("V(g*M=sYNQlu", false);
      try { 
        Integer.decode(string1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"V (g * M = sYNQlu\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SQLUtil.parseColumnTypeAndSize("*yvGOXXv\",E>{");
      SQLUtil.normalize(":z>.':z>.x`-ROha3C#+, :z>.*yvGOXXv\",E>{, :z>.selectalter', :z>.*yvGOXXv\",E>{, :z>.selectalter", true);
      int int0 = 710;
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SQLUtil.normalize("execgn;8u@ko)cys8", true);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      assertEquals("table", defaultDBTable0.getObjectType());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = SQLUtil.normalize("!Fx\"TOLA7K:_lG!g", true);
      assertEquals("! Fx \"TOLA7K:_lG!g\"", string0);
      
      String[] stringArray0 = new String[8];
      String string1 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("null = null AND null = null AND null = null AND null = null AND null = null AND null = null AND null = null AND null = null", string1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, (String) null, false, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex((String) null, true, dBUniqueConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, true, dBTable0, stringArray0, defaultDBTable0, stringArray0);
      String string0 = SQLUtil.typeAndName(dBForeignKeyConstraint0);
      assertNotNull(string0);
      assertEquals("foreign key constraint constraint", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = SQLUtil.typeAndName((DBObject) null);
      // Undeclared exception!
      try { 
        SQLUtil.mutatesStructure(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = null;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "create materialized view", true, (String[]) null);
      dBPrimaryKeyConstraint0.setName("!DF`nhCM8)S");
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("!+?KL9]IQEU>:m0_j", true, dBPrimaryKeyConstraint0);
      dBUniqueIndex0.setOwner(defaultDBTable0);
      SQLUtil.typeAndName(dBUniqueIndex0);
      NameSpec nameSpec0 = NameSpec.NEVER;
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("q)7Fh5P493K>WwA[");
      String[] stringArray0 = new String[9];
      stringArray0[8] = "PARAMETERS=[";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "PARAMETERS=[", true, stringArray0);
      String string0 = SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      assertEquals("CONSTRAINT PARAMETERS=[ ", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("drop materialized view");
      String[] stringArray0 = new String[6];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, (String) null, false, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("drop materialized view", false, dBUniqueConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(dBTable0, (String) null, false, stringArray0);
      dBPrimaryKeyConstraint0.setTable(defaultDBTable0);
      SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("#dZZj$XBUB_YfgF=@");
      String[] stringArray0 = new String[7];
      stringArray0[6] = "#dZZj$XBUB_YfgF=@";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "#dZZj$XBUB_YfgF=@", false, stringArray0);
      SQLUtil.leftJoin("Qq,(S.IN(2i=2L:Gb-", stringArray0, (String) null, "drop indexorg.apache.derby.iapi.services.io.formatidoutputstream", stringArray0);
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
  public void test46()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint((String) null, true, ">R!!yEtM'O2H2!'", "left");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBCheckConstraint0, nameSpec0);
      StringBuilder stringBuilder1 = stringBuilder0.append("alter session");
      SQLUtil.appendConstraintName((DBConstraint) dBCheckConstraint0, stringBuilder1);
      assertEquals("alter session", stringBuilder1.toString());
      assertEquals("alter session", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("drop materialized view");
      String[] stringArray0 = new String[6];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, (String) null, false, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.ukSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("UNIQUE (, , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("10.1", defaultDBTable0, 4, "");
      SQLUtil.ownerDotComponent(defaultDBColumn0);
      boolean boolean0 = false;
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("'B4");
      SQLUtil.ownerDotComponent(tableContainer0);
      String string0 = "org.apache.derby.impl.sql.compile.RowOrderingImpl";
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addOptionalCondition("Error converting to string.", stringBuilder0);
      stringBuilder0.append((CharSequence) stringBuilder0);
      assertEquals("Error converting to string.Error converting to string.", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      stringBuilder0.append("4251");
      SQLUtil.addRequiredCondition("inner", stringBuilder0);
      assertEquals("4251 and inner", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = "9rT(\\F{y$";
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addRequiredCondition("9rT(F{y$", stringBuilder0);
      assertEquals("9rT(F{y$", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      String[] stringArray0 = new String[1];
      String string0 = SQLUtil.join((String) null, "6KXu!T", stringArray0, "6KXu!T", (String) null, stringArray0);
      assertEquals("6KXu!T as null on 6KXu!T.null = null.null", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SQLUtil.renderColumnNames(stringArray0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("<unknown>");
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "X{/a`p#!$rs", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("UNIQUE ()", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = null;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "create materialized view", true, (String[]) null);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      SQLUtil.constraintSpec(dBPrimaryKeyConstraint0, nameSpec0);
      NameSpec nameSpec1 = NameSpec.NEVER;
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema("h2.pageStoreInternalCount", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("9Q -r3We>cn4Zml=", dBSchema0);
      String[] stringArray0 = new String[9];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("9Q -r3We>cn4Zml=", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("FOREIGN KEY (, , , , , , , , ) REFERENCES 9Q -r3We>cn4Zml=(, , , , , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = "/*";
      // Undeclared exception!
      SQLUtil.isDDL("/*");
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = "select into";
      SQLUtil.isQuery("select into");
      String string1 = "!!o~6oJW7-";
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure("calls2u");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("delete");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SQLUtil.removeComments("select into5]:puqve`w");
      SQLUtil.mutatesDataOrStructure("select into5]:puqve`w");
      Random.setNextRandom((-1982));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("T0&-");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = "alter session*`y";
      SQLUtil.mutatesDataOrStructure("alter session*`y");
      String string1 = "x";
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = SQLUtil.removeComments(" NOT");
      SQLUtil.mutatesDataOrStructure("create table");
      VersionNumber versionNumber0 = VersionNumber.valueOf(string0);
      assertNotNull(versionNumber0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Character character0 = Character.valueOf('a');
      SQLUtil.renderValue(character0);
      String string0 = "Pl";
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String[] stringArray0 = new String[3];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("^TQlc", (DBSchema) null);
      String string0 = SQLUtil.renderQuery(defaultDBTable0, stringArray0, stringArray0);
      assertEquals("SELECT * FROM ^TQlc WHERE null = null AND null = null AND null = null", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DBDataType dBDataType0 = DBDataType.getInstance(8, "create unique index");
      Integer integer0 = RawTransaction.ABORT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("yg[PbwYHA-k", (DBTable) null, dBDataType0, integer0, integer0);
      SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      String string0 = "([vgdozg@64jpNx\\u";
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DBDataType dBDataType0 = DBDataType.getInstance("CLOB");
      Integer integer0 = RawTransaction.COMMIT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("alter materialized view", (DBTable) null, dBDataType0, integer0, integer0);
      SQLUtil.renderColumn(defaultDBColumn0);
      StringBuilder stringBuilder0 = new StringBuilder();
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("ks*L1;", (DBTable) null, 66552, "select intoorg.apache.derby.iapi.services.io.formatidoutputstream");
      defaultDBColumn0.setDefaultValue("org.apac");
      defaultDBColumn0.setVersionColumn(true);
      SQLUtil.renderColumn(defaultDBColumn0);
      String string0 = "org.apac";
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Vector<DBColumn> vector0 = new Vector<DBColumn>();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance(109, "42X31");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("create materialized viewge7e!?yb", defaultDBTable0, dBDataType0, (Integer) null);
      vector0.add((DBColumn) defaultDBColumn0);
      DBDataType.getInstance((-1), "42X31");
      vector0.add((DBColumn) defaultDBColumn0);
      String string0 = SQLUtil.renderColumnNames((List<DBColumn>) vector0);
      assertEquals("create materialized viewge7e!?yb, create materialized viewge7e!?yb", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DBColumn[] dBColumnArray0 = new DBColumn[5];
      DBDataType dBDataType0 = DBDataType.getInstance(13, "qbP]w<5[fp;|");
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("qbP]w<5[fp;|", (DBTable) null, dBDataType0, integer0, integer0);
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("-vGT\"A:!S[Ru*iG");
      DefaultDBColumn defaultDBColumn1 = new DefaultDBColumn("qbP]w<5[fp;|", defaultDBTable0, dBDataType0, (Integer) null);
      dBColumnArray0[1] = (DBColumn) defaultDBColumn1;
      DefaultDBColumn defaultDBColumn2 = new DefaultDBColumn("drop index{^n3`#t<n5xj^jbje*}", (DBTable) null, (-525330760), "-vGT\"A:!S[Ru*iG");
      dBColumnArray0[2] = (DBColumn) defaultDBColumn2;
      dBColumnArray0[3] = (DBColumn) defaultDBColumn1;
      dBColumnArray0[4] = (DBColumn) defaultDBColumn0;
      String string0 = SQLUtil.renderColumnNames(dBColumnArray0);
      assertEquals("qbP]w<5[fp;|, qbP]w<5[fp;|, drop index{^n3`#t<n5xj^jbje*}, qbP]w<5[fp;|, qbP]w<5[fp;|", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("create materialized view");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      MockPrintStream mockPrintStream0 = new MockPrintStream("create materialized view");
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockPrintStream0, charsetEncoder0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(outputStreamWriter0);
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      DBDataType dBDataType0 = DBDataType.getInstance((-436976093), "create unique index\"xn\"|l5wun]l");
      assertEquals("CREATE UNIQUE INDEX\"XN\"|L5WUN]L", dBDataType0.toString());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      SQLUtil.substituteMarkers("T0&-", "T0&-", "T0&-");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "T0&-", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      MockFile mockFile0 = new MockFile("T0&-");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      BufferedWriter bufferedWriter0 = new BufferedWriter(mockPrintWriter0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(bufferedWriter0, false);
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter1);
      // Undeclared exception!
      try { 
        defaultDBTable0.getForeignKeyConstraint(stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Table 'null' has no foreign key with the columns ()
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      SQLUtil.substituteMarkers("T0&-", "T0&-", "T0&-");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance(3919, "T0&-");
      Integer integer0 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("T0&-", defaultDBTable0, dBDataType0, integer0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      MockFile mockFile0 = new MockFile("T0&-");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      assertNull(defaultDBTable0.getName());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("()");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      String string0 = "$d{`]9:(^u";
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("$d{`]9:(^u");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal column type format: $d{`]9:(^u
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("setClob(String, Clob)");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"String\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      SQLUtil.mutatesStructure("--");
      String[] stringArray0 = new String[1];
      DBSchema dBSchema0 = new DBSchema("s*@UN' T*5");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("--", dBSchema0);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "- 0", false, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("--", false, dBPrimaryKeyConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      File file0 = FileUtil.canonicalFile("PRIMARY_KEY_");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      SQLUtil.renderCreateTable(dBTable0, false, nameSpec0, mockPrintWriter0);
      assertEquals("--", dBTable0.getName());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[4] = null;
      String string0 = SQLUtil.innerJoin((String) null, stringArray0, "insertinto", stringArray0[3], stringArray0);
      assertEquals("insertinto as null on null.null = null.null and null.null = null.null and null.null = null.null and null.null = null.null and null.null = null.null", string0);
      
      String string1 = SQLUtil.substituteMarkers("iU.g^8+", "insert", "insertinto as null on null.null = null.null and null.null = null.null and null.null = null.null and null.null = null.null and null.null = null.null");
      assertEquals("iU.g^8+", string1);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("#dZZj$XBUB_YfgF=@");
      String[] stringArray0 = new String[7];
      SQLUtil.renderValue("#dZZj$XBUB_YfgF=@");
      SQLUtil.leftJoin("Qq,(S.IN(2i=2L:Gb-", stringArray0, (String) null, "drop indexorg.apache.derby.iapi.services.io.formatidoutputstream", stringArray0);
      String string0 = "org.apache.derby.impl.sql.compile.OrderedColumn";
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      SQLUtil.isDML("5]:puqVe`w");
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
  public void test82()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("#dZZj$XBUB_YfgF=@");
      String[] stringArray0 = new String[7];
      stringArray0[6] = "#dZZj$XBUB_YfgF=@";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "#dZZj$XBUB_YfgF=@", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.ukSpec(dBPrimaryKeyConstraint0, nameSpec0);
      // Undeclared exception!
      try { 
        SQLUtil.isQuery(stringArray0[2]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }
}

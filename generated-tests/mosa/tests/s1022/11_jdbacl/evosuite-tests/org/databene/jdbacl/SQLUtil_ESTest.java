/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:45:56 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList;
import org.apache.derby.iapi.sql.dictionary.SchemaDescriptor;
import org.apache.derby.iapi.store.raw.RawStoreFactory;
import org.apache.derby.iapi.store.raw.xact.RawTransaction;
import org.apache.derby.impl.store.raw.log.LogToFile;
import org.databene.jdbacl.NameSpec;
import org.databene.jdbacl.SQLUtil;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBConstraint;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBNotNullConstraint;
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
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.h2.value.ValueDecimal;
import org.hsqldb.jdbc.jdbcClob;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = defaultDBTable0.getPKColumnNames();
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertNotNull(string0);
      assertEquals("table null", string0);
      
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("table null", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      String string1 = SQLUtil.constraintName(dBForeignKeyConstraint0);
      assertEquals("CONSTRAINT \"table null\" ", string1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("TB", false, "TB", "TB");
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.createConstraintSpecBuilder(dBCheckConstraint0, nameSpec0);
      String string0 = SQLUtil.removeComments("TB");
      assertEquals("TB", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("TNB", false, "TNB", "TNB");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBCheckConstraint0, nameSpec0);
      stringBuilder0.append("Nux");
      assertEquals("Nux", stringBuilder0.toString());
      
      boolean boolean0 = SQLUtil.isDML("TNB");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPKColumnNames();
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("select", true, "select", "POWER(0, -1)");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CONSTRAINT select CHECK POWER(0, -1)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SQLUtil.normalize("7Y/!)h4n2$.,,p", false);
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        SQLUtil.renderQuery((DBTable) null, stringArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ValueDecimal valueDecimal0 = (ValueDecimal)ValueDecimal.ONE;
      String string0 = SQLUtil.substituteMarkers("^$hL", "Parameter Index", valueDecimal0);
      assertEquals("^$hL", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      jdbcClob jdbcClob0 = new jdbcClob("g-Q@,O/.I/");
      Reader reader0 = jdbcClob0.getCharacterStream();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(reader0);
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("- 0", string0);
      
      Character character0 = Character.valueOf(')');
      String string1 = SQLUtil.renderValue(character0);
      assertEquals("')'", string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = SchemaDescriptor.NULLID_SCHEMA_UUID;
      String[] stringArray0 = new String[2];
      stringArray0[1] = "c013800d-00fb-2647-07ec-000000134f30";
      String string1 = SQLUtil.leftJoin("D(oD~", stringArray0, "", (String) null, stringArray0);
      assertEquals("left join  as null on D(oD~.null = null.null and D(oD~.c013800d-00fb-2647-07ec-000000134f30 = null.c013800d-00fb-2647-07ec-000000134f30", string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter tablejzqet|'");
      assertTrue(boolean0);
      assertNotNull(boolean0);
      
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.join("alter tablejzqet|'", "alter tablejzqet|'", stringArray0, "renameh.e\t!tu9'l`#kn.c", "6 */c(", stringArray0);
      assertEquals("alter tablejzqet|' join renameh.e\t!tu9'l`#kn.c as 6 */c( on ", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SQLUtil.removeComments("Pinternal_stopslave");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Pinternal_stopslave";
      String string0 = SQLUtil.renderColumnListWithTableName("lower", stringArray0);
      assertEquals("lower.Pinternal_stopslave", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = SQLUtil.normalize("!W!-U0T|bm'X;=;H", true);
      assertEquals("! W ! - U0T | bm 'X;=;H'", string0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "! W ! - U0T | bm 'X;=;H'";
      stringArray0[1] = "!W!-U0T|bm'X;=;H";
      String string1 = SQLUtil.renderColumnListWithTableName("!W!-U0T|bm'X;=;H", stringArray0);
      assertEquals("!W!-U0T|bm'X;=;H.! W ! - U0T | bm 'X;=;H', !W!-U0T|bm'X;=;H.!W!-U0T|bm'X;=;H, !W!-U0T|bm'X;=;H.null", string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SQLUtil.removeComments("lXk");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("lXk");
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
  public void test12()  throws Throwable  {
      String string0 = SQLUtil.normalize("derby.locks.escalationThreshold", false);
      assertEquals("derby.locks.escalationThreshold", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = SQLUtil.normalize("!W!-U0T|bm'X*;=;H", false);
      assertEquals("! W ! - U0T | bm 'X*;=;H'", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SQLUtil.removeComments("(");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("(");
      defaultDBTable0.getPrimaryKeyConstraint();
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
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
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "yMPzH^7U";
      stringArray0[1] = "yMPzH^7U";
      stringArray0[2] = "yMPzH^7U";
      stringArray0[3] = "";
      stringArray0[4] = "yMPzH^7U";
      stringArray0[5] = "yMPzH^7U";
      SQLUtil.innerJoin("yMPzH^7U", stringArray0, "drop table", "", stringArray0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "create materialized view", true, stringArray0);
      dBUniqueConstraint0.setName("mw.2|`%a(nc$xIyjI");
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.appendConstraintName((DBConstraint) dBUniqueConstraint0, stringBuilder0);
      assertEquals("CONSTRAINT mw.2|`%a(nc$xIyjI ", stringBuilder0.toString());
      
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "", true, stringArray0);
      dBPrimaryKeyConstraint0.setTable(defaultDBTable0);
      Character.valueOf('4');
      DBUniqueConstraint dBUniqueConstraint1 = defaultDBTable0.getUniqueConstraint(stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("", false, dBUniqueConstraint1);
      DefaultDBTable defaultDBTable1 = new DefaultDBTable("KQz9m1>.{59A*Nr8r");
      String string0 = SQLUtil.renderValue(defaultDBTable1);
      assertEquals("KQz9m1>.{59A*Nr8r", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPKColumnNames();
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("select", true, "select", "POWER(0, -1)");
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CHECK POWER(0, -1)", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      SQLUtil.mutatesDataOrStructure("alter tablejzqet|'");
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
  public void test18()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPKColumnNames();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("POWER(0, -1)", defaultDBTable0, (-1980), "POWER(0, -1)");
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "POWER(0, -1)");
      SQLUtil.addRequiredCondition("POWER(0, -1)", stringBuilder0);
      assertEquals("POWER(0, -1) and POWER(0, -1)", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema((String) null);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBTable defaultDBTable1 = new DefaultDBTable((String) null, dBSchema0);
      String[] stringArray0 = defaultDBTable0.getColumnNames();
      SQLUtil.typeAndName(dBSchema0);
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer(".Ro&Kt1,wE7M");
      String string0 = SQLUtil.typeAndName(tableContainer0);
      assertNotNull(string0);
      assertEquals("container .Ro&Kt1,wE7M", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[3] = "?:s t~}4%e[.bJ.u`";
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("null = null AND null = null AND null = null AND ?:s t~}4%e[.bJ.u` = '?:s t~}4%e[.bJ.u`'", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SQLUtil.isDDL("NePnK`=wu,OhY?");
      SQLUtil sQLUtil0 = new SQLUtil();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "NePnK`=wu,OhY?";
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, (String) null, false, stringArray0);
      StringBuilder stringBuilder0 = new StringBuilder(0);
      stringBuilder0.insert(0, (CharSequence) "NePnK`=wu,OhY?");
      char[] charArray0 = new char[5];
      charArray0[0] = 'k';
      charArray0[1] = '2';
      charArray0[2] = 'B';
      SQLUtil.innerJoin("getSubString(", stringArray0, "9x*l =LW=M`J?Ff!|mL", (String) null, stringArray0);
      SQLUtil.addRequiredCondition("alter sessionxo;(;x", stringBuilder0);
      DBUniqueConstraint dBUniqueConstraint1 = defaultDBTable0.getUniqueConstraint(stringArray0);
      SQLUtil.appendConstraintName((DBConstraint) dBUniqueConstraint1, stringBuilder0);
      SQLUtil.ownerDotComponent(defaultDBTable0);
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("z];NY)x{lab@)zS");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("create materialized viewceil");
      SQLUtil.addOptionalCondition("create materialized viewceil", stringBuilder0);
      assertEquals("create materialized viewceil or create materialized viewceil", stringBuilder0.toString());
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "?:s t~}4%e[.bJ.u`";
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("?:s t~}4%e[.bJ.u` = '?:s t~}4%e[.bJ.u`'", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = SQLUtil.normalize("AbHb4YsK)q\"J", false);
      assertEquals("AbHb4YsK) q \"J\"", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("alter tablejzqet|'");
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
  public void test26()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = Locale.getISOCountries();
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      String string0 = SQLUtil.constraintName(dBForeignKeyConstraint0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("!W!-U0T|bm'X*;=;H", defaultDBTable0, 7, "/*");
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("!W!-U0T|bm'X*;=;H /* NULL", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.ALWAYS;
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
  public void test29()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter tablejzqet|'");
      assertNotNull(boolean0);
      assertTrue(boolean0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("FOREIGN KEY ");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "s >~KT";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "s >~KT", false, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("alter tablejzqet|'", false, dBPrimaryKeyConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(dBTable0, "FOREIGN KEY ", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("CONSTRAINT \"FOREIGN KEY \" UNIQUE (s >~KT)", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("POWER(0, -1)", defaultDBTable0, (-1980), "POWER(0, -1)");
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("POWER(0, -1) POWER(0,-1) NULL", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDDL("NePnK`=wu,OhY?");
      boolean boolean1 = SQLUtil.isDML("nepnk`=wu,ohy?");
      assertTrue(boolean1 == boolean0);
      
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.join((String) null, "~aQz", stringArray0, (String) null, "insert~aqz", stringArray0);
      assertEquals("null as insert~aqz on ", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = SQLUtil.normalize("insert(,^f[8)m0i77wtssx%>", true);
      assertEquals("insert (, ^ f [ 8) m0i77wtssx % >", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("deletetable null");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("SELECT COMPRESSED, DATA FROM INFORMATION_SCHEMA.LOB_MAP M INNER JOIN INFORMATION_SCHEMA.LOB_DATA D ON M.BLOCK = D.BLOCK WHERE M.LOB = ? AND M.SEQ = ?");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockFile mockFile0 = new MockFile("1:qX");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "rename";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "truncate", false, stringArray0);
      defaultDBTable0.setPrimaryKey(dBPrimaryKeyConstraint0);
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      assertEquals("table", defaultDBTable0.getObjectType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("~`p");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("~`p", defaultDBTable0, 3218, "~`p");
      defaultDBColumn0.getForeignKeyConstraint();
      defaultDBTable0.removeForeignKeyConstraint((DBForeignKeyConstraint) null);
      defaultDBTable0.getUniqueConstraint((String[]) null);
      DefaultDBTable defaultDBTable1 = new DefaultDBTable("~`p");
      SQLUtil.removeComments("~`p");
      // Undeclared exception!
      SQLUtil.isQuery("/*wpdicB~g{6fFv");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("alter tablejzqet|'");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      Boolean.valueOf("alter tablejzqet|'");
      String string0 = RawStoreFactory.OLD_ENCRYPTED_KEY;
      SQLUtil.isQuery("c_4a!T&");
      StringBuilder stringBuilder0 = new StringBuilder(437);
      SQLUtil.addRequiredCondition("alter materialized viewalter tablejzqet|'", stringBuilder0);
      assertEquals("alter materialized viewalter tablejzqet|'", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPKColumnNames();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("POWER(0, -1)", defaultDBTable0, (-1980), "POWER(0, -1)");
      String string0 = SQLUtil.ownerDotComponent(defaultDBColumn0);
      assertEquals(0, (int)defaultDBColumn0.getSize());
      assertEquals("null.POWER(0, -1)", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = SQLUtil.normalize("{uY@9Y:e*}Y", false);
      assertEquals(" { uY @ 9Y : e * } Y", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = SQLUtil.normalize("(sBr.", true);
      assertEquals("(sBr.", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(pipedReader0);
      SQLUtil.renderNumber(streamTokenizer0);
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addOptionalCondition("- 0", stringBuilder0);
      assertEquals("- 0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      SQLUtil.removeComments("CACHE_TYPE");
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("delete=&b<v1(xm");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal column type format: delete=&b<v1(xm
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("b<}lL>kv=FU");
      SQLUtil.removeComments("cJi4d\"9}(/36`[|");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("b<}lL>kv=FU", defaultDBTable0, (-306), "0r`!CwQ^IA,Gy_hZWSG");
      defaultDBColumn0.setNullable(false);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("b<}lL>kv=FU 0R`!CWQ^IA,GY_HZWSG NOT NULL", string0);
      
      boolean boolean0 = SQLUtil.isDML("E$n0e39/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Integer integer0 = RawTransaction.ABORT;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      defaultDBTable0.getUniqueConstraint(stringArray0);
      SQLUtil.mutatesDataOrStructure("select into");
      String string0 = SQLUtil.typeAndName((DBObject) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPKColumnNames();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("POWER(0, -1)", defaultDBTable0, (-1980), "POWER(0, -1)");
      assertEquals(0, (int)defaultDBColumn0.getSize());
      
      DBColumn[] dBColumnArray0 = new DBColumn[1];
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      String string0 = SQLUtil.renderColumnNames(dBColumnArray0);
      assertEquals("POWER(0, -1)", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPKColumnNames();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("POWER(0, -1)", defaultDBTable0, (-1980), "POWER(0, -1)");
      DBColumn[] dBColumnArray0 = new DBColumn[6];
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnNames(dBColumnArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPKColumnNames();
      defaultDBTable0.getColumnNames();
      DBDataType dBDataType0 = DBDataType.getInstance(1748, "3IcV");
      Integer integer0 = RawTransaction.ABORT;
      Integer integer1 = RawTransaction.LOCK_ESCALATE;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("7", defaultDBTable0, dBDataType0, integer1);
      defaultDBColumn0.setDefaultValue("7");
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("7 3ICV(3) DEFAULT 7 NULL", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPKColumnNames();
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("call");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = defaultDBTable0.getPKColumnNames();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("POWER(0, -1)", defaultDBTable0, (-1980), "POWER(0, -1)");
      assertEquals(0, (int)defaultDBColumn0.getSize());
      
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "POWER(0, -1)", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY ()", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      streamTokenizer0.nval = (-1264.4);
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("- 1264.4", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBTable defaultDBTable1 = new DefaultDBTable();
      LinkedBlockingQueue<DBTable> linkedBlockingQueue0 = new LinkedBlockingQueue<DBTable>();
      String string0 = SQLUtil.normalize("~(1NNdJ4^g,f--x'RM", false);
      assertEquals("~ (1NNdJ4 ^ g, f -- x 'RM'", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = Locale.getISOCountries();
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("<Jb$+", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      dBForeignKeyConstraint0.setOwner(defaultDBTable0);
      String string0 = SQLUtil.constraintName(dBForeignKeyConstraint0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string1 = SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPKColumnNames();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("POWER(0, -1)", defaultDBTable0, (-1980), "POWER(0, -1)");
      assertEquals(0, (int)defaultDBColumn0.getSize());
      
      DBNotNullConstraint dBNotNullConstraint0 = new DBNotNullConstraint(defaultDBTable0, "POWER(0, -1)", false, "POWER(0, -1)");
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.constraintSpec(dBNotNullConstraint0, nameSpec0);
      assertEquals("POWER(0, -1) NOT NULL", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("Ib{;C/mWxz");
      String string0 = null;
      String[] stringArray0 = new String[17];
      stringArray0[0] = "Ib{;C/mWxz";
      stringArray0[1] = null;
      stringArray0[2] = null;
      stringArray0[3] = null;
      stringArray0[4] = null;
      stringArray0[5] = "Ib{;C/mWxz";
      stringArray0[6] = "alter tablealter tableleft";
      stringArray0[7] = "Ib{;C/mWxz";
      stringArray0[8] = null;
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, (String) null, false, stringArray0);
      dBUniqueConstraint0.toString();
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      SQLUtil.ukSpec(dBUniqueConstraint0, nameSpec0);
      SQLUtil.typeAndName(dBUniqueConstraint0);
      String string1 = ";.LvqyE~^-";
      StringBuilder stringBuilder0 = null;
      // Undeclared exception!
      try { 
        SQLUtil.addOptionalCondition("Ib{;C/mWxz", (StringBuilder) null);
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
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      streamTokenizer0.slashStarComments(true);
      streamTokenizer0.nval = 1818.3397080778;
      SQLUtil.renderNumber(streamTokenizer0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("LOC:");
      List<DBColumn> list0 = new ColumnDescriptorList();
      String string0 = LogToFile.TEST_LOG_INCOMPLETE_LOG_WRITE;
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPKColumnNames();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter session");
      assertNotNull(boolean0);
      assertFalse(boolean0);
      
      Boolean boolean1 = SQLUtil.mutatesStructure("alter session");
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = SQLUtil.normalize("N:}/v|,*/E4", true);
      assertEquals("N : } / v |, */ E4", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockFile mockFile0 = new MockFile("1:qX");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "1:qX";
      stringArray0[1] = "hE";
      stringArray0[2] = "1:qX";
      stringArray0[3] = "hE";
      stringArray0[4] = "1:qX";
      stringArray0[5] = "hE";
      stringArray0[6] = "hE";
      stringArray0[7] = "hE";
      stringArray0[8] = "hE";
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "1:qX", false, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("hE", false, dBUniqueConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      DBDataType.getInstance(1363, "#DP]<Ac7[T}_cg+8RZ");
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter("hE");
      NameSpec nameSpec0 = NameSpec.NEVER;
      SQLUtil.renderCreateTable(dBTable0, false, nameSpec0, mockPrintWriter0);
      SQLUtil sQLUtil0 = new SQLUtil();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance(12, "ilqf");
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("ilqf", defaultDBTable0, dBDataType0, integer0);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("ilqf ILQF(3) NULL", string0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("ilqf");
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      SQLUtil sQLUtil0 = new SQLUtil();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "(5ehDS6;oMxLN_^T{";
      stringArray0[1] = "FQ=E_QY+W',S";
      stringArray0[2] = "ilqf";
      stringArray0[3] = "FQ=E_QY+W',S";
      stringArray0[4] = "FQ=E_QY+W',S";
      stringArray0[5] = "ilqf ILQF(3) NULL";
      stringArray0[6] = "ilqf";
      String string1 = SQLUtil.renderColumnListWithTableName("FQ=E_QY+W',S", stringArray0);
      assertEquals("FQ=E_QY+W',S.(5ehDS6;oMxLN_^T{, FQ=E_QY+W',S.FQ=E_QY+W',S, FQ=E_QY+W',S.ilqf, FQ=E_QY+W',S.FQ=E_QY+W',S, FQ=E_QY+W',S.FQ=E_QY+W',S, FQ=E_QY+W',S.ilqf ILQF(3) NULL, FQ=E_QY+W',S.ilqf", string1);
      
      SQLUtil.parseColumnTypeAndSize("ilqf ILQF(3) NULL");
      String string2 = SQLUtil.normalize("DATA_TYPE", false);
      assertEquals("DATA_TYPE", string2);
  }
}
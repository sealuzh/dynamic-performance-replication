/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 20:29:19 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.derby.catalog.AliasInfo;
import org.apache.derby.catalog.Dependable;
import org.apache.derby.iapi.sql.compile.NodeFactory;
import org.apache.derby.iapi.sql.dictionary.GenericDescriptorList;
import org.apache.derby.iapi.sql.dictionary.SchemaDescriptor;
import org.apache.derby.iapi.store.raw.RawStoreFactory;
import org.apache.derby.iapi.store.raw.data.DataFactory;
import org.apache.derby.iapi.store.raw.xact.RawTransaction;
import org.apache.derby.iapi.types.TypeId;
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
import org.databene.jdbacl.model.DBSequence;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DBUniqueIndex;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.DefaultDatabase;
import org.databene.jdbacl.model.TableContainer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.firebirdsql.jdbc.FBConnectionProperties;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("ql7<;CpnY", (DBTable) null, 1, "ql7<;CpnY");
      SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      String string0 = NodeFactory.MODULE;
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SQLUtil.removeComments("");
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderColumnListWithTableName("", stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = SchemaDescriptor.NULLID_SCHEMA_UUID;
      String[] stringArray0 = new String[6];
      String string1 = SQLUtil.renderColumnListWithTableName("c013800d-00fb-2647-07ec-000000134f30", stringArray0);
      assertEquals("c013800d-00fb-2647-07ec-000000134f30.null, c013800d-00fb-2647-07ec-000000134f30.null, c013800d-00fb-2647-07ec-000000134f30.null, c013800d-00fb-2647-07ec-000000134f30.null, c013800d-00fb-2647-07ec-000000134f30.null, c013800d-00fb-2647-07ec-000000134f30.null", string1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = SQLUtil.substituteMarkers("(qiWkwSU1=x9 ]5#>t'", "Illegal column type format: ", "(qiWkwSU1=x9 ]5#>t'");
      assertEquals("(qiWkwSU1=x9 ]5#>t'", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      String string0 = SQLUtil.renderValue(mockMinguoDate0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = SQLUtil.normalize("-j>QANX", true);
      assertEquals("- j > QANX", string0);
      
      String[] stringArray0 = new String[0];
      String string1 = SQLUtil.innerJoin("- j > QANX", stringArray0, "-j>QANX", "2Y>U_", stringArray0);
      assertEquals("-j>QANX as 2Y>U_ on ", string1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Inalid mahConnections value: ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("- 0", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SQLUtil.removeComments("");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("CA\"J9L.z*r_");
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertNotNull(string0);
      assertEquals("table CA\"J9L.z*r_", string0);
      
      String[] stringArray0 = new String[4];
      String string1 = SQLUtil.leftJoin("-3gAfT0tQGK-+aZ|T", stringArray0, "VIEWS", "CA\"J9L.z*r_", stringArray0);
      assertEquals("left join VIEWS as CA\"J9L.z*r_ on -3gAfT0tQGK-+aZ|T.null = CA\"J9L.z*r_.null and -3gAfT0tQGK-+aZ|T.null = CA\"J9L.z*r_.null and -3gAfT0tQGK-+aZ|T.null = CA\"J9L.z*r_.null and -3gAfT0tQGK-+aZ|T.null = CA\"J9L.z*r_.null", string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SQLUtil.normalize("create unique index0r#\":=?!o*ac'+'", false);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "create unique index0r # \":=?!o*ac'+'\"");
      SQLUtil.addOptionalCondition("W;$]sku2UoP", stringBuilder0);
      assertEquals("create unique index0r # \":=?!o*ac'+'\" or W;$]sku2UoP", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("select int");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      List<DBCheckConstraint> list0 = new ArrayList<DBCheckConstraint>();
      SQLUtil.typeAndName(defaultDBTable0);
      SQLUtil sQLUtil0 = new SQLUtil();
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
  public void test10()  throws Throwable  {
      String string0 = SQLUtil.removeComments("select iDnt");
      String[] stringArray0 = new String[0];
      String string1 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("select iDnt");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "select iDnt";
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("select iDnt = 'select iDnt'", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<DBColumn> arrayList0 = new ArrayList<DBColumn>();
      String string0 = Dependable.TABLE;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Table";
      stringArray0[1] = "Table";
      String string1 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("Table = 'Table' AND Table = 'Table'", string1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getPrimaryKeyConstraint();
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
  public void test14()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("alter materializedviewi:5wlw[u_~ssx>");
      StringBuilder stringBuilder0 = new StringBuilder("create tableselect int");
      StringBuilder stringBuilder1 = stringBuilder0.reverse();
      SQLUtil.addRequiredCondition("create tableselect int", stringBuilder1);
      String string0 = SQLUtil.removeComments("create tableselect int");
      assertEquals("create tableselect int", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SQLUtil.removeComments("truncate");
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
  public void test16()  throws Throwable  {
      GenericDescriptorList genericDescriptorList0 = new GenericDescriptorList();
      String string0 = DataFactory.MODULE;
      String string1 = SQLUtil.normalize("org.apache.derby.iapi.store.raw.data.DataFactory", true);
      assertEquals("org.apache.derby.iapi.store.raw.data.DataFactory", string1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addRequiredCondition("getHashTableResultSet", stringBuilder0);
      assertEquals("getHashTableResultSet", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("]xi|/wbovBbkr&8vaU");
      String string0 = TypeId.SMALLINT_NAME;
      DBDataType dBDataType0 = DBDataType.getInstance((-1732), "SMALLINT");
      Integer integer0 = RawTransaction.COMMIT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("alter sessionselect int", defaultDBTable0, dBDataType0, integer0, integer0);
      String string1 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("alter sessionselect int SMALLINT(0,0) NULL", string1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("calldate", true, "calldate", "calldate");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CONSTRAINT calldate CHECK calldate", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[8];
      String string0 = FBConnectionProperties.TYPE_PROPERTY;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "l3)05Y-&Q`V3", true, stringArray0);
      String string1 = dBPrimaryKeyConstraint0.toString();
      assertEquals("CONSTRAINT l3)05Y-&Q`V3 PRIMARY KEY (, , , , , , , )", string1);
      
      String string2 = SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      assertEquals("CONSTRAINT l3)05Y-&Q`V3 ", string2);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SQLUtil.removeComments(" = ");
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema((String) null, dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable(" = ", dBSchema0);
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, " = ", false, (String[]) null);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.ukSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("UNIQUE ()", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = SQLUtil.typeAndName((DBObject) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter materializedviewi:5wlw[u_~ssx>");
      assertNull(boolean0);
      
      String[] stringArray0 = new String[6];
      stringArray0[0] = "8tli";
      stringArray0[1] = "8tli";
      stringArray0[2] = "alter materializedviewi:5wlw[u_~ssx>";
      stringArray0[3] = null;
      stringArray0[4] = "alter materializedviewi:5wlw[u_~ssx>";
      stringArray0[5] = null;
      String string0 = SQLUtil.join((String) null, "8tli", stringArray0, "delete]xi|/wbovbbkr&8vau", stringArray0[3], stringArray0);
      assertEquals("delete]xi|/wbovbbkr&8vau as null on 8tli.8tli = null.8tli and 8tli.8tli = null.8tli and 8tli.alter materializedviewi:5wlw[u_~ssx> = null.alter materializedviewi:5wlw[u_~ssx> and 8tli.null = null.null and 8tli.alter materializedviewi:5wlw[u_~ssx> = null.alter materializedviewi:5wlw[u_~ssx> and 8tli.null = null.null", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = AliasInfo.ALIAS_NAME_SPACE_FUNCTION_AS_STRING;
      SQLUtil.mutatesDataOrStructure("SYSTEM_USER");
      SQLUtil.addOptionalCondition("F", stringBuilder0);
      assertEquals("F", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = SQLUtil.normalize("q7qEp (V57#VuGo", true);
      assertEquals("q7qEp (V57 # VuGo", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = SQLUtil.normalize("fv[*L5", true);
      assertEquals(" fv [ * L5", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("deletesystem_user", true, (String) null, "dw");
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CHECK dw", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = SQLUtil.normalize("g'pT", true);
      assertEquals("g 'pT'", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("nO(*UW^");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("nO(*UW^", dBSchema0);
      DBDataType dBDataType0 = DBDataType.getInstance(151, "");
      String string0 = NodeFactory.MODULE;
      Integer integer0 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("org.apache.derby.iapi.sql.compile.NodeFactory", defaultDBTable0, dBDataType0, integer0);
      String string1 = SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      assertEquals("(2)", string1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[8];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      dBForeignKeyConstraint0.isIdentical(defaultDBTable0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      SQLUtil.ownerDotComponent(defaultDBTable0);
      String string0 = NodeFactory.MODULE;
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = SQLUtil.normalize("odU)SlsD", false);
      assertEquals("odU) SlsD", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("-j8>,QANX");
      SQLUtil.typeAndName(defaultDBTable0);
      SQLUtil.normalize("-j8>,QANX", false);
      DefaultDBTable defaultDBTable1 = new DefaultDBTable();
      assertFalse(defaultDBTable1.equals((Object)defaultDBTable0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      PipedWriter pipedWriter0 = new PipedWriter();
      SQLUtil.removeComments("update");
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("update");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema("/GM", dBCatalog0);
      DBSequence dBSequence0 = new DBSequence("/GM", dBSchema0);
      SQLUtil.ownerDotComponent(dBSequence0);
      String string0 = NodeFactory.MODULE;
      assertEquals("org.apache.derby.iapi.sql.compile.NodeFactory", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getReferrers();
      PipedWriter pipedWriter0 = new PipedWriter();
      Locale locale0 = Locale.US;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("org.firebirdsql.jdbc.FBDriverNotCapableException", defaultDBTable0, (-1), "select idn");
      locale0.getDisplayVariant((Locale) null);
      SQLUtil.parseColumnTypeAndSize("org.firebirdsql.jdbc.FBDriverNotCapableException");
      DBColumn[] dBColumnArray0 = new DBColumn[1];
      DefaultDBColumn defaultDBColumn1 = new DefaultDBColumn("", defaultDBTable0, (-1), "");
      dBColumnArray0[0] = (DBColumn) defaultDBColumn1;
      String string0 = SQLUtil.renderColumnNames(dBColumnArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("select iDnt");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "create table";
      stringArray0[1] = "l3)05Y-&Q`V3";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "select iDnt", false, stringArray0);
      String string0 = SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      assertEquals("CONSTRAINT \"select iDnt\" ", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("drop materialized view");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = SQLUtil.normalize("\".\"", true);
      assertEquals("\".\"", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("select into_jy");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "qP7k";
      stringArray0[1] = "select into_jy";
      stringArray0[2] = "select into_jy";
      stringArray0[3] = "select into_jy";
      SQLUtil.renderColumnNames(stringArray0);
      SQLUtil.isProcedureCall(" DEFAULT ");
      TableContainer tableContainer0 = new TableContainer("v|(S");
      tableContainer0.getTable("FZ}+Ys)=^kTank .x8@");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("select into_jy", (DBTable) null, (-847), "select into_jy");
      DBColumn[] dBColumnArray0 = new DBColumn[2];
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
  public void test40()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[8];
      defaultDBTable0.getUniqueConstraint(stringArray0);
      String string0 = SchemaDescriptor.STD_SYSTEM_DIAG_SCHEMA_NAME;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "l3)05Y-&Q`V3", true, stringArray0);
      dBPrimaryKeyConstraint0.setName("SYSCS_DIAG");
      SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.appendConstraintName((DBConstraint) dBPrimaryKeyConstraint0, stringBuilder0);
      assertEquals("CONSTRAINT SYSCS_DIAG ", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("executeselect int");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("select into_jy");
      StringReader stringReader0 = new StringReader("select into_jy");
      String string0 = NodeFactory.MODULE;
      NameSpec nameSpec0 = NameSpec.NEVER;
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
  public void test43()  throws Throwable  {
      SQLUtil.parseColumnTypeAndSize(" pos: ");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("i-K{b!Lk]");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "i-K{b!Lk]";
      stringArray0[1] = " pos: ";
      stringArray0[2] = " pos: ";
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("i-K{b!Lk]", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      dBForeignKeyConstraint0.setName((String) null);
      NameSpec nameSpec0 = NameSpec.NEVER;
      SQLUtil.fkSpec(dBForeignKeyConstraint0, nameSpec0);
      SQLUtil.mutatesStructure("deletes");
      StringBuilder stringBuilder0 = new StringBuilder("FOREIGN KEY (i-K{b!Lk],  pos: ,  pos: ) REFERENCES i-K{b!Lk](i-K{b!Lk],  pos: ,  pos: )");
      StringBuilder stringBuilder1 = stringBuilder0.append("FOREIGN KEY (i-K{b!Lk],  pos: ,  pos: ) REFERENCES i-K{b!Lk](i-K{b!Lk],  pos: ,  pos: )");
      SQLUtil.appendConstraintName((DBConstraint) dBForeignKeyConstraint0, stringBuilder1);
      SQLUtil.addOptionalCondition("FOREIGN KEY (i-K{b!Lk],  pos: ,  pos: ) REFERENCES i-K{b!Lk](i-K{b!Lk],  pos: ,  pos: )", stringBuilder0);
      assertEquals("FOREIGN KEY (i-K{b!Lk],  pos: ,  pos: ) REFERENCES i-K{b!Lk](i-K{b!Lk],  pos: ,  pos: )FOREIGN KEY (i-K{b!Lk],  pos: ,  pos: ) REFERENCES i-K{b!Lk](i-K{b!Lk],  pos: ,  pos: ) or FOREIGN KEY (i-K{b!Lk],  pos: ,  pos: ) REFERENCES i-K{b!Lk](i-K{b!Lk],  pos: ,  pos: )", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("~(+u33}Q");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal column type format: ~(+u33}Q
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("getBigDecimal");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      String string0 = NodeFactory.MODULE;
      Character character0 = Character.valueOf(';');
      String string1 = SQLUtil.substituteMarkers("getBigDecimal", "getBigDecimal", character0);
      assertEquals("';'", string1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[8];
      String string0 = SchemaDescriptor.STD_SYSTEM_DIAG_SCHEMA_NAME;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "l3)05Y-&Q`V3", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string1 = SQLUtil.constraintSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY (, , , , , , , )", string1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = SQLUtil.normalize("] xi  | / wbovbbkr & 8", false);
      assertEquals("] xi  | / wbovbbkr & 8", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[8];
      String string0 = SchemaDescriptor.STD_SYSTEM_DIAG_SCHEMA_NAME;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "SYSCS_DIAG", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("SYSCS_DIAG");
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      String string1 = NodeFactory.MODULE;
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = AliasInfo.ALIAS_NAME_SPACE_FUNCTION_AS_STRING;
      // Undeclared exception!
      SQLUtil.mutatesDataOrStructure("/*");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      String string0 = SQLUtil.normalize("*/", true);
      assertEquals("*/", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      GenericDescriptorList genericDescriptorList0 = new GenericDescriptorList();
      String string0 = RawStoreFactory.LOG_ENCRYPT_ALGORITHM_VERSION;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      stringArray0[0] = null;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, true, stringArray0);
      dBPrimaryKeyConstraint0.setName(stringArray0[0]);
      SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnNames((List<DBColumn>) genericDescriptorList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getReferrers();
      PipedWriter pipedWriter0 = new PipedWriter();
      Locale locale0 = Locale.US;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("select idn", defaultDBTable0, 481, "/,*h=1oA");
      locale0.getDisplayVariant(locale0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedWriter0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      String string0 = NodeFactory.MODULE;
      assertEquals("org.apache.derby.iapi.sql.compile.NodeFactory", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = SQLUtil.normalize("--", false);
      assertEquals("--", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("select iDnt");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("iKB%'=`@`'9^8[e8Z");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "iKB%'=`@`'9^8[e8Z";
      stringArray0[1] = "select iDnt";
      stringArray0[2] = "iKB%'=`@`'9^8[e8Z";
      stringArray0[3] = "TYPENAMEPATTERN";
      stringArray0[4] = "TYPENAMEPATTERN";
      stringArray0[5] = "TYPENAMEPATTERN";
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "TYPENAMEPATTERN", false, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("TYPENAMEPATTERN", false, dBUniqueConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      NameSpec nameSpec0 = NameSpec.NEVER;
      SQLUtil.renderCreateTable(dBTable0, false, nameSpec0, mockPrintWriter0);
      String string0 = NodeFactory.MODULE;
      assertEquals("org.apache.derby.iapi.sql.compile.NodeFactory", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Integer integer0 = RawTransaction.SAVEPOINT_ROLLBACK;
      VersionNumber versionNumber0 = VersionNumber.valueOf(".LRW8&^VSA");
      DefaultDatabase defaultDatabase0 = new DefaultDatabase("select iDnt", "select iDnt", versionNumber0);
      DBCatalog dBCatalog0 = new DBCatalog("", defaultDatabase0);
      DBSchema dBSchema0 = new DBSchema("left", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("!lY!k", dBSchema0);
      DBDataType dBDataType0 = DBDataType.getInstance(2031, "v_gj(l8S>Kyu_^LpHk");
      Integer integer1 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("!lY!k", defaultDBTable0, dBDataType0, integer0, integer1);
      defaultDBColumn0.setNullable(false);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("!lY!k V_GJ(L8S>KYU_^LPHK(2,2) NOT NULL", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter sessionselect idnt");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }
}
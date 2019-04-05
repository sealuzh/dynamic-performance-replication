/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 00:06:27 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream;
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
import org.databene.jdbacl.model.DBNotNullConstraint;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBPackage;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.DefaultDatabase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.hsqldb.rowio.RowOutputTextLog;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      String string0 = SQLUtil.substituteMarkers("\u0001\u015D", "\u0001\u015D", object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = SQLUtil.renderValue((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderColumnNames(stringArray0);
      assertEquals("()", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("blob");
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, ";Cv", true, (String[]) null);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.pkSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY ()", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[8];
      String string0 = SQLUtil.leftJoin("RADIX SMALLINT", stringArray0, "!x6'%(M.paPK", (String) null, stringArray0);
      assertEquals("left join !x6'%(M.paPK as null on RADIX SMALLINT.null = null.null and RADIX SMALLINT.null = null.null and RADIX SMALLINT.null = null.null and RADIX SMALLINT.null = null.null and RADIX SMALLINT.null = null.null and RADIX SMALLINT.null = null.null and RADIX SMALLINT.null = null.null and RADIX SMALLINT.null = null.null", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = SQLUtil.leftJoin("@", stringArray0, "", "", stringArray0);
      assertEquals("left join  as  on @.null = .null and @.null = .null", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[4];
      String string0 = SQLUtil.leftJoin((String) null, stringArray0, ".o&cEY)V8s", "", stringArray0);
      assertEquals("left join .o&cEY)V8s as  on null.null = .null and null.null = .null and null.null = .null and null.null = .null", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = SQLUtil.leftJoin("", stringArray0, "(43Y18.U)", "(43Y18.U)", stringArray0);
      assertEquals("left join (43Y18.U) as (43Y18.U) on .null = (43Y18.U).null", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[8];
      String string0 = SQLUtil.join("`Qe^U,I", "`Qe^U,I", stringArray0, "create materialized viewunique", "`Qe^U,I", stringArray0);
      assertEquals("`Qe^U,I join create materialized viewunique as `Qe^U,I on `Qe^U,I.null = `Qe^U,I.null and `Qe^U,I.null = `Qe^U,I.null and `Qe^U,I.null = `Qe^U,I.null and `Qe^U,I.null = `Qe^U,I.null and `Qe^U,I.null = `Qe^U,I.null and `Qe^U,I.null = `Qe^U,I.null and `Qe^U,I.null = `Qe^U,I.null and `Qe^U,I.null = `Qe^U,I.null", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[5];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("Bb2 (RR` S6)sl", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        SQLUtil.substituteMarkers((String) null, stringArray0[1], stringArray0[0]);
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
      String[] stringArray0 = new String[8];
      Object[] objectArray0 = SQLUtil.parseColumnTypeAndSize("{");
      // Undeclared exception!
      try { 
        SQLUtil.renderWhereClause(stringArray0, objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "update");
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnTypeWithSize((DBColumn) null, stringBuilder0);
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
  public void test14()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("(");
      DBSchema dBSchema0 = new DBSchema("h2.optimizeDistinct", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("#&gAV0{]", dBSchema0);
      List<DBColumn> list0 = defaultDBTable0.getColumns();
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnNames(list0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.ALWAYS;
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
  public void test16()  throws Throwable  {
      DefaultDatabase defaultDatabase0 = new DefaultDatabase("QvgP^h8H\"", "select into", (VersionNumber) null);
      DBCatalog dBCatalog0 = new DBCatalog((String) null, defaultDatabase0);
      DBSchema dBSchema0 = new DBSchema("Fyv'mF@@F]rPT!", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("Fyv'mF@@F]rPT!", dBSchema0);
      String[] stringArray0 = new String[8];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("Fyv'mF@@F]rPT!", true, defaultDBTable0, stringArray0, defaultDBTable0, (String[]) null);
      // Undeclared exception!
      try { 
        SQLUtil.appendConstraintName((DBConstraint) dBForeignKeyConstraint0, (StringBuilder) null);
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
      String[] stringArray0 = new String[3];
      String string0 = SQLUtil.join("5!UlRQY}x$FT", "", stringArray0, "]`zGZK@*YQb* NN4", "42Z18", stringArray0);
      assertEquals("5!UlRQY}x$FT join ]`zGZK@*YQb* NN4 as 42Z18 on .null = 42Z18.null and .null = 42Z18.null and .null = 42Z18.null", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = SQLUtil.isQuery("truncateisc");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = SQLUtil.isQuery("select");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = SQLUtil.isProcedureCall("execute");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = SQLUtil.isProcedureCall("C?$*QI@O~8<CNB21");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDML("update");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDML(".prop");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDDL("execute");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDDL("create tabledrop table");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure("I&/G:56' ;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure("alter materialized viewinformation_schema");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = SQLUtil.renderValue("java.lang.Object@3d2cfb1d");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance(0, "XSRS5.S");
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("XSRS5.S", defaultDBTable0, dBDataType0, integer0, integer0);
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0, stringBuilder0);
      assertEquals("XSRS5.S(3,3)", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[3];
      String string0 = SQLUtil.renderColumnNames(stringArray0);
      assertEquals("(, , )", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
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
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[4];
      String string0 = SQLUtil.renderColumnListWithTableName("org.apache.derby.impl.services.locks.LockControl", stringArray0);
      assertEquals("org.apache.derby.impl.services.locks.LockControl.null, org.apache.derby.impl.services.locks.LockControl.null, org.apache.derby.impl.services.locks.LockControl.null, org.apache.derby.impl.services.locks.LockControl.null", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("execute");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("- 0", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("execute");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = (-2496.3);
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("- 2496.3", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = SQLUtil.normalize("'w,OZ-Q=-O)", false);
      assertEquals("'w,OZ-Q=-O)'", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = SQLUtil.normalize("*/", true);
      assertEquals("*/", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = SQLUtil.normalize("v}IsY -CA\"Y$!~Qf", false);
      assertEquals("v } Is  Y - CA \"Y$!~Qf\"", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = SQLUtil.normalize("Kxt E5%t.v/*C", false);
      assertEquals("Kxt E5 % t.v /* C", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = SQLUtil.normalize("Bb2 (RR` S6)sl", false);
      assertEquals("Bb2 (RR ` S6) sl", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = SQLUtil.normalize("`Qe^U,I join create materialized viewunique as `Qe^U,I on `Qe^U,I.`Qe^U,I = `Qe^U,I.`Qe^U,I and `Qe^U,I.`Qe^U,I = `Qe^U,I.`Qe^U,I and `Qe^U,I.`Qe^U,I = `Qe^U,I.`Qe^U,I and `Qe^U,I.:F/w3R=[%#)V@sBr = `Qe^U,I.:F/w3R=[%#)V@sBr and `Qe^U,I.`Qe^U,I = `Qe^U,I.`Qe^U,I and `Qe^U,I.`Qe^U,I = `Qe^U,I.`Qe^U,I and `Qe^U,I.create materialized viewunique = `Qe^U,I.create materialized viewunique and `Qe^U,I.`Qe^U,I = `Qe^U,I.`Qe^U,I", false);
      assertEquals("` Qe ^ U, I join create materialized viewunique as ` Qe ^ U, I on ` Qe ^ U, I.` Qe ^ U, I = ` Qe ^ U, I.` Qe ^ U, I and ` Qe ^ U, I.` Qe ^ U, I = ` Qe ^ U, I.` Qe ^ U, I and ` Qe ^ U, I.` Qe ^ U, I = ` Qe ^ U, I.` Qe ^ U, I and ` Qe ^ U, I.: F / w3R = [ % #) V @ sBr = ` Qe ^ U, I.: F / w3R = [ % #) V @ sBr and ` Qe ^ U, I.` Qe ^ U, I = ` Qe ^ U, I.` Qe ^ U, I and ` Qe ^ U, I.` Qe ^ U, I = ` Qe ^ U, I.` Qe ^ U, I and ` Qe ^ U, I.create materialized viewunique = ` Qe ^ U, I.create materialized viewunique and ` Qe ^ U, I.` Qe ^ U, I = ` Qe ^ U, I.` Qe ^ U, I", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = SQLUtil.removeComments("`Qe^U,I");
      assertEquals("`Qe^U,I", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint((String) null, false, "PARAMS", "PARAMS");
      String string0 = SQLUtil.typeAndName(dBCheckConstraint0);
      assertEquals("check constraint constraint", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog((String) null);
      String string0 = SQLUtil.typeAndName(dBCatalog0);
      assertEquals("catalog null", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = SQLUtil.typeAndName((DBObject) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("select\"z");
      String[] stringArray0 = new String[6];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("ON DELETE", false, defaultDBTable0, stringArray0);
      String string0 = SQLUtil.typeAndName(dBNonUniqueIndex0);
      assertEquals("index ON DELETE", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "h*So~M]6%6", false, stringArray0);
      String string0 = SQLUtil.constraintName(dBUniqueConstraint0);
      assertEquals("CONSTRAINT h*So~M]6%6 ", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("M]btx##n");
      String[] stringArray0 = new String[7];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, true, stringArray0);
      String string0 = SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[2];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "42xa", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBPrimaryKeyConstraint0, nameSpec0);
      SQLUtil.appendConstraintName((DBConstraint) dBPrimaryKeyConstraint0, stringBuilder0);
      assertEquals("CONSTRAINT 42xa ", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("M]btx##n");
      String[] stringArray0 = new String[7];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, true, stringArray0);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "M]btx##n");
      SQLUtil.appendConstraintName((DBConstraint) dBPrimaryKeyConstraint0, stringBuilder0);
      assertEquals("M]btx##n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("c42ep>|Y");
      DBDataType dBDataType0 = DBDataType.getInstance((-1769), "exec#cde+0{7f\"8?");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("c42ep>|Y", defaultDBTable0, dBDataType0, (Integer) null);
      String string0 = SQLUtil.ownerDotComponent(defaultDBColumn0);
      assertEquals("c42ep>|Y.c42ep>|Y", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DBPackage dBPackage0 = new DBPackage(".", (DBSchema) null);
      String string0 = SQLUtil.ownerDotComponent(dBPackage0);
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "starting transaction xid = ");
      SQLUtil.addOptionalCondition("KFhx5Yn#55z", stringBuilder0);
      assertEquals("starting transaction xid =  or KFhx5Yn#55z", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addOptionalCondition((String) null, stringBuilder0);
      assertEquals("null", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      stringBuilder0.append("XSRS5.S");
      SQLUtil.addRequiredCondition("RADIX SMALLINT", stringBuilder0);
      assertEquals("XSRS5.S and RADIX SMALLINT", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addRequiredCondition(">q*7`k(g],o'jj7hu)f", stringBuilder0);
      assertEquals(">q*7`k(g],o'jj7hu)f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = SQLUtil.join((String) null, (String) null, stringArray0, stringArray0[1], "Rl\"'T}7i'/u&", stringArray0);
      assertEquals("null as Rl\"'T}7i'/u& on null.null = Rl\"'T}7i'/u&.null and null.null = Rl\"'T}7i'/u&.null", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("(", true, "truncate", "truncate");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CONSTRAINT ( CHECK truncate", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[9];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("ResultSet concurrency: ", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("FOREIGN KEY (, , , , , , , , ) REFERENCES null(, , , , , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("M]btx##n");
      String[] stringArray0 = new String[7];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, true, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY (, , , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      // Undeclared exception!
      SQLUtil.isQuery("/*");
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("exec");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("selectclob");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter table");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter session");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("select into");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Character character0 = Character.valueOf('p');
      String string0 = SQLUtil.renderValue(character0);
      assertEquals("'p'", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "UNIQUE ";
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("UNIQUE  = 'UNIQUE ' AND null = null AND null = null AND null = null AND null = null AND null = null", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DBDataType dBDataType0 = DBDataType.getInstance(1073741824, "create unique indexexecute^\"");
      Integer integer0 = RawTransaction.COMMIT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("create unique indexexecute^\"", (DBTable) null, dBDataType0, integer0);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("create unique indexexecute^\" CREATE UNIQUE INDEXEXECUTE^\"(0) NULL", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DBDataType dBDataType0 = DBDataType.getInstance("nclob");
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("gPHV6,82BR8vvZ4Id)", (DBTable) null, dBDataType0, integer0);
      String string0 = SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      assertEquals("NCLOB", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("c42ep>|Y");
      DBDataType dBDataType0 = DBDataType.getInstance((-1769), "exec#cde+0{7f\"8?");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("c42ep>|Y", defaultDBTable0, dBDataType0, (Integer) null);
      DBNotNullConstraint dBNotNullConstraint0 = new DBNotNullConstraint(defaultDBTable0, "exec#cde+0{7f\"8?", true, "c42ep>|Y");
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("c42ep>|Y EXEC#CDE+0{7F\"8? NOT NULL", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("blob");
      DBDataType dBDataType0 = DBDataType.getInstance((-1879341665), "blob");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("blob", defaultDBTable0, dBDataType0);
      defaultDBColumn0.setDefaultValue("blob");
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("blob BLOB DEFAULT blob NULL", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LinkedList<DBColumn> linkedList0 = new LinkedList<DBColumn>();
      DBDataType dBDataType0 = DBDataType.getInstance(48, "C?$*QI@O~8<CNB21");
      Integer integer0 = RawTransaction.COMMIT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("Maximum Blob input octet length exceeded: ", (DBTable) null, dBDataType0, integer0);
      linkedList0.add((DBColumn) defaultDBColumn0);
      String string0 = SQLUtil.renderColumnNames((List<DBColumn>) linkedList0);
      assertEquals("Maximum Blob input octet length exceeded: ", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DBColumn[] dBColumnArray0 = new DBColumn[5];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("create materialized view");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("create materialized view", defaultDBTable0, 453, "Yk|");
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
  public void test75()  throws Throwable  {
      DBColumn[] dBColumnArray0 = new DBColumn[1];
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("%1v`!J+Rd", (DBTable) null, (-2495), "u5%OvPsAG<{");
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      String string0 = SQLUtil.renderColumnNames(dBColumnArray0);
      assertEquals("%1v`!J+Rd", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "h*So~M]6%6", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      MockFile mockFile0 = new MockFile("left");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      assertEquals("table", defaultDBTable0.getObjectType());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      String[] stringArray0 = new String[8];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "J", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      RowOutputTextLog rowOutputTextLog0 = new RowOutputTextLog();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(rowOutputTextLog0, false);
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      assertEquals("table", defaultDBTable0.getObjectType());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance(0, "XSRS5.S");
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("XSRS5.S", defaultDBTable0, dBDataType0, integer0, integer0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("XSRS5.S");
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      assertEquals("table", defaultDBTable0.getObjectType());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("alter table(update, select * from )");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"update\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("()");
      DefaultDBColumn defaultDBColumn0 = null;
      try {
        defaultDBColumn0 = new DefaultDBColumn("()", defaultDBTable0, (-656), "()");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("|(;'qd");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal column type format: |(;'qd
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("80000010");
      NameSpec nameSpec0 = NameSpec.NEVER;
      byte[] byteArray0 = new byte[4];
      DynamicByteArrayOutputStream dynamicByteArrayOutputStream0 = new DynamicByteArrayOutputStream(byteArray0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(dynamicByteArrayOutputStream0, true);
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("Can't destroy managed connection  with active transaction", true, "5", "5");
      defaultDBTable0.addCheckConstraint(dBCheckConstraint0);
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      assertEquals(34, dynamicByteArrayOutputStream0.getPosition());
      assertEquals(34, dynamicByteArrayOutputStream0.getUsed());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
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
  public void test84()  throws Throwable  {
      String[] stringArray0 = new String[6];
      String string0 = SQLUtil.innerJoin("index ON DELETE", stringArray0, "ON DELETE", "drop tableexec", stringArray0);
      assertEquals("ON DELETE as drop tableexec on index ON DELETE.null = drop tableexec.null and index ON DELETE.null = drop tableexec.null and index ON DELETE.null = drop tableexec.null and index ON DELETE.null = drop tableexec.null and index ON DELETE.null = drop tableexec.null and index ON DELETE.null = drop tableexec.null", string0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Integer integer0 = RawTransaction.ABORT;
      String string0 = SQLUtil.substituteMarkers("k8Yjm`rTVV>n6bxcz", "update1fld;!:q\u0007&xb]s9n7", integer0);
      assertEquals("k8Yjm`rTVV>n6bxcz", string0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[0];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint(".[ c_7 { C", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      String string0 = SQLUtil.renderValue(dBForeignKeyConstraint0);
      assertEquals("CONSTRAINT \".[ c_7 { C\" FOREIGN KEY () REFERENCES null()", string0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      String[] stringArray0 = new String[1];
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
  public void test88()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
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
  public void test89()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("F5O9|zD^");
      String[] stringArray0 = new String[9];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "otO+", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("CONSTRAINT otO+ UNIQUE (, , , , , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      SQLUtil sQLUtil0 = new SQLUtil();
  }
}
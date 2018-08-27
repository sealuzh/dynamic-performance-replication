/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:07:51 GMT 2018
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.PipedReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.io.StringReader;
import org.apache.derby.iapi.sql.compile.Optimizer;
import org.apache.derby.iapi.sql.dictionary.SchemaDescriptor;
import org.apache.derby.iapi.sql.execute.NoPutResultSet;
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
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.DefaultDatabase;
import org.databene.jdbacl.model.TableContainer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.hsqldb.lib.FileUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = SQLUtil.substituteMarkers("rerences as referenc", "rerences as referenc", "rerences as referenc");
      assertEquals("'rerences as referenc'", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDDL(" REFERENCES ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[1];
      SQLUtil.renderWhereClause(stringArray0, stringArray0);
      String string0 = "x_sUJ0LhB!7,I*+4m";
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      SQLUtil.substituteMarkers("x_sUJ0LhB!7,I*+4m", "null = null", mockJapaneseDate0);
      // Undeclared exception!
      try { 
        SQLUtil.isProcedureCall((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("select");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "select";
      stringArray0[1] = "select";
      stringArray0[2] = "select";
      stringArray0[3] = "select";
      SQLUtil.renderWhereClause(stringArray0, stringArray0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("select = 'select' AND select = 'select' AND select = 'select' AND select = 'select'");
      defaultDBTable0.getUniqueConstraint(stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
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
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("BpL%v 9|HmY.WeD=bsM");
      String[] stringArray1 = new String[0];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, true, stringArray1);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.pkSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY ()", string0);
      
      boolean boolean0 = SQLUtil.isProcedureCall("BpL%v 9|HmY.WeD=bsM");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SQLUtil.parseColumnTypeAndSize("org.datae");
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
  public void test06()  throws Throwable  {
      String string0 = SchemaDescriptor.IBM_SYSTEM_CAT_SCHEMA_NAME;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance(7, "SYSCAT");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("SYSCAT", defaultDBTable0, dBDataType0);
      String string1 = SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      assertEquals("SYSCAT", string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(59);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("/;,6d~i)%#^*\" q]");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("/;,6d~i)%#^*\" q]", defaultDBTable0, 59, "/;,6d~i)%#^*\" q]");
      defaultDBColumn0.setSize(integer0);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("/;,6d~i)%#^*\" q] /;,6D~I)%#^*\" Q](59) NULL", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = SQLUtil.normalize("alter sessioncr/eq", false);
      assertEquals("alter sessioncr / eq", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("Qz$^\"Ov9", true, "a", "a");
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CHECK a", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SQLUtil.renderColumnNames(stringArray0);
      boolean boolean0 = SQLUtil.isProcedureCall("()");
      assertFalse(boolean0);
      
      String string0 = SQLUtil.normalize("()", false);
      assertEquals("()", string0);
      
      DBSchema dBSchema0 = new DBSchema("()");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("()", dBSchema0);
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "()", false, stringArray0);
      String string1 = dBUniqueConstraint0.toString();
      assertEquals("CONSTRAINT () UNIQUE ()", string1);
      
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string2 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("UNIQUE ()", string2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = Optimizer.NO_TIMEOUT;
      boolean boolean0 = FileUtil.fsIsIgnoreCase;
      String string1 = SQLUtil.normalize("derby.optimizer.noTimeout", false);
      assertEquals("derby.optimizer.noTimeout", string1);
      
      DBSchema dBSchema0 = new DBSchema("derby.optimizer.noTimeout");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("derby.optimizer.noTimeout", dBSchema0);
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "derby.optimizer.noTimeout", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string2 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("UNIQUE ()", string2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.leftJoin("n&", stringArray0, "q%R", "insertreferences as references on references .null = references .null", stringArray0);
      String string1 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SQLUtil sQLUtil0 = new SQLUtil();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      SQLUtil.renderColumnNames(stringArray0);
      TableContainer tableContainer0 = new TableContainer("_-(JbOQYDd");
      tableContainer0.getSchema();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable(" Ap/Xx=T:Jw|hkbl", (DBSchema) null);
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, " Ap/Xx=T:Jw|hkbl", true, stringArray0);
      String string0 = dBUniqueConstraint0.toString();
      assertEquals("CONSTRAINT \" Ap/Xx=T:Jw|hkbl\" UNIQUE ()", string0);
      
      String string1 = SQLUtil.renderValue((Object) null);
      assertEquals("null", string1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = NoPutResultSet.FIRST;
      DBSchema dBSchema0 = new DBSchema("@0$mJ\"2Gtm");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null, dBSchema0);
      String[] stringArray0 = new String[1];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "first", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string1 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("CONSTRAINT first UNIQUE ()", string1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("constraint");
      String string0 = SQLUtil.normalize("*C%PR*n", false);
      assertEquals("* C % PR * n", string0);
      
      boolean boolean0 = SQLUtil.isProcedureCall("* C % PR * n");
      assertFalse(boolean0);
      
      String[] stringArray0 = new String[5];
      stringArray0[0] = "*C%PR*n";
      stringArray0[1] = "*C%PR*n";
      stringArray0[2] = "*C%PR*n";
      stringArray0[3] = "*C%PR*n";
      stringArray0[4] = "constraint";
      String string1 = SQLUtil.renderQuery(defaultDBTable0, stringArray0, stringArray0);
      assertEquals("SELECT * FROM constraint WHERE *C%PR*n = '*C%PR*n' AND *C%PR*n = '*C%PR*n' AND *C%PR*n = '*C%PR*n' AND *C%PR*n = '*C%PR*n' AND constraint = 'constraint'", string1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[17];
      SQLUtil.innerJoin(" REFERENCES ", stringArray0, " REFERENCES ", " REFERENCES ", stringArray0);
      StringBuilder stringBuilder0 = new StringBuilder(" REFERENCES ");
      SQLUtil.addRequiredCondition("DROP", stringBuilder0);
      assertEquals(" REFERENCES  and DROP", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = SQLUtil.normalize("org.apache.derby.iapi.types.XMLDataValue", true);
      assertEquals("org.apache.derby.iapi.types.XMLDataValue", string0);
      
      boolean boolean0 = SQLUtil.isProcedureCall("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DBConstraint dBConstraint0 = null;
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = SQLUtil.addRequiredCondition("gj", stringBuilder0);
      int int0 = 1709;
      // Undeclared exception!
      try { 
        stringBuilder1.append((CharSequence) stringBuilder0, 1709, 1709);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // start 1709, end 1709, s.length() 2
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      SQLUtil.renderNumber(streamTokenizer0);
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addOptionalCondition("- 0", stringBuilder0);
      assertEquals("- 0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SQLUtil.normalize("create unique in(cx", false);
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("create unique in(cx");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = SQLUtil.normalize(";-j", false);
      assertEquals("; - j", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SQLUtil.typeAndName((DBObject) null);
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = stringBuilder0.append(0.0F);
      StringBuilder stringBuilder2 = stringBuilder1.append((StringBuffer) null);
      SQLUtil.addOptionalCondition("yKq", stringBuilder2);
      assertEquals("0.0null or yKq", stringBuilder2.toString());
      assertEquals("0.0null or yKq", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = SQLUtil.normalize("}ln'vnwC\"Nyv|f[", true);
      assertEquals("} ln 'vnwC\"Nyv|f['", string0);
      
      boolean boolean0 = SQLUtil.isProcedureCall("} ln 'vnwC\"Nyv|f['");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("drop table\"pqi3\f?|225hg$");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("delete/;,6d~i)%#^*\" q]");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("required (...)+ loop id not match anything at character ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"...\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("execute");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SQLUtil.ownerDotComponent(defaultDBTable0);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      boolean boolean0 = SQLUtil.isProcedureCall("create tablereferences as references on references .null = references .null");
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("", defaultDBTable0, (-227169198), "");
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("  NULL", string0);
      
      Boolean boolean1 = SQLUtil.mutatesStructure("org.databene.jdbacl.SQLUtil");
      assertTrue(boolean1.equals((Object)boolean0));
      
      DBColumn[] dBColumnArray0 = new DBColumn[3];
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      dBColumnArray0[1] = (DBColumn) defaultDBColumn0;
      dBColumnArray0[2] = (DBColumn) defaultDBColumn0;
      String string1 = SQLUtil.renderColumnNames(dBColumnArray0);
      assertEquals(", , ", string1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SQLUtil.normalize("bs f/*?RVW 0 [m<", false);
      Object[] objectArray0 = SQLUtil.parseColumnTypeAndSize("bs f/*?RVW 0 [m<");
      assertNotNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SQLUtil.mutatesDataOrStructure("select");
      String string0 = "<hz~uG^`$6R>4F(m<";
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("<hz~uG^`$6R>4F(m<");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal column type format: <hz~uG^`$6R>4F(m<
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderColumnNames(stringArray0);
      assertEquals("()", string0);
      
      boolean boolean0 = SQLUtil.isProcedureCall("()");
      assertFalse(boolean0);
      
      DBSchema dBSchema0 = new DBSchema("()");
      dBSchema0.setDoc("()");
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("updateObject(", 504);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("()", dBSchema0);
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "()", false, stringArray0);
      String string1 = SQLUtil.ownerDotComponent(defaultDBTable0);
      assertEquals("().()", string1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      defaultDBTable0.getUniqueConstraints(true);
      boolean boolean0 = SQLUtil.isProcedureCall("create tablereferences as references on references .null = references .null");
      assertFalse(boolean0);
      
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      defaultDBTable0.getIndex("d'odLN@o[3e");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("c", defaultDBTable0, (-227169198), "c");
      Integer integer0 = new Integer(39);
      defaultDBColumn0.setSize(integer0);
      defaultDBColumn0.setDefaultValue("C");
      SQLUtil.renderColumn(defaultDBColumn0);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("c C(39) DEFAULT C NULL", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VersionNumber versionNumber0 = VersionNumber.valueOf("-j");
      DefaultDatabase defaultDatabase0 = new DefaultDatabase((String) null, "-j", versionNumber0);
      String string0 = SQLUtil.typeAndName(defaultDatabase0);
      assertEquals("database null", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("select");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("select");
      defaultDBTable0.getPrimaryKeyConstraint();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "select";
      stringArray0[1] = "select";
      stringArray0[2] = "select";
      stringArray0[3] = "select";
      stringArray0[4] = "select";
      String string0 = SQLUtil.renderColumnListWithTableName("select", stringArray0);
      assertEquals("select.select, select.select, select.select, select.select, select.select", string0);
      
      String string1 = SQLUtil.join((String) null, "K,En_<,>C&AN~r#", stringArray0, "crea", "COUNT ", stringArray0);
      assertEquals("crea as COUNT  on K,En_<,>C&AN~r#.select = COUNT .select and K,En_<,>C&AN~r#.select = COUNT .select and K,En_<,>C&AN~r#.select = COUNT .select and K,En_<,>C&AN~r#.select = COUNT .select and K,En_<,>C&AN~r#.select = COUNT .select", string1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      SQLUtil.removeComments("org.databene.jdbacl.SQLUtil");
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("org.databene.jdbacl.SQLUtil");
      assertNull(boolean0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("org.databene.jdbacl.SQLUtil");
      DBDataType dBDataType0 = DBDataType.getInstance(3459, "org.databene.jdbacl.SQLUtil");
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      Integer integer1 = new Integer(3459);
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("org.databene.jdbacl.SQLUtil", defaultDBTable0, dBDataType0, integer0, integer1);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("org.databene.jdbacl.SQLUtil ORG.DATABENE.JDBACL.SQLUTIL(3,3459) NULL", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SQLUtil.normalize("/;,6d~i)%#^*\" q]", true);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("()");
      DBDataType dBDataType0 = DBDataType.getInstance((-1527), "42X45");
      Integer integer0 = RawTransaction.SAVEPOINT_ROLLBACK;
      Integer integer1 = RawTransaction.COMMIT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("()", defaultDBTable0, dBDataType0, integer0, integer1);
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
  public void test40()  throws Throwable  {
      String string0 = NoPutResultSet.FIRST;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("IOException eadng from ");
      MockFileWriter mockFileWriter0 = new MockFileWriter("IOException eadng from ", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileWriter0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      String string1 = SQLUtil.typeAndName(defaultDBTable0);
      assertEquals("table IOException eadng from ", string1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint((String) null, true, (String) null, "call");
      dBCheckConstraint0.setDoc((String) null);
      String string0 = SQLUtil.constraintName(dBCheckConstraint0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("into");
      MockFileWriter mockFileWriter0 = new MockFileWriter("into", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileWriter0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertEquals("table into", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.NEVER;
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[3];
      stringArray0[0] = null;
      stringArray0[1] = "select";
      stringArray0[2] = "select";
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, false, stringArray0);
      String string0 = SQLUtil.constraintSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY (, select, select)", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("alter session/;,6d~i)%#^*\" q]");
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter session/;,6d~i)%#^*\" q]");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("references as rPferenc");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = 2339.04;
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("2339.04", string0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, false, defaultDBTable0, (String[]) null, defaultDBTable0, (String[]) null);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string1 = SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("FOREIGN KEY () REFERENCES null()", string1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = NoPutResultSet.FIRST;
      DBSchema dBSchema0 = new DBSchema("@0mJ\"2Gtm");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null, dBSchema0);
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "first", true, stringArray0);
      dBUniqueConstraint0.toString();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      CharArrayWriter charArrayWriter1 = charArrayWriter0.append('Y');
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter1);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      assertEquals(51, charArrayWriter1.size());
      assertEquals(51, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[3];
      Character character0 = new Character('=');
      String string0 = SQLUtil.renderValue(character0);
      assertEquals("'='", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = "/;,6d~i)%#^*\" q]";
      SQLUtil.normalize("/;,6d~i)%#^*\" q]", false);
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("updategetobjectimpl(int,map)");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"int\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("a", true, "a", "a");
      SQLUtil.constraintName(dBCheckConstraint0);
      // Undeclared exception!
      try { 
        SQLUtil.appendConstraintName((DBConstraint) dBCheckConstraint0, (StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }
}
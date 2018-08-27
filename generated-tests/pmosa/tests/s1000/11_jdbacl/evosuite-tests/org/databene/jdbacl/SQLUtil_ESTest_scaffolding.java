/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 16 14:17:56 GMT 2018
 */

package org.databene.jdbacl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SQLUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.databene.jdbacl.SQLUtil"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "ANSI_X3.4-1968"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/Luxembourg"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SQLUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.apache.derby.iapi.services.io.ErrorObjectInput",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.databene.commons.CollectionUtil",
      "org.databene.script.Expression",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.databene.jdbacl.model.DBRow",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.apache.derby.iapi.types.XML",
      "org.h2.value.ValueNull",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.h2.value.ValueShort",
      "org.apache.derby.iapi.services.i18n.LocaleFinder",
      "org.h2.value.ValueDecimal",
      "org.apache.derby.iapi.types.SQLVarchar",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.apache.derby.iapi.types.Orderable",
      "org.postgresql.util.PSQLException",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.TableHolder",
      "org.apache.derby.iapi.services.cache.ClassSize$1",
      "org.antlr.runtime.CharStream",
      "org.h2.value.Value",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.antlr.runtime.Lexer",
      "org.antlr.runtime.MissingTokenException",
      "org.h2.value.CompareMode",
      "org.antlr.runtime.EarlyExitException",
      "org.apache.derby.iapi.error.StandardException",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.apache.derby.iapi.services.io.Storable",
      "org.h2.value.ValueString",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.h2.value.ValueJavaObject",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.antlr.runtime.Token",
      "org.apache.derby.iapi.types.SQLClob",
      "org.antlr.runtime.Parser",
      "org.databene.jdbacl.model.DBObject",
      "org.databene.commons.AssertionError",
      "org.apache.derby.iapi.services.io.StreamStorable",
      "org.h2.value.ValueInt",
      "org.hsqldb.lib.FileAccess",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.runtime.CommonTokenStream",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.apache.derby.iapi.types.StringDataValue",
      "org.databene.commons.depend.Dependent",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.jdbacl.model.DBColumn",
      "org.h2.value.ValueUuid",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.apache.derby.iapi.services.io.ArrayInputStream",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.h2.value.ValueDate",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.databene.jdbacl.model.DBPackage",
      "org.h2.value.ValueFloat",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.databene.jdbacl.SQLUtil",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.h2.value.ValueBoolean",
      "org.antlr.runtime.DFA",
      "org.h2.value.ValueLong",
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.types.XMLDataValue",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.apache.derby.iapi.types.SQLLongvarchar",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.h2.value.ValueStringIgnoreCase",
      "org.postgresql.ds.common.BaseDataSource",
      "org.h2.message.DbException",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.postgresql.core.Logger",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.apache.derby.catalog.types.UserDefinedTypeIdImpl",
      "org.apache.derby.iapi.types.BooleanDataValue",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.StringUtil",
      "org.h2.value.ValueBytes",
      "org.h2.value.ValueResultSet",
      "org.h2.value.ValueDouble",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.apache.derby.catalog.UUID",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.commons.Named",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.NameSpec",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.databene.commons.Parser",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.types.DataType",
      "org.h2.util.StatementBuilder",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.apache.derby.iapi.services.io.Limit",
      "org.antlr.runtime.tree.BaseTree",
      "org.databene.commons.ThreadAware",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.script.expression.ConstantExpression",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.antlr.runtime.BufferedTokenStream",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.h2.value.ValueArray",
      "org.apache.derby.iapi.types.SQLChar",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.databene.commons.collection.ListBasedSet",
      "org.apache.derby.iapi.types.VariableSizeDataValue",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.h2.value.ValueStringFixed",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.h2.value.ValueTimestamp",
      "org.antlr.runtime.CommonToken",
      "org.postgresql.Driver",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.apache.derby.iapi.services.io.ErrorInfo",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.databene.commons.version.VersionNumberParser",
      "org.antlr.runtime.RecognitionException",
      "org.h2.store.DataHandler",
      "org.databene.commons.Patterns",
      "org.databene.commons.NullSafeComparator",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ParseException",
      "org.antlr.runtime.TokenSource",
      "org.databene.commons.HeavyweightIterator",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.h2.value.ValueByte",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.commons.ArrayFormat",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.commons.SyntaxError",
      "org.antlr.runtime.IntStream",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.apache.derby.iapi.services.io.LimitObjectInput",
      "org.databene.jdbacl.model.Database",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.h2.util.IOUtils",
      "org.apache.derby.iapi.types.ConcatableDataValue",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.apache.derby.iapi.types.SqlXmlUtil",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.databene.commons.ObjectNotFoundException",
      "org.antlr.runtime.BaseRecognizer",
      "org.databene.jdbacl.model.DBSchema",
      "org.h2.value.ValueTime"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.databene.jdbacl.model.CompositeDBObject", false, SQLUtil_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SQLUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.databene.commons.CollectionUtil",
      "org.databene.jdbacl.SQLUtil",
      "org.databene.jdbacl.NameSpec",
      "org.databene.commons.Capitalization",
      "org.databene.commons.converter.ToStringConverter",
      "org.databene.commons.ArrayFormat",
      "org.databene.commons.StringUtil",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.OrderedMap",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.jdbacl.model.DBDataType",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.commons.ObjectNotFoundException",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.databene.jdbacl.model.DBSequence",
      "org.h2.table.Table",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.antlr.runtime.BaseRecognizer",
      "org.antlr.runtime.DFA",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.antlr.runtime.CommonToken",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.NoViableAltException",
      "org.databene.commons.ParseException",
      "org.h2.command.dml.ScriptBase",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.commons.AssertionError",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.hsqldb.rowio.RowOutputBase",
      "org.databene.commons.SyntaxError",
      "org.h2.value.Value",
      "org.h2.value.ValueDecimal",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.hsqldb.lib.FileUtil",
      "org.databene.commons.BeanUtil",
      "org.antlr.runtime.MismatchedTokenException",
      "org.apache.derby.iapi.sql.dictionary.PermDescriptor",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.h2.engine.SessionRemote",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.h2.constraint.Constraint",
      "org.antlr.runtime.Token",
      "org.apache.derby.iapi.sql.dictionary.TriggerDescriptor",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.databene.jdbacl.model.DBTrigger",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.apache.derby.iapi.services.daemon.DaemonService",
      "org.hsqldb.rowio.RowInputBase",
      "org.firebirdsql.jdbc.FBBlob",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.model.DBProcedure",
      "org.h2.util.IOUtils",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.GenerationClauseNode",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.apache.derby.impl.sql.catalog.DDdependableFinder",
      "org.apache.derby.impl.sql.catalog.DDColumnDependableFinder",
      "org.apache.derby.impl.sql.depend.BasicProviderInfo",
      "org.h2.value.ValueTimestamp",
      "org.h2.util.DateTimeUtils",
      "org.h2.util.StringUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.value.ValueLong",
      "org.h2.value.DataType",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.h2.expression.Comparison",
      "org.h2.value.ValueBoolean",
      "org.h2.value.ValueNull",
      "org.h2.expression.ValueExpression",
      "org.apache.derby.impl.sql.catalog.SYSSEQUENCESRowFactory",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.h2.value.CompareMode",
      "org.h2.engine.Session",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.util.SortedProperties",
      "org.h2.value.ValueFloat",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.h2.command.Parser",
      "org.h2.store.LobStorage",
      "org.h2.tools.CompressTool",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.apache.derby.iapi.types.XML",
      "org.h2.value.ValueBytes",
      "org.apache.derby.impl.store.raw.xact.XactFactory",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.h2.value.ValueTime",
      "org.apache.derby.impl.sql.execute.FKInfo",
      "org.apache.derby.catalog.types.MethodAliasInfo",
      "org.apache.derby.catalog.types.RoutineAliasInfo",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.apache.derby.impl.store.raw.xact.TransactionTable",
      "org.h2.value.ValueLob",
      "org.apache.derby.iapi.error.StandardException",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.databene.commons.NullSafeComparator"
    );
  }
}
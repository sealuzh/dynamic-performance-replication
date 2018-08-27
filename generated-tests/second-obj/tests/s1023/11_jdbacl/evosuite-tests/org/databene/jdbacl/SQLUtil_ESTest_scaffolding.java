/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 09:34:03 GMT 2018
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
      "org.apache.derby.iapi.services.locks.Limit",
      "org.databene.commons.CollectionUtil",
      "org.apache.derby.iapi.types.SQLLongint",
      "org.databene.script.Expression",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.h2.result.Row",
      "org.apache.derby.iapi.services.compiler.MethodBuilder",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.databene.jdbacl.model.DBRow",
      "org.apache.derby.catalog.TypeDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.apache.derby.impl.sql.execute.GenericConstantActionFactory",
      "org.apache.derby.iapi.store.raw.Page",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.services.property.PersistentSet",
      "org.apache.derby.iapi.sql.dictionary.PrivilegedSQLObject",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.h2.value.ValueNull",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.apache.derby.iapi.sql.compile.Visitor",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.h2.value.ValueShort",
      "org.apache.derby.iapi.store.raw.data.DataFactory",
      "org.h2.value.ValueDecimal",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.apache.derby.impl.store.raw.data.AllocPage",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.apache.derby.iapi.store.access.RowLocationRetRowSource",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.apache.derby.iapi.services.context.Context",
      "org.apache.derby.iapi.types.Orderable",
      "org.apache.derby.iapi.sql.compile.Optimizable",
      "org.apache.derby.impl.store.raw.xact.ConcurrentXactFactory",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.sql.compile.ExpressionClassBuilder",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.h2.engine.DbObjectBase",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.TableHolder",
      "org.antlr.runtime.CharStream",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.h2.value.Value",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.Converter",
      "org.apache.derby.iapi.sql.execute.NoPutResultSet",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.apache.derby.iapi.services.loader.ClassInspector",
      "org.apache.derby.iapi.store.raw.Loggable",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.iapi.sql.compile.ExpressionClassBuilderInterface",
      "org.antlr.runtime.Lexer",
      "org.apache.derby.iapi.store.access.conglomerate.Conglomerate",
      "org.antlr.runtime.MissingTokenException",
      "org.apache.derby.iapi.sql.compile.Visitable",
      "org.h2.value.CompareMode",
      "org.antlr.runtime.EarlyExitException",
      "org.apache.derby.iapi.error.StandardException",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.apache.derby.iapi.services.io.Storable",
      "org.h2.value.ValueString",
      "org.h2.value.ValueJavaObject",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.apache.derby.catalog.Dependable",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.antlr.runtime.Token",
      "org.apache.derby.impl.store.raw.data.StoredPage",
      "org.antlr.runtime.Parser",
      "org.databene.jdbacl.model.DBObject",
      "org.apache.derby.impl.store.access.btree.ControlRow",
      "org.apache.derby.impl.sql.execute.AnyResultSet",
      "org.h2.value.ValueInt",
      "org.hsqldb.lib.FileAccess",
      "org.apache.derby.impl.store.raw.data.BaseDataFileFactory",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.iapi.store.access.RowSource",
      "org.apache.derby.impl.sql.execute.NoPutResultSetImpl",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionContext",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.runtime.CommonTokenStream",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.h2.schema.SchemaObject",
      "org.h2.util.MathUtils$1",
      "org.apache.derby.iapi.store.raw.Corruptable",
      "org.databene.commons.depend.Dependent",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.jdbacl.model.DBColumn",
      "org.h2.value.ValueUuid",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.h2.table.FunctionTable",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.apache.derby.impl.store.raw.log.CheckpointOperation",
      "org.h2.value.ValueDate",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.apache.derby.vti.VTIEnvironment",
      "org.h2.table.Table",
      "org.h2.result.SearchRow",
      "org.databene.jdbacl.model.DBPackage",
      "org.h2.value.ValueFloat",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.apache.derby.io.StorageFile",
      "org.apache.derby.iapi.sql.dictionary.UniqueSQLObjectDescriptor",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.apache.derby.catalog.types.RowMultiSetImpl",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.apache.derby.iapi.store.raw.AuxObject",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.h2.value.ValueBoolean",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.antlr.runtime.DFA",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.engine.DbObject",
      "org.h2.value.ValueLong",
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.apache.derby.catalog.DependableFinder",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.h2.value.ValueStringIgnoreCase",
      "org.apache.derby.impl.sql.compile.ActivationClassBuilder",
      "org.apache.derby.io.WritableStorageFactory",
      "org.h2.message.DbException",
      "org.apache.derby.iapi.store.raw.RawStoreFactory",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.apache.derby.iapi.sql.execute.ConstantAction",
      "org.apache.derby.impl.store.access.btree.BranchControlRow",
      "org.apache.derby.impl.sql.compile.ConstantNode",
      "org.apache.derby.impl.store.access.btree.WaitError",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.apache.derby.impl.sql.execute.BasicNoPutResultSetImpl",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.apache.derby.catalog.types.UserDefinedTypeIdImpl",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.apache.derby.iapi.sql.compile.CompilerContext",
      "org.databene.commons.StringUtil",
      "org.h2.value.ValueBytes",
      "org.h2.value.ValueResultSet",
      "org.h2.value.ValueDouble",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.apache.derby.io.StorageRandomAccessFile",
      "org.h2.schema.SchemaObjectBase",
      "org.apache.derby.catalog.UUID",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.commons.Named",
      "org.apache.derby.io.StorageFactory",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.NameSpec",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptor",
      "org.apache.derby.impl.store.access.StorableFormatId",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.apache.derby.impl.sql.compile.ValueNode",
      "org.firebirdsql.gds.impl.GDSHelper$GDSHelperErrorListener",
      "org.databene.commons.Parser",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.apache.derby.iapi.sql.ResultSet",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.iapi.services.daemon.Serviceable",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.apache.derby.impl.store.raw.data.CachedPage",
      "org.antlr.runtime.tree.BaseTree",
      "org.apache.derby.impl.store.raw.xact.XactFactory",
      "org.databene.commons.ThreadAware",
      "org.databene.commons.version.VersionNumber",
      "org.apache.derby.iapi.sql.depend.DependencyManager",
      "org.apache.derby.iapi.sql.dictionary.ReferencedKeyConstraintDescriptor",
      "org.databene.jdbacl.model.DBIndex",
      "org.h2.table.Column",
      "org.databene.script.expression.ConstantExpression",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.antlr.runtime.BufferedTokenStream",
      "org.apache.derby.iapi.sql.dictionary.KeyConstraintDescriptor",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.apache.derby.catalog.types.MethodAliasInfo",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.h2.value.ValueArray",
      "org.apache.derby.iapi.store.raw.log.Logger",
      "org.h2.util.MathUtils",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.databene.commons.collection.ListBasedSet",
      "org.apache.derby.iapi.sql.dictionary.AliasDescriptor",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.apache.derby.iapi.services.monitor.ModuleSupportable",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.h2.value.ValueStringFixed",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.apache.derby.impl.store.raw.log.LogAccessFile",
      "org.h2.value.ValueTimestamp",
      "org.antlr.runtime.CommonToken",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.apache.derby.iapi.store.raw.log.LogScan",
      "org.apache.derby.iapi.services.cache.Cacheable",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.firebirdsql.jdbc.FirebirdConnectionProperties",
      "org.apache.derby.iapi.store.raw.log.LogInstant",
      "org.databene.commons.Capitalization",
      "org.apache.derby.iapi.services.cache.CacheableFactory",
      "org.apache.derby.iapi.store.raw.log.LogFactory",
      "org.databene.commons.version.VersionNumberParser",
      "org.apache.derby.iapi.types.NumberDataType",
      "org.antlr.runtime.RecognitionException",
      "org.h2.store.DataHandler",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.apache.derby.catalog.AliasInfo",
      "org.apache.derby.iapi.sql.depend.Dependent",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.sql.compile.TypeCompiler",
      "org.databene.commons.Patterns",
      "org.apache.derby.iapi.store.raw.xact.TransactionFactory",
      "org.apache.derby.impl.sql.compile.TableName",
      "org.apache.derby.iapi.store.raw.ScanHandle",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.databene.commons.NullSafeComparator",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ParseException",
      "org.antlr.runtime.TokenSource",
      "org.databene.commons.HeavyweightIterator",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.impl.store.raw.data.BasePage",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.h2.value.ValueByte",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.apache.derby.iapi.services.context.ContextManager",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.databene.commons.version.VersionNumberComponent",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.apache.derby.iapi.types.NumberDataValue",
      "org.databene.commons.ArrayFormat",
      "org.apache.derby.iapi.services.loader.ClassFactory",
      "org.apache.derby.iapi.store.access.DatabaseInstant",
      "org.antlr.runtime.ANTLRStringStream",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.databene.commons.SyntaxError",
      "org.antlr.runtime.IntStream",
      "org.firebirdsql.jdbc.FBTpbMapper",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.apache.derby.iapi.sql.execute.ExecutionFactory",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.databene.jdbacl.model.Database",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.apache.derby.impl.store.raw.log.LogCounter",
      "org.apache.derby.iapi.store.replication.master.MasterFactory",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.databene.commons.ObjectNotFoundException",
      "org.apache.derby.iapi.store.raw.FetchDescriptor",
      "org.apache.derby.iapi.services.daemon.DaemonService",
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
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.OrderedMap",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.commons.ObjectNotFoundException",
      "org.databene.commons.version.VersionNumber",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.databene.jdbacl.model.DBDataType",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.DBSequence",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBCheckConstraint",
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
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.h2.value.Value",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.value.ValueDecimal",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.hsqldb.lib.FileUtil",
      "org.antlr.runtime.Token",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.databene.commons.BeanUtil",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.databene.commons.NullSafeComparator",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.h2.value.CompareMode",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.apache.derby.iapi.types.SQLTime",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.AssertionError",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.h2.util.IOUtils",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.value.ValueLong",
      "org.databene.commons.SyntaxError",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.firebirdsql.gds.ISCConstants",
      "org.firebirdsql.jdbc.FBConnectionHelper",
      "org.firebirdsql.jdbc.FBDriverPropertyManager",
      "org.h2.util.StringUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.h2.table.Table",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.databene.jdbacl.model.DBPackage",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.BinaryOperatorNode",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.model.DBProcedure",
      "org.firebirdsql.jdbc.FBBlob",
      "org.antlr.runtime.MismatchedTokenException",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.h2.command.dml.TransactionCommand",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.databene.commons.ConfigurationError",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.apache.derby.catalog.types.MethodAliasInfo",
      "org.apache.derby.catalog.types.RoutineAliasInfo",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.sql.compile.UpdateNode",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.apache.derby.impl.store.access.btree.ControlRow",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.store.FileLock",
      "org.h2.util.SortedProperties",
      "org.h2.engine.Session",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.apache.derby.iapi.sql.dictionary.PermDescriptor",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.apache.derby.iapi.error.StandardException",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputTextLog",
      "org.h2.command.dml.ScriptBase",
      "org.h2.value.ValueNull",
      "org.h2.constraint.Constraint",
      "org.h2.constraint.ConstraintReferential",
      "org.apache.derby.impl.sql.catalog.SYSSEQUENCESRowFactory",
      "org.apache.derby.iapi.services.info.JVMInfo",
      "org.apache.derby.impl.services.monitor.BaseMonitor",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.apache.derby.iapi.services.io.FileUtil",
      "org.apache.derby.impl.store.raw.data.BasePage",
      "org.apache.derby.impl.store.raw.data.CachedPage",
      "org.apache.derby.impl.store.raw.data.StoredPage",
      "org.apache.derby.impl.store.raw.data.AllocPage",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.h2.expression.ExpressionVisitor",
      "org.h2.engine.SessionRemote",
      "org.h2.store.LobStorage",
      "org.h2.tools.CompressTool",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream"
    );
  }
}
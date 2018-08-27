/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 00:53:40 GMT 2018
 */

package org.databene.jdbacl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SQLUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.apache.derby.iapi.store.access.TransactionController",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.h2.index.BaseIndex",
      "org.apache.derby.impl.store.access.btree.BTreeRowPosition",
      "org.databene.commons.CollectionUtil",
      "org.apache.derby.iapi.types.RowLocation",
      "org.databene.script.Expression",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.h2.result.Row",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.databene.jdbacl.model.DBRow",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.lib.HsqlList",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.apache.derby.iapi.store.raw.Page",
      "org.apache.derby.iapi.services.property.PersistentSet",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.h2.value.ValueNull",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.apache.derby.impl.store.access.btree.BTreeLockingPolicy",
      "org.apache.derby.iapi.store.raw.data.DataFactory",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.apache.derby.impl.store.raw.data.AllocPage",
      "org.hsqldb.lib.Collection",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.apache.derby.iapi.store.access.RowLocationRetRowSource",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.apache.derby.iapi.types.Orderable",
      "org.databene.commons.NameUtil",
      "org.h2.util.SmallLRUCache",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.apache.derby.iapi.store.access.conglomerate.TransactionManager",
      "org.h2.engine.DbObjectBase",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.TableHolder",
      "org.antlr.runtime.CharStream",
      "org.h2.value.Value",
      "org.hsqldb.resources.BundleHandler",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.apache.derby.impl.store.access.btree.LeafControlRow",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptor",
      "org.apache.derby.iapi.store.access.conglomerate.LogicalUndo",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.apache.derby.iapi.store.raw.Loggable",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.impl.store.access.btree.OpenBTree",
      "org.apache.derby.impl.sql.compile.Level2OptimizerImpl",
      "org.antlr.runtime.Lexer",
      "org.apache.derby.iapi.store.access.conglomerate.Conglomerate",
      "org.apache.derby.impl.store.access.conglomerate.RowPosition",
      "org.antlr.runtime.MissingTokenException",
      "org.h2.value.CompareMode",
      "org.antlr.runtime.EarlyExitException",
      "org.databene.script.expression.WrapperExpression",
      "org.apache.derby.iapi.error.StandardException",
      "org.hsqldb.lib.HsqlByteArrayInputStream",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.value.ValueString",
      "org.apache.derby.iapi.services.io.Storable",
      "org.hsqldb.lib.Iterator",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.apache.derby.catalog.Dependable",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.antlr.runtime.Token",
      "org.apache.derby.impl.store.raw.data.StoredPage",
      "org.antlr.runtime.Parser",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBObject",
      "org.apache.derby.impl.store.access.btree.ControlRow",
      "org.databene.commons.AssertionError",
      "org.h2.util.New",
      "org.hsqldb.lib.FileAccess",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.h2.util.StringUtils",
      "org.hsqldb.rowio.RowInputText",
      "org.hsqldb.DatabaseURL",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.apache.derby.iapi.store.access.RowSource",
      "org.hsqldb.rowio.RowInputInterface",
      "org.apache.derby.iapi.sql.compile.Optimizer",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.runtime.CommonTokenStream",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.h2.schema.SchemaObject",
      "org.h2.util.MathUtils$1",
      "org.hsqldb.store.HashIndex",
      "org.apache.derby.iapi.store.raw.Corruptable",
      "org.databene.commons.depend.Dependent",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.h2.table.FunctionTable",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.apache.derby.impl.store.raw.log.CheckpointOperation",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.apache.derby.iapi.store.raw.ContainerHandle",
      "org.hsqldb.rowio.RowInputBase",
      "org.h2.table.Table",
      "org.h2.result.SearchRow",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.apache.derby.io.StorageFile",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.apache.derby.iapi.store.raw.AuxObject",
      "org.h2.message.TraceObject",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.apache.derby.iapi.store.access.ConglomPropertyQueryable",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.antlr.runtime.DFA",
      "org.h2.engine.DbObject",
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.apache.derby.catalog.DependableFinder",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.apache.derby.io.WritableStorageFactory",
      "org.apache.derby.iapi.store.access.DynamicCompiledOpenConglomInfo",
      "org.h2.message.DbException",
      "org.apache.derby.iapi.store.raw.RawStoreFactory",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.apache.derby.impl.store.access.btree.WaitError",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.apache.derby.catalog.types.UserDefinedTypeIdImpl",
      "org.h2.jdbcx.JdbcDataSource",
      "org.hsqldb.lib.Set",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.StringUtil",
      "org.h2.table.MetaTable",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.databene.script.expression.MultiplicationExpression",
      "org.apache.derby.iapi.store.access.ConglomerateController",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.apache.derby.io.StorageRandomAccessFile",
      "org.apache.derby.catalog.UUID",
      "org.h2.schema.SchemaObjectBase",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.commons.Named",
      "org.apache.derby.io.StorageFactory",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.NameSpec",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.databene.commons.Parser",
      "org.hsqldb.persist.HsqlProperties",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.iapi.services.daemon.Serviceable",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.apache.derby.impl.store.raw.data.CachedPage",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.antlr.runtime.tree.BaseTree",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.h2.message.TraceWriter",
      "org.hsqldb.SessionInterface",
      "org.databene.commons.ThreadAware",
      "org.databene.commons.version.VersionNumber",
      "org.apache.derby.iapi.sql.dictionary.ReferencedKeyConstraintDescriptor",
      "org.databene.jdbacl.model.DBIndex",
      "org.h2.table.Column",
      "org.databene.script.expression.ConstantExpression",
      "org.apache.derby.impl.store.access.conglomerate.OpenConglomerateScratchSpace",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.antlr.runtime.BufferedTokenStream",
      "org.h2.engine.Mode",
      "org.apache.derby.iapi.sql.dictionary.KeyConstraintDescriptor",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.h2.index.MetaIndex",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.hsqldb.store.BaseHashMap",
      "org.apache.derby.iapi.store.raw.log.Logger",
      "org.h2.util.MathUtils",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.antlr.runtime.tree.TreeNodeStream",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.apache.derby.iapi.services.monitor.ModuleSupportable",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.apache.derby.impl.store.raw.log.LogAccessFile",
      "org.apache.derby.impl.sql.compile.OptimizerImpl",
      "org.antlr.runtime.CommonToken",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.hsqldb.jdbc.Util",
      "org.apache.derby.iapi.store.raw.log.LogScan",
      "org.hsqldb.lib.HashMap",
      "org.apache.derby.iapi.services.cache.Cacheable",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.firebirdsql.jdbc.FirebirdConnectionProperties",
      "org.apache.derby.iapi.store.raw.log.LogInstant",
      "org.h2.index.Index",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.store.raw.log.LogFactory",
      "org.databene.commons.version.VersionNumberParser",
      "org.antlr.runtime.RecognitionException",
      "org.h2.jdbc.JdbcConnection",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.apache.derby.iapi.sql.depend.Dependent",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.databene.commons.Patterns",
      "org.databene.commons.ArrayUtil",
      "org.apache.derby.iapi.store.raw.ScanHandle",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.databene.commons.NullSafeComparator",
      "org.databene.commons.ParseException",
      "org.antlr.runtime.TokenSource",
      "org.databene.commons.HeavyweightIterator",
      "org.h2.Driver",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.hsqldb.lib.HsqlArrayList",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.apache.derby.impl.store.raw.data.BasePage",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.hsqldb.HsqlException",
      "org.apache.derby.iapi.store.access.StaticCompiledOpenConglomInfo",
      "org.hsqldb.Trace",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.databene.commons.version.VersionNumberComponent",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.commons.ArrayFormat",
      "org.hsqldb.lib.BaseList",
      "org.apache.derby.iapi.store.access.DatabaseInstant",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.commons.SyntaxError",
      "org.hsqldb.Result",
      "org.antlr.runtime.IntStream",
      "org.firebirdsql.jdbc.FBTpbMapper",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.databene.jdbacl.model.Database",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.apache.derby.impl.store.raw.log.LogCounter",
      "org.h2.message.TraceSystem",
      "org.apache.derby.iapi.store.replication.master.MasterFactory",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.apache.derby.iapi.store.access.SpaceInfo",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.databene.script.expression.CompositeExpression",
      "org.hsqldb.Session",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.databene.commons.ObjectNotFoundException",
      "org.apache.derby.iapi.services.daemon.DaemonService",
      "org.antlr.runtime.BaseRecognizer",
      "org.databene.jdbacl.model.DBSchema",
      "org.firebirdsql.jdbc.FBClob"
    );
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
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DBDataType",
      "org.h2.value.Value",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.value.ValueDecimal",
      "org.databene.jdbacl.model.DBSchema",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.commons.ObjectNotFoundException",
      "org.databene.jdbacl.model.DBSequence",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.hsqldb.lib.FileUtil",
      "org.databene.jdbacl.model.TableContainer",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.h2.message.TraceObject",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.commons.version.VersionNumber",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.Driver",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.model.DBProcedure",
      "org.h2.table.Table",
      "org.h2.table.RangeTable",
      "org.databene.commons.BeanUtil",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.h2.util.StringUtils",
      "org.h2.engine.Mode",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.antlr.runtime.BaseRecognizer",
      "org.antlr.runtime.DFA",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.antlr.runtime.CommonToken",
      "org.databene.commons.ParseException",
      "org.databene.commons.SyntaxError",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.NoViableAltException",
      "org.h2.value.ValueTimestamp",
      "org.h2.util.DateTimeUtils",
      "org.h2.util.IOUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.databene.commons.AssertionError",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.databene.jdbacl.model.DBTrigger",
      "org.apache.derby.impl.sql.execute.rts.RealBasicNoPutResultSetStatistics",
      "org.firebirdsql.jdbc.FBBlob",
      "org.firebirdsql.gds.ISCConstants",
      "org.firebirdsql.jdbc.FBConnectionHelper",
      "org.firebirdsql.jdbc.FBDriverPropertyManager",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.databene.commons.NullSafeComparator",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.antlr.runtime.Token",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.antlr.runtime.MismatchedTokenException",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.apache.derby.iapi.error.StandardException",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.h2.engine.Database",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.value.CompareMode",
      "org.h2.store.FileLock",
      "org.h2.util.SortedProperties",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.apache.derby.iapi.types.NumberDataType",
      "org.apache.derby.iapi.types.BinaryDecimal",
      "org.apache.derby.iapi.types.BigIntegerDecimal",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.apache.derby.impl.store.raw.data.BasePage",
      "org.apache.derby.impl.store.raw.data.CachedPage",
      "org.apache.derby.impl.store.raw.data.StoredPage",
      "org.apache.derby.impl.store.raw.data.AllocPage",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.h2.table.MetaTable",
      "org.apache.derby.impl.sql.compile.TableElementNode",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.h2.constraint.Constraint",
      "org.h2.engine.Session",
      "org.h2.value.ValueLong",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.h2.engine.SessionRemote",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.h2.value.ValueNull",
      "org.databene.commons.ConfigurationError",
      "org.apache.derby.impl.store.raw.log.LogCounter",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.hsqldb.rowio.RowInputBase",
      "org.apache.derby.iapi.util.ReuseFactory",
      "org.hsqldb.rowio.RowInputTextQuoted",
      "org.apache.derby.iapi.services.daemon.DaemonService",
      "org.apache.derby.iapi.sql.dictionary.TriggerDescriptor",
      "org.apache.derby.iapi.error.ShutdownException"
    );
  }
}

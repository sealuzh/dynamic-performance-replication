/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 17:42:59 GMT 2018
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
public class DBUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.databene.jdbacl.DBUtil"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DBUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.h2.store.LobStorage",
      "org.h2.tools.Recover$1",
      "org.apache.derby.iapi.sql.compile.OptimizableList",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.h2.engine.SessionInterface",
      "org.postgresql.jdbc3.AbstractJdbc3Connection",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.databene.commons.CollectionUtil",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.h2.expression.Condition",
      "org.postgresql.core.BaseConnection",
      "org.apache.derby.iapi.services.compiler.MethodBuilder",
      "org.databene.jdbacl.model.DBRow",
      "org.apache.derby.impl.sql.compile.UnaryComparisonOperatorNode",
      "org.apache.derby.impl.sql.execute.GenericConstantActionFactory",
      "org.apache.derby.impl.sql.compile.BinaryOperatorNode",
      "org.databene.jdbacl.model.DBMetaDataImporter",
      "org.h2.util.AutoCloseInputStream",
      "org.h2.command.CommandInterface",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.services.property.PersistentSet",
      "org.apache.derby.iapi.sql.dictionary.PrivilegedSQLObject",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.apache.derby.impl.sql.compile.FromList",
      "org.h2.value.ValueNull",
      "org.databene.commons.ConnectFailedException",
      "org.databene.jdbacl.JDBCConnectData",
      "org.apache.derby.iapi.sql.compile.Visitor",
      "org.h2.expression.Function",
      "org.h2.store.Data",
      "org.databene.commons.depend.DependencyModel",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.databene.jdbacl.proxy.PooledConnectionHandler",
      "org.databene.commons.ConfigurationError",
      "org.apache.derby.impl.sql.compile.ResultColumn",
      "org.apache.derby.iapi.sql.compile.OptimizablePredicateList",
      "org.h2.store.FileStoreInputStream",
      "org.apache.derby.iapi.services.context.Context",
      "org.databene.commons.converter.ArrayConverter",
      "org.apache.derby.iapi.sql.compile.Optimizable",
      "org.apache.derby.iapi.types.Orderable",
      "org.h2.util.SmallLRUCache",
      "org.h2.tools.SimpleRowSource",
      "org.apache.derby.impl.sql.compile.LikeEscapeOperatorNode",
      "org.apache.derby.impl.sql.compile.ExpressionClassBuilder",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.apache.derby.impl.sql.compile.QueryTreeNodeVector",
      "org.databene.jdbacl.model.TableHolder",
      "org.h2.value.Value",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.debug.ResourceMonitor",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.iapi.sql.compile.ExpressionClassBuilderInterface",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.h2.expression.Expression",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter$TableNameFilter",
      "org.apache.derby.iapi.sql.compile.Visitable",
      "org.apache.derby.iapi.sql.ResultColumnDescriptor",
      "org.apache.derby.iapi.error.StandardException",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.h2.value.ValueString",
      "org.apache.derby.iapi.services.io.Storable",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.apache.derby.catalog.Dependable",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.apache.derby.impl.sql.compile.PredicateList",
      "org.h2.engine.SessionWithState",
      "org.apache.derby.impl.sql.compile.IsNullNode",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBObject",
      "org.databene.commons.AssertionError",
      "org.databene.jdbacl.DBExecutionResult",
      "org.h2.util.New",
      "org.databene.commons.SystemInfo",
      "org.h2.value.ValueInt",
      "org.hsqldb.lib.FileAccess",
      "org.firebirdsql.gds.IscTrHandle",
      "org.databene.commons.IOUtil$1",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.h2.util.Tool",
      "org.apache.derby.impl.sql.compile.UnaryOperatorNode",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.iapi.types.DataValueFactory",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionContext",
      "org.databene.commons.OrderedSet",
      "org.h2.util.MathUtils$1",
      "org.h2.store.FileStore",
      "org.databene.commons.depend.Dependent",
      "org.h2.engine.SessionRemote",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.commons.IOUtil",
      "org.h2.value.ValueUuid",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.commons.BeanUtil",
      "org.firebirdsql.gds.impl.jni.isc_tr_handle_impl",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.databene.jdbacl.proxy.LoggingResultSetHandler",
      "org.h2.value.ValueDate",
      "org.databene.commons.ProgrammerError",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.h2.result.SearchRow",
      "org.apache.derby.impl.sql.compile.BinaryComparisonOperatorNode",
      "org.databene.jdbacl.model.DBPackage",
      "org.apache.derby.iapi.store.access.StoreCostResult",
      "org.h2.value.Transfer",
      "org.apache.derby.iapi.sql.dictionary.UniqueSQLObjectDescriptor",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.apache.derby.impl.sql.compile.BinaryLogicalOperatorNode",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.h2.message.TraceObject",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptor",
      "org.h2.value.ValueBoolean",
      "org.h2.expression.ValueExpression",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.value.ValueLong",
      "org.databene.commons.converter.FormatHolder",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.apache.derby.catalog.IndexDescriptor",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.apache.derby.impl.sql.compile.ActivationClassBuilder",
      "org.h2.message.DbException",
      "org.apache.derby.iapi.sql.execute.ConstantAction",
      "org.h2.table.ColumnResolver",
      "org.databene.commons.converter.MultiConverterWrapper",
      "org.apache.derby.impl.sql.compile.ConstantNode",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.h2.engine.Database",
      "org.h2.jdbcx.JdbcDataSource",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.LoggerEscalator",
      "org.apache.derby.iapi.sql.compile.CompilerContext",
      "org.databene.commons.StringUtil",
      "org.h2.value.ValueBytes",
      "org.h2.value.ValueResultSet",
      "org.apache.derby.impl.sql.compile.AndNode",
      "org.h2.value.ValueDouble",
      "org.databene.jdbacl.proxy.LoggingPreparedStatementHandler",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.commons.Named",
      "org.databene.jdbacl.ResultsWithMetadata",
      "org.databene.commons.ReaderLineIterator",
      "org.apache.derby.impl.sql.compile.ValueNode",
      "org.apache.derby.iapi.sql.depend.ProviderList",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.firebirdsql.jdbc.FBArray",
      "org.databene.commons.Filter",
      "org.h2.message.TraceWriter",
      "org.h2.tools.SimpleResultSet",
      "org.databene.commons.ThreadAware",
      "org.apache.derby.iapi.sql.depend.DependencyManager",
      "org.apache.derby.iapi.util.JBitSet",
      "org.databene.jdbacl.model.DBIndex",
      "org.apache.derby.impl.sql.compile.GenerationClauseNode",
      "org.h2.expression.Comparison",
      "org.h2.expression.FunctionCall",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.h2.expression.TableFunction",
      "org.h2.util.TempFileDeleter",
      "org.h2.util.MathUtils",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.databene.commons.collection.ListBasedSet",
      "org.apache.derby.iapi.sql.dictionary.AliasDescriptor",
      "org.databene.jdbacl.model.DBTrigger",
      "org.h2.tools.Recover",
      "org.postgresql.PGConnection",
      "org.postgresql.jdbc4.AbstractJdbc4Connection",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.databene.commons.debug.Debug",
      "org.h2.value.ValueTimestamp",
      "org.h2.value.Value$ValueBlob",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.apache.derby.impl.sql.compile.SubqueryList",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.databene.commons.ErrorHandler",
      "org.h2.store.DataHandler",
      "org.apache.derby.impl.sql.compile.RelationalOperator",
      "org.apache.derby.iapi.sql.depend.Dependent",
      "org.databene.commons.BeanUtil$PrimitiveTypeMapping",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.sql.compile.TypeCompiler",
      "org.databene.commons.Patterns",
      "org.databene.commons.ArrayUtil",
      "org.apache.derby.impl.sql.compile.TableName",
      "org.databene.commons.ImportFailedException",
      "org.databene.commons.Escalator",
      "org.databene.commons.HeavyweightIterator",
      "org.apache.derby.impl.sql.compile.BinaryRelationalOperatorNode",
      "org.h2.Driver",
      "org.databene.jdbacl.DBUtil",
      "org.databene.commons.depend.CyclicDependencyException",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.impl.sql.compile.ResultColumnList",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.apache.derby.iapi.services.context.ContextManager",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.databene.commons.collection.OrderedNameMap",
      "org.h2.engine.SessionFactory",
      "org.apache.derby.iapi.services.loader.ClassFactory",
      "org.databene.commons.ExceptionMapper",
      "org.apache.derby.iapi.sql.execute.ExecutionFactory",
      "org.databene.commons.OrderedMap",
      "org.h2.expression.ConditionIn",
      "org.databene.jdbacl.model.Database",
      "org.h2.value.Value$ValueClob",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.apache.derby.impl.sql.compile.BooleanConstantNode",
      "org.h2.message.TraceSystem",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.proxy.LoggingStatementHandler",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.apache.derby.iapi.sql.compile.AccessPath",
      "org.h2.expression.FunctionInfo",
      "org.h2.tools.Recover$PageInputStream",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.h2.jdbc.JdbcSQLException",
      "org.h2.engine.ConnectionInfo",
      "org.databene.commons.ObjectNotFoundException",
      "org.postgresql.jdbc3g.AbstractJdbc3gConnection",
      "org.databene.commons.Level",
      "org.h2.value.ValueTime",
      "org.databene.jdbacl.model.DBSchema",
      "org.postgresql.jdbc4.Jdbc4Connection",
      "org.apache.derby.impl.sql.compile.TernaryOperatorNode"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DBUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.databene.jdbacl.DBUtil",
      "org.databene.commons.IOUtil",
      "org.databene.commons.StringUtil",
      "org.databene.commons.BeanUtil",
      "org.databene.commons.debug.Debug",
      "org.databene.jdbacl.proxy.PooledConnectionHandler",
      "org.databene.commons.Capitalization",
      "org.databene.commons.converter.ToStringConverter",
      "org.databene.jdbacl.proxy.LoggingPreparedStatementHandler",
      "org.databene.jdbacl.proxy.LoggingResultSetHandler",
      "org.databene.jdbacl.proxy.LoggingStatementHandler",
      "org.databene.commons.CollectionUtil",
      "org.databene.jdbacl.SQLUtil",
      "org.databene.commons.converter.AnyConverter",
      "org.databene.commons.converter.ConverterManager",
      "org.databene.commons.ArrayFormat",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.databene.commons.SystemInfo",
      "org.databene.commons.ConfigurationError",
      "org.postgresql.Driver",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.databene.commons.ConnectFailedException",
      "org.h2.command.dml.ScriptBase",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.h2.util.StringUtils",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.h2.util.IOUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.hsqldb.lib.ArrayUtil",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.databene.commons.OrderedMap",
      "org.h2.engine.SessionRemote",
      "org.h2.value.CompareMode",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.model.TableContainer",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.databene.commons.ErrorHandler",
      "org.h2.engine.Session",
      "org.h2.value.Value",
      "org.h2.value.ValueLong",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.GenerationClauseNode",
      "org.hsqldb.jdbcDriver",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.databene.commons.ErrorHandler$1",
      "org.apache.derby.iapi.sql.dictionary.IndexRowGenerator",
      "org.apache.derby.catalog.types.IndexDescriptorImpl",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.sql.dictionary.FileInfoDescriptor",
      "org.apache.derby.impl.sql.catalog.DDdependableFinder",
      "org.apache.derby.impl.sql.execute.rts.RealBasicNoPutResultSetStatistics",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.databene.jdbacl.model.DBDataType",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.apache.derby.impl.sql.compile.TableElementNode",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.databene.commons.version.VersionNumber",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ObjectNotFoundException",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.util.SortedProperties",
      "org.h2.value.Transfer",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.h2.store.LobStorage",
      "org.h2.tools.CompressTool",
      "org.h2.store.FileStore",
      "org.hsqldb.Table",
      "org.h2.command.Parser",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.h2.value.ValueDecimal",
      "org.apache.derby.impl.sql.compile.ColumnDefinitionNode",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.antlr.runtime.BaseRecognizer",
      "org.antlr.runtime.DFA",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.commons.ParseException",
      "org.firebirdsql.jdbc.FBBlob",
      "org.apache.derby.impl.sql.execute.ColumnInfo",
      "org.h2.expression.Comparison",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.apache.derby.impl.sql.execute.WriteCursorConstantAction",
      "org.apache.derby.impl.sql.execute.DeleteConstantAction",
      "org.apache.derby.iapi.error.StandardException",
      "org.databene.commons.condition.ComparationCondition",
      "org.apache.derby.iapi.sql.dictionary.ViewDescriptor",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.h2.store.fs.FileSystemMemory",
      "org.h2.store.fs.FileSystemZip",
      "org.h2.store.fs.FileSystemSplit",
      "org.h2.store.fs.FileSystemDiskNio",
      "org.h2.store.fs.FileSystemDiskNioMapped",
      "org.antlr.runtime.CommonToken",
      "org.antlr.runtime.NoViableAltException",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.h2.expression.Function",
      "org.apache.derby.impl.store.raw.log.LogCounter",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptor",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.apache.derby.impl.sql.compile.SubqueryNode",
      "org.databene.commons.NullSafeComparator",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.databene.jdbacl.model.DBSequence",
      "org.databene.commons.depend.DependencyModel",
      "org.apache.derby.impl.sql.GenericStorablePreparedStatement",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.h2.util.NetUtils",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.commons.AssertionError"
    );
  }
}
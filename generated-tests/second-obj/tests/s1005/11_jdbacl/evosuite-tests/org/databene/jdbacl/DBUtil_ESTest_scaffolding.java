/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 19:09:57 GMT 2018
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
      "org.h2.tools.Recover$1",
      "org.apache.derby.iapi.sql.compile.OptimizableList",
      "org.h2.engine.SessionInterface",
      "org.databene.commons.Mutator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$MetaDataTransactionCoordinator",
      "org.apache.derby.iapi.types.RowLocation",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.databene.jdbacl.model.DBRow",
      "org.apache.derby.impl.sql.execute.GenericConstantActionFactory",
      "org.apache.derby.impl.sql.GenericStatement",
      "org.databene.jdbacl.model.DBMetaDataImporter",
      "org.h2.command.CommandInterface",
      "org.apache.derby.iapi.services.property.PersistentSet",
      "org.apache.derby.iapi.sql.dictionary.IndexRowGenerator",
      "org.apache.derby.iapi.sql.dictionary.PrivilegedSQLObject",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.h2.value.ValueNull",
      "org.apache.derby.iapi.sql.compile.Visitor",
      "org.apache.derby.impl.store.access.btree.BTreeLockingPolicy",
      "org.apache.derby.impl.sql.compile.CompilerContextImpl",
      "org.apache.derby.iapi.error.StandardException$BadMessageArgumentException",
      "org.databene.commons.depend.DependencyModel",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.databene.commons.ConfigurationError",
      "org.apache.derby.impl.sql.compile.ResultColumn",
      "org.firebirdsql.gds.impl.wire.Xdrable",
      "org.h2.store.FileStoreInputStream",
      "org.apache.derby.iapi.services.context.Context",
      "org.databene.commons.converter.ArrayConverter",
      "org.firebirdsql.gds.IscBlobHandle",
      "org.apache.derby.iapi.types.Orderable",
      "org.apache.derby.impl.db.BasicDatabase",
      "org.h2.util.SmallLRUCache",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.h2.tools.SimpleRowSource",
      "org.apache.derby.impl.store.raw.xact.ConcurrentXactFactory",
      "org.h2.engine.DbObjectBase",
      "org.h2.store.fs.FileSystem",
      "org.databene.jdbacl.model.TableHolder",
      "org.apache.derby.impl.sql.compile.NormalizeResultSetNode",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.impl.store.access.btree.LeafControlRow",
      "org.apache.derby.impl.store.raw.log.ReadOnly",
      "org.firebirdsql.jdbc.FirebirdBlob",
      "org.databene.jdbacl.model.TableContainer",
      "org.apache.derby.iapi.store.access.conglomerate.LogicalUndo",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.debug.ResourceMonitor",
      "org.apache.derby.iapi.services.loader.ClassInspector",
      "org.firebirdsql.gds.BlobParameterBuffer",
      "org.apache.derby.iapi.store.raw.Loggable",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.impl.sql.compile.InsertNode",
      "org.apache.derby.iapi.services.i18n.MessageService",
      "org.apache.derby.impl.store.access.btree.OpenBTree",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.apache.derby.iapi.sql.compile.Visitable",
      "org.apache.derby.impl.sql.compile.TestConstraintNode",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.apache.derby.iapi.util.ByteArray",
      "org.apache.derby.iapi.error.StandardException",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.h2.value.ValueString",
      "org.apache.derby.iapi.services.loader.GeneratedClass",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.h2.schema.Schema",
      "org.apache.derby.iapi.store.raw.GlobalTransactionId",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$LocalTransactionCoordinator",
      "org.firebirdsql.gds.impl.wire.XdrInputStream",
      "org.databene.jdbacl.model.DBObject",
      "org.h2.util.New",
      "org.firebirdsql.gds.IscSvcHandle",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AutoCommitCoordinator",
      "org.apache.derby.iapi.store.replication.slave.SlaveFactory",
      "org.hsqldb.lib.FileAccess",
      "org.firebirdsql.gds.EventHandle",
      "org.firebirdsql.gds.IscTrHandle",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.apache.derby.impl.sql.compile.DMLModStatementNode",
      "org.h2.util.Tool",
      "org.apache.derby.impl.sql.compile.UnaryOperatorNode",
      "org.firebirdsql.gds.ServiceParameterBuffer",
      "org.apache.derby.iapi.util.StringUtil",
      "org.databene.commons.OrderedSet",
      "org.h2.util.MathUtils$1",
      "org.h2.store.FileStore",
      "org.apache.derby.iapi.store.raw.Corruptable",
      "org.firebirdsql.gds.GDSException",
      "org.databene.commons.IOUtil",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.commons.BeanUtil",
      "org.databene.commons.ProgrammerError",
      "org.apache.derby.impl.sql.GenericLanguageFactory",
      "org.h2.result.SearchRow",
      "org.h2.value.ValueFloat",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionContext",
      "org.apache.derby.io.StorageFile",
      "org.apache.derby.iapi.sql.dictionary.UniqueSQLObjectDescriptor",
      "org.apache.derby.impl.store.raw.xact.ConcurrentTransactionMapFactory",
      "org.apache.derby.iapi.store.raw.AuxObject",
      "org.apache.derby.iapi.db.TriggerExecutionContext",
      "org.h2.value.ValueBoolean",
      "org.apache.derby.iapi.util.DoubleProperties",
      "org.h2.value.ValueLong",
      "org.databene.commons.converter.FormatHolder",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.firebirdsql.encodings.Encoding",
      "org.apache.derby.catalog.IndexDescriptor",
      "org.firebirdsql.gds.impl.wire.EventCoordinator",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.hsqldb.jdbcDriver",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.h2.value.ValueStringIgnoreCase",
      "org.apache.derby.diag.ErrorMessages",
      "org.apache.derby.impl.sql.compile.ActivationClassBuilder",
      "org.apache.derby.iapi.store.access.DynamicCompiledOpenConglomInfo",
      "org.h2.message.DbException",
      "org.h2.compress.LZFInputStream",
      "org.databene.commons.bean.TypedPropertyMutator",
      "org.apache.derby.impl.store.access.btree.WaitError",
      "org.firebirdsql.gds.ServiceRequestBuffer",
      "org.apache.derby.catalog.types.UserDefinedTypeIdImpl",
      "org.h2.value.ValueBytes",
      "org.databene.jdbacl.proxy.LoggingPreparedStatementHandler",
      "org.apache.derby.iapi.store.access.ConglomerateController",
      "org.databene.commons.ReaderLineIterator",
      "org.apache.derby.impl.sql.compile.ValueNode",
      "org.firebirdsql.gds.impl.GDSHelper$GDSHelperErrorListener",
      "org.databene.commons.Parser",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.firebirdsql.gds.IscDbHandle",
      "org.databene.commons.ThreadAware",
      "org.databene.commons.version.VersionNumber",
      "org.apache.derby.impl.store.access.conglomerate.OpenConglomerateScratchSpace",
      "org.databene.commons.mutator.NamedMutator",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.apache.derby.iapi.sql.compile.Parser",
      "org.apache.derby.iapi.db.Database",
      "org.h2.util.MathUtils",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.databene.commons.collection.ListBasedSet",
      "org.apache.derby.iapi.services.locks.LockFactory",
      "org.apache.derby.iapi.services.monitor.ModuleSupportable",
      "org.databene.commons.debug.Debug",
      "org.apache.derby.impl.sql.execute.TriggerInfo",
      "org.h2.store.FileLister",
      "org.h2.value.ValueTimestamp",
      "org.h2.value.Value$ValueBlob",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.apache.derby.iapi.store.raw.log.LogScan",
      "org.apache.derby.iapi.services.cache.Cacheable",
      "org.h2.compress.Compressor",
      "org.databene.commons.Capitalization",
      "org.firebirdsql.logging.Logger",
      "org.apache.derby.iapi.store.raw.log.LogFactory",
      "org.databene.commons.version.VersionNumberParser",
      "org.apache.derby.iapi.sql.PreparedStatement",
      "org.firebirdsql.gds.XSQLVAR",
      "org.h2.store.DataHandler",
      "org.apache.derby.iapi.store.raw.xact.TransactionId",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.impl.sql.execute.FKInfo",
      "org.databene.commons.Patterns",
      "org.databene.commons.ArrayUtil",
      "org.apache.derby.iapi.store.raw.xact.TransactionFactory",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.apache.derby.impl.sql.compile.TableName",
      "org.databene.commons.ParseException",
      "org.databene.jdbacl.DBUtil",
      "org.apache.derby.database.Database",
      "org.apache.derby.iapi.store.access.DatabaseInstant",
      "org.databene.commons.OrderedMap",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.h2.value.Value$ValueClob",
      "org.apache.derby.iapi.services.context.ContextImpl",
      "org.databene.jdbacl.model.DBCatalog",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.databene.commons.comparator.IntComparator",
      "org.apache.derby.impl.store.raw.log.LogCounter",
      "org.apache.derby.iapi.store.replication.master.MasterFactory",
      "org.databene.jdbacl.proxy.LoggingStatementHandler",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.h2.tools.CompressTool",
      "org.apache.derby.iapi.sql.ResultDescription",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.h2.jdbc.JdbcSQLException",
      "org.h2.engine.ConnectionInfo",
      "org.databene.commons.ObjectNotFoundException",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.apache.derby.iapi.services.daemon.DaemonService",
      "org.databene.jdbacl.model.DBSchema",
      "org.h2.value.ValueTime",
      "org.h2.store.LobStorage",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.h2.store.fs.FileSystemMemory",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.apache.derby.iapi.store.access.TransactionController",
      "org.firebirdsql.jdbc.FBObjectListener$BlobListener",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.apache.derby.impl.store.access.btree.BTreeRowPosition",
      "org.databene.commons.CollectionUtil",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.apache.derby.iapi.store.access.TransactionInfo",
      "org.apache.derby.iapi.services.compiler.MethodBuilder",
      "org.apache.derby.iapi.sql.LanguageFactory",
      "org.apache.derby.iapi.sql.execute.CursorActivation",
      "org.apache.derby.iapi.services.crypto.CipherFactory",
      "org.apache.derby.iapi.sql.compile.OptimizerFactory",
      "org.apache.derby.iapi.sql.execute.ExecutionStmtValidator",
      "org.apache.derby.catalog.TypeDescriptor",
      "org.h2.store.LobStorage$LobInputStream",
      "org.apache.derby.impl.sql.compile.SingleChildResultSetNode",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.vti.VTICosting",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.apache.derby.impl.sql.compile.FromList",
      "org.databene.commons.bean.AbstractNamedMutator",
      "org.databene.commons.ConnectFailedException",
      "org.databene.jdbacl.JDBCConnectData",
      "org.apache.derby.iapi.services.monitor.PersistentService",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.h2.value.ValueShort",
      "org.apache.derby.iapi.services.i18n.LocaleFinder",
      "org.apache.derby.iapi.sql.conn.Authorizer",
      "org.h2.store.Data",
      "org.apache.derby.iapi.store.raw.data.DataFactory",
      "org.h2.value.ValueDecimal",
      "org.databene.jdbacl.proxy.PooledConnectionHandler",
      "org.apache.derby.iapi.sql.compile.Optimizable",
      "org.postgresql.util.PSQLException",
      "org.apache.derby.impl.sql.compile.ExpressionClassBuilder",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.apache.derby.iapi.store.access.conglomerate.TransactionManager",
      "org.apache.derby.impl.sql.compile.QueryTreeNodeVector",
      "org.apache.derby.iapi.sql.conn.SQLSessionContext",
      "org.h2.value.ValueLob",
      "org.h2.value.Value",
      "org.firebirdsql.jdbc.FBPreparedStatement",
      "org.firebirdsql.jdbc.FirebirdStatement",
      "org.firebirdsql.jdbc.FBMissingParameterException",
      "org.apache.derby.impl.store.raw.log.FileLogger",
      "org.apache.derby.iapi.sql.compile.ExpressionClassBuilderInterface",
      "org.apache.derby.iapi.store.access.conglomerate.Conglomerate",
      "org.apache.derby.iapi.sql.execute.RunTimeStatistics",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.apache.derby.impl.store.access.conglomerate.RowPosition",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter$TableNameFilter",
      "org.apache.derby.iapi.sql.ResultColumnDescriptor",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionFactory",
      "org.h2.value.CompareMode",
      "org.apache.derby.iapi.sql.Activation",
      "org.apache.derby.iapi.services.io.Storable",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.h2.value.ValueJavaObject",
      "org.apache.derby.catalog.Dependable",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.apache.derby.iapi.services.property.PropertySetCallback",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.h2.engine.SessionWithState",
      "org.h2.message.Trace",
      "org.apache.derby.impl.store.access.btree.ControlRow",
      "org.apache.derby.iapi.services.crypto.CipherProvider",
      "org.databene.commons.AssertionError",
      "org.databene.jdbacl.DBExecutionResult",
      "org.databene.commons.SystemInfo",
      "org.h2.value.ValueInt",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.databene.commons.IOUtil$1",
      "org.hsqldb.DatabaseURL",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.OrderByList",
      "org.apache.derby.iapi.types.DataValueFactory",
      "org.firebirdsql.jdbc.field.FBField",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionContext",
      "org.h2.store.LobStorage$CountingReaderInputStream",
      "org.apache.derby.impl.sql.compile.UnaryLogicalOperatorNode",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AbstractTransactionCoordinator",
      "org.databene.commons.depend.Dependent",
      "org.h2.engine.SessionRemote",
      "org.firebirdsql.jdbc.FBObjectListener$StatementListener",
      "org.apache.derby.iapi.sql.compile.ASTVisitor",
      "org.h2.value.ValueUuid",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.apache.derby.iapi.store.raw.LockingPolicy",
      "org.apache.derby.impl.store.raw.log.CheckpointOperation",
      "org.databene.jdbacl.proxy.LoggingResultSetHandler",
      "org.h2.value.ValueDate",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.firebirdsql.jdbc.FirebirdPreparedStatement",
      "org.apache.derby.iapi.store.raw.ContainerHandle",
      "org.firebirdsql.jdbc.FBObjectListener",
      "org.apache.derby.vti.VTIEnvironment",
      "org.apache.derby.iapi.store.access.xa.XAResourceManager",
      "org.h2.value.Transfer",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.firebirdsql.jdbc.FBObjectListener$FetcherListener",
      "org.apache.derby.catalog.types.RowMultiSetImpl",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.apache.derby.iapi.store.access.ConglomPropertyQueryable",
      "org.h2.value.ValueLobDb",
      "org.apache.derby.iapi.sql.ParameterValueSet",
      "org.h2.engine.DbObject",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.apache.derby.iapi.sql.Statement",
      "org.firebirdsql.jdbc.field.FieldDataProvider",
      "org.apache.derby.iapi.sql.conn.StatementContext",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.apache.derby.io.WritableStorageFactory",
      "org.postgresql.ds.common.BaseDataSource",
      "org.apache.derby.iapi.store.raw.RawStoreFactory",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.apache.derby.iapi.sql.execute.ConstantAction",
      "org.databene.commons.converter.MultiConverterWrapper",
      "org.apache.derby.impl.sql.compile.ConstantNode",
      "org.apache.derby.impl.sql.conn.GenericStatementContext",
      "org.databene.jdbacl.model.DBTable",
      "org.firebirdsql.gds.impl.wire.isc_tr_handle_impl",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.LoggerEscalator",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.apache.derby.iapi.sql.compile.CompilerContext",
      "org.databene.commons.StringUtil",
      "org.h2.store.fs.FileObject",
      "org.h2.value.ValueResultSet",
      "org.h2.value.ValueDouble",
      "org.apache.derby.io.StorageRandomAccessFile",
      "org.apache.derby.catalog.UUID",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.commons.Named",
      "org.databene.jdbacl.ResultsWithMetadata",
      "org.apache.derby.io.StorageFactory",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.hsqldb.persist.HsqlProperties",
      "org.firebirdsql.jdbc.FBObjectListener$ResultSetListener",
      "org.apache.derby.iapi.services.daemon.Serviceable",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.databene.commons.Filter",
      "org.apache.derby.impl.store.raw.xact.XactFactory",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.h2.tools.SimpleResultSet",
      "org.apache.derby.iapi.sql.depend.DependencyManager",
      "org.databene.jdbacl.model.DBIndex",
      "org.h2.engine.Session",
      "org.databene.jdbacl.model.DBConstraint",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.apache.derby.iapi.services.locks.CompatibilitySpace",
      "org.h2.compress.LZFOutputStream",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.h2.value.ValueArray",
      "org.h2.util.TempFileDeleter",
      "org.firebirdsql.gds.impl.wire.WireXdrInputStream",
      "org.apache.derby.iapi.store.raw.log.Logger",
      "org.apache.derby.impl.sql.conn.TempTableInfo",
      "org.h2.tools.Recover",
      "org.apache.derby.impl.sql.compile.OrderedColumnList",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.h2.value.ValueStringFixed",
      "org.apache.derby.impl.store.raw.log.LogAccessFile",
      "org.postgresql.Driver",
      "org.h2.constant.SysProperties",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.apache.derby.iapi.store.raw.log.LogInstant",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.services.cache.CacheableFactory",
      "org.databene.commons.ErrorHandler",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.firebirdsql.gds.GDS",
      "org.apache.derby.iapi.sql.depend.Dependent",
      "org.databene.commons.BeanUtil$PrimitiveTypeMapping",
      "org.apache.derby.iapi.store.raw.ScanHandle",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ImportFailedException",
      "org.apache.derby.iapi.services.loader.JarReader",
      "org.databene.commons.Escalator",
      "org.databene.commons.HeavyweightIterator",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionFactory",
      "org.firebirdsql.jdbc.FirebirdConnection",
      "org.databene.commons.depend.CyclicDependencyException",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.impl.sql.compile.ResultColumnList",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.h2.value.ValueByte",
      "org.apache.derby.iapi.services.context.ContextManager",
      "org.apache.derby.iapi.sql.compile.RequiredRowOrdering",
      "org.h2.command.ddl.CreateTableData",
      "org.databene.commons.version.VersionNumberComponent",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.apache.derby.vti.VTITemplate",
      "org.databene.commons.collection.OrderedNameMap",
      "org.firebirdsql.gds.DatabaseParameterBuffer",
      "org.h2.engine.SessionFactory",
      "org.databene.commons.ExceptionMapper",
      "org.apache.derby.iapi.sql.execute.ExecutionFactory",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.databene.jdbacl.model.Database",
      "org.apache.derby.impl.store.raw.xact.TransactionMapFactory",
      "org.apache.derby.impl.jdbc.EmbedResultSetMetaData",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.util.IOUtils",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.firebirdsql.gds.TransactionParameterBuffer",
      "org.h2.tools.Recover$PageInputStream",
      "org.apache.derby.iapi.store.access.SpaceInfo",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$ManagedTransactionCoordinator",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.databene.commons.Level"
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
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.Driver",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.util.StringUtils",
      "org.h2.util.IOUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.h2.engine.Session",
      "org.h2.value.Value",
      "org.h2.value.ValueLong",
      "org.h2.value.ValueNull",
      "org.h2.expression.ValueExpression",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.h2.value.ValueDecimal",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.h2.engine.SessionRemote",
      "org.h2.value.CompareMode",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.databene.commons.ErrorHandler",
      "org.hsqldb.rowio.RowInputBase",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.Tokenizer",
      "org.databene.commons.SystemInfo",
      "org.databene.commons.ConfigurationError",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.antlr.runtime.BaseRecognizer",
      "org.antlr.runtime.DFA",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.antlr.runtime.CommonToken",
      "org.databene.commons.ParseException",
      "org.databene.commons.SyntaxError",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.sql.execute.rts.RealBasicNoPutResultSetStatistics",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.databene.commons.OrderedMap",
      "org.databene.commons.ConnectFailedException",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.apache.derby.iapi.error.StandardException",
      "org.apache.derby.iapi.services.i18n.MessageService",
      "org.apache.derby.iapi.util.StringUtil",
      "org.hsqldb.jdbcDriver",
      "org.apache.derby.impl.sql.compile.TableElementNode",
      "org.apache.derby.iapi.services.info.JVMInfo",
      "org.apache.derby.impl.services.monitor.BaseMonitor",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.apache.derby.iapi.services.io.FileUtil",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.apache.derby.iapi.services.property.PropertyUtil",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.databene.commons.ErrorHandler$1",
      "org.databene.commons.depend.DependencyModel",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.apache.derby.impl.store.raw.log.LogCounter",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.apache.derby.impl.sql.catalog.SYSTRIGGERSRowFactory",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.apache.derby.impl.store.raw.xact.XactFactory",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.apache.derby.iapi.services.io.RegisteredFormatIds",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.h2.expression.Function",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.apache.derby.impl.sql.conn.GenericLanguageConnectionContext",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.AssertionError",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.h2.command.Parser",
      "org.h2.store.fs.FileSystemMemory",
      "org.h2.store.fs.FileSystemZip",
      "org.h2.store.fs.FileSystemSplit",
      "org.h2.store.fs.FileSystemDiskNio",
      "org.h2.store.fs.FileSystemDiskNioMapped",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.util.SortedProperties",
      "org.databene.commons.version.VersionNumber",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.firebirdsql.jdbc.FBBlob",
      "org.h2.command.dml.ScriptBase",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.databene.commons.ObjectNotFoundException",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.databene.jdbacl.model.DBCatalog",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.h2.store.LobStorage",
      "org.h2.tools.CompressTool",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.firebirdsql.gds.GDSException",
      "org.h2.store.FileStore",
      "org.h2.result.SortOrder",
      "org.apache.derby.impl.sql.catalog.SYSSCHEMASRowFactory",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.databene.jdbacl.model.DBDataType",
      "org.hsqldb.lib.ArrayUtil"
    );
  }
}
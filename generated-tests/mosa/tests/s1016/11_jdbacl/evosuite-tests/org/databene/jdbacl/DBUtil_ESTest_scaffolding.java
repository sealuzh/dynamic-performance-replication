/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 07:06:29 GMT 2018
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
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DBUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.h2.store.LobStorage",
      "org.h2.tools.Recover$1",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.postgresql.jdbc3.AbstractJdbc3Connection",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$MetaDataTransactionCoordinator",
      "org.apache.derby.iapi.services.io.ErrorObjectInput",
      "org.firebirdsql.jdbc.FBObjectListener$BlobListener",
      "org.databene.commons.CollectionUtil",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.postgresql.core.BaseConnection",
      "org.postgresql.core.ResultHandler",
      "org.databene.jdbacl.model.DBRow",
      "org.apache.derby.catalog.TypeDescriptor",
      "org.firebirdsql.jdbc.FBSQLWarning",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.databene.jdbacl.model.DBMetaDataImporter",
      "org.firebirdsql.jdbc.FBCallableStatement",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.apache.derby.vti.VTICosting",
      "org.postgresql.core.PGBindException",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.apache.derby.iapi.types.XML",
      "org.databene.commons.ConnectFailedException",
      "org.databene.jdbacl.JDBCConnectData",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.services.i18n.LocaleFinder",
      "org.apache.derby.iapi.error.StandardException$BadMessageArgumentException",
      "org.apache.derby.iapi.store.raw.data.DataFactory",
      "org.h2.store.Data",
      "org.apache.derby.iapi.types.SQLVarchar",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.databene.jdbacl.proxy.PooledConnectionHandler",
      "org.databene.commons.ConfigurationError",
      "org.h2.store.FileStoreInputStream",
      "org.databene.commons.converter.ArrayConverter",
      "org.firebirdsql.gds.IscBlobHandle",
      "org.apache.derby.iapi.types.Orderable",
      "org.h2.util.SmallLRUCache",
      "org.h2.tools.SimpleRowSource",
      "org.postgresql.util.PSQLException",
      "org.firebirdsql.jdbc.FirebirdSavepoint",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.firebirdsql.gds.impl.GDSType",
      "org.databene.jdbacl.model.TableHolder",
      "org.postgresql.fastpath.Fastpath",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.h2.value.Value",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.firebirdsql.jdbc.FirebirdBlob",
      "org.firebirdsql.jdbc.FirebirdStatement",
      "org.postgresql.core.v3.ConnectionFactoryImpl$UnsupportedProtocolException",
      "org.firebirdsql.jdbc.FBMissingParameterException",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.debug.ResourceMonitor",
      "org.apache.derby.iapi.services.loader.ClassInspector",
      "org.firebirdsql.gds.BlobParameterBuffer",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.iapi.services.i18n.MessageService",
      "org.h2.expression.Expression",
      "org.postgresql.util.PSQLWarning",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.postgresql.util.GT",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter$TableNameFilter",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.apache.derby.iapi.sql.ResultColumnDescriptor",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.apache.derby.iapi.error.StandardException",
      "org.firebirdsql.jdbc.field.TypeConvertionException",
      "org.apache.derby.iapi.services.io.Storable",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.hsqldb.lib.Iterator",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$LocalTransactionCoordinator",
      "org.apache.derby.iapi.types.SQLClob",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBObject",
      "org.databene.commons.AssertionError",
      "org.databene.jdbacl.DBExecutionResult",
      "org.firebirdsql.gds.IscSvcHandle",
      "org.apache.derby.iapi.services.io.StreamStorable",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AutoCommitCoordinator",
      "org.databene.commons.SystemInfo",
      "org.apache.derby.impl.store.raw.data.BaseDataFileFactory",
      "org.firebirdsql.gds.EventHandle",
      "org.firebirdsql.gds.IscTrHandle",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.databene.commons.IOUtil$1",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.h2.util.Tool",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.FBStatement",
      "org.firebirdsql.gds.ServiceParameterBuffer",
      "org.apache.derby.iapi.util.StringUtil",
      "org.databene.commons.OrderedSet",
      "org.apache.derby.iapi.types.StringDataValue",
      "org.h2.store.FileStore",
      "org.apache.derby.iapi.store.raw.Corruptable",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AbstractTransactionCoordinator",
      "org.firebirdsql.gds.GDSException",
      "org.databene.commons.depend.Dependent",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.commons.IOUtil",
      "org.databene.jdbacl.model.DBColumn",
      "org.firebirdsql.jdbc.FBObjectListener$StatementListener",
      "org.databene.commons.BeanUtil",
      "org.apache.derby.iapi.services.io.ArrayInputStream",
      "org.databene.jdbacl.proxy.LoggingResultSetHandler",
      "org.databene.commons.ProgrammerError",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.firebirdsql.jdbc.FirebirdPreparedStatement",
      "org.firebirdsql.jdbc.FBObjectListener",
      "org.postgresql.core.ConnectionFactory",
      "org.apache.derby.vti.VTIEnvironment",
      "org.h2.result.SearchRow",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.firebirdsql.jdbc.FBObjectListener$FetcherListener",
      "org.apache.derby.catalog.types.RowMultiSetImpl",
      "org.postgresql.Driver$1",
      "org.h2.message.TraceObject",
      "org.h2.value.ValueLong",
      "org.databene.commons.converter.FormatHolder",
      "org.apache.derby.iapi.types.XMLDataValue",
      "org.apache.derby.iapi.types.SQLLongvarchar",
      "org.firebirdsql.jdbc.field.FieldDataProvider",
      "org.apache.derby.diag.ErrorMessages",
      "org.postgresql.ds.common.BaseDataSource",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.h2.message.DbException",
      "org.postgresql.core.Logger",
      "org.databene.commons.converter.MultiConverterWrapper",
      "org.firebirdsql.gds.impl.jni.LocalGDSImpl",
      "org.firebirdsql.jdbc.FirebirdCallableStatement",
      "org.firebirdsql.gds.ServiceRequestBuffer",
      "org.h2.jdbcx.JdbcDataSource",
      "org.apache.derby.catalog.types.UserDefinedTypeIdImpl",
      "org.apache.derby.iapi.types.BooleanDataValue",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.LoggerEscalator",
      "org.databene.commons.StringUtil",
      "org.postgresql.core.PGStream",
      "org.databene.jdbacl.proxy.LoggingPreparedStatementHandler",
      "org.postgresql.core.Encoding",
      "org.databene.commons.Named",
      "org.postgresql.core.TypeInfo",
      "org.databene.jdbacl.ResultsWithMetadata",
      "org.databene.commons.ReaderLineIterator",
      "org.h2.expression.Parameter",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.firebirdsql.gds.impl.GDSHelper$GDSHelperErrorListener",
      "org.hsqldb.persist.HsqlProperties",
      "org.firebirdsql.jdbc.FBObjectListener$ResultSetListener",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.apache.derby.iapi.services.io.Limit",
      "org.firebirdsql.jdbc.FBArray",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.databene.commons.Filter",
      "org.firebirdsql.gds.IscDbHandle",
      "org.hsqldb.SessionInterface",
      "org.h2.tools.SimpleResultSet",
      "org.databene.commons.ThreadAware",
      "org.databene.jdbacl.model.DBIndex",
      "org.firebirdsql.jca.FirebirdLocalTransaction",
      "org.databene.jdbacl.model.DBConstraint",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.postgresql.copy.CopyManager",
      "org.postgresql.largeobject.LargeObjectManager",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.h2.tools.SimpleResultSet$Column",
      "org.h2.util.TempFileDeleter",
      "org.apache.derby.iapi.types.SQLChar",
      "org.apache.derby.iapi.services.io.FormatableHashtable",
      "org.databene.commons.collection.ListBasedSet",
      "org.apache.derby.iapi.types.VariableSizeDataValue",
      "org.postgresql.util.PSQLState",
      "org.h2.tools.Recover",
      "org.postgresql.PGConnection",
      "org.apache.derby.iapi.services.monitor.ModuleSupportable",
      "org.postgresql.jdbc4.AbstractJdbc4Connection",
      "org.databene.commons.debug.Debug",
      "org.postgresql.core.PGStream$1",
      "org.postgresql.jdbc2.TimestampUtils",
      "org.h2.value.Value$ValueBlob",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.postgresql.Driver",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.postgresql.core.QueryExecutor",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.apache.derby.iapi.services.io.ErrorInfo",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.services.cache.CacheableFactory",
      "org.firebirdsql.logging.Logger",
      "org.databene.commons.ErrorHandler",
      "org.firebirdsql.gds.XSQLVAR",
      "org.h2.store.DataHandler",
      "org.h2.jdbc.JdbcConnection",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.firebirdsql.gds.GDS",
      "org.databene.commons.BeanUtil$PrimitiveTypeMapping",
      "org.postgresql.PGNotification",
      "org.databene.commons.Patterns",
      "org.databene.commons.ArrayUtil",
      "org.databene.commons.ImportFailedException",
      "org.databene.commons.Escalator",
      "org.databene.commons.HeavyweightIterator",
      "org.h2.Driver",
      "org.databene.jdbacl.DBUtil",
      "org.firebirdsql.jdbc.FirebirdConnection",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.postgresql.core.ProtocolConnection",
      "org.hsqldb.HsqlException",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.apache.derby.vti.VTITemplate",
      "org.databene.commons.collection.OrderedNameMap",
      "org.firebirdsql.gds.DatabaseParameterBuffer",
      "org.databene.commons.ArrayFormat",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.databene.commons.ExceptionMapper",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.hsqldb.Result",
      "org.databene.commons.OrderedMap",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.apache.derby.iapi.services.io.LimitObjectInput",
      "org.databene.jdbacl.model.Database",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.apache.derby.impl.jdbc.EmbedResultSetMetaData",
      "org.h2.value.Value$ValueClob",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.h2.expression.ParameterInterface",
      "org.apache.derby.iapi.types.ConcatableDataValue",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.apache.derby.iapi.types.SqlXmlUtil",
      "org.databene.jdbacl.proxy.LoggingStatementHandler",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.h2.tools.Recover$PageInputStream",
      "org.firebirdsql.gds.TransactionParameterBuffer",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$ManagedTransactionCoordinator",
      "org.hsqldb.Session",
      "org.databene.commons.ObjectNotFoundException",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.postgresql.core.Query",
      "org.postgresql.jdbc3g.AbstractJdbc3gConnection",
      "org.databene.commons.Level",
      "org.databene.jdbacl.model.DBSchema",
      "org.postgresql.jdbc4.Jdbc4Connection"
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
      "org.hsqldb.persist.HsqlProperties",
      "org.databene.commons.ConnectFailedException",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.TableElementNode",
      "org.apache.derby.impl.sql.execute.WriteCursorConstantAction",
      "org.apache.derby.impl.sql.execute.DeleteConstantAction",
      "org.apache.derby.impl.sql.execute.rts.RealBasicNoPutResultSetStatistics",
      "org.apache.derby.iapi.services.i18n.MessageService",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.Driver",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.h2.message.TraceObject",
      "org.h2.command.dml.SetTypes",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.engine.ConnectionInfo",
      "org.h2.util.StringUtils",
      "org.h2.util.IOUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.AssertionError",
      "org.databene.commons.OrderedMap",
      "org.h2.value.CompareMode",
      "org.databene.commons.ErrorHandler",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.collection.OrderedNameMap",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.h2.engine.SessionRemote",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.TableContainer",
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
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.hsqldb.lib.FileUtil",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.apache.derby.impl.store.access.heap.Heap",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.apache.derby.iapi.services.io.FormatableHashtable",
      "org.databene.jdbacl.model.DBSequence",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ObjectNotFoundException",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.field.TypeConvertionException",
      "org.databene.commons.ErrorHandler$1",
      "org.h2.store.fs.FileSystemMemory",
      "org.h2.store.fs.FileSystemZip",
      "org.h2.store.fs.FileSystemSplit",
      "org.h2.store.fs.FileSystemDiskNio",
      "org.h2.store.fs.FileSystemDiskNioMapped",
      "org.h2.store.FileLock",
      "org.h2.util.SortedProperties",
      "org.h2.engine.Session",
      "org.h2.value.Value",
      "org.h2.value.ValueLong",
      "org.h2.command.Parser",
      "org.apache.derby.impl.store.raw.data.BaseDataFileFactory",
      "org.apache.derby.iapi.error.StandardException",
      "org.h2.command.dml.ScriptBase",
      "org.apache.derby.impl.store.raw.xact.XactFactory",
      "org.apache.derby.iapi.services.info.JVMInfo",
      "org.apache.derby.impl.services.monitor.BaseMonitor",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.apache.derby.iapi.services.io.FileUtil",
      "org.h2.store.FileStore",
      "org.apache.derby.iapi.util.StringUtil",
      "org.firebirdsql.jdbc.FBDriverNotCapableException"
    );
  }
}
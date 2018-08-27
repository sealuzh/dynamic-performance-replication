/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 12:30:22 GMT 2018
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DBUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.h2.store.LobStorage",
      "org.h2.tools.Recover$1",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.h2.store.fs.FileSystemMemory",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.h2.engine.SessionInterface",
      "org.h2.tools.Csv",
      "org.firebirdsql.jdbc.FBObjectListener$BlobListener",
      "org.databene.commons.CollectionUtil",
      "org.databene.commons.ParseUtil",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.databene.jdbacl.model.DBRow",
      "org.databene.jdbacl.model.DBMetaDataImporter",
      "org.h2.command.CommandInterface",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.databene.commons.ConnectFailedException",
      "org.databene.jdbacl.JDBCConnectData",
      "org.firebirdsql.gds.impl.wire.isc_svc_handle_impl",
      "org.h2.store.Data",
      "org.databene.commons.depend.DependencyModel",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.databene.jdbacl.proxy.PooledConnectionHandler",
      "org.databene.commons.ConfigurationError",
      "org.firebirdsql.gds.impl.wire.Xdrable",
      "org.h2.store.FileStoreInputStream",
      "org.databene.commons.converter.ArrayConverter",
      "org.firebirdsql.gds.IscBlobHandle",
      "org.h2.util.SmallLRUCache",
      "org.firebirdsql.gds.EventHandler",
      "org.h2.tools.SimpleRowSource",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.commons.Period",
      "org.firebirdsql.gds.impl.GDSType",
      "org.h2.store.fs.FileSystem",
      "org.databene.jdbacl.model.TableHolder",
      "org.h2.value.Value",
      "org.firebirdsql.jdbc.FBPreparedStatement",
      "org.databene.jdbacl.model.TableContainer",
      "org.firebirdsql.jdbc.FirebirdStatement",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.debug.ResourceMonitor",
      "org.firebirdsql.gds.BlobParameterBuffer",
      "org.databene.commons.converter.ToStringConverter",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter$TableNameFilter",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.h2.util.Utils",
      "org.h2.value.ValueString",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.gds.impl.wire.XdrInputStream",
      "org.h2.engine.SessionWithState",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBObject",
      "org.databene.commons.AssertionError",
      "org.databene.jdbacl.DBExecutionResult",
      "org.h2.util.New",
      "org.firebirdsql.gds.IscSvcHandle",
      "org.firebirdsql.jdbc.AbstractStatement$RSListener",
      "org.databene.commons.SystemInfo",
      "org.firebirdsql.gds.EventHandle",
      "org.postgresql.ds.jdbc4.AbstractJdbc4PooledConnection",
      "org.h2.util.StringUtils",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.firebirdsql.gds.IscTrHandle",
      "org.databene.commons.IOUtil$1",
      "org.h2.util.Tool",
      "org.firebirdsql.jdbc.FBStatement",
      "org.firebirdsql.gds.ServiceParameterBuffer",
      "org.databene.commons.OrderedSet",
      "org.h2.util.MathUtils$1",
      "org.h2.store.FileStore",
      "org.firebirdsql.gds.impl.GDSFactoryPlugin",
      "org.apache.derby.iapi.store.raw.Corruptable",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.databene.commons.depend.Dependent",
      "org.h2.engine.SessionRemote",
      "org.databene.commons.IOUtil",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl$DbAttachInfo",
      "org.firebirdsql.jdbc.FBObjectListener$StatementListener",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.commons.BeanUtil",
      "org.firebirdsql.gds.XSQLDA",
      "org.databene.jdbacl.proxy.LoggingResultSetHandler",
      "org.databene.commons.ProgrammerError",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.firebirdsql.jdbc.FirebirdPreparedStatement",
      "org.firebirdsql.jdbc.FBObjectListener",
      "org.h2.result.SearchRow",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.h2.value.Transfer",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.h2.constant.ErrorCode",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.h2.value.ValueLong",
      "org.databene.commons.converter.FormatHolder",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.h2.util.SortedProperties",
      "org.firebirdsql.gds.impl.wire.EventCoordinator",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.h2.message.DbException",
      "org.apache.derby.iapi.store.raw.RawStoreFactory",
      "org.databene.commons.converter.MultiConverterWrapper",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.firebirdsql.gds.ServiceRequestBuffer",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.databene.jdbacl.model.DBTable",
      "org.firebirdsql.gds.impl.wire.isc_tr_handle_impl",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.LoggerEscalator",
      "org.databene.commons.StringUtil",
      "org.h2.store.fs.FileObject",
      "org.databene.jdbacl.proxy.LoggingPreparedStatementHandler",
      "org.databene.commons.Named",
      "org.databene.jdbacl.ResultsWithMetadata",
      "org.databene.commons.ReaderLineIterator",
      "org.firebirdsql.gds.impl.jni.GDSSynchronizationPolicy$AbstractSynchronizationPolicy",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.firebirdsql.gds.impl.GDSHelper$GDSHelperErrorListener",
      "org.firebirdsql.jdbc.FBObjectListener$ResultSetListener",
      "org.databene.jdbacl.model.DBSequence",
      "org.firebirdsql.jdbc.FBArray",
      "org.databene.commons.Filter",
      "org.firebirdsql.gds.IscDbHandle",
      "org.h2.tools.SimpleResultSet",
      "org.databene.commons.ThreadAware",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBConstraint",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.h2.tools.SimpleResultSet$Column",
      "org.h2.util.TempFileDeleter",
      "org.firebirdsql.gds.impl.wire.WireXdrInputStream",
      "org.h2.util.MathUtils",
      "org.databene.commons.collection.ListBasedSet",
      "org.firebirdsql.logging.LoggerFactory",
      "org.h2.tools.Recover",
      "org.apache.derby.iapi.services.monitor.ModuleSupportable",
      "org.databene.commons.debug.Debug",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.h2.store.FileLister",
      "org.h2.value.Value$ValueBlob",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.databene.jdbacl.model.cache.CachingDBImporter",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.firebirdsql.logging.Logger",
      "org.databene.commons.ErrorHandler",
      "org.h2.store.DataHandler",
      "org.firebirdsql.gds.GDS",
      "org.postgresql.xa.PGXAConnection",
      "org.databene.commons.BeanUtil$PrimitiveTypeMapping",
      "org.databene.commons.Patterns",
      "org.databene.commons.ArrayUtil",
      "org.databene.commons.NullSafeComparator",
      "org.databene.commons.ImportFailedException",
      "org.databene.commons.Escalator",
      "org.databene.commons.HeavyweightIterator",
      "org.firebirdsql.gds.impl.jni.GDSSynchronizationPolicy$ClientLibrarySyncPolicy",
      "org.databene.jdbacl.DBUtil",
      "org.databene.commons.depend.CyclicDependencyException",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.commons.collection.OrderedNameMap",
      "org.firebirdsql.gds.DatabaseParameterBuffer",
      "org.h2.engine.SessionFactory",
      "org.databene.commons.ExceptionMapper",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.databene.commons.OrderedMap",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.databene.jdbacl.model.Database",
      "org.h2.value.Value$ValueClob",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.firebirdsql.logging.Log4jLogger",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.util.IOUtils",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.proxy.LoggingStatementHandler",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.h2.tools.Recover$PageInputStream",
      "org.firebirdsql.gds.TransactionParameterBuffer",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.h2.jdbc.JdbcSQLException",
      "org.h2.engine.ConnectionInfo",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.databene.commons.ObjectNotFoundException",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.databene.commons.Level",
      "org.databene.jdbacl.model.DBSchema",
      "org.postgresql.ds.PGPooledConnection"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.databene.jdbacl.model.CompositeDBObject", false, DBUtil_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.firebirdsql.gds.impl.GDSHelper$GDSHelperErrorListener", false, DBUtil_ESTest_scaffolding.class.getClassLoader()));
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
      "org.hsqldb.jdbcDriver",
      "org.apache.derby.impl.sql.execute.WriteCursorConstantAction",
      "org.apache.derby.impl.sql.execute.DeleteConstantAction",
      "org.apache.derby.impl.sql.execute.rts.RealBasicNoPutResultSetStatistics",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.databene.commons.SystemInfo",
      "org.databene.commons.ConfigurationError",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.h2.util.StringUtils",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.h2.util.IOUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.postgresql.Driver",
      "org.apache.derby.iapi.services.info.JVMInfo",
      "org.apache.derby.impl.services.monitor.BaseMonitor",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.apache.derby.iapi.services.io.FileUtil",
      "org.h2.engine.SessionRemote",
      "org.databene.commons.ConnectFailedException",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.OrderedMap",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.persist.HsqlProperties",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.field.TypeConvertionException",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.TableElementNode",
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
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.databene.commons.ErrorHandler",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.ArrayUtil",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.commons.depend.DependencyModel",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.hsqldb.lib.FileUtil",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.h2.engine.Session",
      "org.h2.value.Value",
      "org.h2.value.ValueLong",
      "org.databene.commons.version.VersionNumber",
      "org.databene.commons.ObjectNotFoundException",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.apache.derby.impl.store.raw.log.LogCounter",
      "org.databene.jdbacl.model.DBSequence",
      "org.databene.jdbacl.model.DBDataType",
      "org.h2.value.CompareMode",
      "org.h2.store.fs.FileSystemMemory",
      "org.h2.store.fs.FileSystemZip",
      "org.h2.store.fs.FileSystemSplit",
      "org.h2.store.fs.FileSystemDiskNio",
      "org.h2.store.fs.FileSystemDiskNioMapped",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.util.SortedProperties",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.apache.derby.iapi.error.StandardException",
      "org.h2.expression.Function",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.databene.commons.ErrorHandler$1",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.firebirdsql.jdbc.FBBlob",
      "org.h2.command.Parser",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.hsqldb.Table",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.commons.Period",
      "org.databene.jdbacl.model.cache.CachingDBImporter",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.apache.derby.iapi.services.property.PropertyUtil",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.h2.value.Transfer",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
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
      "org.h2.store.LobStorage",
      "org.h2.tools.CompressTool",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.databene.commons.AssertionError",
      "org.databene.commons.NullSafeComparator"
    );
  }
}
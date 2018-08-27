/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 13:08:04 GMT 2018
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
      "org.h2.value.ValueLong",
      "org.h2.store.LobStorage",
      "org.databene.commons.converter.FormatHolder",
      "org.h2.tools.Recover$1",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.catalog.DependableFinder",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.h2.engine.SessionInterface",
      "org.hsqldb.jdbcDriver",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.postgresql.ds.common.BaseDataSource",
      "org.h2.message.DbException",
      "org.h2.tools.Csv",
      "org.apache.derby.iapi.store.access.TransactionController",
      "org.firebirdsql.jdbc.FBObjectListener$BlobListener",
      "org.databene.commons.ParseUtil",
      "org.databene.commons.CollectionUtil",
      "org.databene.commons.converter.MultiConverterWrapper",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.h2.jdbcx.JdbcDataSource",
      "org.apache.derby.catalog.types.UserDefinedTypeIdImpl",
      "org.firebirdsql.jdbc.FBBlob",
      "org.databene.jdbacl.model.DBRow",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.LoggerEscalator",
      "org.databene.commons.StringUtil",
      "org.databene.jdbacl.proxy.LoggingPreparedStatementHandler",
      "org.databene.jdbacl.model.DBMetaDataImporter",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.h2.command.CommandInterface",
      "org.apache.derby.iapi.services.property.PersistentSet",
      "org.apache.derby.catalog.UUID",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.apache.derby.vti.VTICosting",
      "org.databene.commons.Named",
      "org.databene.jdbacl.ResultsWithMetadata",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.commons.ReaderLineIterator",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.firebirdsql.jdbc.FBBlob$FBBlobOutputStream",
      "org.databene.commons.ConnectFailedException",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.databene.jdbacl.JDBCConnectData",
      "org.hsqldb.persist.HsqlProperties",
      "org.h2.store.Data",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.databene.commons.depend.DependencyModel",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.databene.jdbacl.proxy.PooledConnectionHandler",
      "org.databene.commons.ConfigurationError",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.databene.commons.Filter",
      "org.h2.store.FileStoreInputStream",
      "org.databene.commons.converter.ArrayConverter",
      "org.h2.message.TraceWriter",
      "org.hsqldb.SessionInterface",
      "org.apache.derby.iapi.types.Orderable",
      "org.databene.commons.ThreadAware",
      "org.h2.util.SmallLRUCache",
      "org.h2.tools.SimpleRowSource",
      "org.postgresql.util.PSQLException",
      "org.databene.jdbacl.model.DBIndex",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.apache.derby.iapi.store.access.conglomerate.TransactionManager",
      "org.databene.commons.Period",
      "org.databene.jdbacl.model.TableHolder",
      "org.databene.jdbacl.model.DBConstraint",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.h2.value.Value",
      "org.hsqldb.types.JavaObject",
      "org.firebirdsql.jdbc.FBPreparedStatement",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.h2.util.TempFileDeleter",
      "org.h2.util.MathUtils",
      "org.firebirdsql.jdbc.FirebirdBlob",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.jdbacl.model.TableContainer",
      "org.firebirdsql.jdbc.FirebirdBlob$BlobOutputStream",
      "org.firebirdsql.jdbc.FirebirdStatement",
      "org.h2.tools.Recover",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.debug.Debug",
      "org.databene.commons.debug.ResourceMonitor",
      "org.databene.commons.converter.ToStringConverter",
      "org.h2.value.Value$ValueBlob",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.databene.jdbacl.model.cache.CachingDBImporter",
      "org.hsqldb.types.Binary",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter$TableNameFilter",
      "org.apache.derby.iapi.error.StandardException",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.value.ValueString",
      "org.apache.derby.iapi.services.io.Storable",
      "org.databene.commons.Capitalization",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.databene.commons.Assert",
      "org.apache.derby.catalog.Dependable",
      "org.databene.commons.ErrorHandler",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.gds.XSQLVAR",
      "org.h2.store.DataHandler",
      "org.h2.jdbc.JdbcConnection",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.h2.engine.SessionWithState",
      "org.databene.commons.BeanUtil$PrimitiveTypeMapping",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.h2.message.Trace",
      "org.databene.commons.Patterns",
      "org.databene.commons.ArrayUtil",
      "org.databene.jdbacl.model.DBObject",
      "org.databene.commons.ImportFailedException",
      "org.databene.commons.AssertionError",
      "org.databene.jdbacl.DBExecutionResult",
      "org.h2.util.New",
      "org.databene.commons.Escalator",
      "org.firebirdsql.jdbc.FirebirdBlob$BlobInputStream",
      "org.databene.commons.HeavyweightIterator",
      "org.databene.commons.SystemInfo",
      "org.h2.Driver",
      "org.hsqldb.lib.FileAccess",
      "org.databene.jdbacl.DBUtil",
      "org.postgresql.ds.jdbc4.AbstractJdbc4PooledConnection",
      "org.databene.commons.depend.CyclicDependencyException",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.databene.commons.IOUtil$1",
      "org.apache.derby.iapi.store.access.XATransactionController",
      "org.h2.util.Tool",
      "org.hsqldb.HsqlException",
      "org.firebirdsql.gds.XSQLVAR$datetime",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.apache.derby.vti.VTITemplate",
      "org.databene.commons.collection.OrderedNameMap",
      "org.h2.engine.SessionFactory",
      "org.databene.commons.OrderedSet",
      "org.h2.util.MathUtils$1",
      "org.databene.commons.ExceptionMapper",
      "org.hsqldb.Result",
      "org.h2.store.FileStore",
      "org.databene.commons.OrderedMap",
      "org.firebirdsql.gds.GDSException",
      "org.databene.commons.depend.Dependent",
      "org.h2.engine.SessionRemote",
      "org.databene.commons.IOUtil",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.commons.BeanUtil",
      "org.databene.jdbacl.model.Database",
      "org.firebirdsql.jdbc.FBBlob$FBBlobInputStream",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.apache.derby.impl.store.access.RAMTransaction",
      "org.h2.value.Value$ValueClob",
      "org.databene.jdbacl.proxy.LoggingResultSetHandler",
      "org.databene.commons.ProgrammerError",
      "org.firebirdsql.jdbc.FirebirdPreparedStatement",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.h2.result.SearchRow",
      "org.h2.message.TraceSystem",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.proxy.LoggingStatementHandler",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.h2.value.Transfer",
      "org.databene.jdbacl.SQLUtil",
      "org.h2.tools.Recover$PageInputStream",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.h2.message.TraceObject",
      "org.h2.jdbc.JdbcSQLException",
      "org.hsqldb.Session",
      "org.h2.engine.ConnectionInfo",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.commons.ObjectNotFoundException",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.databene.commons.Level",
      "org.databene.jdbacl.model.DBSchema",
      "org.postgresql.ds.PGPooledConnection"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.databene.jdbacl.model.CompositeDBObject", false, DBUtil_ESTest_scaffolding.class.getClassLoader()));
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
      "org.databene.commons.SystemInfo",
      "org.databene.commons.ConfigurationError",
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
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.OrderedMap",
      "org.databene.commons.collection.OrderedNameMap",
      "org.h2.engine.SessionRemote",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.databene.commons.ConnectFailedException",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.persist.HsqlProperties",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.databene.commons.ErrorHandler",
      "org.databene.commons.depend.DependencyModel",
      "org.h2.engine.Session",
      "org.h2.value.Value",
      "org.h2.value.ValueLong",
      "org.h2.value.CompareMode",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.h2.command.dml.ScriptBase",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.ObjectNotFoundException",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.TableElementNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.field.TypeConvertionException",
      "org.h2.store.FileLock",
      "org.h2.util.SortedProperties",
      "org.hsqldb.jdbcDriver",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.hsqldb.lib.java.JavaSystem",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.databene.jdbacl.model.DBSchema",
      "org.h2.engine.Engine",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.hsqldb.lib.ArrayUtil",
      "org.h2.expression.Operation",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.Period",
      "org.databene.jdbacl.model.cache.CachingDBImporter",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.databene.jdbacl.model.DBCatalog",
      "org.h2.table.Column",
      "org.apache.derby.iapi.sql.dictionary.PermDescriptor",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.apache.derby.impl.sql.catalog.SYSSTATEMENTSRowFactory",
      "org.apache.derby.impl.sql.execute.rts.RealBasicNoPutResultSetStatistics",
      "org.apache.derby.iapi.services.i18n.MessageService",
      "org.apache.derby.impl.sql.compile.SubqueryNode",
      "org.databene.commons.Level",
      "org.databene.commons.AssertionError"
    );
  }
}
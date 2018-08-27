/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 07:51:37 GMT 2018
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
      "org.firebirdsql.gds.impl.GDSServerVersion",
      "org.h2.engine.SessionInterface",
      "org.h2.command.dml.SelectUnion",
      "org.databene.commons.converter.ConverterWrapper",
      "org.h2.command.ddl.CreateUserDataType",
      "org.databene.commons.ParseUtil",
      "org.h2.expression.Operation",
      "org.databene.commons.converter.String2TimestampConverter",
      "org.h2.result.Row",
      "org.databene.jdbacl.model.DBRow",
      "org.h2.engine.RightOwner",
      "org.h2.expression.Subquery",
      "org.databene.commons.converter.SqlDate2UtilDateConverter",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.databene.jdbacl.model.DBMetaDataImporter",
      "org.h2.command.CommandInterface",
      "org.h2.command.ddl.AlterTableRenameColumn",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.databene.commons.converter.String2GregorianCalendarConverter",
      "org.h2.command.dml.TransactionCommand",
      "org.h2.value.ValueNull",
      "org.h2.expression.ConditionExists",
      "org.h2.expression.Function",
      "org.databene.commons.depend.DependencyModel",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.databene.commons.ConfigurationError",
      "org.firebirdsql.jdbc.FBResultSetNotUpdatableException",
      "org.apache.derby.iapi.services.context.Context",
      "org.databene.commons.converter.ArrayConverter",
      "org.firebirdsql.gds.IscBlobHandle",
      "org.h2.tools.SimpleRowSource",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.h2.command.ddl.CreateSequence",
      "org.h2.engine.DbObjectBase",
      "org.databene.jdbacl.model.TableHolder",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.Converter",
      "org.h2.command.dml.Merge",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.debug.ResourceMonitor",
      "org.firebirdsql.gds.BlobParameterBuffer",
      "org.databene.commons.converter.ToStringConverter",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.h2.expression.Expression",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.apache.derby.iapi.error.StandardException",
      "org.h2.util.Utils",
      "org.h2.value.ValueString",
      "org.hsqldb.lib.Iterator",
      "org.h2.command.ddl.Analyze",
      "org.h2.schema.Schema",
      "org.h2.expression.Rownum",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.databene.commons.converter.ConverterManager",
      "org.h2.expression.Alias",
      "org.firebirdsql.gds.impl.wire.XdrInputStream",
      "org.databene.jdbacl.model.DBObject",
      "org.apache.derby.iapi.services.monitor.ModuleFactory",
      "org.h2.util.New",
      "org.firebirdsql.gds.IscSvcHandle",
      "org.databene.commons.converter.Base64ToByteArrayConverter",
      "org.firebirdsql.gds.EventHandle",
      "org.h2.command.dml.Insert",
      "org.h2.result.ResultInterface",
      "org.h2.util.StringUtils",
      "org.firebirdsql.gds.IscTrHandle",
      "org.h2.command.ddl.AlterTableRename",
      "org.h2.table.IndexColumn",
      "org.h2.command.dml.Query",
      "org.h2.command.ddl.CreateTrigger",
      "org.firebirdsql.gds.ServiceParameterBuffer",
      "org.databene.commons.OrderedSet",
      "org.h2.util.MathUtils$1",
      "org.h2.command.ddl.CreateUser",
      "org.apache.derby.iapi.store.raw.Corruptable",
      "org.firebirdsql.gds.GDSException",
      "org.databene.commons.IOUtil",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.commons.BeanUtil",
      "org.h2.command.ddl.DefineCommand",
      "org.h2.command.dml.Delete",
      "org.h2.command.ddl.CreateLinkedTable",
      "org.databene.commons.ProgrammerError",
      "org.h2.table.Table",
      "org.h2.result.SearchRow",
      "org.apache.derby.impl.services.monitor.FileMonitor",
      "org.h2.command.ddl.AlterTableAddConstraint",
      "org.h2.value.ValueFloat",
      "org.h2.expression.Variable",
      "org.h2.constant.ErrorCode",
      "org.h2.command.dml.ExecuteProcedure",
      "org.h2.message.TraceObject",
      "org.h2.value.ValueBoolean",
      "org.h2.expression.SequenceValue",
      "org.databene.commons.converter.ConverterChain",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.h2.value.ValueLong",
      "org.databene.commons.converter.FormatHolder",
      "org.apache.derby.impl.services.monitor.ModuleInstance",
      "org.h2.util.SortedProperties",
      "org.firebirdsql.gds.impl.wire.EventCoordinator",
      "org.databene.commons.converter.NumberToNumberConverter",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.h2.value.ValueStringIgnoreCase",
      "org.h2.message.DbException",
      "org.h2.table.ColumnResolver",
      "org.h2.expression.Aggregate",
      "org.h2.table.RangeTable",
      "org.firebirdsql.gds.ServiceRequestBuffer",
      "org.databene.commons.converter.Date2LongConverter",
      "org.h2.engine.Database",
      "org.h2.command.dml.NoOperation",
      "org.h2.value.ValueBytes",
      "org.h2.command.dml.Explain",
      "org.firebirdsql.gds.impl.jni.NativeGDSImpl",
      "org.databene.jdbacl.proxy.LoggingPreparedStatementHandler",
      "org.apache.derby.impl.services.monitor.UpdateServiceProperties",
      "org.databene.commons.ReaderLineIterator",
      "org.h2.command.dml.ScriptBase",
      "org.h2.expression.Parameter",
      "org.firebirdsql.gds.impl.GDSHelper$GDSHelperErrorListener",
      "org.h2.command.ddl.CreateFunctionAlias",
      "org.h2.command.ddl.DropSequence",
      "org.h2.expression.JavaAggregate",
      "org.firebirdsql.jdbc.FBArray",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.firebirdsql.gds.IscDbHandle",
      "org.databene.commons.ThreadAware",
      "org.databene.commons.version.VersionNumber",
      "org.h2.table.TableFilter",
      "org.h2.expression.FunctionCall",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.h2.expression.ConditionAndOr",
      "org.h2.util.MathUtils",
      "org.h2.command.dml.AlterTableSet",
      "org.h2.command.ddl.DropView",
      "org.h2.command.ddl.DropIndex",
      "org.apache.derby.iapi.services.monitor.ModuleSupportable",
      "org.databene.commons.debug.Debug",
      "org.h2.value.ValueTimestamp",
      "org.firebirdsql.jca.FBResourceException",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.databene.jdbacl.model.cache.CachingDBImporter",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.databene.commons.Capitalization",
      "org.firebirdsql.logging.Logger",
      "org.firebirdsql.gds.XSQLVAR",
      "org.h2.store.DataHandler",
      "org.h2.jdbc.JdbcConnection",
      "org.databene.commons.Patterns",
      "org.databene.commons.ArrayUtil",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.databene.commons.NullSafeComparator",
      "org.h2.command.ddl.DropDatabase",
      "org.databene.commons.converter.FormatFormatConverter",
      "org.databene.jdbacl.DBUtil",
      "org.databene.commons.converter.AbstractConverter",
      "org.databene.commons.converter.Time2StringConverter",
      "org.h2.command.dml.AlterSequence",
      "org.databene.commons.converter.String2LocaleConverter",
      "org.h2.command.ddl.CreateRole",
      "org.apache.derby.iapi.services.timer.TimerFactory",
      "org.apache.derby.impl.services.monitor.BaseMonitor",
      "org.databene.commons.ArrayFormat",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.FirebirdRowUpdater",
      "org.hsqldb.Result",
      "org.apache.derby.iapi.services.io.AccessibleByteArrayOutputStream",
      "org.databene.commons.OrderedMap",
      "org.h2.expression.ConditionIn",
      "org.databene.commons.converter.ConversionTypes",
      "org.databene.commons.converter.UtilDate2SqlDateConverter",
      "org.databene.jdbacl.model.DBCatalog",
      "org.h2.expression.ParameterInterface",
      "org.databene.commons.converter.String2PatternConverter",
      "org.databene.jdbacl.proxy.LoggingStatementHandler",
      "org.h2.command.ddl.SetComment",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.h2.command.Prepared",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.h2.jdbc.JdbcSQLException",
      "org.h2.engine.ConnectionInfo",
      "org.databene.commons.ConversionException",
      "org.databene.commons.ObjectNotFoundException",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.h2.value.ValueTime",
      "org.databene.jdbacl.model.DBSchema",
      "org.h2.command.ddl.DropTable",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.h2.engine.Procedure",
      "org.h2.tools.Csv",
      "org.databene.commons.CollectionUtil",
      "org.h2.command.Parser",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.h2.expression.Condition",
      "org.h2.table.TableView",
      "org.firebirdsql.jdbc.FBSQLWarning",
      "org.firebirdsql.gds.impl.wire.XdrOutputStream",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.h2.expression.ExpressionList",
      "org.h2.command.dml.Update",
      "org.apache.derby.iapi.services.loader.InstanceGetter",
      "org.databene.commons.converter.String2CharConverter",
      "org.h2.command.ddl.DropSchema",
      "org.h2.expression.CompareLike",
      "org.databene.commons.ConnectFailedException",
      "org.apache.derby.iapi.services.i18n.BundleFinder",
      "org.databene.jdbacl.JDBCConnectData",
      "org.apache.derby.iapi.services.monitor.PersistentService",
      "org.h2.value.ValueShort",
      "org.h2.command.ddl.TruncateTable",
      "org.h2.value.ValueDecimal",
      "org.databene.jdbacl.proxy.PooledConnectionHandler",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.firebirdsql.gds.impl.GDSType",
      "org.databene.commons.Period",
      "org.h2.schema.Sequence",
      "org.databene.commons.converter.String2NumberFormatConverter",
      "org.h2.command.ddl.AlterIndexRename",
      "org.h2.value.Value",
      "org.h2.command.ddl.CreateAggregate",
      "org.firebirdsql.jdbc.FirebirdStatement",
      "org.h2.engine.DatabaseCloser",
      "org.h2.expression.ExpressionColumn",
      "org.apache.derby.impl.services.monitor.TopService",
      "org.databene.commons.Context",
      "org.h2.command.ddl.DropUser",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter$TableNameFilter",
      "org.h2.command.ddl.CreateSchema",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.h2.value.CompareMode",
      "org.h2.command.dml.BackupCommand",
      "org.h2.value.ValueJavaObject",
      "org.apache.derby.iapi.services.stream.InfoStreams",
      "org.databene.commons.converter.FormatBasedConverter",
      "org.h2.command.CommandList",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.h2.engine.SessionWithState",
      "org.h2.message.Trace",
      "org.databene.commons.AssertionError",
      "org.databene.jdbacl.DBExecutionResult",
      "org.databene.commons.SystemInfo",
      "org.h2.value.ValueInt",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.databene.commons.IOUtil$1",
      "org.databene.commons.converter.ByteArrayToBase64Converter",
      "org.databene.commons.context.ContextAware",
      "org.h2.schema.SchemaObject",
      "org.databene.commons.depend.Dependent",
      "org.h2.value.ValueUuid",
      "org.firebirdsql.gds.XSQLDA",
      "org.h2.table.FunctionTable",
      "org.h2.command.ddl.DropUserDataType",
      "org.databene.jdbacl.proxy.LoggingResultSetHandler",
      "org.h2.value.ValueDate",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.databene.commons.converter.JavaType",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.firebirdsql.jdbc.FBObjectListener$FetcherListener",
      "org.h2.command.ddl.CreateConstant",
      "org.h2.command.ddl.AlterView",
      "org.h2.expression.Wildcard",
      "org.databene.commons.converter.Int2DateConverter",
      "org.h2.expression.ValueExpression",
      "org.h2.command.CommandContainer",
      "org.h2.constraint.Constraint",
      "org.h2.engine.DbObject",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.jdbc.field.FieldDataProvider",
      "org.h2.engine.UserAggregate",
      "org.databene.commons.converter.String2TimeConverter",
      "org.apache.derby.iapi.store.raw.RawStoreFactory",
      "org.h2.command.ddl.DropAggregate",
      "org.firebirdsql.jca.FBTpb",
      "org.databene.commons.converter.MultiConverterWrapper",
      "org.firebirdsql.jca.FBIncorrectXidException",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.h2.command.dml.Set",
      "org.databene.jdbacl.model.DBTable",
      "org.h2.command.ddl.DropConstant",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.LoggerEscalator",
      "org.databene.commons.StringUtil",
      "org.h2.value.ValueResultSet",
      "org.h2.value.ValueDouble",
      "org.databene.commons.converter.Locale2StringConverter",
      "org.h2.command.ddl.AlterUser",
      "org.databene.commons.converter.Number2CharConverter",
      "org.h2.schema.SchemaObjectBase",
      "org.h2.command.ddl.AlterTableAlterColumn",
      "org.databene.commons.converter.Char2StringConverter",
      "org.h2.command.ddl.DeallocateProcedure",
      "org.databene.commons.Named",
      "org.h2.command.dml.RunScriptCommand",
      "org.databene.jdbacl.ResultsWithMetadata",
      "org.apache.derby.io.StorageFactory",
      "org.h2.command.dml.ScriptCommand",
      "org.hsqldb.persist.HsqlProperties",
      "org.firebirdsql.jdbc.FBObjectListener$ResultSetListener",
      "org.apache.derby.iapi.services.io.FileUtil",
      "org.databene.commons.converter.Calendar2DateConverter",
      "org.databene.commons.converter.ThreadSafeConverter",
      "org.databene.commons.Filter",
      "org.h2.tools.SimpleResultSet",
      "org.h2.command.dml.Call",
      "org.hsqldb.SessionInterface",
      "org.databene.commons.converter.Timestamp2DateConverter",
      "org.databene.jdbacl.model.DBIndex",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.h2.table.Column",
      "org.h2.engine.Session",
      "org.h2.expression.Comparison",
      "org.databene.jdbacl.model.DBConstraint",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.databene.commons.converter.String2DateConverter",
      "org.databene.commons.converter.String2DateFormatConverter",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.h2.command.ddl.DropRole",
      "org.h2.tools.SimpleResultSet$Column",
      "org.h2.value.ValueArray",
      "org.h2.engine.FunctionAlias",
      "org.firebirdsql.gds.impl.wire.WireXdrInputStream",
      "org.h2.expression.ConditionInSelect",
      "org.h2.value.ValueStringFixed",
      "org.h2.command.ddl.DropTrigger",
      "org.h2.command.ddl.DropFunctionAlias",
      "org.h2.engine.User",
      "org.databene.commons.converter.Date2CalendarConverter",
      "org.h2.constant.SysProperties",
      "org.h2.command.ddl.SchemaCommand",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.jdbc.FirebirdConnectionProperties",
      "org.h2.index.Index",
      "org.databene.commons.Assert",
      "org.databene.commons.ErrorHandler",
      "org.h2.command.ddl.CreateTable",
      "org.apache.derby.iapi.services.uuid.UUIDFactory",
      "org.databene.commons.converter.Date2TimestampConverter",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.h2.command.Command",
      "org.firebirdsql.gds.GDS",
      "org.databene.commons.BeanUtil$PrimitiveTypeMapping",
      "org.h2.command.ddl.GrantRevoke",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ImportFailedException",
      "org.databene.commons.Escalator",
      "org.databene.commons.HeavyweightIterator",
      "org.h2.engine.Role",
      "org.firebirdsql.jdbc.FirebirdConnection",
      "org.databene.commons.converter.Class2StringConverter",
      "org.databene.commons.depend.CyclicDependencyException",
      "org.h2.value.ValueByte",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.hsqldb.HsqlException",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.collection.OrderedNameMap",
      "org.firebirdsql.gds.DatabaseParameterBuffer",
      "org.h2.engine.SessionFactory",
      "org.h2.expression.ConditionNot",
      "org.databene.commons.ExceptionMapper",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.h2.engine.UndoLogRecord",
      "org.databene.commons.converter.Long2DateConverter",
      "org.databene.jdbacl.model.Database",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.h2.expression.JavaFunction",
      "org.h2.util.IOUtils",
      "org.h2.command.ddl.AlterTableDropConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.firebirdsql.gds.TransactionParameterBuffer",
      "org.databene.commons.Resettable",
      "org.firebirdsql.jdbc.FBFetcher",
      "org.databene.commons.converter.String2ClassConverter",
      "org.h2.command.ddl.CreateView",
      "org.hsqldb.Session",
      "org.h2.command.ddl.CreateIndex",
      "org.h2.command.dml.Select",
      "org.firebirdsql.jca.FBXAException",
      "org.databene.commons.Level",
      "org.apache.derby.iapi.services.info.JVMInfo",
      "org.h2.command.ddl.PrepareProcedure"
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
      "org.h2.engine.SessionRemote",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.databene.commons.SystemInfo",
      "org.databene.commons.ConfigurationError",
      "org.databene.commons.ConnectFailedException",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.Driver",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.h2.table.Table",
      "org.h2.command.dml.SetTypes",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.engine.ConnectionInfo",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.hsqldb.jdbcDriver",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.hsqldb.DatabaseURL",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.h2.util.StringUtils",
      "org.h2.util.IOUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.databene.commons.version.VersionNumber",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.OrderedMap",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.commons.ObjectNotFoundException",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.depend.DependencyModel",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.databene.commons.ErrorHandler",
      "org.hsqldb.lib.ArrayUtil",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.jdbc.FBBlob",
      "org.apache.derby.iapi.services.info.JVMInfo",
      "org.apache.derby.impl.services.monitor.BaseMonitor",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.apache.derby.iapi.services.io.FileUtil",
      "org.apache.derby.impl.store.raw.log.LogCounter",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.commons.NullSafeComparator",
      "org.databene.commons.ErrorHandler$1",
      "org.h2.value.Value",
      "org.h2.value.ValueDecimal",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.firebirdsql.gds.GDSObjectFactory",
      "org.firebirdsql.gds.ClassFactory",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.apache.derby.iapi.types.CharStreamHeaderGenerator",
      "org.apache.derby.iapi.types.SQLChar",
      "org.apache.derby.iapi.error.StandardException",
      "org.apache.derby.impl.sql.execute.rts.RealBasicNoPutResultSetStatistics",
      "org.databene.jdbacl.model.DefaultDBTable",
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
      "org.h2.store.fs.FileSystem",
      "org.databene.jdbacl.model.DBSequence",
      "org.h2.engine.Session",
      "org.h2.value.ValueLong",
      "org.h2.value.CompareMode",
      "org.h2.constraint.Constraint",
      "org.h2.constraint.ConstraintReferential",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.field.TypeConvertionException",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.AssertionError",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.h2.store.FileStore",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.apache.derby.impl.sql.execute.WriteCursorConstantAction",
      "org.apache.derby.impl.sql.execute.DeleteConstantAction",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.apache.derby.impl.sql.execute.ColumnInfo",
      "org.h2.command.dml.ScriptBase",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.util.SortedProperties",
      "org.apache.derby.iapi.services.property.PropertyUtil",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.apache.derby.catalog.types.DefaultInfoImpl",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.jdbacl.model.DBSchema",
      "org.h2.value.ValueInt",
      "org.databene.commons.converter.JavaType",
      "org.databene.commons.converter.String2DateConverter",
      "org.databene.commons.Period",
      "org.databene.jdbacl.model.cache.CachingDBImporter"
    );
  }
}
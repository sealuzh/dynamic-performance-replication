/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 19:17:20 GMT 2018
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
      "org.h2.store.LobStorage",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.h2.engine.SessionInterface",
      "org.apache.derby.iapi.services.io.ApplicationObjectInputStream",
      "org.apache.derby.iapi.services.io.ErrorObjectInput",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.firebirdsql.jdbc.FBObjectListener$BlobListener",
      "org.h2.store.FileStoreOutputStream",
      "org.databene.commons.CollectionUtil",
      "org.apache.derby.iapi.util.ReuseFactory",
      "org.databene.script.Expression",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.firebirdsql.jdbc.FBBlob",
      "org.databene.commons.version.DateVersionNumberComponent",
      "org.databene.jdbacl.model.DBRow",
      "org.apache.derby.iapi.services.crypto.CipherFactory",
      "org.apache.derby.catalog.TypeDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.h2.command.CommandInterface",
      "org.apache.derby.iapi.services.property.PersistentSet",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.h2.value.ValueNull",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.apache.derby.impl.sql.compile.NodeFactoryImpl",
      "org.apache.derby.iapi.services.monitor.PersistentService",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.h2.value.ValueShort",
      "org.apache.derby.iapi.store.raw.data.DataFactory",
      "org.h2.value.ValueDecimal",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.apache.derby.iapi.store.access.RowLocationRetRowSource",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.h2.store.FileStoreInputStream",
      "org.apache.derby.iapi.types.Orderable",
      "org.h2.util.SmallLRUCache",
      "org.postgresql.util.PSQLException",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.h2.engine.DbObjectBase",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.TableHolder",
      "org.h2.value.ValueLob",
      "org.antlr.runtime.CharStream",
      "org.h2.value.Value",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.firebirdsql.jdbc.FirebirdBlob",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.sql.parser.SQLParser$literal_return",
      "org.databene.commons.Converter",
      "org.apache.derby.iapi.sql.execute.NoPutResultSet",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.apache.derby.iapi.services.loader.ClassInspector",
      "org.apache.derby.iapi.store.raw.Loggable",
      "org.databene.commons.converter.ToStringConverter",
      "org.antlr.runtime.Lexer",
      "org.antlr.runtime.MissingTokenException",
      "org.h2.value.CompareMode",
      "org.antlr.runtime.EarlyExitException",
      "org.databene.script.expression.WrapperExpression",
      "org.apache.derby.iapi.error.StandardException",
      "org.h2.util.Utils",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.h2.value.ValueString",
      "org.apache.derby.iapi.services.io.Storable",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.h2.value.ValueJavaObject",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.apache.derby.catalog.Dependable",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.antlr.runtime.Token",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.h2.engine.SessionWithState",
      "org.antlr.runtime.Parser",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBObject",
      "org.apache.derby.iapi.services.io.CloneableStream",
      "org.apache.derby.iapi.services.crypto.CipherProvider",
      "org.databene.commons.AssertionError",
      "org.apache.derby.impl.sql.execute.AnyResultSet",
      "org.h2.util.New",
      "org.apache.derby.iapi.store.replication.slave.SlaveFactory",
      "org.h2.value.ValueInt",
      "org.hsqldb.lib.FileAccess",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.h2.util.StringUtils",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.apache.derby.iapi.store.access.RowSource",
      "org.apache.derby.impl.sql.execute.NoPutResultSetImpl",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.runtime.CommonTokenStream",
      "org.apache.derby.iapi.types.Resetable",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.h2.schema.SchemaObject",
      "org.h2.util.MathUtils$1",
      "org.h2.store.FileStore",
      "org.apache.derby.iapi.store.raw.Corruptable",
      "org.firebirdsql.gds.GDSException",
      "org.databene.commons.depend.Dependent",
      "org.h2.engine.SessionRemote",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.jdbacl.model.DBColumn",
      "org.h2.value.ValueUuid",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.firebirdsql.jdbc.FBBlob$FBBlobInputStream",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.apache.derby.iapi.services.io.ArrayInputStream",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.apache.derby.impl.store.raw.log.CheckpointOperation",
      "org.h2.value.ValueDate",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.h2.table.Table",
      "org.databene.jdbacl.model.DBPackage",
      "org.h2.value.ValueFloat",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.apache.derby.io.StorageFile",
      "org.h2.value.Transfer",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.apache.derby.iapi.services.monitor.ModuleControl",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.apache.derby.catalog.types.RowMultiSetImpl",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.h2.value.ValueBoolean",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.h2.constraint.Constraint",
      "org.antlr.runtime.DFA",
      "org.h2.value.ValueLong",
      "org.h2.engine.DbObject",
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.apache.derby.catalog.DependableFinder",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.h2.value.ValueStringIgnoreCase",
      "org.postgresql.ds.common.BaseDataSource",
      "org.apache.derby.io.WritableStorageFactory",
      "org.apache.derby.iapi.store.raw.RawStoreFactory",
      "org.h2.message.DbException",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.postgresql.core.Logger",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.databene.jdbacl.model.TableContainerSupport",
      "org.apache.derby.impl.sql.execute.BasicNoPutResultSetImpl",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.apache.derby.catalog.types.UserDefinedTypeIdImpl",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.StringUtil",
      "org.h2.value.ValueBytes",
      "org.h2.value.ValueResultSet",
      "org.h2.value.ValueDouble",
      "org.antlr.runtime.tree.TreeAdaptor",
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
      "org.firebirdsql.jdbc.FBBlob$FBBlobOutputStream",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.databene.commons.Parser",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.apache.derby.iapi.sql.ResultSet",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.services.daemon.Serviceable",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.apache.derby.iapi.services.io.FormatIdInputStream",
      "org.apache.derby.iapi.services.io.Limit",
      "org.h2.constraint.ConstraintCheck",
      "org.antlr.runtime.tree.BaseTree",
      "org.databene.commons.ThreadAware",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.script.expression.ConstantExpression",
      "org.antlr.runtime.BufferedTokenStream",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.apache.derby.catalog.types.MethodAliasInfo",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.h2.value.ValueArray",
      "org.h2.util.TempFileDeleter",
      "org.apache.derby.iapi.store.raw.log.Logger",
      "org.h2.util.MathUtils",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.antlr.runtime.tree.TreeNodeStream",
      "org.databene.commons.collection.ListBasedSet",
      "org.firebirdsql.jdbc.FirebirdBlob$BlobOutputStream",
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
      "org.postgresql.Driver",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.apache.derby.iapi.services.io.ErrorInfo",
      "org.apache.derby.iapi.store.raw.log.LogScan",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.commons.version.NumberVersionNumberComponent",
      "org.firebirdsql.jdbc.FirebirdConnectionProperties",
      "org.apache.derby.iapi.store.raw.log.LogInstant",
      "org.databene.script.expression.ExpressionUtil",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.services.cache.CacheableFactory",
      "org.apache.derby.iapi.store.raw.log.LogFactory",
      "org.databene.commons.version.VersionNumberParser",
      "org.antlr.runtime.RecognitionException",
      "org.h2.store.DataHandler",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.apache.derby.catalog.AliasInfo",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.databene.commons.Patterns",
      "org.apache.derby.iapi.store.raw.ScanHandle",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.apache.derby.iapi.store.raw.xact.TransactionFactory",
      "org.databene.commons.NullSafeComparator",
      "org.databene.commons.ParseException",
      "org.antlr.runtime.TokenSource",
      "org.firebirdsql.jdbc.FirebirdBlob$BlobInputStream",
      "org.databene.commons.HeavyweightIterator",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.h2.value.ValueByte",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.databene.commons.version.VersionNumberComponent",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.h2.engine.SessionFactory",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.commons.ArrayFormat",
      "org.apache.derby.iapi.store.access.DatabaseInstant",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.commons.SyntaxError",
      "org.antlr.runtime.IntStream",
      "org.firebirdsql.jdbc.FBTpbMapper",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.apache.derby.iapi.services.io.LimitObjectInput",
      "org.databene.jdbacl.model.Database",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.h2.util.IOUtils",
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
      "org.h2.jdbc.JdbcSQLException",
      "org.h2.engine.ConnectionInfo",
      "org.databene.commons.ObjectNotFoundException",
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
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.commons.ObjectNotFoundException",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.h2.value.Value",
      "org.h2.value.ValueNull",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.databene.jdbacl.model.DBDataType",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.jdbacl.model.DBPackage",
      "org.databene.jdbacl.model.DBProcedure",
      "org.databene.jdbacl.model.DBTrigger",
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
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.h2.command.dml.SetTypes",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.engine.ConnectionInfo",
      "org.h2.engine.Database",
      "org.h2.util.StringUtils",
      "org.h2.engine.Mode",
      "org.h2.util.SmallLRUCache",
      "org.h2.util.IOUtils",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.value.CompareMode",
      "org.h2.store.FileLock",
      "org.h2.message.TraceSystem",
      "org.h2.message.Trace",
      "org.h2.util.SortedProperties",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.commons.SyntaxError",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.antlr.runtime.Token",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.firebirdsql.jdbc.FBBlob",
      "org.hsqldb.lib.FileUtil",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.databene.commons.BeanUtil",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.antlr.runtime.MismatchedTokenException",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.apache.derby.impl.sql.compile.CreateTriggerNode",
      "org.h2.table.Table",
      "org.databene.commons.NullSafeComparator",
      "org.databene.commons.AssertionError",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.apache.derby.impl.store.raw.data.BasePage",
      "org.apache.derby.impl.store.raw.data.CachedPage",
      "org.apache.derby.impl.store.raw.data.StoredPage",
      "org.apache.derby.impl.store.raw.data.AllocPage",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.hsqldb.rowio.RowOutputBase",
      "org.apache.derby.iapi.sql.dictionary.PermDescriptor",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.h2.engine.SessionRemote",
      "org.h2.value.ValueLob",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.apache.derby.iapi.util.ReuseFactory",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.constraint.Constraint",
      "org.databene.commons.ArrayBuilder",
      "org.apache.derby.iapi.services.daemon.DaemonService",
      "org.firebirdsql.jdbc.AbstractSavepoint",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.h2.store.fs.FileSystemMemory",
      "org.h2.store.fs.FileSystemZip",
      "org.h2.store.fs.FileSystemSplit",
      "org.h2.store.fs.FileSystemDiskNio",
      "org.h2.store.fs.FileSystemDiskNioMapped",
      "org.h2.value.ValueDecimal",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.sql.compile.UpdateNode",
      "org.databene.commons.ConfigurationError",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.databene.jdbacl.DBUtil",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.hsqldb.rowio.RowInputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.apache.derby.iapi.types.CharStreamHeaderGenerator",
      "org.apache.derby.iapi.types.SQLChar",
      "org.apache.derby.iapi.types.SQLVarchar",
      "org.h2.engine.Session",
      "org.h2.value.ValueLong",
      "org.apache.derby.impl.io.vfmem.PathUtil",
      "org.apache.derby.impl.io.vfmem.DataStore",
      "org.h2.command.Parser",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.h2.command.dml.SelectUnion"
    );
  }
}
/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 16 17:29:34 GMT 2018
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
    java.lang.System.setProperty("sun.jnu.encoding", "ANSI_X3.4-1968"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SQLUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.apache.derby.iapi.store.raw.Transaction",
      "org.apache.derby.catalog.DependableFinder",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.h2.message.DbException",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.services.locks.Limit",
      "org.databene.commons.CollectionUtil",
      "org.databene.script.Expression",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.apache.derby.catalog.types.UserDefinedTypeIdImpl",
      "org.databene.jdbacl.model.DBRow",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.sql.parser.SQLParser$keyword_return",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.StringUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.apache.derby.catalog.UUID",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.commons.Named",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.NameSpec",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.apache.derby.impl.store.raw.xact.Xact",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.hsqldb.lib.StringInputStream",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.antlr.runtime.tree.BaseTree",
      "org.databene.commons.ThreadAware",
      "org.apache.derby.iapi.types.Orderable",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.script.expression.ConstantExpression",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.antlr.runtime.BufferedTokenStream",
      "org.h2.engine.Mode",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.TableHolder",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.antlr.runtime.CharStream",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.databene.jdbacl.model.DBProcedure",
      "org.databene.jdbacl.model.DBDataType$TypeDescriptor",
      "org.h2.util.MathUtils",
      "org.apache.derby.impl.store.raw.xact.InternalXact",
      "org.databene.commons.collection.ListBasedSet",
      "org.databene.jdbacl.model.DBTrigger",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.apache.derby.iapi.services.locks.LockOwner",
      "org.databene.commons.converter.ToStringConverter",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.antlr.runtime.Lexer",
      "org.antlr.runtime.CommonToken",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.h2.constant.SysProperties",
      "org.antlr.runtime.MissingTokenException",
      "org.antlr.runtime.EarlyExitException",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.apache.derby.iapi.error.StandardException",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.apache.derby.iapi.services.io.Storable",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.apache.derby.catalog.Dependable",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.Token",
      "org.antlr.runtime.Parser",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.databene.commons.Patterns",
      "org.databene.jdbacl.model.DBObject",
      "org.databene.commons.NullSafeComparator",
      "org.databene.commons.ParseException",
      "org.databene.commons.AssertionError",
      "org.antlr.runtime.TokenSource",
      "org.h2.util.New",
      "org.databene.commons.HeavyweightIterator",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.h2.util.StringUtils",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.CommonTokenStream",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.commons.ArrayFormat",
      "org.antlr.runtime.ANTLRStringStream",
      "org.h2.util.MathUtils$1",
      "org.databene.commons.SyntaxError",
      "org.antlr.runtime.IntStream",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.databene.commons.depend.Dependent",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.databene.jdbacl.model.Database",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.jdbacl.model.DBPackage",
      "org.hsqldb.lib.AsciiStringInputStream",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.SQLUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.databene.commons.ObjectNotFoundException",
      "org.hsqldb.jdbc.jdbcClob",
      "org.antlr.runtime.BaseRecognizer",
      "org.databene.jdbacl.model.DBSchema",
      "org.antlr.runtime.DFA"
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
      "org.databene.jdbacl.model.DBCatalog",
      "org.databene.commons.OrderedMap",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.DBDataType",
      "org.apache.derby.iapi.store.raw.xact.RawTransaction",
      "org.databene.jdbacl.model.DefaultDBColumn",
      "org.databene.commons.ObjectNotFoundException",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.jdbacl.model.FKChangeRule",
      "org.databene.commons.NullSafeComparator",
      "org.databene.jdbacl.model.DefaultDatabase",
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
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.value.Value",
      "org.databene.commons.version.VersionNumber",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.databene.commons.AssertionError",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.store.access.btree.BTreeController",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.apache.derby.impl.store.raw.RawStore",
      "org.antlr.runtime.Token",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.NoViableAltException",
      "org.h2.util.StringUtils",
      "org.h2.engine.Mode",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.h2.value.ValueDecimal",
      "org.h2.value.ValueNull",
      "org.databene.jdbacl.model.DBPackage",
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
      "org.h2.value.ValueLob",
      "org.h2.util.IOUtils",
      "org.h2.util.Utils",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.databene.jdbacl.DBUtil",
      "org.postgresql.Driver",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.impl.store.access.conglomerate.GenericConglomerate",
      "org.apache.derby.impl.store.access.btree.BTree",
      "org.databene.jdbacl.model.DBProcedure",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.databene.commons.BeanUtil",
      "org.databene.commons.ConfigurationError",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.apache.derby.iapi.util.ReuseFactory",
      "org.apache.derby.impl.sql.catalog.SYSSEQUENCESRowFactory",
      "org.h2.command.dml.ScriptBase",
      "org.h2.store.fs.FileSystem",
      "org.h2.constraint.Constraint",
      "org.apache.derby.impl.store.raw.log.LogToFile",
      "org.hsqldb.lib.FileUtil",
      "org.h2.message.TraceObject",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.message.TraceSystem",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.h2.store.fs.FileSystemDisk",
      "org.databene.jdbacl.model.DBSequence",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputTextLog",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.apache.derby.iapi.sql.dictionary.PermDescriptor",
      "org.firebirdsql.jdbc.FBBlob",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.antlr.runtime.MismatchedTokenException",
      "org.h2.value.ValueShort",
      "org.h2.value.CompareMode",
      "org.apache.derby.iapi.services.io.DynamicByteArrayOutputStream",
      "org.hsqldb.persist.HsqlProperties",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.h2.table.Table",
      "org.h2.table.RangeTable",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptor",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.databene.jdbacl.model.DBTrigger",
      "org.h2.engine.SessionRemote",
      "org.h2.engine.Session",
      "org.h2.value.ValueLong",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.h2.engine.Database",
      "org.h2.util.SortedProperties",
      "org.apache.derby.iapi.services.info.JVMInfo",
      "org.apache.derby.impl.services.monitor.BaseMonitor",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.apache.derby.iapi.services.io.FileUtil",
      "org.hsqldb.rowio.RowInputBase",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.apache.derby.iapi.error.StandardException",
      "org.h2.store.LobStorage",
      "org.h2.tools.CompressTool",
      "org.apache.derby.impl.sql.GenericStorablePreparedStatement",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.apache.derby.impl.sql.compile.TableElementNode",
      "org.apache.derby.impl.io.vfmem.PathUtil",
      "org.apache.derby.impl.io.vfmem.DataStore",
      "org.apache.derby.impl.io.vfmem.BlockedByteArray",
      "org.apache.derby.impl.store.raw.data.BasePage",
      "org.apache.derby.impl.store.raw.data.CachedPage",
      "org.apache.derby.impl.store.raw.data.StoredPage",
      "org.apache.derby.impl.store.raw.data.AllocPage",
      "org.hsqldb.DatabaseURL",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.apache.derby.iapi.sql.dictionary.SPSDescriptor",
      "org.apache.derby.iapi.services.context.ContextService",
      "org.h2.store.fs.FileSystemMemory",
      "org.h2.store.fs.FileSystemZip",
      "org.h2.store.fs.FileSystemSplit",
      "org.h2.store.fs.FileSystemDiskNio",
      "org.h2.store.fs.FileSystemDiskNioMapped",
      "org.apache.derby.iapi.services.daemon.DaemonService",
      "org.apache.derby.iapi.error.ShutdownException",
      "org.h2.value.ValueUuid",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.firebirdsql.jdbc.FBCachedBlob"
    );
  }
}
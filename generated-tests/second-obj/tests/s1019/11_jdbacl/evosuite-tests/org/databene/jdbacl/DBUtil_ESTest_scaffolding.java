/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 06:28:05 GMT 2018
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
      "org.apache.derby.iapi.sql.compile.OptimizableList",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.h2.tools.Csv",
      "org.databene.commons.converter.ConverterWrapper",
      "org.apache.derby.iapi.types.RowLocation",
      "org.databene.commons.CollectionUtil",
      "org.databene.commons.ParseUtil",
      "org.databene.commons.converter.String2TimestampConverter",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.databene.script.Expression",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.services.compiler.MethodBuilder",
      "org.databene.jdbacl.model.DBRow",
      "org.apache.derby.catalog.TypeDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.apache.derby.impl.sql.execute.GenericConstantActionFactory",
      "org.databene.commons.converter.SqlDate2UtilDateConverter",
      "org.databene.jdbacl.model.DBMetaDataImporter",
      "org.apache.derby.impl.sql.compile.SingleChildResultSetNode",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.IndexRowGenerator",
      "org.apache.derby.iapi.sql.dictionary.PrivilegedSQLObject",
      "org.apache.derby.vti.VTICosting",
      "org.apache.derby.iapi.types.TypeId",
      "org.databene.jdbacl.model.DBCheckConstraint",
      "org.databene.commons.converter.String2CharConverter",
      "org.databene.commons.converter.String2GregorianCalendarConverter",
      "org.apache.derby.impl.sql.compile.FromList",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.databene.commons.ConnectFailedException",
      "org.databene.jdbacl.JDBCConnectData",
      "org.apache.derby.iapi.sql.compile.Visitor",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.databene.jdbacl.model.MultiColumnObject",
      "org.apache.derby.iapi.sql.dictionary.DataDictionary",
      "org.databene.jdbacl.proxy.PooledConnectionHandler",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.databene.commons.ConfigurationError",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.apache.derby.impl.sql.compile.ResultColumn",
      "org.apache.derby.iapi.services.context.Context",
      "org.databene.commons.converter.ArrayConverter",
      "org.apache.derby.iapi.sql.compile.Optimizable",
      "org.apache.derby.iapi.types.Orderable",
      "org.h2.util.SmallLRUCache",
      "org.h2.tools.SimpleRowSource",
      "org.apache.derby.impl.sql.compile.ExpressionClassBuilder",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.apache.derby.impl.sql.compile.QueryTreeNodeVector",
      "org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream",
      "org.databene.jdbacl.model.TableHolder",
      "org.apache.derby.impl.sql.compile.NormalizeResultSetNode",
      "org.databene.commons.converter.String2NumberFormatConverter",
      "org.antlr.runtime.CharStream",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.databene.jdbacl.sql.parser.SQLLexer",
      "org.databene.commons.Converter",
      "org.databene.jdbacl.model.DBForeignKeyConstraint",
      "org.databene.commons.debug.ResourceMonitor",
      "org.apache.derby.iapi.services.loader.ClassInspector",
      "org.databene.commons.converter.ToStringConverter",
      "org.apache.derby.impl.sql.compile.InsertNode",
      "org.apache.derby.iapi.sql.compile.ExpressionClassBuilderInterface",
      "org.databene.commons.Context",
      "org.antlr.runtime.Lexer",
      "org.apache.derby.impl.sql.compile.FromBaseTable",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter$TableNameFilter",
      "org.antlr.runtime.MissingTokenException",
      "org.apache.derby.iapi.sql.compile.Visitable",
      "org.apache.derby.impl.sql.compile.TestConstraintNode",
      "org.apache.derby.iapi.sql.ResultColumnDescriptor",
      "org.apache.derby.iapi.util.ByteArray",
      "org.antlr.runtime.EarlyExitException",
      "org.apache.derby.iapi.error.StandardException",
      "org.h2.util.Utils",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.apache.derby.iapi.services.io.Storable",
      "org.apache.derby.iapi.services.loader.GeneratedClass",
      "org.apache.derby.catalog.Dependable",
      "org.apache.derby.iapi.sql.compile.NodeFactory",
      "org.databene.commons.converter.FormatBasedConverter",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.antlr.runtime.Token",
      "org.databene.commons.converter.ConverterManager",
      "org.antlr.runtime.Parser",
      "org.h2.message.Trace",
      "org.databene.jdbacl.model.DBObject",
      "org.databene.commons.AssertionError",
      "org.databene.jdbacl.DBExecutionResult",
      "org.h2.util.New",
      "org.databene.commons.SystemInfo",
      "org.hsqldb.lib.FileAccess",
      "org.databene.commons.converter.Base64ToByteArrayConverter",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.h2.util.StringUtils",
      "org.databene.commons.IOUtil$1",
      "org.databene.jdbacl.sql.ColumnExpression",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.databene.commons.converter.ByteArrayToBase64Converter",
      "org.apache.derby.impl.sql.compile.DMLModStatementNode",
      "org.apache.derby.impl.sql.compile.UnaryOperatorNode",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.OrderByList",
      "org.databene.commons.context.ContextAware",
      "org.apache.derby.iapi.sql.conn.LanguageConnectionContext",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.runtime.CommonTokenStream",
      "org.databene.commons.OrderedSet",
      "org.antlr.runtime.RuleReturnScope",
      "org.h2.util.MathUtils$1",
      "org.apache.derby.impl.sql.compile.UnaryLogicalOperatorNode",
      "org.databene.commons.depend.Dependent",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.databene.commons.IOUtil",
      "org.databene.jdbacl.model.DBColumn",
      "org.databene.commons.BeanUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.databene.jdbacl.proxy.LoggingResultSetHandler",
      "org.databene.commons.ProgrammerError",
      "org.databene.jdbacl.model.ContainerComponent",
      "org.apache.derby.vti.VTIEnvironment",
      "org.databene.jdbacl.sql.SQLParserUtil",
      "org.apache.derby.iapi.sql.dictionary.UniqueSQLObjectDescriptor",
      "org.databene.jdbacl.SQLUtil",
      "org.apache.derby.iapi.sql.depend.Provider",
      "org.databene.commons.converter.JavaType",
      "org.h2.constant.ErrorCode",
      "org.databene.jdbacl.model.CompositeDBObject",
      "org.apache.derby.catalog.types.RowMultiSetImpl",
      "org.apache.derby.iapi.services.io.FormatableBitSet",
      "org.h2.message.TraceObject",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.databene.commons.converter.ConverterChain",
      "org.databene.commons.converter.Int2DateConverter",
      "org.antlr.runtime.DFA",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.databene.commons.converter.FormatHolder",
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.hsqldb.lib.FileUtil",
      "org.h2.util.SortedProperties",
      "org.apache.derby.catalog.IndexDescriptor",
      "org.databene.commons.converter.NumberToNumberConverter",
      "org.antlr.runtime.MismatchedRangeException",
      "org.apache.derby.iapi.sql.dictionary.UniqueTupleDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.apache.derby.impl.sql.compile.ActivationClassBuilder",
      "org.databene.commons.converter.String2TimeConverter",
      "org.h2.message.DbException",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.apache.derby.iapi.sql.execute.ConstantAction",
      "org.databene.commons.converter.MultiConverterWrapper",
      "org.apache.derby.impl.sql.compile.ConstantNode",
      "org.databene.commons.converter.Date2LongConverter",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.h2.jdbcx.JdbcDataSource",
      "org.apache.derby.catalog.types.UserDefinedTypeIdImpl",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.model.DBTable",
      "org.databene.commons.bean.HashCodeBuilder",
      "org.databene.commons.LoggerEscalator",
      "org.apache.derby.iapi.sql.compile.CompilerContext",
      "org.databene.commons.StringUtil",
      "org.databene.commons.converter.Locale2StringConverter",
      "org.databene.jdbacl.proxy.LoggingPreparedStatementHandler",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.databene.commons.converter.Number2CharConverter",
      "org.apache.derby.iapi.sql.dictionary.TupleDescriptor",
      "org.databene.commons.converter.Char2StringConverter",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.commons.Named",
      "org.databene.jdbacl.ResultsWithMetadata",
      "org.databene.commons.ReaderLineIterator",
      "org.antlr.runtime.CharStreamState",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.apache.derby.impl.sql.compile.ValueNode",
      "org.databene.commons.converter.Calendar2DateConverter",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.iapi.services.io.Formatable",
      "org.databene.commons.converter.ThreadSafeConverter",
      "org.firebirdsql.jdbc.FBArray",
      "org.antlr.runtime.tree.BaseTree",
      "org.databene.commons.Filter",
      "org.h2.message.TraceWriter",
      "org.h2.tools.SimpleResultSet",
      "org.databene.commons.ThreadAware",
      "org.apache.derby.iapi.sql.depend.DependencyManager",
      "org.databene.commons.converter.Timestamp2DateConverter",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.script.expression.ConstantExpression",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.antlr.runtime.BufferedTokenStream",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.commons.converter.String2DateConverter",
      "org.antlr.runtime.BitSet",
      "org.databene.commons.converter.String2DateFormatConverter",
      "org.databene.jdbacl.model.DBTableComponent",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.h2.util.MathUtils",
      "org.apache.derby.iapi.sql.dictionary.AliasDescriptor",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.apache.derby.impl.sql.compile.OrderedColumnList",
      "org.databene.commons.debug.Debug",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.apache.derby.impl.sql.execute.TriggerInfo",
      "org.antlr.runtime.CommonToken",
      "org.postgresql.Driver",
      "org.databene.commons.converter.Date2CalendarConverter",
      "org.h2.constant.SysProperties",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.commons.Capitalization",
      "org.databene.commons.Assert",
      "org.databene.commons.ErrorHandler",
      "org.antlr.runtime.RecognitionException",
      "org.databene.commons.converter.Date2TimestampConverter",
      "org.apache.derby.iapi.sql.depend.Dependent",
      "org.databene.commons.BeanUtil$PrimitiveTypeMapping",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.impl.sql.execute.FKInfo",
      "org.apache.derby.iapi.sql.compile.TypeCompiler",
      "org.databene.commons.Patterns",
      "org.databene.commons.ArrayUtil",
      "org.apache.derby.impl.sql.compile.TableName",
      "org.databene.commons.ParseException",
      "org.databene.commons.ImportFailedException",
      "org.antlr.runtime.TokenSource",
      "org.databene.commons.converter.FormatFormatConverter",
      "org.databene.commons.Escalator",
      "org.databene.commons.HeavyweightIterator",
      "org.h2.Driver",
      "org.databene.jdbacl.DBUtil",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.databene.commons.converter.Class2StringConverter",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.apache.derby.impl.sql.compile.ResultColumnList",
      "org.apache.derby.iapi.types.DataValueDescriptor",
      "org.databene.commons.converter.AbstractConverter",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.commons.converter.Time2StringConverter",
      "org.apache.derby.iapi.services.context.ContextManager",
      "org.apache.derby.iapi.sql.compile.RequiredRowOrdering",
      "org.databene.commons.converter.String2LocaleConverter",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.TextHolder",
      "org.apache.derby.iapi.services.io.TypedFormat",
      "org.apache.derby.vti.VTITemplate",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.sql.parser.SQLLexer$DFA9",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.commons.ArrayFormat",
      "org.apache.derby.iapi.services.loader.ClassFactory",
      "org.antlr.runtime.ANTLRStringStream",
      "org.databene.commons.ExceptionMapper",
      "org.databene.commons.SyntaxError",
      "org.antlr.runtime.IntStream",
      "org.apache.derby.iapi.sql.execute.ExecutionFactory",
      "org.databene.commons.OrderedMap",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.databene.commons.converter.Long2DateConverter",
      "org.databene.jdbacl.model.Database",
      "org.databene.commons.converter.ConversionTypes",
      "org.databene.commons.converter.UtilDate2SqlDateConverter",
      "org.apache.derby.impl.jdbc.EmbedResultSetMetaData",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBCatalog",
      "org.apache.derby.impl.sql.compile.ResultSetNode",
      "org.h2.util.IOUtils",
      "org.databene.commons.converter.String2PatternConverter",
      "org.h2.message.TraceSystem",
      "org.antlr.runtime.MismatchedSetException",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.proxy.LoggingStatementHandler",
      "org.databene.jdbacl.model.SequenceHolder",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.databene.commons.Resettable",
      "org.databene.jdbacl.model.DBUniqueIndex",
      "org.apache.derby.iapi.sql.ResultDescription",
      "org.databene.commons.converter.String2ClassConverter",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.iterator.TableRowIterator",
      "org.antlr.runtime.tree.Tree",
      "org.h2.jdbc.JdbcSQLException",
      "org.databene.commons.ConversionException",
      "org.databene.commons.ObjectNotFoundException",
      "org.databene.commons.Level",
      "org.antlr.runtime.BaseRecognizer",
      "org.databene.jdbacl.model.DBSchema"
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
      "org.h2.engine.Session",
      "org.h2.value.Value",
      "org.h2.value.ValueLong",
      "org.h2.util.MathUtils",
      "org.h2.constant.SysProperties",
      "org.h2.message.TraceObject",
      "org.databene.commons.SystemInfo",
      "org.databene.commons.ConfigurationError",
      "org.apache.derby.impl.sql.catalog.DataDictionaryImpl",
      "org.apache.derby.impl.services.uuid.BasicUUID",
      "org.apache.derby.iapi.sql.dictionary.SchemaDescriptor",
      "org.apache.derby.iapi.sql.dictionary.TableDescriptor",
      "org.apache.derby.iapi.sql.dictionary.ConglomerateDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ColumnDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.ConstraintDescriptorList",
      "org.apache.derby.iapi.sql.dictionary.GenericDescriptorList",
      "org.postgresql.Driver",
      "org.databene.jdbacl.model.AbstractDBObject",
      "org.databene.jdbacl.model.AbstractCompositeDBObject",
      "org.databene.jdbacl.model.DBSchema",
      "org.databene.commons.OrderedMap",
      "org.databene.commons.collection.OrderedNameMap",
      "org.databene.jdbacl.model.DefaultDBTable",
      "org.databene.commons.ConnectFailedException",
      "org.postgresql.ds.common.BaseDataSource",
      "org.postgresql.ds.PGConnectionPoolDataSource",
      "org.h2.jdbcx.JdbcConnectionPool",
      "org.postgresql.ds.jdbc23.AbstractJdbc23PooledConnection",
      "org.postgresql.jdbc2.AbstractJdbc2Connection",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.core.v2.ConnectionFactoryImpl",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.apache.derby.impl.sql.compile.QueryTreeNode",
      "org.apache.derby.impl.sql.compile.FromTable",
      "org.apache.derby.impl.sql.compile.FromVTI",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.apache.derby.impl.sql.compile.TableElementNode",
      "org.apache.derby.impl.sql.execute.BaseActivation",
      "org.h2.value.CompareMode",
      "org.h2.engine.SessionRemote",
      "org.h2.util.StringUtils",
      "org.h2.util.IOUtils",
      "org.h2.util.Utils",
      "org.h2.message.DbException",
      "org.h2.constant.ErrorCode",
      "org.h2.jdbc.JdbcSQLException",
      "org.h2.message.TraceSystem",
      "org.apache.derby.iapi.services.info.JVMInfo",
      "org.apache.derby.impl.services.monitor.BaseMonitor",
      "org.apache.derby.iapi.services.info.ProductVersionHolder",
      "org.apache.derby.iapi.services.io.FileUtil",
      "org.h2.command.dml.SetTypes",
      "org.h2.engine.ConnectionInfo",
      "org.h2.engine.Engine",
      "org.h2.store.FileLock",
      "org.h2.store.fs.FileSystem",
      "org.h2.store.fs.FileSystemDisk",
      "org.h2.Driver",
      "org.h2.jdbcx.JdbcDataSource",
      "org.h2.jdbcx.JdbcDataSourceFactory",
      "org.h2.util.SmallLRUCache",
      "org.h2.message.Trace",
      "org.h2.jdbcx.JdbcXAConnection",
      "org.databene.jdbacl.model.AbstractDBTableComponent",
      "org.databene.jdbacl.model.DBConstraint",
      "org.databene.jdbacl.model.DBUniqueConstraint",
      "org.databene.jdbacl.model.DBPrimaryKeyConstraint",
      "org.databene.jdbacl.model.jdbc.JDBCDBImporter",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.databene.commons.ErrorHandler",
      "org.apache.derby.impl.sql.compile.StatementNode",
      "org.apache.derby.impl.sql.compile.DMLStatementNode",
      "org.apache.derby.catalog.types.BaseTypeIdImpl",
      "org.apache.derby.catalog.types.DecimalTypeIdImpl",
      "org.apache.derby.iapi.types.TypeId",
      "org.apache.derby.catalog.types.TypeDescriptorImpl",
      "org.apache.derby.iapi.types.DataTypeDescriptor",
      "org.apache.derby.catalog.types.UserDefinedTypeIdImpl",
      "org.apache.derby.iapi.types.DataType",
      "org.apache.derby.iapi.services.cache.ClassSizeCatalog",
      "org.apache.derby.iapi.services.cache.ClassSize",
      "org.apache.derby.iapi.types.UserType",
      "org.apache.derby.catalog.types.DefaultInfoImpl",
      "org.apache.derby.impl.sql.GenericStorablePreparedStatement",
      "org.apache.derby.iapi.services.monitor.Monitor",
      "org.apache.derby.iapi.services.io.FormatableProperties",
      "org.hsqldb.lib.FileUtil",
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
      "org.firebirdsql.jdbc.FBBlob",
      "org.databene.commons.ErrorHandler$1",
      "org.h2.value.ValueDecimal",
      "org.apache.derby.impl.sql.execute.WriteCursorConstantAction",
      "org.apache.derby.impl.sql.execute.DeleteConstantAction",
      "org.apache.derby.impl.sql.compile.DDLStatementNode",
      "org.hsqldb.jdbcDriver",
      "org.h2.engine.Database",
      "org.h2.engine.Mode",
      "org.h2.util.SortedProperties",
      "org.apache.derby.impl.sql.compile.UpdateNode",
      "org.apache.derby.impl.sql.GenericColumnDescriptor",
      "org.apache.derby.diag.ErrorMessages",
      "org.databene.jdbacl.model.DefaultDatabase",
      "org.databene.commons.ObjectNotFoundException",
      "org.apache.derby.impl.sql.catalog.SYSSEQUENCESRowFactory",
      "org.databene.jdbacl.model.TableContainer",
      "org.databene.commons.version.VersionNumber",
      "org.databene.commons.version.StringVersionNumberComponent",
      "org.databene.jdbacl.model.DBCatalog",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.model.DBRowIterator",
      "org.databene.jdbacl.model.DBIndex",
      "org.databene.jdbacl.model.DBNonUniqueIndex",
      "org.databene.jdbacl.model.DBNotNullConstraint",
      "org.antlr.runtime.Token",
      "org.databene.commons.AssertionError",
      "org.databene.commons.converter.JavaType",
      "org.databene.commons.converter.String2DateConverter"
    );
  }
}

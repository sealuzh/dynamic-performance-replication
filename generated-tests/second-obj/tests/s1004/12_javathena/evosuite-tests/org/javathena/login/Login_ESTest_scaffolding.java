/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 18:42:10 GMT 2018
 */

package org.javathena.login;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Login_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.javathena.login.Login"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Login_ESTest_scaffolding.class.getClassLoader() ,
      "com.thoughtworks.xstream.XStream",
      "org.javathena.core.utiles.Functions",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$1",
      "org.javathena.login.Login$ConnectionListener",
      "org.javathena.data.XMLDBManagementLogin",
      "com.thoughtworks.xstream.converters.basic.StringBuilderConverter",
      "javolution.util.FastMap$KeySet",
      "com.thoughtworks.xstream.XStream$InitializationException",
      "com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "org.javathena.utiles.sql.MySQLConfig",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "javolution.lang.Configurable$1",
      "com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker",
      "com.thoughtworks.xstream.converters.Converter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "com.thoughtworks.xstream.alias.ClassMapper",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "com.thoughtworks.xstream.converters.SingleValueConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProvider$Visitor",
      "com.thoughtworks.xstream.converters.MarshallingContext",
      "com.thoughtworks.xstream.mapper.OuterClassMapper",
      "org.javathena.conf.LoginAthena",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider",
      "org.javathena.login.Login$Timer_interval_check_auth_sync",
      "javolution.context.ObjectFactory$2",
      "javolution.context.ObjectFactory$1",
      "com.thoughtworks.xstream.io.HierarchicalStreamReader",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.converters.ConverterLookup",
      "com.thoughtworks.xstream.mapper.ClassAliasingMapper",
      "com.thoughtworks.xstream.mapper.CannotResolveClassException",
      "javolution.lang.Immutable",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "javolution.xml.XMLSerializable",
      "com.thoughtworks.xstream.mapper.EnumMapper",
      "com.thoughtworks.xstream.mapper.AnnotationConfiguration",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyWriter",
      "com.thoughtworks.xstream.core.util.FastStack",
      "javolution.util.FastComparator$Lexical",
      "com.thoughtworks.xstream.converters.ConversionException",
      "com.thoughtworks.xstream.core.TreeMarshaller$CircularReferenceException",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.Mapper",
      "org.javathena.data.TXTDBManagement",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItem",
      "javolution.util.FastComparator$Rehash",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "com.thoughtworks.xstream.converters.UnmarshallingContext",
      "com.thoughtworks.xstream.converters.extended.ColorConverter",
      "javolution.text.Text",
      "com.thoughtworks.xstream.converters.extended.DurationConverter",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "com.thoughtworks.xstream.converters.collections.CharArrayConverter",
      "com.thoughtworks.xstream.converters.extended.LookAndFeelConverter",
      "com.thoughtworks.xstream.converters.collections.ArrayConverter",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.enums.EnumConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.thoughtworks.xstream.io.HierarchicalStreamWriter",
      "org.javathena.core.utiles.ACO",
      "com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter",
      "com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "javolution.lang.Configurable$Logic",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper",
      "com.thoughtworks.xstream.core.BaseException",
      "javolution.lang.Realtime",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "com.thoughtworks.xstream.core.TreeMarshaller",
      "com.thoughtworks.xstream.converters.ConverterRegistry",
      "javolution.context.Allocator",
      "com.thoughtworks.xstream.core.TreeUnmarshaller",
      "org.javathena.core.data.Excecutable",
      "javolution.lang.Reusable",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshaller",
      "com.thoughtworks.xstream.mapper.AnnotationMapper",
      "com.thoughtworks.xstream.converters.basic.UUIDConverter",
      "javolution.util.FastCollection",
      "com.thoughtworks.xstream.InitializationException",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper$1",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "com.thoughtworks.xstream.core.AbstractReferenceMarshaller$ReferencedImplicitElementException",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "org.javathena.login.Login",
      "javolution.context.ObjectFactory",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "com.thoughtworks.xstream.converters.reflection.ObjectAccessException",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy",
      "com.thoughtworks.xstream.mapper.AttributeAliasingMapper",
      "org.javathena.login.parse.FromAdmin",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "javolution.util.FastComparator$Default",
      "com.thoughtworks.xstream.io.WriterWrapper",
      "org.javathena.utiles.ConfigurationManagement",
      "javolution.util.FastTable$1",
      "org.javathena.login.parse.FromClient",
      "com.thoughtworks.xstream.mapper.CachingMapper",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$WeakIdWrapper",
      "com.thoughtworks.xstream.MarshallingStrategy",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "javolution.util.FastComparator$Identity",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$2",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$1",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "javolution.util.FastComparator$1",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItemIterator",
      "javolution.util.FastCollection$Record",
      "com.thoughtworks.xstream.io.xml.AbstractXmlWriter",
      "com.thoughtworks.xstream.core.DefaultConverterLookup",
      "com.thoughtworks.xstream.converters.reflection.FieldKey",
      "com.thoughtworks.xstream.core.AbstractReferenceMarshaller",
      "javolution.util.FastMap$EntrySet",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "org.javathena.core.utiles.Constants$BL",
      "org.javathena.data.IDBManagementLogin",
      "javolution.util.FastMap$Values",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream$CustomPutField",
      "javolution.util.FastComparator",
      "org.javathena.core.data.Auth_data",
      "com.thoughtworks.xstream.core.JVM",
      "com.thoughtworks.xstream.XStreamException",
      "com.thoughtworks.xstream.io.xml.AbstractXmlDriver",
      "org.javathena.core.data.Socket_data",
      "javolution.util.FastComparator$StringComparator",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "com.thoughtworks.xstream.converters.ConverterMatcher",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.thoughtworks.xstream.mapper.AbstractAttributeAliasingMapper",
      "com.thoughtworks.xstream.core.util.FastField",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream$StreamCallback",
      "javolution.context.ObjectFactory$Generic",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat$1",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.core.util.Pool$Factory",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy",
      "com.thoughtworks.xstream.core.MapBackedDataHolder",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream$StreamCallback",
      "com.thoughtworks.xstream.converters.SingleValueConverterWrapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$1",
      "com.thoughtworks.xstream.converters.reflection.ReflectionConverter",
      "com.thoughtworks.xstream.io.StreamException",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "org.javathena.core.utiles.MultilanguageManagement",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "com.thoughtworks.xstream.io.path.Path",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$IdWrapper",
      "com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "javolution.util.FastMap$9",
      "javolution.util.FastMap$7",
      "com.thoughtworks.xstream.mapper.AbstractXmlFriendlyMapper",
      "com.thoughtworks.xstream.alias.CannotResolveClassException",
      "org.javathena.core.utiles.Constants",
      "com.thoughtworks.xstream.core.util.Fields",
      "org.javathena.login.sql.data.Auth_data_SQL",
      "com.thoughtworks.xstream.mapper.Mapper$Null",
      "org.javathena.core.data.SessionType",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat",
      "com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter",
      "org.javathena.login.Login$End",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "com.thoughtworks.xstream.converters.DataHolder",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream",
      "javolution.util.FastMap$Entry",
      "javolution.util.FastComparator$Direct",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.core.util.QuickWriter",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "com.thoughtworks.xstream.core.util.ClassLoaderReference",
      "javolution.lang.ValueType",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "javolution.util.FastTable",
      "com.thoughtworks.xstream.mapper.AnnotationMapper$WeakHashSet",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$Wrapper",
      "com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriter",
      "org.javathena.login.UserManagement",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "javolution.lang.Configurable",
      "org.javathena.login.parse.FromChar",
      "org.javathena.data.MySQLDBManagement",
      "javolution.util.FastMap",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.FieldKeySorter",
      "com.thoughtworks.xstream.mapper.LocalConversionMapper",
      "com.thoughtworks.xstream.io.HierarchicalStreamDriver",
      "com.thoughtworks.xstream.io.path.PathTrackingWriter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper",
      "com.thoughtworks.xstream.core.util.Pool",
      "org.javathena.core.data.IParse",
      "com.thoughtworks.xstream.converters.ErrorWriter",
      "com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "com.thoughtworks.xstream.io.xml.PrettyPrintWriter",
      "com.thoughtworks.xstream.core.util.PrioritizedList",
      "com.thoughtworks.xstream.io.path.PathTracker",
      "com.thoughtworks.xstream.io.xml.DomDriver",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Login_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.javathena.login.Login",
      "org.javathena.core.utiles.Constants$BL",
      "org.javathena.core.utiles.Constants",
      "org.javathena.core.utiles.MultilanguageManagement",
      "com.thoughtworks.xstream.XStream",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.core.JVM",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "com.thoughtworks.xstream.mapper.LocalConversionMapper",
      "com.thoughtworks.xstream.mapper.AnnotationMapper$WeakHashSet",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "com.thoughtworks.xstream.converters.extended.LookAndFeelConverter",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "com.thoughtworks.xstream.converters.extended.DurationConverter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "com.thoughtworks.xstream.converters.basic.StringBuilderConverter",
      "com.thoughtworks.xstream.converters.basic.UUIDConverter",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "org.javathena.conf.LoginAthena",
      "javolution.util.FastCollection",
      "javolution.context.ObjectFactory",
      "javolution.util.FastTable",
      "javolution.lang.Configurable",
      "javolution.util.FastComparator$Default",
      "javolution.util.FastComparator$Direct",
      "javolution.util.FastComparator$Rehash",
      "javolution.util.FastComparator$StringComparator",
      "javolution.util.FastComparator$Identity",
      "javolution.util.FastComparator$Lexical",
      "javolution.util.FastComparator",
      "org.javathena.utiles.ConfigurationManagement",
      "javolution.util.FastMap",
      "javolution.util.FastMap$Entry",
      "org.javathena.login.UserManagement",
      "org.javathena.core.utiles.ACO",
      "org.javathena.utiles.sql.MySQLConfig",
      "org.javathena.login.parse.FromChar",
      "org.javathena.core.data.Socket_data",
      "javolution.util.FastMap$KeySet",
      "com.thoughtworks.xstream.io.xml.PrettyPrintWriter",
      "com.thoughtworks.xstream.io.path.Path",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream",
      "javolution.context.PersistentContext$Reference",
      "javolution.context.Context$Root",
      "javolution.context.Context",
      "javolution.context.PersistentContext",
      "org.javathena.core.data.Auth_data",
      "javolution.util.FastMap$EntrySet",
      "javolution.util.FastMap$EntrySet$1",
      "javolution.util.FastMap$EntryIterator",
      "javolution.context.HeapContext",
      "javolution.context.AllocatorContext",
      "javolution.text.Text",
      "javolution.text.TextBuilder",
      "javolution.lang.MathLib",
      "javolution.util.FastMap$Values",
      "javolution.util.FastMap$ValueIterator",
      "com.thoughtworks.xstream.core.util.FastField",
      "org.javathena.login.parse.FromClient",
      "com.thoughtworks.xstream.core.BaseException",
      "com.thoughtworks.xstream.XStreamException",
      "com.thoughtworks.xstream.io.StreamException",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.jdbc.StringUtils",
      "com.mysql.jdbc.Messages",
      "com.mysql.jdbc.Util"
    );
  }
}

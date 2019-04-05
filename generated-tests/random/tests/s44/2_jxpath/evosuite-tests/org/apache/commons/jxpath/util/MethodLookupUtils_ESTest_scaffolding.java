/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Mar 24 05:28:45 GMT 2019
 */

package org.apache.commons.jxpath.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MethodLookupUtils_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.jxpath.util.MethodLookupUtils"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/2_jxpath"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MethodLookupUtils_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.jxpath.JXPathException",
      "org.apache.commons.jxpath.Variables",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "org.apache.commons.jxpath.PackageFunctions",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "org.apache.commons.jxpath.JXPathInvalidAccessException",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.apache.commons.beanutils.IntrospectionContext",
      "org.apache.commons.jxpath.util.TypeConverter",
      "org.apache.commons.jxpath.KeyManager",
      "org.apache.commons.jxpath.JXPathContextFactoryConfigurationError",
      "org.apache.commons.jxpath.util.TypeUtils",
      "org.apache.commons.jxpath.util.BasicTypeConverter",
      "org.apache.commons.jxpath.JXPathTypeConversionException",
      "org.apache.commons.jxpath.util.MethodLookupUtils",
      "org.apache.commons.jxpath.Functions",
      "org.apache.commons.beanutils.expression.Resolver",
      "org.apache.commons.jxpath.JXPathContextFactory",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "org.apache.commons.jxpath.ExpressionContext",
      "org.apache.commons.beanutils.DynaProperty",
      "org.apache.commons.beanutils.NestedNullException",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.beanutils.BeanAccessLanguageException",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "org.apache.commons.beanutils.Converter",
      "org.apache.commons.jxpath.CompiledExpression",
      "org.apache.commons.jxpath.util.TypeUtils$1",
      "org.apache.commons.jxpath.NodeSet",
      "org.apache.commons.jxpath.Pointer",
      "org.apache.commons.beanutils.ConvertUtils",
      "org.apache.commons.jxpath.IdentityManager",
      "org.apache.commons.beanutils.PropertyUtilsBean",
      "org.apache.commons.jxpath.AbstractFactory",
      "org.apache.commons.beanutils.BeanIntrospector",
      "org.apache.commons.jxpath.JXPathContext",
      "org.apache.commons.jxpath.Function"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MethodLookupUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.jxpath.util.MethodLookupUtils",
      "org.apache.commons.jxpath.util.BasicTypeConverter",
      "org.apache.commons.jxpath.util.TypeUtils$1",
      "org.apache.commons.jxpath.util.TypeUtils",
      "org.apache.commons.beanutils.ConvertUtils",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.jxpath.JXPathException"
    );
  }
}

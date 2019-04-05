/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 23 16:59:14 GMT 2019
 */

package weka.core;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FindWithCapabilities_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.core.FindWithCapabilities"; 
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
    java.lang.System.setProperty("user.home", "/home/apaniche"); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/9_weka"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FindWithCapabilities_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison",
      "weka.core.CheckOptionHandler",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.core.TestInstances",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$1",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$2",
      "weka.core.ManhattanDistance",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$3",
      "weka.core.DistanceFunction",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.classifiers.AbstractClassifier",
      "weka.core.converters.ArffLoader",
      "weka.core.FindWithCapabilities",
      "org.pentaho.packageManagement.Package",
      "weka.core.ClassDiscovery$StringCompare",
      "weka.core.OptionHandler",
      "weka.core.WekaException",
      "weka.core.ClassDiscovery",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$4",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$5",
      "weka.core.Range",
      "weka.core.logging.Logger$Level",
      "weka.core.Attribute$1",
      "weka.core.ClassCache",
      "weka.classifiers.Classifier",
      "weka.core.CheckGOE",
      "weka.core.Capabilities$Capability",
      "weka.core.DenseInstance",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.RevisionUtils$Type",
      "weka.core.WekaEnumeration",
      "weka.core.MinkowskiDistance",
      "weka.core.converters.IncrementalConverter",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.WekaPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.core.ChebyshevDistance",
      "weka.core.TechnicalInformationHandler",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "org.pentaho.packageManagement.VersionPackageConstraint",
      "weka.core.Option",
      "weka.core.CheckScheme$PostProcessor",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.EnvironmentHandler",
      "weka.core.AllJavadoc",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.NormalizableDistance",
      "weka.core.Attribute",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.CheckScheme",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Capabilities",
      "weka.core.Copyable",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.RevisionUtils",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.Instance",
      "weka.core.OptionHandlerJavadoc",
      "weka.core.converters.Loader",
      "weka.core.ProtectedProperties",
      "weka.core.ListOptions",
      "weka.core.SingleIndex",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.Check",
      "weka.core.CapabilitiesHandler",
      "weka.core.TechnicalInformation$Field",
      "weka.core.Javadoc",
      "weka.core.EuclideanDistance",
      "weka.core.AbstractInstance",
      "weka.core.Instances",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.UnassignedClassException",
      "org.pentaho.packageManagement.VersionRangePackageConstraint",
      "weka.classifiers.rules.ZeroR",
      "weka.core.Version",
      "weka.core.converters.AbstractLoader",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.core.converters.BatchConverter",
      "weka.core.converters.ArffLoader$ArffReader"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FindWithCapabilities_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.core.FindWithCapabilities",
      "weka.core.Capabilities$Capability",
      "weka.core.ClassDiscovery",
      "weka.core.Capabilities",
      "weka.core.Utils",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.SingleIndex",
      "weka.core.Option",
      "weka.core.ProtectedProperties",
      "weka.core.Attribute",
      "weka.core.Instances",
      "weka.core.RevisionUtils",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.TestInstances",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.UnassignedClassException",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.ClassCache",
      "weka.core.NormalizableDistance",
      "weka.core.ChebyshevDistance",
      "weka.core.Range",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.core.Javadoc",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.Check",
      "weka.core.CheckOptionHandler",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.OptionHandlerJavadoc",
      "weka.core.AllJavadoc",
      "weka.core.CheckGOE",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.core.ManhattanDistance",
      "weka.core.CheckScheme",
      "weka.core.ClassDiscovery$StringCompare",
      "weka.core.MinkowskiDistance",
      "weka.core.EuclideanDistance",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.ListOptions",
      "weka.core.AttributeStats"
    );
  }
}

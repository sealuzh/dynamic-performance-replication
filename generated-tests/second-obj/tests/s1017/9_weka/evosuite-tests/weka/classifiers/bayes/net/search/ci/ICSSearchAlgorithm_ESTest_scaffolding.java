/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 05:00:06 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ICSSearchAlgorithm_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ICSSearchAlgorithm_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Copyable",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.AbstractClassifier",
      "weka.core.OptionHandler",
      "weka.core.RevisionUtils",
      "weka.core.AdditionalMeasureProducer",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.core.Instance",
      "weka.filters.UnsupervisedFilter",
      "weka.core.Drawable",
      "weka.core.ProtectedProperties",
      "weka.classifiers.Classifier",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.bayes.net.search.ci.CISearchAlgorithm",
      "weka.core.Instances",
      "weka.filters.SupervisedFilter",
      "weka.core.SelectedTag",
      "weka.core.TechnicalInformationHandler",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm",
      "weka.classifiers.bayes.BayesNet",
      "weka.core.UnassignedClassException",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm$SeparationSet",
      "weka.core.Utils",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.filters.Sourcable",
      "weka.core.RevisionHandler",
      "weka.core.Attribute",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.Tag"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.function.Consumer", false, ICSSearchAlgorithm_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ICSSearchAlgorithm_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.Tag",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.ci.CISearchAlgorithm",
      "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.Instances",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.Utils",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.classifiers.Evaluation",
      "weka.core.UnassignedDatasetException",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.core.DenseInstance",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.Range",
      "weka.classifiers.trees.J48",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.ProtectedProperties",
      "weka.core.Attribute",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.stemmers.NullStemmer",
      "weka.core.stemmers.SnowballStemmer",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.lazy.KStar",
      "weka.core.SerializedObject",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.attributeSelection.BestFirst",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.rules.DecisionTable",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.logging.Logger$Level",
      "weka.core.WekaPackageManager",
      "weka.core.Capabilities$Capability",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.UnassignedClassException",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.functions.SMO"
    );
  }
}

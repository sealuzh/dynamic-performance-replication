/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 17 16:52:34 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

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
      "weka.classifiers.AbstractClassifier",
      "weka.core.OptionHandler",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.filters.UnsupervisedFilter",
      "weka.classifiers.Classifier",
      "weka.core.stemmers.Stemmer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.bayes.net.search.ci.CISearchAlgorithm",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.core.stemmers.NullStemmer",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.classifiers.functions.SGDText",
      "weka.filters.Sourcable",
      "weka.core.Utils",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.Attribute",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.FastVector",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.RevisionUtils",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.Instance",
      "weka.core.Drawable",
      "weka.core.ProtectedProperties",
      "weka.estimators.Estimator",
      "weka.classifiers.bayes.net.ADNode",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.core.Randomizable",
      "weka.core.Instances",
      "weka.core.SelectedTag",
      "weka.classifiers.bayes.BayesNet",
      "weka.core.UnassignedClassException",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm$SeparationSet",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.RevisionHandler",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.Tag"
    );
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
      "weka.core.Utils",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.CostMatrix",
      "weka.core.SerializedObject",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.functions.LinearRegression",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.estimators.Estimator",
      "weka.estimators.NormalEstimator",
      "weka.estimators.PoissonEstimator",
      "weka.estimators.DiscreteEstimator",
      "weka.estimators.MahalanobisEstimator",
      "weka.classifiers.lazy.KStar",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.trees.J48",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.Evaluation",
      "weka.core.AttributeStats",
      "weka.classifiers.functions.SGD",
      "weka.core.matrix.Matrix",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.logging.Logger$Level",
      "weka.core.WekaPackageManager",
      "weka.core.Capabilities$Capability",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.gui.GenericPropertiesCreator",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.Logistic",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.trees.LMT",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.estimators.KernelEstimator",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.core.UnassignedClassException",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.WekaException",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field"
    );
  }
}
/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 23:26:15 GMT 2018
 */

package weka.classifiers.functions.supportVector;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RegSMO_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.functions.supportVector.RegSMO"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RegSMO_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.DistanceFunction",
      "weka.classifiers.AbstractClassifier",
      "weka.core.OptionHandler",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.filters.StreamableFilter",
      "weka.core.Range",
      "weka.filters.UnsupervisedFilter",
      "weka.classifiers.Classifier",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.attributeSelection.ASSearch",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.attributeSelection.StartSetHandler",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.Sourcable",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.NormalizableDistance",
      "weka.classifiers.functions.SMOreg",
      "weka.core.Attribute",
      "weka.classifiers.functions.supportVector.SMOset",
      "weka.classifiers.rules.DecisionTable",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.attributeSelection.BestFirst",
      "weka.core.Summarizable",
      "weka.core.RevisionUtils",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.Instance",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.core.Drawable",
      "weka.estimators.Estimator",
      "weka.classifiers.bayes.net.ADNode",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.core.SelectedTag",
      "weka.classifiers.bayes.BayesNet",
      "weka.core.UnassignedClassException",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.core.TechnicalInformation",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.RevisionHandler",
      "weka.filters.Filter",
      "weka.classifiers.lazy.IBk",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.Tag"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RegSMO_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.CostMatrix",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.Instances",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.Tag",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.core.TechnicalInformation",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.core.SerializedObject",
      "weka.core.Utils",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.Evaluation",
      "weka.core.Attribute",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.MinkowskiDistance",
      "weka.core.ProtectedProperties",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.logging.Logger$Level",
      "weka.core.WekaPackageManager",
      "weka.core.Capabilities$Capability",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.functions.supportVector.SMOset",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.core.WekaException",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.Logistic",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.DenseInstance",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGD",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.estimators.Estimator",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.J48",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.rules.DecisionTable",
      "weka.classifiers.functions.SGDText",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.estimators.PoissonEstimator",
      "weka.estimators.NormalEstimator",
      "weka.core.matrix.Matrix",
      "weka.estimators.MahalanobisEstimator",
      "weka.estimators.KernelEstimator"
    );
  }
}

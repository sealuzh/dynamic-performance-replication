/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 18 02:39:31 GMT 2018
 */

package weka.classifiers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CheckClassifier_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.CheckClassifier"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CheckClassifier_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.core.TestInstances",
      "weka.core.DistanceFunction",
      "org.pentaho.packageManagement.PackageConstraint",
      "org.pentaho.packageManagement.Package",
      "weka.core.xml.XMLBasicSerialization",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.evaluation.NumericPrediction",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.core.Statistics",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.classifiers.trees.J48",
      "weka.core.stemmers.Stemmer",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.estimators.UnivariateIntervalEstimator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.j48.Stats",
      "weka.classifiers.functions.SGDText",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.NormalizableDistance",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.trees.j48.InfoGainSplitCrit",
      "weka.core.TechnicalInformation$Type",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.core.AttributeLocator",
      "weka.core.SerializedObject",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.Summarizable",
      "weka.classifiers.trees.j48.ModelSelection",
      "weka.core.AdditionalMeasureProducer",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.core.Drawable",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.Check",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.CheckClassifier",
      "weka.core.AbstractInstance",
      "weka.classifiers.lazy.kstar.KStarConstants",
      "weka.core.scripting.JythonObject",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.core.Queue",
      "weka.core.Version",
      "weka.classifiers.evaluation.Prediction",
      "weka.classifiers.trees.lmt.ResidualModelSelection",
      "weka.core.Tag",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.trees.j48.EntropyBasedSplitCrit",
      "weka.classifiers.evaluation.NominalPrediction",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.AbstractClassifier",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.core.OptionHandler",
      "weka.classifiers.trees.j48.Distribution",
      "weka.core.WekaException",
      "weka.core.ClassDiscovery",
      "weka.core.Range",
      "weka.core.Attribute$1",
      "weka.core.PartitionGenerator",
      "weka.core.scripting.JythonSerializableObject",
      "weka.classifiers.Classifier",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.classifiers.trees.j48.ClassifierSplitModel",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.trees.j48.C45Split",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.core.WekaPackageManager",
      "weka.classifiers.trees.lmt.LogisticBase",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.CheckScheme$PostProcessor",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.filters.Sourcable",
      "weka.core.Attribute",
      "weka.core.CheckScheme",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.core.FastVector",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.UnassignedDatasetException",
      "weka.core.BatchPredictor",
      "weka.classifiers.trees.lmt.LMTNode",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.Queue$QueueNode",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.RevisionUtils",
      "weka.core.Instance",
      "weka.classifiers.lazy.KStar",
      "weka.core.ProtectedProperties",
      "weka.classifiers.IntervalEstimator",
      "weka.core.StringLocator",
      "weka.core.Matchable",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.trees.j48.SplitCriterion",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.core.TechnicalInformation$Field",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.Randomizable",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.trees.j48.NoSplit",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.classifiers.trees.j48.GainRatioSplitCrit",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.core.SerializationHelper",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.classifiers.xml.XMLClassifier",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.filters.Filter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CheckClassifier_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.core.Utils",
      "weka.core.TestInstances",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.FastVector",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.Instances",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.SerializedObject",
      "weka.classifiers.Evaluation",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.logging.Logger$Level",
      "weka.core.WekaPackageManager",
      "weka.core.Capabilities$Capability",
      "weka.classifiers.evaluation.NumericPrediction",
      "weka.classifiers.evaluation.Prediction",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.core.Tag",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.core.SparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.SerializationHelper",
      "weka.core.ClassDiscovery",
      "weka.classifiers.evaluation.NominalPrediction",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.CostMatrix",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.core.Range",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.core.AttributeStats",
      "weka.classifiers.lazy.LWL",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.classifiers.trees.J48",
      "weka.classifiers.trees.RandomTree",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.meta.Vote",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.Filter",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.core.Queue",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.core.Queue$QueueNode",
      "weka.classifiers.trees.j48.ModelSelection",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.trees.j48.Distribution",
      "weka.classifiers.trees.j48.ClassifierSplitModel",
      "weka.classifiers.trees.j48.NoSplit",
      "weka.classifiers.trees.j48.SplitCriterion",
      "weka.classifiers.trees.j48.EntropyBasedSplitCrit",
      "weka.classifiers.trees.j48.InfoGainSplitCrit",
      "weka.classifiers.trees.j48.GainRatioSplitCrit",
      "weka.classifiers.trees.j48.C45Split",
      "weka.core.Statistics",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.core.UnassignedClassException",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable"
    );
  }
}